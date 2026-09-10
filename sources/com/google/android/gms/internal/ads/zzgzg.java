package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
final class zzgzg implements Runnable {
    zzgzi zza;

    public zzgzg(zzgzi zzgziVar) {
        this.zza = zzgziVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ListenableFuture listenableFutureZzf;
        zzgzi zzgziVar = this.zza;
        if (zzgziVar == null || (listenableFutureZzf = zzgziVar.zzf()) == null) {
            return;
        }
        this.zza = null;
        if (listenableFutureZzf.isDone()) {
            zzgziVar.zzk(listenableFutureZzf);
            return;
        }
        try {
            ScheduledFuture scheduledFutureZzx = zzgziVar.zzx();
            zzgziVar.zzy(null);
            String string = "Timed out";
            if (scheduledFutureZzx != null) {
                try {
                    long jAbs = Math.abs(scheduledFutureZzx.getDelay(TimeUnit.MILLISECONDS));
                    if (jAbs > 10) {
                        StringBuilder sb = new StringBuilder(String.valueOf(jAbs).length() + 55);
                        sb.append("Timed out (timeout delayed by ");
                        sb.append(jAbs);
                        sb.append(" ms after scheduled time)");
                        string = sb.toString();
                    }
                } catch (Throwable th) {
                    zzgziVar.zzb(new zzgzh(string, null));
                    throw th;
                }
            }
            String string2 = listenableFutureZzf.toString();
            StringBuilder sb2 = new StringBuilder(string.length() + 2 + string2.length());
            sb2.append(string);
            sb2.append(": ");
            sb2.append(string2);
            zzgziVar.zzb(new zzgzh(sb2.toString(), null));
            listenableFutureZzf.cancel(true);
        } catch (Throwable th2) {
            listenableFutureZzf.cancel(true);
            throw th2;
        }
    }
}
