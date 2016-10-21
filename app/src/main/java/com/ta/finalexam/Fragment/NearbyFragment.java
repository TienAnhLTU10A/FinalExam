package com.ta.finalexam.Fragment;

import android.Manifest;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.ta.finalexam.Adapter.CustomInfoWindow;
import com.ta.finalexam.Constant.HeaderOption;
import com.ta.finalexam.R;

import butterknife.BindView;


/**
 * Created by Veteran Commander on 10/17/2016.
 */

public class NearbyFragment extends HeaderFragment implements OnMapReadyCallback {
    private GoogleMap mMap;

    CustomInfoWindow newInfo;

    LatLng dummylocation;

    View view;

//    @BindView(R.id.map)
//    SupportMapFragment mapFragment;

    public static NearbyFragment newInstance() {
        NearbyFragment newFragment = new NearbyFragment();
        return newFragment;
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_nearby_screen;
    }

    @Override
    protected void getArgument(Bundle bundle) {

    }

    @Override
    protected void initData() {

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = super.onCreateView(inflater, container, savedInstanceState);
        SupportMapFragment mapFragment = (SupportMapFragment)getChildFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
        return view;


    }

    @Override
    protected int getRightIcon() {
        return HeaderOption.RIGHT_NO_OPTION;
    }

    @Override
    protected int getLeftIcon() {
        return HeaderOption.LEFT_BACK;
    }

    @Override
    public String getScreenTitle() {
        return "Nearby";
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        mMap.getUiSettings().setZoomControlsEnabled(true);
        mMap.getUiSettings().setMapToolbarEnabled(false);
        if (ActivityCompat.checkSelfPermission(getActivity(), Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(getActivity(), Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return;
        }
        mMap.setMyLocationEnabled(true);

        newInfo = new CustomInfoWindow(getActivity());
        mMap.setInfoWindowAdapter(newInfo);

        dummylocation = new LatLng(21.005661, 105.843172);
        MarkerOptions mMarker = new MarkerOptions().position(dummylocation);
        mMarker.icon(BitmapDescriptorFactory.fromBitmap(resizeMarker(R.drawable.map_pin)));
        mMap.addMarker(mMarker.title("User Name").snippet("Description"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(dummylocation, 15));
    }

    private Bitmap resizeMarker(int ResID){
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), ResID);
        Bitmap resized = Bitmap.createScaledBitmap(bitmap, 40, 70, true);
        return resized;
    }


}
