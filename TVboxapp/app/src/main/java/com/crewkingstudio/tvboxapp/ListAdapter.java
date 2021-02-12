package com.crewkingstudio.tvboxapp;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.squareup.picasso.Picasso;

import java.util.List;

import jp.wasabeef.picasso.transformations.BlurTransformation;


public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ViewHolder> {
    private Context context;
    private List<MediaModel> elements;


    public ListAdapter(Context context, List<MediaModel> list) {
        this.context = context;
        this.elements = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        final View view = LayoutInflater.from(this.context).inflate(R.layout.layout_list_item, parent, false);
        return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, final int position) {
        holder.textName.setText(elements.get(position).getMediaTitle());
        holder.textInfo.setText(elements.get(position).getMediaInfo());

        Picasso.get()
                .load(elements.get(position).getMediaThumbnail())
                .into(holder.imgThumbnail);

        holder.itemView.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus){
                    holder.itemView.setScaleX(1.2f);
                    holder.itemView.setScaleY(1.2f);
                    holder.itemView.setBackgroundColor(Color.parseColor("#48D1CC"));
                    Picasso.get()
                            .load(elements.get(position).getMediaThumbnail())
                            .transform(new BlurTransformation(context, 10, 1))
                            .into(HomeFragment.imagebackgroundlist);
                }
                else {
                    holder.itemView.setScaleX(1f);
                    holder.itemView.setScaleY(1f);
                    holder.itemView.setBackgroundColor(Color.TRANSPARENT);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return this.elements.size();
    }


    public static class ViewHolder extends RecyclerView.ViewHolder{

        TextView textName;
        TextView textInfo;
        ImageView imgThumbnail;

        public ViewHolder(View view) {
            super(view);

            textName = view.findViewById(R.id.txt_media_title);
            textInfo = view.findViewById(R.id.txt_media_info);
            imgThumbnail = view.findViewById(R.id.img_media_thumbnail);
        }

    }
}
