package com.airbnb.lottie.model.content;

import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.content.Content;
import com.airbnb.lottie.animation.content.RectangleContent;
import com.airbnb.lottie.model.animatable.AnimatableFloatValue;
import com.airbnb.lottie.model.animatable.AnimatablePointValue;
import com.airbnb.lottie.model.animatable.AnimatableValue;
import com.airbnb.lottie.model.layer.BaseLayer;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes.dex */
public class RectangleShape implements ContentModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AnimatableValue f9785b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AnimatablePointValue f9786c;
    public final AnimatableFloatValue d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f9787e;

    public RectangleShape(String str, AnimatableValue animatableValue, AnimatablePointValue animatablePointValue, AnimatableFloatValue animatableFloatValue, boolean z2) {
        this.f9784a = str;
        this.f9785b = animatableValue;
        this.f9786c = animatablePointValue;
        this.d = animatableFloatValue;
        this.f9787e = z2;
    }

    @Override // com.airbnb.lottie.model.content.ContentModel
    public final Content a(LottieDrawable lottieDrawable, BaseLayer baseLayer) {
        return new RectangleContent(lottieDrawable, baseLayer, this);
    }

    public final String toString() {
        return "RectangleShape{position=" + this.f9785b + ", size=" + this.f9786c + AbstractJsonLexerKt.END_OBJ;
    }
}
