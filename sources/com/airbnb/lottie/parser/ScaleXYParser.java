package com.airbnb.lottie.parser;

import com.airbnb.lottie.parser.moshi.JsonReader;
import com.airbnb.lottie.value.ScaleXY;

/* JADX INFO: loaded from: classes.dex */
public class ScaleXYParser implements ValueParser<ScaleXY> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ScaleXYParser f9925a = new ScaleXYParser();

    @Override // com.airbnb.lottie.parser.ValueParser
    public final Object a(JsonReader jsonReader, float f) {
        boolean z2 = jsonReader.H() == JsonReader.Token.X;
        if (z2) {
            jsonReader.d();
        }
        float fQ = (float) jsonReader.q();
        float fQ2 = (float) jsonReader.q();
        while (jsonReader.m()) {
            jsonReader.P();
        }
        if (z2) {
            jsonReader.k();
        }
        return new ScaleXY((fQ / 100.0f) * f, (fQ2 / 100.0f) * f);
    }
}
