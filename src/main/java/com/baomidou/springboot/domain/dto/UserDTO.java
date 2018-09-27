package com.baomidou.springboot.domain.dto;

import com.baomidou.springboot.domain.FriendGroup;
import com.baomidou.springboot.domain.User;
import lombok.Data;

import java.util.List;

/**
 * @Description UserDTO:用户聊天信息查询
 * @Author LiHaitao
 * @Date 2018/9/21 13:29
 * @UpdateUser
 * @UpdateDescrip
 * @UpdateDate
 * @Version 1.0.0
 **/
@Data
public class UserDTO {


    /**
     * 好友群组
     */
    private List<FriendGroup> friendGroups;


    /**
     * 好友
     */
    private List<User> friends;


}
