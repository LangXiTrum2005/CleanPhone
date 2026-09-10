package com.airbnb.lottie.animation.content;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import com.airbnb.lottie.L;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.animation.LPaint;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.ColorKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.DropShadowKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.IntegerKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.ValueCallbackKeyframeAnimation;
import com.airbnb.lottie.model.KeyPath;
import com.airbnb.lottie.model.animatable.AnimatableColorValue;
import com.airbnb.lottie.model.animatable.AnimatableIntegerValue;
import com.airbnb.lottie.model.content.ShapeFill;
import com.airbnb.lottie.model.layer.BaseLayer;
import com.airbnb.lottie.utils.MiscUtils;
import com.airbnb.lottie.value.LottieValueCallback;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class FillContent implements DrawingContent, BaseKeyframeAnimation.AnimationListener, KeyPathElementContent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f9583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LPaint f9584b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BaseLayer f9585c;
    public final String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f9586e;
    public final ArrayList f;
    public final ColorKeyframeAnimation g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final IntegerKeyframeAnimation f9587h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ValueCallbackKeyframeAnimation f9588i;
    public final LottieDrawable j;
    public BaseKeyframeAnimation k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f9589l;
    public final DropShadowKeyframeAnimation m;

    public FillContent(LottieDrawable lottieDrawable, BaseLayer baseLayer, ShapeFill shapeFill) {
        Path path = new Path();
        this.f9583a = path;
        this.f9584b = new LPaint(1);
        this.f = new ArrayList();
        this.f9585c = baseLayer;
        this.d = shapeFill.f9798c;
        this.f9586e = shapeFill.f;
        this.j = lottieDrawable;
        if (baseLayer.l() != null) {
            BaseKeyframeAnimation baseKeyframeAnimationG = baseLayer.l().f9750a.g();
            this.k = baseKeyframeAnimationG;
            baseKeyframeAnimationG.a(this);
            baseLayer.g(this.k);
        }
        if (baseLayer.m() != null) {
            this.m = new DropShadowKeyframeAnimation(this, baseLayer, baseLayer.m());
        }
        AnimatableColorValue animatableColorValue = shapeFill.d;
        if (animatableColorValue == null) {
            this.g = null;
            this.f9587h = null;
            return;
        }
        AnimatableIntegerValue animatableIntegerValue = shapeFill.f9799e;
        path.setFillType(shapeFill.f9797b);
        BaseKeyframeAnimation baseKeyframeAnimationG2 = animatableColorValue.g();
        this.g = (ColorKeyframeAnimation) baseKeyframeAnimationG2;
        baseKeyframeAnimationG2.a(this);
        baseLayer.g(baseKeyframeAnimationG2);
        BaseKeyframeAnimation baseKeyframeAnimationG3 = animatableIntegerValue.g();
        this.f9587h = (IntegerKeyframeAnimation) baseKeyframeAnimationG3;
        baseKeyframeAnimationG3.a(this);
        baseLayer.g(baseKeyframeAnimationG3);
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener
    public final void a() {
        this.j.invalidateSelf();
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public final void b(List list, List list2) {
        for (int i2 = 0; i2 < list2.size(); i2++) {
            Content content = (Content) list2.get(i2);
            if (content instanceof PathContent) {
                this.f.add((PathContent) content);
            }
        }
    }

    @Override // com.airbnb.lottie.model.KeyPathElement
    public final void d(ColorFilter colorFilter, LottieValueCallback lottieValueCallback) {
        PointF pointF = LottieProperty.f9535a;
        if (colorFilter == 1) {
            this.g.k(lottieValueCallback);
            return;
        }
        if (colorFilter == 4) {
            this.f9587h.k(lottieValueCallback);
            return;
        }
        ColorFilter colorFilter2 = LottieProperty.f9532F;
        BaseLayer baseLayer = this.f9585c;
        if (colorFilter == colorFilter2) {
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation = this.f9588i;
            if (valueCallbackKeyframeAnimation != null) {
                baseLayer.p(valueCallbackKeyframeAnimation);
            }
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation2 = new ValueCallbackKeyframeAnimation(lottieValueCallback, null);
            this.f9588i = valueCallbackKeyframeAnimation2;
            valueCallbackKeyframeAnimation2.a(this);
            baseLayer.g(this.f9588i);
            return;
        }
        if (colorFilter == LottieProperty.f9538e) {
            BaseKeyframeAnimation baseKeyframeAnimation = this.k;
            if (baseKeyframeAnimation != null) {
                baseKeyframeAnimation.k(lottieValueCallback);
                return;
            }
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation3 = new ValueCallbackKeyframeAnimation(lottieValueCallback, null);
            this.k = valueCallbackKeyframeAnimation3;
            valueCallbackKeyframeAnimation3.a(this);
            baseLayer.g(this.k);
            return;
        }
        DropShadowKeyframeAnimation dropShadowKeyframeAnimation = this.m;
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
        Path path = this.f9583a;
        path.reset();
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.f;
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

    @Override // com.airbnb.lottie.animation.content.Content
    public final String getName() {
        return this.d;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.airbnb.lottie.animation.content.DrawingContent
    public final void h(Canvas canvas, Matrix matrix, int i2) {
        BlurMaskFilter blurMaskFilter;
        if (this.f9586e) {
            return;
        }
        ColorKeyframeAnimation colorKeyframeAnimation = this.g;
        int iL = colorKeyframeAnimation.l(colorKeyframeAnimation.b(), colorKeyframeAnimation.d());
        int iIntValue = (int) ((((i2 / 255.0f) * ((Integer) this.f9587h.f()).intValue()) / 100.0f) * 255.0f);
        LPaint lPaint = this.f9584b;
        PointF pointF = MiscUtils.f9945a;
        int i3 = 0;
        lPaint.setColor((Math.max(0, Math.min(255, iIntValue)) << 24) | (iL & 16777215));
        ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation = this.f9588i;
        if (valueCallbackKeyframeAnimation != null) {
            lPaint.setColorFilter((ColorFilter) valueCallbackKeyframeAnimation.f());
        }
        BaseKeyframeAnimation baseKeyframeAnimation = this.k;
        if (baseKeyframeAnimation != null) {
            float fFloatValue = ((Float) baseKeyframeAnimation.f()).floatValue();
            if (fFloatValue == 0.0f) {
                lPaint.setMaskFilter(null);
            } else if (fFloatValue != this.f9589l) {
                BaseLayer baseLayer = this.f9585c;
                if (baseLayer.f9819A == fFloatValue) {
                    blurMaskFilter = baseLayer.f9820B;
                } else {
                    BlurMaskFilter blurMaskFilter2 = new BlurMaskFilter(fFloatValue / 2.0f, BlurMaskFilter.Blur.NORMAL);
                    baseLayer.f9820B = blurMaskFilter2;
                    baseLayer.f9819A = fFloatValue;
                    blurMaskFilter = blurMaskFilter2;
                }
                lPaint.setMaskFilter(blurMaskFilter);
            }
            this.f9589l = fFloatValue;
        }
        DropShadowKeyframeAnimation dropShadowKeyframeAnimation = this.m;
        if (dropShadowKeyframeAnimation != null) {
            dropShadowKeyframeAnimation.b(lPaint);
        }
        Path path = this.f9583a;
        path.reset();
        while (true) {
            ArrayList arrayList = this.f;
            if (i3 >= arrayList.size()) {
                canvas.drawPath(path, lPaint);
                L.a();
                return;
            } else {
                path.addPath(((PathContent) arrayList.get(i3)).u(), matrix);
                i3++;
            }
        }
    }
}
