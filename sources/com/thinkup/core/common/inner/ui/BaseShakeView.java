package com.thinkup.core.common.inner.ui;

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
import com.smartdigimkt.v0.k;
import com.thinkup.core.common.inner.m.n;
import com.thinkup.core.common.n.o0n;
import com.thinkup.core.common.on.oon;
import com.thinkup.core.common.ooo.m.m;
import com.thinkup.core.common.ooo.o00;
import com.thinkup.core.common.res.oo;

/* JADX INFO: loaded from: classes6.dex */
public abstract class BaseShakeView extends LinearLayout {
    protected ImageView m;
    protected String m0;
    protected int mm;
    protected o mn;
    protected Bitmap mo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    ValueAnimator f41838n;
    private int n0;
    private n no;
    protected ImageView o;
    protected int o0;
    protected String om;
    protected String on;
    protected String oo;

    /* JADX INFO: renamed from: com.thinkup.core.common.inner.ui.BaseShakeView$10, reason: invalid class name */
    public class AnonymousClass10 implements ValueAnimator.AnimatorUpdateListener {
        public AnonymousClass10() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            BaseShakeView.this.o.setRotation(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* JADX INFO: renamed from: com.thinkup.core.common.inner.ui.BaseShakeView$11, reason: invalid class name */
    public class AnonymousClass11 extends AnimatorListenerAdapter {
        public AnonymousClass11() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
            super.onAnimationRepeat(animator);
            BaseShakeView.o(BaseShakeView.this);
        }
    }

    /* JADX INFO: renamed from: com.thinkup.core.common.inner.ui.BaseShakeView$12, reason: invalid class name */
    public class AnonymousClass12 implements Interpolator {
        public AnonymousClass12() {
        }

        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f) {
            if (BaseShakeView.this.n0 % 3 == 2) {
                return 0.0f;
            }
            return f;
        }
    }

    /* JADX INFO: renamed from: com.thinkup.core.common.inner.ui.BaseShakeView$13, reason: invalid class name */
    public class AnonymousClass13 implements Runnable {
        public AnonymousClass13() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            int width = (int) (((double) BaseShakeView.this.o.getWidth()) * 0.5d);
            int height = (int) (((double) BaseShakeView.this.o.getHeight()) * 0.5d);
            BaseShakeView.this.o.setPivotX(width);
            BaseShakeView.this.o.setPivotY(height);
        }
    }

    /* JADX INFO: renamed from: com.thinkup.core.common.inner.ui.BaseShakeView$14, reason: invalid class name */
    public class AnonymousClass14 implements ValueAnimator.AnimatorUpdateListener {
        public AnonymousClass14() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            BaseShakeView.this.o.setRotation(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* JADX INFO: renamed from: com.thinkup.core.common.inner.ui.BaseShakeView$2, reason: invalid class name */
    public class AnonymousClass2 extends AnimatorListenerAdapter {
        public AnonymousClass2() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
            super.onAnimationRepeat(animator);
            BaseShakeView.o(BaseShakeView.this);
        }
    }

    /* JADX INFO: renamed from: com.thinkup.core.common.inner.ui.BaseShakeView$3, reason: invalid class name */
    public class AnonymousClass3 implements Interpolator {
        public AnonymousClass3() {
        }

        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f) {
            if ((BaseShakeView.this.n0 / 2) % 3 == 0) {
                return 0.0f;
            }
            return f;
        }
    }

    /* JADX INFO: renamed from: com.thinkup.core.common.inner.ui.BaseShakeView$4, reason: invalid class name */
    public class AnonymousClass4 implements Runnable {
        public AnonymousClass4() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ImageView imageView = BaseShakeView.this.o;
            if (imageView == null || imageView.getWidth() <= 0 || BaseShakeView.this.o.getHeight() <= 0) {
                return;
            }
            int width = (int) (((double) BaseShakeView.this.o.getWidth()) * 0.8d);
            int height = (int) (((double) BaseShakeView.this.o.getHeight()) * 0.8d);
            BaseShakeView.this.o.setPivotX(width);
            BaseShakeView.this.o.setPivotY(height);
        }
    }

    /* JADX INFO: renamed from: com.thinkup.core.common.inner.ui.BaseShakeView$7, reason: invalid class name */
    public class AnonymousClass7 implements ValueAnimator.AnimatorUpdateListener {
        public AnonymousClass7() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            BaseShakeView.this.o.setTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* JADX INFO: renamed from: com.thinkup.core.common.inner.ui.BaseShakeView$8, reason: invalid class name */
    public class AnonymousClass8 extends AnimatorListenerAdapter {
        public AnonymousClass8() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
            super.onAnimationRepeat(animator);
            BaseShakeView.o(BaseShakeView.this);
        }
    }

    /* JADX INFO: renamed from: com.thinkup.core.common.inner.ui.BaseShakeView$9, reason: invalid class name */
    public class AnonymousClass9 implements Interpolator {
        public AnonymousClass9() {
        }

        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f) {
            if (BaseShakeView.this.n0 % 3 == 2) {
                return 0.0f;
            }
            return f;
        }
    }

    public interface o {
        boolean o();
    }

    public BaseShakeView(Context context) {
        super(context);
        this.n0 = 0;
        this.no = new n() { // from class: com.thinkup.core.common.inner.ui.BaseShakeView.1
            @Override // com.thinkup.core.common.inner.m.n
            public final boolean o() {
                o oVar;
                if (BaseShakeView.this.hasWindowFocus() && BaseShakeView.this.isShown() && (oVar = BaseShakeView.this.mn) != null) {
                    return oVar.o();
                }
                return false;
            }
        };
        o();
    }

    public static /* synthetic */ int o(BaseShakeView baseShakeView) {
        int i2 = baseShakeView.n0;
        baseShakeView.n0 = i2 + 1;
        return i2;
    }

    private void o0() {
        com.thinkup.core.express.n.o.o().m(this.no);
    }

    public abstract void o();

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        startShakeIconAnimation();
        n();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.f41838n;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        o0();
    }

    @Override // android.view.View
    public void onVisibilityAggregated(boolean z2) {
        super.onVisibilityAggregated(z2);
        if (z2) {
            n();
        } else {
            o0();
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
            n();
        } else {
            o0();
        }
    }

    public void setOnShakeListener(o oVar, oon oonVar) {
        this.no.o(oonVar);
        this.mn = oVar;
    }

    public void setShakeSetting(oon oonVar, int i2) {
        if (oonVar != null) {
            this.o0 = oonVar.m();
            this.oo = oonVar.n();
            this.om = oonVar.o0();
            this.on = oonVar.oo();
            this.m0 = oonVar.om();
            this.mm = i2;
            if (TextUtils.isEmpty(this.oo)) {
                m();
            } else {
                m.o().m(new Runnable() { // from class: com.thinkup.core.common.inner.ui.BaseShakeView.5
                    /* JADX WARN: Code duplicated, block: B:17:0x005d  */
                    @Override // java.lang.Runnable
                    public final void run() {
                        int iMin;
                        Bitmap bitmapO;
                        try {
                            iMin = Math.min(BaseShakeView.this.getResources().getDisplayMetrics().widthPixels, BaseShakeView.this.getResources().getDisplayMetrics().heightPixels) / 2;
                        } catch (Throwable unused) {
                            iMin = 0;
                        }
                        BaseShakeView baseShakeView = BaseShakeView.this;
                        com.thinkup.core.common.res.m mVarO = com.thinkup.core.common.res.m.o(baseShakeView.getContext());
                        oo ooVar = new oo(3, BaseShakeView.this.oo);
                        if (TextUtils.isEmpty(ooVar.m0)) {
                            bitmapO = null;
                        } else {
                            bitmapO = mVarO.o(ooVar.m0);
                            if (bitmapO == null || bitmapO.isRecycled()) {
                                bitmapO = mVarO.o(ooVar, iMin, iMin);
                                if (bitmapO == null || bitmapO.isRecycled()) {
                                    bitmapO = null;
                                } else {
                                    mVarO.o(ooVar.m0, bitmapO);
                                }
                            }
                        }
                        baseShakeView.mo = bitmapO;
                        BaseShakeView.this.m();
                    }
                }, 2);
            }
        }
    }

    public void startShakeIconAnimation() {
        ValueAnimator valueAnimatorOfFloat;
        if (this.o != null) {
            ValueAnimator valueAnimator = this.f41838n;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            int i2 = this.o0;
            if (i2 == 1) {
                valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, -25.0f, 0.0f, 25.0f, 0.0f);
                valueAnimatorOfFloat.setDuration(500L);
                valueAnimatorOfFloat.setRepeatCount(-1);
                valueAnimatorOfFloat.addUpdateListener(new AnonymousClass10());
                valueAnimatorOfFloat.addListener(new AnonymousClass11());
                valueAnimatorOfFloat.setInterpolator(new AnonymousClass12());
                this.o.post(new AnonymousClass13());
            } else if (i2 != 2) {
                valueAnimatorOfFloat = ValueAnimator.ofFloat(-10.0f, 10.0f);
                valueAnimatorOfFloat.setDuration(150L);
                valueAnimatorOfFloat.setRepeatMode(2);
                valueAnimatorOfFloat.setRepeatCount(-1);
                valueAnimatorOfFloat.addUpdateListener(new AnonymousClass14());
                valueAnimatorOfFloat.addListener(new AnonymousClass2());
                valueAnimatorOfFloat.setInterpolator(new AnonymousClass3());
                this.o.post(new AnonymousClass4());
            } else {
                int iO = o00.o(getContext(), 8.0f);
                float f = iO;
                int i3 = -iO;
                float f2 = i3;
                valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, f, f2, f, f2, iO / 2, i3 / 2, iO / 4, i3 / 4, 0.0f);
                valueAnimatorOfFloat.setDuration(1000L);
                valueAnimatorOfFloat.setRepeatCount(-1);
                valueAnimatorOfFloat.addUpdateListener(new AnonymousClass7());
                valueAnimatorOfFloat.addListener(new AnonymousClass8());
                valueAnimatorOfFloat.setInterpolator(new AnonymousClass9());
            }
            this.f41838n = valueAnimatorOfFloat;
            valueAnimatorOfFloat.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        o0n.m().m(new Runnable() { // from class: com.thinkup.core.common.inner.ui.BaseShakeView.6
            @Override // java.lang.Runnable
            public final void run() {
                BaseShakeView baseShakeView = BaseShakeView.this;
                ImageView imageView = baseShakeView.o;
                if (imageView != null) {
                    Bitmap bitmap = baseShakeView.mo;
                    if (bitmap != null) {
                        imageView.setImageBitmap(bitmap);
                    } else {
                        imageView.setImageResource(o00.o(baseShakeView.getContext(), "myoffer_shake_icon", k.d));
                    }
                }
                BaseShakeView baseShakeView2 = BaseShakeView.this;
                ImageView imageView2 = baseShakeView2.m;
                if (imageView2 != null) {
                    Bitmap bitmap2 = baseShakeView2.mo;
                    if (bitmap2 != null) {
                        imageView2.setImageBitmap(bitmap2);
                    } else {
                        imageView2.setImageResource(o00.o(baseShakeView2.getContext(), "myoffer_shake_icon", k.d));
                    }
                }
            }
        });
    }

    private void n() {
        com.thinkup.core.express.n.o.o().o(this.no);
    }

    private ValueAnimator o(int i2) {
        if (i2 == 1) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, -25.0f, 0.0f, 25.0f, 0.0f);
            valueAnimatorOfFloat.setDuration(500L);
            valueAnimatorOfFloat.setRepeatCount(-1);
            valueAnimatorOfFloat.addUpdateListener(new AnonymousClass10());
            valueAnimatorOfFloat.addListener(new AnonymousClass11());
            valueAnimatorOfFloat.setInterpolator(new AnonymousClass12());
            this.o.post(new AnonymousClass13());
            return valueAnimatorOfFloat;
        }
        if (i2 != 2) {
            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(-10.0f, 10.0f);
            valueAnimatorOfFloat2.setDuration(150L);
            valueAnimatorOfFloat2.setRepeatMode(2);
            valueAnimatorOfFloat2.setRepeatCount(-1);
            valueAnimatorOfFloat2.addUpdateListener(new AnonymousClass14());
            valueAnimatorOfFloat2.addListener(new AnonymousClass2());
            valueAnimatorOfFloat2.setInterpolator(new AnonymousClass3());
            this.o.post(new AnonymousClass4());
            return valueAnimatorOfFloat2;
        }
        int iO = o00.o(getContext(), 8.0f);
        float f = iO;
        int i3 = -iO;
        float f2 = i3;
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(0.0f, f, f2, f, f2, iO / 2, i3 / 2, iO / 4, i3 / 4, 0.0f);
        valueAnimatorOfFloat3.setDuration(1000L);
        valueAnimatorOfFloat3.setRepeatCount(-1);
        valueAnimatorOfFloat3.addUpdateListener(new AnonymousClass7());
        valueAnimatorOfFloat3.addListener(new AnonymousClass8());
        valueAnimatorOfFloat3.setInterpolator(new AnonymousClass9());
        return valueAnimatorOfFloat3;
    }

    public BaseShakeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.n0 = 0;
        this.no = new n() { // from class: com.thinkup.core.common.inner.ui.BaseShakeView.1
            @Override // com.thinkup.core.common.inner.m.n
            public final boolean o() {
                o oVar;
                if (BaseShakeView.this.hasWindowFocus() && BaseShakeView.this.isShown() && (oVar = BaseShakeView.this.mn) != null) {
                    return oVar.o();
                }
                return false;
            }
        };
        o();
    }

    public BaseShakeView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.n0 = 0;
        this.no = new n() { // from class: com.thinkup.core.common.inner.ui.BaseShakeView.1
            @Override // com.thinkup.core.common.inner.m.n
            public final boolean o() {
                o oVar;
                if (BaseShakeView.this.hasWindowFocus() && BaseShakeView.this.isShown() && (oVar = BaseShakeView.this.mn) != null) {
                    return oVar.o();
                }
                return false;
            }
        };
        o();
    }

    public BaseShakeView(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        this.n0 = 0;
        this.no = new n() { // from class: com.thinkup.core.common.inner.ui.BaseShakeView.1
            @Override // com.thinkup.core.common.inner.m.n
            public final boolean o() {
                o oVar;
                if (BaseShakeView.this.hasWindowFocus() && BaseShakeView.this.isShown() && (oVar = BaseShakeView.this.mn) != null) {
                    return oVar.o();
                }
                return false;
            }
        };
        o();
    }
}
