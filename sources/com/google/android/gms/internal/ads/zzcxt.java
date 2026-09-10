package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcxt implements zzijg {
    private final zzijp zza;
    private final zzijp zzb;

    private zzcxt(zzcxs zzcxsVar, zzijp zzijpVar, zzijp zzijpVar2) {
        this.zza = zzijpVar;
        this.zzb = zzijpVar2;
    }

    public static zzcxt zza(zzcxs zzcxsVar, zzijp zzijpVar, zzijp zzijpVar2) {
        return new zzcxt(zzcxsVar, zzijpVar, zzijpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new com.google.android.gms.ads.internal.zzb((Context) this.zza.zzb(), (zzcbk) this.zzb.zzb(), null);
    }
}
