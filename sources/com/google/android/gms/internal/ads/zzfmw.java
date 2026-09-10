package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfmw implements zzijg {
    private final zzijp zza;
    private final zzijp zzb;

    private zzfmw(zzijp zzijpVar, zzijp zzijpVar2, zzijp zzijpVar3) {
        this.zza = zzijpVar2;
        this.zzb = zzijpVar3;
    }

    public static zzfmw zza(zzijp zzijpVar, zzijp zzijpVar2, zzijp zzijpVar3) {
        return new zzfmw(zzijpVar, zzijpVar2, zzijpVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzfmu(zzflk.zzc(), (ScheduledExecutorService) this.zza.zzb(), ((zzfmx) this.zzb).zzb());
    }
}
