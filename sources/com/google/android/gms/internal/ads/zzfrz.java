package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzfrz implements Runnable {
    final /* synthetic */ float zza;
    final /* synthetic */ zzfsa zzb;

    public zzfrz(zzfsa zzfsaVar, float f) {
        this.zza = f;
        Objects.requireNonNull(zzfsaVar);
        this.zzb = zzfsaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zza.zzg().zzf(this.zza);
    }
}
