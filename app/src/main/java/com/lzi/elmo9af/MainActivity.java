package com.lzi.elmo9af;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ListView;

import com.google.android.material.navigation.NavigationView;
import com.lzi.elmo9af.Classes.Offre;
import com.lzi.elmo9af.listesModels.Offre_View;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;


public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private DrawerLayout drawerLayout;
    private ViewPager viewPager;

    //Mouad
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawerLayout = findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,
                R.string.open_navigation_drawer,R.string.close_navigation_drawer);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        // Find the view pager that will allow the user to swipe between fragments
        viewPager = findViewById(R.id.viewpager);

        NavigationView navigationView = findViewById(R.id.nav_view);

        assert navigationView != null;
        navigationView.setNavigationItemSelectedListener(this);

        onNavigationItemSelected(navigationView.getMenu().getItem(0).setChecked(true));



        // Mouad
        listView = findViewById(R.id.news_offre);
        getAllNewOffre();

    }

    private void getAllNewOffre() {
        List<Offre> listOffre= Offres();
        Offre_View offre_view = new Offre_View(getLayoutInflater(),listOffre);
        listView.setAdapter(offre_view);

    }

    private List<Offre> Offres(){
        List<Offre> listOffre = new ArrayList<Offre>();
        Date date = Calendar.getInstance().getTime();
        /*for (int o = 1 ;o<=4;o++){

            Offre offre = new Offre(o,"Offre"+o,"description description description description","Clien "+ o, date);
            listOffre.add(offre);
            Log.v("my" ,"o = "+ o);
        }*/

        listOffre.add(new Offre(1,"Offre"+1,"description description description description","Clien "+ 1, date));
        listOffre.add(new Offre(1,"Offre"+1,"description description description description","Clien "+ 1, date));
        listOffre.add(new Offre(1,"Offre"+1,"description description description description","Clien "+ 1, date));
        listOffre.add(new Offre(1,"Offre"+1,"description description description description","Clien "+ 1, date));
        listOffre.add(new Offre(1,"Offre"+1,"description description description description","Clien "+ 1, date));
        listOffre.add(new Offre(1,"Offre"+1,"description description description description","Clien "+ 1, date));

        return listOffre;
    }
//===============================

    @Override
    public void onBackPressed() {

        DrawerLayout drawerLayout = findViewById(R.id.drawer_layout);
        if (drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START);
        }else
            super.onBackPressed();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.buttom_navigation_menu,menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        return true;
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        return true;
    }


}
