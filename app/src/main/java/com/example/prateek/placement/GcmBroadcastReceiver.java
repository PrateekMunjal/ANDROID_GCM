package com.example.prateek.placement;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class GcmBroadcastReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if(action.equals("com.google.android.c2dm.intent.REGISTRATION")){
            String registrationId = intent.getStringExtra("registration_id");
            Log.e("Reg Id --> ",registrationId);

        }
        else if(action.equals("com.google.android.c2dm.intent.RECEIVE"))
        {

        }
    }
}
