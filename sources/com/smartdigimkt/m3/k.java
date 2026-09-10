package com.smartdigimkt.m3;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes4.dex */
public class k extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (action != null) {
            String stringExtra = intent.getStringExtra(com.smartdigimkt.p6.c.C0567c.f);
            String stringExtra2 = intent.getStringExtra(com.smartdigimkt.p6.c.C0567c.g);
            switch (action) {
                case "at_offer_action_1":
                    l.a(context.getApplicationContext()).c(stringExtra, stringExtra2);
                    break;
                case "at_offer_action_2":
                    l.a(context.getApplicationContext()).b(stringExtra, stringExtra2);
                    break;
                case "at_offer_action_3":
                    l.a(context.getApplicationContext()).d(stringExtra, stringExtra2);
                    break;
                case "at_offer_action_4":
                    l.a(context.getApplicationContext()).e(stringExtra, stringExtra2);
                    break;
                case "at_offer_action_5":
                    l.a(context.getApplicationContext()).a(stringExtra, stringExtra2);
                    break;
            }
        }
    }
}
