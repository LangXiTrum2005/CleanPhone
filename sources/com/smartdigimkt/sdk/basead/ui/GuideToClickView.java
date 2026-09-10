package com.smartdigimkt.sdk.basead.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.smartdigimkt.d7.e;
import com.smartdigimkt.n8.h;

/* JADX INFO: loaded from: classes6.dex */
public class GuideToClickView extends RelativeLayout {
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

    public class a implements com.smartdigimkt.d7.b.f {
        public a() {
        }

        @Override // com.smartdigimkt.d7.b.f
        public void a(String str, String str2) {
        }

        @Override // com.smartdigimkt.d7.b.f
        public void a(String str, Bitmap bitmap) {
            ImageView imageView = GuideToClickView.this.g0;
            if (imageView != null) {
                imageView.setImageBitmap(bitmap);
            }
        }
    }

    public class b implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ WaveAnimImageView f38360a;

        public b(WaveAnimImageView waveAnimImageView) {
            this.f38360a = waveAnimImageView;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float f;
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (fFloatValue > 0.71428573f) {
                this.f38360a.setVisibility(4);
                return;
            }
            float f2 = fFloatValue / 0.71428573f;
            GuideToClickView guideToClickView = GuideToClickView.this;
            float f3 = guideToClickView.m0;
            float fA = android.support.v4.media.a.a(guideToClickView.n0, f3, f2, f3);
            float fA2 = android.support.v4.media.a.a(guideToClickView.l0, f3, f2, guideToClickView.k0);
            double d = f2;
            if (d < 0.2d) {
                float f4 = guideToClickView.i0;
                f = (float) (((1.0d - (((double) (f2 * 1.0f)) / 0.2d)) * ((double) (guideToClickView.j0 - f4))) + ((double) f4));
            } else {
                float f5 = guideToClickView.i0;
                f = (float) (((((d - 0.2d) * 1.0d) / 0.8d) * ((double) (guideToClickView.j0 - f5))) + ((double) f5));
            }
            try {
                if (guideToClickView.getVisibility() == 0) {
                    this.f38360a.setWaveAnimParams(new WaveAnimImageView.a(fA, fA2, f));
                    if (this.f38360a.getVisibility() != 0) {
                        this.f38360a.setVisibility(0);
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f38362a = 501;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f38363b = 502;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f38364c = 503;
        public static final int d = 504;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f38365e = 505;
        public static final int f = 506;
        public static final int g = 507;
    }

    public GuideToClickView(Context context) {
        super(context);
        this.o0 = 1000;
        this.p0 = 200;
        this.q0 = 0.71428573f;
        a(context);
    }

    private void a(Context context) {
        LayoutInflater.from(context).inflate(h.a(context, "myoffer_guide_to_click", "layout"), this);
        setBackgroundColor(Color.parseColor("#66000000"));
        this.i0 = 0.8f;
        this.j0 = 0.05f;
        this.k0 = h.a(context, 4.0f);
        this.l0 = h.a(context, 18.0f);
        this.m0 = h.a(context, 2.0f);
        this.n0 = h.a(context, 40.0f);
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
        String strC = com.smartdigimkt.j5.a.a().c("g2c_finger_icon");
        if (TextUtils.isEmpty(strC)) {
            return;
        }
        com.google.firebase.crashlytics.internal.model.a.g().a(new e(3, strC), new a());
    }

    private void b() {
        ValueAnimator valueAnimator = this.r0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.s0;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
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

    public void setFingerViewMode(int i2) {
        int iA;
        int iA2;
        hideBackground();
        h.a(getContext(), 200.0f);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.e0.getLayoutParams();
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f0.getLayoutParams();
        RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) this.g0.getLayoutParams();
        RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) this.h0.getLayoutParams();
        switch (i2) {
            case 501:
            case 507:
                layoutParams.addRule(14);
                layoutParams.addRule(13, 0);
                this.e0.setLayoutParams(layoutParams);
                layoutParams2.addRule(14);
                layoutParams2.addRule(13, 0);
                this.f0.setLayoutParams(layoutParams2);
                break;
            case 502:
            case 503:
                if (i2 == 502) {
                    iA = h.a(getContext(), 100.0f);
                    this.h0.setTextSize(1, 14.0f);
                    this.l0 = h.a(getContext(), 12.0f);
                    this.n0 = h.a(getContext(), 30.0f);
                } else {
                    iA = h.a(getContext(), 160.0f);
                    this.h0.setTextSize(1, 16.0f);
                }
                layoutParams.width = iA;
                layoutParams.height = iA;
                layoutParams.addRule(14);
                layoutParams.addRule(13, 0);
                layoutParams2.width = iA;
                layoutParams2.height = iA;
                layoutParams2.addRule(14);
                layoutParams2.addRule(13, 0);
                int i3 = iA / 2;
                layoutParams3.width = i3;
                layoutParams3.height = (int) ((((double) iA) / 2.0d) * 1.1d);
                layoutParams3.setMargins(i3, i3, 0, 0);
                break;
            case 504:
            case 505:
            case 506:
                if (i2 == 505 || i2 == 504) {
                    iA2 = h.a(getContext(), 50.0f);
                    this.l0 = h.a(getContext(), 6.0f);
                    this.n0 = h.a(getContext(), 18.0f);
                } else {
                    iA2 = h.a(getContext(), 120.0f);
                    this.l0 = h.a(getContext(), 8.0f);
                    this.n0 = h.a(getContext(), 24.0f);
                }
                layoutParams.width = iA2;
                layoutParams.height = iA2;
                layoutParams.addRule(15);
                layoutParams.addRule(13, 0);
                this.e0.setLayoutParams(layoutParams);
                layoutParams2.width = iA2;
                layoutParams2.height = iA2;
                layoutParams2.addRule(15);
                layoutParams2.addRule(13, 0);
                this.f0.setLayoutParams(layoutParams2);
                int i4 = iA2 / 2;
                layoutParams3.width = i4;
                layoutParams3.height = (int) ((((double) iA2) / 2.0d) * 1.1d);
                layoutParams3.setMargins(i4, i4, 0, 0);
                this.g0.setLayoutParams(layoutParams3);
                layoutParams4.addRule(14, 0);
                layoutParams4.addRule(3, 0);
                layoutParams4.addRule(15);
                layoutParams4.addRule(1, this.e0.getId());
                layoutParams4.setMargins(h.a(getContext(), 6.0f), 0, h.a(getContext(), 10.0f), 0);
                this.h0.setLayoutParams(layoutParams4);
                this.h0.setTextSize(1, 12.0f);
                break;
        }
    }

    public void startAnim(ValueAnimator valueAnimator, WaveAnimImageView waveAnimImageView, long j) {
        if (valueAnimator != null) {
            valueAnimator.setRepeatMode(1);
            valueAnimator.setRepeatCount(-1);
            valueAnimator.setDuration(1400L);
            valueAnimator.removeAllUpdateListeners();
            valueAnimator.removeAllListeners();
            valueAnimator.addUpdateListener(new b(waveAnimImageView));
            valueAnimator.setStartDelay(j);
            valueAnimator.start();
        }
    }

    public GuideToClickView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.o0 = 1000;
        this.p0 = 200;
        this.q0 = 0.71428573f;
        a(context);
    }

    public GuideToClickView(Context context, AttributeSet attributeSet, int i2) {
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
