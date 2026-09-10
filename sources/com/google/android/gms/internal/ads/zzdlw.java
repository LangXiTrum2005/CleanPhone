package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdlw implements zzijg {
    private final zzijp zza;

    private zzdlw(zzijp zzijpVar) {
        this.zza = zzijpVar;
    }

    public static zzdlw zza(zzijp zzijpVar) {
        return new zzdlw(zzijpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set setSingleton = ((zzdlt) this.zza).zza().zzd() != null ? Collections.singleton("banner") : Collections.EMPTY_SET;
        zzijo.zzb(setSingleton);
        return setSingleton;
    }
}
