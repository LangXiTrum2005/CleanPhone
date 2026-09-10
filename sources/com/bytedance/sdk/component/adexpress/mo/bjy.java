package com.bytedance.sdk.component.adexpress.mo;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes.dex */
public class bjy extends FrameLayout {
    private ljh lnr;
    private AnimatorSet mml;
    private boolean mzz;
    private Context qdl;
    private ImageView ud;

    public bjy(Context context) {
        super(context);
        this.mzz = true;
        this.qdl = context;
        this.mml = new AnimatorSet();
        lnr();
        mml();
        post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.mo.bjy.1
            @Override // java.lang.Runnable
            public void run() {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) bjy.this.ud.getLayoutParams();
                layoutParams.topMargin = (int) ((bjy.this.lnr.getMeasuredHeight() / 2.0f) - com.bytedance.sdk.component.adexpress.mml.wd.qdl(bjy.this.getContext(), 5.0f));
                layoutParams.leftMargin = (int) ((bjy.this.lnr.getMeasuredWidth() / 2.0f) - com.bytedance.sdk.component.adexpress.mml.wd.qdl(bjy.this.getContext(), 5.0f));
                layoutParams.bottomMargin = (int) (com.bytedance.sdk.component.adexpress.mml.wd.qdl(bjy.this.getContext(), 5.0f) + ((-bjy.this.lnr.getMeasuredHeight()) / 2.0f));
                layoutParams.rightMargin = (int) (com.bytedance.sdk.component.adexpress.mml.wd.qdl(bjy.this.getContext(), 5.0f) + ((-bjy.this.lnr.getMeasuredWidth()) / 2.0f));
                layoutParams.setMarginStart(layoutParams.leftMargin);
                layoutParams.setMarginEnd(layoutParams.rightMargin);
                bjy.this.ud.setLayoutParams(layoutParams);
            }
        });
    }

    private void mml() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.ud, "scaleX", 1.0f, 0.9f);
        objectAnimatorOfFloat.setDuration(800L);
        objectAnimatorOfFloat.setRepeatMode(2);
        objectAnimatorOfFloat.setRepeatCount(-1);
        objectAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        objectAnimatorOfFloat.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.mo.bjy.2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                if (bjy.this.mzz) {
                    bjy.this.lnr.qdl();
                }
                bjy bjyVar = bjy.this;
                bjyVar.mzz = !bjyVar.mzz;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(bjy.this.ud, "alpha", 0.0f, 1.0f);
                objectAnimatorOfFloat2.setDuration(200L);
                objectAnimatorOfFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
                objectAnimatorOfFloat2.start();
                bjy.this.ud.setVisibility(0);
            }
        });
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.ud, "scaleY", 1.0f, 0.9f);
        objectAnimatorOfFloat2.setDuration(800L);
        objectAnimatorOfFloat2.setRepeatMode(2);
        objectAnimatorOfFloat2.setRepeatCount(-1);
        objectAnimatorOfFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
        this.mml.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
    }

    private void lnr() {
        this.lnr = new ljh(this.qdl);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.mml.wd.qdl(this.qdl, 40.0f), (int) com.bytedance.sdk.component.adexpress.mml.wd.qdl(this.qdl, 40.0f));
        layoutParams.gravity = 8388627;
        addView(this.lnr, layoutParams);
        this.ud = new ImageView(this.qdl);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.mml.wd.qdl(this.qdl, 62.0f), (int) com.bytedance.sdk.component.adexpress.mml.wd.qdl(this.qdl, 62.0f));
        layoutParams2.gravity = 16;
        this.ud.setImageResource(com.bytedance.sdk.component.utils.ljh.mml(this.qdl, "tt_splash_hand"));
        addView(this.ud, layoutParams2);
    }

    public void ud() {
        AnimatorSet animatorSet = this.mml;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        ljh ljhVar = this.lnr;
        if (ljhVar != null) {
            ljhVar.ud();
        }
        ImageView imageView = this.ud;
        if (imageView != null) {
            imageView.clearAnimation();
        }
    }

    public void qdl() {
        this.mml.start();
    }
}
