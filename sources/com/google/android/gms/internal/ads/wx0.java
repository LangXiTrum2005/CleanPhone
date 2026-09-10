package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class wx0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qx0 f21614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f21615b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile ScheduledFuture f21616c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ux0 f21617d;

    public wx0(qx0 qx0Var, ScheduledExecutorService scheduledExecutorService, long j10, ux0 ux0Var) {
        this.f21617d = ux0Var;
        this.f21614a = qx0Var;
        if (j10 > 0) {
            this.f21616c = scheduledExecutorService.schedule(new o1(this, qx0Var, ux0Var, 10), j10, TimeUnit.MILLISECONDS);
        }
    }

    public final void a() {
        if (this.f21615b.compareAndSet(false, true)) {
            if (this.f21616c != null) {
                this.f21616c.cancel(false);
            }
            this.f21614a.b(this.f21617d, false);
        }
    }
}
