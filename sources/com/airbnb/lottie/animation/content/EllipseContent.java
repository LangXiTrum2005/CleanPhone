package com.airbnb.lottie.animation.content;

import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.PointF;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.PointKeyframeAnimation;
import com.airbnb.lottie.model.KeyPath;
import com.airbnb.lottie.model.content.CircleShape;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.model.layer.BaseLayer;
import com.airbnb.lottie.utils.MiscUtils;
import com.airbnb.lottie.value.LottieValueCallback;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class EllipseContent implements PathContent, BaseKeyframeAnimation.AnimationListener, KeyPathElementContent {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9579b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LottieDrawable f9580c;
    public final PointKeyframeAnimation d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final BaseKeyframeAnimation f9581e;
    public final CircleShape f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f9582h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f9578a = new Path();
    public final CompoundTrimPathContent g = new CompoundTrimPathContent();

    public EllipseContent(LottieDrawable lottieDrawable, BaseLayer baseLayer, CircleShape circleShape) {
        this.f9579b = circleShape.f9751a;
        this.f9580c = lottieDrawable;
        BaseKeyframeAnimation baseKeyframeAnimationG = circleShape.f9753c.g();
        this.d = (PointKeyframeAnimation) baseKeyframeAnimationG;
        BaseKeyframeAnimation baseKeyframeAnimationG2 = circleShape.f9752b.g();
        this.f9581e = baseKeyframeAnimationG2;
        this.f = circleShape;
        baseLayer.g(baseKeyframeAnimationG);
        baseLayer.g(baseKeyframeAnimationG2);
        baseKeyframeAnimationG.a(this);
        baseKeyframeAnimationG2.a(this);
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener
    public final void a() {
        this.f9582h = false;
        this.f9580c.invalidateSelf();
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public final void b(List list, List list2) {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) list;
            if (i2 >= arrayList.size()) {
                return;
            }
            Content content = (Content) arrayList.get(i2);
            if (content instanceof TrimPathContent) {
                TrimPathContent trimPathContent = (TrimPathContent) content;
                if (trimPathContent.f9641c == ShapeTrimPath.Type.X) {
                    this.g.f9571a.add(trimPathContent);
                    trimPathContent.d(this);
                }
            }
            i2++;
        }
    }

    @Override // com.airbnb.lottie.model.KeyPathElement
    public final void d(ColorFilter colorFilter, LottieValueCallback lottieValueCallback) {
        if (colorFilter == LottieProperty.f) {
            this.d.k(lottieValueCallback);
        } else if (colorFilter == LottieProperty.f9540i) {
            this.f9581e.k(lottieValueCallback);
        }
    }

    @Override // com.airbnb.lottie.model.KeyPathElement
    public final void e(KeyPath keyPath, int i2, ArrayList arrayList, KeyPath keyPath2) {
        MiscUtils.f(keyPath, i2, arrayList, keyPath2, this);
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public final String getName() {
        return this.f9579b;
    }

    @Override // com.airbnb.lottie.animation.content.PathContent
    public final Path u() {
        boolean z2 = this.f9582h;
        Path path = this.f9578a;
        if (z2) {
            return path;
        }
        path.reset();
        CircleShape circleShape = this.f;
        if (circleShape.f9754e) {
            this.f9582h = true;
            return path;
        }
        PointF pointF = (PointF) this.d.f();
        float f = pointF.x / 2.0f;
        float f2 = pointF.y / 2.0f;
        float f3 = f * 0.55228f;
        float f4 = f2 * 0.55228f;
        path.reset();
        if (circleShape.d) {
            float f5 = -f2;
            path.moveTo(0.0f, f5);
            float f6 = 0.0f - f3;
            float f7 = -f;
            float f8 = 0.0f - f4;
            path.cubicTo(f6, f5, f7, f8, f7, 0.0f);
            float f9 = f4 + 0.0f;
            path.cubicTo(f7, f9, f6, f2, 0.0f, f2);
            float f10 = f3 + 0.0f;
            path.cubicTo(f10, f2, f, f9, f, 0.0f);
            path.cubicTo(f, f8, f10, f5, 0.0f, f5);
        } else {
            float f11 = -f2;
            path.moveTo(0.0f, f11);
            float f12 = f3 + 0.0f;
            float f13 = 0.0f - f4;
            path.cubicTo(f12, f11, f, f13, f, 0.0f);
            float f14 = f4 + 0.0f;
            path.cubicTo(f, f14, f12, f2, 0.0f, f2);
            float f15 = 0.0f - f3;
            float f16 = -f;
            path.cubicTo(f15, f2, f16, f14, f16, 0.0f);
            path.cubicTo(f16, f13, f15, f11, 0.0f, f11);
        }
        PointF pointF2 = (PointF) this.f9581e.f();
        path.offset(pointF2.x, pointF2.y);
        path.close();
        this.g.a(path);
        this.f9582h = true;
        return path;
    }
}
