package com.bumptech.glide.request.transition;

import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.request.target.ImageViewTarget;

/* JADX INFO: loaded from: classes.dex */
public class NoTransition<R> implements Transition<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final NoTransition f12826a = new NoTransition();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final NoAnimationFactory f12827b = new NoAnimationFactory();

    public static class NoAnimationFactory<R> implements TransitionFactory<R> {
        @Override // com.bumptech.glide.request.transition.TransitionFactory
        public final Transition a(DataSource dataSource, boolean z2) {
            return NoTransition.f12826a;
        }
    }

    @Override // com.bumptech.glide.request.transition.Transition
    public final boolean a(Object obj, ImageViewTarget imageViewTarget) {
        return false;
    }
}
