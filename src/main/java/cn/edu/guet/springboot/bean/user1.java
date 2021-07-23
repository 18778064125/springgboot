package cn.edu.guet.springboot.bean;

public class user1 {

    private String uname;
    private String identification;
    private String bankNumber;
    private String phone;
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public user1(String uname, String identification, String bankNumber, String phone) {
        this.uname = uname;
        this.identification = identification;
        this.bankNumber = bankNumber;
        this.phone = phone;
    }

    public user1() {

    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public String getBankNumber() {
        return bankNumber;
    }

    public void setBankNumber(String bankNumber) {
        this.bankNumber = bankNumber;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
