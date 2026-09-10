package com.inmobi.media;

import android.graphics.Point;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.inmobi.commons.core.configs.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.smartdigimkt.expressad.advanced.js.NativeAdvancedJsUtils;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.vungle.ads.internal.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.p8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3177p8 {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ int f23882u = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JSONObject f23883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte f23884b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f23885c;
    public final JSONObject d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C3049h8 f23886e;
    public final JSONArray f;
    public C3177p8 g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final HashMap f23887h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final HashMap f23888i;
    public final HashMap j;
    public final HashMap k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Ue f23889l;
    public final AdConfig m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final InterfaceC3333z5 f23890n;
    public final int o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final C3161o8 f23891p;
    public boolean q;
    public F9 r;
    public final boolean s;
    public final Map t;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3177p8(int i2, JSONObject pubContent, AdConfig adConfig, HashMap map, Ue ue, InterfaceC3333z5 interfaceC3333z5) {
        this(i2, pubContent, null, false, adConfig, map, ue, interfaceC3333z5);
        Intrinsics.f(pubContent, "pubContent");
        Intrinsics.f(adConfig, "adConfig");
    }

    public static int a(int i2) {
        return (int) (U3.b() * i2);
    }

    public final C3049h8 b(int i2) {
        C3049h8 c3049h8 = this.f23886e;
        if (c3049h8 != null) {
            int i3 = 0;
            while (i3 < c3049h8.f23660B) {
                try {
                    int i4 = i3 + 1;
                    C2984d8 c2984d8 = (C2984d8) c3049h8.f23659A.get(i3);
                    Intrinsics.c(c2984d8);
                    if (StringsKt.r(c2984d8.f23514b, "card_scrollable", true)) {
                        C3049h8 c3049h9 = c2984d8 instanceof C3049h8 ? (C3049h8) c2984d8 : null;
                        if (i2 < (c3049h9 != null ? c3049h9.f23660B : 0)) {
                            C2984d8 c2984d9 = (c3049h9 == null || i2 < 0 || i2 >= c3049h9.f23660B) ? null : (C2984d8) c3049h9.f23659A.get(i2);
                            if (c2984d9 instanceof C3049h8) {
                                return (C3049h8) c2984d9;
                            }
                        }
                        return null;
                    }
                    i3 = i4;
                } catch (IndexOutOfBoundsException e2) {
                    throw new NoSuchElementException(e2.getMessage());
                }
            }
        }
        return null;
    }

    public final ArrayList c() {
        HashMap map = this.f23888i;
        return new ArrayList(map != null ? map.keySet() : null);
    }

    public final int d() {
        C3049h8<C2984d8> c3049h8 = this.f23886e;
        if (c3049h8 != null) {
            for (C2984d8 c2984d8 : c3049h8) {
                if (StringsKt.r(c2984d8.f23514b, "card_scrollable", true)) {
                    if (!(c2984d8 instanceof C3049h8)) {
                        break;
                    }
                    return ((C3049h8) c2984d8).f23660B;
                }
            }
        }
        return 0;
    }

    public final JSONObject e() {
        try {
            JSONArray jSONArray = this.f;
            if (jSONArray != null) {
                return jSONArray.getJSONObject(0);
            }
            return null;
        } catch (JSONException e2) {
            InterfaceC3333z5 interfaceC3333z5 = this.f23890n;
            if (interfaceC3333z5 == null) {
                return null;
            }
            ((A5) interfaceC3333z5).b("p8", E0.a(e2, H6.a("p8", "TAG", "Exception while getting Pages - ")));
            return null;
        }
    }

    public final boolean f() {
        C3049h8 c3049h8;
        C3049h8 c3049h9 = this.f23886e;
        if (c3049h9 == null) {
            InterfaceC3333z5 interfaceC3333z5 = this.f23890n;
            if (interfaceC3333z5 == null) {
                return false;
            }
            ((A5) interfaceC3333z5).b("p8", "Invalid Data Model: No Root Container");
            return false;
        }
        Iterator it = c3049h9.iterator();
        while (true) {
            C3033g8 c3033g8 = (C3033g8) it;
            if (c3033g8.hasNext()) {
                C2984d8 c2984d8 = (C2984d8) c3033g8.next();
                if (StringsKt.r(c2984d8.f23514b, "card_scrollable", true)) {
                    if (c2984d8 instanceof C3049h8) {
                        c3049h8 = (C3049h8) c2984d8;
                        break;
                    }
                }
            }
            c3049h8 = null;
            break;
        }
        if (c3049h8 == null) {
            InterfaceC3333z5 interfaceC3333z6 = this.f23890n;
            if (interfaceC3333z6 != null) {
                ((A5) interfaceC3333z6).b("p8", "No Card Scrollable in the data model");
            }
            return g();
        }
        if (d() > 0) {
            return g();
        }
        InterfaceC3333z5 interfaceC3333z7 = this.f23890n;
        if (interfaceC3333z7 == null) {
            return false;
        }
        ((A5) interfaceC3333z7).b("p8", "Invalid Data Model: No Cards in Card Scrollable");
        return false;
    }

    public final boolean g() {
        InterfaceC3333z5 interfaceC3333z5;
        List<C2984d8> listN = n("VIDEO");
        if (listN != null && !listN.isEmpty()) {
            for (C2984d8 c2984d8 : listN) {
                if (c2984d8.f23513a.length() == 0 && (interfaceC3333z5 = this.f23890n) != null) {
                    ((A5) interfaceC3333z5).b("p8", "Video asset has invalid ID! CTA link resolution may not work");
                }
                C2968c9 c2968c9 = c2984d8 instanceof C2968c9 ? (C2968c9) c2984d8 : null;
                if ((c2968c9 != null ? c2968c9.d() : null) == null) {
                    InterfaceC3333z5 interfaceC3333z6 = this.f23890n;
                    if (interfaceC3333z6 != null) {
                        ((A5) interfaceC3333z6).b("p8", "No Vast XML. Discarding DataModel");
                    }
                    return false;
                }
                Ve veD = c2968c9.d();
                ArrayList arrayList = veD != null ? ((Ue) veD).f23282e : null;
                if (arrayList == null || arrayList.isEmpty()) {
                    InterfaceC3333z5 interfaceC3333z7 = this.f23890n;
                    if (interfaceC3333z7 != null) {
                        ((A5) interfaceC3333z7).b("p8", "No Media files. Discarding DataModel");
                    }
                    return false;
                }
                Ve veD2 = c2968c9.d();
                String strB = veD2 != null ? ((Ue) veD2).b() : null;
                if (strB == null || strB.length() == 0) {
                    InterfaceC3333z5 interfaceC3333z8 = this.f23890n;
                    if (interfaceC3333z8 != null) {
                        ((A5) interfaceC3333z8).b("p8", "Invalid Media URL.Discarding the model");
                    }
                    c2968c9.a("error", MapsKt.g(new Pair("[ERRORCODE]", "403")), (L7) null, this.f23890n);
                    return false;
                }
            }
        }
        return true;
    }

    public final void h() {
        C3161o8 c3161o8;
        C3161o8 c3161o9;
        try {
            JSONObject jSONObject = this.f23883a;
            if (jSONObject == null) {
                C3161o8 c3161o10 = this.f23891p;
                if (c3161o10 == null) {
                    return;
                }
                c3161o10.f23869c = new C2984d8((String) null, (String) null, (String) null, (C3001e8) null, 31);
                return;
            }
            if (!jSONObject.isNull("passThroughJson") && (c3161o9 = this.f23891p) != null) {
                c3161o9.f23867a = jSONObject.getJSONObject("passThroughJson");
            }
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("adContent");
            if (jSONObjectOptJSONObject != null && (c3161o8 = this.f23891p) != null) {
                C3145n8 c3145n8 = c3161o8.f23868b;
                c3145n8.f23829a = jSONObjectOptJSONObject.optString("title", null);
                c3145n8.f23830b = jSONObjectOptJSONObject.optString("description", null);
                c3145n8.d = jSONObjectOptJSONObject.optString("ctaText", null);
                c3145n8.f23831c = jSONObjectOptJSONObject.optString("iconUrl", null);
                c3145n8.f23832e = jSONObjectOptJSONObject.optLong("rating", 0L);
                c3145n8.f = jSONObjectOptJSONObject.optString("landingPageUrl", null);
                c3145n8.g = jSONObjectOptJSONObject.optBoolean("isApp");
            }
            C2984d8 c2984d8 = new C2984d8((String) null, (String) null, (String) null, (C3001e8) null, 31);
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("onClick");
            if (jSONObjectOptJSONObject2 != null) {
                try {
                    a(c2984d8, jSONObjectOptJSONObject2);
                } catch (JSONException unused) {
                    InterfaceC3333z5 interfaceC3333z5 = this.f23890n;
                    if (interfaceC3333z5 != null) {
                        ((A5) interfaceC3333z5).b("p8", "JSONException in parsing click params for publisher CTA");
                    }
                }
                if (!jSONObjectOptJSONObject2.isNull("openMode")) {
                    String string = jSONObjectOptJSONObject2.getString("openMode");
                    Intrinsics.c(string);
                    String strB = b(string);
                    Intrinsics.f(strB, "<set-?>");
                    c2984d8.g = strB;
                    String strOptString = jSONObjectOptJSONObject2.optString("fallbackUrl");
                    Intrinsics.e(strOptString, "optString(...)");
                    c2984d8.a(strOptString);
                }
                c2984d8.f23518i = jSONObjectOptJSONObject2.optBoolean("supportLockScreen", false);
            }
            ArrayList arrayListJ = j(jSONObject);
            if (arrayListJ != null) {
                c2984d8.s.addAll(arrayListJ);
            }
            C3161o8 c3161o11 = this.f23891p;
            if (c3161o11 == null) {
                return;
            }
            c3161o11.f23869c = c2984d8;
        } catch (JSONException unused2) {
            InterfaceC3333z5 interfaceC3333z6 = this.f23890n;
            if (interfaceC3333z6 != null) {
                ((A5) interfaceC3333z6).b("p8", "Exception in getting publisher values from JSON");
            }
        }
    }

    public final JSONObject i(JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = jSONObject.isNull("assetStyle") ? null : jSONObject.getJSONObject("assetStyle");
            if (jSONObject2 != null) {
                return jSONObject2;
            }
            if (jSONObject.isNull("assetStyleRef")) {
                return new JSONObject();
            }
            String string = jSONObject.getString("assetStyleRef");
            JSONObject jSONObject3 = this.d;
            JSONObject jSONObjectOptJSONObject = jSONObject3 != null ? jSONObject3.optJSONObject(string) : null;
            return jSONObjectOptJSONObject == null ? new JSONObject() : jSONObjectOptJSONObject;
        } catch (JSONException e2) {
            InterfaceC3333z5 interfaceC3333z5 = this.f23890n;
            if (interfaceC3333z5 != null) {
                ((A5) interfaceC3333z5).b("p8", E0.a(e2, H6.a("p8", "TAG", "Exception while getting assetStyle - ")));
            }
            return new JSONObject();
        }
    }

    public final ArrayList j(JSONObject jSONObject) {
        if (jSONObject.isNull("trackers")) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("trackers");
            Intrinsics.c(jSONArray);
            if (!B2.a(jSONArray)) {
                int length = jSONArray.length();
                for (int i2 = 0; i2 < length; i2++) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                    if (!jSONObject2.isNull("trackerType")) {
                        String string = jSONObject2.getString("trackerType");
                        Intrinsics.c(string);
                        if ("url_ping".equals(k(string))) {
                            int iOptInt = jSONObject2.optInt("eventId", 0);
                            if (!jSONObject2.isNull("uiEvent")) {
                                String string2 = jSONObject2.getString("uiEvent");
                                Intrinsics.c(string2);
                                String strG = g(string2);
                                if (!"unknown".equals(strG)) {
                                    if ("OMID_VIEWABILITY".equals(strG)) {
                                        arrayList.addAll(o(jSONObject2));
                                    } else {
                                        U8 u8A = a(iOptInt, strG, jSONObject2);
                                        if (u8A != null) {
                                            arrayList.add(u8A);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } catch (JSONException e2) {
            InterfaceC3333z5 interfaceC3333z5 = this.f23890n;
            if (interfaceC3333z5 != null) {
                ((A5) interfaceC3333z5).b("p8", E0.a(e2, H6.a("p8", "TAG", "Exception while getting assetTrackers - ")));
            }
        }
        return arrayList;
    }

    public final String k(JSONObject jSONObject) {
        try {
            String string = jSONObject.getString("assetType");
            Intrinsics.c(string);
            return string;
        } catch (JSONException e2) {
            InterfaceC3333z5 interfaceC3333z5 = this.f23890n;
            if (interfaceC3333z5 == null) {
                return "";
            }
            ((A5) interfaceC3333z5).b("p8", E0.a(e2, H6.a("p8", "TAG", "Exception while getting assetType - ")));
            return "";
        }
    }

    public final String l(JSONObject jSONObject) {
        try {
            if (!StringsKt.r(k(jSONObject), "ICON", true) && !StringsKt.r(k(jSONObject), "IMAGE", true) && !StringsKt.r(k(jSONObject), "GIF", true)) {
                return "";
            }
            String string = jSONObject.getJSONArray("assetValue").getString(0);
            Intrinsics.e(string, "getString(...)");
            if (string.length() <= 0) {
                return "";
            }
            String string2 = jSONObject.getJSONArray("assetValue").getString(0);
            Intrinsics.e(string2, "getString(...)");
            return string2;
        } catch (JSONException e2) {
            InterfaceC3333z5 interfaceC3333z5 = this.f23890n;
            if (interfaceC3333z5 == null) {
                return "";
            }
            ((A5) interfaceC3333z5).b("p8", E0.a(e2, H6.a("p8", "TAG", "Exception while getting assetUrl - ")));
            return "";
        }
    }

    public final C2984d8 m(String str) {
        HashMap map;
        C2984d8 c2984d8;
        if (str != null && str.length() != 0) {
            HashMap map2 = this.j;
            if (map2 != null && (c2984d8 = (C2984d8) map2.get(str)) != null) {
                return c2984d8;
            }
            C3177p8 c3177p8 = this.g;
            if (c3177p8 != null && (map = c3177p8.j) != null) {
                return (C2984d8) map.get(str);
            }
        }
        return null;
    }

    public final List n(String assetType) {
        ArrayList arrayList;
        Intrinsics.f(assetType, "assetType");
        HashMap map = this.f23888i;
        return (map == null || (arrayList = (ArrayList) map.get(assetType)) == null) ? EmptyList.X : arrayList;
    }

    public final ArrayList o(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        try {
            HashMap map = new HashMap();
            if (!jSONObject.isNull("macros")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("macros");
                Iterator<String> itKeys = jSONObject2.keys();
                Intrinsics.c(itKeys);
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    String string = jSONObject2.getString(next);
                    Intrinsics.c(next);
                    Intrinsics.c(string);
                    map.put(next, string);
                }
            }
            JSONArray jSONArray = jSONObject.getJSONArray("adVerifications");
            int length = jSONArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                JSONObject jSONObject3 = jSONArray.getJSONObject(i2);
                if (!jSONObject3.isNull("url")) {
                    String strOptString = jSONObject3.optString("vendor");
                    String strOptString2 = jSONObject3.optString("verificationParams");
                    String string2 = jSONObject3.getString("url");
                    Intrinsics.c(strOptString);
                    Intrinsics.c(string2);
                    arrayList.add(new C3051ha(strOptString, strOptString2, string2, map));
                }
            }
            if (arrayList.isEmpty()) {
                arrayList.add(new U8("", 0, "OMID_VIEWABILITY", map));
                return arrayList;
            }
        } catch (Exception e2) {
            InterfaceC3333z5 interfaceC3333z5 = this.f23890n;
            if (interfaceC3333z5 != null) {
                ((A5) interfaceC3333z5).b("p8", rf.a(e2, H6.a("p8", "TAG", "Failed to parse OMID tracker : ")));
            }
        }
        return arrayList;
    }

    public final String p(JSONObject jSONObject) {
        try {
            String string = jSONObject.getString("dataType");
            Intrinsics.c(string);
            return string;
        } catch (JSONException e2) {
            InterfaceC3333z5 interfaceC3333z5 = this.f23890n;
            if (interfaceC3333z5 == null) {
                return "";
            }
            ((A5) interfaceC3333z5).b("p8", E0.a(e2, H6.a("p8", "TAG", "Exception while getting webViewAssetValue - ")));
            return "";
        }
    }

    public final O8 q(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        long jOptLong = jSONObject.optLong("absolute");
        long jOptLong2 = jSONObject.optLong("percentage");
        String strOptString = jSONObject.optString("reference");
        Intrinsics.c(strOptString);
        return new O8(jOptLong, jOptLong2, strOptString, this);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3177p8(int i2, JSONObject pubContent, C3177p8 c3177p8, boolean z2, AdConfig adConfig, InterfaceC3333z5 interfaceC3333z5) {
        this(i2, pubContent, c3177p8, z2, adConfig, c3177p8.t, null, interfaceC3333z5);
        Intrinsics.f(pubContent, "pubContent");
        Intrinsics.f(adConfig, "adConfig");
    }

    public final C2984d8 a(C3177p8 c3177p8, C2984d8 c2984d8) {
        Object obj = c2984d8.f23516e;
        String str = obj instanceof String ? (String) obj : null;
        if (str != null && str.length() != 0) {
            String[] strArr = (String[]) new Regex("\\|").f(str, 0).toArray(new String[0]);
            C2984d8 c2984d8M = c3177p8.m(strArr[0]);
            if (c2984d8M == null) {
                C3177p8 c3177p9 = c3177p8.g;
                if (c3177p9 != null) {
                    return a(c3177p9, c2984d8);
                }
            } else if (!c2984d8M.equals(c2984d8)) {
                if (strArr.length == 1) {
                    c2984d8M.f23519l = (byte) 1;
                    return c2984d8M;
                }
                c2984d8M.f23519l = AbstractC3129m8.a(strArr[1]);
                InterfaceC3333z5 interfaceC3333z5 = this.f23890n;
                if (interfaceC3333z5 != null) {
                    ((A5) interfaceC3333z5).a("p8", android.support.v4.media.a.r(H6.a("p8", "TAG", "Referenced asset ( "), c2984d8M.f23514b, " )"));
                }
                return c2984d8M;
            }
        }
        return null;
    }

    public final JSONObject c(JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = jSONObject.isNull(com.ironsource.d9.h.d) ? new JSONObject() : jSONObject.getJSONObject(com.ironsource.d9.h.d);
            Intrinsics.c(jSONObject2);
            return jSONObject2;
        } catch (JSONException e2) {
            InterfaceC3333z5 interfaceC3333z5 = this.f23890n;
            if (interfaceC3333z5 != null) {
                ((A5) interfaceC3333z5).b("p8", E0.a(e2, H6.a("p8", "TAG", "Exception while getting assetDisplayOnProperties - ")));
            }
            return new JSONObject();
        }
    }

    public final String n(JSONObject jSONObject) {
        try {
            String string = jSONObject.getString("valueType");
            Intrinsics.c(string);
            return string;
        } catch (JSONException e2) {
            InterfaceC3333z5 interfaceC3333z5 = this.f23890n;
            if (interfaceC3333z5 == null) {
                return "";
            }
            ((A5) interfaceC3333z5).b("p8", E0.a(e2, H6.a("p8", "TAG", "Exception while getting assetValueType - ")));
            return "";
        }
    }

    public final JSONArray m(JSONObject jSONObject) {
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("assetValue");
            Intrinsics.e(jSONArray, "getJSONArray(...)");
            return jSONArray;
        } catch (JSONException e2) {
            InterfaceC3333z5 interfaceC3333z5 = this.f23890n;
            if (interfaceC3333z5 != null) {
                ((A5) interfaceC3333z5).b("p8", E0.a(e2, H6.a("p8", "TAG", "Exception while getting assetValue - ")));
            }
            return new JSONArray();
        }
    }

    public C3177p8(int i2, JSONObject jSONObject, C3177p8 c3177p8, boolean z2, AdConfig adConfig, Map map, Ue ue, InterfaceC3333z5 interfaceC3333z5) {
        byte bH;
        HashMap map2;
        C2984d8 c2984d8;
        C2984d8 c2984d9;
        Ve veD;
        int iA;
        HashMap map3;
        this.o = i2;
        this.g = c3177p8;
        this.m = adConfig;
        this.f23883a = jSONObject;
        this.f23884b = (byte) 0;
        this.f23885c = false;
        this.f23889l = ue;
        this.j = new HashMap();
        HashMap map4 = new HashMap();
        this.k = map4;
        this.f23888i = new HashMap();
        this.f23891p = new C3161o8();
        this.s = z2;
        this.t = map;
        this.f23890n = interfaceC3333z5;
        try {
            this.d = jSONObject.optJSONObject("styleRefs");
            if (jSONObject.isNull("orientation")) {
                bH = 0;
            } else {
                String string = jSONObject.getString("orientation");
                Intrinsics.e(string, "getString(...)");
                bH = h(string);
            }
            this.f23884b = bH;
            this.q = jSONObject.optBoolean("shouldAutoOpenLandingPage", true);
            this.f23885c = jSONObject.optBoolean("disableBackButton");
            JSONObject jSONObject2 = jSONObject.getJSONObject("rootContainer");
            Intrinsics.c(jSONObject2);
            C2984d8 c2984d8A = a(jSONObject2, "CONTAINER", "/rootContainer");
            this.f23886e = c2984d8A instanceof C3049h8 ? (C3049h8) c2984d8A : null;
            h();
            if (jSONObject.has("rewards")) {
                this.f23887h = new HashMap();
            }
            C3040h.Companion.getClass();
            if (jSONObject.has("rewards")) {
                map2 = new HashMap();
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("rewards");
                if (jSONObjectOptJSONObject != null) {
                    Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        String string2 = jSONObjectOptJSONObject.getString(next);
                        Intrinsics.c(next);
                        Intrinsics.c(string2);
                        map2.put(next, string2);
                    }
                }
            } else {
                map2 = null;
            }
            if (map2 != null && (map3 = this.f23887h) != null) {
                map3.putAll(map2);
            }
            a();
            b();
            for (Map.Entry entry : map4.entrySet()) {
                HashMap map5 = this.j;
                if (map5 != null && (c2984d8 = (C2984d8) map5.get(entry.getKey())) != null && 4 == c2984d8.m && (c2984d8.f23520n != -1 || c2984d8.o != -1)) {
                    HashMap map6 = this.j;
                    if (map6 != null && (c2984d9 = (C2984d8) map6.get(entry.getValue())) != null && "VIDEO".equals(c2984d9.f23515c)) {
                        C2968c9 c2968c9 = c2984d9 instanceof C2968c9 ? (C2968c9) c2984d9 : null;
                        if (c2968c9 != null && (veD = c2968c9.d()) != null) {
                            Ue ue2 = veD instanceof Ue ? (Ue) veD : null;
                            if (ue2 != null) {
                                try {
                                    iA = ue2.a();
                                } catch (ArrayIndexOutOfBoundsException unused) {
                                    InterfaceC3333z5 interfaceC3333z6 = this.f23890n;
                                    if (interfaceC3333z6 != null) {
                                        ((A5) interfaceC3333z6).b("p8", "ArrayIndexOutOfBoundsException in getting media duration");
                                    }
                                    iA = 0;
                                }
                                if (iA == 0) {
                                    c2984d8.f23520n = 0;
                                } else {
                                    c2984d8.f23520n = a(c2984d8.f23520n, iA);
                                    c2984d8.o = a(c2984d8.o, iA);
                                }
                                ((C2968c9) c2984d9).y.add(c2984d8);
                            }
                        }
                    }
                }
            }
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("pages");
            this.f = jSONArrayOptJSONArray == null ? new JSONArray() : jSONArrayOptJSONArray;
        } catch (JSONException e2) {
            InterfaceC3333z5 interfaceC3333z7 = this.f23890n;
            if (interfaceC3333z7 != null) {
                ((A5) interfaceC3333z7).b("p8", E0.a(e2, H6.a("p8", "TAG", "Exception while getting pagesArray - ")));
            }
        }
    }

    public final byte e(JSONObject jSONObject) {
        try {
            JSONObject jSONObjectC = c(jSONObject);
            if (jSONObjectC.isNull("type")) {
                return (byte) 2;
            }
            String string = jSONObjectC.getString("type");
            Intrinsics.e(string, "getString(...)");
            return f(string);
        } catch (JSONException e2) {
            InterfaceC3333z5 interfaceC3333z5 = this.f23890n;
            if (interfaceC3333z5 == null) {
                return (byte) 2;
            }
            ((A5) interfaceC3333z5).b("p8", E0.a(e2, H6.a("p8", "TAG", "Exception while getting assetDisplay - ")));
            return (byte) 2;
        }
    }

    public final String d(JSONObject jSONObject) {
        try {
            JSONObject jSONObjectC = c(jSONObject);
            String string = jSONObjectC.isNull("reference") ? "" : jSONObjectC.getString("reference");
            Intrinsics.c(string);
            return string;
        } catch (JSONException e2) {
            InterfaceC3333z5 interfaceC3333z5 = this.f23890n;
            if (interfaceC3333z5 != null) {
                ((A5) interfaceC3333z5).b("p8", E0.a(e2, H6.a("p8", "TAG", "Exception while getting assetDisplayOnReference - ")));
            }
            return "";
        }
    }

    public static String k(String str) {
        Locale US = Locale.US;
        Intrinsics.e(US, "US");
        String upperCase = str.toUpperCase(US);
        Intrinsics.e(upperCase, "this as java.lang.String).toUpperCase(locale)");
        int length = upperCase.length() - 1;
        int i2 = 0;
        boolean z2 = false;
        while (i2 <= length) {
            boolean z3 = Intrinsics.h(upperCase.charAt(!z2 ? i2 : length), 32) <= 0;
            if (z2) {
                if (!z3) {
                    break;
                }
                length--;
            } else if (z3) {
                i2++;
            } else {
                z2 = true;
            }
        }
        String strA = I7.a(length, 1, upperCase, i2);
        int iHashCode = strA.hashCode();
        if (iHashCode == -1430070305) {
            if (!strA.equals("HTML_SCRIPT")) {
                return "unknown";
            }
            return "html_script";
        }
        if (iHashCode == -158113182) {
            if (strA.equals("URL_PING")) {
                return "url_ping";
            }
            return "unknown";
        }
        if (iHashCode == 1110926088 && strA.equals("URL_WEBVIEW_PING")) {
            return "webview_ping";
        }
        return "unknown";
    }

    public static String c(String str) {
        Locale locale = Locale.US;
        String strP = com.applovin.impl.Z.p(locale, "US", str, locale, "this as java.lang.String).toLowerCase(locale)");
        int length = strP.length() - 1;
        int i2 = 0;
        boolean z2 = false;
        while (i2 <= length) {
            boolean z3 = Intrinsics.h(strP.charAt(!z2 ? i2 : length), 32) <= 0;
            if (z2) {
                if (!z3) {
                    break;
                }
                length--;
            } else if (z3) {
                i2++;
            } else {
                z2 = true;
            }
        }
        String strA = I7.a(length, 1, strP, i2);
        switch (strA.hashCode()) {
            case -938102371:
                if (!strA.equals("rating")) {
                    return "CONTAINER";
                }
                return "RATING";
            case -410956671:
                strA.equals("container");
                return "CONTAINER";
            case 98832:
                if (strA.equals("cta")) {
                    return "CTA";
                }
                return "CONTAINER";
            case 102340:
                if (strA.equals("gif")) {
                    return "GIF";
                }
                return "CONTAINER";
            case 3226745:
                if (strA.equals("icon")) {
                    return "ICON";
                }
                return "CONTAINER";
            case 3556653:
                if (strA.equals("text")) {
                    return AdPreferences.TYPE_TEXT;
                }
                return "CONTAINER";
            case 100313435:
                if (strA.equals(com.smartdigimkt.x.d.c.k)) {
                    return "IMAGE";
                }
                return "CONTAINER";
            case 110364485:
                if (strA.equals("timer")) {
                    return "TIMER";
                }
                return "CONTAINER";
            case 112202875:
                if (strA.equals("video")) {
                    return "VIDEO";
                }
                return "CONTAINER";
            case 1224424441:
                if (strA.equals(com.ironsource.d9.h.K)) {
                    return "WEBVIEW";
                }
                return "CONTAINER";
            default:
                return "CONTAINER";
        }
    }

    public static byte i(String str) {
        int length = str.length() - 1;
        int i2 = 0;
        boolean z2 = false;
        while (i2 <= length) {
            boolean z3 = Intrinsics.h(str.charAt(!z2 ? i2 : length), 32) <= 0;
            if (z2) {
                if (!z3) {
                    break;
                }
                length--;
            } else if (z3) {
                i2++;
            } else {
                z2 = true;
            }
        }
        String strA = I7.a(length, 1, str, i2);
        return (!Intrinsics.a(strA, "paged") && Intrinsics.a(strA, "free")) ? (byte) 1 : (byte) 0;
    }

    public static byte l(String str) {
        int length = str.length() - 1;
        int i2 = 0;
        boolean z2 = false;
        while (i2 <= length) {
            boolean z3 = Intrinsics.h(str.charAt(!z2 ? i2 : length), 32) <= 0;
            if (z2) {
                if (!z3) {
                    break;
                }
                length--;
            } else if (z3) {
                i2++;
            } else {
                z2 = true;
            }
        }
        String strA = I7.a(length, 1, str, i2);
        return (!Intrinsics.a(strA, "absolute") && Intrinsics.a(strA, "reference")) ? (byte) 1 : (byte) 0;
    }

    public final String f(JSONObject jSONObject) {
        try {
            String string = jSONObject.getString("assetId");
            Intrinsics.c(string);
            return string;
        } catch (JSONException e2) {
            InterfaceC3333z5 interfaceC3333z5 = this.f23890n;
            if (interfaceC3333z5 != null) {
                ((A5) interfaceC3333z5).b("p8", E0.a(e2, H6.a("p8", "TAG", "Exception while getting assetId - ")));
            }
            return String.valueOf(jSONObject.hashCode());
        }
    }

    public static String e(String str) {
        Locale locale = Locale.US;
        String strP = com.applovin.impl.Z.p(locale, "US", str, locale, "this as java.lang.String).toLowerCase(locale)");
        int length = strP.length() - 1;
        int i2 = 0;
        boolean z2 = false;
        while (i2 <= length) {
            boolean z3 = Intrinsics.h(strP.charAt(!z2 ? i2 : length), 32) <= 0;
            if (z2) {
                if (!z3) {
                    break;
                }
                length--;
            } else if (z3) {
                i2++;
            } else {
                z2 = true;
            }
        }
        String strA = I7.a(length, 1, strP, i2);
        if (Intrinsics.a(strA, "none") || !Intrinsics.a(strA, "line")) {
            return "none";
        }
        return "line";
    }

    /* JADX WARN: Code duplicated, block: B:56:0x00ff  */
    public final void b() {
        String str;
        ArrayList arrayList;
        for (C2984d8 c2984d8 : n("WEBVIEW")) {
            F9 f9 = c2984d8 instanceof F9 ? (F9) c2984d8 : null;
            if (f9 != null && !"URL".equals(f9.y) && !"HTML".equals(f9.y)) {
                C2984d8 c2984d8A = a(this, c2984d8);
                if (c2984d8A == null) {
                    InterfaceC3333z5 interfaceC3333z5 = this.f23890n;
                    if (interfaceC3333z5 != null) {
                        ((A5) interfaceC3333z5).b("p8", androidx.media3.extractor.text.ttml.a.p(H6.a("p8", "TAG", "Could not find referenced asset for asset ("), c2984d8.f23514b, ')'));
                    }
                } else if (Intrinsics.a(c2984d8A.f23515c, c2984d8.f23515c)) {
                    c2984d8.f23516e = c2984d8A.f23516e;
                } else if (Intrinsics.a(c2984d8A.f23515c, "VIDEO")) {
                    if (2 == c2984d8A.f23519l) {
                        C2968c9 c2968c9 = c2984d8A instanceof C2968c9 ? (C2968c9) c2984d8A : null;
                        if (c2968c9 != null) {
                            Ve veD = c2968c9.d();
                            Le leA = Je.a(c2968c9, c2984d8);
                            if (leA == null) {
                                str = null;
                            } else if ("REF_HTML".equals(f9.y)) {
                                ArrayList arrayListA = leA.a(2);
                                if (!arrayListA.isEmpty()) {
                                    str = ((Ke) arrayListA.get(0)).f22933b;
                                } else {
                                    ArrayList arrayListA2 = leA.a(3);
                                    if (arrayListA2.isEmpty()) {
                                        str = null;
                                    } else {
                                        str = ((Ke) arrayListA2.get(0)).f22933b;
                                        if (URLUtil.isValidUrl(str)) {
                                            f9.y = "REF_IFRAME";
                                        } else {
                                            str = null;
                                        }
                                    }
                                }
                            } else if ("REF_IFRAME".equals(f9.y)) {
                                ArrayList arrayListA3 = leA.a(3);
                                if (!arrayListA3.isEmpty()) {
                                    str = ((Ke) arrayListA3.get(0)).f22933b;
                                    if (!URLUtil.isValidUrl(str)) {
                                        str = null;
                                    }
                                } else {
                                    ArrayList arrayListA4 = leA.a(2);
                                    if (arrayListA4.isEmpty()) {
                                        str = null;
                                    } else {
                                        f9.y = "REF_HTML";
                                        str = ((Ke) arrayListA4.get(0)).f22933b;
                                    }
                                }
                            } else {
                                str = null;
                            }
                            boolean zEquals = "REF_IFRAME".equals(f9.y);
                            boolean zEquals2 = "REF_HTML".equals(f9.y);
                            if ((!zEquals || URLUtil.isValidUrl(str)) && leA != null && (!zEquals2 || str != null)) {
                                if (veD != null) {
                                    ((Ue) veD).j = leA;
                                }
                                InterfaceC3333z5 interfaceC3333z6 = this.f23890n;
                                if (interfaceC3333z6 != null) {
                                    ((A5) interfaceC3333z6).a("p8", I6.a("p8", "TAG", "Setting asset value: ", str));
                                }
                                c2984d8.f23516e = str;
                                ArrayList trackers = leA.a("creativeView");
                                Intrinsics.f(trackers, "trackers");
                                c2984d8.s.addAll(trackers);
                            } else {
                                if (((veD == null || (arrayList = ((Ue) veD).f23284i) == null) ? -1 : arrayList.size()) > 0) {
                                    c2968c9.v = 8;
                                    c2968c9.a("error", MapsKt.g(new Pair("[ERRORCODE]", "601")), (L7) null, this.f23890n);
                                    InterfaceC3333z5 interfaceC3333z7 = this.f23890n;
                                    if (interfaceC3333z7 != null) {
                                        ((A5) interfaceC3333z7).b("p8", "Unable to find the best-fit companion ad! Returning ...");
                                    }
                                }
                                f9.y = "UNKNOWN";
                            }
                        }
                    } else {
                        InterfaceC3333z5 interfaceC3333z8 = this.f23890n;
                        if (interfaceC3333z8 != null) {
                            ((A5) interfaceC3333z8).b("p8", "Unknown creative type reference for webView asset! Returning ...");
                        }
                    }
                }
            }
        }
    }

    public static String d(String str) {
        Locale locale = Locale.US;
        String strP = com.applovin.impl.Z.p(locale, "US", str, locale, "this as java.lang.String).toLowerCase(locale)");
        int length = strP.length() - 1;
        int i2 = 0;
        boolean z2 = false;
        while (i2 <= length) {
            boolean z3 = Intrinsics.h(strP.charAt(!z2 ? i2 : length), 32) <= 0;
            if (z2) {
                if (!z3) {
                    break;
                }
                length--;
            } else if (z3) {
                i2++;
            } else {
                z2 = true;
            }
        }
        String strA = I7.a(length, 1, strP, i2);
        if (Intrinsics.a(strA, "straight") || !Intrinsics.a(strA, "curved")) {
            return "straight";
        }
        return "curved";
    }

    public static byte f(String str) {
        int length = str.length() - 1;
        int i2 = 0;
        boolean z2 = false;
        while (i2 <= length) {
            boolean z3 = Intrinsics.h(str.charAt(!z2 ? i2 : length), 32) <= 0;
            if (z2) {
                if (!z3) {
                    break;
                }
                length--;
            } else if (z3) {
                i2++;
            } else {
                z2 = true;
            }
        }
        String strA = I7.a(length, 1, str, i2);
        Locale locale = Locale.US;
        String strP = com.applovin.impl.Z.p(locale, "US", strA, locale, "this as java.lang.String).toLowerCase(locale)");
        int iHashCode = strP.hashCode();
        if (iHashCode != -921832806) {
            if (iHashCode == -284840886) {
                strP.equals("unknown");
            } else if (iHashCode == 1728122231 && strP.equals("absolute")) {
                return (byte) 3;
            }
        } else if (strP.equals("percentage")) {
            return (byte) 4;
        }
        return (byte) 1;
    }

    public final String g(JSONObject jSONObject) {
        try {
            String string = jSONObject.getString("assetName");
            Intrinsics.c(string);
            return string;
        } catch (JSONException e2) {
            InterfaceC3333z5 interfaceC3333z5 = this.f23890n;
            if (interfaceC3333z5 != null) {
                ((A5) interfaceC3333z5).b("p8", E0.a(e2, H6.a("p8", "TAG", "Exception while getting assetName - ")));
                return "";
            }
            return "";
        }
    }

    public final void a() {
        Ke ke;
        ArrayList arrayList;
        for (C2984d8 c2984d8 : n("IMAGE")) {
            Object obj = c2984d8.f23516e;
            if (!URLUtil.isValidUrl(obj instanceof String ? (String) obj : null)) {
                C2984d8 c2984d8A = a(this, c2984d8);
                if (c2984d8A == null) {
                    InterfaceC3333z5 interfaceC3333z5 = this.f23890n;
                    if (interfaceC3333z5 != null) {
                        ((A5) interfaceC3333z5).b("p8", androidx.media3.extractor.text.ttml.a.p(H6.a("p8", "TAG", "Could not find referenced asset for asset ("), c2984d8.f23514b, ')'));
                    }
                } else if (Intrinsics.a(c2984d8A.f23515c, c2984d8.f23515c)) {
                    c2984d8.f23516e = c2984d8A.f23516e;
                } else if (Intrinsics.a(c2984d8A.f23515c, "VIDEO") && c2984d8A.f23519l == 1) {
                    InterfaceC3333z5 interfaceC3333z6 = this.f23890n;
                    if (interfaceC3333z6 != null) {
                        ((A5) interfaceC3333z6).b("p8", "Image asset cannot reference a linear creative in a video element!");
                    }
                } else if (Intrinsics.a(c2984d8A.f23515c, "VIDEO") && c2984d8A.f23519l == 2) {
                    C2968c9 c2968c9 = c2984d8A instanceof C2968c9 ? (C2968c9) c2984d8A : null;
                    if (c2968c9 != null) {
                        Ve veD = c2968c9.d();
                        Le leA = Je.a(c2968c9, c2984d8);
                        ArrayList arrayListA = leA != null ? leA.a(1) : null;
                        if (arrayListA == null) {
                            ke = null;
                            break;
                        }
                        Iterator it = arrayListA.iterator();
                        do {
                            if (!it.hasNext()) {
                                ke = null;
                                break;
                            }
                            ke = (Ke) it.next();
                        } while (!URLUtil.isValidUrl(ke.f22933b));
                        if (leA != null && ke != null) {
                            if (veD != null) {
                                ((Ue) veD).j = leA;
                            }
                            InterfaceC3333z5 interfaceC3333z7 = this.f23890n;
                            if (interfaceC3333z7 != null) {
                                StringBuilder sbA = H6.a("p8", "TAG", "Setting image asset value: ");
                                sbA.append(ke.f22933b);
                                ((A5) interfaceC3333z7).a("p8", sbA.toString());
                            }
                            c2984d8.f23516e = ke.f22933b;
                            ArrayList trackers = leA.a("creativeView");
                            Intrinsics.f(trackers, "trackers");
                            c2984d8.s.addAll(trackers);
                            ArrayList<U8> trackers2 = c2968c9.s;
                            Intrinsics.f(trackers2, "trackers");
                            for (U8 u8 : trackers2) {
                                if ("error".equals(u8.f23265b)) {
                                    c2984d8.s.add(u8);
                                }
                            }
                        } else if (((veD == null || (arrayList = ((Ue) veD).f23284i) == null) ? -1 : arrayList.size()) > 0) {
                            c2968c9.v = 8;
                            c2968c9.a("error", MapsKt.g(new Pair("[ERRORCODE]", "601")), (L7) null, this.f23890n);
                            InterfaceC3333z5 interfaceC3333z8 = this.f23890n;
                            if (interfaceC3333z8 != null) {
                                ((A5) interfaceC3333z8).b("p8", "Unable to find the best-fit companion ad! Returning ...");
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:36:0x0070 A[RETURN] */
    public static String j(String str) {
        Locale locale = Locale.US;
        String strP = com.applovin.impl.Z.p(locale, "US", str, locale, "this as java.lang.String).toLowerCase(locale)");
        int length = strP.length() - 1;
        int i2 = 0;
        boolean z2 = false;
        while (i2 <= length) {
            boolean z3 = Intrinsics.h(strP.charAt(!z2 ? i2 : length), 32) <= 0;
            if (z2) {
                if (!z3) {
                    break;
                }
                length--;
            } else if (z3) {
                i2++;
            } else {
                z2 = true;
            }
        }
        String strA = I7.a(length, 1, strP, i2);
        switch (strA.hashCode()) {
            case -1178781136:
                if (strA.equals(TtmlNode.ITALIC)) {
                    return TtmlNode.ITALIC;
                }
                return "none";
            case -1026963764:
                if (strA.equals(TtmlNode.UNDERLINE)) {
                    return TtmlNode.UNDERLINE;
                }
                return "none";
            case -891985998:
                if (strA.equals("strike")) {
                    return "strike";
                }
                return "none";
            case 3029637:
                if (strA.equals(TtmlNode.BOLD)) {
                    return TtmlNode.BOLD;
                }
                return "none";
            case 3387192:
                strA.equals("none");
                return "none";
            default:
                return "none";
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0124 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:77:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:79:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:86:0x0101  */
    /* JADX WARN: Code duplicated, block: B:89:0x010a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:91:0x010d  */
    /* JADX WARN: Code duplicated, block: B:94:0x0116 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:96:0x0119  */
    /* JADX WARN: Code duplicated, block: B:98:0x0121 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static String g(String str) {
        String strA;
        int iHashCode;
        Locale US = Locale.US;
        Intrinsics.e(US, "US");
        String upperCase = str.toUpperCase(US);
        Intrinsics.e(upperCase, "this as java.lang.String).toUpperCase(locale)");
        int length = upperCase.length() - 1;
        int i2 = 0;
        boolean z2 = false;
        while (i2 <= length) {
            boolean z3 = Intrinsics.h(upperCase.charAt(!z2 ? i2 : length), 32) <= 0;
            if (z2) {
                if (!z3) {
                    break;
                }
                length--;
            } else if (z3) {
                i2++;
            } else {
                z2 = true;
            }
        }
        String strA2 = I7.a(length, 1, upperCase, i2);
        switch (strA2.hashCode()) {
            case -1881262698:
                if (strA2.equals("RENDER")) {
                    return "Impression";
                }
                break;
            case -825499301:
                if (strA2.equals("FALLBACK_URL_CLICK")) {
                    return "TRACKER_EVENT_TYPE_FALLBACK_URL";
                }
                break;
            case 2342118:
                if (strA2.equals("LOAD")) {
                    return "load";
                }
                break;
            case 2634405:
                if (strA2.equals("VIEW")) {
                    return "page_view";
                }
                break;
            case 64212328:
                if (strA2.equals("CLICK")) {
                    return "click";
                }
                break;
            case 368426751:
                if (strA2.equals("OMID_VIEWABILITY")) {
                    return "OMID_VIEWABILITY";
                }
                break;
            case 1963885793:
                if (strA2.equals("VIDEO_VIEWABILITY")) {
                    return "VideoImpression";
                }
                break;
            case 2008409463:
                if (strA2.equals("CLIENT_FILL")) {
                    return "client_fill";
                }
                break;
        }
        Locale US2 = Locale.US;
        Intrinsics.e(US2, "US");
        String upperCase2 = str.toUpperCase(US2);
        Intrinsics.e(upperCase2, "this as java.lang.String).toUpperCase(locale)");
        int length2 = upperCase2.length() - 1;
        int i3 = 0;
        boolean z4 = false;
        while (i3 <= length2) {
            boolean z5 = Intrinsics.h(upperCase2.charAt(!z4 ? i3 : length2), 32) <= 0;
            if (z4) {
                if (!z5) {
                    strA = I7.a(length2, 1, upperCase2, i3);
                    iHashCode = strA.hashCode();
                    if (iHashCode != -1836567951) {
                        if (!strA.equals("DOWNLOADER_DOWNLOADED")) {
                            return "unknown";
                        }
                        return "TRACKER_EVENT_TYPE_DOWNLOADER_DOWNLOADED";
                    }
                    if (iHashCode != -1099027408) {
                        if (!strA.equals("DOWNLOADER_DOWNLOADING")) {
                            return "TRACKER_EVENT_TYPE_DOWNLOADER_DOWNLOADING";
                        }
                        return "unknown";
                    }
                    if (iHashCode != 1331888222) {
                        return (iHashCode != 1346121898 && strA.equals("DOWNLOADER_INITIALIZED")) ? "TRACKER_EVENT_TYPE_FALLBACK_URL" : "unknown";
                    }
                    if (!strA.equals("DOWNLOADER_ERROR")) {
                        return "TRACKER_EVENT_TYPE_DOWNLOADER_ERROR";
                    }
                    return "unknown";
                }
                length2--;
            } else if (z5) {
                i3++;
            } else {
                z4 = true;
            }
        }
        strA = I7.a(length2, 1, upperCase2, i3);
        iHashCode = strA.hashCode();
        if (iHashCode != -1836567951) {
            if (!strA.equals("DOWNLOADER_DOWNLOADED")) {
                return "unknown";
            }
            return "TRACKER_EVENT_TYPE_DOWNLOADER_DOWNLOADED";
        }
        if (iHashCode != -1099027408) {
            if (!strA.equals("DOWNLOADER_DOWNLOADING")) {
                return "TRACKER_EVENT_TYPE_DOWNLOADER_DOWNLOADING";
            }
            return "unknown";
        }
        if (iHashCode != 1331888222) {
            if (iHashCode != 1346121898) {
                return "unknown";
            }
        }
        if (!strA.equals("DOWNLOADER_ERROR")) {
            return "TRACKER_EVENT_TYPE_DOWNLOADER_ERROR";
        }
        return "unknown";
    }

    /* JADX WARN: Code duplicated, block: B:136:0x0220  */
    /* JADX WARN: Instruction removed from duplicated block: B:136:0x0220, please report this as an issue */
    public final M8 c(Point point, Point point2, Point point3, Point point4, JSONObject jSONObject) throws JSONException {
        JSONObject jSONObjectOptJSONObject;
        String str;
        String str2;
        String strA;
        String str3;
        String str4;
        String str5;
        int i2;
        String strA2;
        int i3;
        int length;
        byte b2;
        byte b3;
        String strD = "straight";
        String strA3 = "#ff000000";
        if (jSONObject.isNull("border") || (jSONObjectOptJSONObject = jSONObject.optJSONObject("border")) == null || jSONObjectOptJSONObject.isNull("style")) {
            str5 = "straight";
            str3 = "#ff000000";
            str4 = "none";
        } else {
            String string = jSONObjectOptJSONObject.getString("style");
            Intrinsics.e(string, "getString(...)");
            String strE = e(string);
            if (!jSONObjectOptJSONObject.isNull("corner")) {
                String string2 = jSONObjectOptJSONObject.getString("corner");
                Intrinsics.e(string2, "getString(...)");
                strD = d(string2);
            }
            if (jSONObjectOptJSONObject.isNull("color")) {
                str = strE;
                str2 = strD;
                strA = "#ff000000";
            } else {
                String string3 = jSONObjectOptJSONObject.getString("color");
                Intrinsics.e(string3, "getString(...)");
                int length2 = string3.length() - 1;
                int i4 = 0;
                boolean z2 = false;
                while (true) {
                    str = strE;
                    if (i4 > length2) {
                        str2 = strD;
                        break;
                    }
                    str2 = strD;
                    boolean z3 = Intrinsics.h(string3.charAt(!z2 ? i4 : length2), 32) <= 0;
                    if (z2) {
                        if (!z3) {
                            break;
                        }
                        length2--;
                    } else if (z3) {
                        i4++;
                    } else {
                        z2 = true;
                    }
                    strE = str;
                    strD = str2;
                }
                strA = I7.a(length2, 1, string3, i4);
            }
            str3 = strA;
            str4 = str;
            str5 = str2;
        }
        if (jSONObject.isNull(TtmlNode.ATTR_TTS_BACKGROUND_COLOR)) {
            strA2 = "#00000000";
        } else {
            String string4 = jSONObject.getString(TtmlNode.ATTR_TTS_BACKGROUND_COLOR);
            Intrinsics.e(string4, "getString(...)");
            int length3 = string4.length() - 1;
            boolean z4 = false;
            int i5 = 0;
            while (true) {
                if (i5 > length3) {
                    i2 = 1;
                    break;
                }
                boolean z5 = z4;
                boolean z6 = Intrinsics.h(string4.charAt(!z4 ? i5 : length3), 32) <= 0;
                if (z5) {
                    i2 = 1;
                    if (!z6) {
                        break;
                    }
                    length3--;
                } else if (z6) {
                    i5++;
                } else {
                    z4 = true;
                }
                z4 = z5;
            }
            strA2 = I7.a(length3, i2, string4, i5);
        }
        String str6 = strA2;
        JSONObject jSONObject2 = jSONObject.getJSONObject("text");
        try {
            String string5 = jSONObject2.getString("size");
            Intrinsics.e(string5, "getString(...)");
            int i6 = (int) Double.parseDouble(string5);
            if (!jSONObject2.isNull("length")) {
                String string6 = jSONObject2.getString("length");
                Intrinsics.e(string6, "getString(...)");
                Integer.parseInt(string6);
            }
            if (jSONObject2.isNull("color")) {
                i6 = i6;
            } else {
                String string7 = jSONObject2.getString("color");
                Intrinsics.e(string7, "getString(...)");
                int length4 = string7.length() - 1;
                boolean z7 = false;
                int i7 = 0;
                while (true) {
                    if (i7 > length4) {
                        i6 = i6;
                        i3 = 1;
                        break;
                    }
                    i6 = i6;
                    boolean z8 = Intrinsics.h(string7.charAt(!z7 ? i7 : length4), 32) <= 0;
                    if (z7) {
                        i3 = 1;
                        if (!z8) {
                            break;
                        }
                        length4--;
                    } else if (z8) {
                        i7++;
                    } else {
                        z7 = true;
                    }
                }
                strA3 = I7.a(length4, i3, string7, i7);
            }
            String str7 = strA3;
            ArrayList arrayList = new ArrayList();
            if (jSONObject2.isNull("style") || (length = jSONObject2.getJSONArray("style").length()) == 0) {
                arrayList.add("none");
            } else {
                for (int i8 = 0; i8 < length; i8++) {
                    String string8 = jSONObject2.getJSONArray("style").getString(i8);
                    Intrinsics.e(string8, "getString(...)");
                    arrayList.add(j(string8));
                }
            }
            if (!jSONObject2.isNull("align")) {
                String string9 = jSONObject2.getString("align");
                Intrinsics.e(string9, "getString(...)");
                int length5 = string9.length() - 1;
                boolean z9 = false;
                int i9 = 0;
                while (true) {
                    if (i9 > length5) {
                        b3 = 1;
                        break;
                    }
                    boolean z10 = Intrinsics.h(string9.charAt(!z9 ? i9 : length5), 32) <= 0;
                    if (z9) {
                        b3 = 1;
                        if (!z10) {
                            break;
                        }
                        length5--;
                    } else if (z10) {
                        i9++;
                    } else {
                        z9 = true;
                    }
                }
                String strA4 = I7.a(length5, b3, string9, i9);
                int iHashCode = strA4.hashCode();
                if (iHashCode != -1364013605) {
                    if (iHashCode != 3317767) {
                        b2 = (iHashCode == 108511772 && strA4.equals(TtmlNode.RIGHT)) ? b3 : (byte) 0;
                    } else {
                        strA4.equals(TtmlNode.LEFT);
                    }
                } else if (strA4.equals("centre")) {
                    b3 = 2;
                }
            }
            return new M8(point.x, point.y, point2.x, point2.y, point3.x, point3.y, point4.x, point4.y, str4, str5, str3, str6, i6, b2, str7, arrayList, new P8(q(jSONObject.optJSONObject("startOffset")), q(jSONObject.optJSONObject("timerDuration"))));
        } catch (NumberFormatException e2) {
            InterfaceC3333z5 interfaceC3333z5 = this.f23890n;
            if (interfaceC3333z5 != null) {
                ((A5) interfaceC3333z5).b("p8", "Failure in building text asset! Text size should be an integer");
            }
            JSONException jSONException = new JSONException(e2.getMessage());
            S5 s5 = S5.f23167a;
            S5.d.a(new C3011f2(e2));
            throw jSONException;
        }
    }

    public final Point h(JSONObject jSONObject) {
        Point point = new Point();
        try {
            JSONObject jSONObjectI = i(jSONObject);
            if (!jSONObjectI.isNull("geometry")) {
                JSONArray jSONArray = jSONObjectI.getJSONArray("geometry");
                point.x = a(jSONArray.getInt(0));
                point.y = a(jSONArray.getInt(1));
                return point;
            }
        } catch (JSONException e2) {
            InterfaceC3333z5 interfaceC3333z5 = this.f23890n;
            if (interfaceC3333z5 != null) {
                ((A5) interfaceC3333z5).b("p8", E0.a(e2, H6.a("p8", "TAG", "Exception while getting assetPosition - ")));
            }
        }
        return point;
    }

    public static byte h(String str) {
        Locale locale = Locale.US;
        String strP = com.applovin.impl.Z.p(locale, "US", str, locale, "this as java.lang.String).toLowerCase(locale)");
        int length = strP.length() - 1;
        int i2 = 0;
        boolean z2 = false;
        while (i2 <= length) {
            boolean z3 = Intrinsics.h(strP.charAt(!z2 ? i2 : length), 32) <= 0;
            if (z2) {
                if (!z3) {
                    break;
                }
                length--;
            } else if (z3) {
                i2++;
            } else {
                z2 = true;
            }
        }
        String strA = I7.a(length, 1, strP, i2);
        int iHashCode = strA.hashCode();
        if (iHashCode == -1626174665) {
            strA.equals("unspecified");
        } else if (iHashCode != 729267099) {
            if (iHashCode == 1430647483 && strA.equals(com.ironsource.d9.h.C)) {
                return (byte) 2;
            }
        } else if (strA.equals(com.ironsource.d9.h.D)) {
            return (byte) 1;
        }
        return (byte) 0;
    }

    public static int a(int i2, int i3) {
        if (i2 == -1 || i2 == 0) {
            return i2;
        }
        if (i2 == 25) {
            return i3 / 4;
        }
        if (i2 == 50) {
            return i3 / 2;
        }
        if (i2 != 75) {
            return i2 != 100 ? i3 / 4 : i3;
        }
        return (i3 * 3) / 4;
    }

    /* JADX WARN: Code duplicated, block: B:141:0x033e A[Catch: JSONException -> 0x0352, LOOP:0: B:139:0x0338->B:141:0x033e, LOOP_END, TRY_LEAVE, TryCatch #28 {JSONException -> 0x0352, blocks: (B:138:0x032b, B:139:0x0338, B:141:0x033e, B:147:0x035c, B:149:0x0362), top: B:458:0x032b }] */
    /* JADX WARN: Code duplicated, block: B:151:0x0370  */
    /* JADX WARN: Code duplicated, block: B:156:0x0382  */
    /* JADX WARN: Code duplicated, block: B:159:0x038e  */
    /* JADX WARN: Code duplicated, block: B:160:0x038f A[Catch: JSONException -> 0x0397, TryCatch #32 {JSONException -> 0x0397, blocks: (B:154:0x037d, B:157:0x0384, B:162:0x0393, B:160:0x038f), top: B:466:0x037d }] */
    /* JADX WARN: Code duplicated, block: B:162:0x0393 A[Catch: JSONException -> 0x0397, TRY_LEAVE, TryCatch #32 {JSONException -> 0x0397, blocks: (B:154:0x037d, B:157:0x0384, B:162:0x0393, B:160:0x038f), top: B:466:0x037d }] */
    /* JADX WARN: Code duplicated, block: B:230:0x051d A[Catch: JSONException -> 0x052d, TryCatch #17 {JSONException -> 0x052d, blocks: (B:228:0x0513, B:230:0x051d, B:234:0x0536, B:237:0x054d, B:240:0x055a, B:242:0x0560), top: B:438:0x0513 }] */
    /* JADX WARN: Code duplicated, block: B:235:0x0548  */
    /* JADX WARN: Code duplicated, block: B:239:0x0553  */
    /* JADX WARN: Code duplicated, block: B:251:0x0593 A[Catch: JSONException -> 0x0573, TRY_ENTER, TRY_LEAVE, TryCatch #7 {JSONException -> 0x0573, blocks: (B:244:0x056f, B:247:0x0575, B:251:0x0593), top: B:418:0x054b }] */
    /* JADX WARN: Code duplicated, block: B:257:0x05b5 A[Catch: JSONException -> 0x05bb, TryCatch #5 {JSONException -> 0x05bb, blocks: (B:255:0x05ac, B:257:0x05b5, B:261:0x05c0, B:263:0x05c7), top: B:414:0x05ac }] */
    /* JADX WARN: Code duplicated, block: B:260:0x05bf  */
    /* JADX WARN: Code duplicated, block: B:263:0x05c7 A[Catch: JSONException -> 0x05bb, TRY_LEAVE, TryCatch #5 {JSONException -> 0x05bb, blocks: (B:255:0x05ac, B:257:0x05b5, B:261:0x05c0, B:263:0x05c7), top: B:414:0x05ac }] */
    /* JADX WARN: Code duplicated, block: B:29:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:314:0x06bc A[Catch: JSONException -> 0x06cb, TRY_LEAVE, TryCatch #35 {JSONException -> 0x06cb, blocks: (B:312:0x06b8, B:314:0x06bc), top: B:472:0x06b8 }] */
    /* JADX WARN: Code duplicated, block: B:322:0x06cf  */
    /* JADX WARN: Code duplicated, block: B:36:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:376:0x0809  */
    /* JADX WARN: Code duplicated, block: B:378:0x081e  */
    /* JADX WARN: Code duplicated, block: B:380:0x0836  */
    /* JADX WARN: Code duplicated, block: B:385:0x0845  */
    /* JADX WARN: Code duplicated, block: B:394:0x085a  */
    /* JADX WARN: Code duplicated, block: B:401:0x0871  */
    /* JADX WARN: Code duplicated, block: B:403:0x0875  */
    /* JADX WARN: Code duplicated, block: B:438:0x0513 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:458:0x032b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:476:0x059f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v12, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v40 */
    /* JADX WARN: Type inference failed for: r11v41 */
    /* JADX WARN: Type inference failed for: r11v42 */
    /* JADX WARN: Type inference failed for: r11v43 */
    /* JADX WARN: Type inference failed for: r11v46 */
    /* JADX WARN: Type inference failed for: r11v47 */
    /* JADX WARN: Type inference failed for: r11v48 */
    /* JADX WARN: Type inference failed for: r11v49 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v50 */
    /* JADX WARN: Type inference failed for: r11v51 */
    /* JADX WARN: Type inference failed for: r11v52 */
    /* JADX WARN: Type inference failed for: r11v53 */
    /* JADX WARN: Type inference failed for: r11v54 */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v2, types: [com.inmobi.media.p8] */
    /* JADX WARN: Type inference failed for: r12v26 */
    /* JADX WARN: Type inference failed for: r12v27 */
    /* JADX WARN: Type inference failed for: r12v28 */
    /* JADX WARN: Type inference failed for: r12v29 */
    /* JADX WARN: Type inference failed for: r12v3, types: [com.inmobi.media.p8] */
    /* JADX WARN: Type inference failed for: r12v30 */
    /* JADX WARN: Type inference failed for: r12v31 */
    /* JADX WARN: Type inference failed for: r12v32 */
    /* JADX WARN: Type inference failed for: r12v33 */
    /* JADX WARN: Type inference failed for: r12v34, types: [com.inmobi.media.p8] */
    /* JADX WARN: Type inference failed for: r12v35 */
    /* JADX WARN: Type inference failed for: r12v36 */
    /* JADX WARN: Type inference failed for: r12v37 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v50 */
    /* JADX WARN: Type inference failed for: r12v53 */
    /* JADX WARN: Type inference failed for: r12v55 */
    /* JADX WARN: Type inference failed for: r12v56 */
    /* JADX WARN: Type inference failed for: r12v57 */
    /* JADX WARN: Type inference failed for: r12v58 */
    /* JADX WARN: Type inference failed for: r12v59 */
    /* JADX WARN: Type inference failed for: r12v60 */
    /* JADX WARN: Type inference failed for: r12v61 */
    /* JADX WARN: Type inference failed for: r12v62 */
    /* JADX WARN: Type inference failed for: r12v63 */
    /* JADX WARN: Type inference failed for: r12v64 */
    /* JADX WARN: Type inference failed for: r12v65 */
    /* JADX WARN: Type inference failed for: r12v66 */
    /* JADX WARN: Type inference failed for: r12v67 */
    /* JADX WARN: Type inference failed for: r12v68 */
    /* JADX WARN: Type inference failed for: r12v69 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v70 */
    /* JADX WARN: Type inference failed for: r12v71 */
    /* JADX WARN: Type inference failed for: r12v72 */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v36 */
    /* JADX WARN: Type inference failed for: r13v37 */
    /* JADX WARN: Type inference failed for: r13v38 */
    /* JADX WARN: Type inference failed for: r13v39 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v40 */
    /* JADX WARN: Type inference failed for: r1v101 */
    /* JADX WARN: Type inference failed for: r1v104 */
    /* JADX WARN: Type inference failed for: r1v116 */
    /* JADX WARN: Type inference failed for: r1v117 */
    /* JADX WARN: Type inference failed for: r1v118 */
    /* JADX WARN: Type inference failed for: r1v119 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v120 */
    /* JADX WARN: Type inference failed for: r1v121 */
    /* JADX WARN: Type inference failed for: r1v122 */
    /* JADX WARN: Type inference failed for: r1v123 */
    /* JADX WARN: Type inference failed for: r1v124 */
    /* JADX WARN: Type inference failed for: r1v125 */
    /* JADX WARN: Type inference failed for: r1v135 */
    /* JADX WARN: Type inference failed for: r1v136 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v54 */
    /* JADX WARN: Type inference failed for: r1v64 */
    /* JADX WARN: Type inference failed for: r1v69 */
    /* JADX WARN: Type inference failed for: r1v95 */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r2v4, types: [com.inmobi.media.A5] */
    /* JADX WARN: Type inference failed for: r30v1 */
    /* JADX WARN: Type inference failed for: r30v19 */
    /* JADX WARN: Type inference failed for: r30v20 */
    /* JADX WARN: Type inference failed for: r30v21 */
    /* JADX WARN: Type inference failed for: r30v22 */
    /* JADX WARN: Type inference failed for: r30v23 */
    /* JADX WARN: Type inference failed for: r30v4 */
    /* JADX WARN: Type inference failed for: r30v6, types: [int] */
    /* JADX WARN: Type inference failed for: r30v7 */
    /* JADX WARN: Type inference failed for: r30v8 */
    /* JADX WARN: Type inference failed for: r44v1, types: [com.inmobi.media.p8] */
    public final C2984d8 a(JSONObject jSONObject, String str, String str2) {
        Point point;
        Object obj;
        C2984d8 c2984d8M;
        String str3;
        ?? r12;
        String str4;
        String str5;
        int i2;
        ?? r1;
        int i3;
        ?? r13;
        InterfaceC3333z5 interfaceC3333z5;
        ?? r14;
        ?? r2;
        C2984d8 c3224s8;
        HashMap map;
        HashMap map2;
        ArrayList arrayList;
        ?? r3;
        HashMap map3;
        HashMap map4;
        C3177p8 c3177p8;
        ?? r4;
        C3177p8 c3177p9;
        ?? r15;
        C3177p8 c3177p10;
        ArrayList arrayList2;
        ArrayList arrayList3;
        String str6;
        ?? r16;
        ?? r5;
        String str7;
        C3177p8 c3177p11;
        String str8;
        int i4;
        C3177p8 c3177p12;
        Object obj2;
        String str9;
        C3177p8 c3177p13;
        String str10;
        C3177p8 c3177p14;
        String str11;
        String str12;
        Object obj3;
        byte bI;
        C3049h8 c3049h8;
        JSONObject jSONObject2;
        String str13;
        C3113l8 c3113l8;
        C3177p8 c3177p15;
        C3177p8 c3177p16;
        C3177p8 c3177p17;
        String str14;
        C3177p8 c3177p18;
        C2984d8 c3240t8;
        String str15;
        String str16;
        C3001e8 c3001e8A;
        String str17;
        String str18;
        String str19;
        Object obj4;
        String str20;
        JSONObject jSONObject3;
        JSONObject jSONObjectOptJSONObject;
        boolean zOptBoolean;
        String str21;
        String str22;
        C3177p8 c3177p19;
        int i5;
        C3177p8 c3177p20;
        String str23;
        ?? r11;
        ?? r30;
        Object obj5;
        String str24;
        ?? r31;
        String str25;
        ArrayList arrayList4;
        boolean zOptBoolean2;
        boolean zOptBoolean3;
        boolean zOptBoolean4;
        boolean zOptBoolean5;
        int iB;
        double dOptDouble;
        boolean z2;
        int i6;
        int i7;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        Object obj6;
        HashMap map5;
        JSONObject jSONObject4;
        Iterator<String> itKeys;
        C2968c9 c2968c9;
        AdConfig adConfig;
        boolean enablePubMuteControl;
        int i8;
        AdConfig.RenderingConfig rendering;
        Object obj7;
        InterfaceC3333z5 interfaceC3333z6;
        ?? r17;
        ?? r18;
        C3177p8 c3177p21;
        String str26;
        InterfaceC3333z5 interfaceC3333z7;
        C3177p8 c3177p22;
        String str27;
        InterfaceC3333z5 interfaceC3333z8;
        String strF = f(jSONObject);
        String strG = g(jSONObject);
        JSONObject jSONObjectI = i(jSONObject);
        String str28 = "p8";
        C2984d8 c2984d8 = null;
        if (!a(str, jSONObjectI)) {
            InterfaceC3333z5 interfaceC3333z9 = this.f23890n;
            if (interfaceC3333z9 != null) {
                ((A5) interfaceC3333z9).b("p8", I6.a("p8", "TAG", "Invalid asset style for asset: ", strG));
            }
            InterfaceC3333z5 interfaceC3333z10 = this.f23890n;
            if (interfaceC3333z10 != null) {
                ((A5) interfaceC3333z10).b("p8", "Asset style JSON: " + jSONObjectI);
            }
            return null;
        }
        Point pointH = h(jSONObject);
        Point pointB = b(jSONObject, pointH);
        Point pointB2 = b(jSONObject);
        Object obj8 = "VIDEO";
        Point pointA = a(jSONObject, pointB2);
        ArrayList arrayListJ = j(jSONObject);
        byte bE = e(jSONObject);
        int iA = a(jSONObject, true);
        int iA2 = a(jSONObject, false);
        String strD = d(jSONObject);
        byte bL = l(n(jSONObject));
        JSONArray jSONArrayM = m(jSONObject);
        if (jSONArrayM.length() != 0) {
            point = pointB2;
            try {
                String string = jSONArrayM.getString(0);
                try {
                    if (TextUtils.isEmpty(string)) {
                        return null;
                    }
                    if (bL != 1) {
                        c2984d8M = null;
                    } else {
                        c2984d8M = m(string);
                        if (c2984d8M == null) {
                            try {
                                C3177p8 c3177p23 = this.g;
                                if (c3177p23 != null) {
                                    c2984d8M = c3177p23.m(string);
                                } else {
                                    c2984d8M = null;
                                }
                            } catch (JSONException e2) {
                                e = e2;
                                str27 = string;
                                interfaceC3333z8 = this.f23890n;
                                if (interfaceC3333z8 != null) {
                                    ((A5) interfaceC3333z8).b("p8", E0.a(e, H6.a("p8", "TAG", "Exception while buildingAsset - ")));
                                }
                                obj = obj8;
                                str3 = str27;
                            }
                        }
                    }
                    str3 = string;
                    obj = obj8;
                } catch (JSONException e3) {
                    e = e3;
                    str27 = string;
                    c2984d8M = null;
                }
            } catch (JSONException e4) {
                e = e4;
                c2984d8M = null;
                str27 = null;
            }
            interfaceC3333z8 = this.f23890n;
            if (interfaceC3333z8 != null) {
                ((A5) interfaceC3333z8).b("p8", E0.a(e, H6.a("p8", "TAG", "Exception while buildingAsset - ")));
            }
            obj = obj8;
            str3 = str27;
        } else {
            point = pointB2;
            obj = obj8;
            c2984d8M = null;
            str3 = null;
        }
        try {
            str5 = "TAG";
            String strB = "EXTERNAL";
            ?? r19 = "IMAGE";
            str4 = strD;
            this = "openMode";
            try {
                try {
                    switch (str.hashCode()) {
                        case -1919329183:
                            C3177p8 c3177p24 = this;
                            String str29 = strF;
                            i3 = iA;
                            Point point2 = point;
                            str5 = str5;
                            i2 = iA2;
                            String str30 = "p8";
                            c3177p16 = c3177p24;
                            r11 = str29;
                            str13 = str30;
                            if (!str.equals("CONTAINER")) {
                                try {
                                    interfaceC3333z7 = c3177p16.f23890n;
                                    if (interfaceC3333z7 != null) {
                                        str26 = str13;
                                        try {
                                            ((A5) interfaceC3333z7).b(str26, "Unknown assetType ( null ) received in adResponse");
                                            c3177p21 = c3177p16;
                                            r18 = r11;
                                            c3177p15 = c3177p21;
                                            r17 = r18;
                                        } catch (JSONException e5) {
                                            e = e5;
                                            r12 = c3177p16;
                                            r1 = r11;
                                            r13 = str26;
                                            interfaceC3333z5 = r12.f23890n;
                                            r4 = r1;
                                            c3177p8 = r12;
                                            if (interfaceC3333z5 != null) {
                                                ((A5) interfaceC3333z5).b(r13, E0.a(e, H6.a(r13, str5, "Exception while building assetTypes - ")));
                                                r4 = r1;
                                                c3177p8 = r12;
                                            }
                                        }
                                    } else {
                                        c3177p15 = c3177p16;
                                        r17 = r11;
                                    }
                                    r4 = r17;
                                    c3177p8 = c3177p15;
                                } catch (JSONException e6) {
                                    e = e6;
                                    str26 = str13;
                                }
                                c3224s8 = c2984d8;
                                r2 = r4;
                                r14 = c3177p8;
                                if (c3224s8 != null) {
                                    c3224s8.b(bE);
                                    c3224s8.b(i3);
                                    c3224s8.a(i2);
                                    C2984d8.d(str4);
                                    if (str4.length() > 0 && (map4 = r14.k) != null) {
                                        map4.put(r2, str4);
                                    }
                                    if (r2.length() > 0 && (r3 = r14.j) != 0 && !r3.containsKey(r2) && (map3 = r14.j) != null) {
                                        map3.put(r2, c3224s8);
                                    }
                                    map = r14.f23888i;
                                    if (map == null && map.containsKey(str)) {
                                        HashMap map6 = r14.f23888i;
                                        if (map6 != null && (arrayList = (ArrayList) map6.get(str)) != null) {
                                            arrayList.add(c3224s8);
                                        }
                                    } else {
                                        map2 = r14.f23888i;
                                        if (map2 != null) {
                                            map2.put(str, CollectionsKt.i(c3224s8));
                                        }
                                    }
                                }
                                return c3224s8;
                            }
                            String str31 = str30;
                            try {
                                C3001e8 c3001e8A2 = c3177p24.a(pointH, point2, pointB, pointA, jSONObjectI);
                                try {
                                    String str32 = "NO_ACTION";
                                    if (jSONObject.isNull("assetOnclick")) {
                                        str11 = "NO_ACTION";
                                        str12 = null;
                                        obj3 = str32;
                                    } else {
                                        if (!jSONObject.getJSONObject("assetOnclick").isNull("openMode")) {
                                            String string2 = jSONObject.getJSONObject("assetOnclick").getString("openMode");
                                            Intrinsics.c(string2);
                                            strB = b(string2);
                                        }
                                        JSONObject jSONObject5 = jSONObject.getJSONObject("assetOnclick");
                                        Intrinsics.e(jSONObject5, "getJSONObject(...)");
                                        String strOptString = jSONObject5.optString("fallbackUrl");
                                        Intrinsics.e(strOptString, "optString(...)");
                                        str12 = strOptString;
                                        str11 = strB;
                                        obj3 = jSONObject5;
                                    }
                                    if (jSONObjectI.has("transitionEffect")) {
                                        String string3 = jSONObjectI.getString("transitionEffect");
                                        Intrinsics.c(string3);
                                        bI = i(string3);
                                    } else {
                                        bI = 0;
                                    }
                                    try {
                                        if (arrayListJ != null && !arrayListJ.isEmpty()) {
                                            String str33 = str29;
                                            c3049h8 = new C3049h8(str33, strG, c3001e8A2, arrayListJ, str11, jSONObject, bI);
                                            jSONObject2 = jSONObject;
                                            obj3 = str33;
                                        } else {
                                            String str34 = str29;
                                            c3049h8 = new C3049h8(str34, strG, c3001e8A2, str11, jSONObject, bI);
                                            jSONObject2 = jSONObject;
                                            obj3 = str34;
                                        }
                                        c3049h8.c(str2);
                                        c3049h8.f23518i = jSONObject2.optBoolean("supportLockScreen", false);
                                        if (str12 != null) {
                                            c3049h8.a(str12);
                                        }
                                        b(c3049h8, jSONObject2);
                                        JSONArray jSONArray = jSONObject2.getJSONArray("assetValue");
                                        for (int i9 = 0; i9 < jSONArray.length(); i9++) {
                                            String str35 = str2 + ".assetValue[" + i9 + AbstractJsonLexerKt.END_LIST;
                                            JSONObject jSONObject6 = jSONArray.getJSONObject(i9);
                                            Intrinsics.c(jSONObject6);
                                            C2984d8 c2984d8A = a(jSONObject6, c(k(jSONObject6)), str35);
                                            if (c2984d8A == null) {
                                                InterfaceC3333z5 interfaceC3333z11 = this.f23890n;
                                                if (interfaceC3333z11 != null) {
                                                    ((A5) interfaceC3333z11).b(str31, "Cannot build asset from JSON: " + jSONObject6 + ' ');
                                                }
                                            } else {
                                                c2984d8A.c(str35);
                                                c2984d8A.a(c3049h8);
                                                JSONObject jSONObjectOptJSONObject2 = jSONObject2.optJSONObject("assetOnclick");
                                                c3049h8.f23518i = jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.optBoolean("supportLockScreen", false) : false;
                                                c3049h8.a(c2984d8A);
                                            }
                                            break;
                                        }
                                        c2984d8 = c3049h8;
                                        r4 = obj3;
                                        this = this;
                                    } catch (JSONException e7) {
                                        e = e7;
                                        r1 = obj3;
                                        r12 = this;
                                        r13 = str31;
                                        interfaceC3333z5 = r12.f23890n;
                                        r4 = r1;
                                        c3177p8 = r12;
                                        if (interfaceC3333z5 != null) {
                                            ((A5) interfaceC3333z5).b(r13, E0.a(e, H6.a(r13, str5, "Exception while building assetTypes - ")));
                                            r4 = r1;
                                            c3177p8 = r12;
                                        }
                                    }
                                } catch (JSONException e8) {
                                    e = e8;
                                    c3177p14 = this;
                                    r1 = str29;
                                    r12 = c3177p14;
                                    r13 = str31;
                                }
                            } catch (JSONException e9) {
                                e = e9;
                                c3177p14 = c3177p24;
                            }
                            c3224s8 = c2984d8;
                            r2 = r4;
                            r14 = c3177p8;
                            if (c3224s8 != null) {
                                c3224s8.b(bE);
                                c3224s8.b(i3);
                                c3224s8.a(i2);
                                C2984d8.d(str4);
                                if (str4.length() > 0) {
                                    map4.put(r2, str4);
                                }
                                if (r2.length() > 0) {
                                    map3.put(r2, c3224s8);
                                }
                                map = r14.f23888i;
                                if (map == null) {
                                    map2 = r14.f23888i;
                                    if (map2 != null) {
                                        map2.put(str, CollectionsKt.i(c3224s8));
                                    }
                                } else {
                                    map2 = r14.f23888i;
                                    if (map2 != null) {
                                        map2.put(str, CollectionsKt.i(c3224s8));
                                    }
                                }
                            }
                            return c3224s8;
                            interfaceC3333z5 = r12.f23890n;
                            r4 = r1;
                            c3177p8 = r12;
                            if (interfaceC3333z5 != null) {
                                ((A5) interfaceC3333z5).b(r13, E0.a(e, H6.a(r13, str5, "Exception while building assetTypes - ")));
                                r4 = r1;
                                c3177p8 = r12;
                            }
                            c3224s8 = c2984d8;
                            r2 = r4;
                            r14 = c3177p8;
                            if (c3224s8 != null) {
                                c3224s8.b(bE);
                                c3224s8.b(i3);
                                c3224s8.a(i2);
                                C2984d8.d(str4);
                                if (str4.length() > 0) {
                                    map4.put(r2, str4);
                                }
                                if (r2.length() > 0) {
                                    map3.put(r2, c3224s8);
                                }
                                map = r14.f23888i;
                                if (map == null) {
                                    map2 = r14.f23888i;
                                    if (map2 != null) {
                                        map2.put(str, CollectionsKt.i(c3224s8));
                                    }
                                } else {
                                    map2 = r14.f23888i;
                                    if (map2 != null) {
                                        map2.put(str, CollectionsKt.i(c3224s8));
                                    }
                                }
                            }
                            return c3224s8;
                        case -1884772963:
                            C3177p8 c3177p25 = this;
                            String str36 = strF;
                            i3 = iA;
                            str5 = str5;
                            i2 = iA2;
                            str13 = "p8";
                            c3177p21 = c3177p25;
                            r18 = str36;
                            if (str.equals("RATING")) {
                                c3177p15 = c3177p21;
                                r17 = r18;
                            } else {
                                c3177p16 = c3177p25;
                                r11 = str36;
                                interfaceC3333z7 = c3177p16.f23890n;
                                if (interfaceC3333z7 != null) {
                                    str26 = str13;
                                    ((A5) interfaceC3333z7).b(str26, "Unknown assetType ( null ) received in adResponse");
                                    c3177p21 = c3177p16;
                                    r18 = r11;
                                    c3177p15 = c3177p21;
                                    r17 = r18;
                                } else {
                                    c3177p15 = c3177p16;
                                    r17 = r11;
                                }
                            }
                            r4 = r17;
                            c3177p8 = c3177p15;
                            c3224s8 = c2984d8;
                            r2 = r4;
                            r14 = c3177p8;
                            if (c3224s8 != null) {
                                c3224s8.b(bE);
                                c3224s8.b(i3);
                                c3224s8.a(i2);
                                C2984d8.d(str4);
                                if (str4.length() > 0) {
                                    map4.put(r2, str4);
                                }
                                if (r2.length() > 0) {
                                    map3.put(r2, c3224s8);
                                }
                                map = r14.f23888i;
                                if (map == null) {
                                    map2 = r14.f23888i;
                                    if (map2 != null) {
                                        map2.put(str, CollectionsKt.i(c3224s8));
                                    }
                                } else {
                                    map2 = r14.f23888i;
                                    if (map2 != null) {
                                        map2.put(str, CollectionsKt.i(c3224s8));
                                    }
                                }
                            }
                            return c3224s8;
                        case 67056:
                            r19 = strF;
                            i3 = iA;
                            Point point3 = point;
                            str5 = str5;
                            i2 = iA2;
                            str7 = "p8";
                            try {
                                if (str.equals("CTA")) {
                                    if (jSONObject.isNull("assetOnclick")) {
                                        return null;
                                    }
                                    C3097k8 c3097k8B = b(pointH, point3, pointB, pointA, jSONObjectI);
                                    JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("assetOnclick");
                                    if (jSONObjectOptJSONObject3 == null || !jSONObjectOptJSONObject3.isNull("openMode")) {
                                        String string4 = jSONObject.getJSONObject("assetOnclick").getString("openMode");
                                        Intrinsics.c(string4);
                                        strB = b(string4);
                                    }
                                    String str37 = strB;
                                    JSONObject jSONObject7 = jSONObject.getJSONObject("assetOnclick");
                                    Intrinsics.e(jSONObject7, "getJSONObject(...)");
                                    String strOptString2 = jSONObject7.optString("fallbackUrl");
                                    Intrinsics.e(strOptString2, "optString(...)");
                                    if (arrayListJ != null && !arrayListJ.isEmpty()) {
                                        c3113l8 = new C3113l8(r19, strG, c3097k8B, str3, arrayListJ, str37);
                                    } else {
                                        c3113l8 = new C3113l8(r19, strG, c3097k8B, str3, str37);
                                    }
                                    c3113l8.c(str2);
                                    JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("assetOnclick");
                                    c3113l8.f23518i = jSONObjectOptJSONObject4 != null ? jSONObjectOptJSONObject4.optBoolean("supportLockScreen", false) : false;
                                    b(c3113l8, jSONObject);
                                    c3113l8.a(strOptString2);
                                    c3177p15 = this;
                                    c2984d8 = c3113l8;
                                    r17 = r19;
                                } else {
                                    c3177p16 = this;
                                    r11 = r19;
                                    str13 = str7;
                                    interfaceC3333z7 = c3177p16.f23890n;
                                    if (interfaceC3333z7 != null) {
                                        str26 = str13;
                                        ((A5) interfaceC3333z7).b(str26, "Unknown assetType ( null ) received in adResponse");
                                        c3177p21 = c3177p16;
                                        r18 = r11;
                                        c3177p15 = c3177p21;
                                        r17 = r18;
                                    } else {
                                        c3177p15 = c3177p16;
                                        r17 = r11;
                                    }
                                }
                                r4 = r17;
                                c3177p8 = c3177p15;
                            } catch (JSONException e10) {
                                e = e10;
                                obj = this;
                                r15 = obj;
                                r5 = r19;
                                r16 = r15;
                                str6 = str7;
                                r13 = str6;
                                r1 = r5;
                                r12 = r16;
                                break;
                            }
                            c3224s8 = c2984d8;
                            r2 = r4;
                            r14 = c3177p8;
                            if (c3224s8 != null) {
                                c3224s8.b(bE);
                                c3224s8.b(i3);
                                c3224s8.a(i2);
                                C2984d8.d(str4);
                                if (str4.length() > 0) {
                                    map4.put(r2, str4);
                                }
                                if (r2.length() > 0) {
                                    map3.put(r2, c3224s8);
                                }
                                map = r14.f23888i;
                                if (map == null) {
                                    map2 = r14.f23888i;
                                    if (map2 != null) {
                                        map2.put(str, CollectionsKt.i(c3224s8));
                                    }
                                } else {
                                    map2 = r14.f23888i;
                                    if (map2 != null) {
                                        map2.put(str, CollectionsKt.i(c3224s8));
                                    }
                                }
                            }
                            return c3224s8;
                        case 70564:
                            i3 = iA;
                            i2 = iA2;
                            String str38 = strF;
                            try {
                                str14 = str38;
                                if (str.equals("GIF")) {
                                    c3177p17 = this;
                                    str15 = str38;
                                    str16 = str15;
                                    str5 = str5;
                                    str7 = "p8";
                                    try {
                                        c3001e8A = c3177p17.a(pointH, point, pointB, pointA, jSONObjectI);
                                        try {
                                            str17 = "NO_ACTION";
                                            if (!jSONObject.isNull("assetOnclick")) {
                                                str19 = "NO_ACTION";
                                                str18 = null;
                                                obj4 = str17;
                                            } else {
                                                try {
                                                    if (!jSONObject.getJSONObject("assetOnclick").isNull("openMode")) {
                                                        String string5 = jSONObject.getJSONObject("assetOnclick").getString("openMode");
                                                        Intrinsics.c(string5);
                                                        strB = b(string5);
                                                    }
                                                    JSONObject jSONObject8 = jSONObject.getJSONObject("assetOnclick");
                                                    Intrinsics.e(jSONObject8, "getJSONObject(...)");
                                                    String strOptString3 = jSONObject8.optString("fallbackUrl");
                                                    Intrinsics.e(strOptString3, "optString(...)");
                                                    str18 = strOptString3;
                                                    str19 = strB;
                                                    obj4 = jSONObject8;
                                                } catch (JSONException e11) {
                                                    e = e11;
                                                    r16 = this;
                                                    r5 = str16;
                                                    str6 = str7;
                                                    r13 = str6;
                                                    r1 = r5;
                                                    r12 = r16;
                                                    interfaceC3333z5 = r12.f23890n;
                                                    r4 = r1;
                                                    c3177p8 = r12;
                                                    if (interfaceC3333z5 != null) {
                                                        ((A5) interfaceC3333z5).b(r13, E0.a(e, H6.a(r13, str5, "Exception while building assetTypes - ")));
                                                        r4 = r1;
                                                        c3177p8 = r12;
                                                    }
                                                    c3224s8 = c2984d8;
                                                    r2 = r4;
                                                    r14 = c3177p8;
                                                    if (c3224s8 != null) {
                                                        c3224s8.b(bE);
                                                        c3224s8.b(i3);
                                                        c3224s8.a(i2);
                                                        C2984d8.d(str4);
                                                        if (str4.length() > 0) {
                                                            map4.put(r2, str4);
                                                        }
                                                        if (r2.length() > 0) {
                                                            map3.put(r2, c3224s8);
                                                        }
                                                        map = r14.f23888i;
                                                        if (map == null) {
                                                            map2 = r14.f23888i;
                                                            if (map2 != null) {
                                                                map2.put(str, CollectionsKt.i(c3224s8));
                                                            }
                                                        } else {
                                                            map2 = r14.f23888i;
                                                            if (map2 != null) {
                                                                map2.put(str, CollectionsKt.i(c3224s8));
                                                            }
                                                        }
                                                    }
                                                    return c3224s8;
                                                }
                                            }
                                            try {
                                                try {
                                                    if (arrayListJ == 0 && !arrayListJ.isEmpty()) {
                                                        if ("IMAGE".equals(str)) {
                                                            this = this;
                                                            String str39 = str16;
                                                            c3224s8 = new C3256u8(str39, strG, c3001e8A, l(jSONObject), arrayListJ, str19, jSONObject);
                                                            obj4 = str39;
                                                        } else {
                                                            this = this;
                                                            String str40 = str16;
                                                            c3224s8 = new C3224s8(str40, strG, c3001e8A, l(jSONObject), arrayListJ, str19, jSONObject);
                                                            obj4 = str40;
                                                        }
                                                    } else {
                                                        r15 = this;
                                                        str20 = str16;
                                                        try {
                                                            if ("IMAGE".equals(str)) {
                                                                c3224s8 = new C3256u8(str20, strG, c3001e8A, l(jSONObject), str19, jSONObject);
                                                                obj4 = str20;
                                                                this = r15;
                                                            } else {
                                                                try {
                                                                    c3224s8 = new C3224s8(str20, strG, c3001e8A, l(jSONObject), str19, jSONObject);
                                                                    r19 = str20;
                                                                    jSONObject3 = jSONObject;
                                                                    r15 = r15;
                                                                } catch (JSONException e12) {
                                                                    e = e12;
                                                                    r5 = str20;
                                                                    r16 = r15;
                                                                    str6 = str7;
                                                                    r13 = str6;
                                                                    r1 = r5;
                                                                    r12 = r16;
                                                                    interfaceC3333z5 = r12.f23890n;
                                                                    r4 = r1;
                                                                    c3177p8 = r12;
                                                                    if (interfaceC3333z5 != null) {
                                                                        ((A5) interfaceC3333z5).b(r13, E0.a(e, H6.a(r13, str5, "Exception while building assetTypes - ")));
                                                                        r4 = r1;
                                                                        c3177p8 = r12;
                                                                    }
                                                                    c3224s8 = c2984d8;
                                                                    r2 = r4;
                                                                    r14 = c3177p8;
                                                                }
                                                            }
                                                            c3224s8.c(str2);
                                                            jSONObjectOptJSONObject = jSONObject3.optJSONObject("assetOnclick");
                                                            if (jSONObjectOptJSONObject != null) {
                                                                zOptBoolean = jSONObjectOptJSONObject.optBoolean("supportLockScreen", false);
                                                            } else {
                                                                zOptBoolean = false;
                                                            }
                                                            c3224s8.f23518i = zOptBoolean;
                                                            r15.b(c3224s8, jSONObject3);
                                                            if (str18 != null) {
                                                                c3224s8.a(str18);
                                                            }
                                                            r2 = r19;
                                                            r14 = r15;
                                                            break;
                                                        } catch (JSONException e13) {
                                                            e = e13;
                                                            r19 = str20;
                                                            r5 = r19;
                                                            r16 = r15;
                                                            str6 = str7;
                                                            r13 = str6;
                                                            r1 = r5;
                                                            r12 = r16;
                                                            interfaceC3333z5 = r12.f23890n;
                                                            r4 = r1;
                                                            c3177p8 = r12;
                                                            if (interfaceC3333z5 != null) {
                                                                ((A5) interfaceC3333z5).b(r13, E0.a(e, H6.a(r13, str5, "Exception while building assetTypes - ")));
                                                                r4 = r1;
                                                                c3177p8 = r12;
                                                            }
                                                            c3224s8 = c2984d8;
                                                            r2 = r4;
                                                            r14 = c3177p8;
                                                            if (c3224s8 != null) {
                                                                c3224s8.b(bE);
                                                                c3224s8.b(i3);
                                                                c3224s8.a(i2);
                                                                C2984d8.d(str4);
                                                                if (str4.length() > 0) {
                                                                    map4.put(r2, str4);
                                                                }
                                                                if (r2.length() > 0) {
                                                                    map3.put(r2, c3224s8);
                                                                }
                                                                map = r14.f23888i;
                                                                if (map == null) {
                                                                    map2 = r14.f23888i;
                                                                    if (map2 != null) {
                                                                        map2.put(str, CollectionsKt.i(c3224s8));
                                                                    }
                                                                } else {
                                                                    map2 = r14.f23888i;
                                                                    if (map2 != null) {
                                                                        map2.put(str, CollectionsKt.i(c3224s8));
                                                                    }
                                                                }
                                                            }
                                                            return c3224s8;
                                                        }
                                                        if (c3224s8 != null) {
                                                            c3224s8.b(bE);
                                                            c3224s8.b(i3);
                                                            c3224s8.a(i2);
                                                            C2984d8.d(str4);
                                                            if (str4.length() > 0) {
                                                                map4.put(r2, str4);
                                                            }
                                                            if (r2.length() > 0) {
                                                                map3.put(r2, c3224s8);
                                                            }
                                                            map = r14.f23888i;
                                                            if (map == null) {
                                                                map2 = r14.f23888i;
                                                                if (map2 != null) {
                                                                    map2.put(str, CollectionsKt.i(c3224s8));
                                                                }
                                                            } else {
                                                                map2 = r14.f23888i;
                                                                if (map2 != null) {
                                                                    map2.put(str, CollectionsKt.i(c3224s8));
                                                                }
                                                            }
                                                        }
                                                        return c3224s8;
                                                    }
                                                    c3224s8.c(str2);
                                                    jSONObjectOptJSONObject = jSONObject3.optJSONObject("assetOnclick");
                                                    if (jSONObjectOptJSONObject != null) {
                                                        zOptBoolean = jSONObjectOptJSONObject.optBoolean("supportLockScreen", false);
                                                    } else {
                                                        zOptBoolean = false;
                                                    }
                                                    c3224s8.f23518i = zOptBoolean;
                                                    r15.b(c3224s8, jSONObject3);
                                                    if (str18 != null) {
                                                        c3224s8.a(str18);
                                                    }
                                                    r2 = r19;
                                                    r14 = r15;
                                                } catch (JSONException e14) {
                                                    e = e14;
                                                    r5 = r19;
                                                    r16 = r15;
                                                    str6 = str7;
                                                    r13 = str6;
                                                    r1 = r5;
                                                    r12 = r16;
                                                    interfaceC3333z5 = r12.f23890n;
                                                    r4 = r1;
                                                    c3177p8 = r12;
                                                    if (interfaceC3333z5 != null) {
                                                        ((A5) interfaceC3333z5).b(r13, E0.a(e, H6.a(r13, str5, "Exception while building assetTypes - ")));
                                                        r4 = r1;
                                                        c3177p8 = r12;
                                                    }
                                                    c3224s8 = c2984d8;
                                                    r2 = r4;
                                                    r14 = c3177p8;
                                                }
                                                jSONObject3 = jSONObject;
                                                r19 = obj4;
                                                r15 = this;
                                            } catch (JSONException e15) {
                                                e = e15;
                                                r5 = obj4;
                                                r16 = this;
                                                str6 = str7;
                                            }
                                        } catch (JSONException e16) {
                                            e = e16;
                                            r15 = this;
                                            r19 = str16;
                                            r5 = r19;
                                            r16 = r15;
                                            str6 = str7;
                                            r13 = str6;
                                            r1 = r5;
                                            r12 = r16;
                                            interfaceC3333z5 = r12.f23890n;
                                            r4 = r1;
                                            c3177p8 = r12;
                                            if (interfaceC3333z5 != null) {
                                                ((A5) interfaceC3333z5).b(r13, E0.a(e, H6.a(r13, str5, "Exception while building assetTypes - ")));
                                                r4 = r1;
                                                c3177p8 = r12;
                                            }
                                            c3224s8 = c2984d8;
                                            r2 = r4;
                                            r14 = c3177p8;
                                            if (c3224s8 != null) {
                                                c3224s8.b(bE);
                                                c3224s8.b(i3);
                                                c3224s8.a(i2);
                                                C2984d8.d(str4);
                                                if (str4.length() > 0) {
                                                    map4.put(r2, str4);
                                                }
                                                if (r2.length() > 0) {
                                                    map3.put(r2, c3224s8);
                                                }
                                                map = r14.f23888i;
                                                if (map == null) {
                                                    map2 = r14.f23888i;
                                                    if (map2 != null) {
                                                        map2.put(str, CollectionsKt.i(c3224s8));
                                                    }
                                                } else {
                                                    map2 = r14.f23888i;
                                                    if (map2 != null) {
                                                        map2.put(str, CollectionsKt.i(c3224s8));
                                                    }
                                                }
                                            }
                                            return c3224s8;
                                        }
                                        break;
                                    } catch (JSONException e17) {
                                        e = e17;
                                        r15 = c3177p17;
                                    }
                                    if (c3224s8 != null) {
                                        c3224s8.b(bE);
                                        c3224s8.b(i3);
                                        c3224s8.a(i2);
                                        C2984d8.d(str4);
                                        if (str4.length() > 0) {
                                            map4.put(r2, str4);
                                        }
                                        if (r2.length() > 0) {
                                            map3.put(r2, c3224s8);
                                        }
                                        map = r14.f23888i;
                                        if (map == null) {
                                            map2 = r14.f23888i;
                                            if (map2 != null) {
                                                map2.put(str, CollectionsKt.i(c3224s8));
                                            }
                                        } else {
                                            map2 = r14.f23888i;
                                            if (map2 != null) {
                                                map2.put(str, CollectionsKt.i(c3224s8));
                                            }
                                        }
                                    }
                                    return c3224s8;
                                }
                                c3177p18 = this;
                                str21 = str14;
                                str22 = str21;
                                c3177p22 = c3177p18;
                                str13 = "p8";
                                c3177p16 = c3177p22;
                                r11 = str22;
                                interfaceC3333z7 = c3177p16.f23890n;
                                if (interfaceC3333z7 != null) {
                                    str26 = str13;
                                    ((A5) interfaceC3333z7).b(str26, "Unknown assetType ( null ) received in adResponse");
                                    c3177p21 = c3177p16;
                                    r18 = r11;
                                    c3177p15 = c3177p21;
                                    r17 = r18;
                                } else {
                                    c3177p15 = c3177p16;
                                    r17 = r11;
                                }
                                r4 = r17;
                                c3177p8 = c3177p15;
                            } catch (JSONException e18) {
                                e = e18;
                                r15 = this;
                                r19 = str38;
                                str5 = str5;
                                str7 = "p8";
                                r5 = r19;
                                r16 = r15;
                                str6 = str7;
                                r13 = str6;
                                r1 = r5;
                                r12 = r16;
                                interfaceC3333z5 = r12.f23890n;
                                r4 = r1;
                                c3177p8 = r12;
                                if (interfaceC3333z5 != null) {
                                    ((A5) interfaceC3333z5).b(r13, E0.a(e, H6.a(r13, str5, "Exception while building assetTypes - ")));
                                    r4 = r1;
                                    c3177p8 = r12;
                                }
                                c3224s8 = c2984d8;
                                r2 = r4;
                                r14 = c3177p8;
                                if (c3224s8 != null) {
                                    c3224s8.b(bE);
                                    c3224s8.b(i3);
                                    c3224s8.a(i2);
                                    C2984d8.d(str4);
                                    if (str4.length() > 0) {
                                        map4.put(r2, str4);
                                    }
                                    if (r2.length() > 0) {
                                        map3.put(r2, c3224s8);
                                    }
                                    map = r14.f23888i;
                                    if (map == null) {
                                        map2 = r14.f23888i;
                                        if (map2 != null) {
                                            map2.put(str, CollectionsKt.i(c3224s8));
                                        }
                                    } else {
                                        map2 = r14.f23888i;
                                        if (map2 != null) {
                                            map2.put(str, CollectionsKt.i(c3224s8));
                                        }
                                    }
                                }
                                return c3224s8;
                            }
                            c3224s8 = c2984d8;
                            r2 = r4;
                            r14 = c3177p8;
                            if (c3224s8 != null) {
                                c3224s8.b(bE);
                                c3224s8.b(i3);
                                c3224s8.a(i2);
                                C2984d8.d(str4);
                                if (str4.length() > 0) {
                                    map4.put(r2, str4);
                                }
                                if (r2.length() > 0) {
                                    map3.put(r2, c3224s8);
                                }
                                map = r14.f23888i;
                                if (map == null) {
                                    map2 = r14.f23888i;
                                    if (map2 != null) {
                                        map2.put(str, CollectionsKt.i(c3224s8));
                                    }
                                } else {
                                    map2 = r14.f23888i;
                                    if (map2 != null) {
                                        map2.put(str, CollectionsKt.i(c3224s8));
                                    }
                                }
                            }
                            return c3224s8;
                        case 2241657:
                            String str41 = strF;
                            i3 = iA;
                            Point point4 = point;
                            i2 = iA2;
                            str14 = str41;
                            if (str.equals("ICON")) {
                                c3240t8 = new C3240t8(str41, strG, a(pointH, point4, pointB, pointA, jSONObjectI), l(jSONObject));
                                c3240t8.c(str2);
                                arrayListJ = str41;
                                c3177p8 = this;
                                c2984d8 = c3240t8;
                                r4 = arrayListJ;
                                c3224s8 = c2984d8;
                                r2 = r4;
                                r14 = c3177p8;
                                if (c3224s8 != null) {
                                    c3224s8.b(bE);
                                    c3224s8.b(i3);
                                    c3224s8.a(i2);
                                    C2984d8.d(str4);
                                    if (str4.length() > 0) {
                                        map4.put(r2, str4);
                                    }
                                    if (r2.length() > 0) {
                                        map3.put(r2, c3224s8);
                                    }
                                    map = r14.f23888i;
                                    if (map == null) {
                                        map2 = r14.f23888i;
                                        if (map2 != null) {
                                            map2.put(str, CollectionsKt.i(c3224s8));
                                        }
                                    } else {
                                        map2 = r14.f23888i;
                                        if (map2 != null) {
                                            map2.put(str, CollectionsKt.i(c3224s8));
                                        }
                                    }
                                }
                                return c3224s8;
                            }
                            c3177p18 = this;
                            str21 = str14;
                            str22 = str21;
                            c3177p22 = c3177p18;
                            str13 = "p8";
                            c3177p16 = c3177p22;
                            r11 = str22;
                            interfaceC3333z7 = c3177p16.f23890n;
                            if (interfaceC3333z7 != null) {
                                str26 = str13;
                                ((A5) interfaceC3333z7).b(str26, "Unknown assetType ( null ) received in adResponse");
                                c3177p21 = c3177p16;
                                r18 = r11;
                                c3177p15 = c3177p21;
                                r17 = r18;
                            } else {
                                c3177p15 = c3177p16;
                                r17 = r11;
                            }
                            r4 = r17;
                            c3177p8 = c3177p15;
                            c3224s8 = c2984d8;
                            r2 = r4;
                            r14 = c3177p8;
                            if (c3224s8 != null) {
                                c3224s8.b(bE);
                                c3224s8.b(i3);
                                c3224s8.a(i2);
                                C2984d8.d(str4);
                                if (str4.length() > 0) {
                                    map4.put(r2, str4);
                                }
                                if (r2.length() > 0) {
                                    map3.put(r2, c3224s8);
                                }
                                map = r14.f23888i;
                                if (map == null) {
                                    map2 = r14.f23888i;
                                    if (map2 != null) {
                                        map2.put(str, CollectionsKt.i(c3224s8));
                                    }
                                } else {
                                    map2 = r14.f23888i;
                                    if (map2 != null) {
                                        map2.put(str, CollectionsKt.i(c3224s8));
                                    }
                                }
                            }
                            return c3224s8;
                        case 2571565:
                            C3177p8 c3177p26 = this;
                            String str42 = strF;
                            i3 = iA;
                            Point point5 = point;
                            i2 = iA2;
                            if (str.equals(AdPreferences.TYPE_TEXT)) {
                                c3240t8 = new N8(str42, strG, c3177p26.c(pointH, point5, pointB, pointA, jSONObjectI), str3);
                                c3240t8.c(str2);
                                arrayListJ = str42;
                                c3177p8 = this;
                                c2984d8 = c3240t8;
                                r4 = arrayListJ;
                                c3224s8 = c2984d8;
                                r2 = r4;
                                r14 = c3177p8;
                                if (c3224s8 != null) {
                                    c3224s8.b(bE);
                                    c3224s8.b(i3);
                                    c3224s8.a(i2);
                                    C2984d8.d(str4);
                                    if (str4.length() > 0) {
                                        map4.put(r2, str4);
                                    }
                                    if (r2.length() > 0) {
                                        map3.put(r2, c3224s8);
                                    }
                                    map = r14.f23888i;
                                    if (map == null) {
                                        map2 = r14.f23888i;
                                        if (map2 != null) {
                                            map2.put(str, CollectionsKt.i(c3224s8));
                                        }
                                    } else {
                                        map2 = r14.f23888i;
                                        if (map2 != null) {
                                            map2.put(str, CollectionsKt.i(c3224s8));
                                        }
                                    }
                                }
                                return c3224s8;
                            }
                            c3177p18 = c3177p26;
                            str21 = str42;
                            str22 = str21;
                            c3177p22 = c3177p18;
                            str13 = "p8";
                            c3177p16 = c3177p22;
                            r11 = str22;
                            interfaceC3333z7 = c3177p16.f23890n;
                            if (interfaceC3333z7 != null) {
                                str26 = str13;
                                ((A5) interfaceC3333z7).b(str26, "Unknown assetType ( null ) received in adResponse");
                                c3177p21 = c3177p16;
                                r18 = r11;
                                c3177p15 = c3177p21;
                                r17 = r18;
                            } else {
                                c3177p15 = c3177p16;
                                r17 = r11;
                            }
                            r4 = r17;
                            c3177p8 = c3177p15;
                            c3224s8 = c2984d8;
                            r2 = r4;
                            r14 = c3177p8;
                            if (c3224s8 != null) {
                                c3224s8.b(bE);
                                c3224s8.b(i3);
                                c3224s8.a(i2);
                                C2984d8.d(str4);
                                if (str4.length() > 0) {
                                    map4.put(r2, str4);
                                }
                                if (r2.length() > 0) {
                                    map3.put(r2, c3224s8);
                                }
                                map = r14.f23888i;
                                if (map == null) {
                                    map2 = r14.f23888i;
                                    if (map2 != null) {
                                        map2.put(str, CollectionsKt.i(c3224s8));
                                    }
                                } else {
                                    map2 = r14.f23888i;
                                    if (map2 != null) {
                                        map2.put(str, CollectionsKt.i(c3224s8));
                                    }
                                }
                            }
                            return c3224s8;
                        case 69775675:
                            C3177p8 c3177p27 = this;
                            i3 = iA;
                            i2 = iA2;
                            String str43 = strF;
                            try {
                                c3177p18 = c3177p27;
                                str21 = str43;
                                c3177p17 = c3177p27;
                                str15 = str43;
                                if (str.equals("IMAGE")) {
                                    str16 = str15;
                                    str5 = str5;
                                    str7 = "p8";
                                    c3001e8A = c3177p17.a(pointH, point, pointB, pointA, jSONObjectI);
                                    str17 = "NO_ACTION";
                                    if (!jSONObject.isNull("assetOnclick")) {
                                        str19 = "NO_ACTION";
                                        str18 = null;
                                        obj4 = str17;
                                    } else {
                                        if (!jSONObject.getJSONObject("assetOnclick").isNull("openMode")) {
                                            String string6 = jSONObject.getJSONObject("assetOnclick").getString("openMode");
                                            Intrinsics.c(string6);
                                            strB = b(string6);
                                        }
                                        JSONObject jSONObject9 = jSONObject.getJSONObject("assetOnclick");
                                        Intrinsics.e(jSONObject9, "getJSONObject(...)");
                                        String strOptString4 = jSONObject9.optString("fallbackUrl");
                                        Intrinsics.e(strOptString4, "optString(...)");
                                        str18 = strOptString4;
                                        str19 = strB;
                                        obj4 = jSONObject9;
                                    }
                                    if (arrayListJ == 0) {
                                        r15 = this;
                                        str20 = str16;
                                        if ("IMAGE".equals(str)) {
                                            c3224s8 = new C3256u8(str20, strG, c3001e8A, l(jSONObject), str19, jSONObject);
                                            obj4 = str20;
                                            this = r15;
                                            jSONObject3 = jSONObject;
                                            r19 = obj4;
                                            r15 = this;
                                        } else {
                                            c3224s8 = new C3224s8(str20, strG, c3001e8A, l(jSONObject), str19, jSONObject);
                                            r19 = str20;
                                            jSONObject3 = jSONObject;
                                            r15 = r15;
                                        }
                                        c3224s8.c(str2);
                                        jSONObjectOptJSONObject = jSONObject3.optJSONObject("assetOnclick");
                                        if (jSONObjectOptJSONObject != null) {
                                            zOptBoolean = jSONObjectOptJSONObject.optBoolean("supportLockScreen", false);
                                        } else {
                                            zOptBoolean = false;
                                        }
                                        c3224s8.f23518i = zOptBoolean;
                                        r15.b(c3224s8, jSONObject3);
                                        if (str18 != null) {
                                            c3224s8.a(str18);
                                        }
                                        r2 = r19;
                                        r14 = r15;
                                    } else {
                                        r15 = this;
                                        str20 = str16;
                                        if ("IMAGE".equals(str)) {
                                            c3224s8 = new C3256u8(str20, strG, c3001e8A, l(jSONObject), str19, jSONObject);
                                            obj4 = str20;
                                            this = r15;
                                            jSONObject3 = jSONObject;
                                            r19 = obj4;
                                            r15 = this;
                                        } else {
                                            c3224s8 = new C3224s8(str20, strG, c3001e8A, l(jSONObject), str19, jSONObject);
                                            r19 = str20;
                                            jSONObject3 = jSONObject;
                                            r15 = r15;
                                        }
                                        c3224s8.c(str2);
                                        jSONObjectOptJSONObject = jSONObject3.optJSONObject("assetOnclick");
                                        if (jSONObjectOptJSONObject != null) {
                                            zOptBoolean = jSONObjectOptJSONObject.optBoolean("supportLockScreen", false);
                                        } else {
                                            zOptBoolean = false;
                                        }
                                        c3224s8.f23518i = zOptBoolean;
                                        r15.b(c3224s8, jSONObject3);
                                        if (str18 != null) {
                                            c3224s8.a(str18);
                                        }
                                        r2 = r19;
                                        r14 = r15;
                                    }
                                } else {
                                    str22 = str21;
                                    c3177p22 = c3177p18;
                                    str13 = "p8";
                                    c3177p16 = c3177p22;
                                    r11 = str22;
                                    interfaceC3333z7 = c3177p16.f23890n;
                                    if (interfaceC3333z7 != null) {
                                        str26 = str13;
                                        ((A5) interfaceC3333z7).b(str26, "Unknown assetType ( null ) received in adResponse");
                                        c3177p21 = c3177p16;
                                        r18 = r11;
                                        c3177p15 = c3177p21;
                                        r17 = r18;
                                    } else {
                                        c3177p15 = c3177p16;
                                        r17 = r11;
                                    }
                                    r4 = r17;
                                    c3177p8 = c3177p15;
                                    c3224s8 = c2984d8;
                                    r2 = r4;
                                    r14 = c3177p8;
                                }
                                break;
                            } catch (JSONException e19) {
                                e = e19;
                                c3177p9 = c3177p27;
                                arrayList3 = str43;
                                arrayList2 = arrayList3;
                                c3177p10 = c3177p9;
                                r13 = "p8";
                                r1 = arrayList2;
                                r12 = c3177p10;
                                break;
                            }
                            if (c3224s8 != null) {
                                c3224s8.b(bE);
                                c3224s8.b(i3);
                                c3224s8.a(i2);
                                C2984d8.d(str4);
                                if (str4.length() > 0) {
                                    map4.put(r2, str4);
                                }
                                if (r2.length() > 0) {
                                    map3.put(r2, c3224s8);
                                }
                                map = r14.f23888i;
                                if (map == null) {
                                    map2 = r14.f23888i;
                                    if (map2 != null) {
                                        map2.put(str, CollectionsKt.i(c3224s8));
                                    }
                                } else {
                                    map2 = r14.f23888i;
                                    if (map2 != null) {
                                        map2.put(str, CollectionsKt.i(c3224s8));
                                    }
                                }
                            }
                            return c3224s8;
                        case 79826725:
                            Point point6 = point;
                            String str44 = "p8";
                            try {
                                if (str.equals("TIMER")) {
                                    c3177p19 = this;
                                    i5 = iA;
                                    try {
                                        C3001e8 c3001e8A3 = c3177p19.a(pointH, point6, pointB, pointA, jSONObjectI);
                                        O8 o8Q = jSONObject.has("startOffset") ? c3177p19.q(jSONObject.getJSONObject("startOffset")) : null;
                                        O8 o8Q2 = jSONObject.has("timerDuration") ? c3177p19.q(jSONObject.getJSONObject("timerDuration")) : null;
                                        boolean zOptBoolean6 = jSONObject.optBoolean("displayTimer", true);
                                        Q8 q8 = new Q8(strF, strG, c3001e8A3, new P8(o8Q, o8Q2));
                                        q8.a(zOptBoolean6);
                                        if (jSONObject.has("assetOnFinish")) {
                                            Object obj9 = jSONObject.get("assetOnFinish");
                                            Intrinsics.d(obj9, "null cannot be cast to non-null type org.json.JSONObject");
                                            JSONObject jSONObject10 = (JSONObject) obj9;
                                            if (jSONObject10.has("action")) {
                                                String string7 = jSONObject10.getString("action");
                                                Intrinsics.c(string7);
                                                q8.a(a(string7));
                                            }
                                        }
                                        q8.c(str2);
                                        c3177p13 = c3177p19;
                                        c2984d8 = q8;
                                        str10 = strF;
                                        i3 = i5;
                                        i2 = iA2;
                                        r4 = str10;
                                        c3177p8 = c3177p13;
                                    } catch (JSONException e20) {
                                        e = e20;
                                        c3177p20 = c3177p19;
                                        str23 = strF;
                                        i3 = i5;
                                        r30 = str44;
                                        i2 = iA2;
                                        r13 = r30;
                                        r1 = str23;
                                        r12 = c3177p20;
                                        interfaceC3333z5 = r12.f23890n;
                                        r4 = r1;
                                        c3177p8 = r12;
                                        if (interfaceC3333z5 != null) {
                                            ((A5) interfaceC3333z5).b(r13, E0.a(e, H6.a(r13, str5, "Exception while building assetTypes - ")));
                                            r4 = r1;
                                            c3177p8 = r12;
                                        }
                                    }
                                    c3224s8 = c2984d8;
                                    r2 = r4;
                                    r14 = c3177p8;
                                    if (c3224s8 != null) {
                                        c3224s8.b(bE);
                                        c3224s8.b(i3);
                                        c3224s8.a(i2);
                                        C2984d8.d(str4);
                                        if (str4.length() > 0) {
                                            map4.put(r2, str4);
                                        }
                                        if (r2.length() > 0) {
                                            map3.put(r2, c3224s8);
                                        }
                                        map = r14.f23888i;
                                        if (map == null) {
                                            map2 = r14.f23888i;
                                            if (map2 != null) {
                                                map2.put(str, CollectionsKt.i(c3224s8));
                                            }
                                        } else {
                                            map2 = r14.f23888i;
                                            if (map2 != null) {
                                                map2.put(str, CollectionsKt.i(c3224s8));
                                            }
                                        }
                                    }
                                    return c3224s8;
                                }
                                c3177p16 = this;
                                r11 = strF;
                                str5 = str5;
                                i3 = iA;
                                i2 = iA2;
                                str13 = str44;
                                interfaceC3333z7 = c3177p16.f23890n;
                                if (interfaceC3333z7 != null) {
                                    str26 = str13;
                                    ((A5) interfaceC3333z7).b(str26, "Unknown assetType ( null ) received in adResponse");
                                    c3177p21 = c3177p16;
                                    r18 = r11;
                                    c3177p15 = c3177p21;
                                    r17 = r18;
                                } else {
                                    c3177p15 = c3177p16;
                                    r17 = r11;
                                }
                                r4 = r17;
                                c3177p8 = c3177p15;
                                c3224s8 = c2984d8;
                                r2 = r4;
                                r14 = c3177p8;
                                if (c3224s8 != null) {
                                    c3224s8.b(bE);
                                    c3224s8.b(i3);
                                    c3224s8.a(i2);
                                    C2984d8.d(str4);
                                    if (str4.length() > 0) {
                                        map4.put(r2, str4);
                                    }
                                    if (r2.length() > 0) {
                                        map3.put(r2, c3224s8);
                                    }
                                    map = r14.f23888i;
                                    if (map == null) {
                                        map2 = r14.f23888i;
                                        if (map2 != null) {
                                            map2.put(str, CollectionsKt.i(c3224s8));
                                        }
                                    } else {
                                        map2 = r14.f23888i;
                                        if (map2 != null) {
                                            map2.put(str, CollectionsKt.i(c3224s8));
                                        }
                                    }
                                }
                                return c3224s8;
                            } catch (JSONException e21) {
                                e = e21;
                                c3177p19 = this;
                                i5 = iA;
                            }
                            break;
                        case 81665115:
                            C3177p8 c3177p28 = this;
                            Point point7 = point;
                            try {
                                if (str.equals(obj)) {
                                    HashMap map7 = c3177p28.f23888i;
                                    if (map7 != null) {
                                        try {
                                            arrayList4 = (ArrayList) map7.get(obj);
                                        } catch (JSONException e22) {
                                            e = e22;
                                            c3177p12 = c3177p28;
                                            obj2 = "p8";
                                            str9 = strF;
                                            i3 = iA;
                                            i2 = iA2;
                                            r1 = str9;
                                            r12 = c3177p12;
                                            r13 = obj2;
                                            interfaceC3333z5 = r12.f23890n;
                                            r4 = r1;
                                            c3177p8 = r12;
                                            if (interfaceC3333z5 != null) {
                                                ((A5) interfaceC3333z5).b(r13, E0.a(e, H6.a(r13, str5, "Exception while building assetTypes - ")));
                                                r4 = r1;
                                                c3177p8 = r12;
                                            }
                                            c3224s8 = c2984d8;
                                            r2 = r4;
                                            r14 = c3177p8;
                                        }
                                    } else {
                                        arrayList4 = null;
                                    }
                                    if (arrayList4 != null && (interfaceC3333z6 = c3177p28.f23890n) != null) {
                                        ((A5) interfaceC3333z6).b("p8", "One video asset already present! I will add this to the data model (for now) but ideally consider skipping this asset");
                                    }
                                    P8 p8A = c3177p28.a(jSONObjectI);
                                    int i10 = pointH.x;
                                    ?? r32 = pointH.y;
                                    C2951b9 c2951b9 = new C2951b9(i10, r32, point7.x, point7.y, pointB.x, pointB.y, pointA.x, pointA.y, p8A);
                                    Ve veA = c3177p28.f23889l;
                                    if (veA == null) {
                                        if (str3 == null) {
                                            str3 = "";
                                        }
                                        veA = c3177p28.a(jSONObject, str3, c2984d8M);
                                    }
                                    Ve ve = veA;
                                    try {
                                        try {
                                            try {
                                                if (c3177p28.o == 0) {
                                                    try {
                                                        if (c2984d8M != null) {
                                                            try {
                                                                Object obj10 = "p8";
                                                                Object obj11 = c2984d8M.a().get("didRequestFullScreen");
                                                                if (Intrinsics.a(obj11 instanceof Boolean ? (Boolean) obj11 : null, Boolean.TRUE) || c3177p28.s) {
                                                                    zOptBoolean2 = jSONObject.optBoolean("loop", false);
                                                                    boolean zOptBoolean7 = jSONObject.optBoolean("showProgress", true);
                                                                    zOptBoolean3 = jSONObject.optBoolean("soundOn", true);
                                                                    zOptBoolean4 = jSONObject.optBoolean("showMute", true);
                                                                    zOptBoolean5 = jSONObject.optBoolean(NativeAdvancedJsUtils.f34667l, true);
                                                                    iB = c2984d8M instanceof C2968c9 ? ((C2968c9) c2984d8M).b() : Integer.MAX_VALUE;
                                                                    dOptDouble = jSONObject.optDouble("pauseAfter", 0.0d);
                                                                    z2 = zOptBoolean7;
                                                                    obj6 = obj10;
                                                                } else {
                                                                    i6 = Integer.MAX_VALUE;
                                                                    i7 = 0;
                                                                    z3 = true;
                                                                    z4 = true;
                                                                    z5 = false;
                                                                    z6 = true;
                                                                    z7 = true;
                                                                    obj5 = obj10;
                                                                }
                                                                map5 = new HashMap();
                                                                if (!jSONObject.isNull("videoViewabilityConfig")) {
                                                                    try {
                                                                        jSONObject4 = jSONObject.getJSONObject("videoViewabilityConfig");
                                                                        itKeys = jSONObject4.keys();
                                                                        Intrinsics.c(itKeys);
                                                                        while (itKeys.hasNext()) {
                                                                            String next = itKeys.next();
                                                                            Object obj12 = jSONObject4.get(next);
                                                                            Intrinsics.c(next);
                                                                            Intrinsics.c(obj12);
                                                                            map5.put(next, obj12);
                                                                        }
                                                                    } catch (JSONException e23) {
                                                                        e = e23;
                                                                        str25 = r16;
                                                                        r31 = obj5;
                                                                        i3 = iA;
                                                                        str23 = str25;
                                                                        c3177p20 = c3177p28;
                                                                        r30 = r31;
                                                                        i2 = iA2;
                                                                        r13 = r30;
                                                                        r1 = str23;
                                                                        r12 = c3177p20;
                                                                        interfaceC3333z5 = r12.f23890n;
                                                                        r4 = r1;
                                                                        c3177p8 = r12;
                                                                        if (interfaceC3333z5 != null) {
                                                                            ((A5) interfaceC3333z5).b(r13, E0.a(e, H6.a(r13, str5, "Exception while building assetTypes - ")));
                                                                            r4 = r1;
                                                                            c3177p8 = r12;
                                                                        }
                                                                        c3224s8 = c2984d8;
                                                                        r2 = r4;
                                                                        r14 = c3177p8;
                                                                    }
                                                                }
                                                                adConfig = c3177p28.m;
                                                                if (adConfig != null || (rendering = adConfig.getRendering()) == null) {
                                                                    enablePubMuteControl = false;
                                                                    i8 = Integer.MAX_VALUE;
                                                                } else {
                                                                    enablePubMuteControl = rendering.getEnablePubMuteControl();
                                                                    i8 = Integer.MAX_VALUE;
                                                                }
                                                                c2968c9 = new C2968c9(strF, strG, c2951b9, ve, z3, z4, z5, z6, z7, arrayListJ, enablePubMuteControl);
                                                                str24 = r16;
                                                                c2968c9.a(map5);
                                                                if (i6 <= 0) {
                                                                    i6 = i8;
                                                                }
                                                                c2968c9.c(i6);
                                                                c2968c9.c(str2);
                                                                c2968c9.f23523w = c2984d8M;
                                                                if (c2984d8M == null) {
                                                                    c2984d8M.f23523w = c2968c9;
                                                                }
                                                                if (i7 != 0) {
                                                                    c2968c9.d(i7);
                                                                }
                                                                r14 = c3177p28;
                                                                c3224s8 = c2968c9;
                                                                r2 = str24;
                                                                i3 = iA;
                                                                i2 = iA2;
                                                            } catch (JSONException e24) {
                                                                e = e24;
                                                                r32 = "p8";
                                                                str25 = strF;
                                                                r31 = r32;
                                                                i3 = iA;
                                                                str23 = str25;
                                                                c3177p20 = c3177p28;
                                                                r30 = r31;
                                                                i2 = iA2;
                                                                r13 = r30;
                                                                r1 = str23;
                                                                r12 = c3177p20;
                                                                interfaceC3333z5 = r12.f23890n;
                                                                r4 = r1;
                                                                c3177p8 = r12;
                                                                if (interfaceC3333z5 != null) {
                                                                    ((A5) interfaceC3333z5).b(r13, E0.a(e, H6.a(r13, str5, "Exception while building assetTypes - ")));
                                                                    r4 = r1;
                                                                    c3177p8 = r12;
                                                                }
                                                                c3224s8 = c2984d8;
                                                                r2 = r4;
                                                                r14 = c3177p8;
                                                                if (c3224s8 != null) {
                                                                    c3224s8.b(bE);
                                                                    c3224s8.b(i3);
                                                                    c3224s8.a(i2);
                                                                    C2984d8.d(str4);
                                                                    if (str4.length() > 0) {
                                                                        map4.put(r2, str4);
                                                                    }
                                                                    if (r2.length() > 0) {
                                                                        map3.put(r2, c3224s8);
                                                                    }
                                                                    map = r14.f23888i;
                                                                    if (map == null) {
                                                                        map2 = r14.f23888i;
                                                                        if (map2 != null) {
                                                                            map2.put(str, CollectionsKt.i(c3224s8));
                                                                        }
                                                                    } else {
                                                                        map2 = r14.f23888i;
                                                                        if (map2 != null) {
                                                                            map2.put(str, CollectionsKt.i(c3224s8));
                                                                        }
                                                                    }
                                                                }
                                                                return c3224s8;
                                                            }
                                                        } else {
                                                            obj6 = "p8";
                                                            zOptBoolean2 = jSONObject.optBoolean("loop", true);
                                                            boolean zOptBoolean8 = jSONObject.optBoolean("showProgress", false);
                                                            boolean zOptBoolean9 = jSONObject.optBoolean("soundOn", false);
                                                            zOptBoolean4 = jSONObject.optBoolean("showMute", false);
                                                            zOptBoolean5 = jSONObject.optBoolean(NativeAdvancedJsUtils.f34667l, true);
                                                            int iOptInt = jSONObject.optInt("completeAfter", Integer.MAX_VALUE);
                                                            dOptDouble = jSONObject.optDouble("pauseAfter", 0.0d);
                                                            z2 = zOptBoolean8;
                                                            zOptBoolean3 = zOptBoolean9;
                                                            iB = iOptInt;
                                                        }
                                                        obj7 = obj6;
                                                    } catch (JSONException e25) {
                                                        e = e25;
                                                    }
                                                    break;
                                                } else {
                                                    obj5 = "p8";
                                                    try {
                                                        zOptBoolean2 = jSONObject.optBoolean("loop", false);
                                                        boolean zOptBoolean10 = jSONObject.optBoolean("showProgress", true);
                                                        zOptBoolean3 = jSONObject.optBoolean("soundOn", true);
                                                        zOptBoolean4 = jSONObject.optBoolean("showMute", true);
                                                        zOptBoolean5 = jSONObject.optBoolean(NativeAdvancedJsUtils.f34667l, true);
                                                        z2 = zOptBoolean10;
                                                        iB = jSONObject.optInt("completeAfter", Integer.MAX_VALUE);
                                                        dOptDouble = jSONObject.optDouble("pauseAfter", 0.0d);
                                                        obj7 = obj5;
                                                    } catch (JSONException e26) {
                                                        e = e26;
                                                        str24 = strF;
                                                        str25 = str24;
                                                        r31 = obj5;
                                                        i3 = iA;
                                                        str23 = str25;
                                                        c3177p20 = c3177p28;
                                                        r30 = r31;
                                                        i2 = iA2;
                                                        r13 = r30;
                                                        r1 = str23;
                                                        r12 = c3177p20;
                                                        interfaceC3333z5 = r12.f23890n;
                                                        r4 = r1;
                                                        c3177p8 = r12;
                                                        if (interfaceC3333z5 != null) {
                                                            ((A5) interfaceC3333z5).b(r13, E0.a(e, H6.a(r13, str5, "Exception while building assetTypes - ")));
                                                            r4 = r1;
                                                            c3177p8 = r12;
                                                        }
                                                        c3224s8 = c2984d8;
                                                        r2 = r4;
                                                        r14 = c3177p8;
                                                        if (c3224s8 != null) {
                                                            c3224s8.b(bE);
                                                            c3224s8.b(i3);
                                                            c3224s8.a(i2);
                                                            C2984d8.d(str4);
                                                            if (str4.length() > 0) {
                                                                map4.put(r2, str4);
                                                            }
                                                            if (r2.length() > 0) {
                                                                map3.put(r2, c3224s8);
                                                            }
                                                            map = r14.f23888i;
                                                            if (map == null) {
                                                                map2 = r14.f23888i;
                                                                if (map2 != null) {
                                                                    map2.put(str, CollectionsKt.i(c3224s8));
                                                                }
                                                            } else {
                                                                map2 = r14.f23888i;
                                                                if (map2 != null) {
                                                                    map2.put(str, CollectionsKt.i(c3224s8));
                                                                }
                                                            }
                                                        }
                                                        return c3224s8;
                                                    }
                                                }
                                                c2968c9.a(map5);
                                                if (i6 <= 0) {
                                                    i6 = i8;
                                                }
                                                c2968c9.c(i6);
                                                c2968c9.c(str2);
                                                c2968c9.f23523w = c2984d8M;
                                                if (c2984d8M == null) {
                                                    c2984d8M.f23523w = c2968c9;
                                                }
                                                if (i7 != 0) {
                                                    c2968c9.d(i7);
                                                }
                                                r14 = c3177p28;
                                                c3224s8 = c2968c9;
                                                r2 = str24;
                                                i3 = iA;
                                                i2 = iA2;
                                            } catch (JSONException e27) {
                                                e = e27;
                                                str25 = str24;
                                                r31 = obj5;
                                                i3 = iA;
                                                str23 = str25;
                                                c3177p20 = c3177p28;
                                                r30 = r31;
                                                i2 = iA2;
                                                r13 = r30;
                                                r1 = str23;
                                                r12 = c3177p20;
                                                interfaceC3333z5 = r12.f23890n;
                                                r4 = r1;
                                                c3177p8 = r12;
                                                if (interfaceC3333z5 != null) {
                                                    ((A5) interfaceC3333z5).b(r13, E0.a(e, H6.a(r13, str5, "Exception while building assetTypes - ")));
                                                    r4 = r1;
                                                    c3177p8 = r12;
                                                }
                                                c3224s8 = c2984d8;
                                                r2 = r4;
                                                r14 = c3177p8;
                                            }
                                            c2968c9 = new C2968c9(strF, strG, c2951b9, ve, z3, z4, z5, z6, z7, arrayListJ, enablePubMuteControl);
                                            str24 = r16;
                                        } catch (JSONException e28) {
                                            e = e28;
                                            str24 = r16;
                                        }
                                        map5 = new HashMap();
                                        if (!jSONObject.isNull("videoViewabilityConfig")) {
                                            jSONObject4 = jSONObject.getJSONObject("videoViewabilityConfig");
                                            itKeys = jSONObject4.keys();
                                            Intrinsics.c(itKeys);
                                            while (itKeys.hasNext()) {
                                                String next2 = itKeys.next();
                                                Object obj13 = jSONObject4.get(next2);
                                                Intrinsics.c(next2);
                                                Intrinsics.c(obj13);
                                                map5.put(next2, obj13);
                                            }
                                        }
                                        adConfig = c3177p28.m;
                                        if (adConfig != null) {
                                            enablePubMuteControl = false;
                                            i8 = Integer.MAX_VALUE;
                                        } else {
                                            enablePubMuteControl = false;
                                            i8 = Integer.MAX_VALUE;
                                        }
                                    } catch (JSONException e29) {
                                        e = e29;
                                    }
                                    i7 = (int) dOptDouble;
                                    z6 = z2;
                                    z7 = zOptBoolean5;
                                    z5 = zOptBoolean2;
                                    z4 = zOptBoolean4;
                                    z3 = zOptBoolean3;
                                    i6 = iB;
                                    obj5 = obj7;
                                } else {
                                    c3177p16 = c3177p28;
                                    str13 = "p8";
                                    r11 = strF;
                                    str5 = str5;
                                    i3 = iA;
                                    i2 = iA2;
                                    interfaceC3333z7 = c3177p16.f23890n;
                                    if (interfaceC3333z7 != null) {
                                        str26 = str13;
                                        ((A5) interfaceC3333z7).b(str26, "Unknown assetType ( null ) received in adResponse");
                                        c3177p21 = c3177p16;
                                        r18 = r11;
                                        c3177p15 = c3177p21;
                                        r17 = r18;
                                    } else {
                                        c3177p15 = c3177p16;
                                        r17 = r11;
                                    }
                                    r4 = r17;
                                    c3177p8 = c3177p15;
                                    c3224s8 = c2984d8;
                                    r2 = r4;
                                    r14 = c3177p8;
                                }
                                break;
                            } catch (JSONException e30) {
                                e = e30;
                                obj5 = "p8";
                            }
                            if (c3224s8 != null) {
                                c3224s8.b(bE);
                                c3224s8.b(i3);
                                c3224s8.a(i2);
                                C2984d8.d(str4);
                                if (str4.length() > 0) {
                                    map4.put(r2, str4);
                                }
                                if (r2.length() > 0) {
                                    map3.put(r2, c3224s8);
                                }
                                map = r14.f23888i;
                                if (map == null) {
                                    map2 = r14.f23888i;
                                    if (map2 != null) {
                                        map2.put(str, CollectionsKt.i(c3224s8));
                                    }
                                } else {
                                    map2 = r14.f23888i;
                                    if (map2 != null) {
                                        map2.put(str, CollectionsKt.i(c3224s8));
                                    }
                                }
                            }
                            return c3224s8;
                        case 1942407129:
                            try {
                                if (str.equals("WEBVIEW")) {
                                    if (str3 == null) {
                                        return null;
                                    }
                                    String strA = E9.a(p(jSONObject));
                                    try {
                                        if ("URL".equals(strA)) {
                                            try {
                                                if (!URLUtil.isValidUrl(str3)) {
                                                    return null;
                                                }
                                            } catch (JSONException e31) {
                                                e = e31;
                                                c3177p10 = this;
                                                arrayList2 = strF;
                                                i3 = iA;
                                                i2 = iA2;
                                                r13 = "p8";
                                                r1 = arrayList2;
                                                r12 = c3177p10;
                                                interfaceC3333z5 = r12.f23890n;
                                                r4 = r1;
                                                c3177p8 = r12;
                                                if (interfaceC3333z5 != null) {
                                                    ((A5) interfaceC3333z5).b(r13, E0.a(e, H6.a(r13, str5, "Exception while building assetTypes - ")));
                                                    r4 = r1;
                                                    c3177p8 = r12;
                                                }
                                            }
                                        }
                                        try {
                                            C3001e8 c3001e8A4 = a(pointH, point, pointB, pointA, jSONObjectI);
                                            c3177p11 = this;
                                            try {
                                                str8 = strF;
                                                i4 = iA;
                                                try {
                                                    F9 f9 = new F9(str8, strG, c3001e8A4, str3, jSONObject.optBoolean("isScrollable"));
                                                    f9.e(strA);
                                                    f9.c(str2);
                                                    if (jSONObject.optBoolean("preload", false)) {
                                                        f9.b();
                                                        c3177p11.r = f9;
                                                    }
                                                    c3177p13 = c3177p11;
                                                    i3 = i4;
                                                    c2984d8 = f9;
                                                    str10 = str8;
                                                    i2 = iA2;
                                                    r4 = str10;
                                                    c3177p8 = c3177p13;
                                                } catch (JSONException e32) {
                                                    e = e32;
                                                    c3177p12 = c3177p11;
                                                    i3 = i4;
                                                    obj2 = "p8";
                                                    str9 = str8;
                                                    i2 = iA2;
                                                    r1 = str9;
                                                    r12 = c3177p12;
                                                    r13 = obj2;
                                                    interfaceC3333z5 = r12.f23890n;
                                                    r4 = r1;
                                                    c3177p8 = r12;
                                                    if (interfaceC3333z5 != null) {
                                                        ((A5) interfaceC3333z5).b(r13, E0.a(e, H6.a(r13, str5, "Exception while building assetTypes - ")));
                                                        r4 = r1;
                                                        c3177p8 = r12;
                                                    }
                                                }
                                            } catch (JSONException e33) {
                                                e = e33;
                                                str8 = strF;
                                                i4 = iA;
                                            }
                                        } catch (JSONException e34) {
                                            e = e34;
                                            c3177p11 = this;
                                        }
                                        break;
                                    } catch (JSONException e35) {
                                        e = e35;
                                        c3177p11 = this;
                                    }
                                    c3224s8 = c2984d8;
                                    r2 = r4;
                                    r14 = c3177p8;
                                    if (c3224s8 != null) {
                                        c3224s8.b(bE);
                                        c3224s8.b(i3);
                                        c3224s8.a(i2);
                                        C2984d8.d(str4);
                                        if (str4.length() > 0) {
                                            map4.put(r2, str4);
                                        }
                                        if (r2.length() > 0) {
                                            map3.put(r2, c3224s8);
                                        }
                                        map = r14.f23888i;
                                        if (map == null) {
                                            map2 = r14.f23888i;
                                            if (map2 != null) {
                                                map2.put(str, CollectionsKt.i(c3224s8));
                                            }
                                        } else {
                                            map2 = r14.f23888i;
                                            if (map2 != null) {
                                                map2.put(str, CollectionsKt.i(c3224s8));
                                            }
                                        }
                                    }
                                    return c3224s8;
                                }
                                break;
                            } catch (JSONException e36) {
                                e = e36;
                                c3177p11 = this;
                            }
                            str8 = strF;
                            i4 = iA;
                            c3177p12 = c3177p11;
                            i3 = i4;
                            obj2 = "p8";
                            str9 = str8;
                            i2 = iA2;
                            r1 = str9;
                            r12 = c3177p12;
                            r13 = obj2;
                            interfaceC3333z5 = r12.f23890n;
                            r4 = r1;
                            c3177p8 = r12;
                            if (interfaceC3333z5 != null) {
                                ((A5) interfaceC3333z5).b(r13, E0.a(e, H6.a(r13, str5, "Exception while building assetTypes - ")));
                                r4 = r1;
                                c3177p8 = r12;
                            }
                            c3224s8 = c2984d8;
                            r2 = r4;
                            r14 = c3177p8;
                            if (c3224s8 != null) {
                                c3224s8.b(bE);
                                c3224s8.b(i3);
                                c3224s8.a(i2);
                                C2984d8.d(str4);
                                if (str4.length() > 0) {
                                    map4.put(r2, str4);
                                }
                                if (r2.length() > 0) {
                                    map3.put(r2, c3224s8);
                                }
                                map = r14.f23888i;
                                if (map == null) {
                                    map2 = r14.f23888i;
                                    if (map2 != null) {
                                        map2.put(str, CollectionsKt.i(c3224s8));
                                    }
                                } else {
                                    map2 = r14.f23888i;
                                    if (map2 != null) {
                                        map2.put(str, CollectionsKt.i(c3224s8));
                                    }
                                }
                            }
                            return c3224s8;
                        default:
                            c3177p22 = this;
                            str22 = strF;
                            i3 = iA;
                            i2 = iA2;
                            str13 = "p8";
                            c3177p16 = c3177p22;
                            r11 = str22;
                            interfaceC3333z7 = c3177p16.f23890n;
                            if (interfaceC3333z7 != null) {
                                str26 = str13;
                                ((A5) interfaceC3333z7).b(str26, "Unknown assetType ( null ) received in adResponse");
                                c3177p21 = c3177p16;
                                r18 = r11;
                                c3177p15 = c3177p21;
                                r17 = r18;
                            } else {
                                c3177p15 = c3177p16;
                                r17 = r11;
                            }
                            r4 = r17;
                            c3177p8 = c3177p15;
                            c3224s8 = c2984d8;
                            r2 = r4;
                            r14 = c3177p8;
                            if (c3224s8 != null) {
                                c3224s8.b(bE);
                                c3224s8.b(i3);
                                c3224s8.a(i2);
                                C2984d8.d(str4);
                                if (str4.length() > 0) {
                                    map4.put(r2, str4);
                                }
                                if (r2.length() > 0) {
                                    map3.put(r2, c3224s8);
                                }
                                map = r14.f23888i;
                                if (map == null) {
                                    map2 = r14.f23888i;
                                    if (map2 != null) {
                                        map2.put(str, CollectionsKt.i(c3224s8));
                                    }
                                } else {
                                    map2 = r14.f23888i;
                                    if (map2 != null) {
                                        map2.put(str, CollectionsKt.i(c3224s8));
                                    }
                                }
                            }
                            return c3224s8;
                    }
                } catch (JSONException e37) {
                    e = e37;
                }
            } catch (JSONException e38) {
                e = e38;
                c3177p9 = this;
                arrayList3 = arrayListJ;
            }
        } catch (JSONException e39) {
            e = e39;
            r12 = this;
            str4 = strD;
            str5 = "TAG";
            i2 = iA2;
            r1 = strF;
            i3 = iA;
            r13 = str28;
        }
    }

    public final void b(C2984d8 c2984d8, JSONObject jSONObject) throws JSONException {
        String string;
        String string2 = "";
        boolean z2 = false;
        if (jSONObject.isNull("assetOnclick")) {
            string = "";
        } else {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("assetOnclick");
            if (jSONObjectOptJSONObject != null && !jSONObjectOptJSONObject.isNull("itemUrl")) {
                string = jSONObject.getJSONObject("assetOnclick").getString("itemUrl");
                Intrinsics.e(string, "getString(...)");
                z2 = true;
            } else {
                InterfaceC3333z5 interfaceC3333z5 = this.f23890n;
                if (interfaceC3333z5 != null) {
                    ((A5) interfaceC3333z5).b("p8", "Missing itemUrl on asset " + jSONObject);
                }
                string = "";
            }
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("assetOnclick");
            if (jSONObjectOptJSONObject2 == null || !jSONObjectOptJSONObject2.isNull("action")) {
                string2 = jSONObject.getJSONObject("assetOnclick").getString("action");
                Intrinsics.e(string2, "getString(...)");
                z2 = true;
            }
        }
        c2984d8.b(string);
        c2984d8.f23517h = string2;
        c2984d8.f = z2;
    }

    public final Point b(JSONObject jSONObject, Point point) {
        try {
            JSONObject jSONObjectI = i(jSONObject);
            if (!jSONObjectI.isNull("finalGeometry")) {
                JSONArray jSONArray = jSONObjectI.getJSONArray("finalGeometry");
                Point point2 = new Point();
                point2.x = a(jSONArray.getInt(0));
                point2.y = a(jSONArray.getInt(1));
                return point2;
            }
        } catch (JSONException unused) {
        }
        return point;
    }

    public final Point b(JSONObject jSONObject) {
        Point point = new Point();
        try {
            JSONObject jSONObjectI = i(jSONObject);
            if (!jSONObjectI.isNull("geometry")) {
                JSONArray jSONArray = jSONObjectI.getJSONArray("geometry");
                point.x = a(jSONArray.getInt(2));
                point.y = a(jSONArray.getInt(3));
                return point;
            }
        } catch (JSONException e2) {
            InterfaceC3333z5 interfaceC3333z5 = this.f23890n;
            if (interfaceC3333z5 != null) {
                ((A5) interfaceC3333z5).b("p8", E0.a(e2, H6.a("p8", "TAG", "Exception while getting assetDimensions - ")));
            }
        }
        return point;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:35:0x0076 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:36:0x0077 A[RETURN] */
    public static String b(String str) {
        Locale US = Locale.US;
        Intrinsics.e(US, "US");
        String upperCase = str.toUpperCase(US);
        Intrinsics.e(upperCase, "this as java.lang.String).toUpperCase(locale)");
        int length = upperCase.length() - 1;
        int i2 = 0;
        boolean z2 = false;
        while (i2 <= length) {
            boolean z3 = Intrinsics.h(upperCase.charAt(!z2 ? i2 : length), 32) <= 0;
            if (z2) {
                if (!z3) {
                    break;
                }
                length--;
            } else if (z3) {
                i2++;
            } else {
                z2 = true;
            }
        }
        String strA = I7.a(length, 1, upperCase, i2);
        switch (strA) {
            case "DOWNLOAD":
            case "EXTERNAL":
            case "INAPP":
            case "DEEPLINK":
            case "EMBEDDED":
                return strA;
            default:
                return "EXTERNAL";
        }
    }

    public final C3097k8 b(Point point, Point point2, Point point3, Point point4, JSONObject jSONObject) throws JSONException {
        JSONObject jSONObjectOptJSONObject;
        String str;
        String str2;
        String strA;
        String str3;
        String str4;
        String str5;
        int i2;
        String strA2;
        int i3;
        int length;
        String strD = "straight";
        String strA3 = "#ff000000";
        if (jSONObject.isNull("border") || (jSONObjectOptJSONObject = jSONObject.optJSONObject("border")) == null || jSONObjectOptJSONObject.isNull("style")) {
            str5 = "straight";
            str3 = "#ff000000";
            str4 = "none";
        } else {
            String string = jSONObjectOptJSONObject.getString("style");
            Intrinsics.e(string, "getString(...)");
            String strE = e(string);
            if (!jSONObjectOptJSONObject.isNull("corner")) {
                String string2 = jSONObjectOptJSONObject.getString("corner");
                Intrinsics.e(string2, "getString(...)");
                strD = d(string2);
            }
            if (jSONObjectOptJSONObject.isNull("color")) {
                str = strE;
                str2 = strD;
                strA = "#ff000000";
            } else {
                String string3 = jSONObjectOptJSONObject.getString("color");
                Intrinsics.e(string3, "getString(...)");
                int length2 = string3.length() - 1;
                int i4 = 0;
                boolean z2 = false;
                while (true) {
                    str = strE;
                    if (i4 > length2) {
                        str2 = strD;
                        break;
                    }
                    str2 = strD;
                    boolean z3 = Intrinsics.h(string3.charAt(!z2 ? i4 : length2), 32) <= 0;
                    if (z2) {
                        if (!z3) {
                            break;
                        }
                        length2--;
                    } else if (z3) {
                        i4++;
                    } else {
                        z2 = true;
                    }
                    strE = str;
                    strD = str2;
                }
                strA = I7.a(length2, 1, string3, i4);
            }
            str3 = strA;
            str4 = str;
            str5 = str2;
        }
        if (jSONObject.isNull(TtmlNode.ATTR_TTS_BACKGROUND_COLOR)) {
            strA2 = "#00000000";
        } else {
            String string4 = jSONObject.getString(TtmlNode.ATTR_TTS_BACKGROUND_COLOR);
            Intrinsics.e(string4, "getString(...)");
            int length3 = string4.length() - 1;
            boolean z4 = false;
            int i5 = 0;
            while (true) {
                if (i5 > length3) {
                    i2 = 1;
                    break;
                }
                boolean z5 = z4;
                boolean z6 = Intrinsics.h(string4.charAt(!z4 ? i5 : length3), 32) <= 0;
                if (z5) {
                    i2 = 1;
                    if (!z6) {
                        break;
                    }
                    length3--;
                } else if (z6) {
                    i5++;
                } else {
                    z4 = true;
                }
                z4 = z5;
            }
            strA2 = I7.a(length3, i2, string4, i5);
        }
        String str6 = strA2;
        JSONObject jSONObject2 = jSONObject.getJSONObject("text");
        try {
            String string5 = jSONObject2.getString("size");
            Intrinsics.e(string5, "getString(...)");
            int i6 = (int) Double.parseDouble(string5);
            if (jSONObject2.isNull("color")) {
                i6 = i6;
            } else {
                String string6 = jSONObject2.getString("color");
                Intrinsics.e(string6, "getString(...)");
                int length4 = string6.length() - 1;
                boolean z7 = false;
                int i7 = 0;
                while (true) {
                    if (i7 > length4) {
                        i6 = i6;
                        i3 = 1;
                        break;
                    }
                    i6 = i6;
                    boolean z8 = Intrinsics.h(string6.charAt(!z7 ? i7 : length4), 32) <= 0;
                    if (z7) {
                        i3 = 1;
                        if (!z8) {
                            break;
                        }
                        length4--;
                    } else if (z8) {
                        i7++;
                    } else {
                        z7 = true;
                    }
                }
                strA3 = I7.a(length4, i3, string6, i7);
            }
            String str7 = strA3;
            ArrayList arrayList = new ArrayList();
            if (jSONObject2.isNull("style") || (length = jSONObject2.getJSONArray("style").length()) == 0) {
                arrayList.add("none");
            } else {
                for (int i8 = 0; i8 < length; i8++) {
                    String string7 = jSONObject2.getJSONArray("style").getString(i8);
                    Intrinsics.e(string7, "getString(...)");
                    arrayList.add(j(string7));
                }
            }
            return new C3097k8(point.x, point.y, point2.x, point2.y, point3.x, point3.y, point4.x, point4.y, str4, str5, str3, str6, i6, str7, arrayList, new P8(q(jSONObject.optJSONObject("startOffset")), q(jSONObject.optJSONObject("timerDuration"))));
        } catch (NumberFormatException e2) {
            InterfaceC3333z5 interfaceC3333z5 = this.f23890n;
            if (interfaceC3333z5 != null) {
                ((A5) interfaceC3333z5).b("p8", "Failure in building text asset! Text size should be an integer");
            }
            JSONException jSONException = new JSONException(e2.getMessage());
            S5 s5 = S5.f23167a;
            S5.d.a(new C3011f2(e2));
            throw jSONException;
        }
    }

    public final void a(C2984d8 c2984d8, JSONObject jSONObject) throws JSONException {
        String string;
        boolean z2;
        boolean z3 = true;
        String string2 = "";
        if (jSONObject.isNull("itemUrl")) {
            InterfaceC3333z5 interfaceC3333z5 = this.f23890n;
            if (interfaceC3333z5 != null) {
                ((A5) interfaceC3333z5).b("p8", "Missing itemUrl on publisher onClick");
            }
            z2 = false;
            string = "";
        } else {
            string = jSONObject.getString("itemUrl");
            Intrinsics.e(string, "getString(...)");
            z2 = true;
        }
        if (jSONObject.isNull("action")) {
            z3 = z2;
        } else {
            string2 = jSONObject.getString("action");
            Intrinsics.e(string2, "getString(...)");
        }
        c2984d8.b(string);
        String strOptString = jSONObject.optString("fallbackUrl");
        Intrinsics.e(strOptString, "optString(...)");
        c2984d8.a(strOptString);
        c2984d8.f23517h = string2;
        c2984d8.f = z3;
        c2984d8.f23522u = jSONObject.optString("appBundleId");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final boolean a(String str, JSONObject jSONObject) {
        if (!jSONObject.isNull("geometry")) {
            try {
                JSONArray jSONArray = jSONObject.getJSONArray("geometry");
                Intrinsics.c(jSONArray);
                try {
                    int i2 = jSONArray.getInt(2);
                    int i3 = jSONArray.getInt(3);
                    if (i2 > 0 && i3 > 0) {
                        switch (str.hashCode()) {
                            case -1919329183:
                                if (str.equals("CONTAINER")) {
                                    return true;
                                }
                                break;
                            case 67056:
                                if (!str.equals("CTA")) {
                                }
                                break;
                            case 70564:
                                if (str.equals("GIF")) {
                                    return true;
                                }
                                break;
                            case 2241657:
                                if (str.equals("ICON")) {
                                    return true;
                                }
                                break;
                            case 2571565:
                                if (!str.equals(AdPreferences.TYPE_TEXT)) {
                                }
                                break;
                            case 69775675:
                                if (str.equals("IMAGE")) {
                                    return true;
                                }
                                break;
                            case 79826725:
                                if (str.equals("TIMER")) {
                                    return true;
                                }
                                break;
                            case 81665115:
                                if (str.equals("VIDEO")) {
                                    return true;
                                }
                                break;
                            case 1942407129:
                                if (str.equals("WEBVIEW")) {
                                    return true;
                                }
                                break;
                            default:
                                break;
                        }
                        if (jSONObject.isNull("text")) {
                            return false;
                        }
                        try {
                            String string = jSONObject.getJSONObject("text").getString("size");
                            Intrinsics.e(string, "getString(...)");
                            if (((int) Double.parseDouble(string)) > 0) {
                                return true;
                            }
                        } catch (NumberFormatException e2) {
                            InterfaceC3333z5 interfaceC3333z5 = this.f23890n;
                            if (interfaceC3333z5 != null) {
                                ((A5) interfaceC3333z5).b("p8", "Failure in validating text asset! Text size should be an integer");
                            }
                            S5 s5 = S5.f23167a;
                            S5.d.a(new C3011f2(e2));
                            return false;
                        }
                    }
                } catch (JSONException e3) {
                    InterfaceC3333z5 interfaceC3333z6 = this.f23890n;
                    if (interfaceC3333z6 != null) {
                        ((A5) interfaceC3333z6).b("p8", "Exception while getting geometry - " + e3.getMessage());
                    }
                }
                return false;
            } catch (JSONException e4) {
                InterfaceC3333z5 interfaceC3333z7 = this.f23890n;
                if (interfaceC3333z7 != null) {
                    ((A5) interfaceC3333z7).b("p8", E0.a(e4, H6.a("p8", "TAG", "Exception while getting assetStyle - ")));
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:57:0x00cc A[PHI: r12
  0x00cc: PHI (r12v18 java.lang.String) = 
  (r12v2 java.lang.String)
  (r12v3 java.lang.String)
  (r12v4 java.lang.String)
  (r12v5 java.lang.String)
  (r12v6 java.lang.String)
  (r12v7 java.lang.String)
  (r12v8 java.lang.String)
  (r12v9 java.lang.String)
  (r12v10 java.lang.String)
  (r12v11 java.lang.String)
  (r12v12 java.lang.String)
  (r12v13 java.lang.String)
  (r12v14 java.lang.String)
  (r12v15 java.lang.String)
  (r12v16 java.lang.String)
  (r12v17 java.lang.String)
  (r12v19 java.lang.String)
 binds: [B:113:0x017c, B:110:0x0173, B:107:0x016a, B:104:0x0161, B:101:0x0158, B:97:0x014a, B:94:0x0141, B:91:0x0138, B:88:0x012f, B:85:0x0126, B:82:0x011d, B:75:0x0108, B:72:0x00fe, B:65:0x00e9, B:62:0x00df, B:59:0x00d5, B:55:0x00c8] A[DONT_GENERATE, DONT_INLINE]] */
    public final U8 a(int i2, String str, JSONObject jSONObject) throws JSONException {
        String strA;
        String str2;
        int i3 = 0;
        if (jSONObject.isNull("url")) {
            strA = "";
        } else {
            String string = jSONObject.getString("url");
            Intrinsics.e(string, "getString(...)");
            int length = string.length() - 1;
            int i4 = 0;
            boolean z2 = false;
            while (i4 <= length) {
                boolean z3 = Intrinsics.h(string.charAt(!z2 ? i4 : length), 32) <= 0;
                if (z2) {
                    if (!z3) {
                        break;
                    }
                    length--;
                } else if (z3) {
                    i4++;
                } else {
                    z2 = true;
                }
            }
            strA = I7.a(length, 1, string, i4);
        }
        HashMap map = new HashMap();
        if ("VideoImpression".equals(str)) {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("events");
            if ((strA.length() == 0 || ((StringsKt.M(strA, "http", false) && !URLUtil.isValidUrl(strA)) || !StringsKt.M(strA, "http", false))) && jSONArrayOptJSONArray == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            if (jSONArrayOptJSONArray != null) {
                int length2 = jSONArrayOptJSONArray.length();
                while (i3 < length2) {
                    String string2 = jSONArrayOptJSONArray.getString(i3);
                    int i5 = i3;
                    String str3 = "unknown";
                    if (!TextUtils.isEmpty(string2) && string2 != null) {
                        switch (string2.hashCode()) {
                            case -1638835128:
                                str2 = "midpoint";
                                if (string2.equals("midpoint")) {
                                    str3 = str2;
                                }
                                break;
                            case -1337830390:
                                str2 = "thirdQuartile";
                                if (string2.equals("thirdQuartile")) {
                                    str3 = str2;
                                }
                                break;
                            case -934426579:
                                str2 = "resume";
                                if (string2.equals("resume")) {
                                    str3 = str2;
                                }
                                break;
                            case -840405966:
                                str2 = "unmute";
                                if (string2.equals("unmute")) {
                                    str3 = str2;
                                }
                                break;
                            case -599445191:
                                str2 = "complete";
                                if (string2.equals("complete")) {
                                    str3 = str2;
                                }
                                break;
                            case -284840886:
                                string2.equals("unknown");
                                break;
                            case -174104201:
                                str2 = "client_fill";
                                if (string2.equals("client_fill")) {
                                    str3 = str2;
                                }
                                break;
                            case 3327206:
                                str2 = "load";
                                if (string2.equals("load")) {
                                    str3 = str2;
                                }
                                break;
                            case 3363353:
                                str2 = "mute";
                                if (string2.equals("mute")) {
                                    str3 = str2;
                                }
                                break;
                            case 94750088:
                                str2 = "click";
                                if (string2.equals("click")) {
                                    str3 = str2;
                                }
                                break;
                            case 96784904:
                                str2 = "error";
                                if (string2.equals("error")) {
                                    str3 = str2;
                                }
                                break;
                            case 106440182:
                                str2 = "pause";
                                if (string2.equals("pause")) {
                                    str3 = str2;
                                }
                                break;
                            case 109757538:
                                if (string2.equals("start")) {
                                    str3 = "start";
                                }
                                break;
                            case 110066619:
                                str2 = Constants.TEMPLATE_TYPE_FULLSCREEN;
                                if (string2.equals(Constants.TEMPLATE_TYPE_FULLSCREEN)) {
                                    str3 = str2;
                                }
                                break;
                            case 113951609:
                                str2 = "exitFullscreen";
                                if (string2.equals("exitFullscreen")) {
                                    str3 = str2;
                                }
                                break;
                            case 354294980:
                                if (string2.equals("VideoImpression")) {
                                    str3 = "VideoImpression";
                                }
                                break;
                            case 368426751:
                                str2 = "OMID_VIEWABILITY";
                                if (string2.equals("OMID_VIEWABILITY")) {
                                    str3 = str2;
                                }
                                break;
                            case 560220243:
                                str2 = "firstQuartile";
                                if (string2.equals("firstQuartile")) {
                                    str3 = str2;
                                }
                                break;
                            case 883937877:
                                str2 = "page_view";
                                if (string2.equals("page_view")) {
                                    str3 = str2;
                                }
                                break;
                            case 1342121331:
                                str2 = "closeEndCard";
                                if (string2.equals("closeEndCard")) {
                                    str3 = str2;
                                }
                                break;
                            case 1778167540:
                                if (string2.equals("creativeView")) {
                                    str3 = "creativeView";
                                }
                                break;
                            case 2114088489:
                                if (string2.equals("Impression")) {
                                    str3 = "Impression";
                                }
                                break;
                        }
                    }
                    if ("creativeView".equals(str3) || "start".equals(str3) || "Impression".equals(str3)) {
                        arrayList.add(str3);
                    }
                    i3 = i5 + 1;
                }
            }
            map.put("referencedEvents", arrayList);
        } else if (!URLUtil.isValidUrl(strA)) {
            return null;
        }
        HashMap map2 = new HashMap();
        try {
            if (!jSONObject.isNull("params")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("params");
                Iterator<String> itKeys = jSONObject2.keys();
                Intrinsics.c(itKeys);
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    Intrinsics.c(next);
                    String string3 = jSONObject2.getString(next);
                    Intrinsics.e(string3, "getString(...)");
                    map2.put(next, string3);
                }
            }
        } catch (JSONException e2) {
            InterfaceC3333z5 interfaceC3333z5 = this.f23890n;
            if (interfaceC3333z5 != null) {
                ((A5) interfaceC3333z5).a("p8", "Failed to parser tracker.params", e2);
            }
        }
        U8 u8 = new U8(strA, i2, str, map2);
        u8.f23267e = new HashMap(map);
        return u8;
    }

    public final Ve a(JSONObject jSONObject, String str, C2984d8 c2984d8) {
        AdConfig.VastVideoConfig vastVideo;
        if (StringsKt.r(k(jSONObject), "VIDEO", true)) {
            try {
                if (!jSONObject.isNull("assetValue")) {
                    if (c2984d8 instanceof C2968c9) {
                        Object obj = ((C2968c9) c2984d8).f23516e;
                        if (obj instanceof Ve) {
                            return (Ve) obj;
                        }
                    } else {
                        AdConfig adConfig = this.m;
                        if (adConfig != null && (vastVideo = adConfig.getVastVideo()) != null) {
                            return new Pe(vastVideo, this.f23890n).a(str);
                        }
                    }
                }
                return null;
            } catch (JSONException e2) {
                InterfaceC3333z5 interfaceC3333z5 = this.f23890n;
                if (interfaceC3333z5 != null) {
                    ((A5) interfaceC3333z5).b("p8", E0.a(e2, H6.a("p8", "TAG", "Exception while getting videoDescriptor - ")));
                }
            }
        }
        return null;
    }

    public final Point a(JSONObject jSONObject, Point point) {
        try {
            JSONObject jSONObjectI = i(jSONObject);
            if (!jSONObjectI.isNull("finalGeometry")) {
                JSONArray jSONArray = jSONObjectI.getJSONArray("finalGeometry");
                Point point2 = new Point();
                point2.x = a(jSONArray.getInt(2));
                point2.y = a(jSONArray.getInt(3));
                return point2;
            }
        } catch (JSONException unused) {
        }
        return point;
    }

    public final int a(JSONObject jSONObject, boolean z2) {
        try {
            JSONObject jSONObjectC = c(jSONObject);
            String str = z2 ? "delay" : "hideAfterDelay";
            if (jSONObjectC.isNull(str)) {
                return -1;
            }
            int i2 = jSONObjectC.getInt(str);
            if (3 != e(jSONObject)) {
                if (4 == e(jSONObject)) {
                    if (i2 != 0) {
                        if (1 <= i2 && i2 < 101) {
                            int[] iArr = {25, 50, 75, 100};
                            double d = Double.MAX_VALUE;
                            int i3 = -1;
                            for (int i4 = 0; i4 < 4; i4++) {
                                int i5 = i2 - iArr[i4];
                                double d2 = i5 * i5;
                                if (d2 < d) {
                                    i3 = i4;
                                    d = d2;
                                }
                            }
                            return iArr[i3];
                        }
                    }
                }
            }
            return i2;
        } catch (JSONException e2) {
            InterfaceC3333z5 interfaceC3333z5 = this.f23890n;
            if (interfaceC3333z5 != null) {
                ((A5) interfaceC3333z5).b("p8", E0.a(e2, H6.a("p8", "TAG", "Exception while getting assetDisplayOnDelay - ")));
            }
        }
        return -1;
    }

    public static byte a(String str) {
        Locale US = Locale.US;
        Intrinsics.e(US, "US");
        String upperCase = str.toUpperCase(US);
        Intrinsics.e(upperCase, "this as java.lang.String).toUpperCase(locale)");
        int length = upperCase.length() - 1;
        int i2 = 0;
        boolean z2 = false;
        while (i2 <= length) {
            boolean z3 = Intrinsics.h(upperCase.charAt(!z2 ? i2 : length), 32) <= 0;
            if (z2) {
                if (!z3) {
                    break;
                }
                length--;
            } else if (z3) {
                i2++;
            } else {
                z2 = true;
            }
        }
        String strA = I7.a(length, 1, upperCase, i2);
        return (!Intrinsics.a(strA, "NONE") && Intrinsics.a(strA, "EXIT")) ? (byte) 1 : (byte) 0;
    }

    /* JADX WARN: Code duplicated, block: B:56:0x00e0 A[PHI: r8
  0x00e0: PHI (r8v12 java.lang.String) = (r8v7 java.lang.String), (r8v8 java.lang.String), (r8v7 java.lang.String), (r8v10 java.lang.String) binds: [B:55:0x00de, B:89:0x014a, B:86:0x0141, B:83:0x013a] A[DONT_GENERATE, DONT_INLINE]] */
    public final C3001e8 a(Point point, Point point2, Point point3, Point point4, JSONObject jSONObject) throws JSONException {
        JSONObject jSONObjectOptJSONObject;
        String strA;
        String str;
        String strE = "none";
        String strA2 = "#ff000000";
        String strD = "straight";
        if (!jSONObject.isNull("border") && (jSONObjectOptJSONObject = jSONObject.optJSONObject("border")) != null && !jSONObjectOptJSONObject.isNull("style")) {
            String string = jSONObjectOptJSONObject.getString("style");
            Intrinsics.e(string, "getString(...)");
            strE = e(string);
            if (!jSONObjectOptJSONObject.isNull("corner")) {
                String string2 = jSONObjectOptJSONObject.getString("corner");
                Intrinsics.e(string2, "getString(...)");
                strD = d(string2);
            }
            if (!jSONObjectOptJSONObject.isNull("color")) {
                String string3 = jSONObjectOptJSONObject.getString("color");
                Intrinsics.e(string3, "getString(...)");
                int length = string3.length() - 1;
                int i2 = 0;
                boolean z2 = false;
                while (i2 <= length) {
                    boolean z3 = Intrinsics.h(string3.charAt(!z2 ? i2 : length), 32) <= 0;
                    if (z2) {
                        if (!z3) {
                            break;
                        }
                        length--;
                    } else if (z3) {
                        i2++;
                    } else {
                        z2 = true;
                    }
                }
                strA2 = I7.a(length, 1, string3, i2);
            }
        }
        String str2 = strE;
        String str3 = strA2;
        String str4 = strD;
        if (jSONObject.isNull(TtmlNode.ATTR_TTS_BACKGROUND_COLOR)) {
            strA = "#00000000";
        } else {
            String string4 = jSONObject.getString(TtmlNode.ATTR_TTS_BACKGROUND_COLOR);
            Intrinsics.e(string4, "getString(...)");
            int length2 = string4.length() - 1;
            int i3 = 0;
            boolean z4 = false;
            while (i3 <= length2) {
                boolean z5 = Intrinsics.h(string4.charAt(!z4 ? i3 : length2), 32) <= 0;
                if (z4) {
                    if (!z5) {
                        break;
                    }
                    length2--;
                } else if (z5) {
                    i3++;
                } else {
                    z4 = true;
                }
            }
            strA = I7.a(length2, 1, string4, i3);
        }
        String str5 = strA;
        String str6 = "fill";
        if (jSONObject.isNull("contentMode")) {
            str = str6;
        } else {
            String string5 = jSONObject.getString("contentMode");
            Intrinsics.c(string5);
            int length3 = string5.length() - 1;
            int i4 = 0;
            boolean z6 = false;
            while (i4 <= length3) {
                boolean z7 = Intrinsics.h(string5.charAt(!z6 ? i4 : length3), 32) <= 0;
                if (z6) {
                    if (!z7) {
                        break;
                    }
                    length3--;
                } else if (z7) {
                    i4++;
                } else {
                    z6 = true;
                }
            }
            String strA3 = I7.a(length3, 1, string5, i4);
            int iHashCode = strA3.hashCode();
            if (iHashCode == -1626174665) {
                strA3.equals("unspecified");
            } else if (iHashCode == -1362001767) {
                str6 = "aspectFit";
                if (strA3.equals("aspectFit")) {
                    str = str6;
                }
            } else if (iHashCode != 3143043) {
                if (iHashCode == 727618043) {
                    str6 = "aspectFill";
                    if (strA3.equals("aspectFill")) {
                        str = str6;
                    }
                }
            } else if (strA3.equals("fill")) {
                str = str6;
            }
            str = "unspecified";
        }
        return new C3001e8(point.x, point.y, point2.x, point2.y, point3.x, point3.y, point4.x, point4.y, str, str2, str4, str3, str5, new P8(q(jSONObject.optJSONObject("startOffset")), q(jSONObject.optJSONObject("timerDuration"))));
    }

    public final P8 a(JSONObject jSONObject) {
        return new P8(q(jSONObject.optJSONObject("startOffset")), q(jSONObject.optJSONObject("timerDuration")));
    }
}
