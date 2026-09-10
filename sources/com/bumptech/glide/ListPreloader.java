package com.bumptech.glide;

import android.graphics.drawable.Drawable;
import android.widget.AbsListView;
import com.bumptech.glide.request.Request;
import com.bumptech.glide.request.SingleRequest;
import com.bumptech.glide.request.target.Target;
import com.bumptech.glide.request.transition.Transition;

/* JADX INFO: loaded from: classes.dex */
public class ListPreloader<T> implements AbsListView.OnScrollListener {
    public int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public int f12299Y;
    public int Z;
    public boolean e0;

    public interface PreloadModelProvider<U> {
    }

    public interface PreloadSizeProvider<T> {
    }

    public static final class PreloadTargetQueue {
    }

    public final void a(int i2, boolean z2) {
        if (this.e0 != z2) {
            this.e0 = z2;
            throw null;
        }
        int iMin = Math.min(this.Z, Math.min(this.X, i2));
        int iMin2 = Math.min(this.Z, Math.max(0, i2));
        if (iMin - 1 >= iMin2) {
            throw null;
        }
        this.X = iMin2;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i2, int i3, int i4) {
        if (this.Z == 0 && i4 == 0) {
            return;
        }
        this.Z = i4;
        int i5 = this.f12299Y;
        if (i2 > i5) {
            a(i3 + i2, true);
        } else if (i2 < i5) {
            a(i2, false);
        }
        this.f12299Y = i2;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i2) {
    }

    public static final class PreloadTarget implements Target<Object> {
        public Request X;

        @Override // com.bumptech.glide.request.target.Target
        public final void c(SingleRequest singleRequest) {
            singleRequest.b(0, 0);
        }

        @Override // com.bumptech.glide.request.target.Target
        public final void d(Drawable drawable) {
        }

        @Override // com.bumptech.glide.request.target.Target
        public final Request e() {
            return this.X;
        }

        @Override // com.bumptech.glide.request.target.Target
        public final void f(Drawable drawable) {
        }

        @Override // com.bumptech.glide.request.target.Target
        public final void g(Object obj, Transition transition) {
        }

        @Override // com.bumptech.glide.request.target.Target
        public final void i(Request request) {
            this.X = request;
        }

        @Override // com.bumptech.glide.request.target.Target
        public final void j(Drawable drawable) {
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

        @Override // com.bumptech.glide.request.target.Target
        public final void a(SingleRequest singleRequest) {
        }
    }
}
