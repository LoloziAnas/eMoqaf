package com.lzi.elmo9af.listesModels;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.lzi.elmo9af.Classes.Offre;
import com.lzi.elmo9af.R;

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
        View etudiant_layout = layoutInflater.inflate(R.layout.ouffre, null);

        TextView offreTitle = (TextView) etudiant_layout.findViewById(R.id.offreTitle);

        TextView offreService = (TextView) etudiant_layout.findViewById(R.id.offreService);
        TextView offreDescription = (TextView) etudiant_layout.findViewById(R.id.offreDescription);

        TextView offreDate = (TextView) etudiant_layout.findViewById(R.id.offreDate);

        offreTitle.setText(currentOffre.getTitle());
        offreService.setText(currentOffre.getService());
        offreDescription.setText(currentOffre.getDescription());
        offreDate.setText(currentOffre.getOffre_date().toString());
        return etudiant_layout;
    }
}
