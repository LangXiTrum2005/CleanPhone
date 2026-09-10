package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdkc implements zzijg {
    private final zzijp zza;

    private zzdkc(zzdjw zzdjwVar, zzijp zzijpVar) {
        this.zza = zzijpVar;
    }

    public static zzdkc zza(zzdjw zzdjwVar, zzijp zzijpVar) {
        return new zzdkc(zzdjwVar, zzijpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set setSingleton = Collections.singleton(new zzdij((zzczb) this.zza.zzb(), zzcdo.zzg));
        zzijo.zzb(setSingleton);
        return setSingleton;
    }
}
