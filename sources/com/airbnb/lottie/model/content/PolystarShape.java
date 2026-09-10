package com.airbnb.lottie.model.content;

import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.content.Content;
import com.airbnb.lottie.animation.content.PolystarContent;
import com.airbnb.lottie.model.animatable.AnimatableFloatValue;
import com.airbnb.lottie.model.animatable.AnimatableValue;
import com.airbnb.lottie.model.layer.BaseLayer;

/* JADX INFO: loaded from: classes.dex */
public class PolystarShape implements ContentModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Type f9778b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AnimatableFloatValue f9779c;
    public final AnimatableValue d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AnimatableFloatValue f9780e;
    public final AnimatableFloatValue f;
    public final AnimatableFloatValue g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AnimatableFloatValue f9781h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AnimatableFloatValue f9782i;
    public final boolean j;
    public final boolean k;

    public enum Type {
        STAR(1),
        /* JADX INFO: Fake field, exist only in values array */
        POLYGON(2);

        public final int X;

        Type(int i2) {
            this.X = i2;
        }
    }

    public PolystarShape(String str, Type type, AnimatableFloatValue animatableFloatValue, AnimatableValue animatableValue, AnimatableFloatValue animatableFloatValue2, AnimatableFloatValue animatableFloatValue3, AnimatableFloatValue animatableFloatValue4, AnimatableFloatValue animatableFloatValue5, AnimatableFloatValue animatableFloatValue6, boolean z2, boolean z3) {
        this.f9777a = str;
        this.f9778b = type;
        this.f9779c = animatableFloatValue;
        this.d = animatableValue;
        this.f9780e = animatableFloatValue2;
        this.f = animatableFloatValue3;
        this.g = animatableFloatValue4;
        this.f9781h = animatableFloatValue5;
        this.f9782i = animatableFloatValue6;
        this.j = z2;
        this.k = z3;
    }

    @Override // com.airbnb.lottie.model.content.ContentModel
    public final Content a(LottieDrawable lottieDrawable, BaseLayer baseLayer) {
        return new PolystarContent(lottieDrawable, baseLayer, this);
    }
}
