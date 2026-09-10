package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcvc {
    private final zzddl zza;
    private final zzdfq zzb;

    public zzcvc(zzddl zzddlVar, zzdfq zzdfqVar) {
        this.zza = zzddlVar;
        this.zzb = zzdfqVar;
    }

    public final zzddl zza() {
        return this.zza;
    }

    public final zzdij zzb() {
        zzdfq zzdfqVar = this.zzb;
        return zzdfqVar != null ? new zzdij(zzdfqVar, zzcdo.zzg) : new zzdij(new zzcvb(this), zzcdo.zzg);
    }

    public final zzdfq zzc() {
        return this.zzb;
    }
}
