package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes2.dex */
public class ZU extends lc {
    private int DY;
    ObjectAnimator LD;
    ObjectAnimator Lxb;
    private Runnable Sfi;

    public ZU(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.ZU.OY oy) {
        super(context, dynamicRootView, oy);
        this.DY = 0;
        this.Sfi = new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ZU.1
            @Override // java.lang.Runnable
            public void run() {
                ZU.this.Lxb();
            }
        };
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.JXs, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.nJ
    public void LD() {
        removeCallbacks(this.Sfi);
        ObjectAnimator objectAnimator = this.Lxb;
        if (objectAnimator != null) {
            objectAnimator.removeAllUpdateListeners();
            this.Lxb.cancel();
        }
        ObjectAnimator objectAnimator2 = this.LD;
        if (objectAnimator2 != null) {
            objectAnimator2.removeAllUpdateListeners();
            this.LD.cancel();
        }
        super.LD();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lc, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.JXs, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            layoutParams.topMargin = (this.OY - layoutParams.height) / 2;
            childAt.setLayoutParams(layoutParams);
            if (i != 0) {
                childAt.setVisibility(8);
            }
        }
        postDelayed(this.Sfi, 2500L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Lxb() {
        final View childAt = getChildAt(this.DY);
        final View childAt2 = getChildAt((this.DY + 1) % getChildCount());
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(childAt, "translationY", 0.0f, (-(getChildAt(this.DY).getHeight() + this.OY)) / 2);
        this.Lxb = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        this.Lxb.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ZU.2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                childAt.setVisibility(8);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        });
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(childAt2, "translationY", (childAt2.getHeight() + this.OY) / 2, 0.0f);
        this.LD = objectAnimatorOfFloat2;
        objectAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
        this.LD.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ZU.3
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                childAt2.setVisibility(0);
            }
        });
        this.Lxb.setDuration(500L);
        this.LD.setDuration(500L);
        this.Lxb.start();
        this.LD.start();
        int i = this.DY + 1;
        this.DY = i;
        this.DY = i % getChildCount();
        postDelayed(this.Sfi, 2000L);
    }
}
