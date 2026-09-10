package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes4.dex */
public final class zzgzd {
    public static Executor zza() {
        return zzgyb.INSTANCE;
    }

    public static zzgyw zzb(ExecutorService executorService) {
        if (executorService instanceof zzgyw) {
            return (zzgyw) executorService;
        }
        return executorService instanceof ScheduledExecutorService ? new zzgzc((ScheduledExecutorService) executorService) : new zzgyy(executorService);
    }

    public static zzgyx zzc(ScheduledExecutorService scheduledExecutorService) {
        return new zzgzc(scheduledExecutorService);
    }

    public static Executor zzd(final Executor executor, final zzgxf zzgxfVar) {
        executor.getClass();
        return executor == zzgyb.INSTANCE ? executor : new Executor() { // from class: com.google.android.gms.internal.ads.zzgyz
            @Override // java.util.concurrent.Executor
            public final /* synthetic */ void execute(Runnable runnable) {
                zzgzd.zzf(executor, zzgxfVar, runnable);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void zzf(Executor executor, zzgxf zzgxfVar, Runnable runnable) {
        try {
            executor.execute(runnable);
        } catch (RejectedExecutionException e2) {
            zzgxfVar.zzb(e2);
        }
    }
}
