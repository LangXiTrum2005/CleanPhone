package com.smartdigimkt.s6;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;

/* JADX INFO: loaded from: classes6.dex */
public class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile b f38205b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Context f38206a;

    private b(Context context) {
        this.f38206a = context;
    }

    public static b a(Context context) {
        if (f38205b == null) {
            synchronized (b.class) {
                try {
                    if (f38205b == null) {
                        f38205b = new b(context.getApplicationContext());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f38205b;
    }

    public void a(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        try {
            try {
                LocalBroadcastManager.getInstance(this.f38206a).registerReceiver(broadcastReceiver, intentFilter);
            } catch (Throwable unused) {
                LocalBroadcastManager.getInstance(this.f38206a).registerReceiver(broadcastReceiver, intentFilter);
            }
        } catch (Throwable unused2) {
        }
    }

    public void a(BroadcastReceiver broadcastReceiver) {
        try {
            try {
                LocalBroadcastManager.getInstance(this.f38206a).unregisterReceiver(broadcastReceiver);
            } catch (Throwable unused) {
                LocalBroadcastManager.getInstance(this.f38206a).unregisterReceiver(broadcastReceiver);
            }
        } catch (Throwable unused2) {
        }
    }

    public void a(Intent intent) {
        try {
            try {
                LocalBroadcastManager.getInstance(this.f38206a).sendBroadcast(intent);
            } catch (Throwable unused) {
                LocalBroadcastManager.getInstance(this.f38206a).sendBroadcast(intent);
            }
        } catch (Throwable unused2) {
        }
    }
}
