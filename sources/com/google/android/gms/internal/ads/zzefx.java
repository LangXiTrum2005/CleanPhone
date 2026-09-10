package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes4.dex */
public final class zzefx implements zzijg {
    private final zzijp zza;
    private final zzijp zzb;
    private final zzijp zzc;
    private final zzijp zzd;
    private final zzijp zze;

    private zzefx(zzijp zzijpVar, zzijp zzijpVar2, zzijp zzijpVar3, zzijp zzijpVar4, zzijp zzijpVar5, zzijp zzijpVar6, zzijp zzijpVar7, zzijp zzijpVar8) {
        this.zza = zzijpVar;
        this.zzb = zzijpVar4;
        this.zzc = zzijpVar5;
        this.zzd = zzijpVar6;
        this.zze = zzijpVar8;
    }

    public static zzefx zza(zzijp zzijpVar, zzijp zzijpVar2, zzijp zzijpVar3, zzijp zzijpVar4, zzijp zzijpVar5, zzijp zzijpVar6, zzijp zzijpVar7, zzijp zzijpVar8) {
        return new zzefx(zzijpVar, zzijpVar2, zzijpVar3, zzijpVar4, zzijpVar5, zzijpVar6, zzijpVar7, zzijpVar8);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzefw(((zzclp) this.zza).zza(), zzflk.zzc(), zzcmq.zza(), ((zzcmd) this.zzb).zzb(), ((zzegf) this.zzc).zzb(), (ArrayDeque) this.zzd.zzb(), zzcmn.zza(), (zzfnr) this.zze.zzb());
    }
}
