package com.thinkup.core.common.inner.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.support.v4.media.a;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.thinkup.core.common.ooo.o00;

/* JADX INFO: loaded from: classes6.dex */
public class SimpleGuideToClickView extends RelativeLayout {
    WaveAnimImageView m;
    float m0;
    final int mm;
    final int mn;
    float mo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    ImageView f41849n;
    final float n0;
    ValueAnimator nm;
    ScaleAnimation nn;
    ValueAnimator no;
    WaveAnimImageView o;
    float o0;
    float om;
    float on;
    float oo;

    public SimpleGuideToClickView(Context context) {
        super(context);
        this.mm = 1000;
        this.mn = 200;
        this.n0 = 0.71428573f;
    }

    private void m() {
        ValueAnimator valueAnimator = this.no;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.no.removeAllUpdateListeners();
            this.no.cancel();
        }
        ValueAnimator valueAnimator2 = this.nm;
        if (valueAnimator2 != null) {
            valueAnimator2.removeAllListeners();
            this.nm.removeAllUpdateListeners();
            this.nm.cancel();
        }
        ScaleAnimation scaleAnimation = this.nn;
        if (scaleAnimation != null) {
            scaleAnimation.cancel();
        }
    }

    private void o() {
        if (this.f41849n != null) {
            startAnim(this.no, this.o, 0L);
            startAnim(this.nm, this.m, 800L);
            this.f41849n.startAnimation(this.nn);
        }
    }

    public void init(int i2, int i3, int i4, int i5, int i6) {
        Context context = getContext();
        LayoutInflater.from(context).inflate(i2, this);
        this.o0 = 0.8f;
        this.oo = 0.05f;
        this.om = i3;
        this.on = i5;
        this.m0 = i4;
        this.mo = i6;
        this.o = (WaveAnimImageView) findViewById(o00.o(context, "myoffer_wave_anim_image", "id"));
        this.m = (WaveAnimImageView) findViewById(o00.o(context, "myoffer_wave_anim_image2", "id"));
        this.no = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.nm = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f41849n = (ImageView) findViewById(o00.o(context, "myoffer_guide_to_click_finger", "id"));
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 1.1f, 1.0f, 1.1f);
        this.nn = scaleAnimation;
        scaleAnimation.setRepeatMode(2);
        this.nn.setRepeatCount(-1);
        this.nn.setDuration(333L);
        setClipChildren(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f41849n != null) {
            startAnim(this.no, this.o, 0L);
            startAnim(this.nm, this.m, 800L);
            this.f41849n.startAnimation(this.nn);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.no;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.no.removeAllUpdateListeners();
            this.no.cancel();
        }
        ValueAnimator valueAnimator2 = this.nm;
        if (valueAnimator2 != null) {
            valueAnimator2.removeAllListeners();
            this.nm.removeAllUpdateListeners();
            this.nm.cancel();
        }
        ScaleAnimation scaleAnimation = this.nn;
        if (scaleAnimation != null) {
            scaleAnimation.cancel();
        }
    }

    public void startAnim(ValueAnimator valueAnimator, final WaveAnimImageView waveAnimImageView, long j) {
        if (valueAnimator != null) {
            valueAnimator.setRepeatMode(1);
            valueAnimator.setRepeatCount(-1);
            valueAnimator.setDuration(1400L);
            valueAnimator.removeAllUpdateListeners();
            valueAnimator.removeAllListeners();
            valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.thinkup.core.common.inner.ui.SimpleGuideToClickView.1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    float f;
                    float fFloatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                    if (fFloatValue > 0.71428573f) {
                        waveAnimImageView.setVisibility(4);
                        return;
                    }
                    float f2 = fFloatValue / 0.71428573f;
                    SimpleGuideToClickView simpleGuideToClickView = SimpleGuideToClickView.this;
                    float f3 = simpleGuideToClickView.m0;
                    float fA = a.a(simpleGuideToClickView.mo, f3, f2, f3);
                    float fA2 = a.a(simpleGuideToClickView.on, f3, f2, simpleGuideToClickView.om);
                    double d = f2;
                    if (d < 0.2d) {
                        float f4 = simpleGuideToClickView.o0;
                        f = (float) (((1.0d - (((double) (f2 * 1.0f)) / 0.2d)) * ((double) (simpleGuideToClickView.oo - f4))) + ((double) f4));
                    } else {
                        float f5 = simpleGuideToClickView.o0;
                        f = (float) (((((d - 0.2d) * 1.0d) / 0.8d) * ((double) (simpleGuideToClickView.oo - f5))) + ((double) f5));
                    }
                    try {
                        if (simpleGuideToClickView.getVisibility() == 0) {
                            waveAnimImageView.setWaveAnimParams(new WaveAnimImageView.o(fA, fA2, f));
                            if (waveAnimImageView.getVisibility() != 0) {
                                waveAnimImageView.setVisibility(0);
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
            });
            valueAnimator.setStartDelay(j);
            valueAnimator.start();
        }
    }

    public SimpleGuideToClickView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mm = 1000;
        this.mn = 200;
        this.n0 = 0.71428573f;
    }

    public SimpleGuideToClickView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.mm = 1000;
        this.mn = 200;
        this.n0 = 0.71428573f;
    }
}
