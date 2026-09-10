package com.airbnb.lottie.model.content;

import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.content.Content;
import com.airbnb.lottie.animation.content.EllipseContent;
import com.airbnb.lottie.model.animatable.AnimatablePointValue;
import com.airbnb.lottie.model.animatable.AnimatableValue;
import com.airbnb.lottie.model.layer.BaseLayer;

/* JADX INFO: loaded from: classes.dex */
public class CircleShape implements ContentModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AnimatableValue f9752b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AnimatablePointValue f9753c;
    public final boolean d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f9754e;

    public CircleShape(String str, AnimatableValue animatableValue, AnimatablePointValue animatablePointValue, boolean z2, boolean z3) {
        this.f9751a = str;
        this.f9752b = animatableValue;
        this.f9753c = animatablePointValue;
        this.d = z2;
        this.f9754e = z3;
    }

    @Override // com.airbnb.lottie.model.content.ContentModel
    public final Content a(LottieDrawable lottieDrawable, BaseLayer baseLayer) {
        return new EllipseContent(lottieDrawable, baseLayer, this);
    }
}
