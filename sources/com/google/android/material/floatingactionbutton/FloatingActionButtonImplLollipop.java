package com.google.android.material.floatingactionbutton;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import com.google.android.material.shape.MaterialShapeDrawable;

/* JADX INFO: loaded from: classes4.dex */
class FloatingActionButtonImplLollipop extends FloatingActionButtonImpl {
    public StateListAnimator C;

    public static class AlwaysStatefulMaterialShapeDrawable extends MaterialShapeDrawable {
        @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
        public final boolean isStateful() {
            return true;
        }
    }

    @Override // com.google.android.material.floatingactionbutton.FloatingActionButtonImpl
    public final float d() {
        throw null;
    }

    @Override // com.google.android.material.floatingactionbutton.FloatingActionButtonImpl
    public final void e(Rect rect) {
        throw null;
    }

    @Override // com.google.android.material.floatingactionbutton.FloatingActionButtonImpl
    public final void f() {
    }

    @Override // com.google.android.material.floatingactionbutton.FloatingActionButtonImpl
    public final void g() {
        k();
        throw null;
    }

    @Override // com.google.android.material.floatingactionbutton.FloatingActionButtonImpl
    public final void h(int[] iArr) {
    }

    @Override // com.google.android.material.floatingactionbutton.FloatingActionButtonImpl
    public final void i(float f, float f2, float f3) {
        throw null;
    }

    public final AnimatorSet l(float f, float f2) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat((Object) null, "elevation", f).setDuration(0L)).with(ObjectAnimator.ofFloat((Object) null, (Property<Object, Float>) View.TRANSLATION_Z, f2).setDuration(100L));
        animatorSet.setInterpolator(FloatingActionButtonImpl.r);
        return animatorSet;
    }

    public final boolean m() {
        throw null;
    }
}
