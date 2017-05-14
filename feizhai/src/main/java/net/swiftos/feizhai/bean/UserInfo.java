package net.swiftos.feizhai.bean;

import java.io.Serializable;

/**
 * Created by ganyao on 2017/3/21.
 */
public class UserInfo implements Serializable {

    private String loginname;
    private String name;
    private String email;
    private String phone;

    public String getLoginname() {
        return loginname;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
