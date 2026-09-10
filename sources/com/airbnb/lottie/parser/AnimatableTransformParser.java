package com.airbnb.lottie.parser;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.model.animatable.AnimatableFloatValue;
import com.airbnb.lottie.model.animatable.AnimatableIntegerValue;
import com.airbnb.lottie.model.animatable.AnimatablePathValue;
import com.airbnb.lottie.model.animatable.AnimatableScaleValue;
import com.airbnb.lottie.model.animatable.AnimatableSplitDimensionPathValue;
import com.airbnb.lottie.model.animatable.AnimatableTransform;
import com.airbnb.lottie.model.animatable.AnimatableValue;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.airbnb.lottie.value.Keyframe;
import com.airbnb.lottie.value.ScaleXY;

/* JADX INFO: loaded from: classes.dex */
public class AnimatableTransformParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final JsonReader.Options f9877a = JsonReader.Options.a("a", "p", "s", "rz", "r", "o", "so", "eo", "sk", "sa");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final JsonReader.Options f9878b = JsonReader.Options.a("k");

    /* JADX WARN: Code duplicated, block: B:72:0x017e  */
    public static AnimatableTransform a(JsonReader jsonReader, LottieComposition lottieComposition) {
        AnimatableScaleValue animatableScaleValue;
        boolean z2 = jsonReader.H() == JsonReader.Token.Z;
        if (z2) {
            jsonReader.h();
        }
        AnimatableFloatValue animatableFloatValue = null;
        AnimatablePathValue animatablePathValueA = null;
        AnimatableValue animatableValueB = null;
        AnimatableScaleValue animatableScaleValue2 = null;
        AnimatableFloatValue animatableFloatValueB = null;
        AnimatableFloatValue animatableFloatValueB2 = null;
        AnimatableIntegerValue animatableIntegerValueC = null;
        AnimatableFloatValue animatableFloatValueB3 = null;
        AnimatableFloatValue animatableFloatValueB4 = null;
        while (jsonReader.m()) {
            switch (jsonReader.J(f9877a)) {
                case 0:
                    jsonReader.h();
                    while (jsonReader.m()) {
                        if (jsonReader.J(f9878b) != 0) {
                            jsonReader.K();
                            jsonReader.P();
                        } else {
                            animatablePathValueA = AnimatablePathValueParser.a(jsonReader, lottieComposition);
                        }
                    }
                    jsonReader.l();
                    continue;
                case 1:
                    animatableValueB = AnimatablePathValueParser.b(jsonReader, lottieComposition);
                    continue;
                case 2:
                    animatableScaleValue2 = new AnimatableScaleValue(KeyframesParser.a(jsonReader, lottieComposition, 1.0f, ScaleXYParser.f9925a, false));
                    continue;
                case 3:
                    lottieComposition.a("Lottie doesn't support 3D layers.");
                    break;
                case 4:
                    break;
                case 5:
                    animatableIntegerValueC = AnimatableValueParser.c(jsonReader, lottieComposition);
                    continue;
                case 6:
                    animatableFloatValueB3 = AnimatableValueParser.b(jsonReader, lottieComposition, false);
                    continue;
                case 7:
                    animatableFloatValueB4 = AnimatableValueParser.b(jsonReader, lottieComposition, false);
                    continue;
                case 8:
                    animatableFloatValueB = AnimatableValueParser.b(jsonReader, lottieComposition, false);
                    continue;
                case 9:
                    animatableFloatValueB2 = AnimatableValueParser.b(jsonReader, lottieComposition, false);
                    continue;
                default:
                    jsonReader.K();
                    jsonReader.P();
                    continue;
            }
            AnimatableFloatValue animatableFloatValueB5 = AnimatableValueParser.b(jsonReader, lottieComposition, false);
            if (animatableFloatValueB5.h().isEmpty()) {
                animatableFloatValueB5.h().add(new Keyframe(lottieComposition, Float.valueOf(0.0f), Float.valueOf(0.0f), (Interpolator) null, 0.0f, Float.valueOf(lottieComposition.f9520l)));
            } else if (((Keyframe) animatableFloatValueB5.h().get(0)).f9951b == null) {
                animatableFloatValueB5.h().set(0, new Keyframe(lottieComposition, Float.valueOf(0.0f), Float.valueOf(0.0f), (Interpolator) null, 0.0f, Float.valueOf(lottieComposition.f9520l)));
            }
            animatableFloatValue = animatableFloatValueB5;
        }
        if (z2) {
            jsonReader.l();
        }
        AnimatablePathValue animatablePathValue = (animatablePathValueA == null || (animatablePathValueA.f() && ((PointF) ((Keyframe) animatablePathValueA.f9737a.get(0)).f9951b).equals(0.0f, 0.0f))) ? null : animatablePathValueA;
        if (animatableValueB == null || (!(animatableValueB instanceof AnimatableSplitDimensionPathValue) && animatableValueB.f() && ((PointF) ((Keyframe) animatableValueB.h().get(0)).f9951b).equals(0.0f, 0.0f))) {
            animatableValueB = null;
        }
        AnimatableFloatValue animatableFloatValue2 = (animatableFloatValue == null || (animatableFloatValue.f() && ((Float) ((Keyframe) animatableFloatValue.h().get(0)).f9951b).floatValue() == 0.0f)) ? null : animatableFloatValue;
        if (animatableScaleValue2 == null) {
            animatableScaleValue = null;
        } else {
            if (animatableScaleValue2.f()) {
                ScaleXY scaleXY = (ScaleXY) ((Keyframe) animatableScaleValue2.h().get(0)).f9951b;
                if (scaleXY.f9965a == 1.0f && scaleXY.f9966b == 1.0f) {
                    animatableScaleValue = null;
                }
            }
            animatableScaleValue = animatableScaleValue2;
        }
        return new AnimatableTransform(animatablePathValue, animatableValueB, animatableScaleValue, animatableFloatValue2, animatableIntegerValueC, animatableFloatValueB3, animatableFloatValueB4, (animatableFloatValueB == null || (animatableFloatValueB.f() && ((Float) ((Keyframe) animatableFloatValueB.h().get(0)).f9951b).floatValue() == 0.0f)) ? null : animatableFloatValueB, (animatableFloatValueB2 == null || (animatableFloatValueB2.f() && ((Float) ((Keyframe) animatableFloatValueB2.h().get(0)).f9951b).floatValue() == 0.0f)) ? null : animatableFloatValueB2);
    }
}
