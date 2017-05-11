package com.minderliu.controller;

import com.minderliu.entity.Fund;
import com.minderliu.entity.FundKey;
import com.minderliu.entity.User;
import com.minderliu.service.impl.FundServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2017/5/8.
 */
@RestController
@RequestMapping
public class MainCtroller {

    @Resource
    private FundServiceImpl fundService;

    @RequestMapping("/a")
    public @ResponseBody
    Fund test() {
       Fund a= fundService.selectByPrimaryKey(new FundKey(3287,"519066"));

        return a;
    }

    @RequestMapping("/b")
    public @ResponseBody
    User test2() {
       User u=new User();
       u.setId(1);

        return u;
    }

}
