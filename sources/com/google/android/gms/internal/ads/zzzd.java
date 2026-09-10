package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
final class zzzd implements Comparable {
    private final boolean zza;
    private final boolean zzb;

    public zzzd(zzv zzvVar, int i2) {
        this.zza = 1 == (zzvVar.zze & 1);
        this.zzb = zzmk.zzaa(i2, false);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzzd zzzdVar) {
        return zzgsq.zzg().zzd(this.zzb, zzzdVar.zzb).zzd(this.zza, zzzdVar.zza).zze();
    }
}
