package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfqm {
    private final Object zza;
    private final long zzb;
    private final Clock zzc;
    private final long zzd = ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzU)).longValue() * 1000;
    private final double zze;
    private final int zzf;

    public zzfqm(Object obj, Clock clock, double d, int i2) {
        this.zza = obj;
        this.zzc = clock;
        this.zzb = clock.currentTimeMillis();
        this.zze = d;
        this.zzf = i2;
    }

    public final Object zza() {
        return this.zza;
    }

    public final boolean zzb() {
        return this.zzc.currentTimeMillis() >= this.zzb + this.zzd;
    }

    public final long zzc() {
        return (this.zzd + Math.min(Math.max(((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzF)).longValue(), -900000L), 10000L)) - (this.zzc.currentTimeMillis() - this.zzb);
    }

    public final long zzd() {
        return this.zzb;
    }

    public final double zze() {
        return this.zze;
    }

    public final int zzf() {
        return this.zzf;
    }
}
