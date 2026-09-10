package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdxy implements zzijg {
    private final zzijp zza;

    private zzdxy(zzdxt zzdxtVar, zzijp zzijpVar, zzijp zzijpVar2) {
        this.zza = zzijpVar;
    }

    public static zzdxy zza(zzdxt zzdxtVar, zzijp zzijpVar, zzijp zzijpVar2) {
        return new zzdxy(zzdxtVar, zzijpVar, zzijpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set setZze = zzdxt.zze((zzdyd) this.zza.zzb(), zzflk.zzc());
        zzijo.zzb(setZze);
        return setZze;
    }
}
