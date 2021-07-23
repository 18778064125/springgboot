package cn.edu.guet.springboot.service.Impl;


import cn.edu.guet.springboot.mapper.WjmmMapper;
import cn.edu.guet.springboot.service.IwjmmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class wjmmServiceImpl implements IwjmmService {
    @Autowired
    private WjmmMapper wjmmMapper;
//    @Override
//    public List<user> lookuser() {
//        return WjmmMapper.lookuser();
//    }

    @Override
    public boolean updateUser(String username, String identification, String bankNumber, String phone) {
        System.out.println("aa:"+username);
        System.out.println("bb:"+identification);
        System.out.println("cc："+bankNumber);
        System.out.println("dd："+phone);
        wjmmMapper.updateUser(username);
        String username1=wjmmMapper.updateUser(username).getUname();
        String identification1=wjmmMapper.updateUser(username).getIdentification();
        String bankNumber1=wjmmMapper.updateUser(username).getBankNumber();
        String phone1=wjmmMapper.updateUser(username).getPhone();
        System.out.println(username1);
        System.out.println(identification1);
        System.out.println(bankNumber1);
        System.out.println(phone1);
        boolean flag;
        if(username.equals(username1)&&identification.equals(identification1)&&bankNumber.equals(bankNumber1)&&phone.equals(phone1)){
            flag=true;
        }else {
            flag=false;
        }
        System.out.println("flag========== "+flag);
        return flag;

    }

    @Override
    public void updatePassword(String password, String password1,String identification) {
        wjmmMapper.updatePassword(password, password1,identification);
        System.out.println("makabaka:"+password);
        System.out.println("makabaka11:"+password1);
        System.out.println("makabaka111:"+identification);


    }
}