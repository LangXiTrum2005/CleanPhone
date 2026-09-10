package com.bytedance.sdk.component.adexpress.di;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.animation.PathInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes2.dex */
public class ac extends FrameLayout {
    private AnimatorSet di;
    private TextView fi;
    private ImageView ik;
    private AnimatorSet jbs;
    private ImageView ka;
    private ImageView lr;
    private AnimatorSet mj;
    private Context ri;
    private AnimatorSet xha;

    public ac(Context context) {
        super(context);
        this.di = new AnimatorSet();
        this.xha = new AnimatorSet();
        this.mj = new AnimatorSet();
        this.jbs = new AnimatorSet();
        this.ri = context;
        ik();
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
    }

    public void setGuideText(String str) {
        this.fi.setText(str);
    }

    private void ik() {
        ImageView imageView = new ImageView(this.ri);
        this.ka = imageView;
        imageView.setBackgroundResource(com.bytedance.sdk.component.utils.uq.ka(this.ri, "tt_splash_slide_right_bg"));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(0, -2);
        layoutParams.gravity = 48;
        layoutParams.leftMargin = (int) com.bytedance.sdk.component.adexpress.ka.xha.ri(this.ri, 30.0f);
        addView(this.ka, layoutParams);
        setClipChildren(false);
        setClipToPadding(false);
        ImageView imageView2 = new ImageView(this.ri);
        this.ik = imageView2;
        imageView2.setImageResource(com.bytedance.sdk.component.utils.uq.ka(this.ri, "tt_splash_slide_right_circle"));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.ka.xha.ri(this.ri, 50.0f), (int) com.bytedance.sdk.component.adexpress.ka.xha.ri(this.ri, 50.0f));
        layoutParams2.gravity = 48;
        layoutParams2.leftMargin = (int) com.bytedance.sdk.component.adexpress.ka.xha.ri(this.ri, 30.0f);
        addView(this.ik, layoutParams2);
        ImageView imageView3 = new ImageView(this.ri);
        this.lr = imageView3;
        imageView3.setImageResource(com.bytedance.sdk.component.utils.uq.ka(this.ri, "tt_splash_hand2"));
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.ka.xha.ri(this.ri, 80.0f), (int) com.bytedance.sdk.component.adexpress.ka.xha.ri(this.ri, 80.0f));
        layoutParams3.gravity = 48;
        layoutParams3.leftMargin = (int) com.bytedance.sdk.component.adexpress.ka.xha.ri(this.ri, 30.0f);
        addView(this.lr, layoutParams3);
        TextView textView = new TextView(this.ri);
        this.fi = textView;
        textView.setTextColor(-1);
        this.fi.setSingleLine();
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams4.gravity = 80;
        addView(this.fi, layoutParams4);
        post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.di.ac.1
            @Override // java.lang.Runnable
            public void run() {
                FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) ac.this.lr.getLayoutParams();
                layoutParams5.topMargin = (int) ((ac.this.ik.getMeasuredHeight() / 2.0f) - com.bytedance.sdk.component.adexpress.ka.xha.ri(ac.this.getContext(), 7.0f));
                int iRi = (-ac.this.ik.getMeasuredWidth()) + ((int) com.bytedance.sdk.component.adexpress.ka.xha.ri(ac.this.ri, 30.0f));
                layoutParams5.leftMargin = iRi;
                layoutParams5.setMarginStart(iRi);
                layoutParams5.setMarginEnd(layoutParams5.rightMargin);
                ac.this.lr.setLayoutParams(layoutParams5);
                FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) ac.this.ka.getLayoutParams();
                layoutParams6.topMargin = (int) ((ac.this.ik.getMeasuredHeight() / 2.0f) - com.bytedance.sdk.component.adexpress.ka.xha.ri(ac.this.getContext(), 5.0f));
                layoutParams6.leftMargin = (int) ((ac.this.ik.getMeasuredWidth() / 2.0f) + ((int) com.bytedance.sdk.component.adexpress.ka.xha.ri(ac.this.ri, 30.0f)));
                layoutParams5.setMarginStart(layoutParams5.leftMargin);
                layoutParams5.setMarginEnd(layoutParams5.rightMargin);
                ac.this.ka.setLayoutParams(layoutParams6);
            }
        });
    }

    private void ka() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.lr, "alpha", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.ik, "scaleX", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.ik, "scaleY", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(this.ka, "alpha", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        this.mj.setDuration(300L);
        this.mj.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3, objectAnimatorOfFloat4);
        ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(this.lr, "translationX", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, com.bytedance.sdk.component.adexpress.ka.xha.ri(getContext(), 90.0f));
        objectAnimatorOfFloat5.setInterpolator(new PathInterpolator(0.2f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.3f, 1.0f));
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, (int) com.bytedance.sdk.component.adexpress.ka.xha.ri(getContext(), 90.0f));
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.di.ac.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                Integer num = (Integer) valueAnimator.getAnimatedValue();
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) ac.this.ka.getLayoutParams();
                layoutParams.width = num.intValue();
                ac.this.ka.setLayoutParams(layoutParams);
            }
        });
        valueAnimatorOfInt.setInterpolator(new PathInterpolator(0.2f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.3f, 1.0f));
        ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(this.ik, "translationX", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, com.bytedance.sdk.component.adexpress.ka.xha.ri(getContext(), 90.0f));
        objectAnimatorOfFloat6.setInterpolator(new PathInterpolator(0.2f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.3f, 1.0f));
        this.jbs.setDuration(1500L);
        this.jbs.playTogether(objectAnimatorOfFloat5, valueAnimatorOfInt, objectAnimatorOfFloat6);
        ObjectAnimator objectAnimatorOfFloat7 = ObjectAnimator.ofFloat(this.lr, "alpha", 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        ObjectAnimator objectAnimatorOfFloat8 = ObjectAnimator.ofFloat(this.ka, "alpha", 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        ObjectAnimator objectAnimatorOfFloat9 = ObjectAnimator.ofFloat(this.ik, "alpha", 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.xha.setDuration(50L);
        this.xha.playTogether(objectAnimatorOfFloat7, objectAnimatorOfFloat8, objectAnimatorOfFloat9);
        this.di.playSequentially(this.mj, this.jbs, this.xha);
    }

    public void lr() {
        try {
            AnimatorSet animatorSet = this.di;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = this.mj;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            AnimatorSet animatorSet3 = this.jbs;
            if (animatorSet3 != null) {
                animatorSet3.cancel();
            }
            AnimatorSet animatorSet4 = this.xha;
            if (animatorSet4 != null) {
                animatorSet4.cancel();
            }
        } catch (Throwable unused) {
        }
    }

    public void ri() {
        ka();
        this.di.start();
        this.di.addListener(new AnimatorListenerAdapter() { // from class: com.bytedance.sdk.component.adexpress.di.ac.3
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                ac.this.postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.di.ac.3.1
                    @Override // java.lang.Runnable
                    public void run() {
                        ac.this.di.start();
                    }
                }, 200L);
            }
        });
    }
}
