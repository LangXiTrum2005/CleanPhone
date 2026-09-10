package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdkr implements zzijg {
    private final zzijp zza;

    private zzdkr(zzijp zzijpVar) {
        this.zza = zzijpVar;
    }

    public static zzdkr zza(zzijp zzijpVar) {
        return new zzdkr(zzijpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set setSingleton = Collections.singleton(new zzdij((zzdlk) this.zza.zzb(), zzcdo.zzg));
        zzijo.zzb(setSingleton);
        return setSingleton;
    }
}
