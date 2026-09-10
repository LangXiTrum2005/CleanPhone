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
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Map f9809e = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Object f9810f = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private JSONObject f9811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f9812b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AppLovinAdSize f9813c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private AppLovinAdType f9814d;

    private u(AppLovinAdSize appLovinAdSize, AppLovinAdType appLovinAdType, String str, boolean z10, boolean z11) {
        String lowerCase;
        if (TextUtils.isEmpty(str) && (appLovinAdType == null || appLovinAdSize == null)) {
            throw new IllegalArgumentException("No zone identifier or type or size specified");
        }
        this.f9813c = appLovinAdSize;
        this.f9814d = appLovinAdType;
        if (StringUtils.isValidString(str)) {
            lowerCase = str.trim().toLowerCase(Locale.ENGLISH);
        } else {
            lowerCase = (appLovinAdSize.getLabel() + "_" + appLovinAdType.getLabel()).toLowerCase(Locale.ENGLISH);
        }
        lowerCase = z10 ? wi.d.h(lowerCase, "_bidding") : lowerCase;
        this.f9812b = z11 ? wi.d.h(lowerCase, "_direct_sold") : lowerCase;
    }

    public static u a(String str) {
        return a(null, null, str);
    }

    public static u b(String str) {
        return a(AppLovinAdSize.INTERSTITIAL, AppLovinAdType.INCENTIVIZED, str);
    }

    public static u c() {
        return a(AppLovinAdSize.BANNER, AppLovinAdType.REGULAR);
    }

    public static u h() {
        return a(AppLovinAdSize.INTERSTITIAL, AppLovinAdType.INCENTIVIZED);
    }

    public static u j() {
        return a(AppLovinAdSize.LEADER, AppLovinAdType.REGULAR);
    }

    public static u k() {
        return a(AppLovinAdSize.MREC, AppLovinAdType.REGULAR);
    }

    public static u l() {
        return a(AppLovinAdSize.NATIVE, AppLovinAdType.NATIVE);
    }

    public static u m() {
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
        return this.f9812b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || u.class != obj.getClass()) {
            return false;
        }
        return this.f9812b.equalsIgnoreCase(((u) obj).f9812b);
    }

    public AppLovinAdSize f() {
        if (this.f9813c == null && JsonUtils.valueExists(this.f9811a, "ad_size")) {
            this.f9813c = AppLovinAdSize.fromString(JsonUtils.getString(this.f9811a, "ad_size", null));
        }
        return this.f9813c;
    }

    public AppLovinAdType g() {
        if (this.f9814d == null && JsonUtils.valueExists(this.f9811a, "ad_type")) {
            this.f9814d = AppLovinAdType.fromString(JsonUtils.getString(this.f9811a, "ad_type", null));
        }
        return this.f9814d;
    }

    public int hashCode() {
        return this.f9812b.hashCode();
    }

    public boolean i() {
        return a().contains(this);
    }

    public String toString() {
        return "AdZone{id=" + this.f9812b + ", zoneObject=" + this.f9811a + '}';
    }

    public static u a(AppLovinAdSize appLovinAdSize, AppLovinAdType appLovinAdType) {
        return a(appLovinAdSize, appLovinAdType, null);
    }

    public static u b() {
        return a(AppLovinAdSize.INTERSTITIAL, AppLovinAdType.APP_OPEN);
    }

    public static u a(AppLovinAdSize appLovinAdSize, AppLovinAdType appLovinAdType, String str) {
        return a(appLovinAdSize, appLovinAdType, str, false, false);
    }

    public static u a(AppLovinAdSize appLovinAdSize, AppLovinAdType appLovinAdType, String str, boolean z10, boolean z11) {
        u uVar = new u(appLovinAdSize, appLovinAdType, str, z10, z11);
        synchronized (f9810f) {
            try {
                String str2 = uVar.f9812b;
                Map map = f9809e;
                if (map.containsKey(str2)) {
                    uVar = (u) map.get(str2);
                } else {
                    map.put(str2, uVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return uVar;
    }

    public static void a(JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.has("ad_size") && jSONObject.has("ad_type")) {
            synchronized (f9810f) {
                try {
                    u uVar = (u) f9809e.get(JsonUtils.getString(jSONObject, "zone_id", ""));
                    if (uVar != null) {
                        uVar.f9813c = AppLovinAdSize.fromString(JsonUtils.getString(jSONObject, "ad_size", ""));
                        uVar.f9814d = AppLovinAdType.fromString(JsonUtils.getString(jSONObject, "ad_type", ""));
                    }
                } catch (Throwable th2) {
                    throw th2;
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
