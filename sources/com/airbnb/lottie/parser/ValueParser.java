package com.airbnb.lottie.parser;

import com.airbnb.lottie.parser.moshi.JsonReader;

/* JADX INFO: loaded from: classes.dex */
interface ValueParser<V> {
    Object a(JsonReader jsonReader, float f);
}
