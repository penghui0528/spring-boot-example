package com.chaoqi.springboot_test.dao.mapper;

import com.chaoqi.springboot_test.dao.domain.MusicInfo;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface MusicInfoMapper {

   // @ResultMap("BaseResultMap")
   // @Select("select * from music_info")
    List<MusicInfo> selectAll(Map map);

    int insert1();

    int insert2();
}
