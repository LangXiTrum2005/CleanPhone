package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdos implements zzijg {
    private final zzijp zza;
    private final zzijp zzb;

    private zzdos(zzijp zzijpVar, zzijp zzijpVar2) {
        this.zza = zzijpVar;
        this.zzb = zzijpVar2;
    }

    public static zzdos zza(zzijp zzijpVar, zzijp zzijpVar2) {
        return new zzdos(zzijpVar, zzijpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdor(((zzdmn) this.zza).zza(), (Clock) this.zzb.zzb());
    }
}
