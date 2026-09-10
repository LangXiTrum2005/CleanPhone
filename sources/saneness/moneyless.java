package saneness;

import ads_mobile_sdk.cb1;
import ads_mobile_sdk.em;
import ads_mobile_sdk.ur;
import android.net.Uri;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.ironsource.X3;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.Ref$ObjectRef;
import p002kotlin.time.DurationUnit;

/* JADX INFO: loaded from: classes.dex */
public abstract class moneyless {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [T, com.google.gson.JsonObject] */
    /* JADX WARN: Type inference failed for: r11v0, types: [T, com.google.gson.JsonObject] */
    /* JADX WARN: Type inference failed for: r12v0, types: [T, com.google.gson.JsonObject] */
    /* JADX WARN: Type inference failed for: r4v16, types: [com.google.gson.JsonObject] */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v22, types: [com.google.gson.JsonObject] */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v25, types: [T] */
    /* JADX WARN: Type inference failed for: r4v39, types: [com.google.gson.JsonObject] */
    /* JADX WARN: Type inference failed for: r4v42 */
    /* JADX WARN: Type inference failed for: r4v43 */
    /* JADX WARN: Type inference failed for: r4v45, types: [com.google.gson.JsonObject] */
    /* JADX WARN: Type inference failed for: r4v47 */
    /* JADX WARN: Type inference failed for: r4v48, types: [T] */
    /* JADX WARN: Type inference failed for: r4v75, types: [com.google.gson.JsonObject] */
    /* JADX WARN: Type inference failed for: r4v78 */
    /* JADX WARN: Type inference failed for: r4v79 */
    /* JADX WARN: Type inference failed for: r4v81, types: [com.google.gson.JsonObject] */
    /* JADX WARN: Type inference failed for: r4v83 */
    /* JADX WARN: Type inference failed for: r4v84, types: [T] */
    public static ur attabal(JsonObject jsonObject) {
        JsonObject jsonObject2;
        long j;
        long j2;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        em emVar;
        boolean z;
        int i;
        int i2;
        JsonObject jsonObject3;
        long j3;
        long j4;
        ArrayList arrayList = new ArrayList();
        p002kotlin.time.saneness.Companion companion = p002kotlin.time.saneness.INSTANCE;
        long jDern = companion.dern();
        long jMerc = p002kotlin.time.saneness.merc(companion.dern(), p002kotlin.time.dern.molybdenite(1, DurationUnit.SECONDS));
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = new JsonObject();
        JsonObject jsonObject4 = new JsonObject();
        Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
        ref$ObjectRef2.element = new JsonObject();
        Ref$ObjectRef ref$ObjectRef3 = new Ref$ObjectRef();
        ref$ObjectRef3.element = new JsonObject();
        String str6 = "";
        long j5 = 0;
        if (jsonObject != null) {
            String str7 = "";
            String str8 = str7;
            String str9 = str8;
            String str10 = str9;
            long asLong = 0;
            emVar = null;
            int asInt = 0;
            boolean asBoolean = false;
            int asInt2 = 1;
            String asString = str10;
            String asString2 = asString;
            long jMolybdenite = jMerc;
            long jMolybdenite2 = jDern;
            JsonObject jsonObject5 = jsonObject4;
            for (Map.Entry<String, JsonElement> entry : jsonObject.entrySet()) {
                Intrinsics.beachfront(entry);
                String key = entry.getKey();
                JsonElement json = entry.getValue();
                if (key != null) {
                    jsonObject3 = jsonObject5;
                    j3 = jMolybdenite2;
                    j4 = jMolybdenite;
                    switch (key.hashCode()) {
                        case -1934789405:
                            if (key.equals("adRequestUrl")) {
                                String asString3 = json.getAsString();
                                Intrinsics.checkNotNullExpressionValue(asString3, "getAsString(...)");
                                jsonObject5 = jsonObject3;
                                str7 = asString3;
                            }
                            jMolybdenite2 = j3;
                            jMolybdenite = j4;
                            break;
                        case -1664768712:
                            if (key.equals("inspector_ad_transaction_extras")) {
                                ?? A = cb1.a(json);
                                if (A == 0) {
                                    try {
                                        A = (JsonObject) new Gson().fromJson(json.getAsString(), JsonObject.class);
                                    } catch (Exception e) {
                                        List list = rajahmundry.attabal(e, "t", e).s;
                                        String message = e.getMessage();
                                        if (message == null) {
                                            message = e.getClass().getName();
                                        }
                                        Intrinsics.beachfront(message);
                                        list.add(message);
                                        A = 0;
                                    }
                                    if (A == 0) {
                                        A = (JsonObject) ref$ObjectRef2.element;
                                    }
                                }
                                ref$ObjectRef2.element = A;
                            }
                            break;
                        case -1550155393:
                            if (key.equals("nofill_urls")) {
                                JsonArray asJsonArray = json.getAsJsonArray();
                                Intrinsics.checkNotNullExpressionValue(asJsonArray, "getAsJsonArray(...)");
                                int i3 = 0;
                                for (JsonElement jsonElement : asJsonArray) {
                                    int i4 = i3 + 1;
                                    if (i3 < 0) {
                                        p002kotlin.collections.adultoid.dovishness();
                                    }
                                    JsonElement jsonElement2 = jsonElement;
                                    Intrinsics.beachfront(jsonElement2);
                                    String asString4 = jsonElement2.getAsString();
                                    Intrinsics.checkNotNullExpressionValue(asString4, "getAsString(...)");
                                    Uri uri = Uri.parse(asString4);
                                    if (uri != null) {
                                        arrayList.add(uri);
                                    }
                                    i3 = i4;
                                }
                            }
                            break;
                        case -1076723292:
                            if (key.equals("adapter_response_replacement_key")) {
                                String asString5 = json.getAsString();
                                Intrinsics.checkNotNullExpressionValue(asString5, "getAsString(...)");
                                jsonObject5 = jsonObject3;
                                str9 = asString5;
                            }
                            jMolybdenite2 = j3;
                            jMolybdenite = j4;
                            break;
                        case -996058782:
                            if (key.equals("adResponseHeaders")) {
                                ?? A2 = cb1.a(json);
                                if (A2 == 0) {
                                    try {
                                        A2 = (JsonObject) new Gson().fromJson(json.getAsString(), JsonObject.class);
                                    } catch (Exception e2) {
                                        List list2 = rajahmundry.attabal(e2, "t", e2).s;
                                        String message2 = e2.getMessage();
                                        if (message2 == null) {
                                            message2 = e2.getClass().getName();
                                        }
                                        Intrinsics.beachfront(message2);
                                        list2.add(message2);
                                        A2 = 0;
                                    }
                                    if (A2 == 0) {
                                        A2 = (JsonObject) ref$ObjectRef3.element;
                                    }
                                }
                                ref$ObjectRef3.element = A2;
                            }
                            break;
                        case -878581970:
                            if (key.equals("gws_query_id")) {
                                asString = json.getAsString();
                                Intrinsics.checkNotNullExpressionValue(asString, "getAsString(...)");
                            }
                            break;
                        case -729197079:
                            if (key.equals("is_idless")) {
                                asBoolean = json.getAsBoolean();
                            }
                            break;
                        case -644504941:
                            if (key.equals("max_parallel_renderers")) {
                                asInt2 = json.getAsInt();
                            }
                            break;
                        case -46576386:
                            if (key.equals("latency")) {
                                asLong = json.getAsLong();
                            }
                            break;
                        case 532938054:
                            if (key.equals("adResponseBody")) {
                                String asString6 = json.getAsString();
                                Intrinsics.checkNotNullExpressionValue(asString6, "getAsString(...)");
                                jsonObject5 = jsonObject3;
                                str10 = asString6;
                            }
                            jMolybdenite2 = j3;
                            jMolybdenite = j4;
                            break;
                        case 864007346:
                            if (key.equals("public_error")) {
                                Intrinsics.beachfront(json);
                                Intrinsics.checkNotNullParameter(json, "json");
                                if (json.isJsonNull()) {
                                    jsonObject5 = jsonObject3;
                                    emVar = null;
                                } else {
                                    try {
                                        JsonObject asJsonObject = json.getAsJsonObject();
                                        Intrinsics.checkNotNullExpressionValue(asJsonObject, "getAsJsonObject(...)");
                                        Intrinsics.checkNotNullParameter(asJsonObject, "<this>");
                                        Intrinsics.checkNotNullParameter("code", X3.i.W);
                                        int asInt3 = asJsonObject.get("code").getAsInt();
                                        JsonObject asJsonObject2 = json.getAsJsonObject();
                                        Intrinsics.checkNotNullExpressionValue(asJsonObject2, "getAsJsonObject(...)");
                                        Intrinsics.checkNotNullParameter(asJsonObject2, "<this>");
                                        Intrinsics.checkNotNullParameter(InMobiNetworkValues.DESCRIPTION, X3.i.W);
                                        String asString7 = asJsonObject2.get(InMobiNetworkValues.DESCRIPTION).getAsString();
                                        Intrinsics.checkNotNullExpressionValue(asString7, "getAsString(...)");
                                        jsonObject5 = jsonObject3;
                                        emVar = new em(asString7, asInt3);
                                    } catch (Exception e3) {
                                        List list3 = rajahmundry.attabal(e3, "t", e3).s;
                                        String message3 = e3.getMessage();
                                        if (message3 == null) {
                                            message3 = e3.getClass().getName();
                                        }
                                        Intrinsics.beachfront(message3);
                                        list3.add(message3);
                                        jsonObject5 = jsonObject3;
                                        emVar = null;
                                    }
                                }
                            }
                            jMolybdenite2 = j3;
                            jMolybdenite = j4;
                            break;
                        case 868720662:
                            if (key.equals("response_info_extras")) {
                                JsonObject asJsonObject3 = json.getAsJsonObject();
                                Intrinsics.checkNotNullExpressionValue(asJsonObject3, "getAsJsonObject(...)");
                                jsonObject5 = asJsonObject3;
                            }
                            jMolybdenite2 = j3;
                            jMolybdenite = j4;
                            break;
                        case 961728366:
                            if (key.equals("adRequestPostBody")) {
                                String asString8 = json.getAsString();
                                Intrinsics.checkNotNullExpressionValue(asString8, "getAsString(...)");
                                jsonObject5 = jsonObject3;
                                str8 = asString8;
                            }
                            jMolybdenite2 = j3;
                            jMolybdenite = j4;
                            break;
                        case 1128093708:
                            if (key.equals("analytics_query_ad_event_id")) {
                                asString2 = json.getAsString();
                                Intrinsics.checkNotNullExpressionValue(asString2, "getAsString(...)");
                            }
                            break;
                        case 1282999366:
                            if (key.equals("refresh_load_delay_time_interval")) {
                                p002kotlin.time.saneness.Companion companion2 = p002kotlin.time.saneness.INSTANCE;
                                jMolybdenite = p002kotlin.time.dern.molybdenite(json.getAsInt(), DurationUnit.SECONDS);
                                jsonObject5 = jsonObject3;
                                jMolybdenite2 = j3;
                            }
                            break;
                        case 1676268331:
                            if (key.equals("response_code")) {
                                asInt = json.getAsInt();
                            }
                            break;
                        case 1722800622:
                            if (key.equals("bidding_data")) {
                                ?? A3 = cb1.a(json);
                                if (A3 == 0) {
                                    try {
                                        A3 = (JsonObject) new Gson().fromJson(json.getAsString(), JsonObject.class);
                                    } catch (Exception e4) {
                                        List list4 = rajahmundry.attabal(e4, "t", e4).s;
                                        String message4 = e4.getMessage();
                                        if (message4 == null) {
                                            message4 = e4.getClass().getName();
                                        }
                                        Intrinsics.beachfront(message4);
                                        list4.add(message4);
                                        A3 = 0;
                                    }
                                    if (A3 == 0) {
                                        A3 = (JsonObject) ref$ObjectRef.element;
                                    }
                                }
                                ref$ObjectRef.element = A3;
                            }
                            break;
                        case 1816824233:
                            if (key.equals("refresh_interval")) {
                                p002kotlin.time.saneness.Companion companion3 = p002kotlin.time.saneness.INSTANCE;
                                jMolybdenite2 = p002kotlin.time.dern.molybdenite(json.getAsInt(), DurationUnit.SECONDS);
                                jsonObject5 = jsonObject3;
                            }
                            jMolybdenite = j4;
                            break;
                        default:
                            break;
                    }
                } else {
                    jsonObject3 = jsonObject5;
                    j3 = jMolybdenite2;
                    j4 = jMolybdenite;
                }
                jsonObject5 = jsonObject3;
                jMolybdenite2 = j3;
                jMolybdenite = j4;
            }
            JsonObject jsonObject6 = jsonObject5;
            long j6 = jMolybdenite2;
            long j7 = jMolybdenite;
            i2 = asInt2;
            str6 = asString;
            str3 = str7;
            str2 = str8;
            str = str9;
            str4 = str10;
            z = asBoolean;
            j = j6;
            j2 = j7;
            long j8 = asLong;
            jsonObject2 = jsonObject6;
            i = asInt;
            str5 = asString2;
            j5 = j8;
        } else {
            jsonObject2 = jsonObject4;
            j = jDern;
            j2 = jMerc;
            str = "";
            str2 = str;
            str3 = str2;
            str4 = str3;
            str5 = str4;
            emVar = null;
            z = false;
            i = 0;
            i2 = 1;
        }
        return new ur(str, str2, str3, str4, (JsonObject) ref$ObjectRef3.element, (JsonObject) ref$ObjectRef.element, emVar, str6, (JsonObject) ref$ObjectRef2.element, z, j5, i2, arrayList, j, j2, i, jsonObject2, str5);
    }
}
