package com.bytedance.sdk.component.adexpress.lc;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.motion.widget.Key;

/* JADX INFO: loaded from: classes2.dex */
public class LD extends FrameLayout {
    private View JXs;
    private ObjectAnimator LD;
    private AnimatorSet Lxb;
    private int OY;
    private int QAg;
    private View ZU;
    private ImageView ebl;
    private View lc;
    private boolean lk;
    private Context nBu;

    public LD(Context context, int i, int i2) {
        super(context);
        this.lk = false;
        this.Lxb = new AnimatorSet();
        this.OY = i;
        this.QAg = i2;
        this.nBu = context;
        lk();
        ZU();
    }

    private void ZU() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.ZU, "scaleX", 1.0f, 2.0f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.ZU, "scaleY", 1.0f, 2.0f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.JXs, "scaleX", 1.0f, 2.5f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(this.JXs, "scaleY", 1.0f, 2.5f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(this.lc, "scaleX", 1.0f, 1.5f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(this.lc, "scaleY", 1.0f, 1.5f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat7 = ObjectAnimator.ofFloat(this.ebl, Key.ROTATION, 0.0f, -20.0f, 0.0f);
        this.LD = objectAnimatorOfFloat7;
        objectAnimatorOfFloat7.setDuration(1000L);
        this.Lxb.setDuration(1500L);
        this.Lxb.setInterpolator(new AccelerateDecelerateInterpolator());
        this.Lxb.play(objectAnimatorOfFloat).with(objectAnimatorOfFloat2).with(objectAnimatorOfFloat3).with(objectAnimatorOfFloat4).with(objectAnimatorOfFloat5).with(objectAnimatorOfFloat6);
        this.Lxb.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.lc.LD.1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                LD.this.lk = true;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                if (LD.this.lk) {
                    return;
                }
                LD.this.LD.start();
                LD.this.Lxb.start();
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        });
    }

    private void lk() {
        View view = new View(this.nBu);
        this.ZU = view;
        view.setBackground(Lxb("#1A7BBEFF", "#337BBEFF"));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) (((double) this.OY) * 0.45d), (int) (((double) this.QAg) * 0.45d));
        layoutParams.gravity = 17;
        this.ZU.setLayoutParams(layoutParams);
        addView(this.ZU);
        View view2 = new View(this.nBu);
        this.JXs = view2;
        view2.setBackground(Lxb("#337BBEFF", "#807BBEFF"));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) (((double) this.OY) * 0.25d), (int) (((double) this.QAg) * 0.25d));
        layoutParams2.gravity = 17;
        this.JXs.setLayoutParams(layoutParams2);
        addView(this.JXs);
        View view3 = new View(this.nBu);
        this.lc = view3;
        view3.setBackground(Lxb("#807BBEFF", "#FF7BBEFF"));
        int i = this.OY;
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams((int) (((double) i) * 0.25d), (int) (((double) i) * 0.25d));
        layoutParams3.gravity = 17;
        this.lc.setLayoutParams(layoutParams3);
        addView(this.lc);
        ImageView imageView = new ImageView(this.nBu);
        this.ebl = imageView;
        imageView.setImageResource(com.bytedance.sdk.component.utils.tD.ZU(getContext(), "tt_blue_hand"));
        this.ebl.setScaleType(ImageView.ScaleType.FIT_CENTER);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams((int) (((double) this.OY) * 0.62d), (int) (((double) this.QAg) * 0.53d));
        layoutParams4.gravity = 17;
        layoutParams4.topMargin = (layoutParams4.width / 2) - 5;
        layoutParams4.leftMargin = (layoutParams4.height / 2) - 5;
        this.ebl.setLayoutParams(layoutParams4);
        addView(this.ebl);
    }

    public void LD() {
        this.lk = true;
        ObjectAnimator objectAnimator = this.LD;
        if (objectAnimator == null || this.Lxb == null) {
            return;
        }
        objectAnimator.cancel();
        this.Lxb.cancel();
    }

    private GradientDrawable Lxb(String str, String str2) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(Color.parseColor(str));
        gradientDrawable.setStroke(1, Color.parseColor(str2));
        return gradientDrawable;
    }

    public void Lxb() {
        this.lk = false;
        ObjectAnimator objectAnimator = this.LD;
        if (objectAnimator == null || this.Lxb == null) {
            return;
        }
        objectAnimator.start();
        this.Lxb.start();
    }
}
