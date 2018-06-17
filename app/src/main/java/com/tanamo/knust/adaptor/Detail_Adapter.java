package com.tanamo.knust.adaptor;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.tanamo.knust.R;
import com.tanamo.knust.model.Details;
import com.tanamo.knust.ui.Detail_Activity;

import java.util.ArrayList;


public class Detail_Adapter extends RecyclerView.Adapter<Detail_Adapter.ViewHolder> {
    private ArrayList<Details> myList;
    private Context ctx;

    Detail_Adapter(Context ctx, ArrayList<Details> myList) {
        this.myList = myList;
        this.ctx = ctx;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.detail_item, null, false);
        return new ViewHolder(v);
    }

    @Override
    public int getItemCount() {
        return myList.size();

    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, int pos) {
        Details deta = myList.get(pos);

        holder.textView.setText(deta.getName());


    }

    class ViewHolder extends RecyclerView.ViewHolder {
        TextView textView;
        ImageView image;
        Intent intent;


        ViewHolder(View view) {
            super(view);
            this.image = view.findViewById(R.id.Image);
            this.textView = view.findViewById(R.id.title);


            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    intent = new Intent(ctx, Detail_Activity.class);
                    ctx.startActivity(intent);
                    Toast.makeText(v.getContext(), textView.getText(), Toast.LENGTH_SHORT).show();
                }
            });

        }

    }
}
