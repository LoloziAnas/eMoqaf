package com.lzi.elmo9af.adapters;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.lzi.elmo9af.R;
import com.lzi.elmo9af.entities.Offre;

import java.util.List;

public class R_Offre_Adapter extends RecyclerView.Adapter<R_Offre_Adapter.MyViewHolder> {

    List<Offre> offres;

    public R_Offre_Adapter(List<Offre> offres) {
        this.offres = offres;
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.offre,parent,false);
        return new MyViewHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        final Offre offre = offres.get(position);

        holder.offre_title.setText(offre.getTitle());
        holder.offre_description.setText(offre.getDescription());
        holder.offre_client.setText(offre.getClient());
        holder.offre_date.setText(offre.getOffre_date().toString());
    }

    @Override
    public int getItemCount() {
        return offres.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView offre_title,offre_service,offre_description,offre_client,offre_date;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            offre_title = itemView.findViewById(R.id.offreTitle);
            offre_service = itemView.findViewById(R.id.offreService);
            offre_description = itemView.findViewById(R.id.offreDescription);
            offre_client = itemView.findViewById(R.id.offreClient);
            offre_date = itemView.findViewById(R.id.offreDate);

        }
    }
}
