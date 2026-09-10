package com.airbnb.lottie.model.layer;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.animation.LPaint;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.ValueCallbackKeyframeAnimation;
import com.airbnb.lottie.value.LottieValueCallback;

/* JADX INFO: loaded from: classes.dex */
public class SolidLayer extends BaseLayer {
    public final RectF C;
    public final LPaint D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final float[] f9853E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final Path f9854F;
    public final Layer G;
    public ValueCallbackKeyframeAnimation H;

    public SolidLayer(LottieDrawable lottieDrawable, Layer layer) {
        super(lottieDrawable, layer);
        this.C = new RectF();
        LPaint lPaint = new LPaint();
        this.D = lPaint;
        this.f9853E = new float[8];
        this.f9854F = new Path();
        this.G = layer;
        lPaint.setAlpha(0);
        lPaint.setStyle(Paint.Style.FILL);
        lPaint.setColor(layer.f9846l);
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer, com.airbnb.lottie.model.KeyPathElement
    public final void d(ColorFilter colorFilter, LottieValueCallback lottieValueCallback) {
        super.d(colorFilter, lottieValueCallback);
        if (colorFilter == LottieProperty.f9532F) {
            this.H = new ValueCallbackKeyframeAnimation(lottieValueCallback, null);
        }
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer, com.airbnb.lottie.animation.content.DrawingContent
    public final void f(RectF rectF, Matrix matrix, boolean z2) {
        super.f(rectF, matrix, z2);
        RectF rectF2 = this.C;
        Layer layer = this.G;
        rectF2.set(0.0f, 0.0f, layer.j, layer.k);
        this.f9828n.mapRect(rectF2);
        rectF.set(rectF2);
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer
    public final void k(Canvas canvas, Matrix matrix, int i2) {
        Layer layer = this.G;
        int iAlpha = Color.alpha(layer.f9846l);
        if (iAlpha == 0) {
            return;
        }
        BaseKeyframeAnimation baseKeyframeAnimation = this.f9831w.j;
        int iIntValue = (int) ((((iAlpha / 255.0f) * (baseKeyframeAnimation == null ? 100 : ((Integer) baseKeyframeAnimation.f()).intValue())) / 100.0f) * (i2 / 255.0f) * 255.0f);
        LPaint lPaint = this.D;
        lPaint.setAlpha(iIntValue);
        ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation = this.H;
        if (valueCallbackKeyframeAnimation != null) {
            lPaint.setColorFilter((ColorFilter) valueCallbackKeyframeAnimation.f());
        }
        if (iIntValue > 0) {
            float[] fArr = this.f9853E;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            float f = layer.j;
            fArr[2] = f;
            fArr[3] = 0.0f;
            fArr[4] = f;
            float f2 = layer.k;
            fArr[5] = f2;
            fArr[6] = 0.0f;
            fArr[7] = f2;
            matrix.mapPoints(fArr);
            Path path = this.f9854F;
            path.reset();
            path.moveTo(fArr[0], fArr[1]);
            path.lineTo(fArr[2], fArr[3]);
            path.lineTo(fArr[4], fArr[5]);
            path.lineTo(fArr[6], fArr[7]);
            path.lineTo(fArr[0], fArr[1]);
            path.close();
            canvas.drawPath(path, lPaint);
        }
    }
}
