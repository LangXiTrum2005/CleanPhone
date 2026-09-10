package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcfe {
    private long zzb;
    private final long zza = TimeUnit.MILLISECONDS.toNanos(((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzal)).longValue());
    private boolean zzc = true;

    public final void zza() {
        this.zzc = true;
    }

    public final void zzb(SurfaceTexture surfaceTexture, final zzcep zzcepVar) {
        if (zzcepVar == null) {
            return;
        }
        long timestamp = surfaceTexture.getTimestamp();
        if (!this.zzc) {
            long j = timestamp - this.zzb;
            if (Math.abs(j) < this.zza) {
                return;
            }
        }
        this.zzc = false;
        this.zzb = timestamp;
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcfd
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzcepVar.zzi();
            }
        });
    }
}
