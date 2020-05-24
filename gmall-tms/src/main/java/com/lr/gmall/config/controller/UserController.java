package com.lr.gmall.config.controller;

import com.lr.gmall.config.entity.User;
import com.lr.gmall.config.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (User)表控制层
 *
 * @author alterui
 * @since 2020-05-24 16:58:13
 */
@RestController
@RequestMapping("user")
public class UserController {
    /**
     * 服务对象
     */
    @Resource
    private UserService userService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public User selectOne(Integer id) {
        return this.userService.queryById(id);
    }

    @PostMapping("insert")
    public void insertUser(@RequestBody User user) {
        userService.insert(user);
    }

}