package com.airbnb.lottie.animation.content;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.animation.LPaint;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.ColorKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.ValueCallbackKeyframeAnimation;
import com.airbnb.lottie.model.content.ShapeStroke;
import com.airbnb.lottie.model.layer.BaseLayer;
import com.airbnb.lottie.value.LottieValueCallback;

/* JADX INFO: loaded from: classes.dex */
public class StrokeContent extends BaseStrokeContent {
    public final BaseLayer r;
    public final String s;
    public final boolean t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final ColorKeyframeAnimation f9638u;
    public ValueCallbackKeyframeAnimation v;

    /* JADX WARN: Illegal instructions before constructor call */
    public StrokeContent(LottieDrawable lottieDrawable, BaseLayer baseLayer, ShapeStroke shapeStroke) {
        int iOrdinal = shapeStroke.g.ordinal();
        Paint.Cap cap = iOrdinal != 0 ? iOrdinal != 1 ? Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        int iOrdinal2 = shapeStroke.f9810h.ordinal();
        super(lottieDrawable, baseLayer, cap, iOrdinal2 != 0 ? iOrdinal2 != 1 ? iOrdinal2 != 2 ? null : Paint.Join.BEVEL : Paint.Join.ROUND : Paint.Join.MITER, shapeStroke.f9811i, shapeStroke.f9809e, shapeStroke.f, shapeStroke.f9808c, shapeStroke.f9807b);
        this.r = baseLayer;
        this.s = shapeStroke.f9806a;
        this.t = shapeStroke.j;
        BaseKeyframeAnimation baseKeyframeAnimationG = shapeStroke.d.g();
        this.f9638u = (ColorKeyframeAnimation) baseKeyframeAnimationG;
        baseKeyframeAnimationG.a(this);
        baseLayer.g(baseKeyframeAnimationG);
    }

    @Override // com.airbnb.lottie.animation.content.BaseStrokeContent, com.airbnb.lottie.model.KeyPathElement
    public final void d(ColorFilter colorFilter, LottieValueCallback lottieValueCallback) {
        super.d(colorFilter, lottieValueCallback);
        PointF pointF = LottieProperty.f9535a;
        ColorKeyframeAnimation colorKeyframeAnimation = this.f9638u;
        if (colorFilter == 2) {
            colorKeyframeAnimation.k(lottieValueCallback);
            return;
        }
        if (colorFilter == LottieProperty.f9532F) {
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation = this.v;
            BaseLayer baseLayer = this.r;
            if (valueCallbackKeyframeAnimation != null) {
                baseLayer.p(valueCallbackKeyframeAnimation);
            }
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation2 = new ValueCallbackKeyframeAnimation(lottieValueCallback, null);
            this.v = valueCallbackKeyframeAnimation2;
            valueCallbackKeyframeAnimation2.a(this);
            baseLayer.g(colorKeyframeAnimation);
        }
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public final String getName() {
        return this.s;
    }

    @Override // com.airbnb.lottie.animation.content.BaseStrokeContent, com.airbnb.lottie.animation.content.DrawingContent
    public final void h(Canvas canvas, Matrix matrix, int i2) {
        if (this.t) {
            return;
        }
        LPaint lPaint = this.f9565i;
        ColorKeyframeAnimation colorKeyframeAnimation = this.f9638u;
        lPaint.setColor(colorKeyframeAnimation.l(colorKeyframeAnimation.b(), colorKeyframeAnimation.d()));
        ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation = this.v;
        if (valueCallbackKeyframeAnimation != null) {
            lPaint.setColorFilter((ColorFilter) valueCallbackKeyframeAnimation.f());
        }
        super.h(canvas, matrix, i2);
    }
}
