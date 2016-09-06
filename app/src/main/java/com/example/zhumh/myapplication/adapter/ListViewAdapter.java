package com.example.zhumh.myapplication.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.example.zhumh.myapplication.R;
import com.example.zhumh.myapplication.util.ImageLoader;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhumh on 2016/9/6.
 */
public class ListViewAdapter extends BaseAdapter {
    private LayoutInflater mInflater = null;
    private ArrayList<String> mList = new ArrayList<>();
    private ImageLoader mImageLoader = null;
    public ListViewAdapter(Context context, List<String> list){
        mInflater = LayoutInflater.from(context);
        if(list != null)
            mList.addAll(list);
        mImageLoader = ImageLoader.getInstance();
    }

    @Override
    public int getCount() {
        return mList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        Viewholder viewholder = null;
        if(view == null){
            view = mInflater.inflate(R.layout.item_layout,viewGroup,false);
            viewholder = new Viewholder();
            viewholder.imageView = (ImageView) view.findViewById(R.id.image);
            view.setTag(viewholder);
        }else{
            viewholder = (Viewholder) view.getTag();
        }
        mImageLoader.display(mList.get(i),viewholder.imageView);
        return view;
    }

    class Viewholder  {
        ImageView imageView;
    }
}
