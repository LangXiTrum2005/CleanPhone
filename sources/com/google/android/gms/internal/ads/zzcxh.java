package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcxh implements zzijg {
    private final zzijp zza;

    private zzcxh(zzijp zzijpVar, zzijp zzijpVar2) {
        this.zza = zzijpVar;
    }

    public static zzcxh zza(zzijp zzijpVar, zzijp zzijpVar2) {
        return new zzcxh(zzijpVar, zzijpVar2);
    }

    public static zzdij zzc(zzcrm zzcrmVar, Executor executor) {
        return new zzdij(zzcrmVar, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* bridge */ /* synthetic */ Object zzb() {
        return zzc((zzcrm) this.zza.zzb(), zzflk.zzc());
    }
}
