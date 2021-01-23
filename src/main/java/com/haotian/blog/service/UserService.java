package com.haotian.blog.service;

import com.haotian.blog.po.User;

public interface UserService {
    User checkUser(String username, String password);
}
