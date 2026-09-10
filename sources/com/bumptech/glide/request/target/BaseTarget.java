package com.bumptech.glide.request.target;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.request.Request;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class BaseTarget<Z> implements Target<Z> {
    public Request X;

    @Override // com.bumptech.glide.request.target.Target
    public void d(Drawable drawable) {
    }

    @Override // com.bumptech.glide.request.target.Target
    public Request e() {
        return this.X;
    }

    @Override // com.bumptech.glide.request.target.Target
    public void f(Drawable drawable) {
    }

    @Override // com.bumptech.glide.request.target.Target
    public void i(Request request) {
        this.X = request;
    }

    @Override // com.bumptech.glide.request.target.Target
    public void j(Drawable drawable) {
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    public final void onDestroy() {
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    public void onStart() {
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    public void onStop() {
    }
}
