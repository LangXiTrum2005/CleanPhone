package com.google.android.gms.internal.ads;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: loaded from: classes4.dex */
public final class zzare extends Thread {
    private final BlockingQueue zza;
    private final zzard zzb;
    private final zzaqu zzc;
    private volatile boolean zzd = false;
    private final zzarb zze;

    public zzare(BlockingQueue blockingQueue, zzard zzardVar, zzaqu zzaquVar, zzarb zzarbVar) {
        this.zza = blockingQueue;
        this.zzb = zzardVar;
        this.zzc = zzaquVar;
        this.zze = zzarbVar;
    }

    private void zzb() throws InterruptedException {
        zzark zzarkVar = (zzark) this.zza.take();
        SystemClock.elapsedRealtime();
        zzarkVar.zze(3);
        try {
            try {
                zzarkVar.zzc("network-queue-take");
                zzarkVar.zzl();
                TrafficStats.setThreadStatsTag(zzarkVar.zzb());
                zzarg zzargVarZza = this.zzb.zza(zzarkVar);
                zzarkVar.zzc("network-http-complete");
                if (zzargVarZza.zze && zzarkVar.zzq()) {
                    zzarkVar.zzd("not-modified");
                    zzarkVar.zzw();
                } else {
                    zzarq zzarqVarZzr = zzarkVar.zzr(zzargVarZza);
                    zzarkVar.zzc("network-parse-complete");
                    zzaqt zzaqtVar = zzarqVarZzr.zzb;
                    if (zzaqtVar != null) {
                        this.zzc.zzb(zzarkVar.zzi(), zzaqtVar);
                        zzarkVar.zzc("network-cache-written");
                    }
                    zzarkVar.zzp();
                    this.zze.zza(zzarkVar, zzarqVarZzr, null);
                    zzarkVar.zzv(zzarqVarZzr);
                }
            } catch (zzart e2) {
                SystemClock.elapsedRealtime();
                this.zze.zzb(zzarkVar, e2);
                zzarkVar.zzw();
            } catch (Exception e3) {
                zzarw.zzd(e3, "Unhandled exception %s", e3.toString());
                zzart zzartVar = new zzart(e3);
                SystemClock.elapsedRealtime();
                this.zze.zzb(zzarkVar, zzartVar);
                zzarkVar.zzw();
            }
        } finally {
            zzarkVar.zze(4);
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                zzb();
            } catch (InterruptedException unused) {
                if (this.zzd) {
                    Thread.currentThread().interrupt();
                    return;
                }
                zzarw.zzc("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }

    public final void zza() {
        this.zzd = true;
        interrupt();
    }
}
