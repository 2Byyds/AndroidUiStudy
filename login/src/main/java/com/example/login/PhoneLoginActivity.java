package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.Switch;
import android.widget.TextView;

public class PhoneLoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone_login);
        ArrayAdapter<String> adapter=new ArrayAdapter<>(PhoneLoginActivity.this, android.R.layout.simple_list_item_1,new String[]{"1234567890","121234242314"});
        AutoCompleteTextView autoCompleteTextView=findViewById(R.id.phone_edit);
        autoCompleteTextView.setAdapter(adapter);
        Button button=findViewById(R.id.login);
        Switch nigth_switch=findViewById(R.id.switch_night);
        TextView textView=findViewById(R.id.marqueetext);
        LinearLayout linearLayout=findViewById(R.id.linear);
        nigth_switch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b)
                {
                    textView.setTextColor(Color.rgb(255,255,255));
                   linearLayout.setBackgroundColor(Color.BLACK);
                   nigth_switch.setTextColor(Color.rgb(255,255,255));
                }
                else {
                    textView.setTextColor(Color.rgb(0,0,0));
                    linearLayout.setBackgroundColor(Color.WHITE);
                    nigth_switch.setTextColor(Color.rgb(0,0,0));
                }
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ProgressDialog progressDialog=new ProgressDialog(PhoneLoginActivity.this);
                Thread thread=new Thread(new Runnable() {
                    @Override
                    public void run() {
                        while(progressDialog.getProgress()<100)
                        {
                            int pro=progressDialog.getProgress();
                            pro+=30;
                            progressDialog.setProgress(pro);
                            try {
                                Thread.sleep(1000);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                        progressDialog.dismiss();
                    }
                });
                progressDialog.setTitle("登录");
                progressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
                progressDialog.show();
                thread.start();
            }
        });
    }
}