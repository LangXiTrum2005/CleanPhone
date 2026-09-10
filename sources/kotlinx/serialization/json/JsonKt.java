package kotlinx.serialization.json;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a)\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0017\u0010\u0003\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007\u001a\"\u0010\b\u001a\u00020\t\"\u0006\b\u0000\u0010\n\u0018\u0001*\u00020\u00012\u0006\u0010\u000b\u001a\u0002H\nH\u0086\b¢\u0006\u0002\u0010\f\u001a\"\u0010\r\u001a\u0002H\n\"\u0006\b\u0000\u0010\n\u0018\u0001*\u00020\u00012\u0006\u0010\u000e\u001a\u00020\tH\u0086\b¢\u0006\u0002\u0010\u000f\"\u000e\u0010\u0010\u001a\u00020\u0011X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0012\u001a\u00020\u0011X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Json", "Lkotlinx/serialization/json/Json;", "from", "builderAction", "Lkotlin/Function1;", "Lkotlinx/serialization/json/JsonBuilder;", "", "Lkotlin/ExtensionFunctionType;", "encodeToJsonElement", "Lkotlinx/serialization/json/JsonElement;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "value", "(Lkotlinx/serialization/json/Json;Ljava/lang/Object;)Lkotlinx/serialization/json/JsonElement;", "decodeFromJsonElement", "json", "(Lkotlinx/serialization/json/Json;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;", "defaultIndent", "", "defaultDiscriminator", "kotlinx-serialization-json"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class JsonKt {
    private static final String defaultDiscriminator = "type";
    private static final String defaultIndent = "    ";

    public static final Json Json(Json from, Function1<? super JsonBuilder, Unit> builderAction) {
        Intrinsics.f(from, "from");
        Intrinsics.f(builderAction, "builderAction");
        JsonBuilder jsonBuilder = new JsonBuilder(from);
        builderAction.invoke(jsonBuilder);
        return new JsonImpl(jsonBuilder.build$kotlinx_serialization_json(), jsonBuilder.getSerializersModule());
    }

    public static /* synthetic */ Json Json$default(Json json, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            json = Json.INSTANCE;
        }
        return Json(json, function1);
    }

    public static final <T> T decodeFromJsonElement(Json json, JsonElement json2) {
        Intrinsics.f(json, "<this>");
        Intrinsics.f(json2, "json");
        json.getSerializersModule();
        Intrinsics.l();
        throw null;
    }

    public static final <T> JsonElement encodeToJsonElement(Json json, T t) {
        Intrinsics.f(json, "<this>");
        json.getSerializersModule();
        Intrinsics.l();
        throw null;
    }
}
