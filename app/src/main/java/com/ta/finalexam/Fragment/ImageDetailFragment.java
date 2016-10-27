package com.ta.finalexam.Fragment;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.view.View;

import com.ta.finalexam.Adapter.ImageDetailListAdapter;
import com.ta.finalexam.Adapter.ViewHolder.DetailHeaderViewHolder;
import com.ta.finalexam.Adapter.ViewHolder.DetailHeaderViewHolder_ViewBinding;
import com.ta.finalexam.Constant.HeaderOption;
import com.ta.finalexam.Dummy.DummyDetail;
import com.ta.finalexam.Dummy.DummyDetailHeader;
import com.ta.finalexam.R;

import java.util.ArrayList;
import java.util.List;

import vn.app.base.adapter.DividerItemDecoration;

/**
 * Created by Veteran Commander on 10/26/2016.
 */

public class ImageDetailFragment extends BaseHeaderListFragment {
    List<DummyDetail> dummyDetailList;
    ImageDetailListAdapter imageDetailListAdapter;
    DummyDetailHeader dummyDetailHeader;
    DetailHeaderViewHolder detailHeaderViewHolder;


    @Override
    protected void onRefreshData() {

    }

    @Override
    protected void getArgument(Bundle bundle) {

    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_image_detail;
    }

    @Override
    protected void initView(View root) {
        super.initView(root);
        rvList.setLayoutManager(new LinearLayoutManager(getActivity()));
        rvList.addItemDecoration(new DividerItemDecoration(getActivity(), null));
    }

    @Override
    protected void initData() {
        dummyDetailHeader = new DummyDetailHeader();


        dummyDetailList = new ArrayList<>();

        dummyDetailList.add(new DummyDetail(R.drawable.dummy_avatar_2,"Day la comment"));
        dummyDetailList.add(new DummyDetail(R.drawable.dummy_avatar_2,"Day la comment"));
        dummyDetailList.add(new DummyDetail(R.drawable.dummy_avatar_2,"Day la comment"));
        dummyDetailList.add(new DummyDetail(R.drawable.dummy_avatar_2,"Day la comment"));
        imageDetailListAdapter = new ImageDetailListAdapter();
        imageDetailListAdapter.setHeader(dummyDetailHeader);
        imageDetailListAdapter.setItems(dummyDetailList);
        rvList.setAdapter(imageDetailListAdapter);


    }

    @Override
    protected int getLeftIcon() {
        return HeaderOption.LEFT_BACK;
    }

    @Override
    protected int getRightIcon() {
        return HeaderOption.RIGHT_DELETE;
    }

    @Override
    public String getScreenTitle() {
        return "Detail";
    }
}
