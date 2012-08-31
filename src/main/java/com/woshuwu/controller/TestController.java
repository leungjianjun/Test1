package com.woshuwu.controller;

import com.woshuwu.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

/**
 * Created with IntelliJ IDEA.
 * Author: ljj
 * Date: 12-8-26
 * Time: 下午11:46
 */
@Controller
@RequestMapping("/test")
public class TestController {

    @RequestMapping("index.do")
    public String home(ModelMap model){
        User user = new User();
        user.setId(1);
        user.setName("Jeans");
        model.addAttribute("usr1",user);
        return "home";
    }
}
