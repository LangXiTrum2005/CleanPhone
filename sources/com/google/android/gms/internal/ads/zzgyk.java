package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes4.dex */
final class zzgyk implements Runnable {
    final Future zza;
    final zzgyj zzb;

    public zzgyk(Future future, zzgyj zzgyjVar) {
        this.zza = future;
        this.zzb = zzgyjVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        Throwable thZza;
        Future future = this.zza;
        if ((future instanceof zzgzo) && (thZza = zzgzp.zza((zzgzo) future)) != null) {
            this.zzb.zza(thZza);
            return;
        }
        try {
            this.zzb.zzb(zzgym.zzs(future));
        } catch (ExecutionException e2) {
            this.zzb.zza(e2.getCause());
        } catch (Throwable th) {
            this.zzb.zza(th);
        }
    }

    public final String toString() {
        zzgpw zzgpwVarZzb = zzgpx.zzb(this);
        zzgpwVarZzb.zza(this.zzb);
        return zzgpwVarZzb.toString();
    }
}
