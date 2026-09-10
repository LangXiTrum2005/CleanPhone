package com.airbnb.lottie.model.content;

import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.content.Content;
import com.airbnb.lottie.animation.content.RoundedCornersContent;
import com.airbnb.lottie.model.animatable.AnimatableFloatValue;
import com.airbnb.lottie.model.layer.BaseLayer;

/* JADX INFO: loaded from: classes.dex */
public class RoundedCorners implements ContentModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AnimatableFloatValue f9792a;

    public RoundedCorners(String str, AnimatableFloatValue animatableFloatValue) {
        this.f9792a = animatableFloatValue;
    }

    @Override // com.airbnb.lottie.model.content.ContentModel
    public final Content a(LottieDrawable lottieDrawable, BaseLayer baseLayer) {
        return new RoundedCornersContent(lottieDrawable, baseLayer, this);
    }
}
