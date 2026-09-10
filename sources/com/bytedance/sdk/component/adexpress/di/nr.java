package com.bytedance.sdk.component.adexpress.di;

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
import com.unity3d.services.UnityAdsConstants;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class nr extends LinearLayout {

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    private JSONObject f18033co;
    private TextView di;
    private TextView fi;
    private ImageView ik;
    private int jbs;
    private com.bytedance.sdk.component.utils.ay ka;
    private TextView lr;
    private LinearLayout mj;
    private int qt;
    private TextView ri;
    private int sf;
    private ri xha;

    /* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.di.nr$1, reason: invalid class name */
    public class AnonymousClass1 implements Runnable {
        public AnonymousClass1() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (nr.this.ik != null) {
                final RotateAnimation rotateAnimation = new RotateAnimation(-14.0f, 14.0f, 1, 0.9f, 1, 0.9f);
                rotateAnimation.setInterpolator(new lr(null));
                rotateAnimation.setDuration(1000L);
                rotateAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.bytedance.sdk.component.adexpress.di.nr.1.1
                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationEnd(Animation animation) {
                        nr.this.postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.di.nr.1.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                nr.this.ik.startAnimation(rotateAnimation);
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
                nr.this.ik.startAnimation(rotateAnimation);
            }
        }
    }

    public static class lr implements Interpolator {
        private lr() {
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

        public /* synthetic */ lr(AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    public interface ri {
    }

    public nr(Context context, View view, int i, int i2, int i3, JSONObject jSONObject) {
        super(context);
        this.jbs = i;
        this.qt = i2;
        this.sf = i3;
        this.f18033co = jSONObject;
        ri(context, view);
    }

    public LinearLayout getShakeLayout() {
        return this.mj;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isShown()) {
            if (this.ka == null) {
                this.ka = new com.bytedance.sdk.component.utils.ay(getContext().getApplicationContext(), 1);
            }
            new Object() { // from class: com.bytedance.sdk.component.adexpress.di.nr.2
            };
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public void setOnShakeViewListener(ri riVar) {
        this.xha = riVar;
    }

    public void setShakeText(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.fi.setText(str);
        } else {
            this.fi.setVisibility(8);
            this.di.setVisibility(8);
        }
    }

    public void ri(Context context, View view) {
        addView(view);
        this.mj = (LinearLayout) findViewById(2097610727);
        this.ik = (ImageView) findViewById(2097610725);
        this.ri = (TextView) findViewById(2097610724);
        this.lr = (TextView) findViewById(2097610726);
        this.fi = (TextView) findViewById(2097610723);
        this.di = (TextView) findViewById(2097610728);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(Color.parseColor("#57000000"));
        this.mj.setBackground(gradientDrawable);
    }

    public void ri() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "alpha", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        objectAnimatorOfFloat.setDuration(300L);
        objectAnimatorOfFloat.start();
        postDelayed(new AnonymousClass1(), 500L);
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
    }
}
