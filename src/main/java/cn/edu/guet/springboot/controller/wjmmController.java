package cn.edu.guet.springboot.controller;


import cn.edu.guet.springboot.service.IwjmmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/user")
public class wjmmController {

    @Autowired
    private IwjmmService wjmmService;

    @GetMapping("index")
    public String index(){
        return "index";
    }


    @GetMapping("wjmm")
    public String wjmm(){
        return "lt/wjmm";
    }

    @RequestMapping("updatePassword")
    public String updatePassword(String password, String password1,String identification){

        wjmmService.updatePassword(password, password1, identification);
        System.out.println("kkkkk:"+password);
        System.out.println("ccccc:"+password1);
        System.out.println("AAAAAA:"+identification);
        return "index";
    }


    @GetMapping("updateUser")
    public String updateUser(String username, String identification, String bankNumber, String phone){

//        System.out.println("aa:"+username);
//        System.out.println("bb:"+identification);
//        System.out.println("cc："+bankNumber);
//        System.out.println("dd："+phone);
        System.out.println("kkkkkkkkkkkk");
        boolean flag=wjmmService.updateUser(username, identification, bankNumber, phone);
        System.out.println("值为 ："+flag);
        //System.out.println("yyyzzzz"+yz);
        if(flag==true){
            return "lt/xinmima";
        }else {
            return "lt/wjmm";

//            return "wjmm?error=no";
        }
    }

    @GetMapping("xinmima")
    public String xinmima(){
        return "lt/xinmima";
    }
    @GetMapping("dht")
    public String dht(){return "lt/dht";
    }
}
