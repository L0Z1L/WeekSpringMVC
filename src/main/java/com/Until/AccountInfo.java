package com.Until;

import lombok.Data;

import java.util.Date;
import java.util.List;
import java.util.Map;
 @Data
public class AccountInfo {
    private String accountName;
    private  Double money;
    private Date createDate;
    private User user;
    private List<User> userList;
    private Map<String,User> userMap;
}
