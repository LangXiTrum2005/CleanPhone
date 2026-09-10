package com.bumptech.glide.request.target;

import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import android.view.ViewTreeObserver;
import com.bumptech.glide.request.Request;
import com.bumptech.glide.request.SingleRequest;

/* JADX INFO: loaded from: classes.dex */
public abstract class CustomViewTarget<T extends View, Z> implements Target<Z> {

    /* JADX INFO: renamed from: com.bumptech.glide.request.target.CustomViewTarget$1, reason: invalid class name */
    class AnonymousClass1 implements View.OnAttachStateChangeListener {
        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            throw null;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            throw null;
        }
    }

    public static final class SizeDeterminer {

        public static final class SizeDeterminerLayoutListener implements ViewTreeObserver.OnPreDrawListener {
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                if (Log.isLoggable("CustomViewTarget", 2)) {
                    Log.v("CustomViewTarget", "OnGlobalLayoutListener called attachStateListener=" + this);
                }
                throw null;
            }
        }
    }

    @Override // com.bumptech.glide.request.target.Target
    public final void a(SingleRequest singleRequest) {
        throw null;
    }

    @Override // com.bumptech.glide.request.target.Target
    public final void c(SingleRequest singleRequest) {
        throw null;
    }

    @Override // com.bumptech.glide.request.target.Target
    public final void d(Drawable drawable) {
    }

    @Override // com.bumptech.glide.request.target.Target
    public final Request e() {
        throw null;
    }

    @Override // com.bumptech.glide.request.target.Target
    public final void f(Drawable drawable) {
        throw null;
    }

    @Override // com.bumptech.glide.request.target.Target
    public final void i(Request request) {
        throw null;
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
        return "Target for: null";
    }
}
