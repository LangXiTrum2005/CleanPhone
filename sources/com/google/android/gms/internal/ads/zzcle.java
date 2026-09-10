package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcle implements zzijg {
    private final zzijp zza;
    private final zzijp zzb;

    private zzcle(zzijp zzijpVar, zzijp zzijpVar2) {
        this.zza = zzijpVar;
        this.zzb = zzijpVar2;
    }

    public static zzcle zza(zzijp zzijpVar, zzijp zzijpVar2) {
        return new zzcle(zzijpVar, zzijpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzcld((zzckq) this.zza.zzb(), (ScheduledExecutorService) this.zzb.zzb());
    }
}
