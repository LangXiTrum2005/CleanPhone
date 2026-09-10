package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdax extends zzdgi implements zzdao {
    private final ScheduledExecutorService zzb;
    private ScheduledFuture zzc;
    private boolean zzd;

    public zzdax(zzdat zzdatVar, Set set, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        super(set);
        this.zzd = false;
        this.zzb = scheduledExecutorService;
        zzq(zzdatVar, executor);
    }

    public final synchronized void zza() {
        ScheduledFuture scheduledFuture = this.zzc;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
    }

    public final void zzb() {
        this.zzc = this.zzb.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdav
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzf();
            }
        }, ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzmb)).intValue(), TimeUnit.MILLISECONDS);
    }

    @Override // com.google.android.gms.internal.ads.zzdao
    public final void zzc(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzs(new zzdgh() { // from class: com.google.android.gms.internal.ads.zzdaw
            @Override // com.google.android.gms.internal.ads.zzdgh
            public final /* synthetic */ void zza(Object obj) {
                ((zzdao) obj).zzc(zzeVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdao
    public final void zzd(final zzdlg zzdlgVar) {
        if (this.zzd) {
            return;
        }
        ScheduledFuture scheduledFuture = this.zzc;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        zzs(new zzdgh() { // from class: com.google.android.gms.internal.ads.zzdau
            @Override // com.google.android.gms.internal.ads.zzdgh
            public final /* synthetic */ void zza(Object obj) {
                ((zzdao) obj).zzd(zzdlgVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdao
    public final void zze() {
        zzs(zzdap.zza);
    }

    public final /* synthetic */ void zzf() {
        synchronized (this) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Timeout waiting for show call succeed to be called.");
            zzd(new zzdlg("Timeout for show call succeed."));
            this.zzd = true;
        }
    }
}
