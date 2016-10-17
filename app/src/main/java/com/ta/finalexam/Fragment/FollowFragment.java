package com.ta.finalexam.Fragment;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.view.View;
import android.widget.Toast;

import com.ta.finalexam.Adapter.FollowListAdapter;
import com.ta.finalexam.Constant.HeaderOption;
import com.ta.finalexam.DummyFollowItem;
import com.ta.finalexam.R;

import java.util.ArrayList;
import java.util.List;

import vn.app.base.callback.OnRecyclerViewItemClick;

/**
 * Created by Veteran Commander on 10/14/2016.
 */

public class FollowFragment extends BaseHeaderListFragment {
    List<DummyFollowItem> dummyFollowItemList;
    FollowListAdapter followListAdapter;

    public static FollowFragment newInstance(){
        FollowFragment newFragment = new FollowFragment();
        return newFragment;
    }


    @Override
    protected void onRefreshData() {

    }

    @Override
    protected void getArgument(Bundle bundle) {

    }

    @Override
    protected void initData() {
        dummyFollowItemList = new ArrayList<>();
        dummyFollowItemList.add(new DummyFollowItem(R.drawable.dummy_avatar,"Name1"));
        dummyFollowItemList.add(new DummyFollowItem(R.drawable.dummy_avatar_3,"Name2"));
        dummyFollowItemList.add(new DummyFollowItem(R.drawable.dummy_avatar_2,"Name3"));
        followListAdapter = new FollowListAdapter(dummyFollowItemList);
        followListAdapter.setOnRecyclerViewItemClick(new OnRecyclerViewItemClick() {
            @Override
            public void onItemClick(View view, int position) {
                int realpos = position + 1;
                Toast.makeText(getActivity(),realpos + "" ,Toast.LENGTH_SHORT).show();
            }
        });
        rvList.setAdapter(followListAdapter);


    }

    @Override
    protected boolean isSkipGenerateBaseLayout() {
        return true;
    }

    @Override
    protected void initView(View root) {
        super.initView(root);
        rvList.setLayoutManager(new LinearLayoutManager(getActivity()));
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_follow_screen;
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
