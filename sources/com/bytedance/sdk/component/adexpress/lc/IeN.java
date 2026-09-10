package com.bytedance.sdk.component.adexpress.lc;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public class IeN extends FrameLayout {
    private boolean JXs;
    private ImageView LD;
    private Context Lxb;
    private AnimatorSet ZU;
    private eK lk;

    public IeN(@NonNull Context context) {
        super(context);
        this.JXs = true;
        this.Lxb = context;
        this.ZU = new AnimatorSet();
        lk();
        ZU();
        post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.lc.IeN.1
            @Override // java.lang.Runnable
            public void run() {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) IeN.this.LD.getLayoutParams();
                layoutParams.topMargin = (int) ((IeN.this.lk.getMeasuredHeight() / 2.0f) - com.bytedance.sdk.component.adexpress.ZU.OY.Lxb(IeN.this.getContext(), 5.0f));
                layoutParams.leftMargin = (int) ((IeN.this.lk.getMeasuredWidth() / 2.0f) - com.bytedance.sdk.component.adexpress.ZU.OY.Lxb(IeN.this.getContext(), 5.0f));
                layoutParams.bottomMargin = (int) (com.bytedance.sdk.component.adexpress.ZU.OY.Lxb(IeN.this.getContext(), 5.0f) + ((-IeN.this.lk.getMeasuredHeight()) / 2.0f));
                layoutParams.rightMargin = (int) (com.bytedance.sdk.component.adexpress.ZU.OY.Lxb(IeN.this.getContext(), 5.0f) + ((-IeN.this.lk.getMeasuredWidth()) / 2.0f));
                layoutParams.setMarginStart(layoutParams.leftMargin);
                layoutParams.setMarginEnd(layoutParams.rightMargin);
                IeN.this.LD.setLayoutParams(layoutParams);
            }
        });
    }

    private void ZU() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.LD, "scaleX", 1.0f, 0.9f);
        objectAnimatorOfFloat.setDuration(800L);
        objectAnimatorOfFloat.setRepeatMode(2);
        objectAnimatorOfFloat.setRepeatCount(-1);
        objectAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        objectAnimatorOfFloat.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.lc.IeN.2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                if (IeN.this.JXs) {
                    IeN.this.lk.Lxb();
                }
                IeN ieN = IeN.this;
                ieN.JXs = !ieN.JXs;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(IeN.this.LD, "alpha", 0.0f, 1.0f);
                objectAnimatorOfFloat2.setDuration(200L);
                objectAnimatorOfFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
                objectAnimatorOfFloat2.start();
                IeN.this.LD.setVisibility(0);
            }
        });
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.LD, "scaleY", 1.0f, 0.9f);
        objectAnimatorOfFloat2.setDuration(800L);
        objectAnimatorOfFloat2.setRepeatMode(2);
        objectAnimatorOfFloat2.setRepeatCount(-1);
        objectAnimatorOfFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
        this.ZU.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
    }

    private void lk() {
        this.lk = new eK(this.Lxb);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.ZU.OY.Lxb(this.Lxb, 40.0f), (int) com.bytedance.sdk.component.adexpress.ZU.OY.Lxb(this.Lxb, 40.0f));
        layoutParams.gravity = 8388627;
        addView(this.lk, layoutParams);
        this.LD = new ImageView(this.Lxb);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.ZU.OY.Lxb(this.Lxb, 62.0f), (int) com.bytedance.sdk.component.adexpress.ZU.OY.Lxb(this.Lxb, 62.0f));
        layoutParams2.gravity = 16;
        this.LD.setImageResource(com.bytedance.sdk.component.utils.tD.ZU(this.Lxb, "tt_splash_hand"));
        addView(this.LD, layoutParams2);
    }

    public void LD() {
        AnimatorSet animatorSet = this.ZU;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        eK eKVar = this.lk;
        if (eKVar != null) {
            eKVar.LD();
        }
        ImageView imageView = this.LD;
        if (imageView != null) {
            imageView.clearAnimation();
        }
    }

    public void Lxb() {
        this.ZU.start();
    }
}
