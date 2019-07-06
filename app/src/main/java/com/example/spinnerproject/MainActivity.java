package com.example.spinnerproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    String[] deptname;
    private Spinner spinner1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        deptname = getResources().getStringArray(R.array.dept_name);

        spinner1 = (Spinner)findViewById(R.id.spinner);
        ArrayAdapter <String> adapter=new ArrayAdapter<String>(this,R.layout.sample_view,R.id.textviewid,deptname);
        spinner1.setAdapter(adapter);
    }
}
