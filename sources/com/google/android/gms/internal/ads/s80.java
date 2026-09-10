package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class s80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f19892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ScheduledExecutorService f19893b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile boolean f19894c = true;

    public s80(k00 k00Var, ScheduledExecutorService scheduledExecutorService, uv0 uv0Var) {
        this.f19892a = k00Var;
        this.f19893b = scheduledExecutorService;
    }
}
