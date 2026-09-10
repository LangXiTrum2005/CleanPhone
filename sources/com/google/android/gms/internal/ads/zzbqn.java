package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzbqn implements zzbnn {
    final /* synthetic */ zzbqu zza;
    private final zzbnn zzb;

    public zzbqn(zzbqu zzbquVar, zzbnn zzbnnVar) {
        Objects.requireNonNull(zzbquVar);
        this.zza = zzbquVar;
        this.zzb = zzbnnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbnn
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        this.zzb.zza(this.zza, map);
    }

    public final /* synthetic */ zzbnn zzb() {
        return this.zzb;
    }
}
