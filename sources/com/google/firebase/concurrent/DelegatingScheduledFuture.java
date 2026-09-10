package com.google.firebase.concurrent;

import androidx.concurrent.futures.AbstractResolvableFuture;
import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
class DelegatingScheduledFuture<V> extends AbstractResolvableFuture<V> implements ScheduledFuture<V> {
    public static final /* synthetic */ int j0 = 0;
    public final ScheduledFuture i0;

    /* JADX INFO: renamed from: com.google.firebase.concurrent.DelegatingScheduledFuture$1, reason: invalid class name */
    class AnonymousClass1 implements Completer<Object> {
        public AnonymousClass1() {
        }

        public final void a(Object obj) {
            int i2 = DelegatingScheduledFuture.j0;
            DelegatingScheduledFuture.this.k(obj);
        }

        public final void b(Exception exc) {
            int i2 = DelegatingScheduledFuture.j0;
            DelegatingScheduledFuture.this.l(exc);
        }
    }

    public interface Completer<T> {
    }

    public interface Resolver<T> {
        ScheduledFuture a(AnonymousClass1 anonymousClass1);
    }

    public DelegatingScheduledFuture(Resolver resolver) {
        this.i0 = resolver.a(new AnonymousClass1());
    }

    @Override // androidx.concurrent.futures.AbstractResolvableFuture
    public final void b() {
        this.i0.cancel(m());
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        return this.i0.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.i0.getDelay(timeUnit);
    }
}
