package com.google.common.util.concurrent;

import com.google.common.base.Preconditions;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
class ImmediateFuture<V> implements ListenableFuture<V> {

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final ListenableFuture f20132Y = new ImmediateFuture(null);
    public static final LazyLogger Z = new LazyLogger(ImmediateFuture.class);
    public final Object X;

    public static final class ImmediateCancelledFuture<V> extends AbstractFuture.TrustedFuture<V> {
        static {
            if (AbstractFuture.e0) {
                return;
            }
            new ImmediateCancelledFuture().cancel(false);
        }
    }

    public static final class ImmediateFailedFuture<V> extends AbstractFuture.TrustedFuture<V> {
    }

    public ImmediateFuture(Object obj) {
        this.X = obj;
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void addListener(Runnable runnable, Executor executor) {
        Preconditions.j(runnable, "Runnable was null.");
        Preconditions.j(executor, "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (Exception e2) {
            Z.a().log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e2);
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z2) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.X;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=SUCCESS, result=[");
        return android.support.v4.media.a.q(sb, this.X, "]]");
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        return this.X;
    }
}
