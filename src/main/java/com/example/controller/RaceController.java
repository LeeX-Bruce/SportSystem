package com.example.controller;

import com.example.pojo.Race;
import com.example.service.RaceService;
import com.example.service.impl.RaceServiceImpl;
import com.example.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author LMH
 * @date 2022/3/25 19:20
 */

@RestController
@ResponseBody
@RequestMapping("/user")
public class RaceController {
    @Autowired
    private RaceServiceImpl raceServiceImpl;

    //赛事搜索
    @RequestMapping("/SearchRace")
    @ResponseBody
    public List<Race> SearchRace(String racename){
        return raceServiceImpl.SearchRaceByName(racename);
    }

    //赛事发布
    @RequestMapping("/PublishRace")
    @ResponseBody
    public int PublishRace(Race race){
        return raceServiceImpl.PublishRace(race);
    }

    //获取全部赛事
    @RequestMapping("/GetAllRace")
    @ResponseBody
    public List<Race> GetAllRace(){
        return raceServiceImpl.GetAllRace();
    }

    //获取特定赛事信息
    @RequestMapping("/GetRaceInfo")
    @ResponseBody
    public Race GetRaceInfo(String racename){
        return raceServiceImpl.GetRaceInfo(racename);
    }
}
