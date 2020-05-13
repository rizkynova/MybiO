package com.rizkynova.mybio;

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


import java.util.List;

public class RVMusicAdapter extends RecyclerView.Adapter<com.rizkynova.mybio.RVMusicAdapter.MusicRViewHolder> {
    Context mContext;
    List<RVMusic> mData;

    public RVMusicAdapter(Context mContext, List<RVMusic> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public RVMusicAdapter.MusicRViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View layout;
        layout = LayoutInflater.from(mContext).inflate(R.layout.music_item_rv,parent,false);

        return new MusicRViewHolder(layout);
    }

    @Override
    public void onBindViewHolder(@NonNull RVMusicAdapter.MusicRViewHolder holder, int position) {

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

    public class MusicRViewHolder extends RecyclerView.ViewHolder{

        TextView textTitle,textContent,textDesc,textDate;
        ImageView img_user;
        RelativeLayout relativeLayout;

        public MusicRViewHolder(View itemView){
            super(itemView);
            relativeLayout = itemView.findViewById(R.id.relativeLayout);
            textTitle = itemView.findViewById(R.id.textTitle);
            textDate = itemView.findViewById(R.id.textDate);
            textDesc = itemView.findViewById(R.id.textDesc);
            img_user = itemView.findViewById(R.id.img_user);
        }

    }
}

