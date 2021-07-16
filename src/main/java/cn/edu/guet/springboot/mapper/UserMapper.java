package cn.edu.guet.springboot.mapper;

import cn.edu.guet.springboot.bean.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    List<User> viewUser();
    void  deleteUser(String userId);
}
