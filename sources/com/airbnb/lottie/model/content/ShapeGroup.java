package com.airbnb.lottie.model.content;

import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.content.Content;
import com.airbnb.lottie.animation.content.ContentGroup;
import com.airbnb.lottie.model.layer.BaseLayer;
import java.util.Arrays;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes.dex */
public class ShapeGroup implements ContentModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f9801b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f9802c;

    public ShapeGroup(String str, List list, boolean z2) {
        this.f9800a = str;
        this.f9801b = list;
        this.f9802c = z2;
    }

    @Override // com.airbnb.lottie.model.content.ContentModel
    public final Content a(LottieDrawable lottieDrawable, BaseLayer baseLayer) {
        return new ContentGroup(lottieDrawable, baseLayer, this);
    }

    public final String toString() {
        return "ShapeGroup{name='" + this.f9800a + "' Shapes: " + Arrays.toString(this.f9801b.toArray()) + AbstractJsonLexerKt.END_OBJ;
    }
}
