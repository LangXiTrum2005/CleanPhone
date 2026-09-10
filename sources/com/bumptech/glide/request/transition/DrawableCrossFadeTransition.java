package com.bumptech.glide.request.transition;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import com.bumptech.glide.request.target.ImageViewTarget;

/* JADX INFO: loaded from: classes.dex */
public class DrawableCrossFadeTransition implements Transition<Drawable> {
    @Override // com.bumptech.glide.request.transition.Transition
    public final boolean a(Object obj, ImageViewTarget imageViewTarget) {
        Drawable drawable = (Drawable) obj;
        Drawable drawable2 = imageViewTarget.f12821Y.getDrawable();
        if (drawable2 == null) {
            drawable2 = new ColorDrawable(0);
        }
        TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{drawable2, drawable});
        transitionDrawable.setCrossFadeEnabled(false);
        transitionDrawable.startTransition(300);
        imageViewTarget.b(transitionDrawable);
        return true;
    }
}
