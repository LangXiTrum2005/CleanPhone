package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes4.dex */
public final class zzgbs implements zzijg {
    private final zzijp zza;

    private zzgbs(zzijp zzijpVar) {
        this.zza = zzijpVar;
    }

    public static zzgbs zza(zzijp zzijpVar) {
        return new zzgbs(zzijpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzgca((ExecutorService) this.zza.zzb());
    }
}
