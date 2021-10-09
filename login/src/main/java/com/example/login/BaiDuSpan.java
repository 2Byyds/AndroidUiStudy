package com.example.login;

import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;

import androidx.annotation.NonNull;

public class BaiDuSpan extends SpannableString {
    public BaiDuSpan(CharSequence source) {
        super(source);
        setSpan(new URLSpan("https://www.baidu.com"),0,source.length(),SPAN_EXCLUSIVE_EXCLUSIVE);
        setSpan(new NoUnderLineSpan(),0,source.length(),SPAN_EXCLUSIVE_EXCLUSIVE);
    }
    private class NoUnderLineSpan extends UnderlineSpan{
        @Override
        public void updateDrawState(@NonNull TextPaint ds) {
            ds.setUnderlineText(false);
        }
    }
}
