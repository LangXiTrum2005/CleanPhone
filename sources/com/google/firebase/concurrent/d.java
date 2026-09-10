package com.google.firebase.concurrent;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class d implements DelegatingScheduledFuture.Resolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DelegatingScheduledExecutorService f20265b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Runnable f20266c;
    public final /* synthetic */ long d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f20267e;
    public final /* synthetic */ TimeUnit f;

    public /* synthetic */ d(DelegatingScheduledExecutorService delegatingScheduledExecutorService, Runnable runnable, long j, long j2, TimeUnit timeUnit, int i2) {
        this.f20264a = i2;
        this.f20265b = delegatingScheduledExecutorService;
        this.f20266c = runnable;
        this.d = j;
        this.f20267e = j2;
        this.f = timeUnit;
    }

    @Override // com.google.firebase.concurrent.DelegatingScheduledFuture.Resolver
    public final ScheduledFuture a(DelegatingScheduledFuture.AnonymousClass1 anonymousClass1) {
        switch (this.f20264a) {
            case 0:
                DelegatingScheduledExecutorService delegatingScheduledExecutorService = this.f20265b;
                return delegatingScheduledExecutorService.f20248Y.scheduleAtFixedRate(new e(delegatingScheduledExecutorService, this.f20266c, anonymousClass1, 0), this.d, this.f20267e, this.f);
            default:
                DelegatingScheduledExecutorService delegatingScheduledExecutorService2 = this.f20265b;
                return delegatingScheduledExecutorService2.f20248Y.scheduleWithFixedDelay(new e(delegatingScheduledExecutorService2, this.f20266c, anonymousClass1, 2), this.d, this.f20267e, this.f);
        }
    }
}
