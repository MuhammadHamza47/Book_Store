package com.My_Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.Models.BookModel;
import com.example.myapplication.R;

import java.util.ArrayList;

public class BookAdapter extends RecyclerView.Adapter<BookAdapter.viewHolder> {

    ArrayList<BookModel> arrayList;
    Context context;

    public BookAdapter(ArrayList<BookModel> arrayList, Context context) {
        this.arrayList = arrayList;
        this.context = context;
    }
    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(context).inflate(R.layout.sample_recyclerview, parent, false);
        return new viewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {

        BookModel model = arrayList.get(position);
        holder.imgview.setImageResource(model.getImages1());
        holder.txtview.setText(model.getText());

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder{
        ImageView imgview;
        TextView txtview;

        public viewHolder(@NonNull View itemView) {
            super(itemView);
            imgview = itemView.findViewById(R.id.imageView2);
            txtview = itemView.findViewById(R.id.textView);
        }
    }
}
