package com.ta.finalexam;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.ta.finalexam.Fragment.LoginFragment;

import vn.app.base.activity.BaseActivity;
import vn.app.base.util.FragmentUtil;

public class MainActivity extends BaseActivity {

    @Override
    protected String getNoConnectionMessage() {
        return "No internet connection";
    }

    @Override
    protected String getErrorAPIMessage() {
        return "No internet connection";
    }

    @Override
    protected String getTimeOutMessage() {
        return "Server timeout";
    }

    @Override
    public int setContentViewId() {
        return R.layout.activity_main;
    }

    @Override
    public void initView() {
        FragmentUtil.pushFragment(this, LoginFragment.newInstance(),null);
    }

    @Override
    public void initData() {

    }
}
