package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final class zzczv implements zzijg {
    private final zzczt zza;
    private final zzijp zzb;

    private zzczv(zzczt zzcztVar, zzijp zzijpVar) {
        this.zza = zzcztVar;
        this.zzb = zzijpVar;
    }

    public static zzczv zza(zzczt zzcztVar, zzijp zzijpVar) {
        return new zzczv(zzcztVar, zzijpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* bridge */ /* synthetic */ Object zzb() {
        Context contextZzf = this.zza.zzf(((zzclp) this.zzb).zza());
        zzijo.zzb(contextZzf);
        return contextZzf;
    }
}
