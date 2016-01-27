package com.example.dongja94.sampledesignsupport;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    NavigationView navigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        navigationView = (NavigationView)findViewById(R.id.menu);
        View view = navigationView.getHeaderView(0);
        TextView titleView = (TextView)view.findViewById(R.id.text_title);
        titleView.setText("MyMenu");
        navigationView.setNavigationItemSelectedListener(this);
        Button btn = (Button)findViewById(R.id.btn_show_menu);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation anim = AnimationUtils.loadAnimation(MainActivity.this, android.R.anim.slide_in_left);
                navigationView.setVisibility(View.VISIBLE);
                navigationView.startAnimation(anim);
            }
        });
    }

    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_1 :
            case R.id.menu_2 :
                item.setChecked(true);
                break;
            case R.id.menu_tablayout:
                startActivity(new Intent(this, TabLayoutActivity.class));
                break;
            case R.id.menu_tablayout_viewpager :
                startActivity(new Intent(this, TabPagerActivity.class));
                break;
            case R.id.menu_text_input_layout :
                startActivity(new Intent(this, TextInputLayoutActivity.class));
                break;
            case R.id.menu_coordinate_layout :
                startActivity(new Intent(this, CoordinatorActivity.class));
                break;
            case R.id.menu_appbar_layout :
                startActivity(new Intent(this, AppBarActivity.class));
                break;
        }

        Toast.makeText(this, "Menu Item Selected : " + item.getTitle(), Toast.LENGTH_SHORT).show();
        Animation anim = AnimationUtils.loadAnimation(MainActivity.this, android.R.anim.slide_out_right);
        anim.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                navigationView.setVisibility(View.GONE);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
        navigationView.startAnimation(anim);
        return true;
    }
}
