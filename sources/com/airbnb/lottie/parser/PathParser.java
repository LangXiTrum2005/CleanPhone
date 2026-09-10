package com.airbnb.lottie.parser;

import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.JsonReader;

/* JADX INFO: loaded from: classes.dex */
public class PathParser implements ValueParser<PointF> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PathParser f9919a = new PathParser();

    @Override // com.airbnb.lottie.parser.ValueParser
    public final Object a(JsonReader jsonReader, float f) {
        return JsonUtils.b(jsonReader, f);
    }
}
