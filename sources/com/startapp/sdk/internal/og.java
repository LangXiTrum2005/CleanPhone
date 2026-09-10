package com.startapp.sdk.internal;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public final class og implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Queue f41324a = new ArrayDeque();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f41325b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Runnable f41326c;

    public og(Executor executor) {
        this.f41325b = executor;
    }

    public final synchronized void a() {
        Runnable runnable = (Runnable) ((ArrayDeque) this.f41324a).poll();
        this.f41326c = runnable;
        if (runnable != null) {
            this.f41325b.execute(runnable);
        }
    }

    @Override // java.util.concurrent.Executor
    public final synchronized void execute(Runnable runnable) {
        ((ArrayDeque) this.f41324a).offer(new ng(this, runnable));
        if (this.f41326c == null) {
            a();
        }
    }
}
