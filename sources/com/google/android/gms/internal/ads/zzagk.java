package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzagk implements zzafr {
    final /* synthetic */ zzagm zza;
    private final long zzb;

    public zzagk(zzagm zzagmVar, long j) {
        Objects.requireNonNull(zzagmVar);
        this.zza = zzagmVar;
        this.zzb = j;
    }

    @Override // com.google.android.gms.internal.ads.zzafr
    public final long zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzafr
    public final boolean zzb() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzafr
    public final zzafp zzc(long j) {
        zzagm zzagmVar = this.zza;
        zzafp zzafpVarZzg = zzagmVar.zzh()[0].zzg(j);
        for (int i2 = 1; i2 < zzagmVar.zzh().length; i2++) {
            zzafp zzafpVarZzg2 = zzagmVar.zzh()[i2].zzg(j);
            if (zzafpVarZzg2.zza.zzc < zzafpVarZzg.zza.zzc) {
                zzafpVarZzg = zzafpVarZzg2;
            }
        }
        return zzafpVarZzg;
    }
}
