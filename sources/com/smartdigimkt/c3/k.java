package com.smartdigimkt.c3;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* JADX INFO: loaded from: classes5.dex */
public class k extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        try {
            if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
                if (activeNetworkInfo == null || !activeNetworkInfo.isAvailable()) {
                    e.a().b(false);
                } else if (activeNetworkInfo.getType() == 1) {
                    e.a().a(true);
                } else if (activeNetworkInfo.getType() == 0) {
                    e.a().b();
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}
