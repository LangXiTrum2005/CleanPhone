package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzfqq implements Runnable {
    final /* synthetic */ long zza;
    final /* synthetic */ com.google.android.gms.ads.internal.client.zzea zzb;
    final /* synthetic */ zzfqy zzc;

    public zzfqq(zzfqy zzfqyVar, long j, com.google.android.gms.ads.internal.client.zzea zzeaVar) {
        this.zza = j;
        this.zzb = zzeaVar;
        Objects.requireNonNull(zzfqyVar);
        this.zzc = zzfqyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfqy zzfqyVar = this.zzc;
        if (zzfqyVar.zzG() != null) {
            zzfqd zzfqdVarZzG = zzfqyVar.zzG();
            long j = this.zza;
            com.google.android.gms.ads.internal.client.zzea zzeaVar = this.zzb;
            zzfqdVarZzG.zzi(j, zzfqy.zzV(zzeaVar), zzfqyVar.zzI(), zzfqyVar.zze.zzd, zzfqyVar.zzo(), zzfqyVar.zzF());
        }
    }
}
