package androidx.concurrent.futures;

import android.support.v4.media.a;
import com.google.common.util.concurrent.ListenableFuture;
import com.p004ironsource.d9;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class CallbackToFutureAdapter {

    public static final class Completer<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f3794a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public SafeFuture f3795b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ResolvableFuture f3796c;
        public boolean d;

        public final void a(Object obj) {
            this.d = true;
            SafeFuture safeFuture = this.f3795b;
            if (safeFuture == null || !safeFuture.f3797Y.k(obj)) {
                return;
            }
            this.f3794a = null;
            this.f3795b = null;
            this.f3796c = null;
        }

        public final void b() {
            this.d = true;
            SafeFuture safeFuture = this.f3795b;
            if (safeFuture == null || !safeFuture.f3797Y.cancel(true)) {
                return;
            }
            this.f3794a = null;
            this.f3795b = null;
            this.f3796c = null;
        }

        public final void c(Throwable th) {
            this.d = true;
            SafeFuture safeFuture = this.f3795b;
            if (safeFuture == null || !safeFuture.f3797Y.l(th)) {
                return;
            }
            this.f3794a = null;
            this.f3795b = null;
            this.f3796c = null;
        }

        public final void finalize() {
            ResolvableFuture resolvableFuture;
            SafeFuture safeFuture = this.f3795b;
            if (safeFuture != null) {
                AbstractResolvableFuture abstractResolvableFuture = safeFuture.f3797Y;
                if (!abstractResolvableFuture.isDone()) {
                    abstractResolvableFuture.l(new FutureGarbageCollectedException("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f3794a));
                }
            }
            if (this.d || (resolvableFuture = this.f3796c) == null) {
                return;
            }
            resolvableFuture.k(null);
        }
    }

    public static final class FutureGarbageCollectedException extends Throwable {
        @Override // java.lang.Throwable
        public final synchronized Throwable fillInStackTrace() {
            return this;
        }
    }

    public interface Resolver<T> {
        Object attachCompleter(Completer completer);
    }

    public static final class SafeFuture<T> implements ListenableFuture<T> {
        public final WeakReference X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final AbstractResolvableFuture f3797Y = new AbstractResolvableFuture<T>() { // from class: androidx.concurrent.futures.CallbackToFutureAdapter.SafeFuture.1
            @Override // androidx.concurrent.futures.AbstractResolvableFuture
            public final String i() {
                Completer completer = (Completer) SafeFuture.this.X.get();
                return completer == null ? "Completer object has been garbage collected, future will fail soon" : a.q(new StringBuilder("tag=["), completer.f3794a, d9.i.f24752e);
            }
        };

        public SafeFuture(Completer completer) {
            this.X = new WeakReference(completer);
        }

        @Override // com.google.common.util.concurrent.ListenableFuture
        public final void addListener(Runnable runnable, Executor executor) {
            this.f3797Y.addListener(runnable, executor);
        }

        @Override // java.util.concurrent.Future
        public final boolean cancel(boolean z2) {
            Completer completer = (Completer) this.X.get();
            boolean zCancel = this.f3797Y.cancel(z2);
            if (zCancel && completer != null) {
                completer.f3794a = null;
                completer.f3795b = null;
                completer.f3796c.k(null);
            }
            return zCancel;
        }

        @Override // java.util.concurrent.Future
        public final Object get() {
            return this.f3797Y.get();
        }

        @Override // java.util.concurrent.Future
        public final boolean isCancelled() {
            return this.f3797Y.X instanceof AbstractResolvableFuture.Cancellation;
        }

        @Override // java.util.concurrent.Future
        public final boolean isDone() {
            return this.f3797Y.isDone();
        }

        public final String toString() {
            return this.f3797Y.toString();
        }

        @Override // java.util.concurrent.Future
        public final Object get(long j, TimeUnit timeUnit) {
            return this.f3797Y.get(j, timeUnit);
        }
    }

    public static ListenableFuture a(Resolver resolver) {
        Completer completer = new Completer();
        completer.f3796c = new ResolvableFuture();
        SafeFuture safeFuture = new SafeFuture(completer);
        completer.f3795b = safeFuture;
        completer.f3794a = resolver.getClass();
        try {
            Object objAttachCompleter = resolver.attachCompleter(completer);
            if (objAttachCompleter != null) {
                completer.f3794a = objAttachCompleter;
                return safeFuture;
            }
        } catch (Exception e2) {
            safeFuture.f3797Y.l(e2);
        }
        return safeFuture;
    }
}
