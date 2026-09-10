package com.airbnb.lottie.animation.keyframe;

import android.graphics.Color;
import com.airbnb.lottie.animation.LPaint;
import com.airbnb.lottie.model.layer.BaseLayer;
import com.airbnb.lottie.parser.DropShadowEffect;
import com.airbnb.lottie.value.LottieFrameInfo;
import com.airbnb.lottie.value.LottieValueCallback;

/* JADX INFO: loaded from: classes.dex */
public class DropShadowKeyframeAnimation implements BaseKeyframeAnimation.AnimationListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f9653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ColorKeyframeAnimation f9654b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FloatKeyframeAnimation f9655c;
    public final FloatKeyframeAnimation d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final FloatKeyframeAnimation f9656e;
    public final FloatKeyframeAnimation f;
    public boolean g = true;

    public DropShadowKeyframeAnimation(BaseKeyframeAnimation.AnimationListener animationListener, BaseLayer baseLayer, DropShadowEffect dropShadowEffect) {
        this.f9653a = animationListener;
        BaseKeyframeAnimation baseKeyframeAnimationG = dropShadowEffect.f9886a.g();
        this.f9654b = (ColorKeyframeAnimation) baseKeyframeAnimationG;
        baseKeyframeAnimationG.a(this);
        baseLayer.g(baseKeyframeAnimationG);
        BaseKeyframeAnimation baseKeyframeAnimationG2 = dropShadowEffect.f9887b.g();
        this.f9655c = (FloatKeyframeAnimation) baseKeyframeAnimationG2;
        baseKeyframeAnimationG2.a(this);
        baseLayer.g(baseKeyframeAnimationG2);
        BaseKeyframeAnimation baseKeyframeAnimationG3 = dropShadowEffect.f9888c.g();
        this.d = (FloatKeyframeAnimation) baseKeyframeAnimationG3;
        baseKeyframeAnimationG3.a(this);
        baseLayer.g(baseKeyframeAnimationG3);
        BaseKeyframeAnimation baseKeyframeAnimationG4 = dropShadowEffect.d.g();
        this.f9656e = (FloatKeyframeAnimation) baseKeyframeAnimationG4;
        baseKeyframeAnimationG4.a(this);
        baseLayer.g(baseKeyframeAnimationG4);
        BaseKeyframeAnimation baseKeyframeAnimationG5 = dropShadowEffect.f9889e.g();
        this.f = (FloatKeyframeAnimation) baseKeyframeAnimationG5;
        baseKeyframeAnimationG5.a(this);
        baseLayer.g(baseKeyframeAnimationG5);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation$AnimationListener, java.lang.Object] */
    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener
    public final void a() {
        this.g = true;
        this.f9653a.a();
    }

    public final void b(LPaint lPaint) {
        if (this.g) {
            this.g = false;
            double dFloatValue = ((double) ((Float) this.d.f()).floatValue()) * 0.017453292519943295d;
            float fFloatValue = ((Float) this.f9656e.f()).floatValue();
            float fSin = ((float) Math.sin(dFloatValue)) * fFloatValue;
            float fCos = ((float) Math.cos(dFloatValue + 3.141592653589793d)) * fFloatValue;
            int iIntValue = ((Integer) this.f9654b.f()).intValue();
            lPaint.setShadowLayer(((Float) this.f.f()).floatValue(), fSin, fCos, Color.argb(Math.round(((Float) this.f9655c.f()).floatValue()), Color.red(iIntValue), Color.green(iIntValue), Color.blue(iIntValue)));
        }
    }

    public final void c(final LottieValueCallback lottieValueCallback) {
        this.f9655c.k(new LottieValueCallback<Float>() { // from class: com.airbnb.lottie.animation.keyframe.DropShadowKeyframeAnimation.1
            @Override // com.airbnb.lottie.value.LottieValueCallback
            public final Object a(LottieFrameInfo lottieFrameInfo) {
                Float f = (Float) lottieValueCallback.f9964b;
                if (f == null) {
                    return null;
                }
                return Float.valueOf(f.floatValue() * 2.55f);
            }
        });
    }
}
