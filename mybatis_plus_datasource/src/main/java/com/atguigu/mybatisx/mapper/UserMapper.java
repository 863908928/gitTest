package com.atguigu.mybatisx.mapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.atguigu.mybatisx.pojo.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
* @author 86390
* @description 针对表【t_user】的数据库操作Mapper
* @createDate 2022-11-16 17:16:26
* @Entity com.atguigu.mybatisx.pojo.User
*/
public interface UserMapper extends BaseMapper<User> {
    int insertSelective(User user);

    int deleteByUidAndAge(@Param("uid") Long uid, @Param("age") Integer age);

    int updateAgeAndSexByUid(@Param("age") Integer age, @Param("sex") Integer sex, @Param("uid") Long uid);

    List<User> selectAllByUid(@Param("uid") Long uid);
}




