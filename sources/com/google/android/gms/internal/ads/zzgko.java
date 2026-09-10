package com.google.android.gms.internal.ads;

import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
public final class zzgko implements zzijg {
    private final zzijp zza;

    private zzgko(zzijp zzijpVar) {
        this.zza = zzijpVar;
    }

    public static zzgko zza(zzijp zzijpVar) {
        return new zzgko(zzijpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new File(new File((File) this.zza.zzb(), "drgd"), "pcam.jar.d");
    }
}
