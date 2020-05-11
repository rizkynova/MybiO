package com.rizkynova.mybio.ClassPendukung;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.rizkynova.mybio.R;

import java.util.List;

public class RVAdapter extends RecyclerView.Adapter<RVAdapter.RViewHolder> {

    Context mContext;
    List<RV> mData;

    public RVAdapter(Context mContext, List<RV> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public RViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View layout;
        layout = LayoutInflater.from(mContext).inflate(R.layout.items_rv,parent,false);

        return new RViewHolder(layout);
    }

    @Override
    public void onBindViewHolder(@NonNull RViewHolder holder, int position) {

        //bind datanya disini

        //ini animationnya

        holder.img_user.setAnimation(AnimationUtils.loadAnimation(mContext,R.anim.fade_transition));
        holder.relativeLayout.setAnimation(AnimationUtils.loadAnimation(mContext,R.anim.fade_scale));

        holder.textTitle.setText(mData.get(position).getTitle());
        holder.textDesc.setText(mData.get(position).getContent());
        holder.textDate.setText(mData.get(position).getDate());
        holder.img_user.setImageResource(mData.get(position).getUserPhoto());


    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class RViewHolder extends RecyclerView.ViewHolder{

        TextView textTitle,textContent,textDesc,textDate;
        ImageView img_user;
        RelativeLayout relativeLayout;

        public RViewHolder(View itemView){
            super(itemView);
            relativeLayout = itemView.findViewById(R.id.relativeLayout);
            textTitle = itemView.findViewById(R.id.textTitle);
            textDate = itemView.findViewById(R.id.textDate);
            textDesc = itemView.findViewById(R.id.textDesc);
            img_user = itemView.findViewById(R.id.img_user);
        }

    }
}
