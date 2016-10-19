package com.ta.finalexam.Adapter.ViewHolder;

import android.view.View;
import android.widget.TextView;

import com.ta.finalexam.R;

import butterknife.BindView;
import de.hdodenhof.circleimageview.CircleImageView;
import vn.app.base.adapter.viewholder.OnClickViewHolder;

/**
 * Created by 3543 on 10/17/2016.
 */

public class UserHeaderViewHolder extends OnClickViewHolder {

    public static final int LAYOUT_ID = R.layout.item_list_user_header;

    @BindView(R.id.civUser)
    CircleImageView civUser;

    @BindView(R.id.tvUserName)
    TextView tvUserName;

    @BindView(R.id.tvFollowUser)
    TextView tvFollowUser;

    @BindView(R.id.tvFollowerUser)
    TextView tvFollowerUser;

    @BindView(R.id.tvPostUser)
    TextView tvPostUser;

    public UserHeaderViewHolder(View itemView) {
        super(itemView);
    }
}
