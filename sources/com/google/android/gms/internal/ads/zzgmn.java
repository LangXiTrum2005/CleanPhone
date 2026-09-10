package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes4.dex */
public final class zzgmn implements zzijg {
    private final zzijp zza;
    private final zzijp zzb;

    private zzgmn(zzijp zzijpVar, zzijp zzijpVar2) {
        this.zza = zzijpVar;
        this.zzb = zzijpVar2;
    }

    public static zzgmn zza(zzijp zzijpVar, zzijp zzijpVar2) {
        return new zzgmn(zzijpVar, zzijpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzgmm((Context) this.zza.zzb(), (ExecutorService) this.zzb.zzb());
    }
}
