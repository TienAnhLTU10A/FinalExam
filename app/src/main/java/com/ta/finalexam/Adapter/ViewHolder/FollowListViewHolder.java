package com.ta.finalexam.Adapter.ViewHolder;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.github.siyamed.shapeimageview.RoundedImageView;
import com.ta.finalexam.Dummy.DummyFollowItem;
import com.ta.finalexam.R;

import butterknife.BindView;
import butterknife.OnClick;
import vn.app.base.adapter.viewholder.OnClickViewHolder;
import vn.app.base.util.StringUtil;

/**
 * Created by Veteran Commander on 10/14/2016.
 */

public class FollowListViewHolder extends OnClickViewHolder {

    public static final int LAYOUT_ID = R.layout.item_list_follow;

    @BindView(R.id.avatar_follow)
    public RoundedImageView ivAvatar;

    @BindView(R.id.tv_name_follow)
    public TextView tvFollowName;

    @BindView(R.id.btn_follow)
    public Button btnFollow;

    @OnClick(R.id.btn_follow)
    public void clickFollow(Button btnFollow){
        btnFollow.setText("UnFollow");
    }

    public FollowListViewHolder(View itemView) {
        super(itemView);
    }

    public void bind(DummyFollowItem dummyFollowItem){
        ivAvatar.setImageResource(dummyFollowItem.ResID);
        StringUtil.displayText(dummyFollowItem.followName,tvFollowName);
    }
}
