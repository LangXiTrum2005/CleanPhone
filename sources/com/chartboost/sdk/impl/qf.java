package com.chartboost.sdk.impl;

import com.chartboost.sdk.privacy.model.CCPA;
import com.chartboost.sdk.privacy.model.LGPD;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class qf {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final boolean f14934A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final a f14935B;
    public b C;
    public final String D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final long f14936E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final long f14937F;
    public final ah G;
    public final xi H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final dd f14938I;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f14940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f14941c;
    public final List d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f14942e;
    public final boolean f;
    public final boolean g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f14943h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f14944i;
    public final boolean j;
    public final boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f14945l;
    public final boolean m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f14946n;
    public final int o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f14947p;
    public final List q;
    public final boolean r;
    public final boolean s;
    public final boolean t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f14948u;
    public final boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f14949w;
    public final boolean x;
    public final String y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final String f14950z;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f14951a;

        public boolean a() {
            return this.f14951a;
        }

        public static a a(JSONObject jSONObject) {
            a aVar = new a();
            aVar.f14951a = jSONObject.optBoolean("bannerEnable", true);
            return aVar;
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public HashSet f14952a;

        public static void a(HashSet hashSet, int i2) {
            if (i2 == 0) {
                hashSet.clear();
            }
        }

        public HashSet a() {
            return this.f14952a;
        }

        public static void a(JSONArray jSONArray, HashSet hashSet, int i2) {
            for (int i3 = 0; i3 < i2; i3++) {
                hashSet.add(jSONArray.getString(i3));
            }
        }

        public static b a(JSONObject jSONObject) {
            b bVar = new b();
            HashSet hashSet = new HashSet();
            hashSet.add(CCPA.CCPA_STANDARD);
            hashSet.add("coppa");
            hashSet.add(LGPD.LGPD_STANDARD);
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("privacyStandards");
            if (jSONArrayOptJSONArray != null) {
                int length = jSONArrayOptJSONArray.length();
                a(jSONArrayOptJSONArray, hashSet, length);
                a(hashSet, length);
            }
            bVar.f14952a = hashSet;
            return bVar;
        }
    }

    public qf(JSONObject jSONObject) {
        this.f14939a = jSONObject.optString("configVariant");
        this.f14940b = jSONObject.optBoolean("prefetchDisable");
        this.f14941c = jSONObject.optBoolean("publisherDisable");
        this.f14935B = a.a(jSONObject);
        try {
            this.C = b.a(jSONObject);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        this.D = jSONObject.optString("publisherWarning", null);
        this.f14936E = jSONObject.optLong("maxBytes", 104857600L);
        this.f14937F = jSONObject.optLong("ttl", com.thinkup.core.oo.m0.om);
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("invalidateFolderList");
        if (jSONArrayOptJSONArray != null) {
            int length = jSONArrayOptJSONArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                String strOptString = jSONArrayOptJSONArray.optString(i2);
                if (!strOptString.isEmpty()) {
                    arrayList.add(strOptString);
                }
            }
        }
        this.d = Collections.unmodifiableList(arrayList);
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("trackingLevels");
        jSONObjectOptJSONObject = jSONObjectOptJSONObject == null ? new JSONObject() : jSONObjectOptJSONObject;
        this.f14942e = jSONObjectOptJSONObject.optBoolean("critical", true);
        this.f14945l = jSONObjectOptJSONObject.optBoolean("includeStackTrace", true);
        this.f = jSONObjectOptJSONObject.optBoolean("error");
        this.g = jSONObjectOptJSONObject.optBoolean("debug");
        this.f14943h = jSONObjectOptJSONObject.optBoolean("session");
        this.f14944i = jSONObjectOptJSONObject.optBoolean("system");
        this.j = jSONObjectOptJSONObject.optBoolean("timing");
        this.k = jSONObjectOptJSONObject.optBoolean("user");
        this.m = jSONObjectOptJSONObject.optBoolean("loggerCallerInfoCache", true);
        this.G = bh.b(jSONObject);
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("videoPreCaching");
        this.H = xi.a(jSONObjectOptJSONObject2 == null ? new JSONObject() : jSONObjectOptJSONObject2);
        JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("omSdk");
        this.f14938I = ed.b(jSONObjectOptJSONObject3 == null ? new JSONObject() : jSONObjectOptJSONObject3);
        JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject(com.ironsource.d9.h.K);
        jSONObjectOptJSONObject4 = jSONObjectOptJSONObject4 == null ? new JSONObject() : jSONObjectOptJSONObject4;
        this.f14946n = jSONObjectOptJSONObject4.optInt("cacheMaxBytes", 104857600);
        int iOptInt = jSONObjectOptJSONObject4.optInt("cacheMaxUnits", 10);
        this.o = iOptInt > 0 ? iOptInt : 10;
        this.f14947p = (int) TimeUnit.SECONDS.toDays(jSONObjectOptJSONObject4.optInt("cacheTTLs", k2.f14319a));
        ArrayList arrayList2 = new ArrayList();
        JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject4.optJSONArray("directories");
        if (jSONArrayOptJSONArray2 != null) {
            int length2 = jSONArrayOptJSONArray2.length();
            for (int i3 = 0; i3 < length2; i3++) {
                String strOptString2 = jSONArrayOptJSONArray2.optString(i3);
                if (!strOptString2.isEmpty()) {
                    arrayList2.add(strOptString2);
                }
            }
        }
        this.q = Collections.unmodifiableList(arrayList2);
        this.r = jSONObjectOptJSONObject4.optBoolean("enabled", i());
        this.s = jSONObjectOptJSONObject4.optBoolean("inplayEnabled", true);
        this.t = jSONObjectOptJSONObject4.optBoolean("interstitialEnabled", true);
        int iOptInt2 = jSONObjectOptJSONObject4.optInt("invalidatePendingImpression", 3);
        this.f14948u = iOptInt2 <= 0 ? 3 : iOptInt2;
        this.v = jSONObjectOptJSONObject4.optBoolean("lockOrientation", true);
        this.f14949w = jSONObjectOptJSONObject4.optInt("prefetchSession", 3);
        this.x = jSONObjectOptJSONObject4.optBoolean("rewardVideoEnabled", true);
        String strOptString3 = jSONObjectOptJSONObject4.optString("version", "v2");
        this.y = strOptString3;
        this.f14950z = android.support.v4.media.a.n("webview/", strOptString3, "/prefetch");
        this.f14934A = jSONObjectOptJSONObject4.optBoolean("redirectOpenToNativeBrowser", false);
    }

    public static boolean i() {
        int[] iArr = {4, 4, 2};
        String strA = h1.b().a();
        if (strA != null && strA.length() > 0) {
            String[] strArrSplit = strA.replaceAll("[^\\d.]", "").split("\\.");
            for (int i2 = 0; i2 < strArrSplit.length && i2 < 3; i2++) {
                try {
                    if (Integer.parseInt(strArrSplit[i2]) > iArr[i2]) {
                        return true;
                    }
                    if (Integer.parseInt(strArrSplit[i2]) < iArr[i2]) {
                        return false;
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        return false;
    }

    public a a() {
        return this.f14935B;
    }

    public dd b() {
        return this.f14938I;
    }

    public xi c() {
        return this.H;
    }

    public boolean d() {
        return this.f14940b;
    }

    public boolean e() {
        return this.f14941c;
    }

    public String f() {
        return this.D;
    }

    public ah g() {
        return this.G;
    }

    public boolean h() {
        return this.r;
    }

    public boolean j() {
        return this.v;
    }

    public x4 k() {
        return new x4(this.f14939a, this.r, this.y);
    }
}
