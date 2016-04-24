package com.example.administrator.androidmvp.view;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.administrator.androidmvp.R;
import com.example.administrator.androidmvp.presenter.UserPresenter;


public class MainActivity extends Activity implements View.OnClickListener, IMainView {

    private EditText et_id;
    private EditText et_name;
    private EditText et_sex;
    private Button bt_save;
    private Button bt_load;

    private UserPresenter userPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        initView();
    }

    private void initView() {
        et_id = (EditText) findViewById(R.id.et_id);
        et_name = (EditText) findViewById(R.id.et_name);
        et_sex = (EditText) findViewById(R.id.et_sex);
        bt_save = (Button) findViewById(R.id.bt_save);
        bt_load = (Button) findViewById(R.id.bt_load);

        bt_save.setOnClickListener(this);
        bt_load.setOnClickListener(this);

        userPresenter =new UserPresenter(this);
    }


    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.bt_save:
                userPresenter.save(getId(),getName(),getSex());
                break;
            case R.id.bt_load:
                userPresenter.load(getId());
                break;
            default:
                break;
        }
    }

    @Override
    public void setName(String name) {
        et_name.setText(name);
    }

    @Override
    public void setSex(String sex) {
        et_sex.setText(sex);
    }

    @Override
    public int getId() {
        return Integer.parseInt(et_id.getText().toString());
    }

    @Override
    public String getName() {
        return et_name.getText().toString();
    }

    @Override
    public String getSex() {
        return et_sex.getText().toString();
    }
}
