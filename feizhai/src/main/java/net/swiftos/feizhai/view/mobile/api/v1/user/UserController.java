package net.swiftos.feizhai.view.mobile.api.v1.user;

import net.swiftos.dao.dboperate.UserDao;
import net.swiftos.dao.model.User;
import net.swiftos.feizhai.bean.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by ganyao on 2017/3/21.
 */
@Controller
@RequestMapping("/mobile/api/v1/user")
public class UserController {

    @Autowired
    UserDao userDao;

    @RequestMapping("/login")
    @ResponseBody
    public Result<UserInfo> login(@RequestParam("loginname")String loginName
            , @RequestParam("pass")String pass) {
        User user = new User();
        user.setUserName(loginName);
        user.setPassword(pass);
        userDao.save(user);
        return new Result<UserInfo>(1, "success", new UserInfo());
    }

    @RequestMapping("/logout")
    @ResponseBody
    public String logout() {
        return "hello";
    }

}
