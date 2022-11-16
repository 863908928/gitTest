package com.example.mybatisplus.pojo;

import com.baomidou.mybatisplus.annotation.*;
import com.example.mybatisplus.enums.SexEnum;
import lombok.Data;

@Data
//设置实体类所对应的表名
//@TableName("t_user")
public class User {

    //当前指定字段设置为主键
    @TableId(value = "uid",type = IdType.AUTO)
   // @TableId注解的value属性，指定表中的主键字段，@TableId("uid")或@TableId(value="uid")
    private Long id;
    //设置属性所对应的字段名
    @TableField("user_name")
    private String name;

    private Integer age;

    private SexEnum sex;
    private String email;
    @TableLogic
    //逻辑删除
    private int isDeleted;

}
