package com.example.recy;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recy.modelcla.Recyclemodel;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;

public class Recylercod extends RecyclerView.Adapter<Recylercod.viewHolder>{
    ArrayList<Recyclemodel> list;
    Context context;
    public Recylercod(ArrayList<Recyclemodel> list, Context context) {
        this.list = list;
        this.context = context;
    }




    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.recyclerformat,null,false);

        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        Recyclemodel modo=list.get(position);
        holder.textViewer.setText(modo.getTourname());
        holder.imageView.setImageResource(modo.getImg());



    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView textViewer;

        public viewHolder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.imgseen);
            textViewer=itemView.findViewById(R.id.textseen);

        }




    }
}
