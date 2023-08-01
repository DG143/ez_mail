package com.example.ezmail;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder {

    ImageView imgView;
    TextView email,name;
    Button sendmail;

    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        imgView=itemView.findViewById(R.id.imgView);
        email= itemView.findViewById(R.id.email);
        name=itemView.findViewById(R.id.name);
        sendmail=itemView.findViewById(R.id.emailBtn);


    }

}
