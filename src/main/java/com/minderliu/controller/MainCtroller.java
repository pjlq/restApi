package com.minderliu.controller;

import com.minderliu.entity.Fund;
import com.minderliu.entity.FundKey;
import com.minderliu.entity.User;
import com.minderliu.service.impl.FundServiceImpl;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/5/8.
 */
@Controller
@RequestMapping
public class MainCtroller {

    @Resource
    private FundServiceImpl fundService;

    @RequestMapping("/a")
    @ResponseBody
    @ApiOperation(value = "获取用户列表", notes = "")
    public  Fund test() {
       Fund a= fundService.selectByPrimaryKey(new FundKey(3287,"519066"));
        return a;
    }

    @RequestMapping("/b")
    @ResponseBody
    public User test2() {
       User u=new User();
       u.setId(1);
       return u;
    }

    @ApiOperation(value = "获取用户列表", notes = "")
    @RequestMapping(value = { "" }, method = RequestMethod.GET)
    public List<User> getUserList() {
        List<User> r = new ArrayList<User>();
        return r;
    }

}
