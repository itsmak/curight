package com.innovellent.curight.adapter;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.innovellent.curight.R;
import com.innovellent.curight.model.Bicycling;



import java.util.ArrayList;

/**
 * Created by sagar on 9/8/2017.
 */

public class BicyclingAdapter extends RecyclerView.Adapter<BicyclingAdapter.MyViewHolder> {

    private ArrayList<Bicycling> arrayList = new ArrayList<>();
    private Context mContext;
    private String state;
    private int rowlayout;

    class MyViewHolder extends RecyclerView.ViewHolder {

        TextView tvTestName,tvHour,tvDistance;
        LinearLayout llLayout;

        MyViewHolder(View view) {
            super(view);
            tvTestName = (TextView) view.findViewById(R.id.tvTestName);
            tvHour = (TextView) view.findViewById(R.id.tvHour);
            tvDistance=(TextView) view.findViewById(R.id.tvDistance);
            llLayout=(LinearLayout)view.findViewById(R.id.llLayout);

        }
    }

    public BicyclingAdapter(Context context,int rowlayout,ArrayList<Bicycling> arrayList) {
        mContext = context;
        this.arrayList = arrayList;
        this.rowlayout=rowlayout;

    }

    @Override
    public BicyclingAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent,
                                                           int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(rowlayout, parent, false);
        return new BicyclingAdapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final BicyclingAdapter.MyViewHolder holder, final int position) {

        holder.tvTestName.setText(arrayList.get(position).getName());
        holder.tvHour.setText(arrayList.get(position).getHour());
        holder.tvDistance.setText(arrayList.get(position).getDistance());
        if((position%2)==0){
       }else{
            holder.llLayout.setBackgroundColor(ContextCompat.getColor(mContext, R.color.gray));

        }
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }
}

