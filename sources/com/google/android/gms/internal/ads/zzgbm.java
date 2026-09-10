package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public final class zzgbm implements zzijg {
    private final zzijp zza;
    private final zzijp zzb;

    private zzgbm(zzijp zzijpVar, zzijp zzijpVar2) {
        this.zza = zzijpVar;
        this.zzb = zzijpVar2;
    }

    public static zzgbm zza(zzijp zzijpVar, zzijp zzijpVar2) {
        return new zzgbm(zzijpVar, zzijpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzgbl((Executor) this.zza.zzb(), (zzfzm) this.zzb.zzb());
    }
}
