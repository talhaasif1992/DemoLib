package com.example.myutils;


import com.example.myutils.ViewModel.CarViewModel;

import dagger.Component;

@Component
public interface CarViewModelInjector {
    CarViewModel getCarViewModel();
}
