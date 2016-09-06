package com.example.zhumh.myapplication.util;

import android.graphics.Bitmap;
import android.util.LruCache;

/**
 * Created by zhumh on 2016/8/31.
 * put/get bitmap cache from ram
 */
public class MemoryCache implements ImageCache {

    private LruCache<String,Bitmap> mMemoryCache = null;

    public MemoryCache() {
        int max = (int) Runtime.getRuntime().maxMemory();
        int cacheSize = max / 8;
        mMemoryCache = new LruCache<String,Bitmap>(cacheSize){
            @Override
            protected int sizeOf(String key, Bitmap value) {
                return value.getRowBytes() * value.getHeight();
            }
        };
    }

    @Override
    public void put(String tag, Bitmap bitmap) {
        mMemoryCache.put(tag,bitmap);
    }

    @Override
    public Bitmap get(String tag) {
        return  mMemoryCache.get(tag);
    }
}
