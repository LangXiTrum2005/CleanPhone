package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes4.dex */
abstract class zzgxz extends zzgyt {
    private final Executor zza;
    final /* synthetic */ zzgya zzb;

    public zzgxz(zzgya zzgyaVar, Executor executor) {
        Objects.requireNonNull(zzgyaVar);
        this.zzb = zzgyaVar;
        executor.getClass();
        this.zza = executor;
    }

    public abstract void zzb(Object obj);

    @Override // com.google.android.gms.internal.ads.zzgyt
    public final boolean zzd() {
        return this.zzb.isDone();
    }

    public final void zze() {
        try {
            this.zza.execute(this);
        } catch (RejectedExecutionException e2) {
            this.zzb.zzb(e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgyt
    public final void zzf(Object obj) {
        this.zzb.zzD(null);
        zzb(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgyt
    public final void zzg(Throwable th) {
        zzgya zzgyaVar = this.zzb;
        zzgyaVar.zzD(null);
        if (th instanceof ExecutionException) {
            zzgyaVar.zzb(((ExecutionException) th).getCause());
        } else if (th instanceof CancellationException) {
            zzgyaVar.cancel(false);
        } else {
            zzgyaVar.zzb(th);
        }
    }
}
