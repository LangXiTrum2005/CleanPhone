package com.google.common.util.concurrent;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public abstract class ForwardingListenableFuture<V> extends ForwardingFuture<V> implements ListenableFuture<V> {

    public static abstract class SimpleForwardingListenableFuture<V> extends ForwardingListenableFuture<V> {
        public final AbstractFuture X;

        public SimpleForwardingListenableFuture(AbstractFuture abstractFuture) {
            this.X = abstractFuture;
        }

        @Override // com.google.common.util.concurrent.ForwardingListenableFuture, com.google.common.util.concurrent.ForwardingFuture, com.google.common.collect.ForwardingObject
        public final Object w() {
            return this.X;
        }

        @Override // com.google.common.util.concurrent.ForwardingListenableFuture, com.google.common.util.concurrent.ForwardingFuture
        /* JADX INFO: renamed from: x */
        public final Future w() {
            return this.X;
        }

        @Override // com.google.common.util.concurrent.ForwardingListenableFuture
        /* JADX INFO: renamed from: y */
        public final ListenableFuture x() {
            return this.X;
        }
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void addListener(Runnable runnable, Executor executor) {
        x().addListener(runnable, executor);
    }

    @Override // com.google.common.util.concurrent.ForwardingFuture
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public abstract ListenableFuture w();
}
