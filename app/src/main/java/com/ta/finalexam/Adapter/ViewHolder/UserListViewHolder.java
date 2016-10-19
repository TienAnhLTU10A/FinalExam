package com.ta.finalexam.Adapter.ViewHolder;

import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.ta.finalexam.R;

import butterknife.BindView;
import vn.app.base.adapter.viewholder.OnClickViewHolder;

/**
 * Created by 3543 on 10/17/2016.
 */

public class UserListViewHolder extends OnClickViewHolder {

    public static final int LAYOUT_ID = R.layout.item_list_user;

    @BindView(R.id.ivItemUser)
    ImageView ivItemUser;

    @BindView(R.id.tvItemUser)
    TextView tvItemUser;

    @BindView(R.id.btnItemFollow)
    Button btnItemFolow;

    @BindView(R.id.ivStatus)
    ImageView ivStatus;

    @BindView(R.id.tvStatus)
    TextView tvStatus;

    @BindView(R.id.tvHaskTag)
    TextView tvHashTag;

    @BindView(R.id.ivLike)
    ImageView ivLike;

    public UserListViewHolder(View itemView) {
        super(itemView);
    }
}
