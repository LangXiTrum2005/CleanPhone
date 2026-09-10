package com.google.android.gms.internal.ads;

import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
public final class zzgkr implements zzijg {
    private final zzijp zza;

    private zzgkr(zzijp zzijpVar) {
        this.zza = zzijpVar;
    }

    public static zzgkr zza(zzijp zzijpVar) {
        return new zzgkr(zzijpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new File(new File((File) this.zza.zzb(), "drgd"), "pmtd");
    }
}
