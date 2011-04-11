package com.test;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main); //sasd
        Toast.makeText(this, "test", Toast.LENGTH_LONG).show();  // dont spam my code
        System.out.println("Juhu");
    }
}