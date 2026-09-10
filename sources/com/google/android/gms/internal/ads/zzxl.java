package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzxl extends zzvu {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzxl(zzxo zzxoVar, zzbf zzbfVar) {
        super(zzbfVar);
        Objects.requireNonNull(zzxoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzvu, com.google.android.gms.internal.ads.zzbf
    public final zzbe zzb(int i2, zzbe zzbeVar, long j) {
        this.zzb.zzb(i2, zzbeVar, j);
        zzbeVar.zzk = true;
        return zzbeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzvu, com.google.android.gms.internal.ads.zzbf
    public final zzbd zzd(int i2, zzbd zzbdVar, boolean z2) {
        this.zzb.zzd(i2, zzbdVar, z2);
        zzbdVar.zzf = true;
        return zzbdVar;
    }
}
