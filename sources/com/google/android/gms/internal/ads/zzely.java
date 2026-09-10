package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final class zzely implements zzijg {
    private final zzijp zza;
    private final zzijp zzb;
    private final zzijp zzc;

    private zzely(zzijp zzijpVar, zzijp zzijpVar2, zzijp zzijpVar3) {
        this.zza = zzijpVar;
        this.zzb = zzijpVar2;
        this.zzc = zzijpVar3;
    }

    public static zzely zza(zzijp zzijpVar, zzijp zzijpVar2, zzijp zzijpVar3) {
        return new zzely(zzijpVar, zzijpVar2, zzijpVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzelx((Context) this.zza.zzb(), (zzdlv) this.zzb.zzb(), ((zzcmg) this.zzc).zza());
    }
}
