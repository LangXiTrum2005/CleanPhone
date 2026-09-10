package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final class zzccd implements zzijg {
    private final zzijp zza;
    private final zzijp zzb;

    private zzccd(zzijp zzijpVar, zzijp zzijpVar2) {
        this.zza = zzijpVar;
        this.zzb = zzijpVar2;
    }

    public static zzccd zza(zzijp zzijpVar, zzijp zzijpVar2) {
        return new zzccd(zzijpVar, zzijpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzccc((Context) this.zza.zzb(), ((zzcbq) this.zzb).zzb());
    }
}
