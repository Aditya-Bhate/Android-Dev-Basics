package com.example.bottomnavigation;

import android.Manifest;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import static android.net.Uri.parse;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView navView = findViewById(R.id.nav_view);

        navView.setOnNavigationItemSelectedListener(navListener);
    }
    private BottomNavigationView.OnNavigationItemSelectedListener navListener=new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            FragmentManager fragmentManager=getSupportFragmentManager();
            FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
            switch (item.getItemId()){
                case R.id.navigation_home:
                    HomeFragment homeFragment=new HomeFragment();
                    fragmentTransaction.replace(R.id.nav_host_fragment,homeFragment);
                    fragmentTransaction.commit();
                    return true;
                case R.id.navigation_dashboard:
                    DashboardFragment dashboardFragment=new DashboardFragment();
                    fragmentTransaction.replace(R.id.nav_host_fragment,dashboardFragment);
                    fragmentTransaction.commit();
                    return true;
                case R.id.navigation_notifications:
                    NotificationsFragment notificationsFragment=new NotificationsFragment();
                    fragmentTransaction.replace(R.id.nav_host_fragment,notificationsFragment);
                    fragmentTransaction.commit();
                    return true;
                case R.id.navigation_call:
                    ActivityCompat.requestPermissions(MainActivity.this,new String[]{Manifest.permission.CALL_PHONE},1);
                    String number="100";
                    String dial="tel:"+number;
                    startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
                    return true;
            }
            return false;
        }
    };
}