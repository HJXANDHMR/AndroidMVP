package com.example.administrator.androidmvp.model;

import com.example.administrator.androidmvp.bean.Student;

/**
 * Created by Administrator on 2016/4/5.
 */
public interface IStudentModel {
//    void setId(int id);
//
//    void setName(String name);
//
//    void setSex(String sex);

    /**
     * 保存学生信息
     * @param id 学号
     * @param name 姓名
     * @param sex  性别
     */
    void save(int id,String name,String sex);

    /**
     * 读取学生信息
     * @param id 学号
     * @return
     */
    Student load(int id);
}
