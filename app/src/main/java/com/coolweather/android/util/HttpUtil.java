package com.coolweather.android.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

public class HttpUtil {
    public static void sendOkHttpRequest(String address, okhttp3.Callback callback){
        //创建一个OkHttpClient的实例
        OkHttpClient client = new OkHttpClient();
        //创建一个Request对象，发起一条HTTP请求，通过url()方法来设置目标的网络地址
        Request request = new Request.Builder().url(address).build();
        //调用OkHttpClient的newCall()方法来创建一个Call对象，
        // 并调用它的enqueue()方法将call加入调度队列，然后等待任务执行完成
        client.newCall(request).enqueue(callback);
    }
}
