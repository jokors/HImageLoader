package com.example.zhumh.myapplication.util;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Environment;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by zhumh on 2016/8/31.
 * put/get bitmap cache from disk
 */
public class DiskCache implements ImageCache {
    private String cachePath = Environment.getExternalStorageDirectory().getPath() + "/cache/";

    @Override
    public void put(String tag, Bitmap bitmap) {
        FileOutputStream fileOutputStream = null;
        try {
            File cache = new File(cachePath);
            if (!cache.exists( )|| !cache.isDirectory())
                cache.mkdirs();
            File file = new File(cache.getAbsolutePath(), "11.jpg");
            if (!file.exists()) {
                file.createNewFile();
            }
            fileOutputStream =  new FileOutputStream(file);
            bitmap.compress(Bitmap.CompressFormat.PNG,100,fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fileOutputStream != null){
                try {
                    fileOutputStream.flush();
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Override
    public Bitmap get(String tag) {
        File file = new File(cachePath + tag);
        if(file.exists())
            return BitmapFactory.decodeFile(cachePath + tag);
        else
            return null;
    }

    /**
     * change path
     */
    public void setCachePath(String savePath){
        cachePath = savePath;
    }
}
