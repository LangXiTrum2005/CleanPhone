package com.chartboost.heliumsdk.utils;

import android.util.Base64;
import com.chartboost.heliumsdk.domain.MetricsError;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.text.Charsets;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.json.JsonKt;
import kotlinx.serialization.modules.SerializersModuleBuilder;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u001a\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n\"\u001c\u0010\u0000\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u000b"}, d2 = {"HeliumJson", "Lkotlinx/serialization/json/Json;", "getHeliumJson$annotations", "()V", "getHeliumJson", "()Lkotlinx/serialization/json/Json;", "getMaxJsonPayload", "", "jsonString", "maxSize", "", "Helium_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class HeliumJsonKt {
    private static final Json HeliumJson = JsonKt.Json$default(null, new Function1<JsonBuilder, Unit>() { // from class: com.chartboost.heliumsdk.utils.HeliumJsonKt$HeliumJson$1
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((JsonBuilder) obj);
            return Unit.f43263a;
        }

        public final void invoke(JsonBuilder Json) {
            Intrinsics.f(Json, "$this$Json");
            Json.setLenient(true);
            Json.setIgnoreUnknownKeys(true);
            Json.setEncodeDefaults(true);
            Json.setExplicitNulls(false);
            SerializersModuleBuilder serializersModuleBuilder = new SerializersModuleBuilder();
            ReflectionFactory reflectionFactory = Reflection.f43333a;
            serializersModuleBuilder.polymorphic(reflectionFactory.b(MetricsError.class), reflectionFactory.b(MetricsError.SimpleError.class), MetricsError.SimpleError.INSTANCE.serializer());
            serializersModuleBuilder.polymorphic(reflectionFactory.b(MetricsError.class), reflectionFactory.b(MetricsError.JsonParseError.class), MetricsError.JsonParseError.INSTANCE.serializer());
            Json.setSerializersModule(serializersModuleBuilder.build());
        }
    }, 1, null);

    public static final Json getHeliumJson() {
        return HeliumJson;
    }

    public static /* synthetic */ void getHeliumJson$annotations() {
    }

    public static final String getMaxJsonPayload(String jsonString, int i2) {
        Intrinsics.f(jsonString, "jsonString");
        Charset charset = Charsets.f44691a;
        byte[] bytes = jsonString.getBytes(charset);
        Intrinsics.e(bytes, "this as java.lang.String).getBytes(charset)");
        if (Base64.encode(bytes, 2).length > i2) {
            byte[] bytes2 = "The malformed JSON is too large to include. Partial JSON: ".concat(jsonString).getBytes(charset);
            Intrinsics.e(bytes2, "this as java.lang.String).getBytes(charset)");
            byte[] bArrEncode = Base64.encode(bytes2, 2);
            Intrinsics.e(bArrEncode, "encode(\n            \"The…Base64.NO_WRAP,\n        )");
            return new String(ArraysKt.q(0, i2 - (i2 % 4), bArrEncode), charset);
        }
        byte[] bytes3 = jsonString.getBytes(charset);
        Intrinsics.e(bytes3, "this as java.lang.String).getBytes(charset)");
        String strEncodeToString = Base64.encodeToString(bytes3, 2);
        Intrinsics.e(strEncodeToString, "{\n        Base64.encodeT…(), Base64.NO_WRAP)\n    }");
        return strEncodeToString;
    }
}
