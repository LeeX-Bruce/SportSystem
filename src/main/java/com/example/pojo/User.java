package com.example.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author LMH
 * @date 2022/3/21 20:18
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String userid;
    private String usernumber;
    private String username;
    private String userpassword;
    private String department;
    private int Identify;
}
