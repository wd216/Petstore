package com.nf147.petstore.controller;

import com.nf147.petstore.entity.PsPet;
import com.nf147.petstore.mapper.PsPetMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/")
public class PetController {

    @Autowired
    private PsPetMapper mapper;


    @PostMapping("/pet")
    @ResponseBody
    private int add(@RequestBody PsPet pet){
        int insert = mapper.insert(pet);
        return insert;
    }

    @RequestMapping(value = "/pet",method = RequestMethod.PUT)
    @ResponseBody
    private int update(@RequestBody PsPet pet){
        int i = mapper.updateByPrimaryKey(pet);
        return i;
    }

    @RequestMapping(value = "/pet/findByStatus")
    @ResponseBody
    private List<PsPet> selectByStatus(@RequestBody String status){
        List<PsPet> psPets = mapper.selectByStatus(status);
        return psPets;
    }

    @GetMapping("/pet/{id}")
    @ResponseBody
    private PsPet findById(@PathVariable("id")int id){
        PsPet psPet = mapper.selectByPrimaryKey(id);
        return psPet;
    }

    @PostMapping("/pet/{id}")
    @ResponseBody
    private int updateById(@PathVariable("id")int id){
        PsPet psPet = mapper.selectByPrimaryKey(id);
        int i = mapper.updateByPrimaryKey(psPet);
        return i;
    }

    @RequestMapping(value = "/pet/{id}",method = RequestMethod.DELETE)
    @ResponseBody
    private int deleteById(@PathVariable("id") int id){
        int i = mapper.deleteByPrimaryKey(id);
        return i;
    }

}
