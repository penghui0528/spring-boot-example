package com.chaoqi.springboot_test.service.impl;

import com.chaoqi.springboot_test.dao.domain.MusicInfo;
import com.chaoqi.springboot_test.dao.mapper.MusicInfoMapper;
import com.chaoqi.springboot_test.service.MusicInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//@Transactional
@Service
public class MusicInfoServiceImpl  implements MusicInfoService {

    @Autowired
    private MusicInfoMapper musicInfoMapper;

    @Override
    public List<MusicInfo> getMusicInfo() {
        Map map  =  new HashMap<>();
        map.put("id",2);
       // List<MusicInfo> musicInfos = musicInfoMapper.selectAll(map);

       // musicInfoMapper.insert1();

        System.out.println("----123--");
        System.out.println("----456--");

        //int  k  =  5/0;

       // musicInfoMapper.insert2();
        MusicInfo music  =  new MusicInfo();
        music.setId(1009);
        music.setMusicName("喜欢你");
        music.setMusicSize("100");
        music.setSingerName("beyond");
        List<MusicInfo> list  =  new ArrayList<>();
        list.add(music);
        return list;
    }
}
