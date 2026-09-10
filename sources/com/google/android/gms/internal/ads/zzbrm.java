package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzbrm implements zzcdx {
    final /* synthetic */ zzbrl zza;

    public zzbrm(zzbrq zzbrqVar, zzbrl zzbrlVar) {
        this.zza = zzbrlVar;
        Objects.requireNonNull(zzbrqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcdx
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        com.google.android.gms.ads.internal.util.zze.zza("Getting a new session for JS Engine.");
        this.zza.zzf(((zzbqm) obj).zzl());
    }
}
