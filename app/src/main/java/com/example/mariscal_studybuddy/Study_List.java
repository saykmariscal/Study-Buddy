package com.example.mariscal_studybuddy;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.mariscal_studybuddy.databinding.ActivityStudyListBinding;

public class Study_List extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivityStudyListBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityStudyListBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.homeBtn.setOnClickListener(v -> {
            Intent intent = new Intent(this, Home_Page.class);
            startActivity(intent);

        });

        binding.alertBtn.setOnClickListener(v -> {
            Intent intent = new Intent(this, Notifications.class);
            startActivity(intent);

        });

        binding.moreBtn.setOnClickListener(v -> {
            Intent intent = new Intent(this, Settings.class);
            startActivity(intent);

        });

    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_study_list);
        return NavigationUI.navigateUp(navController, appBarConfiguration)
                || super.onSupportNavigateUp();
    }
}