package com.smartdigimkt.sdk.basead.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;

/* JADX INFO: loaded from: classes6.dex */
public abstract class BaseShakeView extends LinearLayout {
    protected ImageView e0;
    protected ImageView f0;
    private int g0;
    ValueAnimator h0;
    protected int i0;
    protected String j0;
    protected String k0;
    protected String l0;
    protected String m0;
    protected Bitmap n0;
    protected int o0;
    protected o p0;
    private com.smartdigimkt.v3.k q0;

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            super.onAnimationRepeat(animator);
            BaseShakeView.b(BaseShakeView.this);
        }
    }

    public class b implements Interpolator {
        public b() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            if ((BaseShakeView.this.g0 / 2) % 3 == 0) {
                return 0.0f;
            }
            return f;
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ImageView imageView = BaseShakeView.this.e0;
            if (imageView == null || imageView.getWidth() <= 0 || BaseShakeView.this.e0.getHeight() <= 0) {
                return;
            }
            int width = (int) (((double) BaseShakeView.this.e0.getWidth()) * 0.8d);
            int height = (int) (((double) BaseShakeView.this.e0.getHeight()) * 0.8d);
            BaseShakeView.this.e0.setPivotX(width);
            BaseShakeView.this.e0.setPivotY(height);
        }
    }

    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            int iMin;
            try {
                iMin = Math.min(BaseShakeView.this.getResources().getDisplayMetrics().widthPixels, BaseShakeView.this.getResources().getDisplayMetrics().heightPixels) / 2;
            } catch (Throwable unused) {
                iMin = 0;
            }
            BaseShakeView baseShakeView = BaseShakeView.this;
            baseShakeView.n0 = com.smartdigimkt.d7.b.a(baseShakeView.getContext()).b(new com.smartdigimkt.d7.e(3, BaseShakeView.this.j0), iMin, iMin);
            BaseShakeView.this.a();
        }
    }

    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseShakeView baseShakeView = BaseShakeView.this;
            ImageView imageView = baseShakeView.e0;
            if (imageView != null) {
                Bitmap bitmap = baseShakeView.n0;
                if (bitmap != null) {
                    imageView.setImageBitmap(bitmap);
                } else {
                    imageView.setImageResource(com.smartdigimkt.n8.h.a(baseShakeView.getContext(), "myoffer_shake_icon", com.smartdigimkt.v0.k.d));
                }
            }
            BaseShakeView baseShakeView2 = BaseShakeView.this;
            ImageView imageView2 = baseShakeView2.f0;
            if (imageView2 != null) {
                Bitmap bitmap2 = baseShakeView2.n0;
                if (bitmap2 != null) {
                    imageView2.setImageBitmap(bitmap2);
                } else {
                    imageView2.setImageResource(com.smartdigimkt.n8.h.a(baseShakeView2.getContext(), "myoffer_shake_icon", com.smartdigimkt.v0.k.d));
                }
            }
        }
    }

    public class f extends com.smartdigimkt.v3.k {
        public f() {
        }

        @Override // com.smartdigimkt.v3.k
        public boolean a() {
            o oVar;
            if (BaseShakeView.this.hasWindowFocus() && BaseShakeView.this.isShown() && (oVar = BaseShakeView.this.p0) != null) {
                return oVar.a();
            }
            return false;
        }
    }

    public class g implements ValueAnimator.AnimatorUpdateListener {
        public g() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            BaseShakeView.this.e0.setTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public class h extends AnimatorListenerAdapter {
        public h() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            super.onAnimationRepeat(animator);
            BaseShakeView.b(BaseShakeView.this);
        }
    }

    public class i implements Interpolator {
        public i() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            if (BaseShakeView.this.g0 % 3 == 2) {
                return 0.0f;
            }
            return f;
        }
    }

    public class j implements ValueAnimator.AnimatorUpdateListener {
        public j() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            BaseShakeView.this.e0.setRotation(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public class k extends AnimatorListenerAdapter {
        public k() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            super.onAnimationRepeat(animator);
            BaseShakeView.b(BaseShakeView.this);
        }
    }

    public class l implements Interpolator {
        public l() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            if (BaseShakeView.this.g0 % 3 == 2) {
                return 0.0f;
            }
            return f;
        }
    }

    public class m implements Runnable {
        public m() {
        }

        @Override // java.lang.Runnable
        public void run() {
            int width = (int) (((double) BaseShakeView.this.e0.getWidth()) * 0.5d);
            int height = (int) (((double) BaseShakeView.this.e0.getHeight()) * 0.5d);
            BaseShakeView.this.e0.setPivotX(width);
            BaseShakeView.this.e0.setPivotY(height);
        }
    }

    public class n implements ValueAnimator.AnimatorUpdateListener {
        public n() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            BaseShakeView.this.e0.setRotation(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public interface o {
        boolean a();
    }

    public BaseShakeView(Context context) {
        super(context);
        this.g0 = 0;
        this.q0 = new f();
        b();
    }

    public static /* synthetic */ int b(BaseShakeView baseShakeView) {
        int i2 = baseShakeView.g0;
        baseShakeView.g0 = i2 + 1;
        return i2;
    }

    public abstract void b();

    public void d() {
        com.smartdigimkt.t4.a.a().b(this.q0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        startShakeIconAnimation();
        c();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.h0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        d();
    }

    @Override // android.view.View
    public void onVisibilityAggregated(boolean z2) {
        super.onVisibilityAggregated(z2);
        if (z2) {
            c();
        } else {
            d();
        }
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i2) {
        super.onVisibilityChanged(view, i2);
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z2) {
        super.onWindowFocusChanged(z2);
        if (z2) {
            c();
        } else {
            d();
        }
    }

    public void setOnShakeListener(o oVar, com.smartdigimkt.w6.g gVar) {
        this.q0.a(gVar);
        this.p0 = oVar;
    }

    public void setShakeSetting(com.smartdigimkt.w6.g gVar, int i2) {
        if (gVar != null) {
            this.i0 = gVar.a1();
            this.j0 = gVar.d1();
            this.k0 = gVar.g1();
            this.l0 = gVar.h1();
            this.m0 = gVar.j1();
            this.o0 = i2;
            if (TextUtils.isEmpty(this.j0)) {
                a();
            } else {
                com.smartdigimkt.l7.b.a().g(new d());
            }
        }
    }

    public void startShakeIconAnimation() {
        if (this.e0 != null) {
            ValueAnimator valueAnimator = this.h0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator valueAnimatorA = a(this.i0);
            this.h0 = valueAnimatorA;
            if (valueAnimatorA != null) {
                valueAnimatorA.start();
            }
        }
    }

    public ValueAnimator a(int i2) {
        if (i2 == 1) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, -25.0f, 0.0f, 25.0f, 0.0f);
            valueAnimatorOfFloat.setDuration(500L);
            valueAnimatorOfFloat.setRepeatCount(-1);
            valueAnimatorOfFloat.addUpdateListener(new j());
            valueAnimatorOfFloat.addListener(new k());
            valueAnimatorOfFloat.setInterpolator(new l());
            this.e0.post(new m());
            return valueAnimatorOfFloat;
        }
        if (i2 != 2) {
            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(-10.0f, 10.0f);
            valueAnimatorOfFloat2.setDuration(150L);
            valueAnimatorOfFloat2.setRepeatMode(2);
            valueAnimatorOfFloat2.setRepeatCount(-1);
            valueAnimatorOfFloat2.addUpdateListener(new n());
            valueAnimatorOfFloat2.addListener(new a());
            valueAnimatorOfFloat2.setInterpolator(new b());
            this.e0.post(new c());
            return valueAnimatorOfFloat2;
        }
        int iA = com.smartdigimkt.n8.h.a(getContext(), 8.0f);
        float f2 = iA;
        int i3 = -iA;
        float f3 = i3;
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(0.0f, f2, f3, f2, f3, iA / 2, i3 / 2, iA / 4, i3 / 4, 0.0f);
        valueAnimatorOfFloat3.setDuration(1000L);
        valueAnimatorOfFloat3.setRepeatCount(-1);
        valueAnimatorOfFloat3.addUpdateListener(new g());
        valueAnimatorOfFloat3.addListener(new h());
        valueAnimatorOfFloat3.setInterpolator(new i());
        return valueAnimatorOfFloat3;
    }

    public void c() {
        com.smartdigimkt.t4.a.a().a(this.q0);
    }

    public BaseShakeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.g0 = 0;
        this.q0 = new f();
        b();
    }

    public BaseShakeView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.g0 = 0;
        this.q0 = new f();
        b();
    }

    public BaseShakeView(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        this.g0 = 0;
        this.q0 = new f();
        b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        com.smartdigimkt.l7.b.a().e(new e());
    }
}
