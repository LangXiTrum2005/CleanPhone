package com.airbnb.lottie.animation.content;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.FloatKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.TransformKeyframeAnimation;
import com.airbnb.lottie.model.KeyPath;
import com.airbnb.lottie.model.animatable.AnimatableTransform;
import com.airbnb.lottie.model.content.Repeater;
import com.airbnb.lottie.model.layer.BaseLayer;
import com.airbnb.lottie.utils.MiscUtils;
import com.airbnb.lottie.value.LottieValueCallback;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public class RepeaterContent implements DrawingContent, PathContent, GreedyContent, BaseKeyframeAnimation.AnimationListener, KeyPathElementContent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Matrix f9625a = new Matrix();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Path f9626b = new Path();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LottieDrawable f9627c;
    public final BaseLayer d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f9628e;
    public final boolean f;
    public final FloatKeyframeAnimation g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final FloatKeyframeAnimation f9629h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final TransformKeyframeAnimation f9630i;
    public ContentGroup j;

    public RepeaterContent(LottieDrawable lottieDrawable, BaseLayer baseLayer, Repeater repeater) {
        this.f9627c = lottieDrawable;
        this.d = baseLayer;
        this.f9628e = repeater.f9788a;
        this.f = repeater.f9791e;
        BaseKeyframeAnimation baseKeyframeAnimationG = repeater.f9789b.g();
        this.g = (FloatKeyframeAnimation) baseKeyframeAnimationG;
        baseLayer.g(baseKeyframeAnimationG);
        baseKeyframeAnimationG.a(this);
        BaseKeyframeAnimation baseKeyframeAnimationG2 = repeater.f9790c.g();
        this.f9629h = (FloatKeyframeAnimation) baseKeyframeAnimationG2;
        baseLayer.g(baseKeyframeAnimationG2);
        baseKeyframeAnimationG2.a(this);
        AnimatableTransform animatableTransform = repeater.d;
        animatableTransform.getClass();
        TransformKeyframeAnimation transformKeyframeAnimation = new TransformKeyframeAnimation(animatableTransform);
        this.f9630i = transformKeyframeAnimation;
        transformKeyframeAnimation.a(baseLayer);
        transformKeyframeAnimation.b(this);
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener
    public final void a() {
        this.f9627c.invalidateSelf();
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public final void b(List list, List list2) {
        this.j.b(list, list2);
    }

    @Override // com.airbnb.lottie.model.KeyPathElement
    public final void d(ColorFilter colorFilter, LottieValueCallback lottieValueCallback) {
        if (this.f9630i.c(colorFilter, lottieValueCallback)) {
            return;
        }
        if (colorFilter == LottieProperty.f9543p) {
            this.g.k(lottieValueCallback);
        } else if (colorFilter == LottieProperty.q) {
            this.f9629h.k(lottieValueCallback);
        }
    }

    @Override // com.airbnb.lottie.model.KeyPathElement
    public final void e(KeyPath keyPath, int i2, ArrayList arrayList, KeyPath keyPath2) {
        MiscUtils.f(keyPath, i2, arrayList, keyPath2, this);
    }

    @Override // com.airbnb.lottie.animation.content.DrawingContent
    public final void f(RectF rectF, Matrix matrix, boolean z2) {
        this.j.f(rectF, matrix, z2);
    }

    @Override // com.airbnb.lottie.animation.content.GreedyContent
    public final void g(ListIterator listIterator) {
        if (this.j != null) {
            return;
        }
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        ArrayList arrayList = new ArrayList();
        while (listIterator.hasPrevious()) {
            arrayList.add((Content) listIterator.previous());
            listIterator.remove();
        }
        Collections.reverse(arrayList);
        this.j = new ContentGroup(this.f9627c, this.d, "Repeater", this.f, arrayList, null);
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public final String getName() {
        return this.f9628e;
    }

    @Override // com.airbnb.lottie.animation.content.DrawingContent
    public final void h(Canvas canvas, Matrix matrix, int i2) {
        float fFloatValue = ((Float) this.g.f()).floatValue();
        float fFloatValue2 = ((Float) this.f9629h.f()).floatValue();
        TransformKeyframeAnimation transformKeyframeAnimation = this.f9630i;
        float fFloatValue3 = ((Float) transformKeyframeAnimation.m.f()).floatValue() / 100.0f;
        float fFloatValue4 = ((Float) transformKeyframeAnimation.f9679n.f()).floatValue() / 100.0f;
        for (int i3 = ((int) fFloatValue) - 1; i3 >= 0; i3--) {
            Matrix matrix2 = this.f9625a;
            matrix2.set(matrix);
            float f = i3;
            matrix2.preConcat(transformKeyframeAnimation.f(f + fFloatValue2));
            this.j.h(canvas, matrix2, (int) (MiscUtils.d(fFloatValue3, fFloatValue4, f / fFloatValue) * i2));
        }
    }

    @Override // com.airbnb.lottie.animation.content.PathContent
    public final Path u() {
        Path pathU = this.j.u();
        Path path = this.f9626b;
        path.reset();
        float fFloatValue = ((Float) this.g.f()).floatValue();
        float fFloatValue2 = ((Float) this.f9629h.f()).floatValue();
        for (int i2 = ((int) fFloatValue) - 1; i2 >= 0; i2--) {
            Matrix matrix = this.f9625a;
            matrix.set(this.f9630i.f(i2 + fFloatValue2));
            path.addPath(pathU, matrix);
        }
        return path;
    }
}
