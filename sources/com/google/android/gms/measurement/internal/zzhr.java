package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
final class zzhr implements Runnable {
    final /* synthetic */ AtomicReference zza;
    final /* synthetic */ boolean zzb;
    final /* synthetic */ zzik zzc;

    public zzhr(zzik zzikVar, AtomicReference atomicReference, boolean z) {
        this.zzc = zzikVar;
        this.zza = atomicReference;
        this.zzb = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzc.zzt.zzt().zzx(this.zza, this.zzb);
    }
}
