package com.ta.finalexam.Fragment;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.ta.finalexam.R;

import butterknife.BindView;
import butterknife.OnClick;
import vn.app.base.fragment.BaseFragment;
import vn.app.base.util.FragmentUtil;

/**
 * Created by 3543 on 10/16/2016.
 */

public class RegisterFragment extends BaseFragment {

    @BindView(R.id.ivAvatar)
    ImageView ivAvatar;

    @BindView(R.id.etUser)
    EditText etUser;

    @BindView(R.id.etEmail)
    EditText etEmail;

    @BindView(R.id.etPass)
    EditText etPass;

    @BindView(R.id.etConfirm)
    EditText etConfirm;

    @BindView(R.id.btnSignUp)
    Button btnSignUp;

    public static RegisterFragment newInstance(){
        RegisterFragment registerFragment = new RegisterFragment();
        return registerFragment;
    }
    @Override
    protected int getLayoutId() {
        return R.layout.fragment_register;
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

    @OnClick(R.id.btnSignUp)
    public void goToUserProfile(){
        FragmentUtil.pushFragment(getActivity(),UserFragment.newInstance(),null);
    }
}