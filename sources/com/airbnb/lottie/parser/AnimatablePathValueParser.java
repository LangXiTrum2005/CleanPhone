package com.airbnb.lottie.parser;

import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.animation.keyframe.PathKeyframe;
import com.airbnb.lottie.model.animatable.AnimatableFloatValue;
import com.airbnb.lottie.model.animatable.AnimatablePathValue;
import com.airbnb.lottie.model.animatable.AnimatableSplitDimensionPathValue;
import com.airbnb.lottie.model.animatable.AnimatableValue;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.airbnb.lottie.utils.Utils;
import com.airbnb.lottie.value.Keyframe;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class AnimatablePathValueParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final JsonReader.Options f9874a = JsonReader.Options.a("k", "x", "y");

    public static AnimatablePathValue a(JsonReader jsonReader, LottieComposition lottieComposition) {
        ArrayList arrayList = new ArrayList();
        if (jsonReader.H() == JsonReader.Token.X) {
            jsonReader.d();
            while (jsonReader.m()) {
                JsonReader jsonReader2 = jsonReader;
                LottieComposition lottieComposition2 = lottieComposition;
                arrayList.add(new PathKeyframe(lottieComposition2, KeyframeParser.b(jsonReader2, lottieComposition2, Utils.c(), PathParser.f9919a, jsonReader.H() == JsonReader.Token.Z, false)));
                jsonReader = jsonReader2;
                lottieComposition = lottieComposition2;
            }
            jsonReader.k();
            KeyframesParser.b(arrayList);
        } else {
            arrayList.add(new Keyframe(JsonUtils.b(jsonReader, Utils.c())));
        }
        return new AnimatablePathValue(arrayList);
    }

    public static AnimatableValue b(JsonReader jsonReader, LottieComposition lottieComposition) {
        jsonReader.h();
        AnimatablePathValue animatablePathValueA = null;
        AnimatableFloatValue animatableFloatValueB = null;
        boolean z2 = false;
        AnimatableFloatValue animatableFloatValueB2 = null;
        while (jsonReader.H() != JsonReader.Token.e0) {
            int iJ = jsonReader.J(f9874a);
            if (iJ != 0) {
                JsonReader.Token token = JsonReader.Token.g0;
                if (iJ != 1) {
                    if (iJ != 2) {
                        jsonReader.K();
                        jsonReader.P();
                    } else if (jsonReader.H() == token) {
                        jsonReader.P();
                        z2 = true;
                    } else {
                        animatableFloatValueB = AnimatableValueParser.b(jsonReader, lottieComposition, true);
                    }
                } else if (jsonReader.H() == token) {
                    jsonReader.P();
                    z2 = true;
                } else {
                    animatableFloatValueB2 = AnimatableValueParser.b(jsonReader, lottieComposition, true);
                }
            } else {
                animatablePathValueA = a(jsonReader, lottieComposition);
            }
        }
        jsonReader.l();
        if (z2) {
            lottieComposition.a("Lottie doesn't support expressions.");
        }
        return animatablePathValueA != null ? animatablePathValueA : new AnimatableSplitDimensionPathValue(animatableFloatValueB2, animatableFloatValueB);
    }
}
