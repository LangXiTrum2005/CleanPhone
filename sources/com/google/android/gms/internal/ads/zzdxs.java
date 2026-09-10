package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdxs implements zzijg {
    private final zzijp zza;

    private zzdxs(zzijp zzijpVar) {
        this.zza = zzijpVar;
    }

    public static zzdxs zza(zzijp zzijpVar) {
        return new zzdxs(zzijpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdxr((Clock) this.zza.zzb());
    }
}
