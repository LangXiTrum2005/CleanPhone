package com.airbnb.lottie.parser;

import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.animation.keyframe.PathKeyframe;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.airbnb.lottie.value.Keyframe;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
class KeyframesParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final JsonReader.Options f9910a = JsonReader.Options.a("k");

    public static ArrayList a(JsonReader jsonReader, LottieComposition lottieComposition, float f, ValueParser valueParser, boolean z2) {
        JsonReader jsonReader2;
        LottieComposition lottieComposition2;
        float f2;
        ValueParser valueParser2;
        boolean z3;
        ArrayList arrayList = new ArrayList();
        if (jsonReader.H() == JsonReader.Token.g0) {
            lottieComposition.a("Lottie doesn't support expressions.");
            return arrayList;
        }
        jsonReader.h();
        while (jsonReader.m()) {
            if (jsonReader.J(f9910a) != 0) {
                jsonReader.P();
            } else if (jsonReader.H() == JsonReader.Token.X) {
                jsonReader.d();
                if (jsonReader.H() == JsonReader.Token.h0) {
                    JsonReader jsonReader3 = jsonReader;
                    LottieComposition lottieComposition3 = lottieComposition;
                    float f3 = f;
                    ValueParser valueParser3 = valueParser;
                    boolean z4 = z2;
                    Keyframe keyframeB = KeyframeParser.b(jsonReader3, lottieComposition3, f3, valueParser3, false, z4);
                    jsonReader2 = jsonReader3;
                    lottieComposition2 = lottieComposition3;
                    f2 = f3;
                    valueParser2 = valueParser3;
                    z3 = z4;
                    arrayList.add(keyframeB);
                } else {
                    jsonReader2 = jsonReader;
                    lottieComposition2 = lottieComposition;
                    f2 = f;
                    valueParser2 = valueParser;
                    z3 = z2;
                    while (jsonReader2.m()) {
                        arrayList.add(KeyframeParser.b(jsonReader2, lottieComposition2, f2, valueParser2, true, z3));
                    }
                }
                jsonReader2.k();
                jsonReader = jsonReader2;
                lottieComposition = lottieComposition2;
                f = f2;
                valueParser = valueParser2;
                z2 = z3;
            } else {
                JsonReader jsonReader4 = jsonReader;
                arrayList.add(KeyframeParser.b(jsonReader4, lottieComposition, f, valueParser, false, z2));
                jsonReader = jsonReader4;
            }
        }
        jsonReader.l();
        b(arrayList);
        return arrayList;
    }

    public static void b(ArrayList arrayList) {
        int i2;
        Object obj;
        int size = arrayList.size();
        int i3 = 0;
        while (true) {
            i2 = size - 1;
            if (i3 >= i2) {
                break;
            }
            Keyframe keyframe = (Keyframe) arrayList.get(i3);
            i3++;
            Keyframe keyframe2 = (Keyframe) arrayList.get(i3);
            keyframe.f9954h = Float.valueOf(keyframe2.g);
            if (keyframe.f9952c == null && (obj = keyframe2.f9951b) != null) {
                keyframe.f9952c = obj;
                if (keyframe instanceof PathKeyframe) {
                    ((PathKeyframe) keyframe).d();
                }
            }
        }
        Keyframe keyframe3 = (Keyframe) arrayList.get(i2);
        if ((keyframe3.f9951b == null || keyframe3.f9952c == null) && arrayList.size() > 1) {
            arrayList.remove(keyframe3);
        }
    }
}
