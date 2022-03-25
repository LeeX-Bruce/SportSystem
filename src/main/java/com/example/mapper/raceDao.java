package com.example.mapper;

import com.example.pojo.Race;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author LMH
 * @date 2022/3/25 18:57
 */

@Repository
@Mapper
public interface raceDao {
    //查找赛事
    List<Race> SearchRaceByName(String racename);

    //发布赛事
    int PublishRace(Race race);

    //获取全部赛事
    List<Race> GetAllRace();

    //获取特定赛事信息
    Race GetRaceInfo(String racename);
}
