package com.google.common.util.concurrent;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: FluentFuture.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class cutely<V> extends monoploid<V> {

    /* JADX INFO: compiled from: FluentFuture.java */
    public static abstract class attabal<V> extends cutely<V> implements AbstractFuture.impromptu<V> {
        @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
        public final boolean cancel(boolean z) {
            return super.cancel(z);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
        public final V get() throws ExecutionException, InterruptedException {
            return (V) super.get();
        }

        @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
        public final boolean isCancelled() {
            return super.isCancelled();
        }

        @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
        public final boolean isDone() {
            return super.isDone();
        }

        @Override // com.google.common.util.concurrent.AbstractFuture, com.google.common.util.concurrent.adultoid
        public final void taiyuan(Runnable runnable, Executor executor) {
            super.taiyuan(runnable, executor);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
        public final V get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
            return (V) super.get(j, timeUnit);
        }
    }

    public static <V> cutely<V> restrictive(adultoid<V> adultoidVar) {
        return adultoidVar instanceof cutely ? (cutely) adultoidVar : new apical(adultoidVar);
    }

    public final <X extends Throwable> cutely<V> kattegat(Class<X> cls, com.google.common.base.marial<? super X, ? extends V> marialVar, Executor executor) {
        return (cutely) arytenoidectomy.wireman(this, cls, marialVar, executor);
    }

    public final <T> cutely<T> merc(com.google.common.base.marial<? super V, T> marialVar, Executor executor) {
        return (cutely) arytenoidectomy.formularize(this, marialVar, executor);
    }

    public final <T> cutely<T> polder(impromptu<? super V, T> impromptuVar, Executor executor) {
        return (cutely) arytenoidectomy.impassible(this, impromptuVar, executor);
    }

    public final <X extends Throwable> cutely<V> supplicat(Class<X> cls, impromptu<? super X, ? extends V> impromptuVar, Executor executor) {
        return (cutely) arytenoidectomy.marial(this, cls, impromptuVar, executor);
    }
}
