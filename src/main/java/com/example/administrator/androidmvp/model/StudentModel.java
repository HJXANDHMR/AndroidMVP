package com.example.administrator.androidmvp.model;

import android.util.SparseArray;

import com.example.administrator.androidmvp.bean.Student;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2016/4/5.
 */
public class StudentModel implements IStudentModel {

    private int id;
    private String name;
    private String sex;
    private SparseArray<Student> array = new SparseArray<>();

//    @Override
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    @Override
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    @Override
//    public void setSex(String sex) {
//
//        this.sex = sex;
//    }

    @Override
    public void save(int id,String name,String sex) {
        Student student = new Student();
        student.setId(id);
        student.setName(name);
        student.setSex(sex);
        array.append(id, student);
    }

    @Override
    public Student load(int id) {
        Student notFound = new Student();
        notFound.setName("没有发现");
        notFound.setSex("没有发现");
        Student student=array.get(id, notFound);
        return student;
    }
}
