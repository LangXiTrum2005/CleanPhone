package com.airbnb.lottie.model.content;

import android.graphics.Path;
import androidx.media3.extractor.text.ttml.a;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.content.Content;
import com.airbnb.lottie.animation.content.FillContent;
import com.airbnb.lottie.model.animatable.AnimatableColorValue;
import com.airbnb.lottie.model.animatable.AnimatableIntegerValue;
import com.airbnb.lottie.model.layer.BaseLayer;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes.dex */
public class ShapeFill implements ContentModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f9796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Path.FillType f9797b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f9798c;
    public final AnimatableColorValue d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AnimatableIntegerValue f9799e;
    public final boolean f;

    public ShapeFill(String str, boolean z2, Path.FillType fillType, AnimatableColorValue animatableColorValue, AnimatableIntegerValue animatableIntegerValue, boolean z3) {
        this.f9798c = str;
        this.f9796a = z2;
        this.f9797b = fillType;
        this.d = animatableColorValue;
        this.f9799e = animatableIntegerValue;
        this.f = z3;
    }

    @Override // com.airbnb.lottie.model.content.ContentModel
    public final Content a(LottieDrawable lottieDrawable, BaseLayer baseLayer) {
        return new FillContent(lottieDrawable, baseLayer, this);
    }

    public final String toString() {
        return a.r(new StringBuilder("ShapeFill{color=, fillEnabled="), this.f9796a, AbstractJsonLexerKt.END_OBJ);
    }
}
