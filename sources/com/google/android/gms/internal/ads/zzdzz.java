package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdzz implements zzijg {
    private final zzijp zza;

    private zzdzz(zzijp zzijpVar, zzijp zzijpVar2) {
        this.zza = zzijpVar;
    }

    public static zzdzz zza(zzijp zzijpVar, zzijp zzijpVar2) {
        return new zzdzz(zzijpVar, zzijpVar2);
    }

    public static zzdij zzc(zzdzy zzdzyVar, Executor executor) {
        return new zzdij(zzdzyVar, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* bridge */ /* synthetic */ Object zzb() {
        return zzc((zzdzy) this.zza.zzb(), zzflk.zzc());
    }
}
