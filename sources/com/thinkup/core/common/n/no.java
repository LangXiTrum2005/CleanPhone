package com.thinkup.core.common.n;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;

/* JADX INFO: loaded from: classes6.dex */
public class no {
    private static volatile no m;
    Context o;

    private no(Context context) {
        this.o = context;
    }

    public static no o(Context context) {
        if (m == null) {
            synchronized (no.class) {
                try {
                    if (m == null) {
                        m = new no(context.getApplicationContext());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return m;
    }

    public final void o(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        try {
            try {
                LocalBroadcastManager.getInstance(this.o).registerReceiver(broadcastReceiver, intentFilter);
            } catch (Throwable unused) {
                LocalBroadcastManager.getInstance(this.o).registerReceiver(broadcastReceiver, intentFilter);
            }
        } catch (Throwable unused2) {
        }
    }

    public final void o(BroadcastReceiver broadcastReceiver) {
        try {
            try {
                LocalBroadcastManager.getInstance(this.o).unregisterReceiver(broadcastReceiver);
            } catch (Throwable unused) {
                LocalBroadcastManager.getInstance(this.o).unregisterReceiver(broadcastReceiver);
            }
        } catch (Throwable unused2) {
        }
    }

    public final void o(Intent intent) {
        try {
            try {
                LocalBroadcastManager.getInstance(this.o).sendBroadcast(intent);
            } catch (Throwable unused) {
                LocalBroadcastManager.getInstance(this.o).sendBroadcast(intent);
            }
        } catch (Throwable unused2) {
        }
    }
}
