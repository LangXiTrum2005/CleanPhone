package saneness;

import ads_mobile_sdk.cb1;
import ads_mobile_sdk.zg2;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class supplicat {
    public static final zg2 attabal(JsonElement jsonElement) {
        Intrinsics.checkNotNullParameter(jsonElement, "<this>");
        if (!jsonElement.isJsonArray()) {
            return null;
        }
        JsonArray asJsonArray = jsonElement.getAsJsonArray();
        if (asJsonArray.isEmpty()) {
            return null;
        }
        JsonElement jsonElement2 = asJsonArray.get(0);
        if (!jsonElement2.isJsonObject()) {
            return null;
        }
        JsonObject asJsonObject = jsonElement2.getAsJsonObject();
        return new zg2(cb1.a(asJsonObject, "rb_type", ""), cb1.a(asJsonObject, "rb_amount", 1));
    }
}
