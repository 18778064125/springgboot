package cn.edu.guet.springboot.controller;

import cn.edu.guet.springboot.bean.User;
import cn.edu.guet.springboot.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IUserService userService;
    @GetMapping("viewUser")
    public String viewUser(HttpServletRequest request){
        request.setAttribute("users",userService.viewUser());
        return "viewUser";
    }
    @GetMapping("deleteUser")
    public String deleteUser(String userId,HttpServletRequest request){
        userService.deleteUser(userId);
        request.setAttribute("users",userService.viewUser());
        return "viewUser";

    }
}
