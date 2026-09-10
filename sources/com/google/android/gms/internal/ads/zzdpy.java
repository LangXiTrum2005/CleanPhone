package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdpy implements zzijg {
    private final zzijp zza;
    private final zzijp zzb;

    private zzdpy(zzdpq zzdpqVar, zzijp zzijpVar, zzijp zzijpVar2) {
        this.zza = zzijpVar;
        this.zzb = zzijpVar2;
    }

    public static zzdpy zza(zzdpq zzdpqVar, zzijp zzijpVar, zzijp zzijpVar2) {
        return new zzdpy(zzdpqVar, zzijpVar, zzijpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdij(((zzdta) this.zza).zzb(), (Executor) this.zzb.zzb());
    }
}
