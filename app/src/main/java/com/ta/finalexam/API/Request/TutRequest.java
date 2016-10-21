package com.ta.finalexam.API.Request;

import com.android.volley.Request;
import com.ta.finalexam.API.Response.TutorialResponse;
import com.ta.finalexam.Constant.ConstantVar;

import java.util.HashMap;
import java.util.Map;

import vn.app.base.api.volley.core.ObjectApiRequest;
import vn.app.base.constant.APIConstant;
import vn.app.base.constant.ApiParam;


/**
 * Created by Veteran Commander on 10/21/2016.
 */

public class TutRequest extends ObjectApiRequest<TutorialResponse>{

    public static final String URLTUT = "https://polar-plains-86888.herokuapp.com/api/tutorial";

    @Override
    public boolean isRequiredAuthorization() {
        return true;
    }

    @Override
    public String getRequestURL() {
        return URLTUT;
    }

    @Override
    public boolean isRequiredAccessToken() {
        return false;
    }

    @Override
    public Map<String, String> getRequestParams() {
        return null;
    }


    @Override
    public Map<String, String> getRequestHeaders() {
        Map<String,String> newParams = new HashMap<>();
        newParams.put(ApiParam.TOKEN, ConstantVar.TOKEN_KEY);
        return newParams ;
    }

    @Override
    public Class<TutorialResponse> getResponseClass() {
        return TutorialResponse.class;
    }

    @Override
    public int getMethod() {
        return Request.Method.GET;
    }
}
