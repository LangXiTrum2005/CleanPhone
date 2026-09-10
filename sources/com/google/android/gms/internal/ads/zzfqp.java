package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzfqp implements Runnable {
    final /* synthetic */ com.google.android.gms.ads.internal.client.zzea zza;
    final /* synthetic */ zzfqy zzb;

    public zzfqp(zzfqy zzfqyVar, com.google.android.gms.ads.internal.client.zzea zzeaVar) {
        this.zza = zzeaVar;
        Objects.requireNonNull(zzfqyVar);
        this.zzb = zzfqyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzD(this.zza);
    }
}
