package com.example.zhumh.myapplication.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.zhumh.myapplication.R;
import com.example.zhumh.myapplication.util.ImageLoader;

import java.util.ArrayList;

/**
 * Created by zhumh on 2016/9/4.
 */
public class MyAdapter extends RecyclerView.Adapter {

    private LayoutInflater mInflater = null;
    private ArrayList<String> mData = new ArrayList<>();
    private ImageLoader mImageLoader = null;
    public MyAdapter(Context context,ArrayList<String> list){
        mInflater = LayoutInflater.from(context);
        if(list != null)
            mData.addAll(list);
        mImageLoader = ImageLoader.getInstance();
    }
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.item_layout,parent,false);
        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        mImageLoader.display(mData.get(position),((MyViewHolder)holder).imageView);
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{
        public ImageView imageView = null;

        public MyViewHolder(View itemView) {
            super(itemView);
            imageView = (ImageView) itemView.findViewById(R.id.image);
        }
    }
}
