package com.example.test.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.test.R;
import com.example.test.ui.OrderProgressView;

import java.util.List;

/**
 * @author kdy
 * create at $ $
 * @Params :$
 */
public class AnimalOrderAdapter extends RecyclerView.Adapter<AnimalOrderAdapter.MyAnimalOrderHolder>  {
    private Context mContext;
    private List<String> mList;

    public AnimalOrderAdapter(Context context, List<String> list) {
        mContext = context;
        mList = list;
    }


    @NonNull
    @Override
    public MyAnimalOrderHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_order_animal, parent, false);
        return new MyAnimalOrderHolder(view);
    }

    @Override
    public void onBindViewHolder(MyAnimalOrderHolder holder, int position) {
        holder.setData((String) mList.get(position));
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }



    class MyAnimalOrderHolder extends RecyclerView.ViewHolder {
        private TextView tv_order_animal_name;
        private TextView tv_order_time;
        private TextView tv_animal_desc;
        private OrderProgressView order_spv;

        public MyAnimalOrderHolder(View itemView) {
            super(itemView);
            tv_order_animal_name = (TextView) itemView.findViewById(R.id.tv_order_animal_name);
            tv_order_time = (TextView) itemView.findViewById(R.id.tv_order_time);
            tv_animal_desc = (TextView) itemView.findViewById(R.id.tv_animal_desc);
            order_spv = (OrderProgressView) itemView.findViewById(R.id.order_spv);
        }


        public void setData(String str ) {
            tv_order_animal_name.setText(str);
            order_spv.setTotalAndCurrentCount(100,(int)(Math.random()*100));


        }


    }


}
