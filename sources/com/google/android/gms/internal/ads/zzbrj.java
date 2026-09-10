package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzbrj implements zzcdx {
    final /* synthetic */ zzbrl zza;

    public zzbrj(zzbrl zzbrlVar) {
        Objects.requireNonNull(zzbrlVar);
        this.zza = zzbrlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcdx
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        com.google.android.gms.ads.internal.util.zze.zza("Releasing engine reference.");
        this.zza.zzb().zzb();
    }
}
