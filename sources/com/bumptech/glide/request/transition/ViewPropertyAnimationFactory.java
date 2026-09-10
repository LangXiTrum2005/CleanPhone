package com.bumptech.glide.request.transition;

import com.bumptech.glide.load.DataSource;

/* JADX INFO: loaded from: classes.dex */
public class ViewPropertyAnimationFactory<R> implements TransitionFactory<R> {
    @Override // com.bumptech.glide.request.transition.TransitionFactory
    public final Transition a(DataSource dataSource, boolean z2) {
        if (dataSource == DataSource.f0 || !z2) {
            return NoTransition.f12826a;
        }
        return null;
    }
}
