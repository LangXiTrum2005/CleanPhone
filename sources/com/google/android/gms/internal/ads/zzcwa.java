package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcwa {
    private final zzfic zza;
    private final zzfhr zzb;
    private final String zzc;

    public zzcwa(zzfic zzficVar, zzfhr zzfhrVar, String str) {
        this.zza = zzficVar;
        this.zzb = zzfhrVar;
        this.zzc = str == null ? "com.google.ads.mediation.admob.AdMobAdapter" : str;
    }

    public final zzfic zza() {
        return this.zza;
    }

    public final zzfhr zzb() {
        return this.zzb;
    }

    public final zzfhu zzc() {
        return this.zza.zzb.zzb;
    }

    public final String zzd() {
        return this.zzc;
    }
}
