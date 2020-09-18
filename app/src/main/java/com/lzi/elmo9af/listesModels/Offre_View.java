package com.lzi.elmo9af.listesModels;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.lzi.elmo9af.Classes.Offre;
import com.lzi.elmo9af.R;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class Offre_View extends BaseAdapter {
    List<Offre> Offre;
    LayoutInflater layoutInflater;
    public static List<String> selectedCodes = new ArrayList<String>();

    public Offre_View(LayoutInflater layoutInflater, List<Offre> etudiants) {
        this.Offre = etudiants;
        this.layoutInflater = layoutInflater;
    }

    @Override
    public int getCount() {
        return Offre.size();
    }

    @Override
    public Offre getItem(int i) {
        return Offre.get(i);
    }

    @Override
    public long getItemId(int i) {
        return getItem(i).getOffre_id();
    }

    protected Offre currentOffre = null;

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        currentOffre = getItem(i);
        View etudiant_layout = layoutInflater.inflate(R.layout.offre, null);
        TextView offreTitle = (TextView) etudiant_layout.findViewById(R.id.offreTitle);

        TextView offreService = (TextView) etudiant_layout.findViewById(R.id.offreService);
        TextView offreDescription = (TextView) etudiant_layout.findViewById(R.id.offreDescription);
        TextView offreClient = (TextView) etudiant_layout.findViewById(R.id.offreClient);
        TextView offreDate = (TextView) etudiant_layout.findViewById(R.id.offreDate);

        offreTitle.setText(currentOffre.getTitle());
        offreService.setText(currentOffre.getService());
        offreDescription.setText(currentOffre.getDescription());
        offreClient.setText(currentOffre.getClient());

        SimpleDateFormat simpleDateFormat   = new SimpleDateFormat("dd/mm/YYYY");
        try{
            offreDate.setText(simpleDateFormat.parse(currentOffre.getOffre_date().toString().substring(0,9)).toString());
        }
        catch (Exception e){
            Log.v("dateErr",e.getMessage());
        }
        return etudiant_layout;
    }
}
