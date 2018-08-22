package cn.com.mdzz.controller;

import cn.com.mdzz.bean.AppResult;
import cn.com.mdzz.validator.Validator;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserSignController {



    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public String test() {
        return "user login test";
    }

    @RequestMapping(value = "/session",method = RequestMethod.PUT)
    public AppResult signIn(@RequestParam(defaultValue = "") String mobile,@RequestParam(defaultValue = "") String code) {

        if (StringUtils.isEmpty(mobile)) {
            return AppResult.getParamErrorResult("用户手机不能为空");
        }

        if (StringUtils.isEmpty(code)) {
            return AppResult.getParamErrorResult("验证码不能为空");
        }

        if (!Validator.isMobile(mobile)) {
            return AppResult.getParamErrorResult("手机号格式错误");
        }

        if (code.length() != 6 || !StringUtils.isNumeric(code)) {
            return AppResult.getParamErrorResult("验证码格式错误");
        }



        return null;
    }
}
