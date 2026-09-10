package com.airbnb.lottie.animation.content;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import androidx.collection.LongSparseArray;
import com.airbnb.lottie.L;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.animation.LPaint;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.DropShadowKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.GradientColorKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.IntegerKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.PointKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.ValueCallbackKeyframeAnimation;
import com.airbnb.lottie.model.KeyPath;
import com.airbnb.lottie.model.content.GradientColor;
import com.airbnb.lottie.model.content.GradientFill;
import com.airbnb.lottie.model.content.GradientType;
import com.airbnb.lottie.model.layer.BaseLayer;
import com.airbnb.lottie.utils.MiscUtils;
import com.airbnb.lottie.value.LottieValueCallback;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class GradientFillContent implements DrawingContent, BaseKeyframeAnimation.AnimationListener, KeyPathElementContent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f9591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BaseLayer f9592c;
    public final LongSparseArray d = new LongSparseArray();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LongSparseArray f9593e = new LongSparseArray();
    public final Path f;
    public final LPaint g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final RectF f9594h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f9595i;
    public final GradientType j;
    public final GradientColorKeyframeAnimation k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final IntegerKeyframeAnimation f9596l;
    public final PointKeyframeAnimation m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final PointKeyframeAnimation f9597n;
    public ValueCallbackKeyframeAnimation o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ValueCallbackKeyframeAnimation f9598p;
    public final LottieDrawable q;
    public final int r;
    public BaseKeyframeAnimation s;
    public float t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final DropShadowKeyframeAnimation f9599u;

    public GradientFillContent(LottieDrawable lottieDrawable, BaseLayer baseLayer, GradientFill gradientFill) {
        Path path = new Path();
        this.f = path;
        this.g = new LPaint(1);
        this.f9594h = new RectF();
        this.f9595i = new ArrayList();
        this.t = 0.0f;
        this.f9592c = baseLayer;
        this.f9590a = gradientFill.g;
        this.f9591b = gradientFill.f9761h;
        this.q = lottieDrawable;
        this.j = gradientFill.f9757a;
        path.setFillType(gradientFill.f9758b);
        this.r = (int) (lottieDrawable.X.b() / 32.0f);
        BaseKeyframeAnimation baseKeyframeAnimationG = gradientFill.f9759c.g();
        this.k = (GradientColorKeyframeAnimation) baseKeyframeAnimationG;
        baseKeyframeAnimationG.a(this);
        baseLayer.g(baseKeyframeAnimationG);
        BaseKeyframeAnimation baseKeyframeAnimationG2 = gradientFill.d.g();
        this.f9596l = (IntegerKeyframeAnimation) baseKeyframeAnimationG2;
        baseKeyframeAnimationG2.a(this);
        baseLayer.g(baseKeyframeAnimationG2);
        BaseKeyframeAnimation baseKeyframeAnimationG3 = gradientFill.f9760e.g();
        this.m = (PointKeyframeAnimation) baseKeyframeAnimationG3;
        baseKeyframeAnimationG3.a(this);
        baseLayer.g(baseKeyframeAnimationG3);
        BaseKeyframeAnimation baseKeyframeAnimationG4 = gradientFill.f.g();
        this.f9597n = (PointKeyframeAnimation) baseKeyframeAnimationG4;
        baseKeyframeAnimationG4.a(this);
        baseLayer.g(baseKeyframeAnimationG4);
        if (baseLayer.l() != null) {
            BaseKeyframeAnimation baseKeyframeAnimationG5 = baseLayer.l().f9750a.g();
            this.s = baseKeyframeAnimationG5;
            baseKeyframeAnimationG5.a(this);
            baseLayer.g(this.s);
        }
        if (baseLayer.m() != null) {
            this.f9599u = new DropShadowKeyframeAnimation(this, baseLayer, baseLayer.m());
        }
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener
    public final void a() {
        this.q.invalidateSelf();
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public final void b(List list, List list2) {
        for (int i2 = 0; i2 < list2.size(); i2++) {
            Content content = (Content) list2.get(i2);
            if (content instanceof PathContent) {
                this.f9595i.add((PathContent) content);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.airbnb.lottie.model.KeyPathElement
    public final void d(ColorFilter colorFilter, LottieValueCallback lottieValueCallback) {
        PointF pointF = LottieProperty.f9535a;
        if (colorFilter == 4) {
            this.f9596l.k(lottieValueCallback);
            return;
        }
        ColorFilter colorFilter2 = LottieProperty.f9532F;
        BaseLayer baseLayer = this.f9592c;
        if (colorFilter == colorFilter2) {
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation = this.o;
            if (valueCallbackKeyframeAnimation != null) {
                baseLayer.p(valueCallbackKeyframeAnimation);
            }
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation2 = new ValueCallbackKeyframeAnimation(lottieValueCallback, null);
            this.o = valueCallbackKeyframeAnimation2;
            valueCallbackKeyframeAnimation2.a(this);
            baseLayer.g(this.o);
            return;
        }
        if (colorFilter == LottieProperty.G) {
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation3 = this.f9598p;
            if (valueCallbackKeyframeAnimation3 != null) {
                baseLayer.p(valueCallbackKeyframeAnimation3);
            }
            this.d.b();
            this.f9593e.b();
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation4 = new ValueCallbackKeyframeAnimation(lottieValueCallback, null);
            this.f9598p = valueCallbackKeyframeAnimation4;
            valueCallbackKeyframeAnimation4.a(this);
            baseLayer.g(this.f9598p);
            return;
        }
        if (colorFilter == LottieProperty.f9538e) {
            BaseKeyframeAnimation baseKeyframeAnimation = this.s;
            if (baseKeyframeAnimation != null) {
                baseKeyframeAnimation.k(lottieValueCallback);
                return;
            }
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation5 = new ValueCallbackKeyframeAnimation(lottieValueCallback, null);
            this.s = valueCallbackKeyframeAnimation5;
            valueCallbackKeyframeAnimation5.a(this);
            baseLayer.g(this.s);
            return;
        }
        DropShadowKeyframeAnimation dropShadowKeyframeAnimation = this.f9599u;
        if (colorFilter == 5 && dropShadowKeyframeAnimation != null) {
            dropShadowKeyframeAnimation.f9654b.k(lottieValueCallback);
            return;
        }
        if (colorFilter == LottieProperty.f9530B && dropShadowKeyframeAnimation != null) {
            dropShadowKeyframeAnimation.c(lottieValueCallback);
            return;
        }
        if (colorFilter == LottieProperty.C && dropShadowKeyframeAnimation != null) {
            dropShadowKeyframeAnimation.d.k(lottieValueCallback);
            return;
        }
        if (colorFilter == LottieProperty.D && dropShadowKeyframeAnimation != null) {
            dropShadowKeyframeAnimation.f9656e.k(lottieValueCallback);
        } else {
            if (colorFilter != LottieProperty.f9531E || dropShadowKeyframeAnimation == null) {
                return;
            }
            dropShadowKeyframeAnimation.f.k(lottieValueCallback);
        }
    }

    @Override // com.airbnb.lottie.model.KeyPathElement
    public final void e(KeyPath keyPath, int i2, ArrayList arrayList, KeyPath keyPath2) {
        MiscUtils.f(keyPath, i2, arrayList, keyPath2, this);
    }

    @Override // com.airbnb.lottie.animation.content.DrawingContent
    public final void f(RectF rectF, Matrix matrix, boolean z2) {
        Path path = this.f;
        path.reset();
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.f9595i;
            if (i2 >= arrayList.size()) {
                path.computeBounds(rectF, false);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                return;
            } else {
                path.addPath(((PathContent) arrayList.get(i2)).u(), matrix);
                i2++;
            }
        }
    }

    public final int[] g(int[] iArr) {
        ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation = this.f9598p;
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
        return this.f9590a;
    }

    @Override // com.airbnb.lottie.animation.content.DrawingContent
    public final void h(Canvas canvas, Matrix matrix, int i2) {
        Shader shader;
        Shader radialGradient;
        if (this.f9591b) {
            return;
        }
        Path path = this.f;
        path.reset();
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.f9595i;
            if (i3 >= arrayList.size()) {
                break;
            }
            path.addPath(((PathContent) arrayList.get(i3)).u(), matrix);
            i3++;
        }
        path.computeBounds(this.f9594h, false);
        GradientType gradientType = GradientType.X;
        GradientColorKeyframeAnimation gradientColorKeyframeAnimation = this.k;
        PointKeyframeAnimation pointKeyframeAnimation = this.f9597n;
        PointKeyframeAnimation pointKeyframeAnimation2 = this.m;
        if (this.j == gradientType) {
            long jI = i();
            LongSparseArray longSparseArray = this.d;
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
            LongSparseArray longSparseArray2 = this.f9593e;
            shader = (RadialGradient) longSparseArray2.d(jI2);
            if (shader == null) {
                PointF pointF3 = (PointF) pointKeyframeAnimation2.f();
                PointF pointF4 = (PointF) pointKeyframeAnimation.f();
                GradientColor gradientColor2 = (GradientColor) gradientColorKeyframeAnimation.f();
                int[] iArrG = g(gradientColor2.f9756b);
                float f = pointF3.x;
                float f2 = pointF3.y;
                float fHypot = (float) Math.hypot(pointF4.x - f, pointF4.y - f2);
                if (fHypot <= 0.0f) {
                    fHypot = 0.001f;
                }
                radialGradient = new RadialGradient(f, f2, fHypot, iArrG, gradientColor2.f9755a, Shader.TileMode.CLAMP);
                longSparseArray2.h(jI2, radialGradient);
                shader = radialGradient;
            }
        }
        shader.setLocalMatrix(matrix);
        LPaint lPaint = this.g;
        lPaint.setShader(shader);
        ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation = this.o;
        if (valueCallbackKeyframeAnimation != null) {
            lPaint.setColorFilter((ColorFilter) valueCallbackKeyframeAnimation.f());
        }
        BaseKeyframeAnimation baseKeyframeAnimation = this.s;
        if (baseKeyframeAnimation != null) {
            float fFloatValue = ((Float) baseKeyframeAnimation.f()).floatValue();
            if (fFloatValue == 0.0f) {
                lPaint.setMaskFilter(null);
            } else if (fFloatValue != this.t) {
                lPaint.setMaskFilter(new BlurMaskFilter(fFloatValue, BlurMaskFilter.Blur.NORMAL));
            }
            this.t = fFloatValue;
        }
        DropShadowKeyframeAnimation dropShadowKeyframeAnimation = this.f9599u;
        if (dropShadowKeyframeAnimation != null) {
            dropShadowKeyframeAnimation.b(lPaint);
        }
        int iIntValue = (int) ((((i2 / 255.0f) * ((Integer) this.f9596l.f()).intValue()) / 100.0f) * 255.0f);
        PointF pointF5 = MiscUtils.f9945a;
        lPaint.setAlpha(Math.max(0, Math.min(255, iIntValue)));
        canvas.drawPath(path, lPaint);
        L.a();
    }

    public final int i() {
        float f = this.m.d;
        float f2 = this.r;
        int iRound = Math.round(f * f2);
        int iRound2 = Math.round(this.f9597n.d * f2);
        int iRound3 = Math.round(this.k.d * f2);
        int i2 = iRound != 0 ? IronSourceError.ERROR_NON_EXISTENT_INSTANCE * iRound : 17;
        if (iRound2 != 0) {
            i2 = i2 * 31 * iRound2;
        }
        return iRound3 != 0 ? i2 * 31 * iRound3 : i2;
    }
}
