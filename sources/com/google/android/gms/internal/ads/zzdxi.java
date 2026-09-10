package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdxi implements zzijg {
    private final zzijp zza;
    private final zzijp zzb;
    private final zzijp zzc;

    private zzdxi(zzijp zzijpVar, zzijp zzijpVar2, zzijp zzijpVar3) {
        this.zza = zzijpVar;
        this.zzb = zzijpVar2;
        this.zzc = zzijpVar3;
    }

    public static zzdxi zza(zzijp zzijpVar, zzijp zzijpVar2, zzijp zzijpVar3) {
        return new zzdxi(zzijpVar, zzijpVar2, zzijpVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdxh((zzdwy) this.zza.zzb(), ((zzijs) this.zzb).zzb(), (Clock) this.zzc.zzb());
    }
}
