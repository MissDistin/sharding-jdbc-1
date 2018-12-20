package com.example.shardingjdbc.entity;

import lombok.Data;

/**
 * @Auther: Tinko
 * @Date: 2018/12/19 16:15
 * @Description:
 */
@Data
public class User {

    private Long id;
    private Long order_id;
    private Long user_id;
    private String userName;
    private String passWord;
    private String nickName;
}
