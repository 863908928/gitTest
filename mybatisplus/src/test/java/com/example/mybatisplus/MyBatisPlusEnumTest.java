package com.example.mybatisplus;

import com.example.mybatisplus.enums.SexEnum;
import com.example.mybatisplus.mapper.UserMapper;
import com.example.mybatisplus.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MyBatisPlusEnumTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void test(){
        User user= new User();
        user.setName("111");
        user.setAge(22);
        user.setSex(SexEnum.MALE);
        userMapper.insert(user);
    }
}
