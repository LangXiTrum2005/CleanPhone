package com.bytedance.sdk.component.adexpress.lc;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public class VVE extends FrameLayout {
    private boolean JXs;
    private ImageView LD;
    private Context Lxb;
    private AnimatorSet ZU;
    private TextView lc;
    private eK lk;

    public VVE(@NonNull Context context) {
        super(context);
        this.JXs = true;
        this.Lxb = context;
        this.ZU = new AnimatorSet();
        lk();
        ZU();
        post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.lc.VVE.1
            @Override // java.lang.Runnable
            public void run() {
                int iLxb = (int) com.bytedance.sdk.component.adexpress.ZU.OY.Lxb(VVE.this.Lxb, 50.0f);
                int iLxb2 = (int) com.bytedance.sdk.component.adexpress.ZU.OY.Lxb(VVE.this.Lxb, 50.0f);
                if (VVE.this.lk.getMeasuredHeight() > 0) {
                    iLxb = VVE.this.lk.getMeasuredHeight();
                }
                if (VVE.this.lk.getMeasuredWidth() > 0) {
                    iLxb2 = VVE.this.lk.getMeasuredWidth();
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) VVE.this.LD.getLayoutParams();
                layoutParams.topMargin = ((int) ((iLxb / 2.0f) - com.bytedance.sdk.component.adexpress.ZU.OY.Lxb(VVE.this.getContext(), 5.0f))) + ((int) com.bytedance.sdk.component.adexpress.ZU.OY.Lxb(VVE.this.Lxb, 40.0f));
                layoutParams.leftMargin = ((int) ((iLxb2 / 2.0f) - com.bytedance.sdk.component.adexpress.ZU.OY.Lxb(VVE.this.getContext(), 5.0f))) + ((int) com.bytedance.sdk.component.adexpress.ZU.OY.Lxb(VVE.this.Lxb, 20.0f));
                layoutParams.bottomMargin = (int) (com.bytedance.sdk.component.adexpress.ZU.OY.Lxb(VVE.this.getContext(), 5.0f) + ((-iLxb) / 2.0f));
                layoutParams.rightMargin = (int) (com.bytedance.sdk.component.adexpress.ZU.OY.Lxb(VVE.this.getContext(), 5.0f) + ((-iLxb2) / 2.0f));
                layoutParams.setMarginStart(layoutParams.leftMargin);
                layoutParams.setMarginEnd(layoutParams.rightMargin);
                VVE.this.LD.setLayoutParams(layoutParams);
            }
        });
    }

    public void setGuideText(String str) {
        this.lc.setVisibility(0);
        this.lc.setText(str);
    }

    public void setGuideTextColor(int i) {
        this.lc.setTextColor(i);
    }

    private void ZU() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.LD, "scaleX", 1.0f, 1.0f, 1.0f, 0.9f);
        objectAnimatorOfFloat.setDuration(600L);
        objectAnimatorOfFloat.setRepeatMode(2);
        objectAnimatorOfFloat.setRepeatCount(-1);
        objectAnimatorOfFloat.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.lc.VVE.2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                if (VVE.this.JXs) {
                    VVE.this.lk.Lxb();
                }
                VVE vve = VVE.this;
                vve.JXs = !vve.JXs;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(VVE.this.LD, "alpha", 0.0f, 1.0f);
                objectAnimatorOfFloat2.setDuration(200L);
                objectAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
                objectAnimatorOfFloat2.start();
                VVE.this.LD.setVisibility(0);
            }
        });
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.LD, "scaleY", 1.0f, 1.0f, 1.0f, 0.9f);
        objectAnimatorOfFloat2.setDuration(600L);
        objectAnimatorOfFloat2.setRepeatMode(2);
        objectAnimatorOfFloat2.setRepeatCount(-1);
        this.ZU.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
    }

    private void lk() {
        this.lk = new eK(this.Lxb);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.ZU.OY.Lxb(this.Lxb, 50.0f), (int) com.bytedance.sdk.component.adexpress.ZU.OY.Lxb(this.Lxb, 50.0f));
        layoutParams.gravity = 8388659;
        layoutParams.topMargin = (int) com.bytedance.sdk.component.adexpress.ZU.OY.Lxb(this.Lxb, 40.0f);
        int iLxb = (int) com.bytedance.sdk.component.adexpress.ZU.OY.Lxb(this.Lxb, 20.0f);
        layoutParams.leftMargin = iLxb;
        layoutParams.setMarginStart(iLxb);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        addView(this.lk, layoutParams);
        this.LD = new ImageView(this.Lxb);
        ViewGroup.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.ZU.OY.Lxb(this.Lxb, 78.0f), (int) com.bytedance.sdk.component.adexpress.ZU.OY.Lxb(this.Lxb, 78.0f));
        this.LD.setImageResource(com.bytedance.sdk.component.utils.tD.ZU(this.Lxb, "tt_splash_hand"));
        addView(this.LD, layoutParams2);
        TextView textView = new TextView(this.Lxb);
        this.lc = textView;
        textView.setTextColor(-1);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 81;
        layoutParams3.bottomMargin = (int) com.bytedance.sdk.component.adexpress.ZU.OY.Lxb(this.Lxb, 10.0f);
        addView(this.lc, layoutParams3);
        this.lc.setVisibility(8);
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
