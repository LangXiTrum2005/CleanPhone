package com.bumptech.glide.request.transition;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.DataSource;

/* JADX INFO: loaded from: classes.dex */
public class DrawableCrossFadeFactory implements TransitionFactory<Drawable> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public DrawableCrossFadeTransition f12825a;

    public static class Builder {
    }

    @Override // com.bumptech.glide.request.transition.TransitionFactory
    public final Transition a(DataSource dataSource, boolean z2) {
        if (dataSource == DataSource.f0) {
            return NoTransition.f12826a;
        }
        if (this.f12825a == null) {
            this.f12825a = new DrawableCrossFadeTransition();
        }
        return this.f12825a;
    }
}
