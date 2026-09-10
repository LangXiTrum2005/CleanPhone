package com.google.android.gms.internal.ads;

import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdkb implements zzijg {
    private final zzdjw zza;

    private zzdkb(zzdjw zzdjwVar) {
        this.zza = zzdjwVar;
    }

    public static zzdkb zzc(zzdjw zzdjwVar) {
        return new zzdkb(zzdjwVar);
    }

    public final View zza() {
        return this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* synthetic */ Object zzb() {
        return this.zza.zzd();
    }
}
