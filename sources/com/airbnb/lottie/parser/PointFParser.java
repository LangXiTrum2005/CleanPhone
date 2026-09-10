package com.airbnb.lottie.parser;

import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.JsonReader;

/* JADX INFO: loaded from: classes.dex */
public class PointFParser implements ValueParser<PointF> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PointFParser f9920a = new PointFParser();

    @Override // com.airbnb.lottie.parser.ValueParser
    public final Object a(JsonReader jsonReader, float f) {
        JsonReader.Token tokenH = jsonReader.H();
        if (tokenH == JsonReader.Token.X) {
            return JsonUtils.b(jsonReader, f);
        }
        if (tokenH == JsonReader.Token.Z) {
            return JsonUtils.b(jsonReader, f);
        }
        if (tokenH != JsonReader.Token.h0) {
            throw new IllegalArgumentException("Cannot convert json to point. Next token is " + tokenH);
        }
        PointF pointF = new PointF(((float) jsonReader.q()) * f, ((float) jsonReader.q()) * f);
        while (jsonReader.m()) {
            jsonReader.P();
        }
        return pointF;
    }
}
