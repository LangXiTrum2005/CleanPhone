package com.bytedance.sdk.component.adexpress.lc;

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
import androidx.annotation.NonNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class tD extends LinearLayout {
    private int JVA;
    private TextView JXs;
    private TextView LD;
    private TextView Lxb;
    private LinearLayout OY;
    private int QAg;
    private com.bytedance.sdk.component.utils.DY ZU;
    private Lxb ebl;
    private TextView lc;
    private ImageView lk;
    private int nBu;
    private JSONObject sLN;

    /* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.lc.tD$1, reason: invalid class name */
    public class AnonymousClass1 implements Runnable {
        public AnonymousClass1() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (tD.this.lk != null) {
                final RotateAnimation rotateAnimation = new RotateAnimation(-14.0f, 14.0f, 1, 0.9f, 1, 0.9f);
                rotateAnimation.setInterpolator(new LD(null));
                rotateAnimation.setDuration(1000L);
                rotateAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.bytedance.sdk.component.adexpress.lc.tD.1.1
                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationEnd(Animation animation) {
                        tD.this.postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.lc.tD.1.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                tD.this.lk.startAnimation(rotateAnimation);
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
                tD.this.lk.startAnimation(rotateAnimation);
            }
        }
    }

    public static class LD implements Interpolator {
        private LD() {
        }

        public /* synthetic */ LD(AnonymousClass1 anonymousClass1) {
            this();
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
    }

    public interface Lxb {
    }

    public tD(@NonNull Context context, View view, int i, int i2, int i3, JSONObject jSONObject) {
        super(context);
        this.QAg = i;
        this.nBu = i2;
        this.JVA = i3;
        this.sLN = jSONObject;
        Lxb(context, view);
    }

    public LinearLayout getShakeLayout() {
        return this.OY;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isShown()) {
            if (this.ZU == null) {
                this.ZU = new com.bytedance.sdk.component.utils.DY(getContext().getApplicationContext(), 1);
            }
            new Object() { // from class: com.bytedance.sdk.component.adexpress.lc.tD.2
            };
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
    }

    public void setOnShakeViewListener(Lxb lxb) {
        this.ebl = lxb;
    }

    public void setShakeText(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.JXs.setText(str);
        } else {
            this.JXs.setVisibility(8);
            this.lc.setVisibility(8);
        }
    }

    public void Lxb(Context context, View view) {
        addView(view);
        this.OY = (LinearLayout) findViewById(2097610727);
        this.lk = (ImageView) findViewById(2097610725);
        this.Lxb = (TextView) findViewById(2097610724);
        this.LD = (TextView) findViewById(2097610726);
        this.JXs = (TextView) findViewById(2097610723);
        this.lc = (TextView) findViewById(2097610728);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(Color.parseColor("#57000000"));
        this.OY.setBackground(gradientDrawable);
    }

    public void Lxb() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "alpha", 0.0f, 1.0f);
        objectAnimatorOfFloat.setDuration(300L);
        objectAnimatorOfFloat.start();
        postDelayed(new AnonymousClass1(), 500L);
    }
}
