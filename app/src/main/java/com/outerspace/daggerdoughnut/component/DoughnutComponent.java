package com.outerspace.daggerdoughnut.component;


import com.outerspace.daggerdoughnut.MainActivity;
import com.outerspace.daggerdoughnut.model.DoughnutDataPojo;
import com.outerspace.daggerdoughnut.module.DoughnutModule;

import dagger.Component;

@Component(modules = {DoughnutModule.class})
public interface DoughnutComponent {

    public DoughnutDataPojo providesDoughnutData();

    public void inject(MainActivity mainActivity);
}
