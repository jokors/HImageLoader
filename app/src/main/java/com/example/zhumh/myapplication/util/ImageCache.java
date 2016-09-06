package com.example.zhumh.myapplication.util;

import android.graphics.Bitmap;

/**
 * Created by zhumh on 2016/8/31.
 */
public interface ImageCache {

    void put(String tag,Bitmap bitmap);
    Bitmap get(String tag);

}
