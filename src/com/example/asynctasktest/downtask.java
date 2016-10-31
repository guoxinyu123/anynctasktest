package com.example.asynctasktest;

import android.graphics.Color;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

public class downtask extends asynctask<Integer, Integer, String> {
	private TextView tv;
	private ProgressBar pb;
	public downtask(TextView tv,ProgressBar pb){
		this.tv=tv;
		this.pb=pb;
	}
	public downtask(){
	}
	protected Sring doInBackground(integer...param){
		for(int i=0;i<=100;i++){
			publishProgress(i);
			try{
				Thread.sleep(param[0]);
			}catch (Exception e){
				e.printStackTrace();
			}
		}
		return "下载完毕";
	}
	protected void onPreExecute(){
		super.onPreExecute();
	}
	protected void onPostExecute(string result){
		tv.setText(result);
		tv.setTextColor(colors.RED);
		tv.setTextSize(20);
		pb.setVisibility(View.INVISIBLE);
		super.onPostExecute(result);
	}
	protected void onprogressUpdate(Integer...param){
		tv.setText("当前完成任务的"+param[0]+"%");
		pb.setProgress(param[0]);
		tv.setVisibility(View.VISIBLE);
		pb.setVisibility(View.VISIBLE);
		super.onProgressUpdate(param);
		
			
			}
		}
	

}
