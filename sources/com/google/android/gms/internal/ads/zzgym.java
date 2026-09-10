package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class zzgym extends zzgyo {
    public static ListenableFuture zza(Object obj) {
        return obj == null ? zzgyq.zza : new zzgyq(obj);
    }

    public static ListenableFuture zzb() {
        return zzgyq.zza;
    }

    public static ListenableFuture zzc(Throwable th) {
        th.getClass();
        return new zzgyp(th);
    }

    public static ListenableFuture zzd(Callable callable, Executor executor) {
        zzgzl zzgzlVar = new zzgzl(callable);
        executor.execute(zzgzlVar);
        return zzgzlVar;
    }

    public static ListenableFuture zze(Runnable runnable, Executor executor) {
        zzgzl zzgzlVarZze = zzgzl.zze(runnable, null);
        executor.execute(zzgzlVarZze);
        return zzgzlVarZze;
    }

    public static ListenableFuture zzf(zzgxt zzgxtVar, Executor executor) {
        zzgzl zzgzlVar = new zzgzl(zzgxtVar);
        executor.execute(zzgzlVar);
        return zzgzlVar;
    }

    public static ListenableFuture zzg(ListenableFuture listenableFuture, Class cls, zzgpr zzgprVar, Executor executor) {
        int i2 = zzgxe.zzd;
        zzgxd zzgxdVar = new zzgxd(listenableFuture, cls, zzgprVar);
        listenableFuture.addListener(zzgxdVar, zzgzd.zzd(executor, zzgxdVar));
        return zzgxdVar;
    }

    public static ListenableFuture zzh(ListenableFuture listenableFuture, Class cls, zzgxu zzgxuVar, Executor executor) {
        int i2 = zzgxe.zzd;
        zzgxc zzgxcVar = new zzgxc(listenableFuture, cls, zzgxuVar);
        listenableFuture.addListener(zzgxcVar, zzgzd.zzd(executor, zzgxcVar));
        return zzgxcVar;
    }

    public static ListenableFuture zzi(ListenableFuture listenableFuture, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        return listenableFuture.isDone() ? listenableFuture : zzgzi.zze(listenableFuture, j, timeUnit, scheduledExecutorService);
    }

    public static ListenableFuture zzj(ListenableFuture listenableFuture, zzgxu zzgxuVar, Executor executor) {
        int i2 = zzgxl.zzc;
        zzgxj zzgxjVar = new zzgxj(listenableFuture, zzgxuVar);
        listenableFuture.addListener(zzgxjVar, zzgzd.zzd(executor, zzgxjVar));
        return zzgxjVar;
    }

    public static ListenableFuture zzk(ListenableFuture listenableFuture, zzgpr zzgprVar, Executor executor) {
        int i2 = zzgxl.zzc;
        zzgxk zzgxkVar = new zzgxk(listenableFuture, zzgprVar);
        listenableFuture.addListener(zzgxkVar, zzgzd.zzd(executor, zzgxkVar));
        return zzgxkVar;
    }

    @SafeVarargs
    public static ListenableFuture zzl(ListenableFuture... listenableFutureArr) {
        return new zzgxv(zzgtd.zzr(listenableFutureArr), true);
    }

    public static ListenableFuture zzm(Iterable iterable) {
        return new zzgxv(zzgtd.zzp(iterable), true);
    }

    public static zzgyl zzn(Iterable iterable) {
        return new zzgyl(false, zzgtd.zzp(iterable), null);
    }

    @SafeVarargs
    public static zzgyl zzo(ListenableFuture... listenableFutureArr) {
        return new zzgyl(true, zzgtd.zzr(listenableFutureArr), null);
    }

    public static zzgyl zzp(Iterable iterable) {
        return new zzgyl(true, zzgtd.zzp(iterable), null);
    }

    @SafeVarargs
    public static ListenableFuture zzq(ListenableFuture... listenableFutureArr) {
        return new zzgxv(zzgtd.zzr(listenableFutureArr), false);
    }

    public static void zzr(ListenableFuture listenableFuture, zzgyj zzgyjVar, Executor executor) {
        zzgyjVar.getClass();
        listenableFuture.addListener(new zzgyk(listenableFuture, zzgyjVar), executor);
    }

    public static Object zzs(Future future) throws ExecutionException {
        if (future.isDone()) {
            return zzgzn.zza(future);
        }
        throw new IllegalStateException(zzgqr.zzd("Future was expected to be done: %s", future));
    }

    public static Object zzt(Future future) {
        try {
            return zzgzn.zza(future);
        } catch (ExecutionException e2) {
            if (e2.getCause() instanceof Error) {
                throw new zzgyc((Error) e2.getCause());
            }
            throw new zzgzm(e2.getCause());
        }
    }
}
