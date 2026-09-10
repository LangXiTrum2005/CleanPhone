package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.charging.screenshow.battery.animations.themes.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.motion.MotionUtils;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes4.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public int f19114Y;
    public int Z;
    public TimeInterpolator e0;
    public TimeInterpolator f0;
    public ViewPropertyAnimator i0;
    public final LinkedHashSet X = new LinkedHashSet();
    public int g0 = 0;
    public int h0 = 2;

    public interface OnScrollStateChangedListener {
        void a();
    }

    public @interface ScrollState {
    }

    public HideBottomViewOnScrollBehavior() {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean n(CoordinatorLayout coordinatorLayout, View view, int i2) {
        this.g0 = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.f19114Y = MotionUtils.c(view.getContext(), R.attr.motionDurationLong2, Sdk.SDKError.Reason.AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE);
        this.Z = MotionUtils.c(view.getContext(), R.attr.motionDurationMedium4, 175);
        this.e0 = MotionUtils.d(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, AnimationUtils.d);
        this.f0 = MotionUtils.d(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, AnimationUtils.f19080c);
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void r(CoordinatorLayout coordinatorLayout, View view, int i2, int i3, int i4, int[] iArr) {
        LinkedHashSet linkedHashSet = this.X;
        if (i2 > 0) {
            if (this.h0 == 1) {
                return;
            }
            ViewPropertyAnimator viewPropertyAnimator = this.i0;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            this.h0 = 1;
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                ((OnScrollStateChangedListener) it.next()).a();
            }
            this.i0 = view.animate().translationY(this.g0).setInterpolator(this.f0).setDuration(this.Z).setListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.behavior.HideBottomViewOnScrollBehavior.1
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    HideBottomViewOnScrollBehavior.this.i0 = null;
                }
            });
            return;
        }
        if (i2 >= 0 || this.h0 == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator2 = this.i0;
        if (viewPropertyAnimator2 != null) {
            viewPropertyAnimator2.cancel();
            view.clearAnimation();
        }
        this.h0 = 2;
        Iterator it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            ((OnScrollStateChangedListener) it2.next()).a();
        }
        this.i0 = view.animate().translationY(0).setInterpolator(this.e0).setDuration(this.f19114Y).setListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.behavior.HideBottomViewOnScrollBehavior.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                HideBottomViewOnScrollBehavior.this.i0 = null;
            }
        });
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean v(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i2, int i3) {
        return i2 == 2;
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }
}
