package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzt;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class sv0 implements ii {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ScheduledExecutorService f20055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f20056b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f20057c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f20058d = false;

    public sv0(ScheduledExecutorService scheduledExecutorService, k00 k00Var) {
        this.f20055a = scheduledExecutorService;
        this.f20056b = k00Var;
    }

    public final synchronized void a(Runnable runnable, long j10) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        synchronized (this) {
            try {
                if (!this.f20058d) {
                    zzt.zzg().b(this);
                    this.f20058d = true;
                }
                ((p9.b) zzt.zzk()).getClass();
                rv0 rv0Var = new rv0(this, runnable, System.currentTimeMillis() + timeUnit.toMillis(j10));
                ScheduledFuture<?> scheduledFutureSchedule = this.f20055a.schedule(new x60(rv0Var, 28), j10, timeUnit);
                rv0Var.f19692c = scheduledFutureSchedule;
                this.f20057c.put(scheduledFutureSchedule, rv0Var);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.ii
    public final void zza(boolean z10) {
        if (z10) {
            this.f20056b.execute(new x60(this, 29));
        }
    }
}
