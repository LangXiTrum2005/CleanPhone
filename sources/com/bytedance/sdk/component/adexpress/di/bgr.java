package com.bytedance.sdk.component.adexpress.di;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.material.navigation.NavigationBarView;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes2.dex */
public class bgr extends FrameLayout {
    private boolean fi;
    private uq ik;
    private AnimatorSet ka;
    private ImageView lr;
    private Context ri;

    public bgr(Context context) {
        super(context);
        this.fi = true;
        this.ri = context;
        this.ka = new AnimatorSet();
        ik();
        ka();
        post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.di.bgr.1
            @Override // java.lang.Runnable
            public void run() {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) bgr.this.lr.getLayoutParams();
                layoutParams.topMargin = (int) ((bgr.this.ik.getMeasuredHeight() / 2.0f) - com.bytedance.sdk.component.adexpress.ka.xha.ri(bgr.this.getContext(), 5.0f));
                layoutParams.leftMargin = (int) ((bgr.this.ik.getMeasuredWidth() / 2.0f) - com.bytedance.sdk.component.adexpress.ka.xha.ri(bgr.this.getContext(), 5.0f));
                layoutParams.bottomMargin = (int) (((-bgr.this.ik.getMeasuredHeight()) / 2.0f) + com.bytedance.sdk.component.adexpress.ka.xha.ri(bgr.this.getContext(), 5.0f));
                layoutParams.rightMargin = (int) (((-bgr.this.ik.getMeasuredWidth()) / 2.0f) + com.bytedance.sdk.component.adexpress.ka.xha.ri(bgr.this.getContext(), 5.0f));
                layoutParams.setMarginStart(layoutParams.leftMargin);
                layoutParams.setMarginEnd(layoutParams.rightMargin);
                bgr.this.lr.setLayoutParams(layoutParams);
            }
        });
    }

    private void ka() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.lr, "scaleX", 1.0f, 0.9f);
        objectAnimatorOfFloat.setDuration(800L);
        objectAnimatorOfFloat.setRepeatMode(2);
        objectAnimatorOfFloat.setRepeatCount(-1);
        objectAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        objectAnimatorOfFloat.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.di.bgr.2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                if (bgr.this.fi) {
                    bgr.this.ik.ri();
                }
                bgr bgrVar = bgr.this;
                bgrVar.fi = !bgrVar.fi;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(bgr.this.lr, "alpha", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
                objectAnimatorOfFloat2.setDuration(200L);
                objectAnimatorOfFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
                objectAnimatorOfFloat2.start();
                bgr.this.lr.setVisibility(0);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }
        });
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.lr, "scaleY", 1.0f, 0.9f);
        objectAnimatorOfFloat2.setDuration(800L);
        objectAnimatorOfFloat2.setRepeatMode(2);
        objectAnimatorOfFloat2.setRepeatCount(-1);
        objectAnimatorOfFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
        this.ka.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
    }

    private void ik() {
        this.ik = new uq(this.ri);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.ka.xha.ri(this.ri, 40.0f), (int) com.bytedance.sdk.component.adexpress.ka.xha.ri(this.ri, 40.0f));
        layoutParams.gravity = NavigationBarView.ITEM_GRAVITY_START_CENTER;
        addView(this.ik, layoutParams);
        this.lr = new ImageView(this.ri);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.ka.xha.ri(this.ri, 62.0f), (int) com.bytedance.sdk.component.adexpress.ka.xha.ri(this.ri, 62.0f));
        layoutParams2.gravity = 16;
        this.lr.setImageResource(com.bytedance.sdk.component.utils.uq.ka(this.ri, "tt_splash_hand"));
        addView(this.lr, layoutParams2);
    }

    public void lr() {
        AnimatorSet animatorSet = this.ka;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        uq uqVar = this.ik;
        if (uqVar != null) {
            uqVar.lr();
        }
        ImageView imageView = this.lr;
        if (imageView != null) {
            imageView.clearAnimation();
        }
    }

    public void ri() {
        this.ka.start();
    }
}
