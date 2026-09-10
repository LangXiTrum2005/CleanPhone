package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfzt implements zzijg {
    private final zzijp zza;

    private zzfzt(zzijp zzijpVar) {
        this.zza = zzijpVar;
    }

    public static zzfzt zza(zzijp zzijpVar) {
        return new zzfzt(zzijpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzgyw zzgywVarZzb = zzgzd.zzb((ExecutorService) this.zza.zzb());
        zzijo.zzb(zzgywVarZzb);
        return zzgywVarZzb;
    }
}
