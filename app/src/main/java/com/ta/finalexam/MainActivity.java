package com.ta.finalexam;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.ta.finalexam.Bean.HeaderControlBean;
import com.ta.finalexam.Constant.HeaderOption;
import com.ta.finalexam.Fragment.FollowFragment;
import com.ta.finalexam.Fragment.ImageDetailFragment;
import com.ta.finalexam.Fragment.NearbyFragment;
import com.ta.finalexam.Fragment.TutorialFragment;

import butterknife.BindView;
import vn.app.base.activity.CommonActivity;
import vn.app.base.util.StringUtil;
import vn.app.base.util.UiUtil;

public class MainActivity extends CommonActivity {

    @BindView(R.id.toolbar)
    RelativeLayout rlToolbar;

    @BindView(R.id.headerMenu)
    ImageView ivMenu;

    @BindView(R.id.headerBack)
    ImageView ivBack;

    @BindView(R.id.tv_delete)
    TextView tvDelete;

    @BindView(R.id.tv_update)
    TextView tvUpdate;

    @BindView(R.id.headerTitle)
    TextView tvTitle;



    @Override
    protected String getNoConnectionMessage() {
        return getString(R.string.dialog_error_no_connection);
    }

    @Override
    protected String getErrorAPIMessage() {
        return getString(R.string.dialog_error_no_connection);
    }

    @Override
    protected String getTimeOutMessage() {
        return getString(R.string.dialog_error_timeout);
    }

    @Override
    public int setContentViewId() {
        return R.layout.activity_main;
    }

    @Override
    public void initView() {
//        setUpInitScreen( TutorialFragment.newInstance(), null);
        setUpInitScreen( new ImageDetailFragment(), null);
    }

    @Override
    public void initData() {

    }

    @Override
    public void onCommonDataHandle(Bundle bundle) {

    }

    @Override
    public void onCommonUIHandle(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        if (bundle.containsKey(HeaderOption.HEADER_CONTROL)) {
            HeaderControlBean headerControlBean = bundle.getParcelable(HeaderOption.HEADER_CONTROL);
            if (headerControlBean != null) {
                handleHeaderUI(headerControlBean);
            }
        }
    }

    private void handleHeaderUI(HeaderControlBean headerControlBean) {
        if (headerControlBean.headerOptions != null && headerControlBean.headerOptions.length > 0) {
            if (headerControlBean.headerOptions[0] == HeaderOption.SHOW_HEADER) {
                UiUtil.showView(rlToolbar);
            } else if (headerControlBean.headerOptions[0] == HeaderOption.HIDE_HEADER) {
                UiUtil.hideView(rlToolbar, true);
            }
            if (headerControlBean.headerOptions.length > 1 && headerControlBean.headerOptions[1] > 0) {
                handleLeftIcon(headerControlBean.headerOptions[1]);
                if (headerControlBean.headerOptions.length > 2 && headerControlBean.headerOptions[2] > 0) {
                    handleRightIcon(headerControlBean.headerOptions[2]);
                } else {
                    showAndHideIconRight(null);
                }
            } else {
                showAndHideIconLeft(ivMenu);
            }
        }
        if (StringUtil.checkStringValid(headerControlBean.title)) {
            StringUtil.displayText(headerControlBean.title, tvTitle);
        }
    }

    private void handleLeftIcon(int value) {
        switch (value) {
            case HeaderOption.LEFT_NO_OPTION:
                showAndHideIconLeft(null);
                break;
            case HeaderOption.LEFT_MENU:
                showAndHideIconLeft(ivMenu);
                break;
            case HeaderOption.LEFT_BACK:
                showAndHideIconLeft(ivBack);
                break;
        }
    }

    private void handleRightIcon(int value) {
        switch (value) {
            case HeaderOption.RIGHT_NO_OPTION:
                showAndHideIconRight(null);
                break;
            case HeaderOption.RIGHT_DELETE:
                showAndHideIconRight(tvDelete);
                break;
            case HeaderOption.RIGHT_UPDATE:
                showAndHideIconRight(tvUpdate);
                break;
        }
    }

    private void showAndHideIconLeft(View target) {
        showOrHide(ivMenu, target);
        showOrHide(ivBack, target);
    }

    private void showAndHideIconRight(View target) {
        showOrHide(tvDelete, target);
        showOrHide(tvUpdate, target);
    }

    protected void showOrHide(View subject, View target) {
        subject.setVisibility(subject == target ? View.VISIBLE : View.GONE);
    }
}
