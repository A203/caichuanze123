package com.geminno.app.buttonapp;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.Switch;
import android.widget.Toast;
import java.util.HashSet;
import java.util.Set;


public class MainActivity extends ActionBarActivity {
    private RadioGroup group;
    private CheckBox box1,box2,box3;
    private Switch  s1;
    private Set<String> hobby =new HashSet<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        s1= (Switch)findViewById(R.id.s1);
        s1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    Toast.makeText(MainActivity.this,"您选择了开",Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this,"您选择了关",Toast.LENGTH_SHORT).show();
                }
            }
        });


        box1=(CheckBox)findViewById(R.id.basketball);
        box1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
           @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    hobby.add("篮球");
                } else {
                    if (hobby.contains("篮球"))
                        hobby.remove("篮球");
                }
                Toast.makeText(MainActivity.this, "您选择了：" + hobby.toString(), Toast.LENGTH_SHORT).show();
            }
        });
        box2=(CheckBox)findViewById(R.id.soccerball);
        box2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    hobby.add("足球");
                }else{
                    if(hobby.contains("足球"))
                        hobby.remove("足球");
                }
                Toast.makeText(MainActivity.this,"您选择了："+hobby.toString(),Toast.LENGTH_SHORT).show();
            }
        });
        box3=(CheckBox)findViewById(R.id.music);
        box3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    hobby.add("音乐");
                }else{
                    if(hobby.contains("音乐"))
                        hobby.remove("音乐");
                }
                Toast.makeText(MainActivity.this,"您选择了："+hobby.toString(),Toast.LENGTH_SHORT).show();
            }
        });




        group=(RadioGroup)findViewById(R.id.gender);
        group.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                //i是单选按钮的ID号
                if(i==R.id.male){
                    Toast.makeText(MainActivity.this,"您选择了男性",Toast.LENGTH_SHORT).show();
                }
                else if (i==R.id.female){
                    Toast.makeText(MainActivity.this,"您选择了女性",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
