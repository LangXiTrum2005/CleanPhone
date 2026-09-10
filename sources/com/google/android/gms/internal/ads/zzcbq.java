package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcbq implements zzijg {
    private final zzijp zza;
    private final zzijp zzb;

    private zzcbq(zzijp zzijpVar, zzijp zzijpVar2) {
        this.zza = zzijpVar;
        this.zzb = zzijpVar2;
    }

    public static zzcbq zzc(zzijp zzijpVar, zzijp zzijpVar2) {
        return new zzcbq(zzijpVar, zzijpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzcbp zzb() {
        return new zzcbp((Clock) this.zza.zzb(), (zzcbn) this.zzb.zzb());
    }
}
