package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView=findViewById(R.id.phone_login);
        CheckBox checkBox=findViewById(R.id.checkbox);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!checkBox.isChecked()) {
                    ConfirmDialog confirmDialog = new ConfirmDialog(MainActivity.this);
                    confirmDialog.show();
                }
                else{
                    Intent intent=new Intent(MainActivity.this,PhoneLoginActivity.class);
                    startActivity(intent);
                }
            }
        });
        TextView textView1=findViewById(R.id.protocl);
        textView1.setText(new BaiDuSpan("《本软件协议条款》"));
        textView1.setMovementMethod(LinkMovementMethod.getInstance());
    }
}