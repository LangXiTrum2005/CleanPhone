package com.bumptech.glide.request.target;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.bumptech.glide.request.transition.Transition;

/* JADX INFO: loaded from: classes.dex */
public abstract class ImageViewTarget<Z> extends ViewTarget<ImageView, Z> implements Transition.ViewAdapter {
    public Animatable e0;

    public final void b(Drawable drawable) {
        this.f12821Y.setImageDrawable(drawable);
    }

    @Override // com.bumptech.glide.request.target.ViewTarget, com.bumptech.glide.request.target.BaseTarget, com.bumptech.glide.request.target.Target
    public final void d(Drawable drawable) {
        h(null);
        this.e0 = null;
        b(drawable);
    }

    @Override // com.bumptech.glide.request.target.ViewTarget, com.bumptech.glide.request.target.BaseTarget, com.bumptech.glide.request.target.Target
    public final void f(Drawable drawable) {
        super.f(drawable);
        Animatable animatable = this.e0;
        if (animatable != null) {
            animatable.stop();
        }
        h(null);
        this.e0 = null;
        b(drawable);
    }

    @Override // com.bumptech.glide.request.target.Target
    public final void g(Object obj, Transition transition) {
        if (transition != null && transition.a(obj, this)) {
            if (!(obj instanceof Animatable)) {
                this.e0 = null;
                return;
            }
            Animatable animatable = (Animatable) obj;
            this.e0 = animatable;
            animatable.start();
            return;
        }
        h(obj);
        if (!(obj instanceof Animatable)) {
            this.e0 = null;
            return;
        }
        Animatable animatable2 = (Animatable) obj;
        this.e0 = animatable2;
        animatable2.start();
    }

    public abstract void h(Object obj);

    @Override // com.bumptech.glide.request.target.BaseTarget, com.bumptech.glide.request.target.Target
    public final void j(Drawable drawable) {
        h(null);
        this.e0 = null;
        b(drawable);
    }

    @Override // com.bumptech.glide.request.target.BaseTarget, com.bumptech.glide.manager.LifecycleListener
    public final void onStart() {
        Animatable animatable = this.e0;
        if (animatable != null) {
            animatable.start();
        }
    }

    @Override // com.bumptech.glide.request.target.BaseTarget, com.bumptech.glide.manager.LifecycleListener
    public final void onStop() {
        Animatable animatable = this.e0;
        if (animatable != null) {
            animatable.stop();
        }
    }
}
