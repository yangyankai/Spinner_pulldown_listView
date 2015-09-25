package com.example.ykai.demo;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;


public class MainActivity extends Activity {

    private static final String[] m={
            "北京市",
            "天津市",
            "上海市",
            "重庆市",
            "河北省",
            "河南省",
            "云南省",
            "辽宁省",
            "黑龙江省",
            "湖南省",
            "安徽省",
            "山东省",
            "新疆",
            "江苏省",
            "浙江省",
            "江西省",
            "湖北省",
            "广西省",
            "甘肃省",
            "山西省",
            "内蒙古",
            "陕西省",
            "吉林省",
            "福建省",
            "贵州省",
            "广东省",
            "青海省",
            "西藏",
            "四川省",
            "宁夏回族",
            "海南省",
            "台湾省",
            "香港特别行政区",
            "澳门特别行政区",};
    private TextView view ;
    private Spinner spinner;
    private ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        view = (TextView) findViewById(R.id.spinnerText);
        spinner = (Spinner) findViewById(R.id.Spinner01);
        //将可选内容与ArrayAdapter连接起来
        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,m);

        //设置下拉列表的风格
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        //将adapter 添加到spinner中
        spinner.setAdapter(adapter);

        //添加事件Spinner事件监听
        spinner.setOnItemSelectedListener(new SpinnerSelectedListener());

        //设置默认值
        spinner.setVisibility(View.VISIBLE);

    }

    //使用数组形式操作
    class SpinnerSelectedListener implements OnItemSelectedListener{

        public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2,
                                   long arg3) {
            view.setText("你的血型是："+m[arg2]);
        }

        public void onNothingSelected(AdapterView<?> arg0) {
        }
    }
}
