package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class zzevl implements zzijg {
    private final zzijp zza;
    private final zzijp zzb;
    private final zzijp zzc;

    private zzevl(zzijp zzijpVar, zzijp zzijpVar2, zzijp zzijpVar3) {
        this.zza = zzijpVar;
        this.zzb = zzijpVar2;
        this.zzc = zzijpVar3;
    }

    public static zzevl zza(zzijp zzijpVar, zzijp zzijpVar2, zzijp zzijpVar3) {
        return new zzevl(zzijpVar, zzijpVar2, zzijpVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* bridge */ /* synthetic */ Object zzb() {
        Object objZzb = ((zzerp) this.zza).zzb();
        zzeul zzeulVar = (zzeul) this.zzb.zzb();
        if (true == ((List) this.zzc.zzb()).contains("2")) {
            objZzb = zzeulVar;
        }
        zzijo.zzb(objZzb);
        return objZzb;
    }
}
