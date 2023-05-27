package com.controllor;

import com.Until.AccountInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.servlet.http.HttpSession;
import java.util.Date;

@Controller
@RequestMapping("/SpringLab11")
@SessionAttributes(value = "accountInfo")
public class Test {
    @RequestMapping("/test1")
    public String test(AccountInfo accountInfo){

        System.out.println(accountInfo.getAccountName());
        System.out.println(accountInfo.getMoney());
        System.out.println(accountInfo.getCreateDate());
        System.out.println(accountInfo.getUser().getUname());
        System.out.println(accountInfo.getUser().getAge());
        System.out.println(accountInfo.getUserMap().get("one").getUname());
        System.out.println(accountInfo.getUserMap().get("one").getAge());
        System.out.println(accountInfo.getUserList().get(0).getUname());
        System.out.println(accountInfo.getUserList().get(0).getAge());

        return "success"; //返回到success.jsp
    }
    @ModelAttribute
    public AccountInfo ChangeDate(AccountInfo accountInfo){

        return accountInfo;
    }
}
