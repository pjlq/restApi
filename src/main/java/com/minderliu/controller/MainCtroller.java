package com.minderliu.controller;

import com.minderliu.entity.Fund;
import com.minderliu.entity.FundKey;
import com.minderliu.entity.User;
import com.minderliu.service.impl.FundServiceImpl;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2017/5/8.
 */
@RestController
@RequestMapping
@Api(value = "admin")
public class MainCtroller {

    @Resource
    private FundServiceImpl fundService;

    @RequestMapping("/a")
    @ResponseBody
    @ApiOperation(value = "ww", httpMethod = "GET", response = Fund.class, notes = "ww")
    public  Fund test() {
       Fund a= fundService.selectByPrimaryKey(new FundKey(3287,"519066"));
        return a;
    }

    @RequestMapping("/b")
    @ResponseBody
    @ApiOperation(value = "test", httpMethod = "GET", response = User.class, notes = "ww")
    public User test2() {
       User u=new User();
       u.setId(1);
       return u;
    }

}
