package androidx.media3.common.util;

import java.lang.Exception;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public abstract class RunnableFutureTask<R, E extends Exception> implements RunnableFuture<R> {
    public Exception X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public Object f5670Y;
    public Thread Z;
    public boolean e0;

    public void b() {
    }

    public abstract Object c();

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z2) {
        throw null;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        throw null;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.e0;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        throw null;
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        throw null;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        TimeUnit.MILLISECONDS.convert(j, timeUnit);
        throw null;
    }
}
