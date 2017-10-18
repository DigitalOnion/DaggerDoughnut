package com.outerspace.daggerdoughnut;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

import com.outerspace.daggerdoughnut.component.DaggerDoughnutComponent;
import com.outerspace.daggerdoughnut.component.DoughnutComponent;
import com.outerspace.daggerdoughnut.model.DoughnutDataPojo;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    private DoughnutComponent component;

    @Inject
    DoughnutDataPojo chocoDoughnut;

    @Inject
    DoughnutDataPojo nutDoughnut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        component = DaggerDoughnutComponent.builder().build();
    }

    @Override
    protected void onStart() {
        super.onStart();
        component.inject(this);

        EditText entry01 = (EditText) findViewById(R.id.text_entry_01);
        entry01.setText(chocoDoughnut.doughnutFlavor);
        
        EditText entry02 = (EditText) findViewById(R.id.text_entry_02);
        entry02.setText(nutDoughnut.doughnutFlavor);
    }
}
