package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfbi implements zzijg {
    private final zzijp zza;
    private final zzijp zzb;
    private final zzijp zzc;

    private zzfbi(zzijp zzijpVar, zzijp zzijpVar2, zzijp zzijpVar3, zzijp zzijpVar4, zzijp zzijpVar5) {
        this.zza = zzijpVar;
        this.zzb = zzijpVar3;
        this.zzc = zzijpVar4;
    }

    public static zzfbi zza(zzijp zzijpVar, zzijp zzijpVar2, zzijp zzijpVar3, zzijp zzijpVar4, zzijp zzijpVar5) {
        return new zzfbi(zzijpVar, zzijpVar2, zzijpVar3, zzijpVar4, zzijpVar5);
    }

    public static zzfbg zzc(String str, zzbem zzbemVar, zzcda zzcdaVar, ScheduledExecutorService scheduledExecutorService, zzgyw zzgywVar) {
        return new zzfbg(str, zzbemVar, zzcdaVar, scheduledExecutorService, zzgywVar);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzfbg(((zzfcd) this.zza).zza(), zzcpb.zza(), (zzcda) this.zzb.zzb(), (ScheduledExecutorService) this.zzc.zzb(), zzflk.zzc());
    }
}
