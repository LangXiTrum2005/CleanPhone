package com.bytedance.sdk.component.adexpress.mo;

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

/* JADX INFO: loaded from: classes.dex */
public class jyq extends FrameLayout {
    private AnimatorSet jpc;
    private ImageView lnr;
    private ImageView mml;
    private AnimatorSet mo;
    private TextView mzz;
    private Context qdl;
    private AnimatorSet tvp;
    private ImageView ud;
    private AnimatorSet wd;

    public jyq(Context context) {
        super(context);
        this.mo = new AnimatorSet();
        this.wd = new AnimatorSet();
        this.jpc = new AnimatorSet();
        this.tvp = new AnimatorSet();
        this.qdl = context;
        lnr();
    }

    @Override // android.view.View
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
    }

    public void setGuideText(String str) {
        this.mzz.setText(str);
    }

    private void lnr() {
        ImageView imageView = new ImageView(this.qdl);
        this.mml = imageView;
        imageView.setBackgroundResource(com.bytedance.sdk.component.utils.ljh.mml(this.qdl, "tt_splash_slide_right_bg"));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(0, -2);
        layoutParams.gravity = 48;
        layoutParams.leftMargin = (int) com.bytedance.sdk.component.adexpress.mml.wd.qdl(this.qdl, 30.0f);
        addView(this.mml, layoutParams);
        setClipChildren(false);
        setClipToPadding(false);
        ImageView imageView2 = new ImageView(this.qdl);
        this.lnr = imageView2;
        imageView2.setImageResource(com.bytedance.sdk.component.utils.ljh.mml(this.qdl, "tt_splash_slide_right_circle"));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.mml.wd.qdl(this.qdl, 50.0f), (int) com.bytedance.sdk.component.adexpress.mml.wd.qdl(this.qdl, 50.0f));
        layoutParams2.gravity = 48;
        layoutParams2.leftMargin = (int) com.bytedance.sdk.component.adexpress.mml.wd.qdl(this.qdl, 30.0f);
        addView(this.lnr, layoutParams2);
        ImageView imageView3 = new ImageView(this.qdl);
        this.ud = imageView3;
        imageView3.setImageResource(com.bytedance.sdk.component.utils.ljh.mml(this.qdl, "tt_splash_hand2"));
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.mml.wd.qdl(this.qdl, 80.0f), (int) com.bytedance.sdk.component.adexpress.mml.wd.qdl(this.qdl, 80.0f));
        layoutParams3.gravity = 48;
        layoutParams3.leftMargin = (int) com.bytedance.sdk.component.adexpress.mml.wd.qdl(this.qdl, 30.0f);
        addView(this.ud, layoutParams3);
        TextView textView = new TextView(this.qdl);
        this.mzz = textView;
        textView.setTextColor(-1);
        this.mzz.setSingleLine();
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams4.gravity = 80;
        addView(this.mzz, layoutParams4);
        post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.mo.jyq.1
            @Override // java.lang.Runnable
            public void run() {
                FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) jyq.this.ud.getLayoutParams();
                layoutParams5.topMargin = (int) ((jyq.this.lnr.getMeasuredHeight() / 2.0f) - com.bytedance.sdk.component.adexpress.mml.wd.qdl(jyq.this.getContext(), 7.0f));
                int iQdl = (-jyq.this.lnr.getMeasuredWidth()) + ((int) com.bytedance.sdk.component.adexpress.mml.wd.qdl(jyq.this.qdl, 30.0f));
                layoutParams5.leftMargin = iQdl;
                layoutParams5.setMarginStart(iQdl);
                layoutParams5.setMarginEnd(layoutParams5.rightMargin);
                jyq.this.ud.setLayoutParams(layoutParams5);
                FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) jyq.this.mml.getLayoutParams();
                layoutParams6.topMargin = (int) ((jyq.this.lnr.getMeasuredHeight() / 2.0f) - com.bytedance.sdk.component.adexpress.mml.wd.qdl(jyq.this.getContext(), 5.0f));
                layoutParams6.leftMargin = (int) ((jyq.this.lnr.getMeasuredWidth() / 2.0f) + ((int) com.bytedance.sdk.component.adexpress.mml.wd.qdl(jyq.this.qdl, 30.0f)));
                layoutParams5.setMarginStart(layoutParams5.leftMargin);
                layoutParams5.setMarginEnd(layoutParams5.rightMargin);
                jyq.this.mml.setLayoutParams(layoutParams6);
            }
        });
    }

    private void mml() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.ud, "alpha", 0.0f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.lnr, "scaleX", 0.0f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.lnr, "scaleY", 0.0f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(this.mml, "alpha", 0.0f, 1.0f);
        this.jpc.setDuration(300L);
        this.jpc.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3, objectAnimatorOfFloat4);
        ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(this.ud, "translationX", 0.0f, com.bytedance.sdk.component.adexpress.mml.wd.qdl(getContext(), 90.0f));
        objectAnimatorOfFloat5.setInterpolator(new PathInterpolator(0.2f, 0.0f, 0.3f, 1.0f));
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, (int) com.bytedance.sdk.component.adexpress.mml.wd.qdl(getContext(), 90.0f));
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.mo.jyq.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                Integer num = (Integer) valueAnimator.getAnimatedValue();
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) jyq.this.mml.getLayoutParams();
                layoutParams.width = num.intValue();
                jyq.this.mml.setLayoutParams(layoutParams);
            }
        });
        valueAnimatorOfInt.setInterpolator(new PathInterpolator(0.2f, 0.0f, 0.3f, 1.0f));
        ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(this.lnr, "translationX", 0.0f, com.bytedance.sdk.component.adexpress.mml.wd.qdl(getContext(), 90.0f));
        objectAnimatorOfFloat6.setInterpolator(new PathInterpolator(0.2f, 0.0f, 0.3f, 1.0f));
        this.tvp.setDuration(1500L);
        this.tvp.playTogether(objectAnimatorOfFloat5, valueAnimatorOfInt, objectAnimatorOfFloat6);
        ObjectAnimator objectAnimatorOfFloat7 = ObjectAnimator.ofFloat(this.ud, "alpha", 1.0f, 0.0f);
        ObjectAnimator objectAnimatorOfFloat8 = ObjectAnimator.ofFloat(this.mml, "alpha", 1.0f, 0.0f);
        ObjectAnimator objectAnimatorOfFloat9 = ObjectAnimator.ofFloat(this.lnr, "alpha", 1.0f, 0.0f);
        this.wd.setDuration(50L);
        this.wd.playTogether(objectAnimatorOfFloat7, objectAnimatorOfFloat8, objectAnimatorOfFloat9);
        this.mo.playSequentially(this.jpc, this.tvp, this.wd);
    }

    public void qdl() {
        mml();
        this.mo.start();
        this.mo.addListener(new AnimatorListenerAdapter() { // from class: com.bytedance.sdk.component.adexpress.mo.jyq.3
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                jyq.this.postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.mo.jyq.3.1
                    @Override // java.lang.Runnable
                    public void run() {
                        jyq.this.mo.start();
                    }
                }, 200L);
            }
        });
    }

    public void ud() {
        try {
            AnimatorSet animatorSet = this.mo;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = this.jpc;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            AnimatorSet animatorSet3 = this.tvp;
            if (animatorSet3 != null) {
                animatorSet3.cancel();
            }
            AnimatorSet animatorSet4 = this.wd;
            if (animatorSet4 != null) {
                animatorSet4.cancel();
            }
        } catch (Throwable unused) {
        }
    }
}
