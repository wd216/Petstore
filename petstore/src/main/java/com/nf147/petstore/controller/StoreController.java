package com.nf147.petstore.controller;

import com.nf147.petstore.entity.PsOrder;
import com.nf147.petstore.mapper.PsOrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.faces.annotation.RequestMap;
import javax.ws.rs.Path;

@Controller
public class StoreController {
    @Autowired
    PsOrderMapper mapper;

    @PostMapping("/store/order")
    @ResponseBody
    private int order(@RequestBody PsOrder order){
        int insert = mapper.insert(order);
        return insert;
    }


    @GetMapping("/store/order/{orderId}")
    @ResponseBody
    private PsOrder findById(@PathVariable int id){
        PsOrder psOrder = mapper.selectByPrimaryKey(id);
        return psOrder;
    }

    @RequestMapping(value = "/store/order/{orderId}")
    @ResponseBody
    private int deleteById(@PathVariable int id){
        int i = mapper.deleteByPrimaryKey(id);
        return i;
    }

}
