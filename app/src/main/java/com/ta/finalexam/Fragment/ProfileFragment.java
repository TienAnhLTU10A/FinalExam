package com.ta.finalexam.Fragment;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.view.View;

import com.ta.finalexam.R;

import butterknife.BindView;
import vn.app.base.fragment.BaseFragment;

/**
 * Created by 3543 on 10/16/2016.
 */

public class ProfileFragment extends BaseFragment {



    public static ProfileFragment newInstance(){
        ProfileFragment profileFragment = new ProfileFragment();
        return profileFragment;
    }
    @Override
    protected int getLayoutId() {
        return R.layout.fragment_profile;
    }

    @Override
    protected void initView(View root) {
        FloatingActionButton fabProfile = (FloatingActionButton)root.findViewById(R.id.fabProfile);
    }

    @Override
    protected void getArgument(Bundle bundle) {

    }

    @Override
    protected void initData() {

    }
}
