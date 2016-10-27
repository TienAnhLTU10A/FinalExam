package com.ta.finalexam.Adapter.ViewHolder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.ta.finalexam.Dummy.DummyDetail;
import com.ta.finalexam.R;

import butterknife.BindView;
import vn.app.base.adapter.viewholder.OnClickViewHolder;
import vn.app.base.util.StringUtil;

/**
 * Created by Veteran Commander on 10/26/2016.
 */

public class DetailItemViewHolder extends OnClickViewHolder {
    public static final int LAYOUT_ID = R.layout.detail_screen_item;
    @BindView(R.id.iv_detail_ava_cm)
    ImageView ivAvatar;
    @BindView(R.id.tv_detail_cm)
    TextView tvComment;

    public DetailItemViewHolder(View itemView) {
        super(itemView);
    }

    public void bind(DummyDetail dummyDetailComment){
        ivAvatar.setImageResource(dummyDetailComment.userAvaCm);
        StringUtil.displayText(dummyDetailComment.comment,tvComment);
    }

}
