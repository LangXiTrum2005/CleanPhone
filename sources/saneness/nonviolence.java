package saneness;

import ads_mobile_sdk.n1;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.ironsource.X3;
import java.util.List;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class nonviolence {
    public static n1 attabal(JsonObject json) {
        Intrinsics.checkNotNullParameter(json, "json");
        try {
            Intrinsics.checkNotNullParameter(json, "<this>");
            Intrinsics.checkNotNullParameter("width", X3.i.W);
            int asInt = json.get("width").getAsInt();
            Intrinsics.checkNotNullParameter(json, "<this>");
            Intrinsics.checkNotNullParameter("height", X3.i.W);
            int asInt2 = json.get("height").getAsInt();
            JsonElement jsonElement = json.get("is_fluid_height");
            return new n1(asInt, asInt2, jsonElement != null ? jsonElement.getAsBoolean() : false);
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
