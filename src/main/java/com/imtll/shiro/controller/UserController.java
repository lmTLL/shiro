package com.imtll.shiro.controller;

import com.imtll.shiro.common.sysconst.SystemCon;
import com.imtll.shiro.common.vo.ResultVo;
import com.imtll.shiro.service.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Create with IDEA
 *
 * @ClassName controller
 * @Description TODO
 * @Author TLL
 * @Date: 2019/3/5 15:54
 * @Version 1.0
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("userlogin.do")
    public ResultVo login(String name, String password){
        ResultVo resultVo = userService.login(name,password);

        if(resultVo.getCode()== SystemCon.OK){
            UsernamePasswordToken token=new UsernamePasswordToken(name,password);

            Subject subject = SecurityUtils.getSubject();

            subject.getSession().setAttribute("user",resultVo.getData());

            subject.login(token);
        }
        return resultVo;
    }

}
