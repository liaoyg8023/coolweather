package com.example.shyuan.coolweather.util;

/**
 * Created by shyuan on 2015/8/2.
 */
public interface HttpCallbackListener {
    void onFinish(String response);
    void onError(Exception e);
}
