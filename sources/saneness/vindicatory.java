package saneness;

import ads_mobile_sdk.cb1;
import ads_mobile_sdk.wx0;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.b;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
public abstract class vindicatory {
    public static wx0 attabal(JsonObject json) {
        JsonObject asJsonObject;
        JsonArray jsonArrayD;
        JsonObject jsonObjectA;
        JsonArray jsonArrayD2;
        JsonObject jsonObjectA2;
        String strA;
        JsonObject jsonObjectA3;
        Intrinsics.checkNotNullParameter(json, "json");
        JsonElement jsonElement = json.get(CampaignEx.JSON_KEY_AD_HTML);
        String strA2 = null;
        String asString = jsonElement != null ? jsonElement.getAsString() : null;
        JsonElement jsonElement2 = json.get("ad_base_url");
        String asString2 = jsonElement2 != null ? jsonElement2.getAsString() : null;
        JsonElement jsonElement3 = json.get("ad_json");
        JsonObject asJsonObject2 = jsonElement3 != null ? jsonElement3.getAsJsonObject() : null;
        JsonElement jsonElement4 = json.get("ad_json");
        JsonArray jsonArrayD3 = cb1.d(jsonElement4 != null ? jsonElement4.getAsJsonObject() : null, b.JSON_KEY_ADS);
        if (jsonArrayD3 != null && (jsonObjectA3 = cb1.a(jsonArrayD3, 0)) != null) {
            strA2 = cb1.a(jsonObjectA3, "ad_mid", "");
        }
        JsonElement jsonElement5 = json.get("ad_json");
        return new wx0(asString, asString2, asJsonObject2, strA2, (jsonElement5 == null || (asJsonObject = jsonElement5.getAsJsonObject()) == null || (jsonArrayD = cb1.d(asJsonObject, "slots")) == null || (jsonObjectA = cb1.a(jsonArrayD, 0)) == null || (jsonArrayD2 = cb1.d(jsonObjectA, b.JSON_KEY_ADS)) == null || (jsonObjectA2 = cb1.a(jsonArrayD2, 0)) == null || (strA = cb1.a(jsonObjectA2, "ad_mid", "")) == null || !(StringsKt.empress(strA) ^ true)) ? false : true);
    }
}
