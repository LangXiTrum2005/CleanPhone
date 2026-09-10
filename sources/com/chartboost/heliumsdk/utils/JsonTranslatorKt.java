package com.chartboost.heliumsdk.utils;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonObject;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0002*\u00020\u0001¨\u0006\u0004"}, d2 = {"toJSONObject", "Lorg/json/JSONObject;", "Lkotlinx/serialization/json/JsonObject;", "toJsonObject", "Helium_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class JsonTranslatorKt {
    public static final JSONObject toJSONObject(JsonObject jsonObject) throws IllegalArgumentException {
        Intrinsics.f(jsonObject, "<this>");
        Json.Companion companion = Json.INSTANCE;
        companion.getSerializersModule();
        return new JSONObject(companion.encodeToString(JsonObject.INSTANCE.serializer(), jsonObject));
    }

    public static final JsonObject toJsonObject(JSONObject jSONObject) throws IllegalArgumentException {
        Intrinsics.f(jSONObject, "<this>");
        String string = jSONObject.toString();
        Intrinsics.e(string, "this.toString()");
        Json heliumJson = HeliumJsonKt.getHeliumJson();
        heliumJson.getSerializersModule();
        return (JsonObject) heliumJson.decodeFromString(JsonObject.INSTANCE.serializer(), string);
    }
}
