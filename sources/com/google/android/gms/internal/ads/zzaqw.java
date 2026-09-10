package com.google.android.gms.internal.ads;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: loaded from: classes4.dex */
public final class zzaqw extends Thread {
    private static final boolean zza = zzarw.zzb;
    private final BlockingQueue zzb;
    private final BlockingQueue zzc;
    private final zzaqu zzd;
    private volatile boolean zze = false;
    private final zzarx zzf;
    private final zzarb zzg;

    public zzaqw(BlockingQueue blockingQueue, BlockingQueue blockingQueue2, zzaqu zzaquVar, zzarb zzarbVar) {
        this.zzb = blockingQueue;
        this.zzc = blockingQueue2;
        this.zzd = zzaquVar;
        this.zzg = zzarbVar;
        this.zzf = new zzarx(this, blockingQueue2, zzarbVar);
    }

    private void zzc() throws InterruptedException {
        zzark zzarkVar = (zzark) this.zzb.take();
        zzarkVar.zzc("cache-queue-take");
        zzarkVar.zze(1);
        try {
            zzarkVar.zzl();
            zzaqu zzaquVar = this.zzd;
            zzaqt zzaqtVarZza = zzaquVar.zza(zzarkVar.zzi());
            if (zzaqtVarZza == null) {
                zzarkVar.zzc("cache-miss");
                if (!this.zzf.zzc(zzarkVar)) {
                    this.zzc.put(zzarkVar);
                }
            } else {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (zzaqtVarZza.zza(jCurrentTimeMillis)) {
                    zzarkVar.zzc("cache-hit-expired");
                    zzarkVar.zzj(zzaqtVarZza);
                    if (!this.zzf.zzc(zzarkVar)) {
                        this.zzc.put(zzarkVar);
                    }
                } else {
                    zzarkVar.zzc("cache-hit");
                    zzarq zzarqVarZzr = zzarkVar.zzr(new zzarg(zzaqtVarZza.zza, zzaqtVarZza.zzg));
                    zzarkVar.zzc("cache-hit-parsed");
                    if (!zzarqVarZzr.zzc()) {
                        zzarkVar.zzc("cache-parsing-failed");
                        zzaquVar.zzd(zzarkVar.zzi(), true);
                        zzarkVar.zzj(null);
                        if (!this.zzf.zzc(zzarkVar)) {
                            this.zzc.put(zzarkVar);
                        }
                    } else if (zzaqtVarZza.zzf < jCurrentTimeMillis) {
                        zzarkVar.zzc("cache-hit-refresh-needed");
                        zzarkVar.zzj(zzaqtVarZza);
                        zzarqVarZzr.zzd = true;
                        if (this.zzf.zzc(zzarkVar)) {
                            this.zzg.zza(zzarkVar, zzarqVarZzr, null);
                        } else {
                            this.zzg.zza(zzarkVar, zzarqVarZzr, new zzaqv(this, zzarkVar));
                        }
                    } else {
                        this.zzg.zza(zzarkVar, zzarqVarZzr, null);
                    }
                }
            }
        } finally {
            zzarkVar.zze(2);
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (zza) {
            zzarw.zza("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.zzd.zzc();
        while (true) {
            try {
                zzc();
            } catch (InterruptedException unused) {
                if (this.zze) {
                    Thread.currentThread().interrupt();
                    return;
                }
                zzarw.zzc("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }

    public final void zza() {
        this.zze = true;
        interrupt();
    }

    public final /* synthetic */ BlockingQueue zzb() {
        return this.zzc;
    }
}
