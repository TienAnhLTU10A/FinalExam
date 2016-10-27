package com.ta.finalexam.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.ta.finalexam.Adapter.ViewHolder.DetailHeaderViewHolder;
import com.ta.finalexam.Adapter.ViewHolder.DetailItemViewHolder;
import com.ta.finalexam.Dummy.DummyDetail;
import com.ta.finalexam.Dummy.DummyDetailHeader;

import java.util.List;

import vn.app.base.adapter.HeaderAdapterWithItemClick;
import vn.app.base.adapter.viewholder.OnClickViewHolder;
import vn.app.base.util.UiUtil;

/**
 * Created by Veteran Commander on 10/26/2016.
 */

public class ImageDetailListAdapter extends HeaderAdapterWithItemClick<OnClickViewHolder,DummyDetailHeader,DummyDetail,String> {

//    List<DummyDetail> dummyDetailList;
//
//    public ImageDetailListAdapter(List<DummyDetail> dummyDetailList) {
//        this.dummyDetailList = dummyDetailList;
//    }

    @Override
    protected OnClickViewHolder onCreateHeaderViewHolder(ViewGroup parent, int viewType) {
        return new DetailHeaderViewHolder(UiUtil.inflate(parent,DetailHeaderViewHolder.LAYOUT_ID,false));
    }

    @Override
    protected OnClickViewHolder onCreateItemViewHolder(ViewGroup parent, int viewType) {
        return new DetailItemViewHolder(UiUtil.inflate(parent,DetailItemViewHolder.LAYOUT_ID,false));
    }

    @Override
    protected void onBindHeaderViewHolder(OnClickViewHolder holder, int position) {
        super.onBindHeaderViewHolder(holder, position);
//        DummyDetail dummyDetail = getItem(0);
        ((DetailHeaderViewHolder)holder).bind(getHeader());
    }

    @Override
    protected void onBindItemViewHolder(OnClickViewHolder holder, int position) {
        super.onBindItemViewHolder(holder, position);
        DummyDetail dummyDetail = getItem(position);
        ((DetailItemViewHolder)holder).bind(dummyDetail);
    }
}
