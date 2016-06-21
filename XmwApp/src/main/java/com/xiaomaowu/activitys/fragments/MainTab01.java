package com.xiaomaowu.activitys.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.xiaomaowu.R;

public class MainTab01 extends Fragment
{

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
	{
		return  inflater.inflate(R.layout.main_tab_01, container, false);
	
	}
	
	@Override
	public void onResume() {
		super.onResume();
		Log.i("chengsong", "MainTab01----onResume----->");
	}

}
