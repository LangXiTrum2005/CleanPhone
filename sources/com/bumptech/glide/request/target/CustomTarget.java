package com.bumptech.glide.request.target;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.request.Request;
import com.bumptech.glide.request.SingleRequest;
import com.bumptech.glide.util.Util;

/* JADX INFO: loaded from: classes.dex */
public abstract class CustomTarget<T> implements Target<T> {
    public final int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final int f12813Y;
    public Request Z;

    public CustomTarget() {
        if (!Util.j(Integer.MIN_VALUE, Integer.MIN_VALUE)) {
            throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: -2147483648 and height: -2147483648");
        }
        this.X = Integer.MIN_VALUE;
        this.f12813Y = Integer.MIN_VALUE;
    }

    @Override // com.bumptech.glide.request.target.Target
    public final void c(SingleRequest singleRequest) {
        singleRequest.b(this.X, this.f12813Y);
    }

    @Override // com.bumptech.glide.request.target.Target
    public final void d(Drawable drawable) {
    }

    @Override // com.bumptech.glide.request.target.Target
    public final Request e() {
        return this.Z;
    }

    @Override // com.bumptech.glide.request.target.Target
    public final void i(Request request) {
        this.Z = request;
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
