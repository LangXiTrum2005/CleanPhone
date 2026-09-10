package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* JADX INFO: loaded from: classes4.dex */
public final class zzevh implements zzijg {
    private final zzijp zza;
    private final zzijp zzb;

    private zzevh(zzijp zzijpVar, zzijp zzijpVar2) {
        this.zza = zzijpVar;
        this.zzb = zzijpVar2;
    }

    public static zzevh zza(zzijp zzijpVar, zzijp zzijpVar2) {
        return new zzevh(zzijpVar, zzijpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzfhq((Clock) this.zza.zzb(), (zzdxe) this.zzb.zzb());
    }
}
