package com.airbnb.lottie.animation.content;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.RectF;
import com.airbnb.lottie.L;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.animation.LPaint;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.DropShadowKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.FloatKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.IntegerKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.ValueCallbackKeyframeAnimation;
import com.airbnb.lottie.model.KeyPath;
import com.airbnb.lottie.model.animatable.AnimatableFloatValue;
import com.airbnb.lottie.model.animatable.AnimatableIntegerValue;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.model.layer.BaseLayer;
import com.airbnb.lottie.utils.MiscUtils;
import com.airbnb.lottie.utils.Utils;
import com.airbnb.lottie.value.LottieValueCallback;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseStrokeContent implements BaseKeyframeAnimation.AnimationListener, KeyPathElementContent, DrawingContent {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LottieDrawable f9563e;
    public final BaseLayer f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float[] f9564h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final LPaint f9565i;
    public final FloatKeyframeAnimation j;
    public final IntegerKeyframeAnimation k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f9566l;
    public final FloatKeyframeAnimation m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ValueCallbackKeyframeAnimation f9567n;
    public BaseKeyframeAnimation o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f9568p;
    public final DropShadowKeyframeAnimation q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PathMeasure f9560a = new PathMeasure();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Path f9561b = new Path();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Path f9562c = new Path();
    public final RectF d = new RectF();
    public final ArrayList g = new ArrayList();

    public static final class PathGroup {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f9569a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TrimPathContent f9570b;

        public PathGroup(TrimPathContent trimPathContent) {
            this.f9570b = trimPathContent;
        }
    }

    public BaseStrokeContent(LottieDrawable lottieDrawable, BaseLayer baseLayer, Paint.Cap cap, Paint.Join join, float f, AnimatableIntegerValue animatableIntegerValue, AnimatableFloatValue animatableFloatValue, ArrayList arrayList, AnimatableFloatValue animatableFloatValue2) {
        LPaint lPaint = new LPaint(1);
        this.f9565i = lPaint;
        this.f9568p = 0.0f;
        this.f9563e = lottieDrawable;
        this.f = baseLayer;
        lPaint.setStyle(Paint.Style.STROKE);
        lPaint.setStrokeCap(cap);
        lPaint.setStrokeJoin(join);
        lPaint.setStrokeMiter(f);
        this.k = (IntegerKeyframeAnimation) animatableIntegerValue.g();
        this.j = (FloatKeyframeAnimation) animatableFloatValue.g();
        if (animatableFloatValue2 == null) {
            this.m = null;
        } else {
            this.m = (FloatKeyframeAnimation) animatableFloatValue2.g();
        }
        this.f9566l = new ArrayList(arrayList.size());
        this.f9564h = new float[arrayList.size()];
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            this.f9566l.add(((AnimatableFloatValue) arrayList.get(i2)).g());
        }
        baseLayer.g(this.k);
        baseLayer.g(this.j);
        for (int i3 = 0; i3 < this.f9566l.size(); i3++) {
            baseLayer.g((BaseKeyframeAnimation) this.f9566l.get(i3));
        }
        FloatKeyframeAnimation floatKeyframeAnimation = this.m;
        if (floatKeyframeAnimation != null) {
            baseLayer.g(floatKeyframeAnimation);
        }
        this.k.a(this);
        this.j.a(this);
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            ((BaseKeyframeAnimation) this.f9566l.get(i4)).a(this);
        }
        FloatKeyframeAnimation floatKeyframeAnimation2 = this.m;
        if (floatKeyframeAnimation2 != null) {
            floatKeyframeAnimation2.a(this);
        }
        if (baseLayer.l() != null) {
            BaseKeyframeAnimation baseKeyframeAnimationG = baseLayer.l().f9750a.g();
            this.o = baseKeyframeAnimationG;
            baseKeyframeAnimationG.a(this);
            baseLayer.g(this.o);
        }
        if (baseLayer.m() != null) {
            this.q = new DropShadowKeyframeAnimation(this, baseLayer, baseLayer.m());
        }
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener
    public final void a() {
        this.f9563e.invalidateSelf();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0051  */
    /* JADX WARN: Code duplicated, block: B:25:0x0055 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x0057  */
    /* JADX WARN: Code duplicated, block: B:39:0x0063 A[SYNTHETIC] */
    @Override // com.airbnb.lottie.animation.content.Content
    public final void b(List list, List list2) {
        ShapeTrimPath.Type type;
        ArrayList arrayList;
        ArrayList arrayList2 = (ArrayList) list;
        int size = arrayList2.size() - 1;
        PathGroup pathGroup = null;
        TrimPathContent trimPathContent = null;
        while (true) {
            type = ShapeTrimPath.Type.f9818Y;
            if (size < 0) {
                break;
            }
            Content content = (Content) arrayList2.get(size);
            if (content instanceof TrimPathContent) {
                TrimPathContent trimPathContent2 = (TrimPathContent) content;
                if (trimPathContent2.f9641c == type) {
                    trimPathContent = trimPathContent2;
                }
            }
            size--;
        }
        if (trimPathContent != null) {
            trimPathContent.d(this);
        }
        int size2 = list2.size();
        while (true) {
            size2--;
            arrayList = this.g;
            if (size2 < 0) {
                break;
            }
            Content content2 = (Content) list2.get(size2);
            if (content2 instanceof TrimPathContent) {
                TrimPathContent trimPathContent3 = (TrimPathContent) content2;
                if (trimPathContent3.f9641c == type) {
                    if (pathGroup != null) {
                        arrayList.add(pathGroup);
                    }
                    PathGroup pathGroup2 = new PathGroup(trimPathContent3);
                    trimPathContent3.d(this);
                    pathGroup = pathGroup2;
                } else if (!(content2 instanceof PathContent)) {
                    if (pathGroup == null) {
                        pathGroup = new PathGroup(trimPathContent);
                    }
                    pathGroup.f9569a.add((PathContent) content2);
                }
            } else if (!(content2 instanceof PathContent)) {
                if (pathGroup == null) {
                    pathGroup = new PathGroup(trimPathContent);
                }
                pathGroup.f9569a.add((PathContent) content2);
            }
        }
        if (pathGroup != null) {
            arrayList.add(pathGroup);
        }
    }

    @Override // com.airbnb.lottie.model.KeyPathElement
    public void d(ColorFilter colorFilter, LottieValueCallback lottieValueCallback) {
        PointF pointF = LottieProperty.f9535a;
        if (colorFilter == 4) {
            this.k.k(lottieValueCallback);
            return;
        }
        if (colorFilter == LottieProperty.f9542n) {
            this.j.k(lottieValueCallback);
            return;
        }
        ColorFilter colorFilter2 = LottieProperty.f9532F;
        BaseLayer baseLayer = this.f;
        if (colorFilter == colorFilter2) {
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation = this.f9567n;
            if (valueCallbackKeyframeAnimation != null) {
                baseLayer.p(valueCallbackKeyframeAnimation);
            }
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation2 = new ValueCallbackKeyframeAnimation(lottieValueCallback, null);
            this.f9567n = valueCallbackKeyframeAnimation2;
            valueCallbackKeyframeAnimation2.a(this);
            baseLayer.g(this.f9567n);
            return;
        }
        if (colorFilter == LottieProperty.f9538e) {
            BaseKeyframeAnimation baseKeyframeAnimation = this.o;
            if (baseKeyframeAnimation != null) {
                baseKeyframeAnimation.k(lottieValueCallback);
                return;
            }
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation3 = new ValueCallbackKeyframeAnimation(lottieValueCallback, null);
            this.o = valueCallbackKeyframeAnimation3;
            valueCallbackKeyframeAnimation3.a(this);
            baseLayer.g(this.o);
            return;
        }
        DropShadowKeyframeAnimation dropShadowKeyframeAnimation = this.q;
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
        Path path = this.f9561b;
        path.reset();
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.g;
            if (i2 >= arrayList.size()) {
                RectF rectF2 = this.d;
                path.computeBounds(rectF2, false);
                float fL = this.j.l() / 2.0f;
                rectF2.set(rectF2.left - fL, rectF2.top - fL, rectF2.right + fL, rectF2.bottom + fL);
                rectF.set(rectF2);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                L.a();
                return;
            }
            PathGroup pathGroup = (PathGroup) arrayList.get(i2);
            for (int i3 = 0; i3 < pathGroup.f9569a.size(); i3++) {
                path.addPath(((PathContent) pathGroup.f9569a.get(i3)).u(), matrix);
            }
            i2++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:80:0x0214  */
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
    public void h(Canvas canvas, Matrix matrix, int i2) {
        float[] fArr;
        int i3;
        float f;
        BlurMaskFilter blurMaskFilter;
        BaseStrokeContent baseStrokeContent = this;
        int i4 = 1;
        float[] fArr2 = (float[]) Utils.d.get();
        boolean z2 = false;
        fArr2[0] = 0.0f;
        fArr2[1] = 0.0f;
        fArr2[2] = 37394.73f;
        fArr2[3] = 39575.234f;
        matrix.mapPoints(fArr2);
        if (fArr2[0] == fArr2[2] || fArr2[1] == fArr2[3]) {
            L.a();
            return;
        }
        IntegerKeyframeAnimation integerKeyframeAnimation = baseStrokeContent.k;
        float fL = (i2 / 255.0f) * integerKeyframeAnimation.l(integerKeyframeAnimation.b(), integerKeyframeAnimation.d());
        float f2 = 100.0f;
        LPaint lPaint = baseStrokeContent.f9565i;
        PointF pointF = MiscUtils.f9945a;
        lPaint.setAlpha(Math.max(0, Math.min(255, (int) ((fL / 100.0f) * 255.0f))));
        lPaint.setStrokeWidth(Utils.d(matrix) * baseStrokeContent.j.l());
        if (lPaint.getStrokeWidth() <= 0.0f) {
            L.a();
            return;
        }
        ArrayList arrayList = baseStrokeContent.f9566l;
        if (arrayList.isEmpty()) {
            L.a();
        } else {
            float fD = Utils.d(matrix);
            int i5 = 0;
            while (true) {
                int size = arrayList.size();
                fArr = baseStrokeContent.f9564h;
                if (i5 >= size) {
                    break;
                }
                float fFloatValue = ((Float) ((BaseKeyframeAnimation) arrayList.get(i5)).f()).floatValue();
                fArr[i5] = fFloatValue;
                if (i5 % 2 == 0) {
                    if (fFloatValue < 1.0f) {
                        fArr[i5] = 1.0f;
                    }
                } else if (fFloatValue < 0.1f) {
                    fArr[i5] = 0.1f;
                }
                fArr[i5] = fArr[i5] * fD;
                i5++;
            }
            FloatKeyframeAnimation floatKeyframeAnimation = baseStrokeContent.m;
            lPaint.setPathEffect(new DashPathEffect(fArr, floatKeyframeAnimation == null ? 0.0f : ((Float) floatKeyframeAnimation.f()).floatValue() * fD));
            L.a();
        }
        ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation = baseStrokeContent.f9567n;
        if (valueCallbackKeyframeAnimation != null) {
            lPaint.setColorFilter((ColorFilter) valueCallbackKeyframeAnimation.f());
        }
        BaseKeyframeAnimation baseKeyframeAnimation = baseStrokeContent.o;
        if (baseKeyframeAnimation != null) {
            float fFloatValue2 = ((Float) baseKeyframeAnimation.f()).floatValue();
            if (fFloatValue2 == 0.0f) {
                lPaint.setMaskFilter(null);
            } else if (fFloatValue2 != baseStrokeContent.f9568p) {
                BaseLayer baseLayer = baseStrokeContent.f;
                if (baseLayer.f9819A == fFloatValue2) {
                    blurMaskFilter = baseLayer.f9820B;
                } else {
                    BlurMaskFilter blurMaskFilter2 = new BlurMaskFilter(fFloatValue2 / 2.0f, BlurMaskFilter.Blur.NORMAL);
                    baseLayer.f9820B = blurMaskFilter2;
                    baseLayer.f9819A = fFloatValue2;
                    blurMaskFilter = blurMaskFilter2;
                }
                lPaint.setMaskFilter(blurMaskFilter);
            }
            baseStrokeContent.f9568p = fFloatValue2;
        }
        DropShadowKeyframeAnimation dropShadowKeyframeAnimation = baseStrokeContent.q;
        if (dropShadowKeyframeAnimation != null) {
            dropShadowKeyframeAnimation.b(lPaint);
        }
        int i6 = 0;
        while (true) {
            ArrayList arrayList2 = baseStrokeContent.g;
            if (i6 >= arrayList2.size()) {
                L.a();
                return;
            }
            PathGroup pathGroup = (PathGroup) arrayList2.get(i6);
            TrimPathContent trimPathContent = pathGroup.f9570b;
            Path path = baseStrokeContent.f9561b;
            ArrayList arrayList3 = pathGroup.f9569a;
            if (trimPathContent != null) {
                path.reset();
                for (int size2 = arrayList3.size() - i4; size2 >= 0; size2--) {
                    path.addPath(((PathContent) arrayList3.get(size2)).u(), matrix);
                }
                TrimPathContent trimPathContent2 = pathGroup.f9570b;
                float fFloatValue3 = ((Float) trimPathContent2.d.f()).floatValue() / f2;
                float fFloatValue4 = ((Float) trimPathContent2.f9642e.f()).floatValue() / f2;
                float fFloatValue5 = ((Float) trimPathContent2.f.f()).floatValue() / 360.0f;
                if (fFloatValue3 >= 0.01f || fFloatValue4 <= 0.99f) {
                    PathMeasure pathMeasure = baseStrokeContent.f9560a;
                    pathMeasure.setPath(path, z2);
                    float length = pathMeasure.getLength();
                    while (pathMeasure.nextContour()) {
                        length = pathMeasure.getLength() + length;
                    }
                    float f3 = fFloatValue5 * length;
                    float f4 = (fFloatValue3 * length) + f3;
                    float fMin = Math.min((fFloatValue4 * length) + f3, (f4 + length) - 1.0f);
                    int size3 = arrayList3.size() - i4;
                    float f5 = 0.0f;
                    while (size3 >= 0) {
                        int i7 = i4;
                        Path path2 = baseStrokeContent.f9562c;
                        path2.set(((PathContent) arrayList3.get(size3)).u());
                        path2.transform(matrix);
                        pathMeasure.setPath(path2, z2);
                        float length2 = pathMeasure.getLength();
                        if (fMin > length) {
                            float f6 = fMin - length;
                            if (f6 >= f5 + length2 || f5 >= f6) {
                                f = f5 + length2;
                                if (f < f4 && f5 <= fMin) {
                                    if (f > fMin || f4 >= f5) {
                                        Utils.a(path2, f4 < f5 ? 0.0f : (f4 - f5) / length2, fMin > f ? 1.0f : (fMin - f5) / length2, 0.0f);
                                        canvas.drawPath(path2, lPaint);
                                    } else {
                                        canvas.drawPath(path2, lPaint);
                                    }
                                }
                            } else {
                                Utils.a(path2, f4 > length ? (f4 - length) / length2 : 0.0f, Math.min(f6 / length2, 1.0f), 0.0f);
                                canvas.drawPath(path2, lPaint);
                            }
                        } else {
                            f = f5 + length2;
                            if (f < f4) {
                            }
                        }
                        f5 += length2;
                        size3--;
                        baseStrokeContent = this;
                        i4 = i7;
                        z2 = false;
                    }
                    i3 = i4;
                    L.a();
                } else {
                    canvas.drawPath(path, lPaint);
                    L.a();
                    i3 = i4;
                }
            } else {
                i3 = i4;
                path.reset();
                for (int size4 = arrayList3.size() - 1; size4 >= 0; size4--) {
                    path.addPath(((PathContent) arrayList3.get(size4)).u(), matrix);
                }
                L.a();
                canvas.drawPath(path, lPaint);
                L.a();
            }
            i6++;
            baseStrokeContent = this;
            i4 = i3;
            z2 = false;
            f2 = 100.0f;
        }
    }
}
