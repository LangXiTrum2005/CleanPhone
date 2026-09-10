package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdks implements zzijg {
    private final zzdjw zza;
    private final zzijp zzb;

    private zzdks(zzdjw zzdjwVar, zzijp zzijpVar) {
        this.zza = zzdjwVar;
        this.zzb = zzijpVar;
    }

    public static zzdks zza(zzdjw zzdjwVar, zzijp zzijpVar) {
        return new zzdks(zzdjwVar, zzijpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* bridge */ /* synthetic */ Object zzb() {
        return this.zza.zzg((Executor) this.zzb.zzb());
    }
}
