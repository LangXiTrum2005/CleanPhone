package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* JADX INFO: loaded from: classes4.dex */
public final class zzevk implements zzijg {
    private final zzijp zza;
    private final zzijp zzb;
    private final zzijp zzc;

    private zzevk(zzijp zzijpVar, zzijp zzijpVar2, zzijp zzijpVar3, zzijp zzijpVar4) {
        this.zza = zzijpVar;
        this.zzb = zzijpVar2;
        this.zzc = zzijpVar4;
    }

    public static zzevk zza(zzijp zzijpVar, zzijp zzijpVar2, zzijp zzijpVar3, zzijp zzijpVar4) {
        return new zzevk(zzijpVar, zzijpVar2, zzijpVar3, zzijpVar4);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzeul(((zzfan) this.zza).zzb(), ((Long) zzbhz.zzh.zze()).longValue(), (Clock) this.zzb.zzb(), zzflk.zzc(), (zzdxe) this.zzc.zzb());
    }
}
