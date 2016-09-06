package com.example.zhumh.myapplication.util;

import android.graphics.Bitmap;

/**
 * Created by zhumh on 2016/8/31.
 */
public class DoubleCache implements ImageCache{
    private MemoryCache mMemoryCache = null;
    private DiskCache mDiskCache = null;

    public DoubleCache(){
        mMemoryCache = new MemoryCache();
        mDiskCache = new DiskCache();
    }


    @Override
    public void put(String tag, Bitmap bitmap) {
        mMemoryCache.put(tag,bitmap);
//        mDiskCache.put(tag,bitmap);
    }

    @Override
    public Bitmap get(String tag) {
        Bitmap bitmap = mMemoryCache.get(tag);
        if(bitmap == null)
            bitmap = mDiskCache.get(tag);
        return bitmap;
    }
}
