package com.google.common.util.concurrent;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: ForwardingListenableFuture.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class impassible<V> extends formularize<V> implements adultoid<V> {

    /* JADX INFO: compiled from: ForwardingListenableFuture.java */
    public static abstract class attabal<V> extends impassible<V> {

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final adultoid<V> f22037kowloon;

        public attabal(adultoid<V> adultoidVar) {
            this.f22037kowloon = (adultoid) com.google.common.base.formularize.triweekly(adultoidVar);
        }

        @Override // com.google.common.util.concurrent.formularize
        /* JADX INFO: renamed from: marial, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public final adultoid<V> wireman() {
            return this.f22037kowloon;
        }
    }

    /* JADX INFO: renamed from: marial */
    public abstract adultoid<? extends V> delegate();

    @Override // com.google.common.util.concurrent.adultoid
    public void taiyuan(Runnable runnable, Executor executor) {
        delegate().taiyuan(runnable, executor);
    }
}
