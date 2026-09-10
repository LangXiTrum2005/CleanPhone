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
public class aw extends FrameLayout {
    private TextView di;
    private boolean fi;
    private ka ik;
    private AnimatorSet ka;
    private ImageView lr;
    private Context ri;

    public aw(Context context) {
        super(context);
        this.fi = true;
        this.ri = context;
        this.ka = new AnimatorSet();
        ik();
        ka();
        post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.di.aw.1
            @Override // java.lang.Runnable
            public void run() {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) aw.this.lr.getLayoutParams();
                layoutParams.topMargin = ((int) ((aw.this.ik.getMeasuredHeight() / 2.0f) - com.bytedance.sdk.component.adexpress.ka.xha.ri(aw.this.getContext(), 5.0f))) + ((int) com.bytedance.sdk.component.adexpress.ka.xha.ri(aw.this.ri, 20.0f));
                layoutParams.leftMargin = ((int) ((aw.this.ik.getMeasuredWidth() / 2.0f) - com.bytedance.sdk.component.adexpress.ka.xha.ri(aw.this.getContext(), 5.0f))) + ((int) com.bytedance.sdk.component.adexpress.ka.xha.ri(aw.this.ri, 20.0f));
                layoutParams.bottomMargin = (int) (((-aw.this.ik.getMeasuredHeight()) / 2.0f) + com.bytedance.sdk.component.adexpress.ka.xha.ri(aw.this.getContext(), 5.0f));
                layoutParams.rightMargin = (int) (((-aw.this.ik.getMeasuredWidth()) / 2.0f) + com.bytedance.sdk.component.adexpress.ka.xha.ri(aw.this.getContext(), 5.0f));
                layoutParams.setMarginStart(layoutParams.leftMargin);
                layoutParams.setMarginEnd(layoutParams.rightMargin);
                aw.this.lr.setLayoutParams(layoutParams);
            }
        });
    }

    public void setGuideText(String str) {
        this.di.setText(str);
    }

    public void setGuideTextColor(int i) {
        this.di.setTextColor(i);
    }

    private void ik() {
        this.ik = new ka(this.ri);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.ka.xha.ri(this.ri, 80.0f), (int) com.bytedance.sdk.component.adexpress.ka.xha.ri(this.ri, 80.0f));
        layoutParams.gravity = MaterialCardView.CHECKED_ICON_GRAVITY_TOP_START;
        layoutParams.topMargin = (int) com.bytedance.sdk.component.adexpress.ka.xha.ri(this.ri, 20.0f);
        int iRi = (int) com.bytedance.sdk.component.adexpress.ka.xha.ri(this.ri, 20.0f);
        layoutParams.leftMargin = iRi;
        layoutParams.setMarginStart(iRi);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        addView(this.ik, layoutParams);
        this.ik.ri();
        this.lr = new ImageView(this.ri);
        ViewGroup.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.ka.xha.ri(this.ri, 80.0f), (int) com.bytedance.sdk.component.adexpress.ka.xha.ri(this.ri, 80.0f));
        this.lr.setImageResource(com.bytedance.sdk.component.utils.uq.ka(this.ri, "tt_splash_hand"));
        addView(this.lr, layoutParams2);
        TextView textView = new TextView(this.ri);
        this.di = textView;
        textView.setTextColor(-1);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 81;
        layoutParams3.bottomMargin = (int) com.bytedance.sdk.component.adexpress.ka.xha.ri(this.ri, 10.0f);
        addView(this.di, layoutParams3);
    }

    private void ka() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.lr, "scaleX", 1.0f, 0.8f);
        objectAnimatorOfFloat.setDuration(1000L);
        objectAnimatorOfFloat.setRepeatMode(2);
        objectAnimatorOfFloat.setRepeatCount(-1);
        objectAnimatorOfFloat.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.di.aw.2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                if (aw.this.fi) {
                    aw.this.ik.ri();
                    aw.this.ik.setAlpha(1.0f);
                } else {
                    aw.this.ik.lr();
                    aw.this.ik.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                }
                aw awVar = aw.this;
                awVar.fi = !awVar.fi;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(aw.this.lr, "alpha", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
                objectAnimatorOfFloat2.setDuration(200L);
                objectAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
                objectAnimatorOfFloat2.start();
                aw.this.lr.setVisibility(0);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }
        });
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.lr, "scaleY", 1.0f, 0.8f);
        objectAnimatorOfFloat2.setDuration(1000L);
        objectAnimatorOfFloat2.setRepeatMode(2);
        objectAnimatorOfFloat2.setRepeatCount(-1);
        this.ka.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
    }

    public void lr() {
        AnimatorSet animatorSet = this.ka;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        ka kaVar = this.ik;
        if (kaVar != null) {
            kaVar.lr();
        }
    }

    public void ri() {
        this.ka.start();
    }
}
