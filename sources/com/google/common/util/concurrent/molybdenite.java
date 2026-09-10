package com.google.common.util.concurrent;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* JADX INFO: compiled from: ImmediateFuture.java */
/* JADX INFO: loaded from: classes3.dex */
public class molybdenite<V> implements adultoid<V> {
    private final V value;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public static final adultoid<?> f22042kowloon = new molybdenite(null);

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public static final graveside f22041arytenoidectomy = new graveside(molybdenite.class);

    /* JADX INFO: compiled from: ImmediateFuture.java */
    public static final class attabal<V> extends AbstractFuture.taiyuan<V> {
        public attabal(Throwable th) {
            oilcan(th);
        }
    }

    public molybdenite(V v) {
        this.value = v;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public V get() {
        return this.value;
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return true;
    }

    @Override // com.google.common.util.concurrent.adultoid
    public void taiyuan(Runnable runnable, Executor executor) {
        com.google.common.base.formularize.kowloon(runnable, "Runnable was null.");
        com.google.common.base.formularize.kowloon(executor, "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            f22041arytenoidectomy.attabal().log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    public String toString() {
        return super.toString() + "[status=SUCCESS, result=[" + this.value + "]]";
    }

    @Override // java.util.concurrent.Future
    public V get(long j, TimeUnit timeUnit) throws ExecutionException {
        com.google.common.base.formularize.triweekly(timeUnit);
        return get();
    }
}
