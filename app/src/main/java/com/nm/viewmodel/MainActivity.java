package com.nm.viewmodel;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import com.nm.viewmodel.databinding.ActivityMainBinding;
import com.nm.viewmodel.model.MainViewModel;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding activityMainBinding;
    private MainViewModel mainViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(activityMainBinding.getRoot());
        mainViewModel= new ViewModelProvider(this).get(MainViewModel.class);

        activityMainBinding.scoreTxt.setText(String.valueOf(mainViewModel.score));
        activityMainBinding.plusBtn.setOnClickListener(v -> {

            mainViewModel.increment();
            activityMainBinding.scoreTxt.setText(String.valueOf(mainViewModel.score));
        });

        activityMainBinding.minusBtn.setOnClickListener(v -> {
            mainViewModel.decrement();
            activityMainBinding.scoreTxt.setText(String.valueOf(mainViewModel.score));
        });
    }
}