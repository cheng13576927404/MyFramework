package com.xiaomaowu.activitys.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.xiaomaowu.R;

public class MainTab02 extends Fragment
{

	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
	{
		View messageLayout = inflater.inflate(R.layout.main_tab_02, container, false);
		return messageLayout;
	}
	
	@Override
	public void onResume() {
		super.onResume();
		Log.i("chengsong", "MainTab02----onResume----->");
	}

}
