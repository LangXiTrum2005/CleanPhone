package com.bumptech.glide;

import com.bumptech.glide.TransitionOptions;
import com.bumptech.glide.request.transition.NoTransition;
import com.bumptech.glide.request.transition.TransitionFactory;
import com.bumptech.glide.util.Util;

/* JADX INFO: loaded from: classes.dex */
public abstract class TransitionOptions<CHILD extends TransitionOptions<CHILD, TranscodeType>, TranscodeType> implements Cloneable {
    public TransitionFactory X = NoTransition.f12827b;

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final TransitionOptions clone() {
        try {
            return (TransitionOptions) super.clone();
        } catch (CloneNotSupportedException e2) {
            throw new RuntimeException(e2);
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof TransitionOptions) {
            return Util.b(this.X, ((TransitionOptions) obj).X);
        }
        return false;
    }

    public int hashCode() {
        TransitionFactory transitionFactory = this.X;
        if (transitionFactory != null) {
            return transitionFactory.hashCode();
        }
        return 0;
    }
}
