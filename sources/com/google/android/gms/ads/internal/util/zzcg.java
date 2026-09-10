package com.google.android.gms.ads.internal.util;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import com.google.android.gms.internal.ads.am;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class zzcg {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f11114d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Context f11115e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f11113c = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakHashMap f11112b = new WeakHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BroadcastReceiver f11111a = new zzcf(this);

    @SuppressLint({"UnprotectedReceiver"})
    public final synchronized void zza(Context context) {
        try {
            if (this.f11113c) {
                return;
            }
            Context applicationContext = context.getApplicationContext();
            this.f11115e = applicationContext;
            if (applicationContext == null) {
                this.f11115e = context;
            }
            am.a(this.f11115e);
            this.f11114d = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(am.R4)).booleanValue();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(am.Fc)).booleanValue() || Build.VERSION.SDK_INT < 33) {
                this.f11115e.registerReceiver(this.f11111a, intentFilter);
            } else {
                this.f11115e.registerReceiver(this.f11111a, intentFilter, 4);
            }
            this.f11113c = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @SuppressLint({"UnprotectedReceiver"})
    public final synchronized void zzb(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        if (this.f11114d) {
            this.f11112b.put(broadcastReceiver, intentFilter);
            return;
        }
        am.a(context);
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(am.Fc)).booleanValue() || Build.VERSION.SDK_INT < 33) {
            context.registerReceiver(broadcastReceiver, intentFilter);
        } else {
            context.registerReceiver(broadcastReceiver, intentFilter, 4);
        }
    }

    public final synchronized void zzc(Context context, BroadcastReceiver broadcastReceiver) {
        if (this.f11114d) {
            this.f11112b.remove(broadcastReceiver);
        } else {
            context.unregisterReceiver(broadcastReceiver);
        }
    }
}
