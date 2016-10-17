package com.ta.finalexam.Fragment;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.ta.finalexam.Constant.HeaderOption;
import com.ta.finalexam.R;



/**
 * Created by Veteran Commander on 10/17/2016.
 */

public class NearbyFragment extends HeaderFragment implements OnMapReadyCallback {
    private GoogleMap mMap;

    LatLng dummylocation;

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
        dummylocation = new LatLng(21.005661, 105.843172);
        MarkerOptions mMarker = new MarkerOptions().position(dummylocation);
        mMarker.icon(BitmapDescriptorFactory.fromResource(R.drawable.map_pin));
        mMap.addMarker(mMarker);
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(dummylocation, 15));
    }


}
