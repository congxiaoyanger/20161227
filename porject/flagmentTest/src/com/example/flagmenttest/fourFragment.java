package com.example.flagmenttest;

import android.app.Fragment;
import android.app.ListFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class fourFragment extends Fragment {
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		
		return inflater.inflate(R.layout.four_avtivity, container, false);
	}
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
//        adapter = new ArrayAdapter(this,R.layout.view,R.id.textview1,list1); 
//		
	}
	
//
//	private List<Map<String, Object>> getData() {
//		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
//
//		Map<String, Object> map = new HashMap<String, Object>();
//		map.put("title", "G1");
//		map.put("info", "google 1");
//		map.put("img", "111");
//		list.add(map);
//
//		map = new HashMap<String, Object>();
//		map.put("title", "G2");
//		map.put("info", "google 2");
//		map.put("img", "222");
//		list.add(map);
//
//		map = new HashMap<String, Object>();
//		map.put("title", "G3");
//		map.put("info", "google 3");
//		map.put("img", "333");
//		list.add(map);
//		
//		return list;
//	}
}
