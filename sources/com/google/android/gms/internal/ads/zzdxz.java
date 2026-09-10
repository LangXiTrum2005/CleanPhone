package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdxz implements zzijg {
    private final zzijp zza;

    private zzdxz(zzdxt zzdxtVar, zzijp zzijpVar, zzijp zzijpVar2) {
        this.zza = zzijpVar;
    }

    public static zzdxz zza(zzdxt zzdxtVar, zzijp zzijpVar, zzijp zzijpVar2) {
        return new zzdxz(zzdxtVar, zzijpVar, zzijpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set setZzf = zzdxt.zzf((zzdyd) this.zza.zzb(), zzflk.zzc());
        zzijo.zzb(setZzf);
        return setZzf;
    }
}
