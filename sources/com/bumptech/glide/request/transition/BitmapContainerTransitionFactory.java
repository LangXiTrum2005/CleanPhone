package com.bumptech.glide.request.transition;

import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.request.target.ImageViewTarget;

/* JADX INFO: loaded from: classes.dex */
public abstract class BitmapContainerTransitionFactory<R> implements TransitionFactory<R> {

    public final class BitmapGlideAnimation implements Transition<R> {
        @Override // com.bumptech.glide.request.transition.Transition
        public final boolean a(Object obj, ImageViewTarget imageViewTarget) {
            imageViewTarget.f12821Y.getResources();
            throw null;
        }
    }

    @Override // com.bumptech.glide.request.transition.TransitionFactory
    public final Transition a(DataSource dataSource, boolean z2) {
        throw null;
    }
}
