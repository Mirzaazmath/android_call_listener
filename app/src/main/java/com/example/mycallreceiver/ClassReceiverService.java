package com.example.mycallreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class ClassReceiverService extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        System.out.println(intent+"");

    }

}
