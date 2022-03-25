package com.example.service.impl;

import com.example.mapper.raceDao;
import com.example.mapper.userDao;
import com.example.pojo.Race;
import com.example.service.RaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author LMH
 * @date 2022/3/25 19:16
 */

@Service
public class RaceServiceImpl implements RaceService {
    @Autowired
    private raceDao raceDao;

    @Override
    public List<Race> SearchRaceByName(String racename) {
        return raceDao.SearchRaceByName(racename);
    }

    @Override
    public int PublishRace(Race race) {
        return raceDao.PublishRace(race);
    }

    @Override
    public List<Race> GetAllRace() {
        return raceDao.GetAllRace();
    }

    @Override
    public Race GetRaceInfo(String racename) {
        return raceDao.GetRaceInfo(racename);
    }
}
