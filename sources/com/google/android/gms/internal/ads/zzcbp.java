package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.Clock;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcbp {
    private final Clock zza;
    private final zzcbn zzb;

    public zzcbp(Clock clock, zzcbn zzcbnVar) {
        this.zza = clock;
        this.zzb = zzcbnVar;
    }

    public static zzcbp zza(Context context) {
        return zzcbx.zzb(context).zza();
    }

    public final void zzb() {
        this.zzb.zza(-1, this.zza.currentTimeMillis());
    }

    public final void zzc(com.google.android.gms.ads.internal.client.zzfv zzfvVar) {
        this.zzb.zza(-1, this.zza.currentTimeMillis());
    }

    public final void zzd(int i2, long j) {
        this.zzb.zza(i2, j);
    }
}
