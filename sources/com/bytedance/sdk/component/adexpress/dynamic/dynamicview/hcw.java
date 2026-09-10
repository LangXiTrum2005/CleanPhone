package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import com.ironsource.Ua;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes2.dex */
public class hcw extends di {
    private int ac;
    private boolean ihz;
    ObjectAnimator lr;
    ObjectAnimator ri;
    private Runnable uq;

    public hcw(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.ka.mj mjVar) {
        super(context, dynamicRootView, mjVar);
        this.ac = 0;
        this.ihz = false;
        this.uq = new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.hcw.1
            @Override // java.lang.Runnable
            public void run() {
                hcw.this.ri();
            }
        };
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fi, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.dzy
    public void lr() {
        removeCallbacks(this.uq);
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
        postDelayed(this.uq, 2500L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ri() {
        final View childAt;
        final View childAt2 = getChildAt(this.ac);
        int i = this.ac;
        if (i == 0) {
            this.ihz = false;
        }
        boolean z = i + 1 >= getChildCount() || ((ViewGroup) getChildAt(this.ac + 1)).getChildCount() <= 0;
        if (this.aw.qt().fi().ri() || !z) {
            View childAt3 = z ? getChildAt((this.ac + 2) % getChildCount()) : getChildAt((this.ac + 1) % getChildCount());
            this.ri = ObjectAnimator.ofFloat(childAt2, "translationY", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (-(this.mj + getChildAt(this.ac).getHeight())) / 2);
            if (z) {
                this.ac++;
            }
            childAt = childAt3;
        } else {
            this.ihz = true;
            childAt = getChildAt(this.ac - 1);
            this.ri = ObjectAnimator.ofFloat(childAt2, "translationY", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (this.mj + getChildAt(this.ac).getHeight()) / 2);
        }
        this.ri.setInterpolator(new LinearInterpolator());
        this.ri.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.hcw.2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                childAt2.setVisibility(8);
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
        if (this.ihz) {
            this.lr = ObjectAnimator.ofFloat(childAt, "translationY", (-(this.mj + childAt.getHeight())) / 2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        } else {
            this.lr = ObjectAnimator.ofFloat(childAt, "translationY", (this.mj + childAt.getHeight()) / 2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        this.lr.setInterpolator(new LinearInterpolator());
        this.lr.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.hcw.3
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                childAt.setVisibility(0);
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
        if (this.ihz) {
            this.ac--;
        } else {
            int i2 = this.ac + 1;
            this.ac = i2;
            this.ac = i2 % getChildCount();
        }
        postDelayed(this.uq, Ua.C);
    }
}
