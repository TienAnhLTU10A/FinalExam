package com.ta.finalexam.Fragment;


import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.ta.finalexam.R;

import de.hdodenhof.circleimageview.CircleImageView;
import vn.app.base.fragment.CommonFragment;
import vn.app.base.util.FragmentUtil;


public class Navigator_Menu extends CommonFragment implements View.OnClickListener {

    private NavigationDrawerCallbacks mCallbacks;

    private static final String STATE_SELECT_POSITION = "select_navigation_drawer_position";

    private static final String PREF_USER_LEARN_DRAWER = "nav_learn_drawer";

    private int mCurrentSelectPosition = 0;
    private boolean mUserLearnDrawer;

    private DrawerLayout mDrawerLayout;

    View contentView;

    private View mFragmentContainerView;

    private RelativeLayout layout_profile;
    private LinearLayout menu_2, menu_3, menu_4, menu_5, menu_6, menu_7;
    private CircleImageView menu_avatar;
    int currentmenupos = 0;

    public Navigator_Menu() {
    }

    public static Navigator_Menu newInstance() {
        Navigator_Menu fragment = new Navigator_Menu();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    protected int getLayoutId() {
        return R.layout.fragment_menu_nav;
    }

    @Override
    protected void initView(View root) {

    }

    @Override
    protected void getArgument(Bundle bundle) {

    }

    @Override
    protected void initData() {

    }

    public boolean isDrawerOpen() {
        return mDrawerLayout != null && mDrawerLayout.isDrawerOpen(mFragmentContainerView);
    }

    public void setCurrentMenu(int position) {
        View currentmenu = getMenuByPosition(currentmenupos);
        if (currentmenu != null) {
            currentmenu.setSelected(false);
        }
        this.currentmenupos = position;
        currentmenu = getMenuByPosition(currentmenupos);
        if (currentmenu != null) {
            currentmenu.setSelected(true);
        }
    }

    public View getMenuByPosition(int position) {
        switch (position) {
            case 1:
                return menu_2;
            case 2:
                return menu_3;
            case 3:
                return menu_4;
            case 4:
                return menu_5;
            case 5:
                return menu_6;
            case 6:
                return menu_7;
            default:
                return null;
        }
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.menu_2:
                break;
            case R.id.menu_3:
                break;
            case R.id.menu_4:
                break;
            case R.id.menu_5:
                break;
            case R.id.menu_6:
                break;
            case R.id.menu_7:
                break;
        }
    }


    public void setUp(int fragmentId, DrawerLayout drawerLayout, Toolbar toolbar) {

        mFragmentContainerView = getActivity().findViewById(fragmentId);
        mDrawerLayout = drawerLayout;
        contentView = getActivity().findViewById(R.id.container);
        mDrawerLayout.setScrimColor(Color.TRANSPARENT);

        ImageView imageDrawer = (ImageView) toolbar.findViewById(R.id.headerMenu);
        imageDrawer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mDrawerLayout.isDrawerOpen(GravityCompat.START)) {
                    mDrawerLayout.closeDrawers();
                } else {
                    mDrawerLayout.openDrawer(GravityCompat.END);
                }
                getActivity().invalidateOptionsMenu();
            }
        });
        mDrawerLayout.addDrawerListener(new DrawerLayout.DrawerListener() {
            @Override
            public void onDrawerSlide(View drawerView, float slideOffset) {

            }

            @Override
            public void onDrawerOpened(View drawerView) {
                if (!isAdded()) {
                    return;
                }
                if (!mUserLearnDrawer) {
                    // Nguoi Dung Tu mo Drawer . Tranh Viec auto-show
                    // the navigation drawer automatically in the future.
                    mUserLearnDrawer = true;
                    SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(getActivity());
                    sp.edit().putBoolean(PREF_USER_LEARN_DRAWER, true).apply();
                }
                getActivity().invalidateOptionsMenu();
            }

            @Override
            public void onDrawerClosed(View drawerView) {
                if (!isAdded()) {
                    return;
                }
                getActivity().invalidateOptionsMenu();
            }

            @Override
            public void onDrawerStateChanged(int newState) {

            }
        });
        setCurrentMenu(3);
    }

    private void selectItem(int position) {
        if (position != 2 && position != 4 && position != 5) {
            setCurrentMenu(position);
        }
        mCurrentSelectPosition = position;
        if (mDrawerLayout != null) {
            mDrawerLayout.closeDrawer(mFragmentContainerView);
        }
        if (mCallbacks != null) {
            mCallbacks.onNavigationDrawerItemSelected(position);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Activity activity;
        if (context instanceof Activity) {
            activity = (Activity) context;
            mCallbacks = (NavigationDrawerCallbacks) activity;
        }


    }

    @Override
    public void onDetach() {
        super.onDetach();
        mCallbacks = null;
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(STATE_SELECT_POSITION, mCurrentSelectPosition);
    }


    /**
     * Callbacks interface that all activities using this fragment must implement.
     */
    public interface NavigationDrawerCallbacks {
        /**
         * Called when an item in the navigation drawer is selected.
         */
        void onNavigationDrawerItemSelected(int position);
    }
}
