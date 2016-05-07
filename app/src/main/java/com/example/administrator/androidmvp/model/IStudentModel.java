package com.example.administrator.androidmvp.model;

import com.example.administrator.androidmvp.bean.Student;


public interface IStudentModel {

    /**
     * 保存学生信息
     * @param id 学号
     * @param name 姓名
     * @param sex  性别
     */
     void save(int id, String name, String sex);

    /**
     * 读取学生信息
     * @param id 学号
     * @return
     */
    Student load(int id);
}
