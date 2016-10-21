package com.ta.finalexam.Fragment;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.ta.finalexam.API.Request.TutRequest;
import com.ta.finalexam.API.Response.TutorialResponse;
import com.ta.finalexam.Adapter.TutViewPagerAdapter;
import com.ta.finalexam.Bean.DataTut;
import com.ta.finalexam.Constant.HeaderOption;
import com.ta.finalexam.R;

import butterknife.BindView;
import butterknife.OnClick;
import me.relex.circleindicator.CircleIndicator;
import vn.app.base.api.volley.callback.ApiObjectCallBack;

/**
 * Created by Veteran Commander on 10/21/2016.
 */

public class TutorialFragment extends NoHeaderFragment {
    DataTut dataTut;
    TutViewPagerAdapter tutViewPagerAdapter;

    public static TutorialFragment newInstance() {
        TutorialFragment newFragment = new TutorialFragment();
        return newFragment;
    }

    @BindView(R.id.vp_tut)
    ViewPager viewPager;
    @BindView(R.id.btn_tut_skip)
    Button btnSkip;
    @BindView(R.id.tut_indicator)
    CircleIndicator indicator;
    @OnClick(R.id.btn_tut_skip)
    public void onSkip(){
        Toast.makeText(getActivity(),btnSkip.getText().toString(),Toast.LENGTH_SHORT).show();
        //go to home screen
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_tut_screen;
    }

    @Override
    protected boolean isStartWithLoading() {
        return dataTut == null;
    }

    @Override
    protected void getArgument(Bundle bundle) {

    }

    @Override
    protected void initData() {
        getDatatutorial();
    }

    private void getDatatutorial(){
        TutRequest tutRequest = new TutRequest();
        tutRequest.setRequestCallBack(new ApiObjectCallBack<TutorialResponse>() {
            @Override
            public void onSuccess(TutorialResponse data) {
                dataTut = data.data;
                tutViewPagerAdapter = new TutViewPagerAdapter(getChildFragmentManager(),dataTut);
                viewPager.setAdapter(tutViewPagerAdapter);
                indicator.setViewPager(viewPager);
            }

            @Override
            public void onFail(int failCode, String message) {

            }
        });
        tutRequest.execute();
    }


}
