package com.example.service;

import com.example.pojo.Race;

import java.util.List;

/**
 * @author LMH
 * @date 2022/3/25 19:15
 */

public interface RaceService {
    //查找赛事
    List<Race> SearchRaceByName(String racename);

    //发布赛事
    int PublishRace(Race race);

    //获取全部赛事
    List<Race> GetAllRace();

    //获取特定赛事信息
    Race GetRaceInfo(String racename);
}
