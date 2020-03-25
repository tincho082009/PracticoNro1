package com.example.practiconro1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class UsbConectado extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "Usted ha conectado un USB a su dispositivo", Toast.LENGTH_LONG).show();
    }
}
