package com.google.android.gms.internal.ads;

import android.content.Intent;

/* JADX INFO: loaded from: classes4.dex */
public final class zzexk implements zzijg {
    private final zzijp zza;
    private final zzijp zzb;

    private zzexk(zzijp zzijpVar, zzijp zzijpVar2) {
        this.zza = zzijpVar;
        this.zzb = zzijpVar2;
    }

    public static zzexk zzc(zzijp zzijpVar, zzijp zzijpVar2) {
        return new zzexk(zzijpVar, zzijpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzexi zzb() {
        return new zzexi(((zzclp) this.zza).zza(), (Intent) this.zzb.zzb());
    }
}
