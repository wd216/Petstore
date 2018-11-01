package com.nf147.petstore.controller;

import com.nf147.petstore.entity.PsUser;
import com.nf147.petstore.mapper.PsUserMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.faces.annotation.RequestMap;
import java.util.List;

@Controller
public class UserController {
    @Autowired
    PsUserMapper mapper;

    @PostMapping("/user")
    @ResponseBody
    private int createUser(@RequestBody PsUser user){
        int insert = mapper.insert(user);
        return insert;
    }

    @PostMapping("/user/createWithArray")
    @ResponseBody
    private int createWithArray(@RequestBody List<PsUser> list){
        int count = 0;
        for (PsUser psUser : list) {
            mapper.insert(psUser);
            count ++;
        }
        return count;
    }

    @GetMapping("/user/login")
    @ResponseBody
    private String login(@RequestBody @Param("username") String username,@Param("password") String password){
        PsUser login = mapper.login(username, password);
        if (login == null){
            return "登录失败";
        }
        return "登录成功";
    }

    @GetMapping("/user/{username}")
    @ResponseBody
    private PsUser selectByName(@PathVariable String username){
        PsUser psUser = mapper.selectByName(username);
        return psUser;
    }

    @RequestMapping(value = "/user/{username}",method = RequestMethod.DELETE)
    @ResponseBody
    private int deleteByName(@PathVariable String username){
        int i = mapper.deleteByUserName(username);
        return i;
    }

}
