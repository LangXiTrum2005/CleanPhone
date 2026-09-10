package saneness;

import ads_mobile_sdk.a1;
import ads_mobile_sdk.ay1;
import ads_mobile_sdk.cb1;
import ads_mobile_sdk.ck2;
import ads_mobile_sdk.d1;
import ads_mobile_sdk.e1;
import ads_mobile_sdk.g1;
import ads_mobile_sdk.h1;
import ads_mobile_sdk.k7;
import ads_mobile_sdk.kn0;
import ads_mobile_sdk.m22;
import ads_mobile_sdk.n1;
import ads_mobile_sdk.ns1;
import ads_mobile_sdk.os1;
import ads_mobile_sdk.q6;
import ads_mobile_sdk.rt1;
import ads_mobile_sdk.sz1;
import ads_mobile_sdk.wx0;
import ads_mobile_sdk.z52;
import ads_mobile_sdk.zg2;
import ads_mobile_sdk.zx1;
import android.net.Uri;
import android.os.Bundle;
import com.applovin.sdk.AppLovinEventParameters;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.ironsource.X3;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.function.UnaryOperator;
import p002kotlin.Unit;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.Ref$ObjectRef;
import p002kotlin.time.DurationUnit;

/* JADX INFO: loaded from: classes.dex */
public abstract class splinterproof {
    public static int attabal(String str) {
        e1[] e1VarArr = e1.a;
        if (Intrinsics.wireman(str, X3.i.C)) {
            return 6;
        }
        return Intrinsics.wireman(str, X3.i.D) ? 7 : -1;
    }

    public static String dern(JsonObject adapterData, String className) {
        Intrinsics.checkNotNullParameter(className, "className");
        Intrinsics.checkNotNullParameter(adapterData, "adapterData");
        if (h1.A0.contains(className)) {
            Intrinsics.checkNotNullParameter("class_name", X3.i.W);
            Intrinsics.checkNotNullParameter(className, "default");
            if (adapterData != null) {
                try {
                    Intrinsics.checkNotNullParameter(adapterData, "<this>");
                    Intrinsics.checkNotNullParameter("class_name", X3.i.W);
                    String asString = adapterData.get("class_name").getAsString();
                    Intrinsics.checkNotNullExpressionValue(asString, "getAsString(...)");
                    return asString;
                } catch (Exception unused) {
                }
            }
        }
        return className;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v1, types: [T, com.google.gson.JsonObject] */
    /* JADX WARN: Type inference failed for: r3v149, types: [T, com.google.gson.JsonObject, java.lang.Object] */
    public static h1 saneness(JsonObject json, int i) {
        h1 h1Var;
        q6 q6Var;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        String str;
        ArrayList arrayList4;
        ArrayList arrayList5;
        ns1 ns1Var;
        ArrayList arrayList6;
        ArrayList arrayList7;
        ArrayList arrayList8;
        ArrayList arrayList9;
        ArrayList arrayList10;
        ArrayList arrayList11;
        JsonArray jsonArrayD;
        Intrinsics.checkNotNullParameter(json, "json");
        try {
            ArrayList arrayList12 = new ArrayList();
            q6 q6Var2 = q6.UNKNOWN;
            ArrayList arrayList13 = new ArrayList();
            ArrayList arrayList14 = new ArrayList();
            ArrayList arrayList15 = new ArrayList();
            d1 d1Var = d1.FORMAT_DEFAULT;
            ArrayList arrayList16 = new ArrayList();
            ArrayList arrayList17 = new ArrayList();
            ArrayList arrayList18 = new ArrayList();
            ArrayList arrayList19 = new ArrayList();
            ArrayList arrayList20 = new ArrayList();
            ArrayList arrayList21 = new ArrayList();
            h1Var = null;
            try {
                ArrayList arrayList22 = new ArrayList();
                ArrayList arrayList23 = new ArrayList();
                ArrayList arrayList24 = new ArrayList();
                ArrayList arrayList25 = new ArrayList();
                ArrayList arrayList26 = arrayList21;
                ArrayList arrayList27 = new ArrayList();
                final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                ArrayList arrayList28 = arrayList20;
                ref$ObjectRef.element = new JsonObject();
                JsonObject jsonObject = new JsonObject();
                JsonObject jsonObject2 = new JsonObject();
                p002kotlin.time.saneness.Companion companion = p002kotlin.time.saneness.INSTANCE;
                long jDern = companion.dern();
                ay1 ay1Var = new ay1(zx1.UNKNOWN, sz1.d, false, "", "");
                g1 g1Var = g1.FORMAT_DEFAULT;
                long jDern2 = companion.dern();
                JsonObject jsonObject3 = new JsonObject();
                ArrayList arrayList29 = new ArrayList();
                Bundle bundle = Bundle.EMPTY;
                ck2 ck2Var = new ck2();
                z52 z52Var = z52.FIFO;
                JsonObject jsonObject4 = new JsonObject();
                long jDern3 = companion.dern();
                ArrayList arrayList30 = arrayList27;
                String str2 = "";
                q6 q6Var3 = q6Var2;
                d1 d1Var2 = d1Var;
                String str3 = "json";
                JsonObject jsonObject5 = new JsonObject();
                long jMolybdenite = jDern;
                ay1 ay1Var2 = ay1Var;
                long jMolybdenite2 = jDern2;
                JsonObject jsonObject6 = jsonObject3;
                Bundle bundle2 = bundle;
                ck2 ck2Var2 = ck2Var;
                z52 z52Var2 = z52Var;
                JsonObject jsonObject7 = jsonObject4;
                long jMolybdenite3 = jDern3;
                String str4 = str2;
                String str5 = str4;
                String str6 = str5;
                String str7 = str6;
                String str8 = str7;
                String str9 = str8;
                String str10 = str9;
                String str11 = str10;
                String str12 = str11;
                String str13 = str12;
                String str14 = str13;
                String str15 = str14;
                String str16 = str15;
                String str17 = str16;
                String str18 = str17;
                String str19 = str18;
                double asDouble = 0.0d;
                k7 k7Var = null;
                String str20 = null;
                wx0 wx0Var = null;
                String str21 = null;
                zg2 zg2Var = null;
                rt1 rt1Var = null;
                m22 m22Var = null;
                ns1 ns1Var2 = null;
                boolean z = false;
                boolean z2 = false;
                boolean z3 = false;
                boolean z4 = false;
                int i2 = -1;
                boolean z5 = false;
                boolean z6 = false;
                boolean z7 = false;
                boolean z8 = false;
                boolean z9 = false;
                boolean z10 = false;
                boolean z11 = false;
                boolean z12 = false;
                boolean z13 = false;
                boolean z14 = false;
                boolean z15 = false;
                boolean z16 = false;
                boolean z17 = false;
                JsonObject jsonObject8 = jsonObject2;
                JsonObject jsonObject9 = jsonObject;
                String str22 = str19;
                String str23 = str22;
                boolean z18 = false;
                for (Map.Entry<String, JsonElement> entry : json.entrySet()) {
                    Intrinsics.beachfront(entry);
                    String key = entry.getKey();
                    ArrayList arrayList31 = arrayList25;
                    JsonElement value = entry.getValue();
                    if (key != null) {
                        arrayList = arrayList22;
                        arrayList2 = arrayList19;
                        switch (key.hashCode()) {
                            case -2138196627:
                                arrayList23 = arrayList23;
                                arrayList14 = arrayList14;
                                arrayList31 = arrayList31;
                                arrayList24 = arrayList24;
                                str2 = str2;
                                arrayList3 = arrayList13;
                                str = str3;
                                arrayList4 = arrayList12;
                                if (key.equals("ad_source_instance_name")) {
                                    String asString = value.getAsString();
                                    Intrinsics.checkNotNullExpressionValue(asString, "getAsString(...)");
                                    Unit unit = Unit.f29295attabal;
                                    str9 = asString;
                                } else {
                                    com.google.common.base.triweekly triweeklyVar = kn0.a;
                                    kn0.a(new a1(key));
                                    Unit unit2 = Unit.f29295attabal;
                                }
                                arrayList25 = arrayList31;
                                arrayList12 = arrayList4;
                                arrayList23 = arrayList23;
                                arrayList22 = arrayList;
                                arrayList19 = arrayList2;
                                arrayList14 = arrayList14;
                                str3 = str;
                                arrayList13 = arrayList3;
                                str2 = str2;
                                arrayList24 = arrayList24;
                                break;
                            case -1980587809:
                                arrayList23 = arrayList23;
                                arrayList14 = arrayList14;
                                arrayList31 = arrayList31;
                                arrayList24 = arrayList24;
                                str2 = str2;
                                arrayList3 = arrayList13;
                                str = str3;
                                arrayList4 = arrayList12;
                                if (key.equals("debug_signals")) {
                                    JsonObject asJsonObject = value.getAsJsonObject();
                                    Intrinsics.checkNotNullExpressionValue(asJsonObject, "getAsJsonObject(...)");
                                    Unit unit3 = Unit.f29295attabal;
                                    jsonObject9 = asJsonObject;
                                } else {
                                    com.google.common.base.triweekly triweeklyVar2 = kn0.a;
                                    kn0.a(new a1(key));
                                    Unit unit4 = Unit.f29295attabal;
                                }
                                arrayList25 = arrayList31;
                                arrayList12 = arrayList4;
                                arrayList23 = arrayList23;
                                arrayList22 = arrayList;
                                arrayList19 = arrayList2;
                                arrayList14 = arrayList14;
                                str3 = str;
                                arrayList13 = arrayList3;
                                str2 = str2;
                                arrayList24 = arrayList24;
                                break;
                            case -1965512151:
                                arrayList23 = arrayList23;
                                arrayList14 = arrayList14;
                                arrayList31 = arrayList31;
                                arrayList24 = arrayList24;
                                str2 = str2;
                                arrayList3 = arrayList13;
                                str = str3;
                                arrayList4 = arrayList12;
                                if (key.equals("omid_settings")) {
                                    JsonObject asJsonObject2 = value.getAsJsonObject();
                                    Intrinsics.checkNotNullExpressionValue(asJsonObject2, "getAsJsonObject(...)");
                                    Intrinsics.checkNotNullParameter(asJsonObject2, str);
                                    int iA = cb1.a(asJsonObject2, "media_type", -1);
                                    zx1 zx1Var = iA != 0 ? iA != 1 ? zx1.UNKNOWN : zx1.VIDEO : zx1.DISPLAY;
                                    ay1 ay1Var3 = new ay1(zx1Var, nuque.f37229attabal[zx1Var.ordinal()] == 1 ? sz1.d : sz1.c, cb1.a(asJsonObject2, "javascript_session_service_enabled", true), cb1.a(asJsonObject2, "omid_partner_name", str2), cb1.a(asJsonObject2, "omid_html", str2));
                                    Unit unit5 = Unit.f29295attabal;
                                    arrayList25 = arrayList31;
                                    arrayList12 = arrayList4;
                                    arrayList23 = arrayList23;
                                    arrayList22 = arrayList;
                                    arrayList19 = arrayList2;
                                    arrayList14 = arrayList14;
                                    ay1Var2 = ay1Var3;
                                } else {
                                    com.google.common.base.triweekly triweeklyVar3 = kn0.a;
                                    kn0.a(new a1(key));
                                    Unit unit6 = Unit.f29295attabal;
                                    arrayList25 = arrayList31;
                                    arrayList12 = arrayList4;
                                    arrayList23 = arrayList23;
                                    arrayList22 = arrayList;
                                    arrayList19 = arrayList2;
                                    arrayList14 = arrayList14;
                                }
                                str3 = str;
                                arrayList13 = arrayList3;
                                str2 = str2;
                                arrayList24 = arrayList24;
                                break;
                            case -1964744830:
                                arrayList23 = arrayList23;
                                arrayList14 = arrayList14;
                                arrayList31 = arrayList31;
                                arrayList24 = arrayList24;
                                str2 = str2;
                                arrayList3 = arrayList13;
                                str = str3;
                                arrayList4 = arrayList12;
                                if (key.equals("offline_ad_config")) {
                                    JsonObject asJsonObject3 = value.getAsJsonObject();
                                    Intrinsics.checkNotNullExpressionValue(asJsonObject3, "getAsJsonObject(...)");
                                    rt1 rt1VarAttabal = mucocutaneous.attabal(asJsonObject3);
                                    Unit unit7 = Unit.f29295attabal;
                                    rt1Var = rt1VarAttabal;
                                    arrayList25 = arrayList31;
                                    arrayList12 = arrayList4;
                                    arrayList23 = arrayList23;
                                    arrayList22 = arrayList;
                                    arrayList19 = arrayList2;
                                    arrayList14 = arrayList14;
                                    str3 = str;
                                    arrayList13 = arrayList3;
                                    str2 = str2;
                                    arrayList24 = arrayList24;
                                } else {
                                    com.google.common.base.triweekly triweeklyVar4 = kn0.a;
                                    kn0.a(new a1(key));
                                    Unit unit8 = Unit.f29295attabal;
                                    arrayList25 = arrayList31;
                                    arrayList12 = arrayList4;
                                    arrayList23 = arrayList23;
                                    arrayList22 = arrayList;
                                    arrayList19 = arrayList2;
                                    arrayList14 = arrayList14;
                                    str3 = str;
                                    arrayList13 = arrayList3;
                                    str2 = str2;
                                    arrayList24 = arrayList24;
                                }
                                break;
                            case -1840512279:
                                arrayList23 = arrayList23;
                                arrayList14 = arrayList14;
                                arrayList31 = arrayList31;
                                arrayList24 = arrayList24;
                                str2 = str2;
                                arrayList3 = arrayList13;
                                str = str3;
                                arrayList4 = arrayList12;
                                if (key.equals("presentation_urls")) {
                                    JsonArray asJsonArray = value.getAsJsonArray();
                                    Intrinsics.checkNotNullExpressionValue(asJsonArray, "getAsJsonArray(...)");
                                    int i3 = 0;
                                    for (JsonElement jsonElement : asJsonArray) {
                                        int i4 = i3 + 1;
                                        if (i3 < 0) {
                                            p002kotlin.collections.adultoid.dovishness();
                                        }
                                        JsonElement jsonElement2 = jsonElement;
                                        Intrinsics.beachfront(jsonElement2);
                                        String asString2 = jsonElement2.getAsString();
                                        Intrinsics.checkNotNullExpressionValue(asString2, "getAsString(...)");
                                        Uri uri = Uri.parse(asString2);
                                        if (uri != null) {
                                            arrayList5 = arrayList26;
                                            arrayList5.add(uri);
                                            Unit unit9 = Unit.f29295attabal;
                                        } else {
                                            arrayList5 = arrayList26;
                                        }
                                        arrayList26 = arrayList5;
                                        i3 = i4;
                                    }
                                    Unit unit10 = Unit.f29295attabal;
                                    arrayList26 = arrayList26;
                                    arrayList25 = arrayList31;
                                    arrayList12 = arrayList4;
                                    arrayList23 = arrayList23;
                                    arrayList22 = arrayList;
                                    arrayList19 = arrayList2;
                                    arrayList14 = arrayList14;
                                    str3 = str;
                                    arrayList13 = arrayList3;
                                    str2 = str2;
                                    arrayList24 = arrayList24;
                                }
                                com.google.common.base.triweekly triweeklyVar5 = kn0.a;
                                kn0.a(new a1(key));
                                Unit unit11 = Unit.f29295attabal;
                                arrayList25 = arrayList31;
                                arrayList12 = arrayList4;
                                arrayList23 = arrayList23;
                                arrayList22 = arrayList;
                                arrayList19 = arrayList2;
                                arrayList14 = arrayList14;
                                str3 = str;
                                arrayList13 = arrayList3;
                                str2 = str2;
                                arrayList24 = arrayList24;
                                break;
                            case -1828733410:
                                arrayList23 = arrayList23;
                                arrayList14 = arrayList14;
                                String str24 = str3;
                                arrayList31 = arrayList31;
                                arrayList4 = arrayList12;
                                arrayList24 = arrayList24;
                                str2 = str2;
                                arrayList3 = arrayList13;
                                if (key.equals("network_ping_config")) {
                                    Intrinsics.beachfront(value);
                                    Intrinsics.checkNotNullParameter(value, str24);
                                    if (value.isJsonObject() && value.getAsJsonObject().has("ping_strategy")) {
                                        JsonElement jsonElement3 = value.getAsJsonObject().get("ping_strategy");
                                        if (jsonElement3.isJsonObject()) {
                                            JsonObject asJsonObject4 = jsonElement3.getAsJsonObject();
                                            Intrinsics.checkNotNullExpressionValue(asJsonObject4, "getAsJsonObject(...)");
                                            Intrinsics.checkNotNullParameter(asJsonObject4, str24);
                                            ns1Var = new ns1(new os1(cb1.a(asJsonObject4, "max_attempts", 1), cb1.a(asJsonObject4, "initial_backoff_ms", 0), cb1.a(asJsonObject4, "buffer_after_max_attempts", false), cb1.c(asJsonObject4, "backoff_multiplier")));
                                        }
                                        Unit unit12 = Unit.f29295attabal;
                                        ns1Var2 = ns1Var;
                                        str = str24;
                                        arrayList25 = arrayList31;
                                        arrayList12 = arrayList4;
                                        arrayList23 = arrayList23;
                                        arrayList22 = arrayList;
                                        arrayList19 = arrayList2;
                                        arrayList14 = arrayList14;
                                        str3 = str;
                                        arrayList13 = arrayList3;
                                        str2 = str2;
                                        arrayList24 = arrayList24;
                                        break;
                                    }
                                    ns1Var = null;
                                    Unit unit13 = Unit.f29295attabal;
                                    ns1Var2 = ns1Var;
                                    str = str24;
                                    arrayList25 = arrayList31;
                                    arrayList12 = arrayList4;
                                    arrayList23 = arrayList23;
                                    arrayList22 = arrayList;
                                    arrayList19 = arrayList2;
                                    arrayList14 = arrayList14;
                                    str3 = str;
                                    arrayList13 = arrayList3;
                                    str2 = str2;
                                    arrayList24 = arrayList24;
                                } else {
                                    str = str24;
                                    com.google.common.base.triweekly triweeklyVar6 = kn0.a;
                                    kn0.a(new a1(key));
                                    Unit unit14 = Unit.f29295attabal;
                                    arrayList25 = arrayList31;
                                    arrayList12 = arrayList4;
                                    arrayList23 = arrayList23;
                                    arrayList22 = arrayList;
                                    arrayList19 = arrayList2;
                                    arrayList14 = arrayList14;
                                    str3 = str;
                                    arrayList13 = arrayList3;
                                    str2 = str2;
                                    arrayList24 = arrayList24;
                                }
                                break;
                            case -1812055556:
                                arrayList23 = arrayList23;
                                arrayList31 = arrayList31;
                                if (key.equals("play_prewarm_options")) {
                                    JsonObject asJsonObject5 = value.getAsJsonObject();
                                    Intrinsics.checkNotNullExpressionValue(asJsonObject5, "getAsJsonObject(...)");
                                    String str25 = str3;
                                    Intrinsics.checkNotNullParameter(asJsonObject5, str25);
                                    ArrayList arrayList32 = arrayList24;
                                    String str26 = str2;
                                    m22 m22Var2 = new m22(cb1.a(asJsonObject5, "enable_prewarming", false), cb1.a(asJsonObject5, "prefetch_url", str26), cb1.a(asJsonObject5, "skip_offline_notification_flow", false));
                                    Unit unit15 = Unit.f29295attabal;
                                    m22Var = m22Var2;
                                    arrayList13 = arrayList13;
                                    arrayList12 = arrayList12;
                                    arrayList22 = arrayList;
                                    arrayList14 = arrayList14;
                                    arrayList25 = arrayList31;
                                    str2 = str26;
                                    str3 = str25;
                                    arrayList23 = arrayList23;
                                    arrayList24 = arrayList32;
                                    arrayList19 = arrayList2;
                                } else {
                                    arrayList3 = arrayList13;
                                    str = str3;
                                    arrayList4 = arrayList12;
                                    com.google.common.base.triweekly triweeklyVar7 = kn0.a;
                                    kn0.a(new a1(key));
                                    Unit unit16 = Unit.f29295attabal;
                                    arrayList25 = arrayList31;
                                    arrayList12 = arrayList4;
                                    arrayList23 = arrayList23;
                                    arrayList22 = arrayList;
                                    arrayList19 = arrayList2;
                                    arrayList14 = arrayList14;
                                    str3 = str;
                                    arrayList13 = arrayList3;
                                    str2 = str2;
                                    arrayList24 = arrayList24;
                                }
                                break;
                            case -1785028569:
                                arrayList23 = arrayList23;
                                arrayList31 = arrayList31;
                                if (key.equals("parallel_key")) {
                                    String asString3 = value.getAsString();
                                    Unit unit17 = Unit.f29295attabal;
                                    str21 = asString3;
                                    arrayList3 = arrayList13;
                                    str = str3;
                                    arrayList4 = arrayList12;
                                    arrayList25 = arrayList31;
                                    arrayList12 = arrayList4;
                                    arrayList23 = arrayList23;
                                    arrayList22 = arrayList;
                                    arrayList19 = arrayList2;
                                    arrayList14 = arrayList14;
                                    str3 = str;
                                    arrayList13 = arrayList3;
                                    str2 = str2;
                                    arrayList24 = arrayList24;
                                } else {
                                    arrayList3 = arrayList13;
                                    str = str3;
                                    arrayList4 = arrayList12;
                                    com.google.common.base.triweekly triweeklyVar8 = kn0.a;
                                    kn0.a(new a1(key));
                                    Unit unit18 = Unit.f29295attabal;
                                    arrayList25 = arrayList31;
                                    arrayList12 = arrayList4;
                                    arrayList23 = arrayList23;
                                    arrayList22 = arrayList;
                                    arrayList19 = arrayList2;
                                    arrayList14 = arrayList14;
                                    str3 = str;
                                    arrayList13 = arrayList3;
                                    str2 = str2;
                                    arrayList24 = arrayList24;
                                }
                                break;
                            case -1776946669:
                                arrayList23 = arrayList23;
                                arrayList31 = arrayList31;
                                if (key.equals("ad_source_name")) {
                                    String asString4 = value.getAsString();
                                    Intrinsics.checkNotNullExpressionValue(asString4, "getAsString(...)");
                                    Unit unit19 = Unit.f29295attabal;
                                    str7 = asString4;
                                    arrayList3 = arrayList13;
                                    str = str3;
                                    arrayList4 = arrayList12;
                                    arrayList25 = arrayList31;
                                    arrayList12 = arrayList4;
                                    arrayList23 = arrayList23;
                                    arrayList22 = arrayList;
                                    arrayList19 = arrayList2;
                                    arrayList14 = arrayList14;
                                    str3 = str;
                                    arrayList13 = arrayList3;
                                    str2 = str2;
                                    arrayList24 = arrayList24;
                                } else {
                                    arrayList3 = arrayList13;
                                    str = str3;
                                    arrayList4 = arrayList12;
                                    com.google.common.base.triweekly triweeklyVar9 = kn0.a;
                                    kn0.a(new a1(key));
                                    Unit unit110 = Unit.f29295attabal;
                                    arrayList25 = arrayList31;
                                    arrayList12 = arrayList4;
                                    arrayList23 = arrayList23;
                                    arrayList22 = arrayList;
                                    arrayList19 = arrayList2;
                                    arrayList14 = arrayList14;
                                    str3 = str;
                                    arrayList13 = arrayList3;
                                    str2 = str2;
                                    arrayList24 = arrayList24;
                                }
                                break;
                            case -1620552059:
                                arrayList23 = arrayList23;
                                arrayList31 = arrayList31;
                                if (key.equals("preload_sort_type")) {
                                    uralian uralianVar = z52.a;
                                    int asInt = value.getAsInt();
                                    uralianVar.getClass();
                                    z52 z52VarAttabal = uralian.attabal(asInt);
                                    Unit unit20 = Unit.f29295attabal;
                                    z52Var2 = z52VarAttabal;
                                    arrayList3 = arrayList13;
                                    str = str3;
                                    arrayList4 = arrayList12;
                                    arrayList25 = arrayList31;
                                    arrayList12 = arrayList4;
                                    arrayList23 = arrayList23;
                                    arrayList22 = arrayList;
                                    arrayList19 = arrayList2;
                                    arrayList14 = arrayList14;
                                    str3 = str;
                                    arrayList13 = arrayList3;
                                    str2 = str2;
                                    arrayList24 = arrayList24;
                                } else {
                                    arrayList3 = arrayList13;
                                    str = str3;
                                    arrayList4 = arrayList12;
                                    com.google.common.base.triweekly triweeklyVar10 = kn0.a;
                                    kn0.a(new a1(key));
                                    Unit unit111 = Unit.f29295attabal;
                                    arrayList25 = arrayList31;
                                    arrayList12 = arrayList4;
                                    arrayList23 = arrayList23;
                                    arrayList22 = arrayList;
                                    arrayList19 = arrayList2;
                                    arrayList14 = arrayList14;
                                    str3 = str;
                                    arrayList13 = arrayList3;
                                    str2 = str2;
                                    arrayList24 = arrayList24;
                                }
                                break;
                            case -1620470467:
                                arrayList23 = arrayList23;
                                arrayList31 = arrayList31;
                                if (key.equals("backend_query_id")) {
                                    String asString5 = value.getAsString();
                                    Intrinsics.checkNotNullExpressionValue(asString5, "getAsString(...)");
                                    Unit unit21 = Unit.f29295attabal;
                                    str15 = asString5;
                                    arrayList3 = arrayList13;
                                    str = str3;
                                    arrayList4 = arrayList12;
                                    arrayList25 = arrayList31;
                                    arrayList12 = arrayList4;
                                    arrayList23 = arrayList23;
                                    arrayList22 = arrayList;
                                    arrayList19 = arrayList2;
                                    arrayList14 = arrayList14;
                                    str3 = str;
                                    arrayList13 = arrayList3;
                                    str2 = str2;
                                    arrayList24 = arrayList24;
                                } else {
                                    arrayList3 = arrayList13;
                                    str = str3;
                                    arrayList4 = arrayList12;
                                    com.google.common.base.triweekly triweeklyVar11 = kn0.a;
                                    kn0.a(new a1(key));
                                    Unit unit112 = Unit.f29295attabal;
                                    arrayList25 = arrayList31;
                                    arrayList12 = arrayList4;
                                    arrayList23 = arrayList23;
                                    arrayList22 = arrayList;
                                    arrayList19 = arrayList2;
                                    arrayList14 = arrayList14;
                                    str3 = str;
                                    arrayList13 = arrayList3;
                                    str2 = str2;
                                    arrayList24 = arrayList24;
                                }
                                break;
                            case -1550155393:
                                arrayList23 = arrayList23;
                                arrayList31 = arrayList31;
                                if (key.equals("nofill_urls")) {
                                    JsonArray asJsonArray2 = value.getAsJsonArray();
                                    Intrinsics.checkNotNullExpressionValue(asJsonArray2, "getAsJsonArray(...)");
                                    int i5 = 0;
                                    for (JsonElement jsonElement4 : asJsonArray2) {
                                        int i6 = i5 + 1;
                                        if (i5 < 0) {
                                            p002kotlin.collections.adultoid.dovishness();
                                        }
                                        JsonElement jsonElement5 = jsonElement4;
                                        Intrinsics.beachfront(jsonElement5);
                                        String asString6 = jsonElement5.getAsString();
                                        Intrinsics.checkNotNullExpressionValue(asString6, "getAsString(...)");
                                        Uri uri2 = Uri.parse(asString6);
                                        if (uri2 != null) {
                                            arrayList6 = arrayList28;
                                            arrayList6.add(uri2);
                                            Unit unit22 = Unit.f29295attabal;
                                        } else {
                                            arrayList6 = arrayList28;
                                        }
                                        arrayList28 = arrayList6;
                                        i5 = i6;
                                    }
                                    Unit unit23 = Unit.f29295attabal;
                                    arrayList28 = arrayList28;
                                    arrayList3 = arrayList13;
                                    str = str3;
                                    arrayList4 = arrayList12;
                                    arrayList25 = arrayList31;
                                    arrayList12 = arrayList4;
                                    arrayList23 = arrayList23;
                                    arrayList22 = arrayList;
                                    arrayList19 = arrayList2;
                                    arrayList14 = arrayList14;
                                    str3 = str;
                                    arrayList13 = arrayList3;
                                    str2 = str2;
                                    arrayList24 = arrayList24;
                                }
                                arrayList3 = arrayList13;
                                str = str3;
                                arrayList4 = arrayList12;
                                com.google.common.base.triweekly triweeklyVar12 = kn0.a;
                                kn0.a(new a1(key));
                                Unit unit113 = Unit.f29295attabal;
                                arrayList25 = arrayList31;
                                arrayList12 = arrayList4;
                                arrayList23 = arrayList23;
                                arrayList22 = arrayList;
                                arrayList19 = arrayList2;
                                arrayList14 = arrayList14;
                                str3 = str;
                                arrayList13 = arrayList3;
                                str2 = str2;
                                arrayList24 = arrayList24;
                                break;
                            case -1440104884:
                                arrayList23 = arrayList23;
                                arrayList31 = arrayList31;
                                if (key.equals("is_custom_close_blocked")) {
                                    boolean asBoolean = value.getAsBoolean();
                                    Unit unit24 = Unit.f29295attabal;
                                    z7 = asBoolean;
                                    arrayList3 = arrayList13;
                                    str = str3;
                                    arrayList4 = arrayList12;
                                    arrayList25 = arrayList31;
                                    arrayList12 = arrayList4;
                                    arrayList23 = arrayList23;
                                    arrayList22 = arrayList;
                                    arrayList19 = arrayList2;
                                    arrayList14 = arrayList14;
                                    str3 = str;
                                    arrayList13 = arrayList3;
                                    str2 = str2;
                                    arrayList24 = arrayList24;
                                } else {
                                    arrayList3 = arrayList13;
                                    str = str3;
                                    arrayList4 = arrayList12;
                                    com.google.common.base.triweekly triweeklyVar13 = kn0.a;
                                    kn0.a(new a1(key));
                                    Unit unit114 = Unit.f29295attabal;
                                    arrayList25 = arrayList31;
                                    arrayList12 = arrayList4;
                                    arrayList23 = arrayList23;
                                    arrayList22 = arrayList;
                                    arrayList19 = arrayList2;
                                    arrayList14 = arrayList14;
                                    str3 = str;
                                    arrayList13 = arrayList3;
                                    str2 = str2;
                                    arrayList24 = arrayList24;
                                }
                                break;
                            case -1439500848:
                                arrayList23 = arrayList23;
                                arrayList31 = arrayList31;
                                if (key.equals("orientation")) {
                                    List list = h1.A0;
                                    String asString7 = value.getAsString();
                                    Intrinsics.checkNotNullExpressionValue(asString7, "getAsString(...)");
                                    int iAttabal = attabal(asString7);
                                    Unit unit25 = Unit.f29295attabal;
                                    i2 = iAttabal;
                                    arrayList3 = arrayList13;
                                    str = str3;
                                    arrayList4 = arrayList12;
                                    arrayList25 = arrayList31;
                                    arrayList12 = arrayList4;
                                    arrayList23 = arrayList23;
                                    arrayList22 = arrayList;
                                    arrayList19 = arrayList2;
                                    arrayList14 = arrayList14;
                                    str3 = str;
                                    arrayList13 = arrayList3;
                                    str2 = str2;
                                    arrayList24 = arrayList24;
                                }
                                arrayList3 = arrayList13;
                                str = str3;
                                arrayList4 = arrayList12;
                                com.google.common.base.triweekly triweeklyVar14 = kn0.a;
                                kn0.a(new a1(key));
                                Unit unit115 = Unit.f29295attabal;
                                arrayList25 = arrayList31;
                                arrayList12 = arrayList4;
                                arrayList23 = arrayList23;
                                arrayList22 = arrayList;
                                arrayList19 = arrayList2;
                                arrayList14 = arrayList14;
                                str3 = str;
                                arrayList13 = arrayList3;
                                str2 = str2;
                                arrayList24 = arrayList24;
                                break;
                            case -1428969291:
                                arrayList23 = arrayList23;
                                arrayList7 = arrayList31;
                                if (key.equals("enable_omid")) {
                                    boolean asBoolean2 = value.getAsBoolean();
                                    Unit unit26 = Unit.f29295attabal;
                                    z8 = asBoolean2;
                                    arrayList31 = arrayList7;
                                    arrayList3 = arrayList13;
                                    str = str3;
                                    arrayList4 = arrayList12;
                                    arrayList25 = arrayList31;
                                    arrayList12 = arrayList4;
                                    arrayList23 = arrayList23;
                                    arrayList22 = arrayList;
                                    arrayList19 = arrayList2;
                                    arrayList14 = arrayList14;
                                    str3 = str;
                                    arrayList13 = arrayList3;
                                    str2 = str2;
                                    arrayList24 = arrayList24;
                                } else {
                                    arrayList31 = arrayList7;
                                    arrayList3 = arrayList13;
                                    str = str3;
                                    arrayList4 = arrayList12;
                                    com.google.common.base.triweekly triweeklyVar15 = kn0.a;
                                    kn0.a(new a1(key));
                                    Unit unit116 = Unit.f29295attabal;
                                    arrayList25 = arrayList31;
                                    arrayList12 = arrayList4;
                                    arrayList23 = arrayList23;
                                    arrayList22 = arrayList;
                                    arrayList19 = arrayList2;
                                    arrayList14 = arrayList14;
                                    str3 = str;
                                    arrayList13 = arrayList3;
                                    str2 = str2;
                                    arrayList24 = arrayList24;
                                }
                                break;
                            case -1406227629:
                                arrayList23 = arrayList23;
                                arrayList7 = arrayList31;
                                if (key.equals("buffer_click_url_as_ready_to_ping")) {
                                    boolean asBoolean3 = value.getAsBoolean();
                                    Unit unit27 = Unit.f29295attabal;
                                    z2 = asBoolean3;
                                    arrayList31 = arrayList7;
                                    arrayList3 = arrayList13;
                                    str = str3;
                                    arrayList4 = arrayList12;
                                    arrayList25 = arrayList31;
                                    arrayList12 = arrayList4;
                                    arrayList23 = arrayList23;
                                    arrayList22 = arrayList;
                                    arrayList19 = arrayList2;
                                    arrayList14 = arrayList14;
                                    str3 = str;
                                    arrayList13 = arrayList3;
                                    str2 = str2;
                                    arrayList24 = arrayList24;
                                } else {
                                    arrayList31 = arrayList7;
                                    arrayList3 = arrayList13;
                                    str = str3;
                                    arrayList4 = arrayList12;
                                    com.google.common.base.triweekly triweeklyVar16 = kn0.a;
                                    kn0.a(new a1(key));
                                    Unit unit117 = Unit.f29295attabal;
                                    arrayList25 = arrayList31;
                                    arrayList12 = arrayList4;
                                    arrayList23 = arrayList23;
                                    arrayList22 = arrayList;
                                    arrayList19 = arrayList2;
                                    arrayList14 = arrayList14;
                                    str3 = str;
                                    arrayList13 = arrayList3;
                                    str2 = str2;
                                    arrayList24 = arrayList24;
                                }
                                break;
                            case -1403779768:
                                arrayList23 = arrayList23;
                                arrayList7 = arrayList31;
                                if (key.equals("showable_impression_type")) {
                                    specky speckyVar = g1.b;
                                    int asInt2 = value.getAsInt();
                                    speckyVar.getClass();
                                    g1 g1VarAttabal = specky.attabal(asInt2);
                                    Unit unit28 = Unit.f29295attabal;
                                    g1Var = g1VarAttabal;
                                    arrayList31 = arrayList7;
                                    arrayList3 = arrayList13;
                                    str = str3;
                                    arrayList4 = arrayList12;
                                    arrayList25 = arrayList31;
                                    arrayList12 = arrayList4;
                                    arrayList23 = arrayList23;
                                    arrayList22 = arrayList;
                                    arrayList19 = arrayList2;
                                    arrayList14 = arrayList14;
                                    str3 = str;
                                    arrayList13 = arrayList3;
                                    str2 = str2;
                                    arrayList24 = arrayList24;
                                }
                                arrayList31 = arrayList7;
                                arrayList3 = arrayList13;
                                str = str3;
                                arrayList4 = arrayList12;
                                com.google.common.base.triweekly triweeklyVar17 = kn0.a;
                                kn0.a(new a1(key));
                                Unit unit118 = Unit.f29295attabal;
                                arrayList25 = arrayList31;
                                arrayList12 = arrayList4;
                                arrayList23 = arrayList23;
                                arrayList22 = arrayList;
                                arrayList19 = arrayList2;
                                arrayList14 = arrayList14;
                                str3 = str;
                                arrayList13 = arrayList3;
                                str2 = str2;
                                arrayList24 = arrayList24;
                                break;
                            case -1360811658:
                                arrayList23 = arrayList23;
                                arrayList7 = arrayList31;
                                if (key.equals("ad_sizes")) {
                                    JsonArray asJsonArray3 = value.getAsJsonArray();
                                    Intrinsics.checkNotNullExpressionValue(asJsonArray3, "getAsJsonArray(...)");
                                    int i7 = 0;
                                    for (JsonElement jsonElement6 : asJsonArray3) {
                                        int i8 = i7 + 1;
                                        if (i7 < 0) {
                                            p002kotlin.collections.adultoid.dovishness();
                                        }
                                        JsonElement jsonElement7 = jsonElement6;
                                        Intrinsics.beachfront(jsonElement7);
                                        JsonObject asJsonObject6 = jsonElement7.getAsJsonObject();
                                        Intrinsics.checkNotNullExpressionValue(asJsonObject6, "getAsJsonObject(...)");
                                        n1 n1VarAttabal = nonviolence.attabal(asJsonObject6);
                                        if (n1VarAttabal != null) {
                                            arrayList8 = arrayList30;
                                            arrayList8.add(n1VarAttabal);
                                            Unit unit29 = Unit.f29295attabal;
                                        } else {
                                            arrayList8 = arrayList30;
                                        }
                                        arrayList30 = arrayList8;
                                        i7 = i8;
                                    }
                                    Unit unit30 = Unit.f29295attabal;
                                    arrayList31 = arrayList7;
                                    arrayList30 = arrayList30;
                                    arrayList3 = arrayList13;
                                    str = str3;
                                    arrayList4 = arrayList12;
                                    arrayList25 = arrayList31;
                                    arrayList12 = arrayList4;
                                    arrayList23 = arrayList23;
                                    arrayList22 = arrayList;
                                    arrayList19 = arrayList2;
                                    arrayList14 = arrayList14;
                                    str3 = str;
                                    arrayList13 = arrayList3;
                                    str2 = str2;
                                    arrayList24 = arrayList24;
                                }
                                arrayList31 = arrayList7;
                                arrayList3 = arrayList13;
                                str = str3;
                                arrayList4 = arrayList12;
                                com.google.common.base.triweekly triweeklyVar18 = kn0.a;
                                kn0.a(new a1(key));
                                Unit unit119 = Unit.f29295attabal;
                                arrayList25 = arrayList31;
                                arrayList12 = arrayList4;
                                arrayList23 = arrayList23;
                                arrayList22 = arrayList;
                                arrayList19 = arrayList2;
                                arrayList14 = arrayList14;
                                str3 = str;
                                arrayList13 = arrayList3;
                                str2 = str2;
                                arrayList24 = arrayList24;
                                break;
                            case -1306015996:
                                if (key.equals("adapters")) {
                                    JsonArray asJsonArray4 = value.getAsJsonArray();
                                    Intrinsics.checkNotNullExpressionValue(asJsonArray4, "getAsJsonArray(...)");
                                    int i9 = 0;
                                    for (JsonElement jsonElement8 : asJsonArray4) {
                                        int i10 = i9 + 1;
                                        if (i9 < 0) {
                                            p002kotlin.collections.adultoid.dovishness();
                                        }
                                        JsonElement jsonElement9 = jsonElement8;
                                        Intrinsics.beachfront(jsonElement9);
                                        String asString8 = jsonElement9.getAsString();
                                        if (asString8 != null) {
                                            arrayList9 = arrayList31;
                                            arrayList9.add(asString8);
                                            Unit unit31 = Unit.f29295attabal;
                                        } else {
                                            arrayList9 = arrayList31;
                                        }
                                        arrayList31 = arrayList9;
                                        i9 = i10;
                                    }
                                    arrayList7 = arrayList31;
                                    Unit unit32 = Unit.f29295attabal;
                                    arrayList23 = arrayList23;
                                    arrayList31 = arrayList7;
                                    arrayList3 = arrayList13;
                                    str = str3;
                                    arrayList4 = arrayList12;
                                    arrayList25 = arrayList31;
                                    arrayList12 = arrayList4;
                                    arrayList23 = arrayList23;
                                    arrayList22 = arrayList;
                                    arrayList19 = arrayList2;
                                    arrayList14 = arrayList14;
                                    str3 = str;
                                    arrayList13 = arrayList3;
                                    str2 = str2;
                                    arrayList24 = arrayList24;
                                }
                                break;
                            case -1303332046:
                                if (key.equals("test_mode_enabled")) {
                                    boolean asBoolean4 = value.getAsBoolean();
                                    Unit unit33 = Unit.f29295attabal;
                                    z13 = asBoolean4;
                                    arrayList24 = arrayList24;
                                    arrayList3 = arrayList13;
                                    str = str3;
                                    arrayList4 = arrayList12;
                                    arrayList25 = arrayList31;
                                    arrayList12 = arrayList4;
                                    arrayList23 = arrayList23;
                                    arrayList22 = arrayList;
                                    arrayList19 = arrayList2;
                                    arrayList14 = arrayList14;
                                    str3 = str;
                                    arrayList13 = arrayList3;
                                    str2 = str2;
                                    arrayList24 = arrayList24;
                                }
                                break;
                            case -1289032093:
                                if (key.equals(HandleInvocationsFromAdViewer.KEY_EXTRAS)) {
                                    JsonObject asJsonObject7 = value.getAsJsonObject();
                                    Intrinsics.checkNotNullExpressionValue(asJsonObject7, "getAsJsonObject(...)");
                                    Unit unit34 = Unit.f29295attabal;
                                    jsonObject8 = asJsonObject7;
                                    arrayList24 = arrayList24;
                                    arrayList3 = arrayList13;
                                    str = str3;
                                    arrayList4 = arrayList12;
                                    arrayList25 = arrayList31;
                                    arrayList12 = arrayList4;
                                    arrayList23 = arrayList23;
                                    arrayList22 = arrayList;
                                    arrayList19 = arrayList2;
                                    arrayList14 = arrayList14;
                                    str3 = str;
                                    arrayList13 = arrayList3;
                                    str2 = str2;
                                    arrayList24 = arrayList24;
                                }
                                break;
                            case -1240082064:
                                if (key.equals("ad_event_value")) {
                                    JsonObject asJsonObject8 = value.getAsJsonObject();
                                    Intrinsics.checkNotNullExpressionValue(asJsonObject8, "getAsJsonObject(...)");
                                    k7 k7VarAttabal = sequal.attabal(asJsonObject8);
                                    Unit unit35 = Unit.f29295attabal;
                                    k7Var = k7VarAttabal;
                                    arrayList24 = arrayList24;
                                    arrayList3 = arrayList13;
                                    str = str3;
                                    arrayList4 = arrayList12;
                                    arrayList25 = arrayList31;
                                    arrayList12 = arrayList4;
                                    arrayList23 = arrayList23;
                                    arrayList22 = arrayList;
                                    arrayList19 = arrayList2;
                                    arrayList14 = arrayList14;
                                    str3 = str;
                                    arrayList13 = arrayList3;
                                    str2 = str2;
                                    arrayList24 = arrayList24;
                                }
                                break;
                            case -1234181075:
                                if (key.equals("allow_pub_rendered_attribution")) {
                                    boolean asBoolean5 = value.getAsBoolean();
                                    Unit unit36 = Unit.f29295attabal;
                                    z18 = asBoolean5;
                                    arrayList24 = arrayList24;
                                    arrayList3 = arrayList13;
                                    str = str3;
                                    arrayList4 = arrayList12;
                                    arrayList25 = arrayList31;
                                    arrayList12 = arrayList4;
                                    arrayList23 = arrayList23;
                                    arrayList22 = arrayList;
                                    arrayList19 = arrayList2;
                                    arrayList14 = arrayList14;
                                    str3 = str;
                                    arrayList13 = arrayList3;
                                    str2 = str2;
                                    arrayList24 = arrayList24;
                                }
                                break;
                            case -1168140544:
                                if (key.equals("presentation_error_urls")) {
                                    JsonArray asJsonArray5 = value.getAsJsonArray();
                                    Intrinsics.checkNotNullExpressionValue(asJsonArray5, "getAsJsonArray(...)");
                                    int i11 = 0;
                                    for (JsonElement jsonElement10 : asJsonArray5) {
                                        int i12 = i11 + 1;
                                        if (i11 < 0) {
                                            p002kotlin.collections.adultoid.dovishness();
                                        }
                                        JsonElement jsonElement11 = jsonElement10;
                                        Intrinsics.beachfront(jsonElement11);
                                        String asString9 = jsonElement11.getAsString();
                                        Intrinsics.checkNotNullExpressionValue(asString9, "getAsString(...)");
                                        Uri uri3 = Uri.parse(asString9);
                                        if (uri3 != null) {
                                            arrayList10 = arrayList;
                                            arrayList10.add(uri3);
                                            Unit unit37 = Unit.f29295attabal;
                                        } else {
                                            arrayList10 = arrayList;
                                        }
                                        arrayList = arrayList10;
                                        i11 = i12;
                                    }
                                    Unit unit38 = Unit.f29295attabal;
                                    arrayList23 = arrayList23;
                                    arrayList = arrayList;
                                    arrayList24 = arrayList24;
                                    arrayList3 = arrayList13;
                                    str = str3;
                                    arrayList4 = arrayList12;
                                    arrayList25 = arrayList31;
                                    arrayList12 = arrayList4;
                                    arrayList23 = arrayList23;
                                    arrayList22 = arrayList;
                                    arrayList19 = arrayList2;
                                    arrayList14 = arrayList14;
                                    str3 = str;
                                    arrayList13 = arrayList3;
                                    str2 = str2;
                                    arrayList24 = arrayList24;
                                }
                                break;
                            case -1152230954:
                                if (key.equals("ad_type")) {
                                    monocoque monocoqueVar = q6.a;
                                    String asString10 = value.getAsString();
                                    Intrinsics.checkNotNullExpressionValue(asString10, "getAsString(...)");
                                    String upperCase = asString10.toUpperCase(Locale.ROOT);
                                    Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                                    monocoqueVar.getClass();
                                    q6 q6VarAttabal = monocoque.attabal(upperCase);
                                    Unit unit39 = Unit.f29295attabal;
                                    q6Var3 = q6VarAttabal;
                                    arrayList24 = arrayList24;
                                    arrayList3 = arrayList13;
                                    str = str3;
                                    arrayList4 = arrayList12;
                                    arrayList25 = arrayList31;
                                    arrayList12 = arrayList4;
                                    arrayList23 = arrayList23;
                                    arrayList22 = arrayList;
                                    arrayList19 = arrayList2;
                                    arrayList14 = arrayList14;
                                    str3 = str;
                                    arrayList13 = arrayList3;
                                    str2 = str2;
                                    arrayList24 = arrayList24;
                                }
                                break;
                            case -1146534047:
                                if (key.equals("is_scroll_aware")) {
                                    boolean asBoolean6 = value.getAsBoolean();
                                    Unit unit40 = Unit.f29295attabal;
                                    z9 = asBoolean6;
                                    arrayList24 = arrayList24;
                                    arrayList3 = arrayList13;
                                    str = str3;
                                    arrayList4 = arrayList12;
                                    arrayList25 = arrayList31;
                                    arrayList12 = arrayList4;
                                    arrayList23 = arrayList23;
                                    arrayList22 = arrayList;
                                    arrayList19 = arrayList2;
                                    arrayList14 = arrayList14;
                                    str3 = str;
                                    arrayList13 = arrayList3;
                                    str2 = str2;
                                    arrayList24 = arrayList24;
                                }
                                break;
                            case -1115838944:
                                if (key.equals("fill_urls")) {
                                    JsonArray asJsonArray6 = value.getAsJsonArray();
                                    Intrinsics.checkNotNullExpressionValue(asJsonArray6, "getAsJsonArray(...)");
                                    int i13 = 0;
                                    for (JsonElement jsonElement12 : asJsonArray6) {
                                        int i14 = i13 + 1;
                                        if (i13 < 0) {
                                            p002kotlin.collections.adultoid.dovishness();
                                        }
                                        JsonElement jsonElement13 = jsonElement12;
                                        Intrinsics.beachfront(jsonElement13);
                                        String asString11 = jsonElement13.getAsString();
                                        Intrinsics.checkNotNullExpressionValue(asString11, "getAsString(...)");
                                        Uri uri4 = Uri.parse(asString11);
                                        if (uri4 != null) {
                                            arrayList11 = arrayList2;
                                            arrayList11.add(uri4);
                                            Unit unit41 = Unit.f29295attabal;
                                        } else {
                                            arrayList11 = arrayList2;
                                        }
                                        arrayList2 = arrayList11;
                                        i13 = i14;
                                    }
                                    Unit unit42 = Unit.f29295attabal;
                                    arrayList23 = arrayList23;
                                    arrayList2 = arrayList2;
                                    arrayList24 = arrayList24;
                                    arrayList3 = arrayList13;
                                    str = str3;
                                    arrayList4 = arrayList12;
                                    arrayList25 = arrayList31;
                                    arrayList12 = arrayList4;
                                    arrayList23 = arrayList23;
                                    arrayList22 = arrayList;
                                    arrayList19 = arrayList2;
                                    arrayList14 = arrayList14;
                                    str3 = str;
                                    arrayList13 = arrayList3;
                                    str2 = str2;
                                    arrayList24 = arrayList24;
                                }
                                break;
                            case -1081936678:
                                if (key.equals("allocation_id")) {
                                    String asString12 = value.getAsString();
                                    Intrinsics.checkNotNullExpressionValue(asString12, "getAsString(...)");
                                    Unit unit43 = Unit.f29295attabal;
                                    str6 = asString12;
                                    arrayList24 = arrayList24;
                                    arrayList3 = arrayList13;
                                    str = str3;
                                    arrayList4 = arrayList12;
                                    arrayList25 = arrayList31;
                                    arrayList12 = arrayList4;
                                    arrayList23 = arrayList23;
                                    arrayList22 = arrayList;
                                    arrayList19 = arrayList2;
                                    arrayList14 = arrayList14;
                                    str3 = str;
                                    arrayList13 = arrayList3;
                                    str2 = str2;
                                    arrayList24 = arrayList24;
                                }
                                break;
                            case -1078050970:
                                if (key.equals("video_complete_urls")) {
                                    JsonArray asJsonArray7 = value.getAsJsonArray();
                                    Intrinsics.checkNotNullExpressionValue(asJsonArray7, "getAsJsonArray(...)");
                                    int i15 = 0;
                                    for (JsonElement jsonElement14 : asJsonArray7) {
                                        int i16 = i15 + 1;
                                        if (i15 < 0) {
                                            p002kotlin.collections.adultoid.dovishness();
                                        }
                                        JsonElement jsonElement15 = jsonElement14;
                                        Intrinsics.beachfront(jsonElement15);
                                        String asString13 = jsonElement15.getAsString();
                                        Intrinsics.checkNotNullExpressionValue(asString13, "getAsString(...)");
                                        Uri uri5 = Uri.parse(asString13);
                                        if (uri5 != null) {
                                            arrayList18.add(uri5);
                                            Unit unit44 = Unit.f29295attabal;
                                        }
                                        i15 = i16;
                                    }
                                    Unit unit45 = Unit.f29295attabal;
                                    arrayList24 = arrayList24;
                                    arrayList3 = arrayList13;
                                    str = str3;
                                    arrayList4 = arrayList12;
                                    arrayList25 = arrayList31;
                                    arrayList12 = arrayList4;
                                    arrayList23 = arrayList23;
                                    arrayList22 = arrayList;
                                    arrayList19 = arrayList2;
                                    arrayList14 = arrayList14;
                                    str3 = str;
                                    arrayList13 = arrayList3;
                                    str2 = str2;
                                    arrayList24 = arrayList24;
                                }
                                break;
                            case -1051269058:
                                if (key.equals("active_view")) {
                                    String string = value.toString();
                                    Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                                    Unit unit46 = Unit.f29295attabal;
                                    str4 = string;
                                    arrayList24 = arrayList24;
                                    arrayList3 = arrayList13;
                                    str = str3;
                                    arrayList4 = arrayList12;
                                    arrayList25 = arrayList31;
                                    arrayList12 = arrayList4;
                                    arrayList23 = arrayList23;
                                    arrayList22 = arrayList;
                                    arrayList19 = arrayList2;
                                    arrayList14 = arrayList14;
                                    str3 = str;
                                    arrayList13 = arrayList3;
                                    str2 = str2;
                                    arrayList24 = arrayList24;
                                }
                                break;
                            case -982608540:
                                if (key.equals("valid_from_timestamp")) {
                                    String asString14 = value.getAsString();
                                    Intrinsics.checkNotNullExpressionValue(asString14, "getAsString(...)");
                                    Unit unit47 = Unit.f29295attabal;
                                    str17 = asString14;
                                    arrayList24 = arrayList24;
                                    arrayList3 = arrayList13;
                                    str = str3;
                                    arrayList4 = arrayList12;
                                    arrayList25 = arrayList31;
                                    arrayList12 = arrayList4;
                                    arrayList23 = arrayList23;
                                    arrayList22 = arrayList;
                                    arrayList19 = arrayList2;
                                    arrayList14 = arrayList14;
                                    str3 = str;
                                    arrayList13 = arrayList3;
                                    str2 = str2;
                                    arrayList24 = arrayList24;
                                }
                                break;
                            case -972056451:
                                if (key.equals("ad_source_instance_id")) {
                                    String asString15 = value.getAsString();
                                    Intrinsics.checkNotNullExpressionValue(asString15, "getAsString(...)");
                                    Unit unit48 = Unit.f29295attabal;
                                    str10 = asString15;
                                    arrayList24 = arrayList24;
                                    arrayList3 = arrayList13;
                                    str = str3;
                                    arrayList4 = arrayList12;
                                    arrayList25 = arrayList31;
                                    arrayList12 = arrayList4;
                                    arrayList23 = arrayList23;
                                    arrayList22 = arrayList;
                                    arrayList19 = arrayList2;
                                    arrayList14 = arrayList14;
                                    str3 = str;
                                    arrayList13 = arrayList3;
                                    str2 = str2;
                                    arrayList24 = arrayList24;
                                }
                                break;
                            case -776859333:
                                if (key.equals("click_urls")) {
                                    JsonArray asJsonArray8 = value.getAsJsonArray();
                                    Intrinsics.checkNotNullExpressionValue(asJsonArray8, "getAsJsonArray(...)");
                                    int i17 = 0;
                                    for (JsonElement jsonElement16 : asJsonArray8) {
                                        int i18 = i17 + 1;
                                        if (i17 < 0) {
                                            p002kotlin.collections.adultoid.dovishness();
                                        }
                                        JsonElement jsonElement17 = jsonElement16;
                                        Intrinsics.beachfront(jsonElement17);
                                        String asString16 = jsonElement17.getAsString();
                                        Intrinsics.checkNotNullExpressionValue(asString16, "getAsString(...)");
                                        Uri uri6 = Uri.parse(asString16);
                                        if (uri6 != null) {
                                            arrayList13.add(uri6);
                                            Unit unit49 = Unit.f29295attabal;
                                        }
                                        i17 = i18;
                                    }
                                    Unit unit50 = Unit.f29295attabal;
                                    arrayList24 = arrayList24;
                                    arrayList3 = arrayList13;
                                    str = str3;
                                    arrayList4 = arrayList12;
                                    arrayList25 = arrayList31;
                                    arrayList12 = arrayList4;
                                    arrayList23 = arrayList23;
                                    arrayList22 = arrayList;
                                    arrayList19 = arrayList2;
                                    arrayList14 = arrayList14;
                                    str3 = str;
                                    arrayList13 = arrayList3;
                                    str2 = str2;
                                    arrayList24 = arrayList24;
                                }
                                break;
                            case -544216775:
                                if (key.equals("safe_browsing")) {
                                    JsonObject asJsonObject9 = value.getAsJsonObject();
                                    Intrinsics.checkNotNullExpressionValue(asJsonObject9, "getAsJsonObject(...)");
                                    ck2 ck2VarAttabal = underbelly.attabal(asJsonObject9);
                                    Unit unit51 = Unit.f29295attabal;
                                    ck2Var2 = ck2VarAttabal;
                                    arrayList24 = arrayList24;
                                    arrayList3 = arrayList13;
                                    str = str3;
                                    arrayList4 = arrayList12;
                                    arrayList25 = arrayList31;
                                    arrayList12 = arrayList4;
                                    arrayList23 = arrayList23;
                                    arrayList22 = arrayList;
                                    arrayList19 = arrayList2;
                                    arrayList14 = arrayList14;
                                    str3 = str;
                                    arrayList13 = arrayList3;
                                    str2 = str2;
                                    arrayList24 = arrayList24;
                                }
                                break;
                            case -437057161:
                                if (key.equals("imp_urls")) {
                                    JsonArray asJsonArray9 = value.getAsJsonArray();
                                    Intrinsics.checkNotNullExpressionValue(asJsonArray9, "getAsJsonArray(...)");
                                    int i19 = 0;
                                    for (JsonElement jsonElement18 : asJsonArray9) {
                                        int i20 = i19 + 1;
                                        if (i19 < 0) {
                                            p002kotlin.collections.adultoid.dovishness();
                                        }
                                        JsonElement jsonElement19 = jsonElement18;
                                        Intrinsics.beachfront(jsonElement19);
                                        String asString17 = jsonElement19.getAsString();
                                        Intrinsics.checkNotNullExpressionValue(asString17, "getAsString(...)");
                                        Uri uri7 = Uri.parse(asString17);
                                        if (uri7 != null) {
                                            arrayList14.add(uri7);
                                            Unit unit52 = Unit.f29295attabal;
                                        }
                                        i19 = i20;
                                    }
                                    Unit unit53 = Unit.f29295attabal;
                                    arrayList24 = arrayList24;
                                    arrayList3 = arrayList13;
                                    str = str3;
                                    arrayList4 = arrayList12;
                                    arrayList25 = arrayList31;
                                    arrayList12 = arrayList4;
                                    arrayList23 = arrayList23;
                                    arrayList22 = arrayList;
                                    arrayList19 = arrayList2;
                                    arrayList14 = arrayList14;
                                    str3 = str;
                                    arrayList13 = arrayList3;
                                    str2 = str2;
                                    arrayList24 = arrayList24;
                                }
                                break;
                            case -404433734:
                                if (key.equals("rtb_native_required_assets")) {
                                    JsonObject asJsonObject10 = value.getAsJsonObject();
                                    Intrinsics.checkNotNullExpressionValue(asJsonObject10, "getAsJsonObject(...)");
                                    Unit unit54 = Unit.f29295attabal;
                                    jsonObject6 = asJsonObject10;
                                    arrayList24 = arrayList24;
                                    arrayList3 = arrayList13;
                                    str = str3;
                                    arrayList4 = arrayList12;
                                    arrayList25 = arrayList31;
                                    arrayList12 = arrayList4;
                                    arrayList23 = arrayList23;
                                    arrayList22 = arrayList;
                                    arrayList19 = arrayList2;
                                    arrayList14 = arrayList14;
                                    str3 = str;
                                    arrayList13 = arrayList3;
                                    str2 = str2;
                                    arrayList24 = arrayList24;
                                }
                                break;
                            case -404326515:
                                if (key.equals("render_timeout_ms")) {
                                    p002kotlin.time.saneness.Companion companion2 = p002kotlin.time.saneness.INSTANCE;
                                    jMolybdenite = p002kotlin.time.dern.molybdenite(value.getAsInt(), DurationUnit.MILLISECONDS);
                                    Unit unit55 = Unit.f29295attabal;
                                    arrayList24 = arrayList24;
                                    arrayList3 = arrayList13;
                                    str = str3;
                                    arrayList4 = arrayList12;
                                    arrayList25 = arrayList31;
                                    arrayList12 = arrayList4;
                                    arrayList23 = arrayList23;
                                    arrayList22 = arrayList;
                                    arrayList19 = arrayList2;
                                    arrayList14 = arrayList14;
                                    str3 = str;
                                    arrayList13 = arrayList3;
                                    str2 = str2;
                                    arrayList24 = arrayList24;
                                }
                                break;
                            case -388807511:
                                if (key.equals("content_url")) {
                                    String asString18 = value.getAsString();
                                    Unit unit56 = Unit.f29295attabal;
                                    str20 = asString18;
                                    arrayList24 = arrayList24;
                                    arrayList3 = arrayList13;
                                    str = str3;
                                    arrayList4 = arrayList12;
                                    arrayList25 = arrayList31;
                                    arrayList12 = arrayList4;
                                    arrayList23 = arrayList23;
                                    arrayList22 = arrayList;
                                    arrayList19 = arrayList2;
                                    arrayList14 = arrayList14;
                                    str3 = str;
                                    arrayList13 = arrayList3;
                                    str2 = str2;
                                    arrayList24 = arrayList24;
                                }
                                break;
                            case -213449460:
                                if (key.equals("force_disable_hardware_acceleration")) {
                                    boolean asBoolean7 = value.getAsBoolean();
                                    Unit unit57 = Unit.f29295attabal;
                                    z4 = asBoolean7;
                                    arrayList24 = arrayList24;
                                    arrayList3 = arrayList13;
                                    str = str3;
                                    arrayList4 = arrayList12;
                                    arrayList25 = arrayList31;
                                    arrayList12 = arrayList4;
                                    arrayList23 = arrayList23;
                                    arrayList22 = arrayList;
                                    arrayList19 = arrayList2;
                                    arrayList14 = arrayList14;
                                    str3 = str;
                                    arrayList13 = arrayList3;
                                    str2 = str2;
                                    arrayList24 = arrayList24;
                                }
                                break;
                            case -213424028:
                                if (key.equals(MBridgeConstans.EXTRA_KEY_WM)) {
                                    String asString19 = value.getAsString();
                                    Intrinsics.checkNotNullExpressionValue(asString19, "getAsString(...)");
                                    Unit unit58 = Unit.f29295attabal;
                                    str19 = asString19;
                                    arrayList24 = arrayList24;
                                    arrayList3 = arrayList13;
                                    str = str3;
                                    arrayList4 = arrayList12;
                                    arrayList25 = arrayList31;
                                    arrayList12 = arrayList4;
                                    arrayList23 = arrayList23;
                                    arrayList22 = arrayList;
                                    arrayList19 = arrayList2;
                                    arrayList14 = arrayList14;
                                    str3 = str;
                                    arrayList13 = arrayList3;
                                    str2 = str2;
                                    arrayList24 = arrayList24;
                                }
                                break;
                            case -180214626:
                                if (key.equals("native_required_asset_viewability")) {
                                    boolean asBoolean8 = value.getAsBoolean();
                                    Unit unit59 = Unit.f29295attabal;
                                    z3 = asBoolean8;
                                    arrayList24 = arrayList24;
                                    arrayList3 = arrayList13;
                                    str = str3;
                                    arrayList4 = arrayList12;
                                    arrayList25 = arrayList31;
                                    arrayList12 = arrayList4;
                                    arrayList23 = arrayList23;
                                    arrayList22 = arrayList;
                                    arrayList19 = arrayList2;
                                    arrayList14 = arrayList14;
                                    str3 = str;
                                    arrayList13 = arrayList3;
                                    str2 = str2;
                                    arrayList24 = arrayList24;
                                }
                                break;
                            case 3107:
                                if (key.equals("ad")) {
                                    JsonObject asJsonObject11 = value.getAsJsonObject();
                                    Intrinsics.checkNotNullExpressionValue(asJsonObject11, "getAsJsonObject(...)");
                                    wx0 wx0VarAttabal = vindicatory.attabal(asJsonObject11);
                                    JsonObject jsonObject10 = wx0VarAttabal.c;
                                    boolean z19 = (jsonObject10 == null || (jsonArrayD = cb1.d(jsonObject10, "slots")) == null || jsonArrayD.size() <= 0) ? false : true;
                                    Unit unit60 = Unit.f29295attabal;
                                    arrayList23 = arrayList23;
                                    wx0Var = wx0VarAttabal;
                                    arrayList14 = arrayList14;
                                    z15 = z19;
                                    arrayList24 = arrayList24;
                                    arrayList3 = arrayList13;
                                    str = str3;
                                    arrayList4 = arrayList12;
                                    arrayList25 = arrayList31;
                                    arrayList12 = arrayList4;
                                    arrayList23 = arrayList23;
                                    arrayList22 = arrayList;
                                    arrayList19 = arrayList2;
                                    arrayList14 = arrayList14;
                                    str3 = str;
                                    arrayList13 = arrayList3;
                                    str2 = str2;
                                    arrayList24 = arrayList24;
                                }
                                break;
                            case 3355:
                                if (key.equals("id")) {
                                    String asString20 = value.getAsString();
                                    Intrinsics.checkNotNullExpressionValue(asString20, "getAsString(...)");
                                    Unit unit61 = Unit.f29295attabal;
                                    str12 = asString20;
                                    arrayList24 = arrayList24;
                                    arrayList3 = arrayList13;
                                    str = str3;
                                    arrayList4 = arrayList12;
                                    arrayList25 = arrayList31;
                                    arrayList12 = arrayList4;
                                    arrayList23 = arrayList23;
                                    arrayList22 = arrayList;
                                    arrayList19 = arrayList2;
                                    arrayList14 = arrayList14;
                                    str3 = str;
                                    arrayList13 = arrayList3;
                                    str2 = str2;
                                    arrayList24 = arrayList24;
                                }
                                break;
                            case 3076010:
                                if (key.equals("data")) {
                                    ?? asJsonObject12 = value.getAsJsonObject();
                                    Intrinsics.checkNotNullExpressionValue(asJsonObject12, "getAsJsonObject(...)");
                                    ref$ObjectRef.element = asJsonObject12;
                                    Unit unit62 = Unit.f29295attabal;
                                    arrayList24 = arrayList24;
                                    arrayList3 = arrayList13;
                                    str = str3;
                                    arrayList4 = arrayList12;
                                    arrayList25 = arrayList31;
                                    arrayList12 = arrayList4;
                                    arrayList23 = arrayList23;
                                    arrayList22 = arrayList;
                                    arrayList19 = arrayList2;
                                    arrayList14 = arrayList14;
                                    str3 = str;
                                    arrayList13 = arrayList3;
                                    str2 = str2;
                                    arrayList24 = arrayList24;
                                }
                                break;
                            case 37109963:
                                if (key.equals("request_id")) {
                                    String asString21 = value.getAsString();
                                    Intrinsics.checkNotNullExpressionValue(asString21, "getAsString(...)");
                                    Unit unit63 = Unit.f29295attabal;
                                    str13 = asString21;
                                    arrayList24 = arrayList24;
                                    arrayList3 = arrayList13;
                                    str = str3;
                                    arrayList4 = arrayList12;
                                    arrayList25 = arrayList31;
                                    arrayList12 = arrayList4;
                                    arrayList23 = arrayList23;
                                    arrayList22 = arrayList;
                                    arrayList19 = arrayList2;
                                    arrayList14 = arrayList14;
                                    str3 = str;
                                    arrayList13 = arrayList3;
                                    str2 = str2;
                                    arrayList24 = arrayList24;
                                }
                                break;
                            case 63195984:
                                if (key.equals("render_test_label")) {
                                    boolean asBoolean9 = value.getAsBoolean();
                                    Unit unit64 = Unit.f29295attabal;
                                    z11 = asBoolean9;
                                    arrayList24 = arrayList24;
                                    arrayList3 = arrayList13;
                                    str = str3;
                                    arrayList4 = arrayList12;
                                    arrayList25 = arrayList31;
                                    arrayList12 = arrayList4;
                                    arrayList23 = arrayList23;
                                    arrayList22 = arrayList;
                                    arrayList19 = arrayList2;
                                    arrayList14 = arrayList14;
                                    str3 = str;
                                    arrayList13 = arrayList3;
                                    str2 = str2;
                                    arrayList24 = arrayList24;
                                }
                                break;
                            case 107433883:
                                if (key.equals("qdata")) {
                                    String asString22 = value.getAsString();
                                    Intrinsics.checkNotNullExpressionValue(asString22, "getAsString(...)");
                                    Unit unit65 = Unit.f29295attabal;
                                    str14 = asString22;
                                    arrayList24 = arrayList24;
                                    arrayList3 = arrayList13;
                                    str = str3;
                                    arrayList4 = arrayList12;
                                    arrayList25 = arrayList31;
                                    arrayList12 = arrayList4;
                                    arrayList23 = arrayList23;
                                    arrayList22 = arrayList;
                                    arrayList19 = arrayList2;
                                    arrayList14 = arrayList14;
                                    str3 = str;
                                    arrayList13 = arrayList3;
                                    str2 = str2;
                                    arrayList24 = arrayList24;
                                }
                                break;
                            case 230323073:
                                if (key.equals("ad_load_urls")) {
                                    JsonArray asJsonArray10 = value.getAsJsonArray();
                                    Intrinsics.checkNotNullExpressionValue(asJsonArray10, "getAsJsonArray(...)");
                                    int i21 = 0;
                                    for (JsonElement jsonElement20 : asJsonArray10) {
                                        int i22 = i21 + 1;
                                        if (i21 < 0) {
                                            p002kotlin.collections.adultoid.dovishness();
                                        }
                                        JsonElement jsonElement21 = jsonElement20;
                                        Intrinsics.beachfront(jsonElement21);
                                        String asString23 = jsonElement21.getAsString();
                                        Intrinsics.checkNotNullExpressionValue(asString23, "getAsString(...)");
                                        Uri uri8 = Uri.parse(asString23);
                                        if (uri8 != null) {
                                            arrayList15.add(uri8);
                                            Unit unit66 = Unit.f29295attabal;
                                        }
                                        i21 = i22;
                                    }
                                    Unit unit67 = Unit.f29295attabal;
                                    arrayList24 = arrayList24;
                                    arrayList3 = arrayList13;
                                    str = str3;
                                    arrayList4 = arrayList12;
                                    arrayList25 = arrayList31;
                                    arrayList12 = arrayList4;
                                    arrayList23 = arrayList23;
                                    arrayList22 = arrayList;
                                    arrayList19 = arrayList2;
                                    arrayList14 = arrayList14;
                                    str3 = str;
                                    arrayList13 = arrayList3;
                                    str2 = str2;
                                    arrayList24 = arrayList24;
                                }
                                break;
                            case 418392395:
                                if (key.equals("is_closable_area_disabled")) {
                                    boolean asBoolean10 = value.getAsBoolean();
                                    Unit unit68 = Unit.f29295attabal;
                                    z5 = asBoolean10;
                                    arrayList24 = arrayList24;
                                    arrayList3 = arrayList13;
                                    str = str3;
                                    arrayList4 = arrayList12;
                                    arrayList25 = arrayList31;
                                    arrayList12 = arrayList4;
                                    arrayList23 = arrayList23;
                                    arrayList22 = arrayList;
                                    arrayList19 = arrayList2;
                                    arrayList14 = arrayList14;
                                    str3 = str;
                                    arrayList13 = arrayList3;
                                    str2 = str2;
                                    arrayList24 = arrayList24;
                                }
                                break;
                            case 549176928:
                                if (key.equals("presentation_error_timeout_ms")) {
                                    p002kotlin.time.saneness.Companion companion3 = p002kotlin.time.saneness.INSTANCE;
                                    jMolybdenite2 = p002kotlin.time.dern.molybdenite(value.getAsInt(), DurationUnit.MILLISECONDS);
                                    Unit unit69 = Unit.f29295attabal;
                                    arrayList24 = arrayList24;
                                    arrayList3 = arrayList13;
                                    str = str3;
                                    arrayList4 = arrayList12;
                                    arrayList25 = arrayList31;
                                    arrayList12 = arrayList4;
                                    arrayList23 = arrayList23;
                                    arrayList22 = arrayList;
                                    arrayList19 = arrayList2;
                                    arrayList14 = arrayList14;
                                    str3 = str;
                                    arrayList13 = arrayList3;
                                    str2 = str2;
                                    arrayList24 = arrayList24;
                                }
                                break;
                            case 597473788:
                                if (key.equals("debug_dialog_string")) {
                                    String asString24 = value.getAsString();
                                    Intrinsics.checkNotNullExpressionValue(asString24, "getAsString(...)");
                                    Unit unit70 = Unit.f29295attabal;
                                    str23 = asString24;
                                    arrayList24 = arrayList24;
                                    arrayList3 = arrayList13;
                                    str = str3;
                                    arrayList4 = arrayList12;
                                    arrayList25 = arrayList31;
                                    arrayList12 = arrayList4;
                                    arrayList23 = arrayList23;
                                    arrayList22 = arrayList;
                                    arrayList19 = arrayList2;
                                    arrayList14 = arrayList14;
                                    str3 = str;
                                    arrayList13 = arrayList3;
                                    str2 = str2;
                                    arrayList24 = arrayList24;
                                }
                                break;
                            case 639133141:
                                if (key.equals("response_info_extras_override")) {
                                    JsonObject jsonObjectA = cb1.a(value);
                                    if (jsonObjectA == null) {
                                        jsonObjectA = new JsonObject();
                                    }
                                    Unit unit71 = Unit.f29295attabal;
                                    jsonObject5 = jsonObjectA;
                                    arrayList24 = arrayList24;
                                    arrayList3 = arrayList13;
                                    str = str3;
                                    arrayList4 = arrayList12;
                                    arrayList25 = arrayList31;
                                    arrayList12 = arrayList4;
                                    arrayList23 = arrayList23;
                                    arrayList22 = arrayList;
                                    arrayList19 = arrayList2;
                                    arrayList14 = arrayList14;
                                    str3 = str;
                                    arrayList13 = arrayList3;
                                    str2 = str2;
                                    arrayList24 = arrayList24;
                                }
                                break;
                            case 754887508:
                                if (key.equals("container_sizes")) {
                                    JsonArray asJsonArray11 = value.getAsJsonArray();
                                    Intrinsics.checkNotNullExpressionValue(asJsonArray11, "getAsJsonArray(...)");
                                    int i23 = 0;
                                    for (JsonElement jsonElement22 : asJsonArray11) {
                                        int i24 = i23 + 1;
                                        if (i23 < 0) {
                                            p002kotlin.collections.adultoid.dovishness();
                                        }
                                        JsonElement jsonElement23 = jsonElement22;
                                        Intrinsics.beachfront(jsonElement23);
                                        JsonObject asJsonObject13 = jsonElement23.getAsJsonObject();
                                        Intrinsics.checkNotNullExpressionValue(asJsonObject13, "getAsJsonObject(...)");
                                        n1 n1VarAttabal2 = nonviolence.attabal(asJsonObject13);
                                        if (n1VarAttabal2 != null) {
                                            arrayList24.add(n1VarAttabal2);
                                            Unit unit72 = Unit.f29295attabal;
                                        }
                                        i23 = i24;
                                    }
                                    Unit unit73 = Unit.f29295attabal;
                                    arrayList24 = arrayList24;
                                    arrayList3 = arrayList13;
                                    str = str3;
                                    arrayList4 = arrayList12;
                                    arrayList25 = arrayList31;
                                    arrayList12 = arrayList4;
                                    arrayList23 = arrayList23;
                                    arrayList22 = arrayList;
                                    arrayList19 = arrayList2;
                                    arrayList14 = arrayList14;
                                    str3 = str;
                                    arrayList13 = arrayList3;
                                    str2 = str2;
                                    arrayList24 = arrayList24;
                                }
                                break;
                            case 791122864:
                                if (key.equals("impression_type")) {
                                    molet moletVar = d1.b;
                                    int asInt3 = value.getAsInt();
                                    moletVar.getClass();
                                    d1 d1VarAttabal = molet.attabal(asInt3);
                                    Unit unit74 = Unit.f29295attabal;
                                    d1Var2 = d1VarAttabal;
                                    arrayList24 = arrayList24;
                                    arrayList3 = arrayList13;
                                    str = str3;
                                    arrayList4 = arrayList12;
                                    arrayList25 = arrayList31;
                                    arrayList12 = arrayList4;
                                    arrayList23 = arrayList23;
                                    arrayList22 = arrayList;
                                    arrayList19 = arrayList2;
                                    arrayList14 = arrayList14;
                                    str3 = str;
                                    arrayList13 = arrayList3;
                                    str2 = str2;
                                    arrayList24 = arrayList24;
                                }
                                break;
                            case 805095541:
                                if (key.equals("analytics_event_name_to_parameters_map")) {
                                    JsonObject asJsonObject14 = value.getAsJsonObject();
                                    Intrinsics.checkNotNullExpressionValue(asJsonObject14, "getAsJsonObject(...)");
                                    Bundle bundleB = cb1.b(asJsonObject14);
                                    Unit unit75 = Unit.f29295attabal;
                                    bundle2 = bundleB;
                                    arrayList24 = arrayList24;
                                    arrayList3 = arrayList13;
                                    str = str3;
                                    arrayList4 = arrayList12;
                                    arrayList25 = arrayList31;
                                    arrayList12 = arrayList4;
                                    arrayList23 = arrayList23;
                                    arrayList22 = arrayList;
                                    arrayList19 = arrayList2;
                                    arrayList14 = arrayList14;
                                    str3 = str;
                                    arrayList13 = arrayList3;
                                    str2 = str2;
                                    arrayList24 = arrayList24;
                                }
                                break;
                            case 1010584092:
                                if (key.equals(AppLovinEventParameters.CHECKOUT_TRANSACTION_IDENTIFIER)) {
                                    String asString25 = value.getAsString();
                                    Intrinsics.checkNotNullExpressionValue(asString25, "getAsString(...)");
                                    Unit unit76 = Unit.f29295attabal;
                                    str16 = asString25;
                                    arrayList24 = arrayList24;
                                    arrayList3 = arrayList13;
                                    str = str3;
                                    arrayList4 = arrayList12;
                                    arrayList25 = arrayList31;
                                    arrayList12 = arrayList4;
                                    arrayList23 = arrayList23;
                                    arrayList22 = arrayList;
                                    arrayList19 = arrayList2;
                                    arrayList14 = arrayList14;
                                    str3 = str;
                                    arrayList13 = arrayList3;
                                    str2 = str2;
                                    arrayList24 = arrayList24;
                                }
                                break;
                            case 1100650276:
                                if (key.equals("rewards")) {
                                    Intrinsics.beachfront(value);
                                    zg2 zg2VarAttabal = supplicat.attabal(value);
                                    Unit unit77 = Unit.f29295attabal;
                                    zg2Var = zg2VarAttabal;
                                    arrayList24 = arrayList24;
                                    arrayList3 = arrayList13;
                                    str = str3;
                                    arrayList4 = arrayList12;
                                    arrayList25 = arrayList31;
                                    arrayList12 = arrayList4;
                                    arrayList23 = arrayList23;
                                    arrayList22 = arrayList;
                                    arrayList19 = arrayList2;
                                    arrayList14 = arrayList14;
                                    str3 = str;
                                    arrayList13 = arrayList3;
                                    str2 = str2;
                                    arrayList24 = arrayList24;
                                }
                                break;
                            case 1141602460:
                                if (key.equals("adapter_response_info_key")) {
                                    String asString26 = value.getAsString();
                                    Intrinsics.checkNotNullExpressionValue(asString26, "getAsString(...)");
                                    Unit unit78 = Unit.f29295attabal;
                                    str5 = asString26;
                                    arrayList24 = arrayList24;
                                    arrayList3 = arrayList13;
                                    str = str3;
                                    arrayList4 = arrayList12;
                                    arrayList25 = arrayList31;
                                    arrayList12 = arrayList4;
                                    arrayList23 = arrayList23;
                                    arrayList22 = arrayList;
                                    arrayList19 = arrayList2;
                                    arrayList14 = arrayList14;
                                    str3 = str;
                                    arrayList13 = arrayList3;
                                    str2 = str2;
                                    arrayList24 = arrayList24;
                                }
                                break;
                            case 1186014765:
                                if (key.equals("cache_hit_urls")) {
                                    JsonArray asJsonArray12 = value.getAsJsonArray();
                                    Intrinsics.checkNotNullExpressionValue(asJsonArray12, "getAsJsonArray(...)");
                                    int i25 = 0;
                                    for (JsonElement jsonElement24 : asJsonArray12) {
                                        int i26 = i25 + 1;
                                        if (i25 < 0) {
                                            p002kotlin.collections.adultoid.dovishness();
                                        }
                                        JsonElement jsonElement25 = jsonElement24;
                                        Intrinsics.beachfront(jsonElement25);
                                        String asString27 = jsonElement25.getAsString();
                                        Intrinsics.checkNotNullExpressionValue(asString27, "getAsString(...)");
                                        Uri uri9 = Uri.parse(asString27);
                                        if (uri9 != null) {
                                            arrayList29.add(uri9);
                                            Unit unit79 = Unit.f29295attabal;
                                        }
                                        i25 = i26;
                                    }
                                    Unit unit80 = Unit.f29295attabal;
                                    arrayList24 = arrayList24;
                                    arrayList3 = arrayList13;
                                    str = str3;
                                    arrayList4 = arrayList12;
                                    arrayList25 = arrayList31;
                                    arrayList12 = arrayList4;
                                    arrayList23 = arrayList23;
                                    arrayList22 = arrayList;
                                    arrayList19 = arrayList2;
                                    arrayList14 = arrayList14;
                                    str3 = str;
                                    arrayList13 = arrayList3;
                                    str2 = str2;
                                    arrayList24 = arrayList24;
                                }
                                break;
                            case 1303622534:
                                if (key.equals("preload_sort_value")) {
                                    asDouble = value.getAsDouble();
                                    Unit unit81 = Unit.f29295attabal;
                                    arrayList24 = arrayList24;
                                    arrayList3 = arrayList13;
                                    str = str3;
                                    arrayList4 = arrayList12;
                                    arrayList25 = arrayList31;
                                    arrayList12 = arrayList4;
                                    arrayList23 = arrayList23;
                                    arrayList22 = arrayList;
                                    arrayList19 = arrayList2;
                                    arrayList14 = arrayList14;
                                    str3 = str;
                                    arrayList13 = arrayList3;
                                    str2 = str2;
                                    arrayList24 = arrayList24;
                                }
                                break;
                            case 1321720943:
                                if (key.equals("allow_pub_owned_ad_view")) {
                                    boolean asBoolean11 = value.getAsBoolean();
                                    Unit unit82 = Unit.f29295attabal;
                                    z = asBoolean11;
                                    arrayList24 = arrayList24;
                                    arrayList3 = arrayList13;
                                    str = str3;
                                    arrayList4 = arrayList12;
                                    arrayList25 = arrayList31;
                                    arrayList12 = arrayList4;
                                    arrayList23 = arrayList23;
                                    arrayList22 = arrayList;
                                    arrayList19 = arrayList2;
                                    arrayList14 = arrayList14;
                                    str3 = str;
                                    arrayList13 = arrayList3;
                                    str2 = str2;
                                    arrayList24 = arrayList24;
                                }
                                break;
                            case 1364100807:
                                if (key.equals("recursive_request_parameters")) {
                                    JsonObject asJsonObject15 = value.getAsJsonObject();
                                    Intrinsics.checkNotNullExpressionValue(asJsonObject15, "getAsJsonObject(...)");
                                    Unit unit83 = Unit.f29295attabal;
                                    jsonObject7 = asJsonObject15;
                                    arrayList24 = arrayList24;
                                    arrayList3 = arrayList13;
                                    str = str3;
                                    arrayList4 = arrayList12;
                                    arrayList25 = arrayList31;
                                    arrayList12 = arrayList4;
                                    arrayList23 = arrayList23;
                                    arrayList22 = arrayList;
                                    arrayList19 = arrayList2;
                                    arrayList14 = arrayList14;
                                    str3 = str;
                                    arrayList13 = arrayList3;
                                    str2 = str2;
                                    arrayList24 = arrayList24;
                                }
                                break;
                            case 1422388341:
                                if (key.equals("is_collapsible")) {
                                    boolean asBoolean12 = value.getAsBoolean();
                                    Unit unit84 = Unit.f29295attabal;
                                    z6 = asBoolean12;
                                    arrayList24 = arrayList24;
                                    arrayList3 = arrayList13;
                                    str = str3;
                                    arrayList4 = arrayList12;
                                    arrayList25 = arrayList31;
                                    arrayList12 = arrayList4;
                                    arrayList23 = arrayList23;
                                    arrayList22 = arrayList;
                                    arrayList19 = arrayList2;
                                    arrayList14 = arrayList14;
                                    str3 = str;
                                    arrayList13 = arrayList3;
                                    str2 = str2;
                                    arrayList24 = arrayList24;
                                }
                                break;
                            case 1437255331:
                                if (key.equals(CampaignEx.JSON_KEY_AD_SOURCE_ID)) {
                                    String asString28 = value.getAsString();
                                    Intrinsics.checkNotNullExpressionValue(asString28, "getAsString(...)");
                                    Unit unit85 = Unit.f29295attabal;
                                    str8 = asString28;
                                    arrayList24 = arrayList24;
                                    arrayList3 = arrayList13;
                                    str = str3;
                                    arrayList4 = arrayList12;
                                    arrayList25 = arrayList31;
                                    arrayList12 = arrayList4;
                                    arrayList23 = arrayList23;
                                    arrayList22 = arrayList;
                                    arrayList19 = arrayList2;
                                    arrayList14 = arrayList14;
                                    str3 = str;
                                    arrayList13 = arrayList3;
                                    str2 = str2;
                                    arrayList24 = arrayList24;
                                }
                                break;
                            case 1556932485:
                                if (key.equals("post_click_lifecycle_monitoring_duration_ms")) {
                                    p002kotlin.time.saneness.Companion companion4 = p002kotlin.time.saneness.INSTANCE;
                                    jMolybdenite3 = p002kotlin.time.dern.molybdenite(value.getAsInt(), DurationUnit.MILLISECONDS);
                                    Unit unit86 = Unit.f29295attabal;
                                    arrayList24 = arrayList24;
                                    arrayList3 = arrayList13;
                                    str = str3;
                                    arrayList4 = arrayList12;
                                    arrayList25 = arrayList31;
                                    arrayList12 = arrayList4;
                                    arrayList23 = arrayList23;
                                    arrayList22 = arrayList;
                                    arrayList19 = arrayList2;
                                    arrayList14 = arrayList14;
                                    str3 = str;
                                    arrayList13 = arrayList3;
                                    str2 = str2;
                                    arrayList24 = arrayList24;
                                }
                                break;
                            case 1565514205:
                                if (key.equals("adapter_only_third_party_impression")) {
                                    boolean asBoolean13 = value.getAsBoolean();
                                    Unit unit87 = Unit.f29295attabal;
                                    z17 = asBoolean13;
                                    arrayList24 = arrayList24;
                                    arrayList3 = arrayList13;
                                    str = str3;
                                    arrayList4 = arrayList12;
                                    arrayList25 = arrayList31;
                                    arrayList12 = arrayList4;
                                    arrayList23 = arrayList23;
                                    arrayList22 = arrayList;
                                    arrayList19 = arrayList2;
                                    arrayList14 = arrayList14;
                                    str3 = str;
                                    arrayList13 = arrayList3;
                                    str2 = str2;
                                    arrayList24 = arrayList24;
                                }
                                break;
                            case 1637553475:
                                if (key.equals("bid_response")) {
                                    String asString29 = value.getAsString();
                                    Intrinsics.checkNotNullExpressionValue(asString29, "getAsString(...)");
                                    Unit unit88 = Unit.f29295attabal;
                                    str11 = asString29;
                                    arrayList24 = arrayList24;
                                    arrayList3 = arrayList13;
                                    str = str3;
                                    arrayList4 = arrayList12;
                                    arrayList25 = arrayList31;
                                    arrayList12 = arrayList4;
                                    arrayList23 = arrayList23;
                                    arrayList22 = arrayList;
                                    arrayList19 = arrayList2;
                                    arrayList14 = arrayList14;
                                    str3 = str;
                                    arrayList13 = arrayList3;
                                    str2 = str2;
                                    arrayList24 = arrayList24;
                                }
                                break;
                            case 1638957285:
                                if (key.equals("video_start_urls")) {
                                    JsonArray asJsonArray13 = value.getAsJsonArray();
                                    Intrinsics.checkNotNullExpressionValue(asJsonArray13, "getAsJsonArray(...)");
                                    int i27 = 0;
                                    for (JsonElement jsonElement26 : asJsonArray13) {
                                        int i28 = i27 + 1;
                                        if (i27 < 0) {
                                            p002kotlin.collections.adultoid.dovishness();
                                        }
                                        JsonElement jsonElement27 = jsonElement26;
                                        Intrinsics.beachfront(jsonElement27);
                                        String asString30 = jsonElement27.getAsString();
                                        Intrinsics.checkNotNullExpressionValue(asString30, "getAsString(...)");
                                        Uri uri10 = Uri.parse(asString30);
                                        if (uri10 != null) {
                                            arrayList16.add(uri10);
                                            Unit unit89 = Unit.f29295attabal;
                                        }
                                        i27 = i28;
                                    }
                                    Unit unit90 = Unit.f29295attabal;
                                    arrayList24 = arrayList24;
                                    arrayList3 = arrayList13;
                                    str = str3;
                                    arrayList4 = arrayList12;
                                    arrayList25 = arrayList31;
                                    arrayList12 = arrayList4;
                                    arrayList23 = arrayList23;
                                    arrayList22 = arrayList;
                                    arrayList19 = arrayList2;
                                    arrayList14 = arrayList14;
                                    str3 = str;
                                    arrayList13 = arrayList3;
                                    str2 = str2;
                                    arrayList24 = arrayList24;
                                }
                                break;
                            case 1686319423:
                                if (key.equals("ad_network_class_name")) {
                                    String asString31 = value.getAsString();
                                    Intrinsics.checkNotNullExpressionValue(asString31, "getAsString(...)");
                                    Unit unit91 = Unit.f29295attabal;
                                    str22 = asString31;
                                    arrayList24 = arrayList24;
                                    arrayList3 = arrayList13;
                                    str = str3;
                                    arrayList4 = arrayList12;
                                    arrayList25 = arrayList31;
                                    arrayList12 = arrayList4;
                                    arrayList23 = arrayList23;
                                    arrayList22 = arrayList;
                                    arrayList19 = arrayList2;
                                    arrayList14 = arrayList14;
                                    str3 = str;
                                    arrayList13 = arrayList3;
                                    str2 = str2;
                                    arrayList24 = arrayList24;
                                }
                                break;
                            case 1688341040:
                                if (key.equals("video_reward_urls")) {
                                    JsonArray asJsonArray14 = value.getAsJsonArray();
                                    Intrinsics.checkNotNullExpressionValue(asJsonArray14, "getAsJsonArray(...)");
                                    int i29 = 0;
                                    for (JsonElement jsonElement28 : asJsonArray14) {
                                        int i30 = i29 + 1;
                                        if (i29 < 0) {
                                            p002kotlin.collections.adultoid.dovishness();
                                        }
                                        JsonElement jsonElement29 = jsonElement28;
                                        Intrinsics.beachfront(jsonElement29);
                                        String asString32 = jsonElement29.getAsString();
                                        Intrinsics.checkNotNullExpressionValue(asString32, "getAsString(...)");
                                        Uri uri11 = Uri.parse(asString32);
                                        if (uri11 != null) {
                                            arrayList17.add(uri11);
                                            Unit unit92 = Unit.f29295attabal;
                                        }
                                        i29 = i30;
                                    }
                                    Unit unit93 = Unit.f29295attabal;
                                    arrayList24 = arrayList24;
                                    arrayList3 = arrayList13;
                                    str = str3;
                                    arrayList4 = arrayList12;
                                    arrayList25 = arrayList31;
                                    arrayList12 = arrayList4;
                                    arrayList23 = arrayList23;
                                    arrayList22 = arrayList;
                                    arrayList19 = arrayList2;
                                    arrayList14 = arrayList14;
                                    str3 = str;
                                    arrayList13 = arrayList3;
                                    str2 = str2;
                                    arrayList24 = arrayList24;
                                }
                                break;
                            case 1799285870:
                                if (key.equals("use_third_party_container_height")) {
                                    boolean asBoolean14 = value.getAsBoolean();
                                    Unit unit94 = Unit.f29295attabal;
                                    z14 = asBoolean14;
                                    arrayList24 = arrayList24;
                                    arrayList3 = arrayList13;
                                    str = str3;
                                    arrayList4 = arrayList12;
                                    arrayList25 = arrayList31;
                                    arrayList12 = arrayList4;
                                    arrayList23 = arrayList23;
                                    arrayList22 = arrayList;
                                    arrayList19 = arrayList2;
                                    arrayList14 = arrayList14;
                                    str3 = str;
                                    arrayList13 = arrayList3;
                                    str2 = str2;
                                    arrayList24 = arrayList24;
                                }
                                break;
                            case 1839650832:
                                if (key.equals("renderers")) {
                                    JsonArray asJsonArray15 = value.getAsJsonArray();
                                    Intrinsics.checkNotNullExpressionValue(asJsonArray15, "getAsJsonArray(...)");
                                    int i31 = 0;
                                    for (JsonElement jsonElement30 : asJsonArray15) {
                                        int i32 = i31 + 1;
                                        if (i31 < 0) {
                                            p002kotlin.collections.adultoid.dovishness();
                                        }
                                        JsonElement jsonElement31 = jsonElement30;
                                        Intrinsics.beachfront(jsonElement31);
                                        String asString33 = jsonElement31.getAsString();
                                        if (asString33 != null) {
                                            arrayList12.add(asString33);
                                            Unit unit95 = Unit.f29295attabal;
                                        }
                                        i31 = i32;
                                    }
                                    Unit unit96 = Unit.f29295attabal;
                                    arrayList24 = arrayList24;
                                    arrayList3 = arrayList13;
                                    str = str3;
                                    arrayList4 = arrayList12;
                                    arrayList25 = arrayList31;
                                    arrayList12 = arrayList4;
                                    arrayList23 = arrayList23;
                                    arrayList22 = arrayList;
                                    arrayList19 = arrayList2;
                                    arrayList14 = arrayList14;
                                    str3 = str;
                                    arrayList13 = arrayList3;
                                    str2 = str2;
                                    arrayList24 = arrayList24;
                                }
                                break;
                            case 1875425491:
                                if (key.equals("is_analytics_logging_enabled")) {
                                    boolean asBoolean15 = value.getAsBoolean();
                                    Unit unit97 = Unit.f29295attabal;
                                    z12 = asBoolean15;
                                    arrayList24 = arrayList24;
                                    arrayList3 = arrayList13;
                                    str = str3;
                                    arrayList4 = arrayList12;
                                    arrayList25 = arrayList31;
                                    arrayList12 = arrayList4;
                                    arrayList23 = arrayList23;
                                    arrayList22 = arrayList;
                                    arrayList19 = arrayList2;
                                    arrayList14 = arrayList14;
                                    str3 = str;
                                    arrayList13 = arrayList3;
                                    str2 = str2;
                                    arrayList24 = arrayList24;
                                }
                                break;
                            case 2068142375:
                                if (key.equals("rule_line_external_id")) {
                                    String asString34 = value.getAsString();
                                    Intrinsics.checkNotNullExpressionValue(asString34, "getAsString(...)");
                                    Unit unit98 = Unit.f29295attabal;
                                    str18 = asString34;
                                    arrayList24 = arrayList24;
                                    arrayList3 = arrayList13;
                                    str = str3;
                                    arrayList4 = arrayList12;
                                    arrayList25 = arrayList31;
                                    arrayList12 = arrayList4;
                                    arrayList23 = arrayList23;
                                    arrayList22 = arrayList;
                                    arrayList19 = arrayList2;
                                    arrayList14 = arrayList14;
                                    str3 = str;
                                    arrayList13 = arrayList3;
                                    str2 = str2;
                                    arrayList24 = arrayList24;
                                }
                                break;
                            case 2072888499:
                                if (key.equals("manual_tracking_urls")) {
                                    JsonArray asJsonArray16 = value.getAsJsonArray();
                                    Intrinsics.checkNotNullExpressionValue(asJsonArray16, "getAsJsonArray(...)");
                                    int i33 = 0;
                                    for (JsonElement jsonElement32 : asJsonArray16) {
                                        int i34 = i33 + 1;
                                        if (i33 < 0) {
                                            p002kotlin.collections.adultoid.dovishness();
                                        }
                                        JsonElement jsonElement33 = jsonElement32;
                                        Intrinsics.beachfront(jsonElement33);
                                        String asString35 = jsonElement33.getAsString();
                                        Intrinsics.checkNotNullExpressionValue(asString35, "getAsString(...)");
                                        Uri uri12 = Uri.parse(asString35);
                                        if (uri12 != null) {
                                            arrayList23.add(uri12);
                                            Unit unit99 = Unit.f29295attabal;
                                        }
                                        i33 = i34;
                                    }
                                    Unit unit100 = Unit.f29295attabal;
                                    arrayList24 = arrayList24;
                                    arrayList3 = arrayList13;
                                    str = str3;
                                    arrayList4 = arrayList12;
                                    arrayList25 = arrayList31;
                                    arrayList12 = arrayList4;
                                    arrayList23 = arrayList23;
                                    arrayList22 = arrayList;
                                    arrayList19 = arrayList2;
                                    arrayList14 = arrayList14;
                                    str3 = str;
                                    arrayList13 = arrayList3;
                                    str2 = str2;
                                    arrayList24 = arrayList24;
                                }
                                break;
                            case 2075506442:
                                if (key.equals("render_serially")) {
                                    boolean asBoolean16 = value.getAsBoolean();
                                    Unit unit101 = Unit.f29295attabal;
                                    z10 = asBoolean16;
                                    arrayList24 = arrayList24;
                                    arrayList3 = arrayList13;
                                    str = str3;
                                    arrayList4 = arrayList12;
                                    arrayList25 = arrayList31;
                                    arrayList12 = arrayList4;
                                    arrayList23 = arrayList23;
                                    arrayList22 = arrayList;
                                    arrayList19 = arrayList2;
                                    arrayList14 = arrayList14;
                                    str3 = str;
                                    arrayList13 = arrayList3;
                                    str2 = str2;
                                    arrayList24 = arrayList24;
                                }
                                break;
                            case 2117205836:
                                if (key.equals("flow_control")) {
                                    boolean asBoolean17 = value.getAsBoolean();
                                    Unit unit102 = Unit.f29295attabal;
                                    z16 = asBoolean17;
                                    arrayList24 = arrayList24;
                                    arrayList3 = arrayList13;
                                    str = str3;
                                    arrayList4 = arrayList12;
                                    arrayList25 = arrayList31;
                                    arrayList12 = arrayList4;
                                    arrayList23 = arrayList23;
                                    arrayList22 = arrayList;
                                    arrayList19 = arrayList2;
                                    arrayList14 = arrayList14;
                                    str3 = str;
                                    arrayList13 = arrayList3;
                                    str2 = str2;
                                    arrayList24 = arrayList24;
                                }
                                break;
                            default:
                                break;
                        }
                    } else {
                        arrayList = arrayList22;
                        arrayList2 = arrayList19;
                    }
                    arrayList31 = arrayList31;
                    arrayList24 = arrayList24;
                    arrayList3 = arrayList13;
                    str = str3;
                    arrayList4 = arrayList12;
                    com.google.common.base.triweekly triweeklyVar19 = kn0.a;
                    kn0.a(new a1(key));
                    Unit unit1110 = Unit.f29295attabal;
                    arrayList25 = arrayList31;
                    arrayList12 = arrayList4;
                    arrayList23 = arrayList23;
                    arrayList22 = arrayList;
                    arrayList19 = arrayList2;
                    arrayList14 = arrayList14;
                    str3 = str;
                    arrayList13 = arrayList3;
                    str2 = str2;
                    arrayList24 = arrayList24;
                }
                ArrayList arrayList33 = arrayList23;
                ArrayList arrayList34 = arrayList22;
                ArrayList arrayList35 = arrayList12;
                ArrayList arrayList36 = arrayList24;
                ArrayList arrayList37 = arrayList13;
                ArrayList arrayList38 = arrayList14;
                ArrayList arrayList39 = arrayList25;
                ArrayList arrayList40 = arrayList19;
                d1 d1Var3 = d1Var2;
                if (d1Var3 != d1.THIRD_PARTY_SDK_CALLBACK) {
                    q6Var = q6Var3;
                    if (q6Var == q6.NATIVE && z17) {
                    }
                    arrayList39.replaceAll(new UnaryOperator() { // from class: saneness.mathsort
                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            return splinterproof.wireman(ref$ObjectRef, (String) obj);
                        }
                    });
                    JsonObject jsonObject11 = (JsonObject) ref$ObjectRef.element;
                    Intrinsics.beachfront(bundle2);
                    return new h1(str4, arrayList39, jsonObject11, str5, arrayList15, str22, arrayList30, str7, str8, str9, str10, q6Var, k7Var, str6, z, z18, bundle2, str11, z2, arrayList29, z3, arrayList37, i, str20, arrayList36, str23, jsonObject9, jsonObject8, arrayList40, z4, str12, d1Var3, arrayList38, wx0Var, str13, i2, z5, z6, z7, z8, z9, arrayList33, arrayList28, ay1Var2, str21, arrayList26, jMolybdenite2, arrayList34, str14, jsonObject7, arrayList35, z10, z11, jMolybdenite, str15, arrayList17, str16, str17, arrayList18, arrayList16, zg2Var, jsonObject6, str18, ck2Var2, z12, g1Var, z13, z14, str19, rt1Var, m22Var, ns1Var2, asDouble, z52Var2, z15, z16, jMolybdenite3, jsonObject5, 0);
                }
                q6Var = q6Var3;
                g1Var = g1.THIRD_PARTY_SDK_CALLBACK;
                arrayList39.replaceAll(new UnaryOperator() { // from class: saneness.mathsort
                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return splinterproof.wireman(ref$ObjectRef, (String) obj);
                    }
                });
                JsonObject jsonObject12 = (JsonObject) ref$ObjectRef.element;
                Intrinsics.beachfront(bundle2);
                return new h1(str4, arrayList39, jsonObject12, str5, arrayList15, str22, arrayList30, str7, str8, str9, str10, q6Var, k7Var, str6, z, z18, bundle2, str11, z2, arrayList29, z3, arrayList37, i, str20, arrayList36, str23, jsonObject9, jsonObject8, arrayList40, z4, str12, d1Var3, arrayList38, wx0Var, str13, i2, z5, z6, z7, z8, z9, arrayList33, arrayList28, ay1Var2, str21, arrayList26, jMolybdenite2, arrayList34, str14, jsonObject7, arrayList35, z10, z11, jMolybdenite, str15, arrayList17, str16, str17, arrayList18, arrayList16, zg2Var, jsonObject6, str18, ck2Var2, z12, g1Var, z13, z14, str19, rt1Var, m22Var, ns1Var2, asDouble, z52Var2, z15, z16, jMolybdenite3, jsonObject5, 0);
            } catch (Exception e) {
                e = e;
                List list2 = rajahmundry.attabal(e, "t", e).s;
                String message = e.getMessage();
                if (message == null) {
                    message = e.getClass().getName();
                }
                Intrinsics.beachfront(message);
                list2.add(message);
                return h1Var;
            }
        } catch (Exception e2) {
            e = e2;
            h1Var = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final String wireman(Ref$ObjectRef adapterData, String it) {
        Intrinsics.checkNotNullParameter(adapterData, "$adapterData");
        Intrinsics.checkNotNullParameter(it, "it");
        List list = h1.A0;
        return dern((JsonObject) adapterData.element, it);
    }
}
