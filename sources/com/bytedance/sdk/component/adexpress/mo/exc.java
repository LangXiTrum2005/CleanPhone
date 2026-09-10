package com.bytedance.sdk.component.adexpress.mo;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Interpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class exc extends LinearLayout {
    private JSONObject fs;
    private LinearLayout jpc;
    private ImageView lnr;
    private com.bytedance.sdk.component.utils.uw mml;
    private TextView mo;
    private TextView mzz;
    private TextView qdl;
    private int rq;
    private int to;
    private int tvp;
    private TextView ud;
    private qdl wd;

    /* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.mo.exc$1, reason: invalid class name */
    public class AnonymousClass1 implements Runnable {
        public AnonymousClass1() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (exc.this.lnr != null) {
                final RotateAnimation rotateAnimation = new RotateAnimation(-14.0f, 14.0f, 1, 0.9f, 1, 0.9f);
                rotateAnimation.setInterpolator(new ud(null));
                rotateAnimation.setDuration(1000L);
                rotateAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.bytedance.sdk.component.adexpress.mo.exc.1.1
                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationEnd(Animation animation) {
                        exc.this.postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.mo.exc.1.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                exc.this.lnr.startAnimation(rotateAnimation);
                            }
                        }, 250L);
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationRepeat(Animation animation) {
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationStart(Animation animation) {
                    }
                });
                exc.this.lnr.startAnimation(rotateAnimation);
            }
        }
    }

    public interface qdl {
    }

    public static class ud implements Interpolator {
        private ud() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            if (f <= 0.25f) {
                return (f * (-2.0f)) + 0.5f;
            }
            if (f <= 0.5f) {
                return (f * 4.0f) - 1.0f;
            }
            return f <= 0.75f ? (f * (-4.0f)) + 3.0f : (f * 2.0f) - 1.5f;
        }

        public /* synthetic */ ud(AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    public exc(Context context, View view, int i2, int i3, int i4, JSONObject jSONObject) {
        super(context);
        this.tvp = i2;
        this.to = i3;
        this.rq = i4;
        this.fs = jSONObject;
        qdl(context, view);
    }

    public LinearLayout getShakeLayout() {
        return this.jpc;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isShown()) {
            if (this.mml == null) {
                this.mml = new com.bytedance.sdk.component.utils.uw(getContext().getApplicationContext(), 1);
            }
            new Object() { // from class: com.bytedance.sdk.component.adexpress.mo.exc.2
            };
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z2) {
    }

    public void setOnShakeViewListener(qdl qdlVar) {
        this.wd = qdlVar;
    }

    public void setShakeText(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.mzz.setText(str);
        } else {
            this.mzz.setVisibility(8);
            this.mo.setVisibility(8);
        }
    }

    public void qdl(Context context, View view) {
        addView(view);
        this.jpc = (LinearLayout) findViewById(2097610727);
        this.lnr = (ImageView) findViewById(2097610725);
        this.qdl = (TextView) findViewById(2097610724);
        this.ud = (TextView) findViewById(2097610726);
        this.mzz = (TextView) findViewById(2097610723);
        this.mo = (TextView) findViewById(2097610728);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(Color.parseColor("#57000000"));
        this.jpc.setBackground(gradientDrawable);
    }

    public void qdl() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "alpha", 0.0f, 1.0f);
        objectAnimatorOfFloat.setDuration(300L);
        objectAnimatorOfFloat.start();
        postDelayed(new AnonymousClass1(), 500L);
    }
}
