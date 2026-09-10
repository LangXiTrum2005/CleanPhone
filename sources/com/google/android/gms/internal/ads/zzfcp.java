package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfcp implements zzijg {
    private final zzijp zza;
    private final zzijp zzb;
    private final zzijp zzc;
    private final zzijp zzd;
    private final zzijp zze;
    private final zzijp zzf;

    private zzfcp(zzijp zzijpVar, zzijp zzijpVar2, zzijp zzijpVar3, zzijp zzijpVar4, zzijp zzijpVar5, zzijp zzijpVar6, zzijp zzijpVar7, zzijp zzijpVar8) {
        this.zza = zzijpVar;
        this.zzb = zzijpVar2;
        this.zzc = zzijpVar5;
        this.zzd = zzijpVar6;
        this.zze = zzijpVar7;
        this.zzf = zzijpVar8;
    }

    public static zzfcp zza(zzijp zzijpVar, zzijp zzijpVar2, zzijp zzijpVar3, zzijp zzijpVar4, zzijp zzijpVar5, zzijp zzijpVar6, zzijp zzijpVar7, zzijp zzijpVar8) {
        return new zzfcp(zzijpVar, zzijpVar2, zzijpVar3, zzijpVar4, zzijpVar5, zzijpVar6, zzijpVar7, zzijpVar8);
    }

    public static zzfcn zzc(zzcda zzcdaVar, boolean z2, zzccq zzccqVar, zzgyw zzgywVar, String str, ScheduledExecutorService scheduledExecutorService, int i2, int i3) {
        return new zzfcn(zzcdaVar, z2, zzccqVar, zzgywVar, str, scheduledExecutorService, i2, i3);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzfcn((zzcda) this.zza.zzb(), ((zzfcg) this.zzb).zzb().booleanValue(), zzcpl.zza(), zzflk.zzc(), ((zzfcd) this.zzc).zza(), (ScheduledExecutorService) this.zzd.zzb(), ((zzfci) this.zze).zzb().intValue(), ((zzfcj) this.zzf).zzb().intValue());
    }
}
