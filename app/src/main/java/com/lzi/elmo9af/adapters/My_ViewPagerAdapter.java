package com.lzi.elmo9af.adapters;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;

public class My_ViewPagerAdapter extends FragmentPagerAdapter {

    private ArrayList<Fragment> fragmentsList = new ArrayList<>();

    private ArrayList<String> fragmentsTitle = new ArrayList<>();



    public My_ViewPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return fragmentsList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentsList.size();
    }

    public void addFragment(Fragment fragment, String title){
        fragmentsList.add(fragment);
        fragmentsTitle.add(title);
    }
    @Nullable
    @Override
    public CharSequence getPageTitle(int position){
        return fragmentsTitle.get(position);
    }
}