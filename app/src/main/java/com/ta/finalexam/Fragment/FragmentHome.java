package com.ta.finalexam.Fragment;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.view.View;

import com.ta.finalexam.Adapter.ViewHolder.ViewPagerAdapterHome;
import com.ta.finalexam.Bean.HomeBean.HomeBean;
import com.ta.finalexam.Helper.animate.ZoomOutPageTransformer;
import com.ta.finalexam.R;

import java.util.List;

import butterknife.BindView;
import butterknife.OnClick;
import vn.app.base.util.FragmentUtil;

/**
 * Created by kooryy2 on 10/24/2016.
 */

public class FragmentHome extends HeaderFragment implements Navigator_Menu.NavigationDrawerCallbacks {

    @BindView(R.id.vpHome)
    ViewPager vpHome;
    @BindView(R.id.tab)
    TabLayout tabLayout;
    @BindView(R.id.fap)
    FloatingActionButton fap;

    private ViewPagerAdapterHome vAdapter;
    List<HomeBean> homeBeanList;


    @Override
    protected int getLayoutId() {
        return R.layout.fragment_home;
    }

    public static FragmentHome newInstance() {
        FragmentHome fragmentHome = new FragmentHome();
        return fragmentHome;
    }

    @Override
    protected void initView(View root) {
        super.initView(root);
        vAdapter = new ViewPagerAdapterHome(getChildFragmentManager());
        vpHome.setAdapter(vAdapter);
        vpHome.setPageTransformer(true, new ZoomOutPageTransformer());
        tabLayout.setupWithViewPager(vpHome);
    }


    @Override
    protected void getArgument(Bundle bundle) {

    }

    @Override
    protected void initData() {

    }

    private void handleHomeData(HomeBean home) {

    }


    @Override
    protected int getLeftIcon() {
        return R.id.headerMenu;
    }

    @Override
    public String getScreenTitle() {
        return "Home";
    }


    @OnClick(R.id.fap)
    public void OnclickFAP() {
        goToUploadScreen();
    }

    private void goToUploadScreen() {
        FragmentUtil.pushFragment(getActivity(), FragmentImageUpload.newInstance(), null);
    }

    @Override
    public void onNavigationDrawerItemSelected(int position) {

    }
}
