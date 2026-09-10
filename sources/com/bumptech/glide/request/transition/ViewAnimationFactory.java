package com.bumptech.glide.request.transition;

import com.bumptech.glide.load.DataSource;

/* JADX INFO: loaded from: classes.dex */
public class ViewAnimationFactory<R> implements TransitionFactory<R> {

    public static class ConcreteViewTransitionAnimationFactory implements ViewTransition.ViewTransitionAnimationFactory {
    }

    public static class ResourceViewTransitionAnimationFactory implements ViewTransition.ViewTransitionAnimationFactory {
    }

    @Override // com.bumptech.glide.request.transition.TransitionFactory
    public final Transition a(DataSource dataSource, boolean z2) {
        if (dataSource == DataSource.f0 || !z2) {
            return NoTransition.f12826a;
        }
        return null;
    }
}
