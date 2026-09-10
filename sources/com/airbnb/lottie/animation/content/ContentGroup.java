package com.airbnb.lottie.animation.content;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.LPaint;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.TransformKeyframeAnimation;
import com.airbnb.lottie.model.KeyPath;
import com.airbnb.lottie.model.KeyPathElement;
import com.airbnb.lottie.model.animatable.AnimatableTransform;
import com.airbnb.lottie.model.content.ContentModel;
import com.airbnb.lottie.model.content.ShapeGroup;
import com.airbnb.lottie.model.layer.BaseLayer;
import com.airbnb.lottie.utils.Utils;
import com.airbnb.lottie.value.LottieValueCallback;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class ContentGroup implements DrawingContent, PathContent, BaseKeyframeAnimation.AnimationListener, KeyPathElement {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LPaint f9572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RectF f9573b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Matrix f9574c;
    public final Path d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final RectF f9575e;
    public final String f;
    public final boolean g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f9576h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final LottieDrawable f9577i;
    public ArrayList j;
    public final TransformKeyframeAnimation k;

    public ContentGroup(LottieDrawable lottieDrawable, BaseLayer baseLayer, ShapeGroup shapeGroup) {
        AnimatableTransform animatableTransform;
        String str = shapeGroup.f9800a;
        List list = shapeGroup.f9801b;
        ArrayList arrayList = new ArrayList(list.size());
        int i2 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            Content contentA = ((ContentModel) list.get(i3)).a(lottieDrawable, baseLayer);
            if (contentA != null) {
                arrayList.add(contentA);
            }
        }
        while (true) {
            if (i2 >= list.size()) {
                animatableTransform = null;
                break;
            }
            ContentModel contentModel = (ContentModel) list.get(i2);
            if (contentModel instanceof AnimatableTransform) {
                animatableTransform = (AnimatableTransform) contentModel;
                break;
            }
            i2++;
        }
        this(lottieDrawable, baseLayer, str, shapeGroup.f9802c, arrayList, animatableTransform);
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener
    public final void a() {
        this.f9577i.invalidateSelf();
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public final void b(List list, List list2) {
        int size = list.size();
        ArrayList arrayList = this.f9576h;
        ArrayList arrayList2 = new ArrayList(arrayList.size() + size);
        arrayList2.addAll(list);
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            Content content = (Content) arrayList.get(size2);
            content.b(arrayList2, arrayList.subList(0, size2));
            arrayList2.add(content);
        }
    }

    @Override // com.airbnb.lottie.model.KeyPathElement
    public final void d(ColorFilter colorFilter, LottieValueCallback lottieValueCallback) {
        TransformKeyframeAnimation transformKeyframeAnimation = this.k;
        if (transformKeyframeAnimation != null) {
            transformKeyframeAnimation.c(colorFilter, lottieValueCallback);
        }
    }

    @Override // com.airbnb.lottie.model.KeyPathElement
    public final void e(KeyPath keyPath, int i2, ArrayList arrayList, KeyPath keyPath2) {
        String str = this.f;
        if (!keyPath.c(i2, str) && !"__container".equals(str)) {
            return;
        }
        if (!"__container".equals(str)) {
            KeyPath keyPath3 = new KeyPath(keyPath2);
            keyPath3.f9728a.add(str);
            if (keyPath.a(i2, str)) {
                KeyPath keyPath4 = new KeyPath(keyPath3);
                keyPath4.f9729b = this;
                arrayList.add(keyPath4);
            }
            keyPath2 = keyPath3;
        }
        if (!keyPath.d(i2, str)) {
            return;
        }
        int iB = keyPath.b(i2, str) + i2;
        int i3 = 0;
        while (true) {
            ArrayList arrayList2 = this.f9576h;
            if (i3 >= arrayList2.size()) {
                return;
            }
            Content content = (Content) arrayList2.get(i3);
            if (content instanceof KeyPathElement) {
                ((KeyPathElement) content).e(keyPath, iB, arrayList, keyPath2);
            }
            i3++;
        }
    }

    @Override // com.airbnb.lottie.animation.content.DrawingContent
    public final void f(RectF rectF, Matrix matrix, boolean z2) {
        Matrix matrix2 = this.f9574c;
        matrix2.set(matrix);
        TransformKeyframeAnimation transformKeyframeAnimation = this.k;
        if (transformKeyframeAnimation != null) {
            matrix2.preConcat(transformKeyframeAnimation.e());
        }
        RectF rectF2 = this.f9575e;
        rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
        ArrayList arrayList = this.f9576h;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Content content = (Content) arrayList.get(size);
            if (content instanceof DrawingContent) {
                ((DrawingContent) content).f(rectF2, matrix2, z2);
                rectF.union(rectF2);
            }
        }
    }

    public final List g() {
        if (this.j == null) {
            this.j = new ArrayList();
            int i2 = 0;
            while (true) {
                ArrayList arrayList = this.f9576h;
                if (i2 >= arrayList.size()) {
                    break;
                }
                Content content = (Content) arrayList.get(i2);
                if (content instanceof PathContent) {
                    this.j.add((PathContent) content);
                }
                i2++;
            }
        }
        return this.j;
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public final String getName() {
        throw null;
    }

    @Override // com.airbnb.lottie.animation.content.DrawingContent
    public final void h(Canvas canvas, Matrix matrix, int i2) {
        if (this.g) {
            return;
        }
        Matrix matrix2 = this.f9574c;
        matrix2.set(matrix);
        TransformKeyframeAnimation transformKeyframeAnimation = this.k;
        if (transformKeyframeAnimation != null) {
            matrix2.preConcat(transformKeyframeAnimation.e());
            BaseKeyframeAnimation baseKeyframeAnimation = transformKeyframeAnimation.j;
            i2 = (int) (((((baseKeyframeAnimation == null ? 100 : ((Integer) baseKeyframeAnimation.f()).intValue()) / 100.0f) * i2) / 255.0f) * 255.0f);
        }
        boolean z2 = this.f9577i.v0;
        ArrayList arrayList = this.f9576h;
        boolean z3 = false;
        if (z2) {
            int i3 = 0;
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                if ((arrayList.get(i4) instanceof DrawingContent) && (i3 = i3 + 1) >= 2) {
                    if (i2 == 255) {
                        break;
                    }
                    z3 = true;
                    break;
                }
            }
        }
        if (z3) {
            RectF rectF = this.f9573b;
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
            f(rectF, matrix2, true);
            LPaint lPaint = this.f9572a;
            lPaint.setAlpha(i2);
            Utils.e(canvas, rectF, lPaint);
        }
        if (z3) {
            i2 = 255;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Object obj = arrayList.get(size);
            if (obj instanceof DrawingContent) {
                ((DrawingContent) obj).h(canvas, matrix2, i2);
            }
        }
        if (z3) {
            canvas.restore();
        }
    }

    @Override // com.airbnb.lottie.animation.content.PathContent
    public final Path u() {
        Matrix matrix = this.f9574c;
        matrix.reset();
        TransformKeyframeAnimation transformKeyframeAnimation = this.k;
        if (transformKeyframeAnimation != null) {
            matrix.set(transformKeyframeAnimation.e());
        }
        Path path = this.d;
        path.reset();
        if (!this.g) {
            ArrayList arrayList = this.f9576h;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                Content content = (Content) arrayList.get(size);
                if (content instanceof PathContent) {
                    path.addPath(((PathContent) content).u(), matrix);
                }
            }
        }
        return path;
    }

    public ContentGroup(LottieDrawable lottieDrawable, BaseLayer baseLayer, String str, boolean z2, ArrayList arrayList, AnimatableTransform animatableTransform) {
        this.f9572a = new LPaint();
        this.f9573b = new RectF();
        this.f9574c = new Matrix();
        this.d = new Path();
        this.f9575e = new RectF();
        this.f = str;
        this.f9577i = lottieDrawable;
        this.g = z2;
        this.f9576h = arrayList;
        if (animatableTransform != null) {
            TransformKeyframeAnimation transformKeyframeAnimation = new TransformKeyframeAnimation(animatableTransform);
            this.k = transformKeyframeAnimation;
            transformKeyframeAnimation.a(baseLayer);
            transformKeyframeAnimation.b(this);
        }
        ArrayList arrayList2 = new ArrayList();
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Content content = (Content) arrayList.get(size);
            if (content instanceof GreedyContent) {
                arrayList2.add((GreedyContent) content);
            }
        }
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ((GreedyContent) arrayList2.get(size2)).g(arrayList.listIterator(arrayList.size()));
        }
    }
}
