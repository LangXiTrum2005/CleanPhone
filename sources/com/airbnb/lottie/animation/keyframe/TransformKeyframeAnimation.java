package com.airbnb.lottie.animation.keyframe;

import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.PointF;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.model.animatable.AnimatableFloatValue;
import com.airbnb.lottie.model.animatable.AnimatableIntegerValue;
import com.airbnb.lottie.model.animatable.AnimatablePathValue;
import com.airbnb.lottie.model.animatable.AnimatableScaleValue;
import com.airbnb.lottie.model.animatable.AnimatableTransform;
import com.airbnb.lottie.model.animatable.AnimatableValue;
import com.airbnb.lottie.model.layer.BaseLayer;
import com.airbnb.lottie.value.Keyframe;
import com.airbnb.lottie.value.LottieValueCallback;
import com.airbnb.lottie.value.ScaleXY;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public class TransformKeyframeAnimation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Matrix f9672a = new Matrix();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Matrix f9673b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Matrix f9674c;
    public final Matrix d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float[] f9675e;
    public BaseKeyframeAnimation f;
    public BaseKeyframeAnimation g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public BaseKeyframeAnimation f9676h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public BaseKeyframeAnimation f9677i;
    public BaseKeyframeAnimation j;
    public FloatKeyframeAnimation k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public FloatKeyframeAnimation f9678l;
    public BaseKeyframeAnimation m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public BaseKeyframeAnimation f9679n;

    public TransformKeyframeAnimation(AnimatableTransform animatableTransform) {
        AnimatablePathValue animatablePathValue = animatableTransform.f9743a;
        this.f = animatablePathValue == null ? null : animatablePathValue.g();
        AnimatableValue animatableValue = animatableTransform.f9744b;
        this.g = animatableValue == null ? null : animatableValue.g();
        AnimatableScaleValue animatableScaleValue = animatableTransform.f9745c;
        this.f9676h = animatableScaleValue == null ? null : animatableScaleValue.g();
        AnimatableFloatValue animatableFloatValue = animatableTransform.d;
        this.f9677i = animatableFloatValue == null ? null : animatableFloatValue.g();
        AnimatableFloatValue animatableFloatValue2 = animatableTransform.f;
        FloatKeyframeAnimation floatKeyframeAnimation = animatableFloatValue2 == null ? null : (FloatKeyframeAnimation) animatableFloatValue2.g();
        this.k = floatKeyframeAnimation;
        if (floatKeyframeAnimation != null) {
            this.f9673b = new Matrix();
            this.f9674c = new Matrix();
            this.d = new Matrix();
            this.f9675e = new float[9];
        } else {
            this.f9673b = null;
            this.f9674c = null;
            this.d = null;
            this.f9675e = null;
        }
        AnimatableFloatValue animatableFloatValue3 = animatableTransform.g;
        this.f9678l = animatableFloatValue3 == null ? null : (FloatKeyframeAnimation) animatableFloatValue3.g();
        AnimatableIntegerValue animatableIntegerValue = animatableTransform.f9746e;
        if (animatableIntegerValue != null) {
            this.j = animatableIntegerValue.g();
        }
        AnimatableFloatValue animatableFloatValue4 = animatableTransform.f9747h;
        if (animatableFloatValue4 != null) {
            this.m = animatableFloatValue4.g();
        } else {
            this.m = null;
        }
        AnimatableFloatValue animatableFloatValue5 = animatableTransform.f9748i;
        if (animatableFloatValue5 != null) {
            this.f9679n = animatableFloatValue5.g();
        } else {
            this.f9679n = null;
        }
    }

    public final void a(BaseLayer baseLayer) {
        baseLayer.g(this.j);
        baseLayer.g(this.m);
        baseLayer.g(this.f9679n);
        baseLayer.g(this.f);
        baseLayer.g(this.g);
        baseLayer.g(this.f9676h);
        baseLayer.g(this.f9677i);
        baseLayer.g(this.k);
        baseLayer.g(this.f9678l);
    }

    public final void b(BaseKeyframeAnimation.AnimationListener animationListener) {
        BaseKeyframeAnimation baseKeyframeAnimation = this.j;
        if (baseKeyframeAnimation != null) {
            baseKeyframeAnimation.a(animationListener);
        }
        BaseKeyframeAnimation baseKeyframeAnimation2 = this.m;
        if (baseKeyframeAnimation2 != null) {
            baseKeyframeAnimation2.a(animationListener);
        }
        BaseKeyframeAnimation baseKeyframeAnimation3 = this.f9679n;
        if (baseKeyframeAnimation3 != null) {
            baseKeyframeAnimation3.a(animationListener);
        }
        BaseKeyframeAnimation baseKeyframeAnimation4 = this.f;
        if (baseKeyframeAnimation4 != null) {
            baseKeyframeAnimation4.a(animationListener);
        }
        BaseKeyframeAnimation baseKeyframeAnimation5 = this.g;
        if (baseKeyframeAnimation5 != null) {
            baseKeyframeAnimation5.a(animationListener);
        }
        BaseKeyframeAnimation baseKeyframeAnimation6 = this.f9676h;
        if (baseKeyframeAnimation6 != null) {
            baseKeyframeAnimation6.a(animationListener);
        }
        BaseKeyframeAnimation baseKeyframeAnimation7 = this.f9677i;
        if (baseKeyframeAnimation7 != null) {
            baseKeyframeAnimation7.a(animationListener);
        }
        FloatKeyframeAnimation floatKeyframeAnimation = this.k;
        if (floatKeyframeAnimation != null) {
            floatKeyframeAnimation.a(animationListener);
        }
        FloatKeyframeAnimation floatKeyframeAnimation2 = this.f9678l;
        if (floatKeyframeAnimation2 != null) {
            floatKeyframeAnimation2.a(animationListener);
        }
    }

    public final boolean c(ColorFilter colorFilter, LottieValueCallback lottieValueCallback) {
        if (colorFilter == LottieProperty.f9535a) {
            BaseKeyframeAnimation baseKeyframeAnimation = this.f;
            if (baseKeyframeAnimation == null) {
                this.f = new ValueCallbackKeyframeAnimation(lottieValueCallback, new PointF());
                return true;
            }
            baseKeyframeAnimation.k(lottieValueCallback);
            return true;
        }
        if (colorFilter == LottieProperty.f9536b) {
            BaseKeyframeAnimation baseKeyframeAnimation2 = this.g;
            if (baseKeyframeAnimation2 == null) {
                this.g = new ValueCallbackKeyframeAnimation(lottieValueCallback, new PointF());
                return true;
            }
            baseKeyframeAnimation2.k(lottieValueCallback);
            return true;
        }
        if (colorFilter == LottieProperty.f9537c) {
            BaseKeyframeAnimation baseKeyframeAnimation3 = this.g;
            if (baseKeyframeAnimation3 instanceof SplitDimensionPathKeyframeAnimation) {
                SplitDimensionPathKeyframeAnimation splitDimensionPathKeyframeAnimation = (SplitDimensionPathKeyframeAnimation) baseKeyframeAnimation3;
                LottieValueCallback lottieValueCallback2 = splitDimensionPathKeyframeAnimation.m;
                splitDimensionPathKeyframeAnimation.m = lottieValueCallback;
                return true;
            }
        }
        if (colorFilter == LottieProperty.d) {
            BaseKeyframeAnimation baseKeyframeAnimation4 = this.g;
            if (baseKeyframeAnimation4 instanceof SplitDimensionPathKeyframeAnimation) {
                SplitDimensionPathKeyframeAnimation splitDimensionPathKeyframeAnimation2 = (SplitDimensionPathKeyframeAnimation) baseKeyframeAnimation4;
                LottieValueCallback lottieValueCallback3 = splitDimensionPathKeyframeAnimation2.f9669n;
                splitDimensionPathKeyframeAnimation2.f9669n = lottieValueCallback;
                return true;
            }
        }
        if (colorFilter == LottieProperty.j) {
            BaseKeyframeAnimation baseKeyframeAnimation5 = this.f9676h;
            if (baseKeyframeAnimation5 == null) {
                this.f9676h = new ValueCallbackKeyframeAnimation(lottieValueCallback, new ScaleXY());
                return true;
            }
            baseKeyframeAnimation5.k(lottieValueCallback);
            return true;
        }
        if (colorFilter == LottieProperty.k) {
            BaseKeyframeAnimation baseKeyframeAnimation6 = this.f9677i;
            if (baseKeyframeAnimation6 == null) {
                this.f9677i = new ValueCallbackKeyframeAnimation(lottieValueCallback, Float.valueOf(0.0f));
                return true;
            }
            baseKeyframeAnimation6.k(lottieValueCallback);
            return true;
        }
        if (colorFilter == 3) {
            BaseKeyframeAnimation baseKeyframeAnimation7 = this.j;
            if (baseKeyframeAnimation7 == null) {
                this.j = new ValueCallbackKeyframeAnimation(lottieValueCallback, 100);
                return true;
            }
            baseKeyframeAnimation7.k(lottieValueCallback);
            return true;
        }
        if (colorFilter == LottieProperty.x) {
            BaseKeyframeAnimation baseKeyframeAnimation8 = this.m;
            if (baseKeyframeAnimation8 == null) {
                this.m = new ValueCallbackKeyframeAnimation(lottieValueCallback, Float.valueOf(100.0f));
                return true;
            }
            baseKeyframeAnimation8.k(lottieValueCallback);
            return true;
        }
        if (colorFilter == LottieProperty.y) {
            BaseKeyframeAnimation baseKeyframeAnimation9 = this.f9679n;
            if (baseKeyframeAnimation9 == null) {
                this.f9679n = new ValueCallbackKeyframeAnimation(lottieValueCallback, Float.valueOf(100.0f));
                return true;
            }
            baseKeyframeAnimation9.k(lottieValueCallback);
            return true;
        }
        if (colorFilter == LottieProperty.f9541l) {
            if (this.k == null) {
                this.k = new FloatKeyframeAnimation(Collections.singletonList(new Keyframe(Float.valueOf(0.0f))));
            }
            this.k.k(lottieValueCallback);
            return true;
        }
        if (colorFilter != LottieProperty.m) {
            return false;
        }
        if (this.f9678l == null) {
            this.f9678l = new FloatKeyframeAnimation(Collections.singletonList(new Keyframe(Float.valueOf(0.0f))));
        }
        this.f9678l.k(lottieValueCallback);
        return true;
    }

    public final void d() {
        for (int i2 = 0; i2 < 9; i2++) {
            this.f9675e[i2] = 0.0f;
        }
    }

    public final Matrix e() {
        PointF pointF;
        Matrix matrix = this.f9672a;
        matrix.reset();
        BaseKeyframeAnimation baseKeyframeAnimation = this.g;
        if (baseKeyframeAnimation != null && (pointF = (PointF) baseKeyframeAnimation.f()) != null) {
            float f = pointF.x;
            if (f != 0.0f || pointF.y != 0.0f) {
                matrix.preTranslate(f, pointF.y);
            }
        }
        BaseKeyframeAnimation baseKeyframeAnimation2 = this.f9677i;
        if (baseKeyframeAnimation2 != null) {
            float fFloatValue = baseKeyframeAnimation2 instanceof ValueCallbackKeyframeAnimation ? ((Float) baseKeyframeAnimation2.f()).floatValue() : ((FloatKeyframeAnimation) baseKeyframeAnimation2).l();
            if (fFloatValue != 0.0f) {
                matrix.preRotate(fFloatValue);
            }
        }
        FloatKeyframeAnimation floatKeyframeAnimation = this.k;
        if (floatKeyframeAnimation != null) {
            FloatKeyframeAnimation floatKeyframeAnimation2 = this.f9678l;
            float fCos = floatKeyframeAnimation2 == null ? 0.0f : (float) Math.cos(Math.toRadians((-floatKeyframeAnimation2.l()) + 90.0f));
            FloatKeyframeAnimation floatKeyframeAnimation3 = this.f9678l;
            float fSin = floatKeyframeAnimation3 == null ? 1.0f : (float) Math.sin(Math.toRadians((-floatKeyframeAnimation3.l()) + 90.0f));
            float fTan = (float) Math.tan(Math.toRadians(floatKeyframeAnimation.l()));
            d();
            float[] fArr = this.f9675e;
            fArr[0] = fCos;
            fArr[1] = fSin;
            float f2 = -fSin;
            fArr[3] = f2;
            fArr[4] = fCos;
            fArr[8] = 1.0f;
            Matrix matrix2 = this.f9673b;
            matrix2.setValues(fArr);
            d();
            fArr[0] = 1.0f;
            fArr[3] = fTan;
            fArr[4] = 1.0f;
            fArr[8] = 1.0f;
            Matrix matrix3 = this.f9674c;
            matrix3.setValues(fArr);
            d();
            fArr[0] = fCos;
            fArr[1] = f2;
            fArr[3] = fSin;
            fArr[4] = fCos;
            fArr[8] = 1.0f;
            Matrix matrix4 = this.d;
            matrix4.setValues(fArr);
            matrix3.preConcat(matrix2);
            matrix4.preConcat(matrix3);
            matrix.preConcat(matrix4);
        }
        BaseKeyframeAnimation baseKeyframeAnimation3 = this.f9676h;
        if (baseKeyframeAnimation3 != null) {
            ScaleXY scaleXY = (ScaleXY) baseKeyframeAnimation3.f();
            float f3 = scaleXY.f9965a;
            if (f3 != 1.0f || scaleXY.f9966b != 1.0f) {
                matrix.preScale(f3, scaleXY.f9966b);
            }
        }
        BaseKeyframeAnimation baseKeyframeAnimation4 = this.f;
        if (baseKeyframeAnimation4 != null) {
            PointF pointF2 = (PointF) baseKeyframeAnimation4.f();
            float f4 = pointF2.x;
            if (f4 != 0.0f || pointF2.y != 0.0f) {
                matrix.preTranslate(-f4, -pointF2.y);
            }
        }
        return matrix;
    }

    public final Matrix f(float f) {
        BaseKeyframeAnimation baseKeyframeAnimation = this.g;
        PointF pointF = baseKeyframeAnimation == null ? null : (PointF) baseKeyframeAnimation.f();
        BaseKeyframeAnimation baseKeyframeAnimation2 = this.f9676h;
        ScaleXY scaleXY = baseKeyframeAnimation2 == null ? null : (ScaleXY) baseKeyframeAnimation2.f();
        Matrix matrix = this.f9672a;
        matrix.reset();
        if (pointF != null) {
            matrix.preTranslate(pointF.x * f, pointF.y * f);
        }
        if (scaleXY != null) {
            double d = f;
            matrix.preScale((float) Math.pow(scaleXY.f9965a, d), (float) Math.pow(scaleXY.f9966b, d));
        }
        BaseKeyframeAnimation baseKeyframeAnimation3 = this.f9677i;
        if (baseKeyframeAnimation3 != null) {
            float fFloatValue = ((Float) baseKeyframeAnimation3.f()).floatValue();
            BaseKeyframeAnimation baseKeyframeAnimation4 = this.f;
            PointF pointF2 = baseKeyframeAnimation4 != null ? (PointF) baseKeyframeAnimation4.f() : null;
            matrix.preRotate(fFloatValue * f, pointF2 == null ? 0.0f : pointF2.x, pointF2 != null ? pointF2.y : 0.0f);
        }
        return matrix;
    }
}
