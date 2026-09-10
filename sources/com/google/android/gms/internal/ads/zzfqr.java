package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzfqr implements Runnable {
    final /* synthetic */ com.google.android.gms.ads.internal.client.zze zza;
    final /* synthetic */ zzfqy zzb;

    public zzfqr(zzfqy zzfqyVar, com.google.android.gms.ads.internal.client.zze zzeVar) {
        this.zza = zzeVar;
        Objects.requireNonNull(zzfqyVar);
        this.zzb = zzfqyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzC(this.zza);
    }
}
