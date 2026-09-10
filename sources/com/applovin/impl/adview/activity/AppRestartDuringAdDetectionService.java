package com.applovin.impl.adview.activity;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class AppRestartDuringAdDetectionService extends Service {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile boolean f7451a;

    public static boolean a() {
        return f7451a;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        f7451a = false;
        return 2;
    }

    @Override // android.app.Service
    public void onTaskRemoved(Intent intent) {
        super.onTaskRemoved(intent);
        f7451a = true;
        stopSelf();
    }
}
