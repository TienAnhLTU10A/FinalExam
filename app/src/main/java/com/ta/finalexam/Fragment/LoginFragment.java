package com.ta.finalexam.Fragment;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.ta.finalexam.R;

import butterknife.BindView;
import butterknife.OnClick;
import vn.app.base.fragment.BaseFragment;
import vn.app.base.util.FragmentUtil;

/**
 * Created by 3543 on 10/14/2016.
 */

public class LoginFragment extends BaseFragment {

    @BindView(R.id.etLogin)
    EditText etLogin;

    @BindView(R.id.etPassword)
    EditText etPass;

    @BindView(R.id.btnLogin)
    Button btnLogin;

    @BindView(R.id.btnCreateAccount)
    Button btnCreate;

    public static LoginFragment newInstance(){
        LoginFragment loginFragment = new LoginFragment();
        return loginFragment;
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_login;
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

    @OnClick(R.id.btnCreateAccount)
    public void goToRegisterFragment(){
        FragmentUtil.pushFragment(getActivity(),RegisterFragment.newInstance(),null);
    }

    @OnClick(R.id.btnLogin)
    public void goToProfileFragment(){
        FragmentUtil.pushFragment(getActivity(),ProfileFragment.newInstance(),null);
    }
}
