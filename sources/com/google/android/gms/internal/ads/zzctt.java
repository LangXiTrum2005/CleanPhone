package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class zzctt implements zzijg {
    private final zzctj zza;
    private final zzijp zzb;

    private zzctt(zzctj zzctjVar, zzijp zzijpVar) {
        this.zza = zzctjVar;
        this.zzb = zzijpVar;
    }

    public static zzctt zza(zzctj zzctjVar, zzijp zzijpVar) {
        return new zzctt(zzctjVar, zzijpVar);
    }

    public static Set zzc(zzctj zzctjVar, zzcuz zzcuzVar) {
        Set setSingleton = Collections.singleton(new zzdij(zzcuzVar, zzcdo.zzg));
        zzijo.zzb(setSingleton);
        return setSingleton;
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* bridge */ /* synthetic */ Object zzb() {
        return zzc(this.zza, (zzcuz) this.zzb.zzb());
    }
}
