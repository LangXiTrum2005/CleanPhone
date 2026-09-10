package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdkk implements zzijg {
    private final zzdjw zza;
    private final zzijp zzb;

    private zzdkk(zzdjw zzdjwVar, zzijp zzijpVar) {
        this.zza = zzdjwVar;
        this.zzb = zzijpVar;
    }

    public static zzdkk zza(zzdjw zzdjwVar, zzijp zzijpVar) {
        return new zzdkk(zzdjwVar, zzijpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set setZze = this.zza.zze((zzczb) this.zzb.zzb());
        zzijo.zzb(setZze);
        return setZze;
    }
}
