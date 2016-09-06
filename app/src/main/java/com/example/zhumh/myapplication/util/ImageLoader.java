package com.example.zhumh.myapplication.util;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by zhumh on 2016/8/31.
 */
public class ImageLoader {
    private ImageCache mImageCache = null;
    private ExecutorService mExecutorService = null;
    public static ImageLoader mInstance = null;

    public static ImageLoader getInstance(){
        if(mInstance == null){
            mInstance = new ImageLoader();
            mInstance.mImageCache = new DoubleCache();
            mInstance.mExecutorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
        }
        return mInstance;
    }


    public void display(String url, ImageView imageView){
        Bitmap bitmap = mImageCache.get(url);
        if(bitmap != null){
            imageView.setImageBitmap(bitmap);
            imageView.invalidate();
            return;
        }
        getImage(url,imageView);
    }

    /**
     * choose cache strategy :
     * only ram cache or only disk cache or both or custom
     * @param imageCache
     */
    public void setImageCache(ImageCache imageCache){
        mImageCache = imageCache;
    }

    private void getImage(final String url, final ImageView imageView){
        imageView.setTag(url);
        mExecutorService.submit(new Runnable() {
            @Override
            public void run() {
                Bitmap bitmap = downloadImage(url);
                if(bitmap == null)
                    return;
                imageView.setImageBitmap(bitmap);
                imageView.invalidate();
                mImageCache.put(url,bitmap);
            }
        });
    }

    private Bitmap downloadImage(String url){
        Bitmap bitmap = null;
        try {
            URL urlConnect = new URL(url);
            HttpURLConnection connection = (HttpURLConnection) urlConnect.openConnection();
            bitmap = BitmapFactory.decodeStream(connection.getInputStream());
            connection.disconnect();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return bitmap;
    }
}
