package com.bytedance.sdk.component.adexpress.lc;

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
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public class Sfi extends FrameLayout {
    private TextView JXs;
    private ImageView LD;
    private Context Lxb;
    private AnimatorSet OY;
    private AnimatorSet QAg;
    private ImageView ZU;
    private AnimatorSet ebl;
    private AnimatorSet lc;
    private ImageView lk;

    public Sfi(@NonNull Context context) {
        super(context);
        this.lc = new AnimatorSet();
        this.ebl = new AnimatorSet();
        this.OY = new AnimatorSet();
        this.QAg = new AnimatorSet();
        this.Lxb = context;
        lk();
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
    }

    public void setGuideText(String str) {
        this.JXs.setText(str);
    }

    private void ZU() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.LD, "alpha", 0.0f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.lk, "scaleX", 0.0f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.lk, "scaleY", 0.0f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(this.ZU, "alpha", 0.0f, 1.0f);
        this.OY.setDuration(300L);
        this.OY.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3, objectAnimatorOfFloat4);
        ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(this.LD, "translationX", 0.0f, com.bytedance.sdk.component.adexpress.ZU.OY.Lxb(getContext(), 90.0f));
        objectAnimatorOfFloat5.setInterpolator(new PathInterpolator(0.2f, 0.0f, 0.3f, 1.0f));
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, (int) com.bytedance.sdk.component.adexpress.ZU.OY.Lxb(getContext(), 90.0f));
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.lc.Sfi.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                Integer num = (Integer) valueAnimator.getAnimatedValue();
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) Sfi.this.ZU.getLayoutParams();
                layoutParams.width = num.intValue();
                Sfi.this.ZU.setLayoutParams(layoutParams);
            }
        });
        valueAnimatorOfInt.setInterpolator(new PathInterpolator(0.2f, 0.0f, 0.3f, 1.0f));
        ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(this.lk, "translationX", 0.0f, com.bytedance.sdk.component.adexpress.ZU.OY.Lxb(getContext(), 90.0f));
        objectAnimatorOfFloat6.setInterpolator(new PathInterpolator(0.2f, 0.0f, 0.3f, 1.0f));
        this.QAg.setDuration(1500L);
        this.QAg.playTogether(objectAnimatorOfFloat5, valueAnimatorOfInt, objectAnimatorOfFloat6);
        ObjectAnimator objectAnimatorOfFloat7 = ObjectAnimator.ofFloat(this.LD, "alpha", 1.0f, 0.0f);
        ObjectAnimator objectAnimatorOfFloat8 = ObjectAnimator.ofFloat(this.ZU, "alpha", 1.0f, 0.0f);
        ObjectAnimator objectAnimatorOfFloat9 = ObjectAnimator.ofFloat(this.lk, "alpha", 1.0f, 0.0f);
        this.ebl.setDuration(50L);
        this.ebl.playTogether(objectAnimatorOfFloat7, objectAnimatorOfFloat8, objectAnimatorOfFloat9);
        this.lc.playSequentially(this.OY, this.QAg, this.ebl);
    }

    private void lk() {
        ImageView imageView = new ImageView(this.Lxb);
        this.ZU = imageView;
        imageView.setBackgroundResource(com.bytedance.sdk.component.utils.tD.ZU(this.Lxb, "tt_splash_slide_right_bg"));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(0, -2);
        layoutParams.gravity = 48;
        layoutParams.leftMargin = (int) com.bytedance.sdk.component.adexpress.ZU.OY.Lxb(this.Lxb, 30.0f);
        addView(this.ZU, layoutParams);
        setClipChildren(false);
        setClipToPadding(false);
        ImageView imageView2 = new ImageView(this.Lxb);
        this.lk = imageView2;
        imageView2.setImageResource(com.bytedance.sdk.component.utils.tD.ZU(this.Lxb, "tt_splash_slide_right_circle"));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.ZU.OY.Lxb(this.Lxb, 50.0f), (int) com.bytedance.sdk.component.adexpress.ZU.OY.Lxb(this.Lxb, 50.0f));
        layoutParams2.gravity = 48;
        layoutParams2.leftMargin = (int) com.bytedance.sdk.component.adexpress.ZU.OY.Lxb(this.Lxb, 30.0f);
        addView(this.lk, layoutParams2);
        ImageView imageView3 = new ImageView(this.Lxb);
        this.LD = imageView3;
        imageView3.setImageResource(com.bytedance.sdk.component.utils.tD.ZU(this.Lxb, "tt_splash_hand2"));
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.ZU.OY.Lxb(this.Lxb, 80.0f), (int) com.bytedance.sdk.component.adexpress.ZU.OY.Lxb(this.Lxb, 80.0f));
        layoutParams3.gravity = 48;
        layoutParams3.leftMargin = (int) com.bytedance.sdk.component.adexpress.ZU.OY.Lxb(this.Lxb, 30.0f);
        addView(this.LD, layoutParams3);
        TextView textView = new TextView(this.Lxb);
        this.JXs = textView;
        textView.setTextColor(-1);
        this.JXs.setSingleLine();
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams4.gravity = 80;
        addView(this.JXs, layoutParams4);
        post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.lc.Sfi.1
            @Override // java.lang.Runnable
            public void run() {
                FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) Sfi.this.LD.getLayoutParams();
                layoutParams5.topMargin = (int) ((Sfi.this.lk.getMeasuredHeight() / 2.0f) - com.bytedance.sdk.component.adexpress.ZU.OY.Lxb(Sfi.this.getContext(), 7.0f));
                int iLxb = (-Sfi.this.lk.getMeasuredWidth()) + ((int) com.bytedance.sdk.component.adexpress.ZU.OY.Lxb(Sfi.this.Lxb, 30.0f));
                layoutParams5.leftMargin = iLxb;
                layoutParams5.setMarginStart(iLxb);
                layoutParams5.setMarginEnd(layoutParams5.rightMargin);
                Sfi.this.LD.setLayoutParams(layoutParams5);
                FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) Sfi.this.ZU.getLayoutParams();
                layoutParams6.topMargin = (int) ((Sfi.this.lk.getMeasuredHeight() / 2.0f) - com.bytedance.sdk.component.adexpress.ZU.OY.Lxb(Sfi.this.getContext(), 5.0f));
                layoutParams6.leftMargin = (int) ((Sfi.this.lk.getMeasuredWidth() / 2.0f) + ((int) com.bytedance.sdk.component.adexpress.ZU.OY.Lxb(Sfi.this.Lxb, 30.0f)));
                layoutParams5.setMarginStart(layoutParams5.leftMargin);
                layoutParams5.setMarginEnd(layoutParams5.rightMargin);
                Sfi.this.ZU.setLayoutParams(layoutParams6);
            }
        });
    }

    public void LD() {
        try {
            AnimatorSet animatorSet = this.lc;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = this.OY;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            AnimatorSet animatorSet3 = this.QAg;
            if (animatorSet3 != null) {
                animatorSet3.cancel();
            }
            AnimatorSet animatorSet4 = this.ebl;
            if (animatorSet4 != null) {
                animatorSet4.cancel();
            }
        } catch (Throwable unused) {
        }
    }

    public void Lxb() {
        ZU();
        this.lc.start();
        this.lc.addListener(new AnimatorListenerAdapter() { // from class: com.bytedance.sdk.component.adexpress.lc.Sfi.3
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                Sfi.this.postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.lc.Sfi.3.1
                    @Override // java.lang.Runnable
                    public void run() {
                        Sfi.this.lc.start();
                    }
                }, 200L);
            }
        });
    }
}
