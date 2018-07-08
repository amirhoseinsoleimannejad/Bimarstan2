package com.example.jalil.bimarstan;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class loginasli extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loginasli);



        G.activity=this;

        TextView txtyekan2 = (TextView) findViewById(R.id.textView4);
        TextView txtyekan3 = (TextView) findViewById(R.id.textView111);
        TextView txtyekan4 = (TextView) findViewById(R.id.textView112);
        TextView txtyekan5 = (TextView) findViewById(R.id.textView113);
        TextView txtyekan6 = (TextView) findViewById(R.id.textView117);
        TextView txtyekan7 = (TextView) findViewById(R.id.textView117);
        TextView txtyekan8 = (TextView) findViewById(R.id.textView119);
        TextView txtyekan9 = (TextView) findViewById(R.id.textView123);
        TextView txtyekan10 = (TextView) findViewById(R.id.textView124);
        TextView txtyekan11 = (TextView) findViewById(R.id.textView125);
        TextView txtyekan12 = (TextView) findViewById(R.id.textView455);
        Typeface yekan_font2 = Typeface.createFromAsset(getAssets(), "BTrafcBd_0.ttf");
        txtyekan2.setTypeface(yekan_font2);
        txtyekan3.setTypeface(yekan_font2);
        txtyekan4.setTypeface(yekan_font2);
        txtyekan5.setTypeface(yekan_font2);
        txtyekan6.setTypeface(yekan_font2);
        txtyekan7.setTypeface(yekan_font2);
        txtyekan8.setTypeface(yekan_font2);
        txtyekan9.setTypeface(yekan_font2);
        txtyekan10.setTypeface(yekan_font2);
        txtyekan11.setTypeface(yekan_font2);
        txtyekan12.setTypeface(yekan_font2);

//        Typeface yekan_font4 = Typeface.createFromAsset(getAssets(), "tt0586m_.ttf");
//        Button a=(Button) findViewById(R.id.buttonsin);
//        a.setTypeface(yekan_font4);






        Calendar c = Calendar.getInstance();
        System.out.println("Current time =&gt; "+c.getTime());

        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String formattedDate = df.format(c.getTime());
// Now formattedDate have current date/time
        Toast.makeText(this, formattedDate, Toast.LENGTH_SHORT).show();
        TextView d=( TextView )findViewById(R.id.textView44);
        String d_t[]=formattedDate.split(" ");
        d.setText(d_t[1]);
        TextView d1=( TextView )findViewById(R.id.textView45);

        d1.setText(d_t[0]);
    }

    public void azmon(View view) {

        YoYo.with(Techniques.Shake)
                .duration(1000)
                .repeat(1)
                .playOn(findViewById(R.id.imagel5));


        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent jalil=new Intent(G.activity,safeazmon.class);
                startActivity(jalil);

            }
        },1000);


    }

    public void mostanad(View view) {
        YoYo.with(Techniques.Shake)
                .duration(1000)
                .repeat(1)
                .playOn(findViewById(R.id.imagel4));


        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent jalil=new Intent(G.activity,VisitActivity.class);
                startActivity(jalil);

            }
        },1000);
    }

    public void zaman(View view) {
        YoYo.with(Techniques.Shake)
                .duration(1000)
                .repeat(1)
                .playOn(findViewById(R.id.imagel3));


        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent jalil=new Intent(G.activity,nobatgerftan.class);
                startActivity(jalil);

            }
        },1000);
    }

    public void doktor(View view) {
        YoYo.with(Techniques.Shake)
                .duration(1000)
                .repeat(1)
                .playOn(findViewById(R.id.imagel6));


        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent jalil=new Intent(G.activity,ChatallActivity.class);
                startActivity(jalil);

            }
        },1000);
    }

    public void bazar(View view) {
        YoYo.with(Techniques.Shake)
                .duration(1000)
                .repeat(1)
                .playOn(findViewById(R.id.imagel7));


        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent jalil=new Intent(G.activity,safeazmon.class);
                startActivity(jalil);

            }
        },1000);
    }

    public void darokha(View view) {
        YoYo.with(Techniques.Shake)
                .duration(1000)
                .repeat(1)
                .playOn(findViewById(R.id.imagel8));


        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent jalil=new Intent(G.activity,safeazmon.class);
                startActivity(jalil);

            }
        },1000);
    }

    public void azmonja(View view) {
        YoYo.with(Techniques.Shake)
                .duration(1000)
                .repeat(1)
                .playOn(findViewById(R.id.imagel10));


        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent jalil=new Intent(G.activity,safeazmon.class);
                startActivity(jalil);

            }
        },1000);
    }

    public void listdoktor(View view) {
        YoYo.with(Techniques.Shake)
                .duration(1000)
                .repeat(1)
                .playOn(findViewById(R.id.imagel11));


        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent jalil=new Intent(G.activity,safeazmon.class);
                startActivity(jalil);

            }
        },1000);
    }

    public void khadamat(View view) {
        YoYo.with(Techniques.Shake)
                .duration(1000)
                .repeat(1)
                .playOn(findViewById(R.id.imagel12));


        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent jalil=new Intent(G.activity,safeazmon.class);
                startActivity(jalil);

            }
        },1000);
    }

    public void motafar(View view) {
        YoYo.with(Techniques.Shake)
                .duration(1000)
                .repeat(1)
                .playOn(findViewById(R.id.imagel20));


        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent jalil=new Intent(G.activity,safeazmon.class);
                startActivity(jalil);

            }
        },1000);
    }
}
