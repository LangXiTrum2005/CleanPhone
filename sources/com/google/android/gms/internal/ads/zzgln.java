package com.google.android.gms.internal.ads;

import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
public final class zzgln implements zzijg {
    private final zzijp zza;

    private zzgln(zzijp zzijpVar) {
        this.zza = zzijpVar;
    }

    public static zzgln zza(zzijp zzijpVar) {
        return new zzgln(zzijpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new File(new File((File) this.zza.zzb(), "ocs"), "pmtd");
    }
}
