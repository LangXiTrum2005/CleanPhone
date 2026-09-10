package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes2.dex */
public class lk extends lc {
    private int DY;
    private Runnable HD;
    ObjectAnimator LD;
    ObjectAnimator Lxb;
    private boolean Sfi;

    public lk(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.ZU.OY oy) {
        super(context, dynamicRootView, oy);
        this.DY = 0;
        this.Sfi = false;
        this.HD = new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lk.1
            @Override // java.lang.Runnable
            public void run() {
                lk.this.Lxb();
            }
        };
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.JXs, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.nJ
    public void LD() {
        removeCallbacks(this.HD);
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
        postDelayed(this.HD, 2500L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Lxb() {
        final View childAt;
        final View childAt2 = getChildAt(this.DY);
        if (childAt2 == null) {
            return;
        }
        int i = this.DY;
        if (i == 0) {
            this.Sfi = false;
        }
        if (i + 1 >= getChildCount() || ((ViewGroup) getChildAt(this.DY + 1)).getChildCount() <= 0) {
            this.Sfi = true;
            childAt = getChildAt(this.DY - 1);
            this.Lxb = ObjectAnimator.ofFloat(childAt2, "translationX", 0.0f, (getChildAt(this.DY).getWidth() + this.ebl) / 2);
        } else {
            childAt = getChildAt(this.DY + 1);
            this.Lxb = ObjectAnimator.ofFloat(childAt2, "translationX", 0.0f, (-(getChildAt(this.DY).getWidth() + this.ebl)) / 2);
        }
        if (childAt == null) {
            return;
        }
        this.Lxb.setInterpolator(new LinearInterpolator());
        this.Lxb.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lk.2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                childAt2.setVisibility(8);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        });
        if (this.Sfi) {
            this.LD = ObjectAnimator.ofFloat(childAt, "translationX", (-(childAt.getWidth() + this.ebl)) / 2, 0.0f);
        } else {
            this.LD = ObjectAnimator.ofFloat(childAt, "translationX", (childAt.getWidth() + this.ebl) / 2, 0.0f);
        }
        this.LD.setInterpolator(new LinearInterpolator());
        this.LD.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lk.3
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
                childAt.setVisibility(0);
            }
        });
        this.Lxb.setDuration(500L);
        this.LD.setDuration(500L);
        this.Lxb.start();
        this.LD.start();
        if (this.Sfi) {
            this.DY--;
        } else {
            this.DY++;
        }
        postDelayed(this.HD, 2000L);
    }
}
