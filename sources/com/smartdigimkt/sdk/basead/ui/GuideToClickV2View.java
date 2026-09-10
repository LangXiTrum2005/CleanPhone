package com.smartdigimkt.sdk.basead.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.smartdigimkt.n8.h;

/* JADX INFO: loaded from: classes6.dex */
public class GuideToClickV2View extends RelativeLayout {
    WaveAnimImageView e0;
    WaveAnimImageView f0;
    ImageView g0;
    TextView h0;
    float i0;
    float j0;
    float k0;
    float l0;
    float m0;
    float n0;
    final int o0;
    final int p0;
    final float q0;
    ValueAnimator r0;
    ValueAnimator s0;
    ScaleAnimation t0;

    public class a implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ WaveAnimImageView f38357a;

        public a(WaveAnimImageView waveAnimImageView) {
            this.f38357a = waveAnimImageView;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float f;
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (fFloatValue > 0.71428573f) {
                this.f38357a.setVisibility(4);
                return;
            }
            float f2 = fFloatValue / 0.71428573f;
            GuideToClickV2View guideToClickV2View = GuideToClickV2View.this;
            float f3 = guideToClickV2View.m0;
            float fA = android.support.v4.media.a.a(guideToClickV2View.n0, f3, f2, f3);
            float fA2 = android.support.v4.media.a.a(guideToClickV2View.l0, f3, f2, guideToClickV2View.k0);
            double d = f2;
            if (d < 0.2d) {
                float f4 = guideToClickV2View.i0;
                f = (float) (((1.0d - (((double) (f2 * 1.0f)) / 0.2d)) * ((double) (guideToClickV2View.j0 - f4))) + ((double) f4));
            } else {
                float f5 = guideToClickV2View.i0;
                f = (float) (((((d - 0.2d) * 1.0d) / 0.8d) * ((double) (guideToClickV2View.j0 - f5))) + ((double) f5));
            }
            try {
                if (guideToClickV2View.getVisibility() == 0) {
                    this.f38357a.setWaveAnimParams(new WaveAnimImageView.a(fA, fA2, f));
                    if (this.f38357a.getVisibility() != 0) {
                        this.f38357a.setVisibility(0);
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    public GuideToClickV2View(Context context) {
        super(context);
        this.o0 = 1000;
        this.p0 = 200;
        this.q0 = 0.71428573f;
        a(context);
    }

    private void a(Context context) {
        LayoutInflater.from(context).inflate(h.a(context, "myoffer_guide_to_click_v2", "layout"), this);
        setBackgroundColor(Color.parseColor("#66000000"));
        this.i0 = 0.8f;
        this.j0 = 0.05f;
        this.k0 = h.a(context, 4.0f);
        this.l0 = h.a(context, 8.0f);
        this.m0 = h.a(context, 2.0f);
        this.n0 = h.a(context, 30.0f);
        this.e0 = (WaveAnimImageView) findViewById(h.a(context, "myoffer_wave_anim_image", "id"));
        this.f0 = (WaveAnimImageView) findViewById(h.a(context, "myoffer_wave_anim_image2", "id"));
        this.r0 = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.s0 = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.g0 = (ImageView) findViewById(h.a(context, "myoffer_guide_to_click_finger", "id"));
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 1.1f, 1.0f, 1.1f);
        this.t0 = scaleAnimation;
        scaleAnimation.setRepeatMode(2);
        this.t0.setRepeatCount(-1);
        this.t0.setDuration(333L);
        this.h0 = (TextView) findViewById(h.a(context, "myoffer_guide_to_click_hint", "id"));
    }

    private void b() {
        ValueAnimator valueAnimator = this.r0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.r0.removeAllUpdateListeners();
            this.r0.cancel();
        }
        ValueAnimator valueAnimator2 = this.s0;
        if (valueAnimator2 != null) {
            valueAnimator2.removeAllListeners();
            this.s0.removeAllUpdateListeners();
            this.s0.cancel();
        }
        ScaleAnimation scaleAnimation = this.t0;
        if (scaleAnimation != null) {
            scaleAnimation.cancel();
        }
    }

    public void hideBackground() {
        setBackgroundColor(0);
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

    public void setFingerImageResource(Bitmap bitmap) {
        ImageView imageView = this.g0;
        if (imageView == null || bitmap == null) {
            return;
        }
        imageView.setImageBitmap(bitmap);
    }

    public void setFingerViewType(int i2) {
        int iA = h.a(getContext(), 84.0f);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.e0.getLayoutParams();
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f0.getLayoutParams();
        RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) this.g0.getLayoutParams();
        if (i2 != 2) {
            if (i2 == 4 || i2 == 5 || i2 == 6) {
                int i3 = (int) (((double) iA) * 0.5d);
                this.k0 = h.a(getContext(), 2.0f);
                this.l0 = h.a(getContext(), 4.0f);
                this.n0 = h.a(getContext(), 8.0f);
                layoutParams.width = i3;
                layoutParams.height = i3;
                this.e0.setLayoutParams(layoutParams);
                layoutParams2.width = i3;
                layoutParams2.height = i3;
                this.f0.setLayoutParams(layoutParams2);
                layoutParams3.width = i3 / 3;
                layoutParams3.height = (int) ((((double) i3) / 3.0d) * 1.1d);
                int i4 = i3 / 2;
                layoutParams3.setMargins(i4, i4, 0, 0);
                this.g0.setLayoutParams(layoutParams3);
                this.h0.setVisibility(8);
                return;
            }
            return;
        }
        int i5 = (int) (((double) iA) * 0.7d);
        this.k0 = h.a(getContext(), 4.0f);
        this.l0 = h.a(getContext(), 4.0f);
        this.n0 = h.a(getContext(), 14.0f);
        layoutParams.width = i5;
        layoutParams.height = i5;
        this.e0.setLayoutParams(layoutParams);
        layoutParams2.width = i5;
        layoutParams2.height = i5;
        this.f0.setLayoutParams(layoutParams2);
        int i6 = i5 / 2;
        layoutParams3.width = i6;
        layoutParams3.height = (int) ((((double) i5) / 2.0d) * 1.1d);
        layoutParams3.setMargins((int) (((double) i6) * 0.9d), i6, 0, 0);
        this.g0.setLayoutParams(layoutParams3);
        this.h0.setVisibility(0);
        RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) this.h0.getLayoutParams();
        layoutParams4.topMargin = h.a(getContext(), 6.0f);
        this.h0.setLayoutParams(layoutParams4);
        this.h0.setTextSize(1, 14.0f);
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

    public GuideToClickV2View(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.o0 = 1000;
        this.p0 = 200;
        this.q0 = 0.71428573f;
        a(context);
    }

    public GuideToClickV2View(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.o0 = 1000;
        this.p0 = 200;
        this.q0 = 0.71428573f;
        a(context);
    }

    private void a() {
        startAnim(this.r0, this.e0, 0L);
        startAnim(this.s0, this.f0, 800L);
        this.g0.startAnimation(this.t0);
    }
}
