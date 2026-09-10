package com.google.android.gms.ads.internal.util;

import android.os.SystemClock;
import p9.b;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f11094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f11095b = Long.MIN_VALUE;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f11096c = new Object();

    public zzbu(long j10) {
        this.f11094a = j10;
    }

    public final boolean zza() {
        synchronized (this.f11096c) {
            try {
                ((b) com.google.android.gms.ads.internal.zzt.zzk()).getClass();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                if (this.f11095b + this.f11094a > jElapsedRealtime) {
                    return false;
                }
                this.f11095b = jElapsedRealtime;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void zzb(long j10) {
        synchronized (this.f11096c) {
            this.f11094a = j10;
        }
    }
}
