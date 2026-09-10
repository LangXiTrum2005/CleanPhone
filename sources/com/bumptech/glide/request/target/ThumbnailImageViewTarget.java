package com.bumptech.glide.request.target;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes.dex */
public abstract class ThumbnailImageViewTarget<T> extends ImageViewTarget<T> {
    @Override // com.bumptech.glide.request.target.ImageViewTarget
    public final void h(Object obj) {
        ImageView imageView = this.f12821Y;
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        Drawable drawableK = k(obj);
        if (layoutParams != null && layoutParams.width > 0 && layoutParams.height > 0) {
            drawableK = new FixedSizeDrawable(new FixedSizeDrawable.State(drawableK.getConstantState(), layoutParams.width, layoutParams.height), drawableK);
        }
        imageView.setImageDrawable(drawableK);
    }

    public abstract Drawable k(Object obj);
}
