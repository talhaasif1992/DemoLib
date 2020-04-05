package com.example.myutils;


import android.app.Activity;
import android.content.Intent;

import com.example.myutils.ViewModel.CarViewModel;

import dagger.Component;

@Component
public interface CarViewModelInjector {
    CarViewModel getCarViewModel();
}
