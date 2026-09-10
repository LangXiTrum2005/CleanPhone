package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcuv implements zzijg {
    private final zzijp zza;
    private final zzijp zzb;

    private zzcuv(zzijp zzijpVar, zzijp zzijpVar2) {
        this.zza = zzijpVar;
        this.zzb = zzijpVar2;
    }

    public static zzcuv zzc(zzijp zzijpVar, zzijp zzijpVar2) {
        return new zzcuv(zzijpVar, zzijpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzcuu zzb() {
        return new zzcuu(((zzcua) this.zza).zza(), (Executor) this.zzb.zzb());
    }
}
