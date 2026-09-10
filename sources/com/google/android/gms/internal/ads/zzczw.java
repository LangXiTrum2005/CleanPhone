package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes4.dex */
public final class zzczw implements zzijg {
    private final zzczt zza;

    private zzczw(zzczt zzcztVar) {
        this.zza = zzcztVar;
    }

    public static zzczw zzc(zzczt zzcztVar) {
        return new zzczw(zzcztVar);
    }

    public final Bundle zza() {
        return this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* synthetic */ Object zzb() {
        return this.zza.zzd();
    }
}
