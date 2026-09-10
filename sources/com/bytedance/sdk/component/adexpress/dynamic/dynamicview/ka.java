package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes2.dex */
public class ka extends di {
    private int ac;
    private Runnable ihz;
    ObjectAnimator lr;
    ObjectAnimator ri;

    public ka(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.ka.mj mjVar) {
        super(context, dynamicRootView, mjVar);
        this.ac = 0;
        this.ihz = new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ka.1
            @Override // java.lang.Runnable
            public void run() {
                ka.this.ri();
            }
        };
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fi, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.dzy
    public void lr() {
        removeCallbacks(this.ihz);
        ObjectAnimator objectAnimator = this.ri;
        if (objectAnimator != null) {
            objectAnimator.removeAllUpdateListeners();
            this.ri.cancel();
        }
        ObjectAnimator objectAnimator2 = this.lr;
        if (objectAnimator2 != null) {
            objectAnimator2.removeAllUpdateListeners();
            this.lr.cancel();
        }
        super.lr();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.di, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fi, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            layoutParams.topMargin = (this.mj - layoutParams.height) / 2;
            childAt.setLayoutParams(layoutParams);
            if (i != 0) {
                childAt.setVisibility(8);
            }
        }
        postDelayed(this.ihz, 2500L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ri() {
        final View childAt = getChildAt(this.ac);
        final View childAt2 = getChildAt((this.ac + 1) % getChildCount());
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(childAt, "translationY", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (-(this.mj + getChildAt(this.ac).getHeight())) / 2);
        this.ri = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        this.ri.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ka.2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                childAt.setVisibility(8);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        });
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(childAt2, "translationY", (this.mj + childAt2.getHeight()) / 2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.lr = objectAnimatorOfFloat2;
        objectAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
        this.lr.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ka.3
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                childAt2.setVisibility(0);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }
        });
        this.ri.setDuration(500L);
        this.lr.setDuration(500L);
        this.ri.start();
        this.lr.start();
        int i = this.ac + 1;
        this.ac = i;
        this.ac = i % getChildCount();
        postDelayed(this.ihz, 2000L);
    }
}
