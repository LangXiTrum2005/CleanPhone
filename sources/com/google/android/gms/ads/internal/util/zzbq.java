package com.google.android.gms.ads.internal.util;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.internal.ads.y01;
import k9.c0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public HandlerThread f11086a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public y01 f11087b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f11088c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f11089d = new Object();

    public final Looper zza() {
        Looper looper;
        Object obj = this.f11089d;
        synchronized (obj) {
            try {
                if (this.f11088c != 0) {
                    c0.i(this.f11086a, "Invalid state: handlerThread should already been initialized.");
                } else if (this.f11086a == null) {
                    zze.zza("Starting the looper thread.");
                    HandlerThread handlerThread = new HandlerThread("LooperProvider");
                    this.f11086a = handlerThread;
                    handlerThread.start();
                    this.f11087b = new y01(this.f11086a.getLooper());
                    zze.zza("Looper thread started.");
                } else {
                    zze.zza("Resuming the looper thread");
                    obj.notifyAll();
                }
                this.f11088c++;
                looper = this.f11086a.getLooper();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return looper;
    }

    public final Handler zzb() {
        return this.f11087b;
    }
}
