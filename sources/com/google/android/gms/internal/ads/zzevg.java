package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* JADX INFO: loaded from: classes4.dex */
public final class zzevg implements zzijg {
    private final zzijp zza;
    private final zzijp zzb;

    private zzevg(zzijp zzijpVar, zzijp zzijpVar2, zzijp zzijpVar3, zzijp zzijpVar4) {
        this.zza = zzijpVar2;
        this.zzb = zzijpVar4;
    }

    public static zzevg zza(zzijp zzijpVar, zzijp zzijpVar2, zzijp zzijpVar3, zzijp zzijpVar4) {
        return new zzevg(zzijpVar, zzijpVar2, zzijpVar3, zzijpVar4);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzeul(zzexs.zzc(), ((Long) zzbhz.zzf.zze()).longValue(), (Clock) this.zza.zzb(), zzflk.zzc(), (zzdxe) this.zzb.zzb());
    }
}
