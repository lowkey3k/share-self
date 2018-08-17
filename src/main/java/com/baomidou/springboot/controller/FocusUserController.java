package com.baomidou.springboot.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.springboot.domain.FocusUser;
import com.baomidou.springboot.domain.User;
import com.baomidou.springboot.response.ResponseMessage;
import com.baomidou.springboot.service.IFocusUserService;
import com.baomidou.springboot.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


/**
* @Description:
* @Author:         LiHaitao
* @CreateDate:     2018/8/16 21:13
* @UpdateUser:
* @UpdateDate:     2018/8/16 21:13
* @UpdateRemark:
* @Version:        1.0.0
*/
@RestController
@RequestMapping("/focus")
public class FocusUserController extends ApiController {

    @Autowired
    private IFocusUserService focusUserService;
    @Autowired
    private IUserService userService;

    /**
    * @Description:    根据用户id查询用户关注的所有用户
    * @Author:         Lihaitao
    * @Date:       2018/8/16 21:14
    * @UpdateUser:
    * @UpdateRemark:
    */
    @GetMapping("/getAll")
    public ResponseMessage<List<User>> getAll(@RequestParam Long id){
        List<User> users=new ArrayList<>();
        QueryWrapper queryWrapper=new QueryWrapper();
        queryWrapper.eq("user_id",id);
        List<FocusUser> list=focusUserService.selectList(queryWrapper);
        list.forEach(focusUser -> {
            users.add(userService.selectById(focusUser.getUserId()));
        });
        return  ResponseMessage.ok(users);
    }

}