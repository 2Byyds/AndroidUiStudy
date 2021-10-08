package com.example.login;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

import androidx.annotation.NonNull;

public class ConfirmDialog extends Dialog {
    public ConfirmDialog(@NonNull Context context) {
        super(context);
        initview(context);
    }


    private void initview(Context context)
    {
        View view= LayoutInflater.from(context).inflate(R.layout.confirm_dialog,null);
        setContentView(view);
    }
}
