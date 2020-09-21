package com.lzi.elmo9af;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ListView;

import com.google.android.material.navigation.NavigationView;
import com.google.android.material.tabs.TabLayout;
import com.lzi.elmo9af.adapters.CategoryPagerAdapter;
import com.lzi.elmo9af.adapters.OffreAdapter;
import com.lzi.elmo9af.entities.Offre;
import com.lzi.elmo9af.fragment.CategoryFragment;
import com.lzi.elmo9af.fragment.HomeFragment;
import com.lzi.elmo9af.utils.MyTab;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;


public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private DrawerLayout drawerLayout;
    private ViewPager viewPager;
    private TabLayout tabLayout;
    private List<MyTab> tabs;

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

        tabLayout = findViewById(R.id.sliding_tabs);

        // Find the view pager that will allow the user to swipe between fragments
        viewPager = findViewById(R.id.viewpager);
        tabLayout.setupWithViewPager(viewPager);


        NavigationView navigationView = findViewById(R.id.nav_view);

        assert navigationView != null;
        navigationView.setNavigationItemSelectedListener(this);

        onNavigationItemSelected(navigationView.getMenu().getItem(0).setChecked(true));

        tabs = new ArrayList<>();
        tabs = getTabs();

        CategoryPagerAdapter pagerAdapter = new CategoryPagerAdapter(this,tabs,getSupportFragmentManager());
        viewPager.setAdapter(pagerAdapter);

        // Mouad
        listView = findViewById(R.id.lv_offres);
        getAllNewOffre();

    }

    private List<MyTab> getTabs(){
        List<MyTab> tabs = new ArrayList<>();
        tabs.add(new MyTab("Home", new HomeFragment()));

        return tabs;
    }

    private void getAllNewOffre() {
        List<Offre> listOffre= Offres();
        OffreAdapter offre_view = new OffreAdapter(getLayoutInflater(),listOffre);
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
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        return true;
    }


}
