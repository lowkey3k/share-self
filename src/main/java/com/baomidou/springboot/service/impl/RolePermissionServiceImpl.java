package com.baomidou.springboot.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.baomidou.springboot.domain.entity.RolePermission;
import com.baomidou.springboot.domain.entity.UserRole;
import com.baomidou.springboot.mapper.RolePermissionMapper;
import com.baomidou.springboot.mapper.UserRoleMapper;
import com.baomidou.springboot.service.IRolePermissionService;
import com.baomidou.springboot.service.IUserRoleService;
import org.springframework.stereotype.Service;

/**
* @Description:
* @Author:         LiHaitao
* @CreateDate:     2018/8/20 13:18
* @UpdateUser:
* @UpdateDate:
* @UpdateRemark:
* @Version:        1.0.0
*/
@Service
public class RolePermissionServiceImpl extends ServiceImpl<RolePermissionMapper, RolePermission> implements IRolePermissionService {

}