package cn.edu.guet.springboot.service;

public interface IwjmmService {
   // List<user> lookuser();
    boolean updateUser(String username, String identification, String bankNumber, String phone);
    void updatePassword(String password,String password1,String identification);
}
