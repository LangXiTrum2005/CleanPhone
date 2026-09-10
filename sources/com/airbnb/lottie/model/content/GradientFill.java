package com.airbnb.lottie.model.content;

import android.graphics.Path;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.content.Content;
import com.airbnb.lottie.animation.content.GradientFillContent;
import com.airbnb.lottie.model.animatable.AnimatableGradientColorValue;
import com.airbnb.lottie.model.animatable.AnimatableIntegerValue;
import com.airbnb.lottie.model.animatable.AnimatablePointValue;
import com.airbnb.lottie.model.layer.BaseLayer;

/* JADX INFO: loaded from: classes.dex */
public class GradientFill implements ContentModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GradientType f9757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Path.FillType f9758b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AnimatableGradientColorValue f9759c;
    public final AnimatableIntegerValue d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AnimatablePointValue f9760e;
    public final AnimatablePointValue f;
    public final String g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f9761h;

    public GradientFill(String str, GradientType gradientType, Path.FillType fillType, AnimatableGradientColorValue animatableGradientColorValue, AnimatableIntegerValue animatableIntegerValue, AnimatablePointValue animatablePointValue, AnimatablePointValue animatablePointValue2, boolean z2) {
        this.f9757a = gradientType;
        this.f9758b = fillType;
        this.f9759c = animatableGradientColorValue;
        this.d = animatableIntegerValue;
        this.f9760e = animatablePointValue;
        this.f = animatablePointValue2;
        this.g = str;
        this.f9761h = z2;
    }

    @Override // com.airbnb.lottie.model.content.ContentModel
    public final Content a(LottieDrawable lottieDrawable, BaseLayer baseLayer) {
        return new GradientFillContent(lottieDrawable, baseLayer, this);
    }
}
