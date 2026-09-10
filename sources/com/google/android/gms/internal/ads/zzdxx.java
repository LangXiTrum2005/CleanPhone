package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdxx implements zzijg {
    private final zzdxt zza;
    private final zzijp zzb;

    private zzdxx(zzdxt zzdxtVar, zzijp zzijpVar, zzijp zzijpVar2) {
        this.zza = zzdxtVar;
        this.zzb = zzijpVar;
    }

    public static zzdxx zza(zzdxt zzdxtVar, zzijp zzijpVar, zzijp zzijpVar2) {
        return new zzdxx(zzdxtVar, zzijpVar, zzijpVar2);
    }

    public static Set zzc(zzdxt zzdxtVar, zzdyd zzdydVar, Executor executor) {
        Set setZzd = zzdxt.zzd(zzdydVar, executor);
        zzijo.zzb(setZzd);
        return setZzd;
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* bridge */ /* synthetic */ Object zzb() {
        return zzc(this.zza, (zzdyd) this.zzb.zzb(), zzflk.zzc());
    }
}
