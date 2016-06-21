package com.xiaomaowu.activitys.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.xiaomaowu.R;

public class MainTab03 extends Fragment
{

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
	{
		View newsLayout = inflater.inflate(R.layout.main_tab_03, container, false);
		return newsLayout;
	}

	@Override
	public void onResume() {
		super.onResume();
		Log.i("chengsong", "MainTab03----onResume----->");
	}
}
