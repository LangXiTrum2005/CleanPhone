package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final class zzekq implements zzijg {
    private final zzijp zza;
    private final zzijp zzb;

    private zzekq(zzijp zzijpVar, zzijp zzijpVar2) {
        this.zza = zzijpVar;
        this.zzb = zzijpVar2;
    }

    public static zzekq zzc(zzijp zzijpVar, zzijp zzijpVar2) {
        return new zzekq(zzijpVar, zzijpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzekp zzb() {
        return new zzekp((Context) this.zza.zzb(), (zzcuh) this.zzb.zzb());
    }
}
