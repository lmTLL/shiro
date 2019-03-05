package com.imtll.shiro.service.impl;

import com.imtll.shiro.common.util.ResultUtil;
import com.imtll.shiro.common.vo.PageVo;
import com.imtll.shiro.common.vo.ResultVo;
import com.imtll.shiro.dao.SysUserMapper;
import com.imtll.shiro.entity.SysUser;
import com.imtll.shiro.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

/**
 * Create with IDEA
 *
 * @ClassName UserServiceImpl
 * @Description TODO
 * @Author TLL
 * @Date: 2019/3/5 15:48
 * @Version 1.0
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private SysUserMapper userMapper;



    @Override
    public ResultVo save(SysUser user, int rid) {
        return null;
    }

    @Override
    public PageVo<SysUser> queryPage(int page, int limit) {
        return null;
    }

    @Override
    public ResultVo login(String name, String password) {

        SysUser user = userMapper.selectByName(name);
        if (user!=null){
            if(Objects.equals(user.getPassword(),password)){
                return ResultUtil.exec(true,"OK",user);
            }

        }


        return ResultUtil.exec(false,"用户名或密码不正确",null);
    }
}
