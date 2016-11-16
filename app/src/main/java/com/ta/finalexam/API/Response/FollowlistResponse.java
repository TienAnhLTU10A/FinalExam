package com.ta.finalexam.API.Response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.ta.finalexam.Bean.Member;

import java.util.ArrayList;
import java.util.List;

import vn.app.base.api.response.BaseResponse;

/**
 * Created by Veteran Commander on 11/16/2016.
 */

public class FollowlistResponse extends BaseResponse {
    @SerializedName("data")
    @Expose
    public List<Member> data = new ArrayList<Member>();
}
