package com.imtll.shiro.common.util;


import com.imtll.shiro.common.vo.JsonBean;

/**
 * Create with IDEA
 *
 * @ClassName JsonUtils
 * @Description TODO
 * @Author TLL
 * @Date: 2019/2/26 12:13
 * @Version 1.0
 */
public class JsonUtils {
    public static JsonBean createJsonBean(int code, Object info){
        JsonBean bean = new JsonBean();
        bean.setCode(code);
        bean.setInfo(info);
        return bean;
    }
}
