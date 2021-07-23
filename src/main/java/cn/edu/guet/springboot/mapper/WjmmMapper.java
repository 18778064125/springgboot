package cn.edu.guet.springboot.mapper;




import cn.edu.guet.springboot.bean.user1;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface WjmmMapper {
   // List<user> lookuser();
    user1 updateUser(String username);
    void updatePassword(String password,String password1,String identification);
}
