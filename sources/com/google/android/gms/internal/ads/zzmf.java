package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzmf extends zzvu {
    private final zzbe zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzmf(zzmg zzmgVar, zzbf zzbfVar) {
        super(zzbfVar);
        Objects.requireNonNull(zzmgVar);
        this.zzc = new zzbe();
    }

    @Override // com.google.android.gms.internal.ads.zzvu, com.google.android.gms.internal.ads.zzbf
    public final zzbd zzd(int i2, zzbd zzbdVar, boolean z2) {
        zzbf zzbfVar = this.zzb;
        zzbd zzbdVarZzd = zzbfVar.zzd(i2, zzbdVar, z2);
        if (zzbfVar.zzb(zzbdVarZzd.zzc, this.zzc, 0L).zzb()) {
            zzbdVarZzd.zza(zzbdVar.zza, zzbdVar.zzb, zzbdVar.zzc, zzbdVar.zzd, 0L, zzc.zza, true);
            return zzbdVarZzd;
        }
        zzbdVarZzd.zzf = true;
        return zzbdVarZzd;
    }
}
