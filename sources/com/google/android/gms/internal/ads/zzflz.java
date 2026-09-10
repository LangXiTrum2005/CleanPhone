package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes4.dex */
public final class zzflz implements zzijg {
    private final zzijp zza;

    private zzflz(zzijp zzijpVar, zzijp zzijpVar2) {
        this.zza = zzijpVar;
    }

    public static zzflz zza(zzijp zzijpVar, zzijp zzijpVar2) {
        return new zzflz(zzijpVar, zzijpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzfly((ScheduledExecutorService) this.zza.zzb(), zzflk.zzc());
    }
}
