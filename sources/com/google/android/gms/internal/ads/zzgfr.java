package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class zzgfr implements zzijg {
    private final zzijp zza;
    private final zzijp zzb;
    private final zzijp zzc;
    private final zzijp zzd;

    private zzgfr(zzijp zzijpVar, zzijp zzijpVar2, zzijp zzijpVar3, zzijp zzijpVar4) {
        this.zza = zzijpVar;
        this.zzb = zzijpVar2;
        this.zzc = zzijpVar3;
        this.zzd = zzijpVar4;
    }

    public static zzgfr zza(zzijp zzijpVar, zzijp zzijpVar2, zzijp zzijpVar3, zzijp zzijpVar4) {
        return new zzgfr(zzijpVar, zzijpVar2, zzijpVar3, zzijpVar4);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzgfq((zzavs) this.zza.zzb(), (zzgev) this.zzb.zzb(), (Map) this.zzc.zzb(), (zzgnc) this.zzd.zzb());
    }
}
