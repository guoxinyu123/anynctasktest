package com.example.asynctasktest;

import iet.jxufe.cn.android.R;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.Button;
import android.widget.ProgressBar;

public class MainActivity extends Activity {

	private Button myBtn=null;
	private TxetView myText=null;
	private ProgressBar myBar=null;
	public void onCreat(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		myBtn=(Button)findViewById(R.id.myBtn);
		myText=(TextView)findViewById(R.id.myText);
		myBar=(ProgressBar)findViewById(R.id.myBar);
		myBtn.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				downtask downtask=new downtask(myText,myBar);
				donwtask.excute(100);
			}
		});
	}
}
			