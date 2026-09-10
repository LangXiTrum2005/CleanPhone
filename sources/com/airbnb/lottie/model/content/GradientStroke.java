package com.airbnb.lottie.model.content;

import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.content.Content;
import com.airbnb.lottie.animation.content.GradientStrokeContent;
import com.airbnb.lottie.model.animatable.AnimatableFloatValue;
import com.airbnb.lottie.model.animatable.AnimatableGradientColorValue;
import com.airbnb.lottie.model.animatable.AnimatableIntegerValue;
import com.airbnb.lottie.model.animatable.AnimatablePointValue;
import com.airbnb.lottie.model.layer.BaseLayer;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class GradientStroke implements ContentModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final GradientType f9763b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AnimatableGradientColorValue f9764c;
    public final AnimatableIntegerValue d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AnimatablePointValue f9765e;
    public final AnimatablePointValue f;
    public final AnimatableFloatValue g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ShapeStroke.LineCapType f9766h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ShapeStroke.LineJoinType f9767i;
    public final float j;
    public final ArrayList k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final AnimatableFloatValue f9768l;
    public final boolean m;

    public GradientStroke(String str, GradientType gradientType, AnimatableGradientColorValue animatableGradientColorValue, AnimatableIntegerValue animatableIntegerValue, AnimatablePointValue animatablePointValue, AnimatablePointValue animatablePointValue2, AnimatableFloatValue animatableFloatValue, ShapeStroke.LineCapType lineCapType, ShapeStroke.LineJoinType lineJoinType, float f, ArrayList arrayList, AnimatableFloatValue animatableFloatValue2, boolean z2) {
        this.f9762a = str;
        this.f9763b = gradientType;
        this.f9764c = animatableGradientColorValue;
        this.d = animatableIntegerValue;
        this.f9765e = animatablePointValue;
        this.f = animatablePointValue2;
        this.g = animatableFloatValue;
        this.f9766h = lineCapType;
        this.f9767i = lineJoinType;
        this.j = f;
        this.k = arrayList;
        this.f9768l = animatableFloatValue2;
        this.m = z2;
    }

    @Override // com.airbnb.lottie.model.content.ContentModel
    public final Content a(LottieDrawable lottieDrawable, BaseLayer baseLayer) {
        return new GradientStrokeContent(lottieDrawable, baseLayer, this);
    }
}
