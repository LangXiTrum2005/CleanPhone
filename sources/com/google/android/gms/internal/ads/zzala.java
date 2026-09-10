package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzala implements zzafr {
    final /* synthetic */ zzalb zza;

    public /* synthetic */ zzala(zzalb zzalbVar, byte[] bArr) {
        Objects.requireNonNull(zzalbVar);
        this.zza = zzalbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzafr
    public final long zza() {
        zzalb zzalbVar = this.zza;
        return zzalbVar.zzf().zzh(zzalbVar.zzg());
    }

    @Override // com.google.android.gms.internal.ads.zzafr
    public final boolean zzb() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzafr
    public final zzafp zzc(long j) {
        zzalb zzalbVar = this.zza;
        long jZzd = zzalbVar.zzd() + BigInteger.valueOf(zzalbVar.zzf().zzi(j)).multiply(BigInteger.valueOf(zzalbVar.zze() - zzalbVar.zzd())).divide(BigInteger.valueOf(zzalbVar.zzg())).longValue();
        String str = zzfj.zza;
        zzafs zzafsVar = new zzafs(j, Math.max(zzalbVar.zzd(), Math.min(jZzd - 30000, zzalbVar.zze() - 1)));
        return new zzafp(zzafsVar, zzafsVar);
    }
}
