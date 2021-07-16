package cn.edu.guet.springboot.service;

import cn.edu.guet.springboot.bean.User;

import java.util.List;

public interface IUserService {
    List<User> viewUser();
    void  deleteUser(String userId);

}
