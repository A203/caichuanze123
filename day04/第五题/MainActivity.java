package com.aihua.d04homework5;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {
    RadioGroup button01;
    TextView show;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //获取界面上button01,show两个组件对象
        abstract class onCheckedChangeListener implements OnCheckedChangeListener {
        }
        button01 = (RadioGroup) findViewById(R.id.button01);
        show = (TextView) findViewById(R.id.show);
        //为RadioGroup组件的OnCheck事件绑定事件监听器
        button01.setOnCheckedChangeListener(new onCheckedChangeListener(){
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // TODO Auto-generated method stub
                //根据用户勾选的单选按钮来动态改变tip字符串的值
                String tip = checkedId == R.id.boy ? "男" : "女";
                //修改 show 组件中的文本
                show.setText(tip);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }


}
