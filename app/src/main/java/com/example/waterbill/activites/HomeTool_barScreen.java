package com.example.waterbill.activites;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.waterbill.R;
import com.example.waterbill.fragments.Fragment_Aboutus;
import com.example.waterbill.fragments.Fragment_Address;
import com.example.waterbill.fragments.Fragment_Callus;
import com.example.waterbill.fragments.Fragment_Email;
import com.example.waterbill.fragments.Fragment_History;
import com.example.waterbill.fragments.Fragment_Logout;
import com.example.waterbill.fragments.Fragment_Notification;
import com.example.waterbill.fragments.Fragment_Password;
import com.example.waterbill.fragments.Fragment_Setting;
import com.example.waterbill.fragments.Fragmentedit_Profile;
import com.example.waterbill.fragments.FragmentsDashboard;
import com.example.waterbill.fragments.Fragment_waterBill;
import com.google.android.material.navigation.NavigationView;

public class HomeTool_barScreen extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;
    CardView cardview1_profilepage;
    FrameLayout fragment_container;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_toolbar);

        drawerLayout = findViewById(R.id.drwaer_layout);
        navigationView = findViewById(R.id.nav_view);
        toolbar = findViewById(R.id.my_toolbar);
        cardview1_profilepage = findViewById(R.id.cardview1_profilepage);
        fragment_container = findViewById(R.id.fragment_container);
        setSupportActionBar(toolbar);

        navigationView.bringToFront();
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.navigation_drawer_open,R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);

        navigationView.setNavigationItemSelectedListener(this);

        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                new FragmentsDashboard()).commit();

    }
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int itemId = item.getItemId();
        if (itemId == R.id.nav_Dashboard) {
            Toast.makeText(HomeTool_barScreen.this, "Daashboard opened", Toast.LENGTH_SHORT).show();
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                    new FragmentsDashboard()).commit();
            drawerLayout.closeDrawer(Gravity.LEFT);
            return true;
        }
        if (itemId == R.id.nav_waterbill) {
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragment_container,new Fragment_waterBill());
            fragmentTransaction.commit();

            Toast.makeText(HomeTool_barScreen.this, "Directed to Water Bill", Toast.LENGTH_SHORT).show();
            drawerLayout.closeDrawer(Gravity.LEFT);
            return true;
        }
        if (itemId == R.id.nav_billhistory) {
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragment_container,new Fragment_History());
            fragmentTransaction.commit();

            Toast.makeText(HomeTool_barScreen.this, "Directed to Bill History", Toast.LENGTH_SHORT).show();
            drawerLayout.closeDrawer(Gravity.LEFT);
            return true;
        }
        if (itemId == R.id.nav_notification) {
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragment_container,new Fragment_Notification());
            fragmentTransaction.commit();

            Toast.makeText(HomeTool_barScreen.this, "Directed to Notification", Toast.LENGTH_SHORT).show();
            drawerLayout.closeDrawer(Gravity.LEFT);
            return true;
        }
        if (itemId == R.id.nav_personaldetails) {
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragment_container,new Fragmentedit_Profile());
            fragmentTransaction.commit();

            Toast.makeText(HomeTool_barScreen.this, "Directed to Personal Details", Toast.LENGTH_SHORT).show();
            drawerLayout.closeDrawer(Gravity.LEFT);
            return true;
        }
        if (itemId == R.id.nav_password) {
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragment_container,new Fragment_Password());
            fragmentTransaction.commit();


            Toast.makeText(HomeTool_barScreen.this, "Directed to Password", Toast.LENGTH_SHORT).show();
            drawerLayout.closeDrawer(Gravity.LEFT);
            return true;
        }
        if (itemId == R.id.nav_call) {
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragment_container,new Fragment_Callus());
            fragmentTransaction.commit();


            Toast.makeText(HomeTool_barScreen.this, "Directed to Call us", Toast.LENGTH_SHORT).show();
            drawerLayout.closeDrawer(Gravity.LEFT);
            return true;
        }
        if (itemId == R.id.nav_email) {
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragment_container,new Fragment_Email());
            fragmentTransaction.commit();


            Toast.makeText(HomeTool_barScreen.this, "Directed to Email us", Toast.LENGTH_SHORT).show();
            drawerLayout.closeDrawer(Gravity.LEFT);
            return true;
        }
        if (itemId == R.id.address) {
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragment_container,new Fragment_Address());
            fragmentTransaction.commit();


            Toast.makeText(HomeTool_barScreen.this, "Directed toAddress", Toast.LENGTH_SHORT).show();
            drawerLayout.closeDrawer(Gravity.LEFT);
            return true;
        }
        if (itemId == R.id.nav_setting) {
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragment_container,new Fragment_Setting());
            fragmentTransaction.commit();


            Toast.makeText(HomeTool_barScreen.this, "Directed to setting", Toast.LENGTH_SHORT).show();
            drawerLayout.closeDrawer(Gravity.LEFT);
            return true;
        }
        if (itemId == R.id.nav_aboutus) {
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragment_container,new Fragment_Aboutus());
            fragmentTransaction.commit();


            Toast.makeText(HomeTool_barScreen.this, "Directed to About us", Toast.LENGTH_SHORT).show();
            drawerLayout.closeDrawer(Gravity.LEFT);
            return true;
        }
        if (itemId == R.id.nav_logout) {
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragment_container,new Fragment_Logout());
            fragmentTransaction.commit();


            Toast.makeText(HomeTool_barScreen.this, "Profile Logout", Toast.LENGTH_SHORT).show();
            drawerLayout.closeDrawer(Gravity.LEFT);
            return true;
        }
        return false;
    }
        @Override
        protected void onStart() {
            super.onStart();
            Log.w("DTAG","resume");
        }

        @Override
        protected void onResume() {
            super.onResume();
            Log.w("DTAG","resume");
        }
    }


