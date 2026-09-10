package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcqn implements zzijg {
    private final zzijp zza;

    private zzcqn(zzijp zzijpVar) {
        this.zza = zzijpVar;
    }

    public static zzcqn zza(zzijp zzijpVar) {
        return new zzcqn(zzijpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzcqm((Context) this.zza.zzb());
    }
}
