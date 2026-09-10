package com.google.android.gms.internal.ads;

import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
public final class zzgks implements zzijg {
    private final zzijp zza;

    private zzgks(zzijp zzijpVar) {
        this.zza = zzijpVar;
    }

    public static zzgks zza(zzijp zzijpVar) {
        return new zzgks(zzijpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new File(new File(new File((File) this.zza.zzb(), "drgd"), "v"), "pcopt");
    }
}
