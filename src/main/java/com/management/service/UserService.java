package com.management.service;


import com.management.model.OV.Result;
import com.management.model.jsonrequestbody.LoginInfo;

/**
 * @program: management
 * @description: 登录接口的业务实现
 * @author: ggmr
 * @create: 2018-07-29 17:21
 */
public interface UserService {

    /**
     * @Description: 登录接口,根据用户提供的账户和密码进行登录
     * @Param: [loginInfo]
     * @Return: com.management.model.OV.Result
     * @Author: ggmr
     * @Date: 18-7-30
     */
    Result login(LoginInfo loginInfo);


    /**
     * @Description: 判断是否超过截止时间的接口，超过返回１未超过返回２
     *               项目申报时间的结束时间，项目中期报告提交的结束时间和项目结题报告提交的结束时间
     *               以及项目结束的时间，这四个情况分别对应数字1 2 3 4
     * @Param: [projectCategoryId, type]
     * @Return: com.management.model.OV.Result
     * @Author: ggmr
     * @Date: 18-7-31
     */
    Result isTimeOut(int projectCategoryId, int type);
}
