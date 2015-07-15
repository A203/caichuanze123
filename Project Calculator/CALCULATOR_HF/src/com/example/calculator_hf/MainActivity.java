package com.example.calculator_hf;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener{ 
    EditText editText; 
    Button num0,num1,num2,num3,num4,num5,num6,num7,num8,num9; 
    Button clear,add,subtract,multiply,divide,point,negative,equal; 
    double firNum=0,secNum=0; 
    //运算符号  
    char c; 
    //小数点控制  
    boolean dot=true; 
     
    /** Called when the activity is first created. */ 
    @Override 
    public void onCreate(Bundle savedInstanceState) { 
        super.onCreate(savedInstanceState); 
        setContentView(R.layout.activity_main); 
        init(); 
    } 
    private void init(){ 
        num0=(Button)findViewById(R.id.num0); 
        num1=(Button)findViewById(R.id.num1); 
        num2=(Button)findViewById(R.id.num2); 
        num3=(Button)findViewById(R.id.num3); 
        num4=(Button)findViewById(R.id.num4); 
        num5=(Button)findViewById(R.id.num5); 
        num6=(Button)findViewById(R.id.num6); 
        num7=(Button)findViewById(R.id.num7); 
        num8=(Button)findViewById(R.id.num8); 
        num9=(Button)findViewById(R.id.num9); 
        clear=(Button)findViewById(R.id.clear); 
        editText=(EditText)findViewById(R.id.editText); 
        add =(Button) findViewById(R.id.add); 
        subtract =(Button) findViewById(R.id.subtract); 
        multiply =(Button) findViewById(R.id.multiply); 
        divide =(Button) findViewById(R.id.divide); 
        point=(Button)findViewById(R.id.point); 
        negative =(Button) findViewById(R.id.negative); 
        equal =(Button) findViewById(R.id.equal); 
        //注册单击事件  
        num0.setOnClickListener(this); 
        num1.setOnClickListener(this); 
        num2.setOnClickListener(this); 
        num3.setOnClickListener(this); 
        num4.setOnClickListener(this); 
        num5.setOnClickListener(this); 
        num6.setOnClickListener(this); 
        num7.setOnClickListener(this); 
        num8.setOnClickListener(this); 
        num9.setOnClickListener(this); 
        add.setOnClickListener(this); 
        clear.setOnClickListener(this); 
        subtract.setOnClickListener(this); 
        multiply.setOnClickListener(this); 
        divide.setOnClickListener(this); 
        point.setOnClickListener(this); 
        negative.setOnClickListener(this); 
        equal.setOnClickListener(this); 
    } 
    //响应单击事件  
    public void onClick(View v) { 
        if(v.equals(num0)){ 
            editText.setText(editText.getText()+"0"); 
        } 
        if(v.equals(num1)){ 
            editText.setText(editText.getText()+"1"); 
        } 
        if(v.equals(num2)){ 
            editText.setText(editText.getText()+"2"); 
        } 
        if(v.equals(num3)){ 
            editText.setText(editText.getText()+"3"); 
        } 
        if(v.equals(num4)){ 
            editText.setText(editText.getText()+"4"); 
        } 
        if(v.equals(num5)){ 
            editText.setText(editText.getText()+"5"); 
        } 
        if(v.equals(num6)){ 
            editText.setText(editText.getText()+"6"); 
        } 
        if(v.equals(num7)){ 
            editText.setText(editText.getText()+"7"); 
        } 
        if(v.equals(num8)){ 
            editText.setText(editText.getText()+"8"); 
        } 
        if(v.equals(num9)){ 
            editText.setText(editText.getText()+"9"); 
        } 
        if(v.equals(clear)){ 
            editText.setText(""); 
        } 
        //如果editText为空  
        if(editText.getText().toString().equalsIgnoreCase("")){ 
            Toast.makeText(this, "没有输入数字！", Toast.LENGTH_SHORT).show(); 
        }else   { 
            if(v.equals(add)){ 
                c='+'; 
                firNum=Double.parseDouble(editText.getText().toString()); 
                editText.setText(""); 
            } 
            if(v.equals(subtract)){ 
                c='-'; 
                firNum=Double.parseDouble(editText.getText().toString()); 
                editText.setText(""); 
            } 
            if(v.equals(multiply)){ 
                c='*'; 
                firNum=Double.parseDouble(editText.getText().toString()); 
                editText.setText(""); 
            } 
            if(v.equals(divide)){ 
                c='/'; 
                firNum=Double.parseDouble(editText.getText().toString()); 
                editText.setText(""); 
            } 
            if(v.equals(point)){ 
                dot=false; 
                editText.setText(editText.getText()+"."); 
            } 
            //等于  
            if(v.equals(equal)){ 
                double result=0; 
                secNum=Double.parseDouble(editText.getText().toString()); 
                if(c=='+'){ 
                    result=firNum+secNum; 
                } 
                if(c=='-'){ 
                    result=firNum-secNum; 
                } 
                if(c=='*'){ 
                    result=firNum*secNum; 
                } 
                if(c=='/'){ 
                    if(secNum==0){ 
                        Toast.makeText(this, "被除数不能为零！", Toast.LENGTH_SHORT).show(); 
                        editText.setText(""); 
                    }else{ 
                        result=firNum/secNum; 
                    } 
                } 
                editText.setText(result+""); 
            } 
        } 
        if(v.equals(negative)){ 
            editText.setText(editText.getText()+"-"); 
        } 
    } 
    //重写onCreateOptionsMenu()方法，创建菜单，  
    @Override 
    public boolean onCreateOptionsMenu(Menu menu) { 
        //创建菜单，并设置图标，使用系统提供的图标，  
        menu.add(Menu.NONE, Menu.FIRST + 1, 1, "关于").setIcon(android.R.drawable.ic_dialog_info); 
        menu.add(Menu.NONE, Menu.FIRST + 2, 2, "XX").setIcon(android.R.drawable.ic_lock_idle_alarm); 
        menu.add(Menu.NONE, Menu.FIRST + 3, 2,"退出").setIcon(android.R.drawable.ic_lock_power_off);; 
        // 返回true即显示菜单  
        return true; 
    } 
    @Override 
    //响应菜单单击事件，  
    public boolean onOptionsItemSelected(MenuItem item) { 
        if(item.getItemId()==Menu.FIRST + 1){ 
            //关于  
            AlertDialog.Builder dialog = new AlertDialog.Builder(this);   
            dialog.setTitle("关于"); 
            dialog.setMessage("简易计算器!\nBy：柒少狐\nQQ：569629066"); 
            dialog.show(); 
        } 
        if(item.getItemId()==Menu.FIRST + 1){ 
            Toast.makeText(this, "我那个去，", Toast.LENGTH_SHORT).show(); 
        } 
        if(item.getItemId()==Menu.FIRST + 3){ 
            //退出  
            this.finish(); 
        } 
        return true; 
    } 
}