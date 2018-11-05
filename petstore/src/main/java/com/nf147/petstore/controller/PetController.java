package com.nf147.petstore.controller;

import com.nf147.petstore.entity.PsPet;
import com.nf147.petstore.mapper.PsPetMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/")
public class PetController {

    @Autowired
    private PsPetMapper mapper;


    // 添加
    @RequestMapping(value = "/pet",method = RequestMethod.POST)
    private String add(@RequestBody PsPet pet,RedirectAttributes attributes){
        int insert = mapper.insert(pet);
        if (insert >0)
            attributes.addFlashAttribute("msg","添加成功");
        else
            attributes.addFlashAttribute("msg","添加失败");

        return "index";
    }

    // 修改
    @RequestMapping(value = "/update/{id}",method = RequestMethod.GET)
    private String update(@PathVariable int id,Model model){
        PsPet pet = mapper.selectByPrimaryKey(id);
        model.addAttribute("pet",pet);
        return "update";
    }
    @RequestMapping(value = "/update",method = RequestMethod.POST)
    private String update(@RequestBody PsPet pet){
        mapper.updateByPrimaryKey(pet);
        return "redirect:/pet";
    }

    // 根据转态查找
    @RequestMapping(value = "/pet/findByStatus", method = RequestMethod.GET)
    private String selectByStatus(@RequestParam String status,RedirectAttributes attributes ){
        List<PsPet> psPets = mapper.selectByStatus(status);
        attributes.addAttribute("psPets",psPets);
        return "redirect:/pet";
    }

    // 查询所有的数据
    @GetMapping("/pet")
    private String selectAll(Model model){
        List<PsPet> psPets = mapper.selectAll();
        model.addAttribute("psPets",psPets);
        return "index";
    }


    // 删除
   @GetMapping("/del/{id}")
    private String deleteById(@PathVariable("id") int id, RedirectAttributes attributes){
       System.out.println("ok");
        int i = mapper.deleteByPrimaryKey(id);
        if (i == 0)
            attributes.addFlashAttribute("msg","删除失败");
        else
            attributes.addFlashAttribute("msg","删除成功");

        return "redirect:/pet";
    }

}
