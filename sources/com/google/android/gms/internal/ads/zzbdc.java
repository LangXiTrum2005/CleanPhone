package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzbdc implements Runnable {
    final /* synthetic */ zzbdd zza;

    public zzbdc(zzbdd zzbddVar) {
        Objects.requireNonNull(zzbddVar);
        this.zza = zzbddVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbdd zzbddVar = this.zza;
        synchronized (zzbddVar.zzf()) {
            if (zzbddVar.zzg().get() && zzbddVar.zzh()) {
                zzbddVar.zzg().set(false);
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzd("App went background");
                Iterator it = zzbddVar.zzi().iterator();
                while (it.hasNext()) {
                    try {
                        ((zzbde) it.next()).zza(false);
                    } catch (Exception e2) {
                        com.google.android.gms.ads.internal.util.client.zzo.zzg("", e2);
                    }
                }
            } else {
                int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzd("App is still foreground");
            }
        }
    }
}
