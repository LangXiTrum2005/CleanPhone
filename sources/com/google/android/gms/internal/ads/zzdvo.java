package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdvo implements zzijg {
    private final zzijp zza;

    private zzdvo(zzijp zzijpVar, zzijp zzijpVar2) {
        this.zza = zzijpVar2;
    }

    public static zzdvo zza(zzijp zzijpVar, zzijp zzijpVar2) {
        return new zzdvo(zzijpVar, zzijpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzgyw zzgywVarZzc = zzflk.zzc();
        Set setSingleton = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzfY)).booleanValue() ? Collections.singleton(new zzdij(((zzdwh) this.zza).zzb(), zzgywVarZzc)) : Collections.EMPTY_SET;
        zzijo.zzb(setSingleton);
        return setSingleton;
    }
}
