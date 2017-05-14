package net.swiftos.dao.model;

import com.sun.istack.internal.NotNull;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by ganyao on 2017/3/22.
 */
@Entity
@Table(name = "user", uniqueConstraints =
        {@UniqueConstraint(columnNames = {"userName"}), @UniqueConstraint(columnNames = {"mobile"})})
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    /**
     * 登录名
     */
    @NotNull
    private String userName;
    /**
     * 昵称
     */
    private String nickName;
    /**
     * 密码
     */
    private String password;
    /**
     * 头像
     */
    private String icon;
    /**
     * 邮箱
     */
    private String email;
    /**
     * 手机号
     */
    private String mobile;
    /**
     * 注册时间
     */
    @NotNull
    @Temporal(TemporalType.TIMESTAMP)
    private Date registerTime;
    /**
     * 最后登录时间
     */
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastLoginTime;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Date getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }
}
