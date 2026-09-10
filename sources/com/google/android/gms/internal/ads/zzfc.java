package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfc implements zzdn {
    @Override // com.google.android.gms.internal.ads.zzdn
    public final long zza() {
        return System.currentTimeMillis();
    }

    @Override // com.google.android.gms.internal.ads.zzdn
    public final long zzb() {
        return SystemClock.elapsedRealtime();
    }

    @Override // com.google.android.gms.internal.ads.zzdn
    public final long zzc() {
        return System.nanoTime();
    }

    @Override // com.google.android.gms.internal.ads.zzdn
    public final zzdx zzd(Looper looper, Handler.Callback callback) {
        return new zzfe(new Handler(looper, callback));
    }
}
