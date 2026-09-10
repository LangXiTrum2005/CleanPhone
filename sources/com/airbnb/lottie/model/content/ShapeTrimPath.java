package com.airbnb.lottie.model.content;

import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.content.Content;
import com.airbnb.lottie.animation.content.TrimPathContent;
import com.airbnb.lottie.model.animatable.AnimatableFloatValue;
import com.airbnb.lottie.model.layer.BaseLayer;

/* JADX INFO: loaded from: classes.dex */
public class ShapeTrimPath implements ContentModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Type f9814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AnimatableFloatValue f9815b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AnimatableFloatValue f9816c;
    public final AnimatableFloatValue d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f9817e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Type {
        public static final Type X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public static final Type f9818Y;
        public static final /* synthetic */ Type[] Z;

        static {
            Type type = new Type("SIMULTANEOUSLY", 0);
            X = type;
            Type type2 = new Type("INDIVIDUALLY", 1);
            f9818Y = type2;
            Z = new Type[]{type, type2};
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) Z.clone();
        }
    }

    public ShapeTrimPath(String str, Type type, AnimatableFloatValue animatableFloatValue, AnimatableFloatValue animatableFloatValue2, AnimatableFloatValue animatableFloatValue3, boolean z2) {
        this.f9814a = type;
        this.f9815b = animatableFloatValue;
        this.f9816c = animatableFloatValue2;
        this.d = animatableFloatValue3;
        this.f9817e = z2;
    }

    @Override // com.airbnb.lottie.model.content.ContentModel
    public final Content a(LottieDrawable lottieDrawable, BaseLayer baseLayer) {
        return new TrimPathContent(baseLayer, this);
    }

    public final String toString() {
        return "Trim Path: {start: " + this.f9815b + ", end: " + this.f9816c + ", offset: " + this.d + "}";
    }
}
