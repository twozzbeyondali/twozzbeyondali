package cn.com.mdzz.controller;

import cn.com.mdzz.bean.AppResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserLoginController {

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public String index() {
        return "user login test";
    }

    @RequestMapping(value = "/",method = RequestMethod.PUT)
    public AppResult signIn() {
        return null;
    }
}
