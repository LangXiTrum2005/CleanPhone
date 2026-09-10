package com.bytedance.sdk.component.adexpress.di;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.card.MaterialCardView;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes2.dex */
public class vr extends FrameLayout {
    private TextView di;
    private boolean fi;
    private uq ik;
    private AnimatorSet ka;
    private ImageView lr;
    private Context ri;

    public vr(Context context) {
        super(context);
        this.fi = true;
        this.ri = context;
        this.ka = new AnimatorSet();
        ik();
        ka();
        post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.di.vr.1
            @Override // java.lang.Runnable
            public void run() {
                int iRi = (int) com.bytedance.sdk.component.adexpress.ka.xha.ri(vr.this.ri, 50.0f);
                int iRi2 = (int) com.bytedance.sdk.component.adexpress.ka.xha.ri(vr.this.ri, 50.0f);
                if (vr.this.ik.getMeasuredHeight() > 0) {
                    iRi = vr.this.ik.getMeasuredHeight();
                }
                if (vr.this.ik.getMeasuredWidth() > 0) {
                    iRi2 = vr.this.ik.getMeasuredWidth();
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) vr.this.lr.getLayoutParams();
                layoutParams.topMargin = ((int) ((iRi / 2.0f) - com.bytedance.sdk.component.adexpress.ka.xha.ri(vr.this.getContext(), 5.0f))) + ((int) com.bytedance.sdk.component.adexpress.ka.xha.ri(vr.this.ri, 40.0f));
                layoutParams.leftMargin = ((int) ((iRi2 / 2.0f) - com.bytedance.sdk.component.adexpress.ka.xha.ri(vr.this.getContext(), 5.0f))) + ((int) com.bytedance.sdk.component.adexpress.ka.xha.ri(vr.this.ri, 20.0f));
                layoutParams.bottomMargin = (int) (((-iRi) / 2.0f) + com.bytedance.sdk.component.adexpress.ka.xha.ri(vr.this.getContext(), 5.0f));
                layoutParams.rightMargin = (int) (((-iRi2) / 2.0f) + com.bytedance.sdk.component.adexpress.ka.xha.ri(vr.this.getContext(), 5.0f));
                layoutParams.setMarginStart(layoutParams.leftMargin);
                layoutParams.setMarginEnd(layoutParams.rightMargin);
                vr.this.lr.setLayoutParams(layoutParams);
            }
        });
    }

    public void setGuideText(String str) {
        this.di.setVisibility(0);
        this.di.setText(str);
    }

    public void setGuideTextColor(int i) {
        this.di.setTextColor(i);
    }

    private void ik() {
        this.ik = new uq(this.ri);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.ka.xha.ri(this.ri, 50.0f), (int) com.bytedance.sdk.component.adexpress.ka.xha.ri(this.ri, 50.0f));
        layoutParams.gravity = MaterialCardView.CHECKED_ICON_GRAVITY_TOP_START;
        layoutParams.topMargin = (int) com.bytedance.sdk.component.adexpress.ka.xha.ri(this.ri, 40.0f);
        int iRi = (int) com.bytedance.sdk.component.adexpress.ka.xha.ri(this.ri, 20.0f);
        layoutParams.leftMargin = iRi;
        layoutParams.setMarginStart(iRi);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        addView(this.ik, layoutParams);
        this.lr = new ImageView(this.ri);
        ViewGroup.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.ka.xha.ri(this.ri, 78.0f), (int) com.bytedance.sdk.component.adexpress.ka.xha.ri(this.ri, 78.0f));
        this.lr.setImageResource(com.bytedance.sdk.component.utils.uq.ka(this.ri, "tt_splash_hand"));
        addView(this.lr, layoutParams2);
        TextView textView = new TextView(this.ri);
        this.di = textView;
        textView.setTextColor(-1);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 81;
        layoutParams3.bottomMargin = (int) com.bytedance.sdk.component.adexpress.ka.xha.ri(this.ri, 10.0f);
        addView(this.di, layoutParams3);
        this.di.setVisibility(8);
    }

    private void ka() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.lr, "scaleX", 1.0f, 1.0f, 1.0f, 0.9f);
        objectAnimatorOfFloat.setDuration(600L);
        objectAnimatorOfFloat.setRepeatMode(2);
        objectAnimatorOfFloat.setRepeatCount(-1);
        objectAnimatorOfFloat.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.di.vr.2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                if (vr.this.fi) {
                    vr.this.ik.ri();
                }
                vr vrVar = vr.this;
                vrVar.fi = !vrVar.fi;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(vr.this.lr, "alpha", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
                objectAnimatorOfFloat2.setDuration(200L);
                objectAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
                objectAnimatorOfFloat2.start();
                vr.this.lr.setVisibility(0);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }
        });
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.lr, "scaleY", 1.0f, 1.0f, 1.0f, 0.9f);
        objectAnimatorOfFloat2.setDuration(600L);
        objectAnimatorOfFloat2.setRepeatMode(2);
        objectAnimatorOfFloat2.setRepeatCount(-1);
        this.ka.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
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
