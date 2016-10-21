package com.ta.finalexam.API.Response;
import com.google.gson.annotations.Expose;
import com.ta.finalexam.Bean.DataTut;
import com.google.gson.annotations.SerializedName;
import vn.app.base.api.response.BaseResponse;

/**
 * Created by Veteran Commander on 10/21/2016.
 */

public class TutorialResponse extends BaseResponse {

    @SerializedName("data")
    @Expose
    public DataTut data;

}
