package saneness;

import android.util.Base64;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import p002kotlin.Pair;
import p002kotlin.Unit;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.text.Charsets;

/* JADX INFO: renamed from: saneness.null, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class Cnull {
    public static final JsonObject attabal(okhttp3.preprohormone preprohormoneVar) {
        JsonObject jsonObject = new JsonObject();
        JsonObject jsonObject2 = new JsonObject();
        jsonObject2.addProperty("uri", preprohormoneVar.getUrl().getUrl());
        jsonObject2.addProperty("verb", preprohormoneVar.getMethod());
        Unit unit = Unit.f29295attabal;
        jsonObject.add("firstline", jsonObject2);
        okhttp3.molybdenite headers = preprohormoneVar.getHeaders();
        if (headers.size() > 0) {
            JsonArray jsonArray = new JsonArray();
            for (Pair<? extends String, ? extends String> pair : headers) {
                JsonObject jsonObject3 = new JsonObject();
                jsonObject3.addProperty("name", pair.getFirst());
                jsonObject3.addProperty("value", pair.getSecond());
                jsonArray.add(jsonObject3);
            }
            Unit unit2 = Unit.f29295attabal;
            jsonObject.add("headers", jsonArray);
        }
        okhttp3.cord body = preprohormoneVar.getBody();
        if (body != null) {
            byte[] bytes = body.toString().getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            jsonObject.addProperty("body", Base64.encodeToString(bytes, 0));
        }
        return jsonObject;
    }
}
