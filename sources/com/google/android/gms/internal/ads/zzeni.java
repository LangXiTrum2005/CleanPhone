package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final class zzeni implements zzijg {
    private final zzijp zza;
    private final zzijp zzb;

    private zzeni(zzijp zzijpVar, zzijp zzijpVar2) {
        this.zza = zzijpVar;
        this.zzb = zzijpVar2;
    }

    public static zzeni zzc(zzijp zzijpVar, zzijp zzijpVar2) {
        return new zzeni(zzijpVar, zzijpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzenh zzb() {
        return new zzenh((Context) this.zza.zzb(), (zzdtj) this.zzb.zzb());
    }
}
