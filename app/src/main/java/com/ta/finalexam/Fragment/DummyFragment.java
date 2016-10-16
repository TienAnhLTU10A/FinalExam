package com.ta.finalexam.Fragment;

import android.os.Bundle;

import com.ta.finalexam.Constant.HeaderOption;
import com.ta.finalexam.R;

/**
 * Created by Veteran Commander on 10/14/2016.
 */

public class DummyFragment extends HeaderFragment {
    @Override
    protected int getLayoutId() {
        return R.layout.dummy_layout;
    }

    @Override
    protected void getArgument(Bundle bundle) {

    }

    @Override
    protected void initData() {

    }

    @Override
    protected int getLeftIcon() {
        return HeaderOption.LEFT_MENU;
    }

    @Override
    protected int getRightIcon() {
        return HeaderOption.RIGHT_UPDATE;
    }

    @Override
    public String getScreenTitle() {
        return "Just Dummy Fragment";
    }
}
