package com.minderliu;

import com.minderliu.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/5/8.
 */
@RestController
@RequestMapping
public class MainCtroller {

    @RequestMapping("/a")
    public @ResponseBody User test(Model model) {
        User user=new User();
        user.setId(1);
        return user;
    }

}
