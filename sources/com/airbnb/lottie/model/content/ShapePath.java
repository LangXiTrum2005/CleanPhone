package com.airbnb.lottie.model.content;

import android.support.v4.media.a;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.content.Content;
import com.airbnb.lottie.animation.content.ShapeContent;
import com.airbnb.lottie.model.animatable.AnimatableShapeValue;
import com.airbnb.lottie.model.layer.BaseLayer;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes.dex */
public class ShapePath implements ContentModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f9804b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AnimatableShapeValue f9805c;
    public final boolean d;

    public ShapePath(String str, int i2, AnimatableShapeValue animatableShapeValue, boolean z2) {
        this.f9803a = str;
        this.f9804b = i2;
        this.f9805c = animatableShapeValue;
        this.d = z2;
    }

    @Override // com.airbnb.lottie.model.content.ContentModel
    public final Content a(LottieDrawable lottieDrawable, BaseLayer baseLayer) {
        return new ShapeContent(lottieDrawable, baseLayer, this);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShapePath{name=");
        sb.append(this.f9803a);
        sb.append(", index=");
        return a.p(sb, this.f9804b, AbstractJsonLexerKt.END_OBJ);
    }
}
