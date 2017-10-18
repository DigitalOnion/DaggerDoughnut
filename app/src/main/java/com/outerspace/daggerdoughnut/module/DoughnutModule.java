package com.outerspace.daggerdoughnut.module;

import com.outerspace.daggerdoughnut.model.DoughnutDataPojo;

import dagger.Module;
import dagger.Provides;

@Module
public class DoughnutModule {
    @Provides
    DoughnutDataPojo provideDoughnutData() {
        DoughnutDataPojo doughnut = new DoughnutDataPojo();
        doughnut.doughnutFlavor = "Chocolate";
        return doughnut;
    }
}
