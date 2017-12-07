package com.innovellent.curight.adapter;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.TextView;


import com.innovellent.curight.R;

import java.util.ArrayList;




public class MedicineListAdapter  extends RecyclerView.Adapter<MedicineListAdapter.MyViewHolder> {

    private ArrayList<String> arrayList = new ArrayList<>();
    private Context mContext;
    private String state;
    RadioButton selected=null;
    class MyViewHolder extends RecyclerView.ViewHolder {

        TextView tvMedicineName;
        RadioButton cbDiagnosticTest;

        MyViewHolder(View view) {
            super(view);
            tvMedicineName = (TextView) view.findViewById(R.id.tvMedicineName);
            cbDiagnosticTest=(RadioButton)view.findViewById(R.id.cbDiagnosticTest);



        }
    }

    public MedicineListAdapter(Context context,ArrayList<String> arrayList) {
        mContext = context;
        this.arrayList = arrayList;

    }

    @Override
    public MedicineListAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_row_medicine, parent, false);
        return new MedicineListAdapter.MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final MedicineListAdapter.MyViewHolder holder, final int position) {

        holder.tvMedicineName.setText(arrayList.get(position).toString());

        holder.cbDiagnosticTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences sharedPreferences = mContext.getSharedPreferences("mypref", Context.MODE_PRIVATE);
                SharedPreferences.Editor et = sharedPreferences.edit();
                et.putString("medicinename",arrayList.get(position).toString());
                et.commit();
                if(selected != null)
                {
                    selected.setChecked(false);
                }

                holder.cbDiagnosticTest.setChecked(true);
                selected = holder.cbDiagnosticTest;
            }
        });



    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }
}

