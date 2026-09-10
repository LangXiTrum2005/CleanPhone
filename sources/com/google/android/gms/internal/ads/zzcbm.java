package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcbm implements zzijg {
    private final zzijp zza;
    private final zzijp zzb;

    private zzcbm(zzijp zzijpVar, zzijp zzijpVar2) {
        this.zza = zzijpVar;
        this.zzb = zzijpVar2;
    }

    public static zzcbm zza(zzijp zzijpVar, zzijp zzijpVar2) {
        return new zzcbm(zzijpVar, zzijpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzcbl((Context) this.zza.zzb(), (com.google.android.gms.ads.internal.util.zzg) this.zzb.zzb());
    }
}
