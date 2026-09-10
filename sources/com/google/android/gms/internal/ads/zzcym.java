package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcym implements zzijg {
    private final zzijp zza;
    private final zzijp zzb;

    private zzcym(zzijp zzijpVar, zzijp zzijpVar2) {
        this.zza = zzijpVar;
        this.zzb = zzijpVar2;
    }

    public static zzcym zza(zzijp zzijpVar, zzijp zzijpVar2) {
        return new zzcym(zzijpVar, zzijpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdij((zzdfb) this.zza.zzb(), (Executor) this.zzb.zzb());
    }
}
