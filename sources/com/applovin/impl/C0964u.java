package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.applovin.impl.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0964u {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Map f11917e = new HashMap();
    private static final Object f = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private JSONObject f11918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f11919b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AppLovinAdSize f11920c;
    private AppLovinAdType d;

    private C0964u(AppLovinAdSize appLovinAdSize, AppLovinAdType appLovinAdType, String str, boolean z2, boolean z3) {
        String lowerCase;
        if (TextUtils.isEmpty(str) && (appLovinAdType == null || appLovinAdSize == null)) {
            throw new IllegalArgumentException("No zone identifier or type or size specified");
        }
        this.f11920c = appLovinAdSize;
        this.d = appLovinAdType;
        if (StringUtils.isValidString(str)) {
            lowerCase = str.trim().toLowerCase(Locale.ENGLISH);
        } else {
            lowerCase = (appLovinAdSize.getLabel() + "_" + appLovinAdType.getLabel()).toLowerCase(Locale.ENGLISH);
        }
        lowerCase = z2 ? android.support.v4.media.a.m(lowerCase, "_bidding") : lowerCase;
        this.f11919b = z3 ? android.support.v4.media.a.m(lowerCase, "_direct_sold") : lowerCase;
    }

    public static C0964u a(String str) {
        return a(null, null, str);
    }

    public static C0964u b(String str) {
        return a(AppLovinAdSize.INTERSTITIAL, AppLovinAdType.INCENTIVIZED, str);
    }

    public static C0964u c() {
        return a(AppLovinAdSize.BANNER, AppLovinAdType.REGULAR);
    }

    public static C0964u h() {
        return a(AppLovinAdSize.INTERSTITIAL, AppLovinAdType.INCENTIVIZED);
    }

    public static C0964u j() {
        return a(AppLovinAdSize.LEADER, AppLovinAdType.REGULAR);
    }

    public static C0964u k() {
        return a(AppLovinAdSize.MREC, AppLovinAdType.REGULAR);
    }

    public static C0964u l() {
        return a(AppLovinAdSize.NATIVE, AppLovinAdType.NATIVE);
    }

    public static C0964u m() {
        return a(AppLovinAdSize.INTERSTITIAL, AppLovinAdType.REGULAR);
    }

    public MaxAdFormat d() {
        AppLovinAdSize appLovinAdSizeF = f();
        if (appLovinAdSizeF == AppLovinAdSize.BANNER) {
            return MaxAdFormat.BANNER;
        }
        if (appLovinAdSizeF == AppLovinAdSize.LEADER) {
            return MaxAdFormat.LEADER;
        }
        if (appLovinAdSizeF == AppLovinAdSize.MREC) {
            return MaxAdFormat.MREC;
        }
        if (appLovinAdSizeF != AppLovinAdSize.INTERSTITIAL) {
            if (appLovinAdSizeF == AppLovinAdSize.NATIVE) {
                return MaxAdFormat.NATIVE;
            }
            return null;
        }
        if (g() == AppLovinAdType.REGULAR) {
            return MaxAdFormat.INTERSTITIAL;
        }
        if (g() == AppLovinAdType.APP_OPEN) {
            return MaxAdFormat.APP_OPEN;
        }
        if (g() == AppLovinAdType.INCENTIVIZED) {
            return MaxAdFormat.REWARDED;
        }
        return null;
    }

    public String e() {
        return this.f11919b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0964u.class != obj.getClass()) {
            return false;
        }
        return this.f11919b.equalsIgnoreCase(((C0964u) obj).f11919b);
    }

    public AppLovinAdSize f() {
        if (this.f11920c == null && JsonUtils.valueExists(this.f11918a, "ad_size")) {
            this.f11920c = AppLovinAdSize.fromString(JsonUtils.getString(this.f11918a, "ad_size", null));
        }
        return this.f11920c;
    }

    public AppLovinAdType g() {
        if (this.d == null && JsonUtils.valueExists(this.f11918a, "ad_type")) {
            this.d = AppLovinAdType.fromString(JsonUtils.getString(this.f11918a, "ad_type", null));
        }
        return this.d;
    }

    public int hashCode() {
        return this.f11919b.hashCode();
    }

    public boolean i() {
        return a().contains(this);
    }

    public String toString() {
        return "AdZone{id=" + this.f11919b + ", zoneObject=" + this.f11918a + AbstractJsonLexerKt.END_OBJ;
    }

    public static C0964u a(AppLovinAdSize appLovinAdSize, AppLovinAdType appLovinAdType) {
        return a(appLovinAdSize, appLovinAdType, null);
    }

    public static C0964u b() {
        return a(AppLovinAdSize.INTERSTITIAL, AppLovinAdType.APP_OPEN);
    }

    public static C0964u a(AppLovinAdSize appLovinAdSize, AppLovinAdType appLovinAdType, String str) {
        return a(appLovinAdSize, appLovinAdType, str, false, false);
    }

    public static C0964u a(AppLovinAdSize appLovinAdSize, AppLovinAdType appLovinAdType, String str, boolean z2, boolean z3) {
        C0964u c0964u = new C0964u(appLovinAdSize, appLovinAdType, str, z2, z3);
        synchronized (f) {
            try {
                String str2 = c0964u.f11919b;
                Map map = f11917e;
                if (map.containsKey(str2)) {
                    c0964u = (C0964u) map.get(str2);
                } else {
                    map.put(str2, c0964u);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0964u;
    }

    public static void a(JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.has("ad_size") && jSONObject.has("ad_type")) {
            synchronized (f) {
                try {
                    C0964u c0964u = (C0964u) f11917e.get(JsonUtils.getString(jSONObject, "zone_id", ""));
                    if (c0964u != null) {
                        c0964u.f11920c = AppLovinAdSize.fromString(JsonUtils.getString(jSONObject, "ad_size", ""));
                        c0964u.d = AppLovinAdType.fromString(JsonUtils.getString(jSONObject, "ad_type", ""));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static Collection a() {
        LinkedHashSet linkedHashSet = new LinkedHashSet(7);
        Collections.addAll(linkedHashSet, c(), k(), j(), m(), b(), h(), l());
        return Collections.unmodifiableSet(linkedHashSet);
    }
}
