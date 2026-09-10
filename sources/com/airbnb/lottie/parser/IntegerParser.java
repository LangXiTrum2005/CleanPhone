package com.airbnb.lottie.parser;

import com.airbnb.lottie.parser.moshi.JsonReader;

/* JADX INFO: loaded from: classes.dex */
public class IntegerParser implements ValueParser<Integer> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final IntegerParser f9904a = new IntegerParser();

    @Override // com.airbnb.lottie.parser.ValueParser
    public final Object a(JsonReader jsonReader, float f) {
        return Integer.valueOf(Math.round(JsonUtils.d(jsonReader) * f));
    }
}
