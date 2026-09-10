package com.chartboost.sdk.impl;

import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class z2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f15693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vc f15694b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a3 f15695c;
    public final ng d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final lh f15696e;
    public final Executor f;
    public final y6 g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f15697h;

    public z2(Executor backgroundExecutor, vc factory, a3 reachability, ng timeSource, lh uiPoster, Executor networkExecutor, y6 eventTracker) {
        Intrinsics.f(backgroundExecutor, "backgroundExecutor");
        Intrinsics.f(factory, "factory");
        Intrinsics.f(reachability, "reachability");
        Intrinsics.f(timeSource, "timeSource");
        Intrinsics.f(uiPoster, "uiPoster");
        Intrinsics.f(networkExecutor, "networkExecutor");
        Intrinsics.f(eventTracker, "eventTracker");
        this.f15693a = backgroundExecutor;
        this.f15694b = factory;
        this.f15695c = reachability;
        this.d = timeSource;
        this.f15696e = uiPoster;
        this.f = networkExecutor;
        this.g = eventTracker;
        this.f15697h = w3.f15454b.e();
    }

    public final String a() {
        return this.f15697h;
    }

    public final void a(v2 request) {
        Intrinsics.f(request, "request");
        za.d("Execute request: " + request.e(), null);
        this.f.execute(new uc(this.f15693a, this.f15694b, this.f15695c, this.d, this.f15696e, request, this.g));
    }
}
