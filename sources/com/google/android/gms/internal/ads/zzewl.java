package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes4.dex */
public final class zzewl implements zzijg {
    private final zzijp zza;
    private final zzijp zzb;

    private zzewl(zzijp zzijpVar, zzijp zzijpVar2) {
        this.zza = zzijpVar;
        this.zzb = zzijpVar2;
    }

    public static zzewl zza(zzijp zzijpVar, zzijp zzijpVar2) {
        return new zzewl(zzijpVar, zzijpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzeyj(((zzezu) this.zza).zzb(), ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zznu)).intValue(), (ScheduledExecutorService) this.zzb.zzb());
    }
}
