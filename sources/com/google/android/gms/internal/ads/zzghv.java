package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final class zzghv implements zzijg {
    private final zzijp zza;
    private final zzijp zzb;

    private zzghv(zzijp zzijpVar, zzijp zzijpVar2) {
        this.zza = zzijpVar;
        this.zzb = zzijpVar2;
    }

    public static zzghv zza(zzijp zzijpVar, zzijp zzijpVar2) {
        return new zzghv(zzijpVar, zzijpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzbbq zzbbqVarZzb = zzfvc.zzb((Context) this.zza.zzb(), (zzfuf) this.zzb.zzb());
        zzijo.zzb(zzbbqVarZzb);
        return zzbbqVarZzb;
    }
}
