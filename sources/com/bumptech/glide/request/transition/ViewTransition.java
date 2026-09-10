package com.bumptech.glide.request.transition;

import android.widget.ImageView;
import com.bumptech.glide.request.target.ImageViewTarget;

/* JADX INFO: loaded from: classes.dex */
public class ViewTransition<R> implements Transition<R> {

    public interface ViewTransitionAnimationFactory {
    }

    @Override // com.bumptech.glide.request.transition.Transition
    public final boolean a(Object obj, ImageViewTarget imageViewTarget) {
        ImageView imageView = imageViewTarget.f12821Y;
        if (imageView == null) {
            return false;
        }
        imageView.clearAnimation();
        imageView.getContext();
        throw null;
    }
}
