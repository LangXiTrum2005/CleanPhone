package com.google.android.gms.internal.ads;

import com.p004ironsource.d9;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes4.dex */
abstract class zzgyt extends AtomicReference implements Runnable {
    private static final Runnable zza = new zzgys(null);
    private static final Runnable zzb = new zzgys(null);

    private final void zzb(Thread thread) {
        Runnable runnable = (Runnable) get();
        zzgyr zzgyrVar = null;
        boolean z2 = false;
        int i2 = 0;
        while (true) {
            if (!(runnable instanceof zzgyr)) {
                if (runnable != zzb) {
                    break;
                }
            } else {
                zzgyrVar = (zzgyr) runnable;
            }
            i2++;
            if (i2 > 1000) {
                Runnable runnable2 = zzb;
                if (runnable == runnable2 || compareAndSet(runnable, runnable2)) {
                    z2 = Thread.interrupted() || z2;
                    LockSupport.park(zzgyrVar);
                }
            } else {
                Thread.yield();
            }
            runnable = (Runnable) get();
        }
        if (z2) {
            thread.interrupt();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Thread threadCurrentThread = Thread.currentThread();
        Object objZza = null;
        if (compareAndSet(null, threadCurrentThread)) {
            boolean zZzd = zzd();
            if (!zZzd) {
                try {
                    objZza = zza();
                } catch (Throwable th) {
                    try {
                        zzgze.zza(th);
                        if (!compareAndSet(threadCurrentThread, zza)) {
                            zzb(threadCurrentThread);
                        }
                        zzg(th);
                        return;
                    } catch (Throwable th2) {
                        if (!compareAndSet(threadCurrentThread, zza)) {
                            zzb(threadCurrentThread);
                        }
                        zzf(null);
                        throw th2;
                    }
                }
            }
            if (!compareAndSet(threadCurrentThread, zza)) {
                zzb(threadCurrentThread);
            }
            if (zZzd) {
                return;
            }
            zzf(objZza);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String strS;
        Runnable runnable = (Runnable) get();
        if (runnable == zza) {
            strS = "running=[DONE]";
        } else if (runnable instanceof zzgyr) {
            strS = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            String name = ((Thread) runnable).getName();
            strS = android.support.v4.media.a.s(new StringBuilder(String.valueOf(name).length() + 21), "running=[RUNNING ON ", name, d9.i.f24752e);
        } else {
            strS = "running=[NOT STARTED YET]";
        }
        String strZzc = zzc();
        return android.support.v4.media.a.s(new StringBuilder(strS.length() + 2 + String.valueOf(strZzc).length()), strS, ", ", strZzc);
    }

    public abstract Object zza() throws Exception;

    public abstract String zzc();

    public abstract boolean zzd();

    public abstract void zzf(Object obj);

    public abstract void zzg(Throwable th);

    public final void zzh() {
        Runnable runnable = (Runnable) get();
        if (runnable instanceof Thread) {
            zzgyr zzgyrVar = new zzgyr(this, null);
            zzgyrVar.zza(Thread.currentThread());
            if (compareAndSet(runnable, zzgyrVar)) {
                try {
                    ((Thread) runnable).interrupt();
                    if (((Runnable) getAndSet(zza)) == zzb) {
                    }
                } finally {
                    if (((Runnable) getAndSet(zza)) == zzb) {
                        LockSupport.unpark((Thread) runnable);
                    }
                }
            }
        }
    }
}
