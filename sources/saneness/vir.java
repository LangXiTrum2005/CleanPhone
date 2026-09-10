package saneness;

import ads_mobile_sdk.dm2;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.ironsource.X3;
import java.util.List;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class vir {
    public static dm2 attabal(JsonObject json) {
        Intrinsics.checkNotNullParameter(json, "json");
        try {
            Intrinsics.checkNotNullParameter(json, "<this>");
            Intrinsics.checkNotNullParameter("name", X3.i.W);
            String asString = json.get("name").getAsString();
            Intrinsics.checkNotNullExpressionValue(asString, "getAsString(...)");
            JsonElement jsonElement = json.get("info");
            return new dm2(jsonElement != null ? jsonElement.getAsJsonObject() : null, asString);
        } catch (Exception e) {
            List list = rajahmundry.attabal(e, "t", e).s;
            String message = e.getMessage();
            if (message == null) {
                message = e.getClass().getName();
            }
            Intrinsics.beachfront(message);
            list.add(message);
            return null;
        }
    }
}
