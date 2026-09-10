package com.google.common.util.concurrent;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: ForwardingFluentFuture.java */
/* JADX INFO: loaded from: classes3.dex */
public final class apical<V> extends cutely<V> {

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
    public final adultoid<V> f22019adultoid;

    public apical(adultoid<V> adultoidVar) {
        this.f22019adultoid = (adultoid) com.google.common.base.formularize.triweekly(adultoidVar);
    }

    @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return this.f22019adultoid.cancel(z);
    }

    @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
    public V get() throws ExecutionException, InterruptedException {
        return this.f22019adultoid.get();
    }

    @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f22019adultoid.isCancelled();
    }

    @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
    public boolean isDone() {
        return this.f22019adultoid.isDone();
    }

    @Override // com.google.common.util.concurrent.AbstractFuture, com.google.common.util.concurrent.adultoid
    public void taiyuan(Runnable runnable, Executor executor) {
        this.f22019adultoid.taiyuan(runnable, executor);
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    public String toString() {
        return this.f22019adultoid.toString();
    }

    @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
    public V get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return this.f22019adultoid.get(j, timeUnit);
    }
}
