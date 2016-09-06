package com.example.zhumh.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ListView;

import com.example.zhumh.myapplication.adapter.ListViewAdapter;
import com.example.zhumh.myapplication.adapter.MyAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView = null;
    private MyAdapter mAdapter = null;
    private ArrayList<String> mList = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findView();
        initDate();
    }

    private void findView(){
        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);
    }

    private void initDate(){
        mList.add("http://image.fvideo.cn/www/uploadfilen/2009/06/08/10/img402065085.jpg");
        mList.add("http://news.xinhuanet.com/overseas/2009-09/18/xinsrc_402090618124137511263.jpg");
        mList.add("http://imgs.soufun.com/news/2009_12/31/news/1262239152944_000.jpg");
        mList.add("http://img0.imgtn.bdimg.com/it/u=1752502898,988772722&fm=21&gp=0.jpg");
        mList.add("http://img1.imgtn.bdimg.com/it/u=458865163,2719722960&fm=21&gp=0.jpg");
        mList.add("http://img1.imgtn.bdimg.com/it/u=458865163,2719722960&fm=21&gp=0.jpg");
        mList.add("http://img1.imgtn.bdimg.com/it/u=458865163,2719722960&fm=21&gp=0.jpg");
        mList.add("http://img1.imgtn.bdimg.com/it/u=458865163,2719722960&fm=21&gp=0.jpg");
        mList.add("http://img1.imgtn.bdimg.com/it/u=458865163,2719722960&fm=21&gp=0.jpg");
        mList.add("http://img1.imgtn.bdimg.com/it/u=458865163,2719722960&fm=21&gp=0.jpg");
        mList.add("http://news.xinhuanet.com/overseas/2009-09/18/xinsrc_402090618124137511263.jpg");
        mList.add("http://news.xinhuanet.com/overseas/2009-09/18/xinsrc_402090618124137511263.jpg");
        mList.add("http://news.xinhuanet.com/overseas/2009-09/18/xinsrc_402090618124137511263.jpg");
        mList.add("http://news.xinhuanet.com/overseas/2009-09/18/xinsrc_402090618124137511263.jpg");
        mList.add("http://news.xinhuanet.com/overseas/2009-09/18/xinsrc_402090618124137511263.jpg");
        mList.add("http://news.xinhuanet.com/overseas/2009-09/18/xinsrc_402090618124137511263.jpg");
        mList.add("http://news.xinhuanet.com/overseas/2009-09/18/xinsrc_402090618124137511263.jpg");
        mList.add("http://news.xinhuanet.com/overseas/2009-09/18/xinsrc_402090618124137511263.jpg");
        mList.add("http://news.xinhuanet.com/overseas/2009-09/18/xinsrc_402090618124137511263.jpg");
        mList.add("http://news.xinhuanet.com/overseas/2009-09/18/xinsrc_402090618124137511263.jpg");
        mList.add("http://news.xinhuanet.com/overseas/2009-09/18/xinsrc_402090618124137511263.jpg");
        mList.add("http://news.xinhuanet.com/overseas/2009-09/18/xinsrc_402090618124137511263.jpg");
        mList.add("http://news.xinhuanet.com/overseas/2009-09/18/xinsrc_402090618124137511263.jpg");
        mList.add("http://news.xinhuanet.com/overseas/2009-09/18/xinsrc_402090618124137511263.jpg");
        mList.add("http://news.xinhuanet.com/overseas/2009-09/18/xinsrc_402090618124137511263.jpg");
        mList.add("http://news.xinhuanet.com/overseas/2009-09/18/xinsrc_402090618124137511263.jpg");
        mList.add("http://news.xinhuanet.com/overseas/2009-09/18/xinsrc_402090618124137511263.jpg");
        mList.add("http://news.xinhuanet.com/overseas/2009-09/18/xinsrc_402090618124137511263.jpg");
        mList.add("http://news.xinhuanet.com/overseas/2009-09/18/xinsrc_402090618124137511263.jpg");
        mList.add("http://news.xinhuanet.com/overseas/2009-09/18/xinsrc_402090618124137511263.jpg");
        mList.add("http://news.xinhuanet.com/overseas/2009-09/18/xinsrc_402090618124137511263.jpg");
        mList.add("http://news.xinhuanet.com/overseas/2009-09/18/xinsrc_402090618124137511263.jpg");
        mList.add("http://news.xinhuanet.com/overseas/2009-09/18/xinsrc_402090618124137511263.jpg");
        mList.add("http://news.xinhuanet.com/overseas/2009-09/18/xinsrc_402090618124137511263.jpg");
        mList.add("http://news.xinhuanet.com/overseas/2009-09/18/xinsrc_402090618124137511263.jpg");
        mList.add("http://news.xinhuanet.com/overseas/2009-09/18/xinsrc_402090618124137511263.jpg");
        mList.add("http://news.xinhuanet.com/overseas/2009-09/18/xinsrc_402090618124137511263.jpg");
        mList.add("http://news.xinhuanet.com/overseas/2009-09/18/xinsrc_402090618124137511263.jpg");
        mList.add("http://news.xinhuanet.com/overseas/2009-09/18/xinsrc_402090618124137511263.jpg");
        mList.add("http://news.xinhuanet.com/overseas/2009-09/18/xinsrc_402090618124137511263.jpg");
        mList.add("http://news.xinhuanet.com/overseas/2009-09/18/xinsrc_402090618124137511263.jpg");
        mList.add("http://news.xinhuanet.com/overseas/2009-09/18/xinsrc_402090618124137511263.jpg");
        mList.add("http://news.xinhuanet.com/overseas/2009-09/18/xinsrc_402090618124137511263.jpg");
        mList.add("http://news.xinhuanet.com/overseas/2009-09/18/xinsrc_402090618124137511263.jpg");
        mList.add("http://news.xinhuanet.com/overseas/2009-09/18/xinsrc_402090618124137511263.jpg");

        mAdapter = new MyAdapter(this,mList);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.setAdapter(mAdapter);

    }
}
