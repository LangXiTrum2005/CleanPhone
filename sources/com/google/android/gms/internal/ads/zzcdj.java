package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Looper;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcdj {
    private zzgyw zza;
    private zzdxe zzb;
    private Context zzc;
    private final AtomicBoolean zzd = new AtomicBoolean(false);
    private final AtomicBoolean zze = new AtomicBoolean(false);
    private long zzf = -1;
    private long zzg = -1;

    public final void zza(zzgyw zzgywVar, zzdxe zzdxeVar, Context context) {
        if (this.zzd.getAndSet(true)) {
            return;
        }
        this.zza = zzgywVar;
        this.zzb = zzdxeVar;
        this.zzf = ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzpg)).longValue();
        this.zzg = ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzph)).longValue();
        this.zzc = context;
    }

    public final void zzb() {
        zzgyw zzgywVar;
        if (!this.zzd.get() || this.zzf < 0 || this.zzg < 0 || !this.zze.compareAndSet(false, true) || (zzgywVar = this.zza) == null) {
            return;
        }
        zzgywVar.submit(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcdh
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzc();
            }
        });
    }

    public final /* synthetic */ void zzc() {
        zzdxe zzdxeVar;
        ActivityManager.MemoryInfo memoryInfoZze;
        while (this.zze.get()) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcdg
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    atomicBoolean.getAndSet(true);
                }
            });
            try {
                Thread.sleep(this.zzf);
                if (!atomicBoolean.get()) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzpi)).booleanValue() && (zzdxeVar = this.zzb) != null) {
                        zzdxd zzdxdVarZza = zzdxeVar.zza();
                        zzdxdVarZza.zzc("action", "panr");
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzpK)).booleanValue() && (memoryInfoZze = com.google.android.gms.ads.internal.util.client.zzf.zze(this.zzc)) != null) {
                            zzdxdVarZza.zzc("mem_avl", String.valueOf(memoryInfoZze.availMem));
                            zzdxdVarZza.zzc("mem_tt", String.valueOf(memoryInfoZze.totalMem));
                            zzdxdVarZza.zzc("low_m", true != memoryInfoZze.lowMemory ? "0" : "1");
                        }
                        zzdxdVarZza.zzf();
                    }
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzpj)).booleanValue()) {
                        StackTraceElement[] stackTrace = Looper.getMainLooper().getThread().getStackTrace();
                        zzcdi zzcdiVar = new zzcdi("Potential ANR detected");
                        zzcdiVar.setStackTrace(stackTrace);
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzpk)).booleanValue()) {
                            zzbxv.zzc(this.zzc).zzi(zzcdiVar, "AnrWatchdog", ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzpl)).intValue() / 100.0f);
                        } else {
                            com.google.android.gms.ads.internal.zzt.zzh().zzg(zzcdiVar, "AnrWatchdog");
                        }
                    }
                }
                do {
                    try {
                        Thread.sleep(this.zzg);
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                } while (!atomicBoolean.get());
            } catch (InterruptedException unused2) {
                Thread.currentThread().interrupt();
                return;
            }
        }
    }
}
