package com.airbnb.lottie.model.content;

import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.content.Content;
import com.airbnb.lottie.animation.content.StrokeContent;
import com.airbnb.lottie.model.animatable.AnimatableColorValue;
import com.airbnb.lottie.model.animatable.AnimatableFloatValue;
import com.airbnb.lottie.model.animatable.AnimatableIntegerValue;
import com.airbnb.lottie.model.layer.BaseLayer;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class ShapeStroke implements ContentModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AnimatableFloatValue f9807b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f9808c;
    public final AnimatableColorValue d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AnimatableIntegerValue f9809e;
    public final AnimatableFloatValue f;
    public final LineCapType g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final LineJoinType f9810h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f9811i;
    public final boolean j;

    /* JADX INFO: renamed from: com.airbnb.lottie.model.content.ShapeStroke$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9812a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f9813b;

        static {
            int[] iArr = new int[LineJoinType.values().length];
            f9813b = iArr;
            try {
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9813b[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9813b[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[LineCapType.values().length];
            f9812a = iArr2;
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f9812a[1] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f9812a[2] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class LineCapType {
        public static final /* synthetic */ LineCapType[] X = {new LineCapType("BUTT", 0), new LineCapType("ROUND", 1), new LineCapType("UNKNOWN", 2)};

        /* JADX INFO: Fake field, exist only in values array */
        LineCapType EF5;

        public static LineCapType valueOf(String str) {
            return (LineCapType) Enum.valueOf(LineCapType.class, str);
        }

        public static LineCapType[] values() {
            return (LineCapType[]) X.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class LineJoinType {
        public static final /* synthetic */ LineJoinType[] X = {new LineJoinType("MITER", 0), new LineJoinType("ROUND", 1), new LineJoinType("BEVEL", 2)};

        /* JADX INFO: Fake field, exist only in values array */
        LineJoinType EF5;

        public static LineJoinType valueOf(String str) {
            return (LineJoinType) Enum.valueOf(LineJoinType.class, str);
        }

        public static LineJoinType[] values() {
            return (LineJoinType[]) X.clone();
        }
    }

    public ShapeStroke(String str, AnimatableFloatValue animatableFloatValue, ArrayList arrayList, AnimatableColorValue animatableColorValue, AnimatableIntegerValue animatableIntegerValue, AnimatableFloatValue animatableFloatValue2, LineCapType lineCapType, LineJoinType lineJoinType, float f, boolean z2) {
        this.f9806a = str;
        this.f9807b = animatableFloatValue;
        this.f9808c = arrayList;
        this.d = animatableColorValue;
        this.f9809e = animatableIntegerValue;
        this.f = animatableFloatValue2;
        this.g = lineCapType;
        this.f9810h = lineJoinType;
        this.f9811i = f;
        this.j = z2;
    }

    @Override // com.airbnb.lottie.model.content.ContentModel
    public final Content a(LottieDrawable lottieDrawable, BaseLayer baseLayer) {
        return new StrokeContent(lottieDrawable, baseLayer, this);
    }
}
