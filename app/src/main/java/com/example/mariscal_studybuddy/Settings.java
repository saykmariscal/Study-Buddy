package com.example.mariscal_studybuddy;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.mariscal_studybuddy.databinding.ActivitySettingsBinding;

public class Settings extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivitySettingsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivitySettingsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.listBtn.setOnClickListener(v -> {
            Intent intent = new Intent(this, Study_List.class);
            startActivity(intent);

        });

        binding.alertBtn.setOnClickListener(v -> {
            Intent intent = new Intent(this, Notifications.class);
            startActivity(intent);

        });

        binding.homeBtn.setOnClickListener(v -> {
            Intent intent = new Intent(this, Home_Page.class);
            startActivity(intent);

        });

    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_settings);
        return NavigationUI.navigateUp(navController, appBarConfiguration)
                || super.onSupportNavigateUp();
    }
}