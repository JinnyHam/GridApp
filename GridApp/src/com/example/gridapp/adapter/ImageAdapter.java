package com.example.gridapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.gridapp.R;
import com.example.gridapp.model.User;

import java.util.ArrayList;

public class ImageAdapter extends BaseAdapter {
	private Context mContext;
	private ArrayList<User> mUserList;
	private LayoutInflater inflater;

	public ImageAdapter(Context c){
		mContext = c;
		inflater = (LayoutInflater)mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	}

	public ImageAdapter(Context c, ArrayList<User> user){
		mContext = c;
		mUserList = user;
		inflater = (LayoutInflater)mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	}

	@Override
	public int getCount() {
		return mUserList.size();
	}

	@Override
	public Object getItem(int position) {
		return mUserList.get(position);
	}

	@Override
	public long getItemId(int position) {
		return 0;
	}

	public void setList(ArrayList<User> user) {
		mUserList = user;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {			
		ViewHolder holder;
		if(convertView==null) {
			convertView = inflater.inflate(R.layout.icon, null);
			holder = new ViewHolder();

			holder.icontext = (TextView)convertView.findViewById(R.id.icon_text); 
			holder.imageView = (ImageView)convertView.findViewById(R.id.icon_image);
			LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(100, 100);
			holder.imageView.setLayoutParams(layoutParams);

			convertView.setTag(holder);
		}
		else {
			holder = (ViewHolder) convertView.getTag();
		}
		holder.icontext.setText(mUserList.get(position).getRingtoneName());
		holder.imageView .setBackgroundResource(mUserList.get(position).getRingtoneResId());
		return convertView;

	}

	static class ViewHolder {
		TextView icontext;
		ImageView imageView;
	}
}
