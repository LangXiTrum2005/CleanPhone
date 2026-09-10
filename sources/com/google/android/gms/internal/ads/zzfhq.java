package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfhq {
    private final Clock zza;
    private final zzdxe zzb;
    private final Object zzc = new Object();
    private volatile int zze = 1;
    private volatile long zzd = 0;

    public zzfhq(Clock clock, zzdxe zzdxeVar) {
        this.zza = clock;
        this.zzb = zzdxeVar;
    }

    private final void zze() {
        long jCurrentTimeMillis = this.zza.currentTimeMillis();
        synchronized (this.zzc) {
            try {
                if (this.zze == 3) {
                    if (this.zzd + ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzgO)).longValue() <= jCurrentTimeMillis) {
                        this.zze = 1;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void zzf(int i2, int i3) {
        zze();
        Object obj = this.zzc;
        long jCurrentTimeMillis = this.zza.currentTimeMillis();
        synchronized (obj) {
            try {
                if (this.zze != i2) {
                    return;
                }
                this.zze = i3;
                if (this.zze == 3) {
                    this.zzd = jCurrentTimeMillis;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zza(boolean z2) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzov)).booleanValue()) {
            zzdxd zzdxdVarZza = this.zzb.zza();
            zzdxdVarZza.zzc("action", "mbs_state");
            zzdxdVarZza.zzc("mbs_state", true != z2 ? "0" : "1");
            zzdxdVarZza.zzd();
        }
        if (z2) {
            zzf(1, 2);
        } else {
            zzf(2, 1);
        }
    }

    public final boolean zzb() {
        boolean z2;
        synchronized (this.zzc) {
            zze();
            z2 = this.zze == 2;
        }
        return z2;
    }

    public final boolean zzc() {
        boolean z2;
        synchronized (this.zzc) {
            zze();
            z2 = this.zze == 3;
        }
        return z2;
    }

    public final void zzd() {
        zzf(2, 3);
    }
}
