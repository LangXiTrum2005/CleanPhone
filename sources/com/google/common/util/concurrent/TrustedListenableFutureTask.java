package com.google.common.util.concurrent;

import com.p004ironsource.d9;
import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
class TrustedListenableFutureTask<V> extends FluentFuture.TrustedFuture<V> implements RunnableFuture<V> {
    public volatile TrustedFutureInterruptibleTask i0;

    public final class TrustedFutureInterruptibleAsyncTask extends InterruptibleTask<ListenableFuture<V>> {
        @Override // com.google.common.util.concurrent.InterruptibleTask
        public final void a(Throwable th) {
            throw null;
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        public final void b(Object obj) {
            throw null;
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        public final boolean d() {
            throw null;
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        public final Object g() {
            throw null;
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        public final String h() {
            throw null;
        }
    }

    public final class TrustedFutureInterruptibleTask extends InterruptibleTask<V> {
        public final Callable Z;

        public TrustedFutureInterruptibleTask(Callable callable) {
            callable.getClass();
            this.Z = callable;
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        public final void a(Throwable th) {
            TrustedListenableFutureTask.this.p(th);
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        public final void b(Object obj) {
            TrustedListenableFutureTask.this.o(obj);
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        public final boolean d() {
            return TrustedListenableFutureTask.this.isDone();
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        public final Object g() {
            return this.Z.call();
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        public final String h() {
            return this.Z.toString();
        }
    }

    public TrustedListenableFutureTask(Callable callable) {
        this.i0 = new TrustedFutureInterruptibleTask(callable);
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    public final void d() {
        TrustedFutureInterruptibleTask trustedFutureInterruptibleTask;
        Object obj = this.X;
        if ((obj instanceof AbstractFuture.Cancellation) && ((AbstractFuture.Cancellation) obj).f20098a && (trustedFutureInterruptibleTask = this.i0) != null) {
            Runnable runnable = InterruptibleTask.f20133Y;
            Runnable runnable2 = InterruptibleTask.X;
            Runnable runnable3 = (Runnable) trustedFutureInterruptibleTask.get();
            if (runnable3 instanceof Thread) {
                InterruptibleTask.Blocker blocker = new InterruptibleTask.Blocker(trustedFutureInterruptibleTask);
                InterruptibleTask.Blocker.a(blocker, Thread.currentThread());
                if (trustedFutureInterruptibleTask.compareAndSet(runnable3, blocker)) {
                    try {
                        ((Thread) runnable3).interrupt();
                        if (((Runnable) trustedFutureInterruptibleTask.getAndSet(runnable2)) == runnable) {
                            LockSupport.unpark((Thread) runnable3);
                        }
                    } catch (Throwable th) {
                        if (((Runnable) trustedFutureInterruptibleTask.getAndSet(runnable2)) == runnable) {
                            LockSupport.unpark((Thread) runnable3);
                        }
                        throw th;
                    }
                }
            }
        }
        this.i0 = null;
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    public final String m() {
        TrustedFutureInterruptibleTask trustedFutureInterruptibleTask = this.i0;
        if (trustedFutureInterruptibleTask == null) {
            return super.m();
        }
        return "task=[" + trustedFutureInterruptibleTask + d9.i.f24752e;
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        TrustedFutureInterruptibleTask trustedFutureInterruptibleTask = this.i0;
        if (trustedFutureInterruptibleTask != null) {
            trustedFutureInterruptibleTask.run();
        }
        this.i0 = null;
    }
}
