package com.google.common.util.concurrent;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
final class CombinedFuture<V> extends AggregateFuture<Object, V> {

    public final class AsyncCallableInterruptibleTask extends CombinedFuture<V>.CombinedFutureInterruptibleTask<ListenableFuture<V>> {
        @Override // com.google.common.util.concurrent.InterruptibleTask
        public final Object g() {
            throw null;
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        public final String h() {
            throw null;
        }
    }

    public final class CallableInterruptibleTask extends CombinedFuture<V>.CombinedFutureInterruptibleTask<V> {
        @Override // com.google.common.util.concurrent.InterruptibleTask
        public final Object g() {
            throw null;
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        public final String h() {
            throw null;
        }
    }

    public abstract class CombinedFutureInterruptibleTask<T> extends InterruptibleTask<T> {
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
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    public final void k() {
    }

    @Override // com.google.common.util.concurrent.AggregateFuture
    public final void r() {
    }
}
