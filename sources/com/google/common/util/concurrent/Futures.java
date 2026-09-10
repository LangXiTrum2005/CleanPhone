package com.google.common.util.concurrent;

import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.util.concurrent.internal.InternalFutureFailureAccess;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public final class Futures extends GwtFuturesCatchingSpecialization {

    /* JADX INFO: renamed from: com.google.common.util.concurrent.Futures$1, reason: invalid class name */
    class AnonymousClass1 implements Future<Object> {
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
            throw null;
        }

        @Override // java.util.concurrent.Future
        public final boolean isDone() {
            throw null;
        }

        @Override // java.util.concurrent.Future
        public final Object get(long j, TimeUnit timeUnit) {
            throw null;
        }
    }

    public static final class CallbackListener<V> implements Runnable {
        public final ListenableFuture X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final FutureCallback f20130Y;

        public CallbackListener(ListenableFuture listenableFuture, FutureCallback futureCallback) {
            this.X = listenableFuture;
            this.f20130Y = futureCallback;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public final void run() {
            Throwable thB;
            ListenableFuture listenableFuture = this.X;
            boolean z2 = listenableFuture instanceof InternalFutureFailureAccess;
            FutureCallback futureCallback = this.f20130Y;
            if (z2 && (thB = ((InternalFutureFailureAccess) listenableFuture).b()) != null) {
                futureCallback.onFailure(thB);
                return;
            }
            try {
                Preconditions.q(listenableFuture.isDone(), "Future was expected to be done: %s", listenableFuture);
                futureCallback.onSuccess(Uninterruptibles.a(listenableFuture));
            } catch (ExecutionException e2) {
                futureCallback.onFailure(e2.getCause());
            } catch (Throwable th) {
                futureCallback.onFailure(th);
            }
        }

        public final String toString() {
            MoreObjects.ToStringHelper toStringHelperB = MoreObjects.b(this);
            toStringHelperB.d(this.f20130Y);
            return toStringHelperB.toString();
        }
    }

    public static final class FutureCombiner<V> {

        /* JADX INFO: renamed from: com.google.common.util.concurrent.Futures$FutureCombiner$1, reason: invalid class name */
        class AnonymousClass1 implements Callable<Void> {
            @Override // java.util.concurrent.Callable
            public final Void call() {
                throw null;
            }
        }
    }

    public static final class InCompletionOrderFuture<T> extends AbstractFuture<T> {
        @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
        public final boolean cancel(boolean z2) {
            if (super.cancel(z2)) {
                throw null;
            }
            return false;
        }

        @Override // com.google.common.util.concurrent.AbstractFuture
        public final void d() {
        }

        @Override // com.google.common.util.concurrent.AbstractFuture
        public final String m() {
            return null;
        }
    }

    public static final class InCompletionOrderState<T> {
    }

    public static final class NonCancellationPropagatingFuture<V> extends AbstractFuture.TrustedFuture<V> implements Runnable {
        @Override // com.google.common.util.concurrent.AbstractFuture
        public final void d() {
        }

        @Override // com.google.common.util.concurrent.AbstractFuture
        public final String m() {
            return null;
        }

        @Override // java.lang.Runnable
        public final void run() {
        }
    }

    public static void a(ListenableFuture listenableFuture, FutureCallback futureCallback, Executor executor) {
        listenableFuture.addListener(new CallbackListener(listenableFuture, futureCallback), executor);
    }

    public static ListenableFuture b(Throwable th) {
        ImmediateFuture.ImmediateFailedFuture immediateFailedFuture = new ImmediateFuture.ImmediateFailedFuture();
        immediateFailedFuture.p(th);
        return immediateFailedFuture;
    }

    public static ListenableFuture c(Object obj) {
        return obj == null ? ImmediateFuture.f20132Y : new ImmediateFuture(obj);
    }

    public static ListenableFuture d(ListenableFuture listenableFuture, com.google.common.cache.a aVar) {
        Executor executor = DirectExecutor.X;
        int i2 = AbstractTransformFuture.k0;
        AbstractTransformFuture.TransformFuture transformFuture = new AbstractTransformFuture.TransformFuture();
        transformFuture.i0 = listenableFuture;
        transformFuture.j0 = aVar;
        listenableFuture.addListener(transformFuture, executor);
        return transformFuture;
    }
}
