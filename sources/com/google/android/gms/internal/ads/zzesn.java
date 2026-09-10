package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class zzesn implements zzijg {
    private final zzijp zza;

    private zzesn(zzijp zzijpVar) {
        this.zza = zzijpVar;
    }

    public static zzesn zza(zzijp zzijpVar) {
        return new zzesn(zzijpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzesm((Set) this.zza.zzb());
    }
}
