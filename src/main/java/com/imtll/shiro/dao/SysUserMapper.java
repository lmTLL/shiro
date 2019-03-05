package com.imtll.shiro.dao;

import com.imtll.shiro.entity.SysUser;
import org.apache.ibatis.annotations.Param;

public interface SysUserMapper {

    int insert(SysUser record);

    SysUser selectById(Integer id);

    SysUser selectByName(String name);

    int updateByIdSelective(SysUser record);

    int updateByIdFlag(@Param("id") int id, @Param("flag") int flag);

    int updateByIdPassword(@Param("id") int id, @Param("password") String password);
}