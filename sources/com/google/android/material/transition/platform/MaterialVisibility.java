package com.google.android.material.transition.platform;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.transition.TransitionValues;
import android.transition.Visibility;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.transition.platform.VisibilityAnimatorProvider;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
abstract class MaterialVisibility<P extends VisibilityAnimatorProvider> extends Visibility {
    public static void b() {
        new AnimatorSet();
        new ArrayList();
        throw null;
    }

    @Override // android.transition.Visibility
    public Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        b();
        throw null;
    }

    @Override // android.transition.Visibility
    public Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        b();
        throw null;
    }
}
