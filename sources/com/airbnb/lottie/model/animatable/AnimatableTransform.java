package com.airbnb.lottie.model.animatable;

import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.content.Content;
import com.airbnb.lottie.animation.content.ModifierContent;
import com.airbnb.lottie.model.content.ContentModel;
import com.airbnb.lottie.model.layer.BaseLayer;

/* JADX INFO: loaded from: classes.dex */
public class AnimatableTransform implements ModifierContent, ContentModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AnimatablePathValue f9743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AnimatableValue f9744b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AnimatableScaleValue f9745c;
    public final AnimatableFloatValue d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AnimatableIntegerValue f9746e;
    public final AnimatableFloatValue f;
    public final AnimatableFloatValue g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AnimatableFloatValue f9747h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AnimatableFloatValue f9748i;

    public AnimatableTransform(AnimatablePathValue animatablePathValue, AnimatableValue animatableValue, AnimatableScaleValue animatableScaleValue, AnimatableFloatValue animatableFloatValue, AnimatableIntegerValue animatableIntegerValue, AnimatableFloatValue animatableFloatValue2, AnimatableFloatValue animatableFloatValue3, AnimatableFloatValue animatableFloatValue4, AnimatableFloatValue animatableFloatValue5) {
        this.f9743a = animatablePathValue;
        this.f9744b = animatableValue;
        this.f9745c = animatableScaleValue;
        this.d = animatableFloatValue;
        this.f9746e = animatableIntegerValue;
        this.f9747h = animatableFloatValue2;
        this.f9748i = animatableFloatValue3;
        this.f = animatableFloatValue4;
        this.g = animatableFloatValue5;
    }

    @Override // com.airbnb.lottie.model.content.ContentModel
    public final Content a(LottieDrawable lottieDrawable, BaseLayer baseLayer) {
        return null;
    }
}
