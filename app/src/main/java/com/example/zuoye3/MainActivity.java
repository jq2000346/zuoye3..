package com.example.zuoye3;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {
	TextView textView;  //声明对象



	public void onCreate(Bundle savedInstanceState) { //重写onCreate方法
		super.onCreate(savedInstanceState);      //调用父类Activity的onCreate()方法
		setContentView(R.layout.activity_main);  //在屏幕上显示内容的方法
		textView = (TextView) findViewById(R.id.textview2);   //与布局文件的相关组建关联
		textView.setOnClickListener(new click());     //注册监听接口


	}

	class click implements View.OnClickListener {   //定义一个类实现监听的接口
		public void onClick(View v) {
			Intent intent = new Intent(MainActivity.this, cat.class);
			//创建好之后就可以通过它启动新的Activity
			startActivity(intent);
		}
	}

}