package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdya implements zzijg {
    private final zzijp zza;

    private zzdya(zzdxt zzdxtVar, zzijp zzijpVar, zzijp zzijpVar2) {
        this.zza = zzijpVar;
    }

    public static zzdya zza(zzdxt zzdxtVar, zzijp zzijpVar, zzijp zzijpVar2) {
        return new zzdya(zzdxtVar, zzijpVar, zzijpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set setZzg = zzdxt.zzg((zzdyd) this.zza.zzb(), zzflk.zzc());
        zzijo.zzb(setZzg);
        return setZzg;
    }
}
