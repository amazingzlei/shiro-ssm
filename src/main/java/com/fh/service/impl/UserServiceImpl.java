package com.fh.service.impl;

import com.fh.dao.UserDao;
import com.fh.pojo.User;
import com.fh.service.IUserService;
import org.apache.shiro.authz.annotation.Logical;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {

    Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private UserDao userDao;

    @Override
    public User getUserByUsername(String username) {
        return userDao.getUserByUserName(username);
    }

    /*user和admin角色都能操作*/
    @RequiresRoles(value = {"user","admin"},logical = Logical.OR)
    @Override
    public void addUser() {
        logger.info("---------->新增用户成功!");
    }

    // 只有admin角色并且有update权限才能操作
    @Override
    @RequiresRoles(value = {"admin"})
    @RequiresPermissions(value = {"update"})
    public void updateUser() {
        logger.info("---------->修改用户成功!");
    }

    @Override
    @RequiresRoles(value = {"admin"})
    public void delUser() {
        logger.info("---------->删除用户成功!");
    }
}
