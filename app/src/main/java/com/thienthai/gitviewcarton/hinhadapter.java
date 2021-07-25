package com.thienthai.gitviewcarton;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class hinhadapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<Carton> cartonList;


    public hinhadapter(Context context, int layout, List<Carton> cartonList) {
        this.context = context;
        this.layout = layout;
        this.cartonList = cartonList;
    }

    @Override
    public int getCount() {
        return cartonList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }
    private class viewHolder{
        ImageView img;
        TextView txt;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        viewHolder holder;
        if(convertView == null){
            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(layout, null);

            holder = new viewHolder();
            holder.txt = (TextView) convertView.findViewById(R.id.textView);
            holder.img = (ImageView) convertView.findViewById(R.id.imageView);
            convertView.setTag(holder);

        }else {
            holder = (viewHolder) convertView.getTag();
        }
        Carton carton= cartonList.get(position);
        holder.txt.setText(carton.getTen());
        holder.img.setImageResource(carton.getHinh());

        return convertView;
    }
}
