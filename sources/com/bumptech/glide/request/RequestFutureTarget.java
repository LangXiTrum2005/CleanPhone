package com.bumptech.glide.request;

import android.graphics.drawable.Drawable;
import android.support.v4.media.a;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.transition.Transition;
import com.p004ironsource.d9;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public class RequestFutureTarget<R> implements FutureTarget<R>, RequestListener<R> {
    public Object X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public Request f12793Y;

    public static class Waiter {
    }

    @Override // com.bumptech.glide.request.RequestListener
    public final synchronized boolean b(Object obj) {
        this.X = obj;
        throw null;
    }

    @Override // com.bumptech.glide.request.target.Target
    public final void c(SingleRequest singleRequest) {
        singleRequest.b(0, 0);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z2) {
        synchronized (this) {
            synchronized (this) {
            }
            return false;
        }
        return false;
    }

    @Override // com.bumptech.glide.request.target.Target
    public final void d(Drawable drawable) {
    }

    @Override // com.bumptech.glide.request.target.Target
    public final synchronized Request e() {
        return this.f12793Y;
    }

    @Override // com.bumptech.glide.request.target.Target
    public final void f(Drawable drawable) {
    }

    @Override // com.bumptech.glide.request.target.Target
    public final synchronized void g(Object obj, Transition transition) {
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        try {
            k(null);
            throw null;
        } catch (TimeoutException e2) {
            throw new AssertionError(e2);
        }
    }

    @Override // com.bumptech.glide.request.RequestListener
    public final synchronized boolean h(GlideException glideException) {
        throw null;
    }

    @Override // com.bumptech.glide.request.target.Target
    public final synchronized void i(Request request) {
        this.f12793Y = request;
    }

    @Override // java.util.concurrent.Future
    public final synchronized boolean isCancelled() {
        return true;
    }

    @Override // java.util.concurrent.Future
    public final synchronized boolean isDone() {
        return true;
    }

    @Override // com.bumptech.glide.request.target.Target
    public final synchronized void j(Drawable drawable) {
    }

    public final synchronized Object k(Long l2) {
        throw new CancellationException();
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    public final void onDestroy() {
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    public final void onStart() {
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    public final void onStop() {
    }

    public final String toString() {
        String strR = a.r(new StringBuilder(), super.toString(), "[status=");
        synchronized (this) {
        }
        return a.D(strR, "CANCELLED", d9.i.f24752e);
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        k(Long.valueOf(timeUnit.toMillis(j)));
        throw null;
    }

    @Override // com.bumptech.glide.request.target.Target
    public final void a(SingleRequest singleRequest) {
    }
}
