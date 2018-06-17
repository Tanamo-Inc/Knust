package com.tanamo.knust.adaptor;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.tanamo.knust.R;
import com.tanamo.knust.model.Mod;

import java.util.ArrayList;


public class Fragment_Adapter extends RecyclerView.Adapter<Fragment_Adapter.MyViewHolder> {

    private ArrayList<Mod> myList;
    private Context context;

    public Fragment_Adapter(Context context, ArrayList<Mod> myList) {
        this.context = context;
        this.myList = myList;
    }


    @Override
    public int getItemCount() {
        return myList.size();
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.main_fragment_item, parent, false);
        return new MyViewHolder(itemView);
    }

    public void onBindViewHolder(@NonNull MyViewHolder holder, int pos) {

        final String title = myList.get(pos).getMyTitle();

        ArrayList lis = myList.get(pos).getMyContents();

        holder.title.setText(title);

        Detail_Adapter adapt = new Detail_Adapter(context, lis);

        holder.recycler.setAdapter(adapt);
        holder.recycler.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false));


    }


    class MyViewHolder extends RecyclerView.ViewHolder {
        TextView title;
        RecyclerView recycler;

        MyViewHolder(View view) {
            super(view);
            title = view.findViewById(R.id.title);
            recycler = view.findViewById(R.id.recycler);
        }
    }


}



