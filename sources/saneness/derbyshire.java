package saneness;

import ads_mobile_sdk.qv;
import ads_mobile_sdk.zk;
import com.google.ads.mediation.inmobi.InMobiNetworkKeys;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.ironsource.X3;
import com.unity3d.ads.core.data.datasource.AndroidTcfDataSource;
import p002kotlin.Unit;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class derbyshire extends zk {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public derbyshire(stupefactive flagValueProvider) {
        super(flagValueProvider);
        Intrinsics.checkNotNullParameter(flagValueProvider, "flagValueProvider");
    }

    public static JsonObject attabal(String str, qv qvVar) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("bk", str);
        jsonObject.addProperty("sk", str);
        jsonObject.addProperty("type", Integer.valueOf(qvVar.a));
        return jsonObject;
    }

    public final String dern() {
        JsonArray jsonArray = new JsonArray();
        qv qvVar = qv.STRING;
        jsonArray.add(attabal("IABTCF_AddtlConsent", qvVar));
        jsonArray.add(attabal("IABConsent_CMPPresent", qv.BOOLEAN));
        qv qvVar2 = qv.NUMBER;
        jsonArray.add(attabal("IABTCF_CmpSdkID", qvVar2));
        jsonArray.add(attabal("IABConsent_ConsentString", qvVar));
        jsonArray.add(attabal("IABTCF_gdprApplies", qvVar2));
        jsonArray.add(attabal("IABGPP_HDR_GppString", qvVar));
        jsonArray.add(attabal("IABGPP_GppSID", qvVar));
        jsonArray.add(attabal("gad_has_consent_for_cookies", qvVar2));
        jsonArray.add(attabal("IABConsent_ParsedPurposeConsents", qvVar));
        jsonArray.add(attabal("personalized_ad_status", qvVar));
        jsonArray.add(attabal("IABTCF_PolicyVersion", qvVar2));
        jsonArray.add(attabal(InMobiNetworkKeys.IAB_US_PRIVACY_STRING, qvVar));
        jsonArray.add(attabal("IABTCF_PurposeConsents", qvVar));
        jsonArray.add(attabal("gad_rdp", qvVar2));
        jsonArray.add(attabal("IABConsent_SubjectToGDPR", qvVar));
        jsonArray.add(attabal(AndroidTcfDataSource.TCF_TCSTRING_KEY, qvVar));
        jsonArray.add(attabal("UPTC_UptcString", qvVar));
        jsonArray.add(attabal("IABConsent_ParsedVendorConsents", qvVar));
        jsonArray.add(attabal("UMP_eids", qvVar));
        Unit unit = Unit.f29295attabal;
        String defaultValue = jsonArray.toString();
        Intrinsics.checkNotNullExpressionValue(defaultValue, "toString(...)");
        Intrinsics.checkNotNullParameter("gads:sp:json_string", X3.i.W);
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return (String) a("gads:sp:json_string", defaultValue, zk.o);
    }

    public final String saneness() {
        JsonArray jsonArray = new JsonArray();
        qv qvVar = qv.STRING;
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("consent_key", "gad_has_consent_for_cookies");
        jsonObject.addProperty("consent_value_match", "0");
        jsonObject.addProperty("consent_value_type", (Number) 1);
        jsonArray.add(jsonObject);
        JsonObject jsonObject2 = new JsonObject();
        jsonObject2.addProperty("consent_key", "IABTCF_gdprApplies");
        jsonObject2.addProperty("consent_value_match", "1");
        jsonObject2.addProperty("consent_value_type", (Number) 1);
        jsonArray.add(jsonObject2);
        Unit unit = Unit.f29295attabal;
        String defaultValue = jsonArray.toString();
        Intrinsics.checkNotNullExpressionValue(defaultValue, "toString(...)");
        Intrinsics.checkNotNullParameter("gads:full_consent_check_map", X3.i.W);
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return (String) a("gads:full_consent_check_map", defaultValue, zk.o);
    }
}
