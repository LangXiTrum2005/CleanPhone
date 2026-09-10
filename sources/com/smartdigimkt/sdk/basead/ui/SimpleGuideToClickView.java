package com.smartdigimkt.sdk.basead.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.smartdigimkt.n8.h;

/* JADX INFO: loaded from: classes6.dex */
public class SimpleGuideToClickView extends RelativeLayout {
    WaveAnimImageView e0;
    WaveAnimImageView f0;
    ImageView g0;
    float h0;
    float i0;
    float j0;
    float k0;
    float l0;
    float m0;
    final int n0;
    final int o0;
    final float p0;
    ValueAnimator q0;
    ValueAnimator r0;
    ScaleAnimation s0;

    public class a implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ WaveAnimImageView f38404a;

        public a(WaveAnimImageView waveAnimImageView) {
            this.f38404a = waveAnimImageView;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float f;
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (fFloatValue > 0.71428573f) {
                this.f38404a.setVisibility(4);
                return;
            }
            float f2 = fFloatValue / 0.71428573f;
            SimpleGuideToClickView simpleGuideToClickView = SimpleGuideToClickView.this;
            float f3 = simpleGuideToClickView.l0;
            float fA = android.support.v4.media.a.a(simpleGuideToClickView.m0, f3, f2, f3);
            float fA2 = android.support.v4.media.a.a(simpleGuideToClickView.k0, f3, f2, simpleGuideToClickView.j0);
            double d = f2;
            if (d < 0.2d) {
                float f4 = simpleGuideToClickView.h0;
                f = (float) (((1.0d - (((double) (f2 * 1.0f)) / 0.2d)) * ((double) (simpleGuideToClickView.i0 - f4))) + ((double) f4));
            } else {
                float f5 = simpleGuideToClickView.h0;
                f = (float) (((((d - 0.2d) * 1.0d) / 0.8d) * ((double) (simpleGuideToClickView.i0 - f5))) + ((double) f5));
            }
            try {
                if (simpleGuideToClickView.getVisibility() == 0) {
                    this.f38404a.setWaveAnimParams(new WaveAnimImageView.a(fA, fA2, f));
                    if (this.f38404a.getVisibility() != 0) {
                        this.f38404a.setVisibility(0);
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    public SimpleGuideToClickView(Context context) {
        super(context);
        this.n0 = 1000;
        this.o0 = 200;
        this.p0 = 0.71428573f;
    }

    private void a() {
        if (this.g0 != null) {
            startAnim(this.q0, this.e0, 0L);
            startAnim(this.r0, this.f0, 800L);
            this.g0.startAnimation(this.s0);
        }
    }

    private void b() {
        ValueAnimator valueAnimator = this.q0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.q0.removeAllUpdateListeners();
            this.q0.cancel();
        }
        ValueAnimator valueAnimator2 = this.r0;
        if (valueAnimator2 != null) {
            valueAnimator2.removeAllListeners();
            this.r0.removeAllUpdateListeners();
            this.r0.cancel();
        }
        ScaleAnimation scaleAnimation = this.s0;
        if (scaleAnimation != null) {
            scaleAnimation.cancel();
        }
    }

    public void init(int i2, int i3, int i4, int i5, int i6) {
        Context context = getContext();
        LayoutInflater.from(context).inflate(i2, this);
        this.h0 = 0.8f;
        this.i0 = 0.05f;
        this.j0 = i3;
        this.k0 = i5;
        this.l0 = i4;
        this.m0 = i6;
        this.e0 = (WaveAnimImageView) findViewById(h.a(context, "myoffer_wave_anim_image", "id"));
        this.f0 = (WaveAnimImageView) findViewById(h.a(context, "myoffer_wave_anim_image2", "id"));
        this.q0 = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.r0 = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.g0 = (ImageView) findViewById(h.a(context, "myoffer_guide_to_click_finger", "id"));
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 1.1f, 1.0f, 1.1f);
        this.s0 = scaleAnimation;
        scaleAnimation.setRepeatMode(2);
        this.s0.setRepeatCount(-1);
        this.s0.setDuration(333L);
        setClipChildren(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b();
    }

    public void startAnim(ValueAnimator valueAnimator, WaveAnimImageView waveAnimImageView, long j) {
        if (valueAnimator != null) {
            valueAnimator.setRepeatMode(1);
            valueAnimator.setRepeatCount(-1);
            valueAnimator.setDuration(1400L);
            valueAnimator.removeAllUpdateListeners();
            valueAnimator.removeAllListeners();
            valueAnimator.addUpdateListener(new a(waveAnimImageView));
            valueAnimator.setStartDelay(j);
            valueAnimator.start();
        }
    }

    public SimpleGuideToClickView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.n0 = 1000;
        this.o0 = 200;
        this.p0 = 0.71428573f;
    }

    public SimpleGuideToClickView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.n0 = 1000;
        this.o0 = 200;
        this.p0 = 0.71428573f;
    }
}
