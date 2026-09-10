package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final class zzelk implements zzijg {
    private final zzijp zza;
    private final zzijp zzb;

    private zzelk(zzijp zzijpVar, zzijp zzijpVar2) {
        this.zza = zzijpVar;
        this.zzb = zzijpVar2;
    }

    public static zzelk zzc(zzijp zzijpVar, zzijp zzijpVar2) {
        return new zzelk(zzijpVar, zzijpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzelj zzb() {
        return new zzelj((Context) this.zza.zzb(), (zzdkz) this.zzb.zzb());
    }
}
