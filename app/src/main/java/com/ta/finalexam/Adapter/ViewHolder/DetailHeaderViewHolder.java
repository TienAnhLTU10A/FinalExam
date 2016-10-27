package com.ta.finalexam.Adapter.ViewHolder;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.github.siyamed.shapeimageview.RoundedImageView;
import com.ta.finalexam.Dummy.DummyDetail;
import com.ta.finalexam.Dummy.DummyDetailHeader;
import com.ta.finalexam.R;

import butterknife.BindView;
import vn.app.base.adapter.viewholder.OnClickViewHolder;
import vn.app.base.util.StringUtil;

/**
 * Created by Veteran Commander on 10/26/2016.
 */

public class DetailHeaderViewHolder extends OnClickViewHolder {
    public static final int LAYOUT_ID = R.layout.detail_screen_header;
    @BindView(R.id.ivProfile_detail_header)
    RoundedImageView ivAvatar;
    @BindView(R.id.tvName_detail_header)
    TextView tvUserName;
    @BindView(R.id.btn_follow_detail_header)
    Button btnFollow;
    @BindView(R.id.ivPhotoCover_detail_header)
    ImageView ivContent;
    @BindView(R.id.tvLabel_detail_header)
    TextView tvLabel;
    @BindView(R.id.tvHashTag_detail_header)
    TextView tvHashtag;

    public DetailHeaderViewHolder(View itemView) {
        super(itemView);
    }


    public void bind(DummyDetailHeader dummyDetailHeader){
        ivAvatar.setImageResource(dummyDetailHeader.userAva);
        ivContent.setImageResource(dummyDetailHeader.imContent);
        StringUtil.displayText(dummyDetailHeader.label,tvLabel);
        StringUtil.displayText(dummyDetailHeader.username,tvUserName);
        StringUtil.displayText(dummyDetailHeader.hashtag,tvHashtag);
    }
}
