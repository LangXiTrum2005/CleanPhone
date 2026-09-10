package com.bytedance.sdk.component.adexpress.mo;

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

/* JADX INFO: loaded from: classes.dex */
public class ud extends FrameLayout {
    private int jpc;
    private boolean lnr;
    private View mml;
    private View mo;
    private View mzz;
    private AnimatorSet qdl;
    private Context to;
    private int tvp;
    private ObjectAnimator ud;
    private ImageView wd;

    public ud(Context context, int i2, int i3) {
        super(context);
        this.lnr = false;
        this.qdl = new AnimatorSet();
        this.jpc = i2;
        this.tvp = i3;
        this.to = context;
        lnr();
        mml();
    }

    private void mml() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.mml, "scaleX", 1.0f, 2.0f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.mml, "scaleY", 1.0f, 2.0f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.mzz, "scaleX", 1.0f, 2.5f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(this.mzz, "scaleY", 1.0f, 2.5f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(this.mo, "scaleX", 1.0f, 1.5f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(this.mo, "scaleY", 1.0f, 1.5f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat7 = ObjectAnimator.ofFloat(this.wd, "rotation", 0.0f, -20.0f, 0.0f);
        this.ud = objectAnimatorOfFloat7;
        objectAnimatorOfFloat7.setDuration(1000L);
        this.qdl.setDuration(1500L);
        this.qdl.setInterpolator(new AccelerateDecelerateInterpolator());
        this.qdl.play(objectAnimatorOfFloat).with(objectAnimatorOfFloat2).with(objectAnimatorOfFloat3).with(objectAnimatorOfFloat4).with(objectAnimatorOfFloat5).with(objectAnimatorOfFloat6);
        this.qdl.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.mo.ud.1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                ud.this.lnr = true;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                if (ud.this.lnr) {
                    return;
                }
                ud.this.ud.start();
                ud.this.qdl.start();
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        });
    }

    private void lnr() {
        View view = new View(this.to);
        this.mml = view;
        view.setBackground(qdl("#1A7BBEFF", "#337BBEFF"));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) (((double) this.jpc) * 0.45d), (int) (((double) this.tvp) * 0.45d));
        layoutParams.gravity = 17;
        this.mml.setLayoutParams(layoutParams);
        addView(this.mml);
        View view2 = new View(this.to);
        this.mzz = view2;
        view2.setBackground(qdl("#337BBEFF", "#807BBEFF"));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) (((double) this.jpc) * 0.25d), (int) (((double) this.tvp) * 0.25d));
        layoutParams2.gravity = 17;
        this.mzz.setLayoutParams(layoutParams2);
        addView(this.mzz);
        View view3 = new View(this.to);
        this.mo = view3;
        view3.setBackground(qdl("#807BBEFF", "#FF7BBEFF"));
        int i2 = this.jpc;
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams((int) (((double) i2) * 0.25d), (int) (((double) i2) * 0.25d));
        layoutParams3.gravity = 17;
        this.mo.setLayoutParams(layoutParams3);
        addView(this.mo);
        ImageView imageView = new ImageView(this.to);
        this.wd = imageView;
        imageView.setImageResource(com.bytedance.sdk.component.utils.ljh.mml(getContext(), "tt_blue_hand"));
        this.wd.setScaleType(ImageView.ScaleType.FIT_CENTER);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams((int) (((double) this.jpc) * 0.62d), (int) (((double) this.tvp) * 0.53d));
        layoutParams4.gravity = 17;
        layoutParams4.topMargin = (layoutParams4.width / 2) - 5;
        layoutParams4.leftMargin = (layoutParams4.height / 2) - 5;
        this.wd.setLayoutParams(layoutParams4);
        addView(this.wd);
    }

    public void ud() {
        this.lnr = true;
        ObjectAnimator objectAnimator = this.ud;
        if (objectAnimator == null || this.qdl == null) {
            return;
        }
        objectAnimator.cancel();
        this.qdl.cancel();
    }

    private GradientDrawable qdl(String str, String str2) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(Color.parseColor(str));
        gradientDrawable.setStroke(1, Color.parseColor(str2));
        return gradientDrawable;
    }

    public void qdl() {
        this.lnr = false;
        ObjectAnimator objectAnimator = this.ud;
        if (objectAnimator == null || this.qdl == null) {
            return;
        }
        objectAnimator.start();
        this.qdl.start();
    }
}
