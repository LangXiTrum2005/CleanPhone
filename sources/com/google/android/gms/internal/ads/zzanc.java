package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
final class zzanc implements zzalt {
    private final zzamv zza;
    private final long[] zzb;
    private final Map zzc;
    private final Map zzd;
    private final Map zze;

    public zzanc(zzamv zzamvVar, Map map, Map map2, Map map3) {
        this.zza = zzamvVar;
        this.zzd = map2;
        this.zze = map3;
        this.zzc = Collections.unmodifiableMap(map);
        this.zzb = zzamvVar.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzalt
    public final int zza() {
        return this.zzb.length;
    }

    @Override // com.google.android.gms.internal.ads.zzalt
    public final long zzb(int i2) {
        return this.zzb[i2];
    }

    @Override // com.google.android.gms.internal.ads.zzalt
    public final List zzc(long j) {
        return this.zza.zzh(j, this.zzc, this.zzd, this.zze);
    }
}
