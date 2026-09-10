package com.airbnb.lottie.parser;

import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.model.animatable.AnimatableColorValue;
import com.airbnb.lottie.model.animatable.AnimatableFloatValue;
import com.airbnb.lottie.model.animatable.AnimatableIntegerValue;
import com.airbnb.lottie.model.animatable.AnimatablePointValue;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.airbnb.lottie.utils.Utils;

/* JADX INFO: loaded from: classes.dex */
public class AnimatableValueParser {
    public static AnimatableColorValue a(JsonReader jsonReader, LottieComposition lottieComposition) {
        return new AnimatableColorValue(KeyframesParser.a(jsonReader, lottieComposition, 1.0f, ColorParser.f9882a, false));
    }

    public static AnimatableFloatValue b(JsonReader jsonReader, LottieComposition lottieComposition, boolean z2) {
        return new AnimatableFloatValue(KeyframesParser.a(jsonReader, lottieComposition, z2 ? Utils.c() : 1.0f, FloatParser.f9894a, false));
    }

    public static AnimatableIntegerValue c(JsonReader jsonReader, LottieComposition lottieComposition) {
        return new AnimatableIntegerValue(KeyframesParser.a(jsonReader, lottieComposition, 1.0f, IntegerParser.f9904a, false));
    }

    public static AnimatablePointValue d(JsonReader jsonReader, LottieComposition lottieComposition) {
        return new AnimatablePointValue(KeyframesParser.a(jsonReader, lottieComposition, Utils.c(), PointFParser.f9920a, true));
    }
}
