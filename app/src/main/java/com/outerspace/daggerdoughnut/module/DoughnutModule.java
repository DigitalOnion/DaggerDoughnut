package com.outerspace.daggerdoughnut.module;

import com.outerspace.daggerdoughnut.model.DoughnutDataPojo;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

@Module
public class DoughnutModule {
    @Provides @Named("choco")
    DoughnutDataPojo provideDoughnutDataChoco() {
        DoughnutDataPojo doughnut = new DoughnutDataPojo();
        doughnut.doughnutFlavor = "Chocolate";
        return doughnut;
    }

    @Provides @Named("nuts")
    DoughnutDataPojo provideDoughnutDataNuts() {
        DoughnutDataPojo doughnut = new DoughnutDataPojo();
        doughnut.doughnutFlavor = "Nuts";
        return doughnut;
    }
}
