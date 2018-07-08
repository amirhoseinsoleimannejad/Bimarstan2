package com.example.jalil.bimarstan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class safeazmon extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_safeazmon);
    }

    public void jalil(View view) {
        Intent jalil=new Intent(this,MmpiActivity.class);
        startActivity(jalil);
    }

    public void jalil1(View view) {
        Intent jalil1=new Intent(this,VisitmmpiActivity.class);
        startActivity(jalil1);
    }
}
