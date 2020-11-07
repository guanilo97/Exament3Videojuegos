package com.e.examen_t3;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class MylistaAdapter extends RecyclerView.Adapter<MylistaAdapter.MylistaViwholder>  {
    private List<listanime> mData;
    public MylistaAdapter(List<listanime> data) {
        mData= data;
    }
    @NonNull
    @Override
    public MylistaViwholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_listanime,parent, false);

        return new MylistaViwholder(view,context);
    }

    @Override
    public void onBindViewHolder(@NonNull final MylistaViwholder holder, final int position) {
        TextView tvnombre = holder.mview.findViewById(R.id.nombre);
        TextView tvinicial = holder.mview.findViewById(R.id.texto);
        ImageView ivatar = holder.mview.findViewById(R.id.iv_avatar);
        //RatingBar ratingBar = holder.mview.findViewById(R.id.ratingBar);
        final listanime listanime = mData.get(position);
        tvnombre.setText(listanime.nombre);
        tvinicial.setText(listanime.texto);
        ImageView tv_ImageEstrella=holder.mview.findViewById(R.id.iv_estrella);
        Picasso.get().load(listanime.avatar).into(ivatar);
        if(listanime.valoracion==true){
            Picasso.get().load("https://i0.pngocean.com/files/217/1024/917/computer-icons-star-symbol-black-star.jpg").into(tv_ImageEstrella);
        }else{
            Picasso.get().load("https://w7.pngwing.com/pngs/545/679/png-transparent-independence-day-free-content-website-white-star-angle-white-triangle.png").into(tv_ImageEstrella);
        }
        holder.mview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(holder.context,"este mesaje prueba"+ position, Toast.LENGTH_SHORT).show();
                ImageView tv_ImageEstrella=holder.mview.findViewById(R.id.iv_estrella);
                listanime anime=mData.get(position);
                if(anime.valoracion ==true)
                {
                    anime.valoracion =false;
                    Picasso.get().load("https://w7.pngwing.com/pngs/545/679/png-transparent-independence-day-free-content-website-white-star-angle-white-triangle.png").into(tv_ImageEstrella);
                }
                else {anime.valoracion=true;
                    Picasso.get().load("https://i0.pngocean.com/files/217/1024/917/computer-icons-star-symbol-black-star.jpg").into(tv_ImageEstrella);
                }
            }
        });

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class MylistaViwholder extends RecyclerView.ViewHolder {
        public Context context;
        public  View mview;
        public MylistaViwholder(@NonNull View itemView, Context context) {
            super(itemView);
            mview= itemView;
            this.context = context;
        }
    }
}
