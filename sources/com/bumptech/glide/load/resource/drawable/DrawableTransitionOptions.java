package com.bumptech.glide.load.resource.drawable;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.TransitionOptions;
import com.bumptech.glide.request.transition.DrawableCrossFadeFactory;

/* JADX INFO: loaded from: classes.dex */
public final class DrawableTransitionOptions extends TransitionOptions<DrawableTransitionOptions, Drawable> {
    public static DrawableTransitionOptions c() {
        DrawableTransitionOptions drawableTransitionOptions = new DrawableTransitionOptions();
        drawableTransitionOptions.X = new DrawableCrossFadeFactory();
        return drawableTransitionOptions;
    }

    @Override // com.bumptech.glide.TransitionOptions
    public final boolean equals(Object obj) {
        return (obj instanceof DrawableTransitionOptions) && super.equals(obj);
    }
}
