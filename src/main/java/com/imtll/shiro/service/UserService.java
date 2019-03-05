package com.imtll.shiro.service;

import com.imtll.shiro.common.vo.PageVo;
import com.imtll.shiro.common.vo.ResultVo;
import com.imtll.shiro.entity.SysUser;

/**
 * Create with IDEA
 *
 * @ClassName UserService
 * @Description TODO
 * @Author TLL
 * @Date: 2019/3/5 14:33
 * @Version 1.0
 */
public interface UserService {
    //新增
    ResultVo save(SysUser user, int rid);

    //分页查询
    PageVo<SysUser> queryPage(int page,int limit);

    //登录
    ResultVo login(String name, String password);



}
