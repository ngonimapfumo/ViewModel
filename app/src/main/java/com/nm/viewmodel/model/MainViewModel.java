package com.nm.viewmodel.model;

import androidx.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {

    public int score = 0;

    public void increment() {
        score++;
    }

    public void decrement() {
        score--;
    }

    @Override
    protected void onCleared() {
        super.onCleared();
    }
}
