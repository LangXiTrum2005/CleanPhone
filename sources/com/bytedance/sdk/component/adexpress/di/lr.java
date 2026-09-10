package com.bytedance.sdk.component.adexpress.di;

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
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes2.dex */
public class lr extends FrameLayout {
    private View di;
    private View fi;
    private boolean ik;
    private int jbs;
    private View ka;
    private ObjectAnimator lr;
    private int mj;
    private Context qt;
    private AnimatorSet ri;
    private ImageView xha;

    public lr(Context context, int i, int i2) {
        super(context);
        this.ik = false;
        this.ri = new AnimatorSet();
        this.mj = i;
        this.jbs = i2;
        this.qt = context;
        ik();
        ka();
    }

    private void ka() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.ka, "scaleX", 1.0f, 2.0f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.ka, "scaleY", 1.0f, 2.0f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.fi, "scaleX", 1.0f, 2.5f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(this.fi, "scaleY", 1.0f, 2.5f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(this.di, "scaleX", 1.0f, 1.5f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(this.di, "scaleY", 1.0f, 1.5f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat7 = ObjectAnimator.ofFloat(this.xha, "rotation", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -20.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.lr = objectAnimatorOfFloat7;
        objectAnimatorOfFloat7.setDuration(1000L);
        this.ri.setDuration(1500L);
        this.ri.setInterpolator(new AccelerateDecelerateInterpolator());
        this.ri.play(objectAnimatorOfFloat).with(objectAnimatorOfFloat2).with(objectAnimatorOfFloat3).with(objectAnimatorOfFloat4).with(objectAnimatorOfFloat5).with(objectAnimatorOfFloat6);
        this.ri.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.di.lr.1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                lr.this.ik = true;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                if (lr.this.ik) {
                    return;
                }
                lr.this.lr.start();
                lr.this.ri.start();
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        });
    }

    private void ik() {
        View view = new View(this.qt);
        this.ka = view;
        view.setBackground(ri("#1A7BBEFF", "#337BBEFF"));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) (((double) this.mj) * 0.45d), (int) (((double) this.jbs) * 0.45d));
        layoutParams.gravity = 17;
        this.ka.setLayoutParams(layoutParams);
        addView(this.ka);
        View view2 = new View(this.qt);
        this.fi = view2;
        view2.setBackground(ri("#337BBEFF", "#807BBEFF"));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) (((double) this.mj) * 0.25d), (int) (((double) this.jbs) * 0.25d));
        layoutParams2.gravity = 17;
        this.fi.setLayoutParams(layoutParams2);
        addView(this.fi);
        View view3 = new View(this.qt);
        this.di = view3;
        view3.setBackground(ri("#807BBEFF", "#FF7BBEFF"));
        int i = this.mj;
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams((int) (((double) i) * 0.25d), (int) (((double) i) * 0.25d));
        layoutParams3.gravity = 17;
        this.di.setLayoutParams(layoutParams3);
        addView(this.di);
        ImageView imageView = new ImageView(this.qt);
        this.xha = imageView;
        imageView.setImageResource(com.bytedance.sdk.component.utils.uq.ka(getContext(), "tt_blue_hand"));
        this.xha.setScaleType(ImageView.ScaleType.FIT_CENTER);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams((int) (((double) this.mj) * 0.62d), (int) (((double) this.jbs) * 0.53d));
        layoutParams4.gravity = 17;
        layoutParams4.topMargin = (layoutParams4.width / 2) - 5;
        layoutParams4.leftMargin = (layoutParams4.height / 2) - 5;
        this.xha.setLayoutParams(layoutParams4);
        addView(this.xha);
    }

    public void lr() {
        this.ik = true;
        ObjectAnimator objectAnimator = this.lr;
        if (objectAnimator == null || this.ri == null) {
            return;
        }
        objectAnimator.cancel();
        this.ri.cancel();
    }

    private GradientDrawable ri(String str, String str2) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(Color.parseColor(str));
        gradientDrawable.setStroke(1, Color.parseColor(str2));
        return gradientDrawable;
    }

    public void ri() {
        this.ik = false;
        ObjectAnimator objectAnimator = this.lr;
        if (objectAnimator == null || this.ri == null) {
            return;
        }
        objectAnimator.start();
        this.ri.start();
    }
}
