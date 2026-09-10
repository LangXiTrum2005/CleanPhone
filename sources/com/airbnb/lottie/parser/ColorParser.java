package com.airbnb.lottie.parser;

import android.graphics.Color;
import com.airbnb.lottie.parser.moshi.JsonReader;

/* JADX INFO: loaded from: classes.dex */
public class ColorParser implements ValueParser<Integer> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ColorParser f9882a = new ColorParser();

    @Override // com.airbnb.lottie.parser.ValueParser
    public final Object a(JsonReader jsonReader, float f) {
        boolean z2 = jsonReader.H() == JsonReader.Token.X;
        if (z2) {
            jsonReader.d();
        }
        double dQ = jsonReader.q();
        double dQ2 = jsonReader.q();
        double dQ3 = jsonReader.q();
        double dQ4 = jsonReader.H() == JsonReader.Token.h0 ? jsonReader.q() : 1.0d;
        if (z2) {
            jsonReader.k();
        }
        if (dQ <= 1.0d && dQ2 <= 1.0d && dQ3 <= 1.0d) {
            dQ *= 255.0d;
            dQ2 *= 255.0d;
            dQ3 *= 255.0d;
            if (dQ4 <= 1.0d) {
                dQ4 *= 255.0d;
            }
        }
        return Integer.valueOf(Color.argb((int) dQ4, (int) dQ, (int) dQ2, (int) dQ3));
    }
}
