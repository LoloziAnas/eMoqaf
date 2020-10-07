package com.lzi.elmo9af.fragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.lzi.elmo9af.R;
import com.lzi.elmo9af.adapters.R_Offre_Adapter;
import com.lzi.elmo9af.entities.Offre;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

    View view;
    RecyclerView offre_recycler;

    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_home, container, false);
        offre_recycler = view.findViewById(R.id.offre_recycler);
        loadOffre();
        return view;
    }

    private void loadOffre() {
        R_Offre_Adapter r_offre_adapter = new R_Offre_Adapter(Offres());
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        offre_recycler.setLayoutManager(layoutManager);
        offre_recycler.setAdapter(r_offre_adapter);
    }
    private List<Offre> Offres(){
        List<Offre> listOffre = new ArrayList<Offre>();
        Date date = Calendar.getInstance().getTime();
        listOffre.add(new Offre(1,"Offre"+1,"description description description description","Clien "+ 1, date));
        listOffre.add(new Offre(1,"Offre"+1,"description description description description","Clien "+ 1, date));
        listOffre.add(new Offre(1,"Offre"+1,"description description description description","Clien "+ 1, date));
        listOffre.add(new Offre(1,"Offre"+1,"description description description description","Clien "+ 1, date));
        listOffre.add(new Offre(1,"Offre"+1,"description description description description","Clien "+ 1, date));
        listOffre.add(new Offre(1,"Offre"+1,"description description description description","Clien "+ 1, date));
        return listOffre;
    }

}
