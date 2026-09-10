package com.airbnb.lottie.animation.content;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import androidx.collection.LongSparseArray;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.GradientColorKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.PointKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.ValueCallbackKeyframeAnimation;
import com.airbnb.lottie.model.content.GradientColor;
import com.airbnb.lottie.model.content.GradientStroke;
import com.airbnb.lottie.model.content.GradientType;
import com.airbnb.lottie.model.layer.BaseLayer;
import com.airbnb.lottie.value.LottieValueCallback;
import com.p004ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: loaded from: classes.dex */
public class GradientStrokeContent extends BaseStrokeContent {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final PointKeyframeAnimation f9600A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public ValueCallbackKeyframeAnimation f9601B;
    public final String r;
    public final boolean s;
    public final LongSparseArray t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final LongSparseArray f9602u;
    public final RectF v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final GradientType f9603w;
    public final int x;
    public final GradientColorKeyframeAnimation y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final PointKeyframeAnimation f9604z;

    /* JADX WARN: Illegal instructions before constructor call */
    public GradientStrokeContent(LottieDrawable lottieDrawable, BaseLayer baseLayer, GradientStroke gradientStroke) {
        int iOrdinal = gradientStroke.f9766h.ordinal();
        Paint.Cap cap = iOrdinal != 0 ? iOrdinal != 1 ? Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        int iOrdinal2 = gradientStroke.f9767i.ordinal();
        super(lottieDrawable, baseLayer, cap, iOrdinal2 != 0 ? iOrdinal2 != 1 ? iOrdinal2 != 2 ? null : Paint.Join.BEVEL : Paint.Join.ROUND : Paint.Join.MITER, gradientStroke.j, gradientStroke.d, gradientStroke.g, gradientStroke.k, gradientStroke.f9768l);
        this.t = new LongSparseArray();
        this.f9602u = new LongSparseArray();
        this.v = new RectF();
        this.r = gradientStroke.f9762a;
        this.f9603w = gradientStroke.f9763b;
        this.s = gradientStroke.m;
        this.x = (int) (lottieDrawable.X.b() / 32.0f);
        BaseKeyframeAnimation baseKeyframeAnimationG = gradientStroke.f9764c.g();
        this.y = (GradientColorKeyframeAnimation) baseKeyframeAnimationG;
        baseKeyframeAnimationG.a(this);
        baseLayer.g(baseKeyframeAnimationG);
        BaseKeyframeAnimation baseKeyframeAnimationG2 = gradientStroke.f9765e.g();
        this.f9604z = (PointKeyframeAnimation) baseKeyframeAnimationG2;
        baseKeyframeAnimationG2.a(this);
        baseLayer.g(baseKeyframeAnimationG2);
        BaseKeyframeAnimation baseKeyframeAnimationG3 = gradientStroke.f.g();
        this.f9600A = (PointKeyframeAnimation) baseKeyframeAnimationG3;
        baseKeyframeAnimationG3.a(this);
        baseLayer.g(baseKeyframeAnimationG3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.airbnb.lottie.animation.content.BaseStrokeContent, com.airbnb.lottie.model.KeyPathElement
    public final void d(ColorFilter colorFilter, LottieValueCallback lottieValueCallback) {
        super.d(colorFilter, lottieValueCallback);
        if (colorFilter == LottieProperty.G) {
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation = this.f9601B;
            BaseLayer baseLayer = this.f;
            if (valueCallbackKeyframeAnimation != null) {
                baseLayer.p(valueCallbackKeyframeAnimation);
            }
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation2 = new ValueCallbackKeyframeAnimation(lottieValueCallback, null);
            this.f9601B = valueCallbackKeyframeAnimation2;
            valueCallbackKeyframeAnimation2.a(this);
            baseLayer.g(this.f9601B);
        }
    }

    public final int[] g(int[] iArr) {
        ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation = this.f9601B;
        if (valueCallbackKeyframeAnimation != null) {
            Integer[] numArr = (Integer[]) valueCallbackKeyframeAnimation.f();
            int i2 = 0;
            if (iArr.length == numArr.length) {
                while (i2 < iArr.length) {
                    iArr[i2] = numArr[i2].intValue();
                    i2++;
                }
            } else {
                iArr = new int[numArr.length];
                while (i2 < numArr.length) {
                    iArr[i2] = numArr[i2].intValue();
                    i2++;
                }
            }
        }
        return iArr;
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public final String getName() {
        return this.r;
    }

    @Override // com.airbnb.lottie.animation.content.BaseStrokeContent, com.airbnb.lottie.animation.content.DrawingContent
    public final void h(Canvas canvas, Matrix matrix, int i2) {
        Shader shader;
        Shader radialGradient;
        if (this.s) {
            return;
        }
        f(this.v, matrix, false);
        GradientType gradientType = GradientType.X;
        GradientColorKeyframeAnimation gradientColorKeyframeAnimation = this.y;
        PointKeyframeAnimation pointKeyframeAnimation = this.f9600A;
        PointKeyframeAnimation pointKeyframeAnimation2 = this.f9604z;
        if (this.f9603w == gradientType) {
            long jI = i();
            LongSparseArray longSparseArray = this.t;
            shader = (LinearGradient) longSparseArray.d(jI);
            if (shader == null) {
                PointF pointF = (PointF) pointKeyframeAnimation2.f();
                PointF pointF2 = (PointF) pointKeyframeAnimation.f();
                GradientColor gradientColor = (GradientColor) gradientColorKeyframeAnimation.f();
                radialGradient = new LinearGradient(pointF.x, pointF.y, pointF2.x, pointF2.y, g(gradientColor.f9756b), gradientColor.f9755a, Shader.TileMode.CLAMP);
                longSparseArray.h(jI, radialGradient);
                shader = radialGradient;
            }
        } else {
            long jI2 = i();
            LongSparseArray longSparseArray2 = this.f9602u;
            shader = (RadialGradient) longSparseArray2.d(jI2);
            if (shader == null) {
                PointF pointF3 = (PointF) pointKeyframeAnimation2.f();
                PointF pointF4 = (PointF) pointKeyframeAnimation.f();
                GradientColor gradientColor2 = (GradientColor) gradientColorKeyframeAnimation.f();
                int[] iArrG = g(gradientColor2.f9756b);
                float f = pointF3.x;
                float f2 = pointF3.y;
                radialGradient = new RadialGradient(f, f2, (float) Math.hypot(pointF4.x - f, pointF4.y - f2), iArrG, gradientColor2.f9755a, Shader.TileMode.CLAMP);
                longSparseArray2.h(jI2, radialGradient);
                shader = radialGradient;
            }
        }
        shader.setLocalMatrix(matrix);
        this.f9565i.setShader(shader);
        super.h(canvas, matrix, i2);
    }

    public final int i() {
        float f = this.f9604z.d;
        float f2 = this.x;
        int iRound = Math.round(f * f2);
        int iRound2 = Math.round(this.f9600A.d * f2);
        int iRound3 = Math.round(this.y.d * f2);
        int i2 = iRound != 0 ? IronSourceError.ERROR_NON_EXISTENT_INSTANCE * iRound : 17;
        if (iRound2 != 0) {
            i2 = i2 * 31 * iRound2;
        }
        return iRound3 != 0 ? i2 * 31 * iRound3 : i2;
    }
}
