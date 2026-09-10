package com.google.firebase.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b implements DelegatingScheduledFuture.Resolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DelegatingScheduledExecutorService f20260b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f20261c;
    public final /* synthetic */ TimeUnit d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f20262e;

    public /* synthetic */ b(DelegatingScheduledExecutorService delegatingScheduledExecutorService, Object obj, long j, TimeUnit timeUnit, int i2) {
        this.f20259a = i2;
        this.f20260b = delegatingScheduledExecutorService;
        this.f20262e = obj;
        this.f20261c = j;
        this.d = timeUnit;
    }

    @Override // com.google.firebase.concurrent.DelegatingScheduledFuture.Resolver
    public final ScheduledFuture a(final DelegatingScheduledFuture.AnonymousClass1 anonymousClass1) {
        switch (this.f20259a) {
            case 0:
                DelegatingScheduledExecutorService delegatingScheduledExecutorService = this.f20260b;
                return delegatingScheduledExecutorService.f20248Y.schedule(new e(delegatingScheduledExecutorService, (Runnable) this.f20262e, anonymousClass1, 1), this.f20261c, this.d);
            default:
                final DelegatingScheduledExecutorService delegatingScheduledExecutorService2 = this.f20260b;
                final Callable callable = (Callable) this.f20262e;
                return delegatingScheduledExecutorService2.f20248Y.schedule(new Callable() { // from class: com.google.firebase.concurrent.f
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        DelegatingScheduledExecutorService delegatingScheduledExecutorService3 = delegatingScheduledExecutorService2;
                        return delegatingScheduledExecutorService3.X.submit(new a(1, callable, anonymousClass1));
                    }
                }, this.f20261c, this.d);
        }
    }
}
