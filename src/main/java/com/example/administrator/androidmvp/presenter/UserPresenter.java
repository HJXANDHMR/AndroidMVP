package com.example.administrator.androidmvp.presenter;

import com.example.administrator.androidmvp.bean.Student;
import com.example.administrator.androidmvp.model.IStudentModel;
import com.example.administrator.androidmvp.model.StudentModel;
import com.example.administrator.androidmvp.view.IMainView;


public class UserPresenter {
    private IStudentModel iStudentModel;
    private IMainView iMainView;

    public UserPresenter(IMainView iMainView) {
        this.iMainView = iMainView;
        iStudentModel = new StudentModel();
    }

    public void save(int id, String name, String sex) {
        iStudentModel.save(id,name,sex);
    }

    public void load(int id) {
        Student student=iStudentModel.load(id);
        iMainView.setName(student.getName());
        iMainView.setSex(student.getSex());
    }
}
