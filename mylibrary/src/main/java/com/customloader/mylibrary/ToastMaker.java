package com.customloader.mylibrary;

import android.content.Context;
import android.widget.Toast;

public class ToastMaker
{
    Context context;

    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public void show()
    {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }

    public ToastMaker(Context context) {
        this.context = context;
    }
}
