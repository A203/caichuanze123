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
    //�������  
    char c; 
    //С�������  
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
        //ע�ᵥ���¼�  
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
    //��Ӧ�����¼�  
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
        //���editTextΪ��  
        if(editText.getText().toString().equalsIgnoreCase("")){ 
            Toast.makeText(this, "û���������֣�", Toast.LENGTH_SHORT).show(); 
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
            //����  
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
                        Toast.makeText(this, "����������Ϊ�㣡", Toast.LENGTH_SHORT).show(); 
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
    //��дonCreateOptionsMenu()�����������˵���  
    @Override 
    public boolean onCreateOptionsMenu(Menu menu) { 
        //�����˵���������ͼ�꣬ʹ��ϵͳ�ṩ��ͼ�꣬  
        menu.add(Menu.NONE, Menu.FIRST + 1, 1, "����").setIcon(android.R.drawable.ic_dialog_info); 
        menu.add(Menu.NONE, Menu.FIRST + 2, 2, "XX").setIcon(android.R.drawable.ic_lock_idle_alarm); 
        menu.add(Menu.NONE, Menu.FIRST + 3, 2,"�˳�").setIcon(android.R.drawable.ic_lock_power_off);; 
        // ����true����ʾ�˵�  
        return true; 
    } 
    @Override 
    //��Ӧ�˵������¼���  
    public boolean onOptionsItemSelected(MenuItem item) { 
        if(item.getItemId()==Menu.FIRST + 1){ 
            //����  
            AlertDialog.Builder dialog = new AlertDialog.Builder(this);   
            dialog.setTitle("����"); 
            dialog.setMessage("���׼�����!\nBy�����ٺ�\nQQ��569629066"); 
            dialog.show(); 
        } 
        if(item.getItemId()==Menu.FIRST + 1){ 
            Toast.makeText(this, "���Ǹ�ȥ��", Toast.LENGTH_SHORT).show(); 
        } 
        if(item.getItemId()==Menu.FIRST + 3){ 
            //�˳�  
            this.finish(); 
        } 
        return true; 
    } 
}