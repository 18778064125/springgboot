package cn.edu.guet.springboot.service.Impl;

import cn.edu.guet.springboot.bean.User;
import cn.edu.guet.springboot.mapper.UserMapper;
import cn.edu.guet.springboot.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> viewUser() {
        return userMapper.viewUser();
    }
    @Override
    public void deleteUser(String userId){
        userMapper.deleteUser(userId);

    }

}
