package com.ta.finalexam.Fragment;

import android.os.Bundle;
import android.view.View;

import com.ta.finalexam.R;

import vn.app.base.fragment.BaseFragment;

/**
 * Created by 3543 on 10/16/2016.
 */

public class UserFragment extends BaseFragment {

    public static UserFragment newInstance(){
        UserFragment userFragment = new UserFragment();
        return userFragment;
    }
    @Override
    protected int getLayoutId() {
        return R.layout.fragment_user;
    }

    @Override
    protected void initView(View root) {

    }

    @Override
    protected void getArgument(Bundle bundle) {

    }

    @Override
    protected void initData() {

    }
}
