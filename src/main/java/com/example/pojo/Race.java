package com.example.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author LMH
 * @date 2022/3/25 18:52
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Race {
    private String racename;
    private String raceplace;
    private String raceamount;
    private Date starttime;
    private Date endtime;
    private int status;
    private String picture;
    private String gradetype;
    private String host;
    private int racetype;
}
