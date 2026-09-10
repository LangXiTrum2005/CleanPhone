package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdxv implements zzijg {
    private final zzijp zza;

    private zzdxv(zzdxt zzdxtVar, zzijp zzijpVar, zzijp zzijpVar2) {
        this.zza = zzijpVar;
    }

    public static zzdxv zza(zzdxt zzdxtVar, zzijp zzijpVar, zzijp zzijpVar2) {
        return new zzdxv(zzdxtVar, zzijpVar, zzijpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set setZzb = zzdxt.zzb((zzdyd) this.zza.zzb(), zzflk.zzc());
        zzijo.zzb(setZzb);
        return setZzb;
    }
}
