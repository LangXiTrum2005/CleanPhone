package com.inmobi.media;

import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class W0 extends Animatable2.AnimationCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ X0 f23311a;

    public W0(X0 x0) {
        this.f23311a = x0;
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationEnd(Drawable drawable) {
        Intrinsics.f(drawable, "drawable");
        super.onAnimationEnd(drawable);
        this.f23311a.e();
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationStart(Drawable drawable) {
        Intrinsics.f(drawable, "drawable");
        super.onAnimationStart(drawable);
    }
}
