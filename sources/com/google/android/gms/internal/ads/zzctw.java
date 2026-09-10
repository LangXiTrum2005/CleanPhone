package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class zzctw implements zzijg {
    private final zzijp zza;

    private zzctw(zzctj zzctjVar, zzijp zzijpVar) {
        this.zza = zzijpVar;
    }

    public static zzctw zza(zzctj zzctjVar, zzijp zzijpVar) {
        return new zzctw(zzctjVar, zzijpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set setSingleton = Collections.singleton(new zzdij((zzcuz) this.zza.zzb(), zzcdo.zzg));
        zzijo.zzb(setSingleton);
        return setSingleton;
    }
}
