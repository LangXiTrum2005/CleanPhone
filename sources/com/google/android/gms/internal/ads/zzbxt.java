package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzbxt implements Thread.UncaughtExceptionHandler {
    final /* synthetic */ Thread.UncaughtExceptionHandler zza;
    final /* synthetic */ zzbxv zzb;

    public zzbxt(zzbxv zzbxvVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.zza = uncaughtExceptionHandler;
        Objects.requireNonNull(zzbxvVar);
        this.zzb = zzbxvVar;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        try {
            try {
                this.zzb.zzg(thread, th);
            } catch (Throwable unused) {
                com.google.android.gms.ads.internal.util.client.zzo.zzf("AdMob exception reporter failed reporting the exception.");
            }
            if (this.zza != null) {
            }
        } finally {
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.zza;
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(thread, th);
            }
        }
    }
}
