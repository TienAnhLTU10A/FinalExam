package com.ta.finalexam.Fragment;

import android.os.Bundle;

import com.ta.finalexam.Constant.HeaderOption;
import com.ta.finalexam.R;

/**
 * Created by Veteran Commander on 10/31/2016.
 */

public class ImageUploadFragment extends HeaderFragment {

    public static ImageUploadFragment newInstance(){
        ImageUploadFragment imageUploadFragment = new ImageUploadFragment();
        return imageUploadFragment;

    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_image_upload;
    }

    @Override
    protected void getArgument(Bundle bundle) {

    }

    @Override
    protected void initData() {

    }

    @Override
    protected int getLeftIcon() {
        return HeaderOption.LEFT_BACK;
    }

    @Override
    public String getScreenTitle() {
        return "Post Image";
    }

    @Override
    protected int getRightIcon() {
        return HeaderOption.RIGHT_NO_OPTION;
    }
}
