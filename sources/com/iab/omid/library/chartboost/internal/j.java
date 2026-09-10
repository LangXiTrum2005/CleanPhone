package com.iab.omid.library.chartboost.internal;

import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class j {
    private static j d = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WeakReference<Context> f21866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f21867b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f21868c = false;

    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            j jVar;
            boolean z2;
            boolean z3;
            if (intent.getAction().equals("android.intent.action.SCREEN_OFF")) {
                jVar = j.this;
                z2 = jVar.f21868c;
                z3 = true;
            } else {
                if (!intent.getAction().equals("android.intent.action.SCREEN_ON")) {
                    return;
                }
                jVar = j.this;
                z2 = jVar.f21868c;
                z3 = false;
            }
            jVar.a(z3, z2);
            j.this.f21867b = z3;
        }
    }

    public static j b() {
        return d;
    }

    public void a() {
        KeyguardManager keyguardManager;
        Context context = this.f21866a.get();
        if (context == null || (keyguardManager = (KeyguardManager) context.getSystemService("keyguard")) == null) {
            return;
        }
        boolean zIsDeviceLocked = keyguardManager.isDeviceLocked();
        a(this.f21867b, zIsDeviceLocked);
        this.f21868c = zIsDeviceLocked;
    }

    public void a(Context context) {
        if (context == null) {
            return;
        }
        this.f21866a = new WeakReference<>(context);
        IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        context.registerReceiver(new a(), intentFilter);
    }

    public void a(boolean z2, boolean z3) {
        if ((z3 || z2) == (this.f21868c || this.f21867b)) {
            return;
        }
        Iterator<com.iab.omid.library.chartboost.adsession.a> it = c.c().b().iterator();
        while (it.hasNext()) {
            it.next().d().b(z3 || z2);
        }
    }
}
