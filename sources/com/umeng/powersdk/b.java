package com.umeng.powersdk;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.core.app.NotificationCompat;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Context f2746a;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final b f2747a = new b(0);
    }

    private b() {
    }

    public /* synthetic */ b(byte b) {
        this();
    }

    public final synchronized com.umeng.powersdk.a a() {
        com.umeng.powersdk.a aVar;
        com.umeng.powersdk.a aVar2 = null;
        try {
            Intent intentRegisterReceiver = f2746a.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            int i = 0;
            int intExtra = intentRegisterReceiver.getIntExtra("level", 0);
            int intExtra2 = intentRegisterReceiver.getIntExtra("voltage", 0);
            int intExtra3 = intentRegisterReceiver.getIntExtra("temperature", 0);
            int intExtra4 = intentRegisterReceiver.getIntExtra(NotificationCompat.CATEGORY_STATUS, 0);
            int i2 = -1;
            if (intExtra4 != 1) {
                if (intExtra4 == 2) {
                    i2 = 1;
                } else if (intExtra4 == 3 || intExtra4 == 4) {
                    i2 = 0;
                } else if (intExtra4 == 5) {
                    i2 = 2;
                }
            }
            int intExtra5 = intentRegisterReceiver.getIntExtra("plugged", 0);
            if (intExtra5 == 1) {
                i = 1;
            } else if (intExtra5 == 2) {
                i = 2;
            }
            aVar = new com.umeng.powersdk.a();
            try {
                aVar.f2745a = intExtra;
                aVar.b = intExtra2;
                aVar.d = i2;
                aVar.c = intExtra3;
                aVar.e = i;
                aVar.f = System.currentTimeMillis();
            } catch (Throwable unused) {
                aVar2 = aVar;
                aVar = aVar2;
            }
        } catch (Throwable unused2) {
        }
        return aVar;
    }

    public static b a(Context context) {
        if (f2746a == null && context != null) {
            f2746a = context.getApplicationContext();
        }
        return a.f2747a;
    }
}
