package ads_mobile_sdk;

import android.util.Base64;
import com.applovin.sdk.AppLovinMediationProvider;
import com.google.common.io.BaseEncoding;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.ironsource.L6;
import com.ironsource.X3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import p002kotlin.Pair;
import p002kotlin.Unit;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.collections.adultoid;
import p002kotlin.collections.polder;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.bleacherite;
import saneness.certifiable;
import saneness.cosurveillance;
import saneness.cutwater;
import saneness.decca;
import saneness.dehortation;
import saneness.enthrallment;
import saneness.escorial;
import saneness.graveside;
import saneness.kith;
import saneness.mapmaker;
import saneness.rajahmundry;
import saneness.slightingly;
import saneness.splinterproof;
import saneness.uniterm;
import saneness.untying;
import saneness.yorkshire;

/* JADX INFO: loaded from: classes.dex */
public final class rv0 {
    public static final rv0 a = new rv0();

    public static sl a(JsonObject jsonObject, String str, String str2) {
        try {
            String strA = cb1.a(jsonObject, L6.H, "");
            Locale locale = Locale.ROOT;
            String lowerCase = strA.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            String lowerCase2 = str2.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
            if (!Intrinsics.wireman(lowerCase, lowerCase2)) {
                return null;
            }
            if (kn0.a("GoogleMobileAds", 2)) {
                for (String str3 : kn0.a().taiyuan("Adapter settings from permission set: " + jsonObject)) {
                    Thread.currentThread().getName();
                }
            }
            cutwater cutwaterVarR = sl.r();
            Intrinsics.checkNotNullExpressionValue(cutwaterVarR, "newBuilder(...)");
            ul ulVarAttabal = dehortation.attabal(cutwaterVarR);
            ulVarAttabal.a(str);
            String lowerCase3 = cb1.a(jsonObject, L6.H, "").toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase3, "toLowerCase(...)");
            ulVarAttabal.b(lowerCase3);
            ulVarAttabal.b(cb1.a(jsonObject, "collect_secure_signals", false));
            ulVarAttabal.a(cb1.a(jsonObject, "collect_secure_signals_on_full_app", false));
            zd0 zd0VarB = ulVarAttabal.b();
            JsonElement jsonElement = jsonObject.get("data");
            JsonObject asJsonObject = jsonElement != null ? jsonElement.getAsJsonObject() : null;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (asJsonObject != null) {
                for (Map.Entry<String, JsonElement> entry : asJsonObject.entrySet()) {
                    Intrinsics.beachfront(entry);
                    String key = entry.getKey();
                    JsonElement value = entry.getValue();
                    Intrinsics.beachfront(key);
                    Intrinsics.beachfront(value);
                    Pair pair = new Pair(key, value.getAsString());
                    linkedHashMap.put(pair.getFirst(), pair.getSecond());
                }
            }
            ulVarAttabal.a(zd0VarB, linkedHashMap);
            return ulVarAttabal.a();
        } catch (Exception e) {
            y13.a(e);
            return null;
        }
    }

    public static Pair b(JsonObject jsonObject) {
        try {
            if (kn0.a("GoogleMobileAds", 2)) {
                for (String str : kn0.a().taiyuan("AppSettings MediationConfig for request signals: " + jsonObject)) {
                    Thread.currentThread().getName();
                }
            }
            String strA = cb1.a(jsonObject, "format", "");
            Locale locale = Locale.ROOT;
            String lowerCase = strA.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            String lowerCase2 = cb1.a(jsonObject, "ad_unit_id", "").toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
            JsonElement jsonElement = jsonObject.get("request_signals");
            if (lowerCase.length() != 0 && lowerCase2.length() != 0 && jsonElement != null) {
                return new Pair(lowerCase2 + "," + lowerCase, jsonElement.toString());
            }
            return null;
        } catch (Exception e) {
            y13.a(e);
            return null;
        }
    }

    public static v6 c(JsonObject jsonObject) {
        yorkshire yorkshireVarR = v6.r();
        Intrinsics.checkNotNullExpressionValue(yorkshireVarR, "newBuilder(...)");
        x6 x6VarAttabal = mapmaker.attabal(yorkshireVarR);
        if (kn0.a("GoogleMobileAds", 2)) {
            for (String str : kn0.a().taiyuan("AdUnitPatterns: " + jsonObject)) {
                Thread.currentThread().getName();
            }
        }
        yd0 yd0VarC = x6VarAttabal.c();
        JsonArray asJsonArray = jsonObject.getAsJsonArray("including");
        ArrayList arrayList = new ArrayList();
        int i = 0;
        if (asJsonArray != null) {
            int i2 = 0;
            for (JsonElement jsonElement : asJsonArray) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    adultoid.dovishness();
                }
                JsonElement jsonElement2 = jsonElement;
                Intrinsics.beachfront(jsonElement2);
                String asString = jsonElement2.getAsString();
                if (asString != null) {
                    arrayList.add(asString);
                }
                i2 = i3;
            }
        }
        x6VarAttabal.b(yd0VarC, arrayList);
        yd0 yd0VarB = x6VarAttabal.b();
        JsonArray asJsonArray2 = jsonObject.getAsJsonArray("excluding");
        ArrayList arrayList2 = new ArrayList();
        if (asJsonArray2 != null) {
            for (JsonElement jsonElement3 : asJsonArray2) {
                int i4 = i + 1;
                if (i < 0) {
                    adultoid.dovishness();
                }
                JsonElement jsonElement4 = jsonElement3;
                Intrinsics.beachfront(jsonElement4);
                String asString2 = jsonElement4.getAsString();
                if (asString2 != null) {
                    arrayList2.add(asString2);
                }
                i = i4;
            }
        }
        x6VarAttabal.a(yd0VarB, arrayList2);
        String lowerCase = cb1.a(jsonObject, "effective_ad_unit_id", "").toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        x6VarAttabal.a(lowerCase);
        return x6VarAttabal.a();
    }

    public static j8 d(JsonObject jsonObject) {
        try {
            escorial builder = j8.q();
            Intrinsics.checkNotNullExpressionValue(builder, "newBuilder(...)");
            Intrinsics.checkNotNullParameter(builder, "builder");
            List listDern = builder.dern();
            Intrinsics.checkNotNullExpressionValue(listDern, "getInitializationDataList(...)");
            yd0 yd0Var = new yd0(listDern);
            JsonElement jsonElement = jsonObject.get("data");
            JsonArray asJsonArray = jsonElement != null ? jsonElement.getAsJsonArray() : null;
            ArrayList values = new ArrayList();
            if (asJsonArray != null) {
                int i = 0;
                for (JsonElement jsonElement2 : asJsonArray) {
                    int i2 = i + 1;
                    if (i < 0) {
                        adultoid.dovishness();
                    }
                    JsonElement jsonElement3 = jsonElement2;
                    Intrinsics.beachfront(jsonElement3);
                    JsonObject asJsonObject = jsonElement3.getAsJsonObject();
                    Intrinsics.checkNotNullExpressionValue(asJsonObject, "getAsJsonObject(...)");
                    values.add(e(asJsonObject));
                    i = i2;
                }
            }
            Intrinsics.checkNotNullParameter(yd0Var, "<this>");
            Intrinsics.checkNotNullParameter(values, "values");
            builder.attabal(values);
            xm0 xm0VarA = builder.a();
            Intrinsics.checkNotNullExpressionValue(xm0VarA, "build(...)");
            return (j8) xm0VarA;
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

    public static m8 e(JsonObject jsonObject) {
        JsonObject asJsonObject;
        cosurveillance builder = m8.q();
        Intrinsics.checkNotNullExpressionValue(builder, "newBuilder(...)");
        Intrinsics.checkNotNullParameter(builder, "builder");
        JsonElement jsonElement = jsonObject.get("format");
        String value = jsonElement != null ? jsonElement.getAsString() : null;
        if (value == null) {
            value = "";
        } else {
            Intrinsics.beachfront(value);
        }
        Intrinsics.checkNotNullParameter(value, "value");
        builder.attabal(value);
        JsonElement jsonElement2 = jsonObject.get("data");
        if (jsonElement2 != null && (asJsonObject = jsonElement2.getAsJsonObject()) != null) {
            Intrinsics.beachfront(asJsonObject);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, JsonElement> entry : asJsonObject.entrySet()) {
                Intrinsics.beachfront(entry);
                String key = entry.getKey();
                JsonElement value2 = entry.getValue();
                Intrinsics.beachfront(key);
                Intrinsics.beachfront(value2);
                Pair pair = new Pair(key, value2.getAsString());
                linkedHashMap.put(pair.getFirst(), pair.getSecond());
            }
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                String key2 = (String) entry2.getKey();
                String value3 = (String) entry2.getValue();
                Map mapWireman = builder.wireman();
                Intrinsics.checkNotNullExpressionValue(mapWireman, "getExtrasMap(...)");
                zd0 zd0Var = new zd0(mapWireman);
                Intrinsics.beachfront(value3);
                Intrinsics.checkNotNullParameter(zd0Var, "<this>");
                Intrinsics.checkNotNullParameter(key2, "key");
                Intrinsics.checkNotNullParameter(value3, "value");
                builder.dern(key2, value3);
            }
        }
        xm0 xm0VarA = builder.a();
        Intrinsics.checkNotNullExpressionValue(xm0VarA, "build(...)");
        return (m8) xm0VarA;
    }

    public static td1 f(JsonObject jsonObject) {
        JsonObject jsonObject2;
        try {
            slightingly slightinglyVarQ = td1.q();
            Intrinsics.checkNotNullExpressionValue(slightinglyVarQ, "newBuilder(...)");
            vd1 vd1VarAttabal = decca.attabal(slightinglyVarQ);
            if (kn0.a("GoogleMobileAds", 2)) {
                for (String str : kn0.a().taiyuan("AppSettings MediationAdNetworkInfo: " + jsonObject)) {
                    Thread.currentThread().getName();
                }
            }
            JsonObject asJsonObject = jsonObject.getAsJsonObject("data");
            zd0 zd0VarC = vd1VarAttabal.c();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (asJsonObject != null) {
                for (Map.Entry<String, JsonElement> entry : asJsonObject.entrySet()) {
                    Intrinsics.beachfront(entry);
                    String key = entry.getKey();
                    JsonElement value = entry.getValue();
                    Intrinsics.beachfront(key);
                    Intrinsics.beachfront(value);
                    Pair pair = new Pair(key, value.getAsString());
                    linkedHashMap.put(pair.getFirst(), pair.getSecond());
                }
            }
            vd1VarAttabal.a(zd0VarC, linkedHashMap);
            yd0 yd0VarB = vd1VarAttabal.b();
            JsonArray asJsonArray = jsonObject.getAsJsonArray("rtb_adapters");
            ArrayList arrayList = new ArrayList();
            if (asJsonArray != null) {
                int i = 0;
                for (JsonElement jsonElement : asJsonArray) {
                    int i2 = i + 1;
                    if (i < 0) {
                        adultoid.dovishness();
                    }
                    JsonElement jsonElement2 = jsonElement;
                    Intrinsics.beachfront(jsonElement2);
                    List list = h1.A0;
                    String asString = jsonElement2.getAsString();
                    Intrinsics.checkNotNullExpressionValue(asString, "getAsString(...)");
                    if (asJsonObject == null) {
                        jsonObject2 = new JsonObject();
                    } else {
                        Intrinsics.beachfront(asJsonObject);
                        jsonObject2 = asJsonObject;
                    }
                    String strDern = splinterproof.dern(jsonObject2, asString);
                    if (strDern != null) {
                        arrayList.add(strDern);
                    }
                    i = i2;
                }
            }
            vd1VarAttabal.a(yd0VarB, arrayList);
            return vd1VarAttabal.a();
        } catch (Exception e) {
            y13.a(e);
            return null;
        }
    }

    public static Pair g(JsonObject jsonObject) {
        try {
            if (kn0.a("GoogleMobileAds", 2)) {
                for (String str : kn0.a().taiyuan("Signal adapters: " + jsonObject)) {
                    Thread.currentThread().getName();
                }
            }
            String strA = cb1.a(jsonObject, "adapter_class_name", "");
            if (strA.length() == 0) {
                return null;
            }
            cutwater cutwaterVarR = sl.r();
            Intrinsics.checkNotNullExpressionValue(cutwaterVarR, "newBuilder(...)");
            ul ulVarAttabal = dehortation.attabal(cutwaterVarR);
            ulVarAttabal.a(strA);
            ulVarAttabal.b(cb1.a(jsonObject, "collect_signals", false));
            ulVarAttabal.a(true);
            zd0 zd0VarB = ulVarAttabal.b();
            JsonElement jsonElement = jsonObject.get("data");
            JsonObject asJsonObject = jsonElement != null ? jsonElement.getAsJsonObject() : null;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (asJsonObject != null) {
                for (Map.Entry<String, JsonElement> entry : asJsonObject.entrySet()) {
                    Intrinsics.beachfront(entry);
                    String key = entry.getKey();
                    JsonElement value = entry.getValue();
                    Intrinsics.beachfront(key);
                    Intrinsics.beachfront(value);
                    Pair pair = new Pair(key, value.getAsString());
                    linkedHashMap.put(pair.getFirst(), pair.getSecond());
                }
            }
            ulVarAttabal.a(zd0VarB, linkedHashMap);
            return new Pair(strA, ulVarAttabal.a());
        } catch (Exception e) {
            y13.a(e);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Pair a(JsonObject json, long j) {
        Pair pair;
        JsonObject jsonObject;
        Object obj;
        JsonObject jsonObject2;
        Object obj2;
        String str;
        String string;
        JsonElement jsonElement;
        JsonObject asJsonObject;
        JsonObject asJsonObject2;
        Intrinsics.checkNotNullParameter(json, "json");
        Pair pair2 = null;
        try {
            if (kn0.a("GoogleMobileAds", 2)) {
                for (String str2 : kn0.a().taiyuan("AppSettings raw response: " + json)) {
                    Thread.currentThread().getName();
                }
            }
            if (cb1.a(json)) {
                String strA = cb1.a(json, "appSettingsJson");
                JsonObject jsonObject3 = (JsonObject) new Gson().fromJson(strA, JsonObject.class);
                if (cb1.a(jsonObject3, "status", 0) != 1) {
                    JsonElement jsonElement2 = jsonObject3.get("errorReason");
                    String asString = jsonElement2 != null ? jsonElement2.getAsString() : null;
                    if (asString == null) {
                        asString = "status is not 1, was " + cb1.a(jsonObject3, "status", 0);
                    }
                    y13.a(asString, null, 6);
                } else {
                    long jE = cb1.e(jsonObject3, "cache_ttl_sec");
                    JsonObject asJsonObject3 = jsonObject3.getAsJsonObject("common_settings");
                    JsonArray asJsonArray = asJsonObject3 != null ? asJsonObject3.getAsJsonArray("loeid") : null;
                    ArrayList arrayList = new ArrayList();
                    if (asJsonArray != null) {
                        int i = 0;
                        for (JsonElement jsonElement3 : asJsonArray) {
                            int i2 = i + 1;
                            if (i < 0) {
                                adultoid.dovishness();
                            }
                            JsonElement jsonElement4 = jsonElement3;
                            Intrinsics.beachfront(jsonElement4);
                            arrayList.add(Long.valueOf(jsonElement4.getAsLong()));
                            Unit unit = Unit.f29295attabal;
                            i = i2;
                        }
                    }
                    JsonObject asJsonObject4 = jsonObject3.getAsJsonObject("ad_unit_patterns");
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    if (asJsonObject4 != null) {
                        for (Map.Entry<String, JsonElement> entry : asJsonObject4.entrySet()) {
                            Intrinsics.beachfront(entry);
                            String key = entry.getKey();
                            JsonElement value = entry.getValue();
                            Intrinsics.beachfront(key);
                            Intrinsics.beachfront(value);
                            JsonArray asJsonArray2 = value.getAsJsonArray();
                            Intrinsics.checkNotNullExpressionValue(asJsonArray2, "getAsJsonArray(...)");
                            z6 z6VarA = a(asJsonArray2);
                            Pair pair3 = z6VarA != null ? new Pair(key, z6VarA) : null;
                            if (pair3 != null) {
                                linkedHashMap.put(pair3.getFirst(), pair3.getSecond());
                                Unit unit2 = Unit.f29295attabal;
                            }
                        }
                    }
                    JsonArray asJsonArray3 = jsonObject3.getAsJsonArray("ad_unit_id_settings");
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    if (asJsonArray3 != null) {
                        for (JsonElement jsonElement5 : asJsonArray3.getAsJsonArray()) {
                            Intrinsics.beachfront(jsonElement5);
                            JsonObject asJsonObject5 = jsonElement5.getAsJsonObject();
                            Intrinsics.checkNotNullExpressionValue(asJsonObject5, "getAsJsonObject(...)");
                            Pair pairB = b(asJsonObject5);
                            if (pairB != null) {
                                linkedHashMap2.put(pairB.getFirst(), pairB.getSecond());
                                Unit unit3 = Unit.f29295attabal;
                            }
                        }
                    }
                    JsonArray asJsonArray4 = jsonObject3.getAsJsonArray("ad_unit_id_settings");
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                    if (asJsonArray4 != null) {
                        for (JsonElement jsonElement6 : asJsonArray4.getAsJsonArray()) {
                            Intrinsics.beachfront(jsonElement6);
                            JsonObject asJsonObject6 = jsonElement6.getAsJsonObject();
                            Intrinsics.checkNotNullExpressionValue(asJsonObject6, "getAsJsonObject(...)");
                            Pair pairA = a(asJsonObject6);
                            if (pairA != null) {
                                linkedHashMap3.put(pairA.getFirst(), pairA.getSecond());
                                Unit unit4 = Unit.f29295attabal;
                            }
                        }
                    }
                    JsonArray asJsonArray5 = jsonObject3.getAsJsonArray("signal_adapters");
                    LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                    if (asJsonArray5 != null) {
                        for (JsonElement jsonElement7 : asJsonArray5.getAsJsonArray()) {
                            Intrinsics.beachfront(jsonElement7);
                            JsonObject asJsonObject7 = jsonElement7.getAsJsonObject();
                            Intrinsics.checkNotNullExpressionValue(asJsonObject7, "getAsJsonObject(...)");
                            Pair pairG = g(asJsonObject7);
                            if (pairG != null) {
                                linkedHashMap4.put(pairG.getFirst(), pairG.getSecond());
                                Unit unit5 = Unit.f29295attabal;
                            }
                        }
                    }
                    JsonArray asJsonArray6 = jsonObject3.getAsJsonArray("adapter_settings");
                    LinkedHashMap linkedHashMap5 = new LinkedHashMap();
                    if (asJsonArray6 != null) {
                        for (JsonElement jsonElement8 : asJsonArray6.getAsJsonArray()) {
                            Intrinsics.beachfront(jsonElement8);
                            JsonObject asJsonObject8 = jsonElement8.getAsJsonObject();
                            Intrinsics.checkNotNullExpressionValue(asJsonObject8, "getAsJsonObject(...)");
                            pair = pair2;
                            try {
                                Pair pairA2 = a(asJsonObject8, AppLovinMediationProvider.ADMOB);
                                if (pairA2 != null) {
                                    linkedHashMap5.put(pairA2.getFirst(), pairA2.getSecond());
                                    Unit unit6 = Unit.f29295attabal;
                                }
                                pair2 = pair;
                            } catch (Exception e) {
                                e = e;
                                y13.a(e);
                                return pair;
                            }
                        }
                    }
                    pair = pair2;
                    JsonArray asJsonArray7 = jsonObject3.getAsJsonArray("adapter_settings");
                    LinkedHashMap linkedHashMap6 = new LinkedHashMap();
                    if (asJsonArray7 != null) {
                        for (JsonElement jsonElement9 : asJsonArray7.getAsJsonArray()) {
                            Intrinsics.beachfront(jsonElement9);
                            JsonObject asJsonObject9 = jsonElement9.getAsJsonObject();
                            Intrinsics.checkNotNullExpressionValue(asJsonObject9, "getAsJsonObject(...)");
                            Pair pairA3 = a(asJsonObject9, "ad_manager");
                            if (pairA3 != null) {
                                linkedHashMap6.put(pairA3.getFirst(), pairA3.getSecond());
                                Unit unit7 = Unit.f29295attabal;
                            }
                        }
                    }
                    JsonElement jsonElement10 = jsonObject3.get("initializer_settings");
                    if (jsonElement10 != null) {
                        asJsonObject2 = jsonElement10.getAsJsonObject();
                    } else {
                        jsonObject = pair;
                    }
                    if (jsonObject == 0 || (jsonElement = jsonObject.get("config")) == null) {
                        jsonObject = asJsonObject2;
                        jsonObject = asJsonObject2;
                        obj = pair;
                    } else {
                        asJsonObject = jsonElement.getAsJsonObject();
                    }
                    if (obj == null) {
                        jsonObject = asJsonObject2;
                        obj = asJsonObject;
                        jsonObject2 = new JsonObject();
                    } else {
                        jsonObject = asJsonObject2;
                        obj = asJsonObject;
                        Intrinsics.beachfront(obj);
                        jsonObject2 = obj;
                    }
                    LinkedHashMap linkedHashMap7 = new LinkedHashMap();
                    Iterator<Map.Entry<String, JsonElement>> it = jsonObject2.entrySet().iterator();
                    while (it.hasNext()) {
                        Map.Entry<String, JsonElement> next = it.next();
                        Intrinsics.beachfront(next);
                        Iterator<Map.Entry<String, JsonElement>> it2 = it;
                        String key2 = next.getKey();
                        JsonElement value2 = next.getValue();
                        Intrinsics.beachfront(key2);
                        Intrinsics.beachfront(value2);
                        JsonObject asJsonObject10 = value2.getAsJsonObject();
                        Intrinsics.checkNotNullExpressionValue(asJsonObject10, "getAsJsonObject(...)");
                        j8 j8VarD = d(asJsonObject10);
                        Pair pair4 = j8VarD != null ? new Pair(key2, j8VarD) : pair;
                        if (pair4 != null) {
                            linkedHashMap7.put(pair4.getFirst(), pair4.getSecond());
                            Unit unit8 = Unit.f29295attabal;
                        }
                        it = it2;
                        asJsonObject3 = asJsonObject3;
                    }
                    JsonObject jsonObject4 = asJsonObject3;
                    untying untyingVarZ = vf.z();
                    Intrinsics.checkNotNullExpressionValue(untyingVarZ, "newBuilder(...)");
                    eg egVarAttabal = bleacherite.attabal(untyingVarZ);
                    egVarAttabal.a(j);
                    egVarAttabal.b(jE);
                    egVarAttabal.a(strA);
                    egVarAttabal.a(egVarAttabal.h(), arrayList);
                    if (jsonObject4 != null) {
                        string = jsonObject4.toString();
                    } else {
                        obj2 = pair;
                    }
                    if (obj2 == null) {
                        obj2 = string;
                        str = "";
                    } else {
                        obj2 = string;
                        Intrinsics.beachfront(obj2);
                        str = obj2;
                    }
                    egVarAttabal.b(str);
                    egVarAttabal.d(egVarAttabal.e(), linkedHashMap);
                    egVarAttabal.g(egVarAttabal.i(), linkedHashMap4);
                    egVarAttabal.f(egVarAttabal.g(), linkedHashMap5);
                    egVarAttabal.a(egVarAttabal.b(), linkedHashMap6);
                    egVarAttabal.e(egVarAttabal.f(), linkedHashMap7);
                    egVarAttabal.c(egVarAttabal.d(), linkedHashMap2);
                    egVarAttabal.b(egVarAttabal.c(), linkedHashMap3);
                    return new Pair(egVarAttabal.a(), jsonObject3);
                }
            }
            return null;
        } catch (Exception e2) {
            e = e2;
            pair = null;
        }
    }

    public static mv a(JsonObject jsonObject, JsonObject consentStrings) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        Intrinsics.checkNotNullParameter(consentStrings, "consentStrings");
        try {
            uniterm builder = mv.v();
            Intrinsics.checkNotNullExpressionValue(builder, "newBuilder(...)");
            Intrinsics.checkNotNullParameter(builder, "builder");
            String value = new Gson().toJson((JsonElement) consentStrings);
            Intrinsics.checkNotNullExpressionValue(value, "toJson(...)");
            Intrinsics.checkNotNullParameter(value, "value");
            builder.competently(value);
            Intrinsics.checkNotNullParameter(jsonObject, "<this>");
            Intrinsics.checkNotNullParameter("consent_state", X3.i.W);
            String value2 = jsonObject.get("consent_state").getAsString();
            Intrinsics.checkNotNullExpressionValue(value2, "getAsString(...)");
            Intrinsics.checkNotNullParameter(value2, "value");
            builder.marial(value2);
            BaseEncoding baseEncodingDern = BaseEncoding.dern();
            Intrinsics.checkNotNullParameter(jsonObject, "<this>");
            Intrinsics.checkNotNullParameter("allowlist", X3.i.W);
            String asString = jsonObject.get("allowlist").getAsString();
            Intrinsics.checkNotNullExpressionValue(asString, "getAsString(...)");
            gt value3 = gt.a(baseEncodingDern.wireman(asString));
            Intrinsics.checkNotNullExpressionValue(value3, "parseFrom(...)");
            Intrinsics.checkNotNullParameter(value3, "value");
            builder.dern(value3);
            Intrinsics.checkNotNullParameter(jsonObject, "<this>");
            Intrinsics.checkNotNullParameter("client_pat", X3.i.W);
            String asString2 = jsonObject.get("client_pat").getAsString();
            Intrinsics.checkNotNullExpressionValue(asString2, "getAsString(...)");
            b12 value4 = b12.a(Base64.decode(asString2, 0));
            Intrinsics.checkNotNullExpressionValue(value4, "parseFrom(...)");
            Intrinsics.checkNotNullParameter(value4, "value");
            builder.attabal(value4);
            Intrinsics.checkNotNullParameter(jsonObject, "<this>");
            Intrinsics.checkNotNullParameter("client_pre", X3.i.W);
            String asString3 = jsonObject.get("client_pre").getAsString();
            Intrinsics.checkNotNullExpressionValue(asString3, "getAsString(...)");
            n32 value5 = n32.a(Base64.decode(asString3, 0));
            Intrinsics.checkNotNullExpressionValue(value5, "parseFrom(...)");
            Intrinsics.checkNotNullParameter(value5, "value");
            builder.wireman(value5);
            Map mapImpromptu = builder.impromptu();
            Intrinsics.checkNotNullExpressionValue(mapImpromptu, "getConcatenatedSignalsMapMap(...)");
            zd0 zd0Var = new zd0(mapImpromptu);
            Gson gson = new Gson();
            Intrinsics.checkNotNullParameter(jsonObject, "<this>");
            Intrinsics.checkNotNullParameter("arr_params", X3.i.W);
            String asString4 = jsonObject.get("arr_params").getAsString();
            Intrinsics.checkNotNullExpressionValue(asString4, "getAsString(...)");
            Map<String, JsonElement> mapAsMap = ((JsonObject) gson.fromJson(asString4, JsonObject.class)).asMap();
            Intrinsics.checkNotNullExpressionValue(mapAsMap, "asMap(...)");
            LinkedHashMap map = new LinkedHashMap(polder.marial(mapAsMap.size()));
            for (Object obj : mapAsMap.entrySet()) {
                map.put(((Map.Entry) obj).getKey(), ((JsonElement) ((Map.Entry) obj).getValue()).getAsJsonPrimitive().getAsString());
            }
            Intrinsics.checkNotNullParameter(zd0Var, "<this>");
            Intrinsics.checkNotNullParameter(map, "map");
            builder.beachfront(map);
            jsonObject.remove("client_pat");
            jsonObject.remove("client_pre");
            jsonObject.remove("arr_params");
            xm0 xm0VarA = builder.a();
            Intrinsics.checkNotNullExpressionValue(xm0VarA, "build(...)");
            return (mv) xm0VarA;
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

    public static Pair a(JsonObject jsonObject) {
        try {
            if (kn0.a("GoogleMobileAds", 2)) {
                for (String str : kn0.a().taiyuan("AppSettings MediationConfig: " + jsonObject)) {
                    Thread.currentThread().getName();
                }
            }
            String strA = cb1.a(jsonObject, "format");
            Locale locale = Locale.ROOT;
            String lowerCase = strA.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            String lowerCase2 = cb1.a(jsonObject, "ad_unit_id").toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
            if (lowerCase.length() != 0 && lowerCase2.length() != 0) {
                JsonObject asJsonObject = jsonObject.getAsJsonObject("mediation_config");
                JsonArray asJsonArray = asJsonObject != null ? asJsonObject.getAsJsonArray("ad_networks") : null;
                ArrayList arrayList = new ArrayList();
                if (asJsonArray != null) {
                    int i = 0;
                    for (JsonElement jsonElement : asJsonArray) {
                        int i2 = i + 1;
                        if (i < 0) {
                            adultoid.dovishness();
                        }
                        JsonElement jsonElement2 = jsonElement;
                        Intrinsics.beachfront(jsonElement2);
                        JsonObject asJsonObject2 = jsonElement2.getAsJsonObject();
                        Intrinsics.checkNotNullExpressionValue(asJsonObject2, "getAsJsonObject(...)");
                        td1 td1VarF = f(asJsonObject2);
                        if (td1VarF != null) {
                            arrayList.add(td1VarF);
                        }
                        i = i2;
                    }
                }
                if (!arrayList.isEmpty()) {
                    String str2 = lowerCase2 + "," + lowerCase;
                    kith kithVarQ = ye1.q();
                    Intrinsics.checkNotNullExpressionValue(kithVarQ, "newBuilder(...)");
                    af1 af1VarAttabal = certifiable.attabal(kithVarQ);
                    af1VarAttabal.a(af1VarAttabal.b(), arrayList);
                    return new Pair(str2, af1VarAttabal.a());
                }
            }
            return null;
        } catch (Exception e) {
            y13.a(e);
            return null;
        }
    }

    public static Pair a(JsonObject jsonObject, String str) {
        try {
            if (kn0.a("GoogleMobileAds", 2)) {
                for (String str2 : kn0.a().taiyuan("Adapter settings: " + jsonObject)) {
                    Thread.currentThread().getName();
                }
            }
            String strA = cb1.a(jsonObject, "adapter_class_name", "");
            if (strA.length() == 0) {
                return null;
            }
            JsonElement jsonElement = jsonObject.get("permission_set");
            JsonArray asJsonArray = jsonElement != null ? jsonElement.getAsJsonArray() : null;
            ArrayList arrayList = new ArrayList();
            if (asJsonArray != null) {
                int i = 0;
                for (JsonElement jsonElement2 : asJsonArray) {
                    int i2 = i + 1;
                    if (i < 0) {
                        adultoid.dovishness();
                    }
                    JsonElement jsonElement3 = jsonElement2;
                    Intrinsics.beachfront(jsonElement3);
                    JsonObject asJsonObject = jsonElement3.getAsJsonObject();
                    Intrinsics.checkNotNullExpressionValue(asJsonObject, "getAsJsonObject(...)");
                    sl slVarA = a(asJsonObject, strA, str);
                    Pair pair = slVarA != null ? new Pair(strA, slVarA) : null;
                    if (pair != null) {
                        arrayList.add(pair);
                    }
                    i = i2;
                }
            }
            return (Pair) CollectionsKt.firstOrNull(arrayList);
        } catch (Exception e) {
            y13.a(e);
            return null;
        }
    }

    public static z6 a(JsonArray jsonArray) {
        try {
            enthrallment enthrallmentVarQ = z6.q();
            Intrinsics.checkNotNullExpressionValue(enthrallmentVarQ, "newBuilder(...)");
            b7 b7VarAttabal = graveside.attabal(enthrallmentVarQ);
            if (kn0.a("GoogleMobileAds", 2)) {
                for (String str : kn0.a().taiyuan("AdUnitPatterns: " + jsonArray)) {
                    Thread.currentThread().getName();
                }
            }
            yd0 yd0VarB = b7VarAttabal.b();
            ArrayList arrayList = new ArrayList();
            if (jsonArray != null) {
                int i = 0;
                for (JsonElement jsonElement : jsonArray) {
                    int i2 = i + 1;
                    if (i < 0) {
                        adultoid.dovishness();
                    }
                    JsonElement jsonElement2 = jsonElement;
                    Intrinsics.beachfront(jsonElement2);
                    JsonObject asJsonObject = jsonElement2.getAsJsonObject();
                    Intrinsics.checkNotNullExpressionValue(asJsonObject, "getAsJsonObject(...)");
                    arrayList.add(c(asJsonObject));
                    i = i2;
                }
            }
            b7VarAttabal.a(yd0VarB, arrayList);
            return b7VarAttabal.a();
        } catch (Exception e) {
            y13.a(e);
            return null;
        }
    }
}
