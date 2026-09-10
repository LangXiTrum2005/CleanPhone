package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdwg implements zzfmv {
    private final Map zza;
    private final zzbfj zzb;

    public zzdwg(zzbfj zzbfjVar, Map map) {
        this.zza = map;
        this.zzb = zzbfjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfmv
    public final void zzdK(zzfmo zzfmoVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzfmv
    public final void zzdL(zzfmo zzfmoVar, String str) {
        Map map = this.zza;
        if (map.containsKey(zzfmoVar)) {
            this.zzb.zzc(((zzdwf) map.get(zzfmoVar)).zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfmv
    public final void zzdM(zzfmo zzfmoVar, String str, Throwable th) {
        Map map = this.zza;
        if (map.containsKey(zzfmoVar)) {
            this.zzb.zzc(((zzdwf) map.get(zzfmoVar)).zzc);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfmv
    public final void zzdN(zzfmo zzfmoVar, String str) {
        Map map = this.zza;
        if (map.containsKey(zzfmoVar)) {
            this.zzb.zzc(((zzdwf) map.get(zzfmoVar)).zzb);
        }
    }
}
