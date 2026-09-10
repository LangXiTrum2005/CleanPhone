package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzcdz implements zzgyj {
    final /* synthetic */ zzcdx zza;
    final /* synthetic */ zzcdv zzb;

    public zzcdz(zzcea zzceaVar, zzcdx zzcdxVar, zzcdv zzcdvVar) {
        this.zza = zzcdxVar;
        this.zzb = zzcdvVar;
        Objects.requireNonNull(zzceaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgyj
    public final void zza(Throwable th) {
        this.zzb.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzgyj
    public final void zzb(Object obj) {
        this.zza.zza(obj);
    }
}
