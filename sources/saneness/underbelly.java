package saneness;

import ads_mobile_sdk.cb1;
import ads_mobile_sdk.ck2;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.List;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class underbelly {
    public static ck2 attabal(JsonObject json) {
        ck2 ck2Var;
        Intrinsics.checkNotNullParameter(json, "json");
        try {
            String strA = cb1.a(json, "click_string", "");
            String strA2 = cb1.a(json, "report_url", "");
            int i = 0;
            boolean zA = cb1.a(json, "non_malicious_reporting_enabled", false);
            boolean zA2 = cb1.a(json, "protection_enabled", false);
            JsonArray jsonArrayD = cb1.d(json, "allowed_headers");
            ArrayList arrayList = new ArrayList();
            if (jsonArrayD != null) {
                for (JsonElement jsonElement : jsonArrayD) {
                    int i2 = i + 1;
                    if (i < 0) {
                        p002kotlin.collections.adultoid.dovishness();
                    }
                    JsonElement jsonElement2 = jsonElement;
                    Intrinsics.beachfront(jsonElement2);
                    String asString = jsonElement2.getAsString();
                    if (asString != null) {
                        arrayList.add(asString);
                    }
                    i = i2;
                }
            }
            ck2Var = new ck2(strA, strA2, zA, zA2, arrayList);
        } catch (Exception e) {
            List list = rajahmundry.attabal(e, "t", e).s;
            String message = e.getMessage();
            if (message == null) {
                message = e.getClass().getName();
            }
            Intrinsics.beachfront(message);
            list.add(message);
            ck2Var = null;
        }
        return ck2Var == null ? new ck2() : ck2Var;
    }
}
