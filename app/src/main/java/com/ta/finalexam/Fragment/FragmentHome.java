package com.ta.finalexam.Fragment;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.view.View;

import com.ta.finalexam.Adapter.ViewHolder.ViewPagerAdapterHome;
import com.ta.finalexam.Api.request.HomeRequest;
import com.ta.finalexam.Api.response.HomeResponse;
import com.ta.finalexam.Bean.HomeBean.HomeBean;
import com.ta.finalexam.Helper.animate.ZoomOutPageTransformer;
import com.ta.finalexam.R;

import java.util.List;

import butterknife.BindView;
import butterknife.OnClick;
import vn.app.base.api.volley.callback.ApiObjectCallBack;
import vn.app.base.util.FragmentUtil;

/**
 * Created by kooryy2 on 10/24/2016.
 */

public class FragmentHome extends BaseHeaderFragment implements Navigator_Menu.NavigationDrawerCallbacks {

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
        return R.layout.fragment_home_news;
    }

    public static FragmentHome newInstance() {
        FragmentHome fragmentHome = new FragmentHome();
        return fragmentHome;
    }

    @Override
    protected void initView(View root) {
        super.initView(root);

    }


    @Override
    protected void onRefreshData() {

    }

    @Override
    protected void getArgument(Bundle bundle) {

    }

    @Override
    protected void initData() {

    }

    private void getDataHome() {
        HomeRequest homeRequest = new HomeRequest();
        homeRequest.setRequestCallBack(new ApiObjectCallBack<HomeResponse>() {
            @Override
            public void onSuccess(HomeResponse data) {

            }

            @Override
            public void onFail(int failCode, String message) {

            }
        });
        homeRequest.execute();
    }

    private void handleHomeData(HomeBean home) {
        vAdapter = new ViewPagerAdapterHome(getChildFragmentManager(), home);
        vpHome.setAdapter(vAdapter);
        vpHome.setPageTransformer(true, new ZoomOutPageTransformer());
        tabLayout.setupWithViewPager(vpHome);
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
