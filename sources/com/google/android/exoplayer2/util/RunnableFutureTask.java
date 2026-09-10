package com.google.android.exoplayer2.util;

import java.lang.Exception;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class RunnableFutureTask<R, E extends Exception> implements RunnableFuture<R> {
    public final ConditionVariable X = new ConditionVariable(0);

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final ConditionVariable f18962Y = new ConditionVariable(0);
    public final Object Z = new Object();
    public Exception e0;
    public Object f0;
    public Thread g0;
    public boolean h0;

    public void b() {
    }

    public abstract Object c();

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z2) {
        boolean z3;
        synchronized (this.Z) {
            try {
                if (!this.h0) {
                    ConditionVariable conditionVariable = this.f18962Y;
                    synchronized (conditionVariable) {
                        z3 = conditionVariable.f18899b;
                    }
                    if (!z3) {
                        this.h0 = true;
                        b();
                        Thread thread = this.g0;
                        if (thread == null) {
                            this.X.d();
                            this.f18962Y.d();
                        } else if (z2) {
                            thread.interrupt();
                        }
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws ExecutionException {
        this.f18962Y.a();
        if (this.h0) {
            throw new CancellationException();
        }
        if (this.e0 == null) {
            return this.f0;
        }
        throw new ExecutionException(this.e0);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.h0;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        boolean z2;
        ConditionVariable conditionVariable = this.f18962Y;
        synchronized (conditionVariable) {
            z2 = conditionVariable.f18899b;
        }
        return z2;
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        synchronized (this.Z) {
            try {
                if (this.h0) {
                    return;
                }
                this.g0 = Thread.currentThread();
                this.X.d();
                try {
                    try {
                        this.f0 = c();
                        synchronized (this.Z) {
                            this.f18962Y.d();
                            this.g0 = null;
                            Thread.interrupted();
                        }
                    } catch (Exception e2) {
                        this.e0 = e2;
                        synchronized (this.Z) {
                            this.f18962Y.d();
                            this.g0 = null;
                            Thread.interrupted();
                        }
                    }
                } catch (Throwable th) {
                    synchronized (this.Z) {
                        this.f18962Y.d();
                        this.g0 = null;
                        Thread.interrupted();
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws ExecutionException, TimeoutException {
        boolean z2;
        long jConvert = TimeUnit.MILLISECONDS.convert(j, timeUnit);
        ConditionVariable conditionVariable = this.f18962Y;
        synchronized (conditionVariable) {
            try {
                if (jConvert <= 0) {
                    z2 = conditionVariable.f18899b;
                } else {
                    conditionVariable.f18898a.getClass();
                    long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
                    long j2 = jConvert + jElapsedRealtime;
                    if (j2 < jElapsedRealtime) {
                        conditionVariable.a();
                    } else {
                        while (!conditionVariable.f18899b && jElapsedRealtime < j2) {
                            conditionVariable.wait(j2 - jElapsedRealtime);
                            conditionVariable.f18898a.getClass();
                            jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
                        }
                    }
                    z2 = conditionVariable.f18899b;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z2) {
            if (!this.h0) {
                if (this.e0 == null) {
                    return this.f0;
                }
                throw new ExecutionException(this.e0);
            }
            throw new CancellationException();
        }
        throw new TimeoutException();
    }
}
