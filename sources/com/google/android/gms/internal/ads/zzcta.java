package com.google.android.gms.internal.ads;

import android.view.ViewGroup;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcta implements zzijg {
    private final zzcsz zza;

    private zzcta(zzcsz zzcszVar) {
        this.zza = zzcszVar;
    }

    public static zzcta zzc(zzcsz zzcszVar) {
        return new zzcta(zzcszVar);
    }

    public final ViewGroup zza() {
        return this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* synthetic */ Object zzb() {
        return this.zza.zza();
    }
}
