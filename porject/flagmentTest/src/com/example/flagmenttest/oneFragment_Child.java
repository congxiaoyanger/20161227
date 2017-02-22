package com.example.flagmenttest;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.app.Fragment;
import android.app.ListFragment;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SeekBar;
import android.widget.TextView;


public class oneFragment_Child extends ListFragment {

	/*@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		
		return inflater.inflate(R.layout.one_activity, container, false);
	}*/
	
	private ArrayList<String> oneChildList = null;
	public oneFragment_Child() {
		Log.i("oneFragment_Child", "oneFragment_Child");
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		Log.i("oneFragment_Child", "onCreate");

		oneChildList = new ArrayList<String>();

		for(int i = 0; i < 50; i++){
			oneChildList.add("congxin" + i);
		}
		
		UserAdapter  userAdaper = new UserAdapter(oneChildList);
		setListAdapter(userAdaper);
	}
	
	
	public void onListItemClick(ListView l, View v, int position, long id) {
		
        ImageView iv_play = (ImageView) v.findViewById(R.id.iv_play_child);
        ImageView iv_download = (ImageView) v.findViewById(R.id.iv_download_child);
        
        if (iv_play.getVisibility() != View.GONE){
        	iv_play.setVisibility(View.GONE);
            iv_download.setVisibility(View.GONE);
        } else {
        	iv_play.setVisibility(View.VISIBLE);
            iv_download.setVisibility(View.VISIBLE);
		
        }
	}

	class UserAdapter  extends ArrayAdapter<String> {

		public UserAdapter(ArrayList<String> objects) {
			super(getActivity(), 0, objects);
		}
		
		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			if (convertView == null) {
				convertView = getActivity().getLayoutInflater().inflate(R.layout.onechild_avtivity, null);
			}
			TextView onechild = (TextView) convertView.findViewById(R.id.onechild_TextView);
			onechild.setText("oneFragment Child......");
			
			return convertView;
		}
		
	}
}
