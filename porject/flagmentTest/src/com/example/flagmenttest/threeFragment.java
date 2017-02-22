package com.example.flagmenttest;

import java.util.ArrayList;

import android.app.ListFragment;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;


public class threeFragment extends ListFragment {
//	@Override
//	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
//		
//		return inflater.inflate(R.layout.three_activity, container, false);
//	}
    private ArrayList<String> mChannels;

    public threeFragment() {
        mChannels = new ArrayList<String>();
        for (int i = 0; i < 100; i++) {
            mChannels.add("List - " + i);
        }
    }
          
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ArrayAdapter<String> adapter = new ChannelAdapter(mChannels);
        setListAdapter(adapter);
    }
        
    public void onListItemClick(ListView l, View v, int position, long id) {
        String channel = (String) getListAdapter().getItem(position);
        Log.d("", channel + "?½?½?½N?½?½?½b?½N?½?½?½?½Ü‚ï¿½?½?½?½B");
        
        ImageView iv_play = (ImageView) v.findViewById(R.id.iv_play);
        ImageView iv_download = (ImageView) v.findViewById(R.id.iv_download);
        ProgressBar processBar = (ProgressBar) v.findViewById(R.id.progressBar);

        
        if (iv_play.getVisibility() != View.GONE) {
            iv_play.setVisibility(View.GONE);
            iv_download.setVisibility(View.GONE);
            processBar.setVisibility(View.GONE);
        } else {
            iv_play.setVisibility(View.VISIBLE);
            iv_download.setVisibility(View.VISIBLE);
            processBar.setVisibility(View.VISIBLE);
        }
    }    

    private class ChannelAdapter extends ArrayAdapter<String> {
        public ChannelAdapter(ArrayList<String> channels) {
            super(getActivity(), 0, channels);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
        	
            if (convertView == null) {
                convertView = getActivity().getLayoutInflater().inflate(R.layout.three_activity, null);
                
            }
            TextView channel_title = (TextView) convertView.findViewById(R.id.channel_title);
            channel_title.setText(mChannels.get(position));
            return convertView;
        }
    }
}
