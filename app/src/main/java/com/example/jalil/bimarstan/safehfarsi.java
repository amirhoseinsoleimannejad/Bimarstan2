package com.example.jalil.bimarstan;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;

public class safehfarsi extends AppCompatActivity {
    private Button button;
    private String username;
    private String password;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.safehfarsi);



        G.activity=this;

//کد مربوط به یکبار اجرا شدن لوگین
//       SharedPreferences sharedpreferences = getSharedPreferences(G.MyPREFERENCES, Context.MODE_PRIVATE);
//       String checklogin = sharedpreferences.getString(G.id_sick ,"-1");
//
//
//
//
//        if(!checklogin.equals("-1") ) {
//            Intent myIntent = new Intent(G.activity,loginasli.class);
//            startActivity(myIntent);
//            finish();
//        }
//



//
//        TextView txtyekan1 = (TextView) findViewById(R.id.textView);
//        Typeface yekan_font1 = Typeface.createFromAsset(getAssets(), "tt0586m_.ttf");
//        txtyekan1.setTypeface(yekan_font1);


//        TextView txtyekan2 = (TextView) findViewById(R.id.textView_amir);
//        Typeface yekan_font2 = Typeface.createFromAsset(getAssets(), "tt0586m_.ttf");
//        txtyekan2.setTypeface(yekan_font2);


//        TextView txtyekan33 = (TextView) findViewById(R.id.textView);
//        Typeface yekan_font33 = Typeface.createFromAsset(getAssets(), "BTrafcBd_0.ttf");
//        txtyekan33.setTypeface(yekan_font33);


        Button b1 = (Button) findViewById(R.id.buttonlog);
        Typeface yekan_font5 = Typeface.createFromAsset(getAssets(), "tt0586m_.ttf");
        b1.setTypeface(yekan_font5);


        Button b2 = (Button) findViewById(R.id.buttonsin);
        Typeface yekan_font3 = Typeface.createFromAsset(getAssets(), "tt0586m_.ttf");
        b2.setTypeface(yekan_font3);







        G.activity=this;


        Button SendButton = (Button) findViewById(R.id.buttonlog);




        Bundle bundle = this.getIntent().getExtras();
        if(bundle!= null)
        {
            boolean isActivityToBeFinish =  this.getIntent().getExtras().getBoolean("finishstatus");
            if(isActivityToBeFinish)
            {

                this.finish();
            }
        }

        // Capture button clicks
        SendButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {




                EditText Epassword=(EditText) findViewById(R.id.editText2);




                password=Epassword.getText().toString();


                SharedPreferences sharedpreferences = getSharedPreferences(G.MyPREFERENCES, Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedpreferences.edit();

                editor.putString(G.code,password);
                editor.commit();



                new sendhttp(G.CheckLoginUrl+"?code="+password,"aaa",password).execute();


            }
        });

















        Button signup=(Button) findViewById(R.id.buttonsin);
        signup.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {




                Intent myIntent = new Intent(G.activity,singup.class);
                G.activity.startActivity(myIntent);





            }
        });

    }








    public class sendhttp extends AsyncTask<String, String, String> {
        public String text;
        public String  data;
        public String urlstring;

        public String pass;



        public ProgressDialog progressDialog;






        public sendhttp(String urlstring,String data,String pass){


            this.data=data;
            this.urlstring=urlstring;

            this.pass=pass;





        }




        @Override
        protected void onPostExecute(String result) {

            super.onPostExecute(result);
            this.text = result;


            Log.i("dd", "33333333333333333333333" + result);

            try {
                progressDialog.dismiss();

            }
            catch (Exception e){

            }

            String message[] = result.split(":");
            if (message[0].equals("1")) {//visitore


                SharedPreferences sharedpreferences = G.activity.getSharedPreferences(G.MyPREFERENCES, Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedpreferences.edit();
                editor.putString(G.id_sick, message[1]);

                editor.commit();
                 Intent jalil111 = new Intent(G.activity,loginasli.class);
                G.activity.startActivity(jalil111);

            }
            else{
                    Toast.makeText(G.activity, "مشخصات وارد شده اشتباه است.", Toast.LENGTH_LONG).show();

                }


            }


            @Override
            protected void onPreExecute () {

                progressDialog = ProgressDialog.show(G.activity,
                        "لطفاً منتظر بمانید",
                        "با تشکر");
            }

            @Override
            protected String doInBackground (String...params){


                try {

                    URL url = new URL(this.urlstring);


                    Log.i("uuuuuuuuuuuuuuuuu", "doInBackground: " + url.toString());


                    // Send POST data request

                    HttpURLConnection conn = null;

                    conn = (HttpURLConnection) url.openConnection();

                    conn.setDoOutput(true);
                    OutputStreamWriter wr = null;

                    conn.setRequestProperty(
                            "Authorization",
                            "Basic " + Base64.encodeToString(("" + ":" + this.pass).getBytes(), Base64.NO_WRAP));
                    wr = new OutputStreamWriter(conn.getOutputStream());


                    wr.write(this.data);


                    wr.flush();


                    // Get the server response

                    BufferedReader reader = null;

                    reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));

                    StringBuilder sb = new StringBuilder();
                    String line = null;

                    // Read Server Response

                    while ((line = reader.readLine()) != null) {
                        // Append server response in string
                        sb.append(line);

                    }


                    this.text = sb.toString();

                    conn.disconnect();


                } catch (Exception e) {

                    this.text = e.toString();

                }


                return this.text;
            }


        }

       }


