package com.adcolony.sdk;

import android.content.Context;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
class u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ScheduledExecutorService f9408a = Executors.newSingleThreadScheduledExecutor();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ScheduledFuture<?> f9409b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ScheduledFuture<?> f9410c;
    private final t0 d;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            u0.this.f9409b = null;
            u0.this.e();
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (u0.this.d.g()) {
                com.adcolony.sdk.a.b().r().i();
                u0.this.f9410c = null;
            }
        }
    }

    public u0(t0 t0Var) {
        this.d = t0Var;
    }

    private void d() {
        if (this.f9409b == null) {
            try {
                this.f9409b = this.f9408a.schedule(new a(), this.d.a(), TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e2) {
                new e0.a().a("RejectedExecutionException when scheduling session stop ").a(e2.toString()).a(e0.f9132i);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        new e0.a().a("AdColony session ending, releasing Context.").a(e0.d);
        com.adcolony.sdk.a.b().c(true);
        com.adcolony.sdk.a.a((Context) null);
        this.d.f(true);
        this.d.g(true);
        this.d.j();
        if (com.adcolony.sdk.a.b().r().f()) {
            ScheduledFuture<?> scheduledFuture = this.f9410c;
            if (scheduledFuture != null && !scheduledFuture.isCancelled()) {
                this.f9410c.cancel(false);
            }
            try {
                this.f9410c = this.f9408a.schedule(new b(), 10L, TimeUnit.SECONDS);
            } catch (RejectedExecutionException e2) {
                new e0.a().a("RejectedExecutionException when scheduling message pumping stop ").a(e2.toString()).a(e0.f9132i);
            }
        }
    }

    public void c() {
        a();
    }

    private void a() {
        ScheduledFuture<?> scheduledFuture = this.f9409b;
        if (scheduledFuture == null || scheduledFuture.isCancelled()) {
            return;
        }
        this.f9409b.cancel(false);
        this.f9409b = null;
    }

    public void b() {
        d();
    }
}
