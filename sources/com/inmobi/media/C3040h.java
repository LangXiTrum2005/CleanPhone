package com.inmobi.media;

import com.inmobi.adquality.models.AdQualityControl;
import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.core.Trackers;
import com.inmobi.ads.core.TrackingInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C3040h {
    public static final String CLICK_BEACON = "click";
    public static final C3008f Companion = new C3008f();
    private static final boolean DEFAULT_ALLOW_AUTO_REDIRECTION = false;
    public static final String IMPRESSION_BEACON = "impression";
    private static final long INVALID_AD_EXPIRY = -1;
    public static final String LOAD_AD_TOKEN_URL = "load_ad_token_url";
    public static final String LOAD_AD_TOKEN_URL_FAILURE = "load_ad_token_url_failure";
    private static final String TAG = "h";
    public static final String WIN_BEACON = "win_beacon";
    private final String adAuctionMeta;
    private JSONObject adContent;
    private final Lazy adMetaInfo$delegate;
    private AdQualityControl adQualityControl;
    private String adType;
    private final boolean allowAutoRedirection;
    private JSONArray assetUrls;
    private final JSONObject contextData;

    @Z4
    private C3200r0 features;
    private final String impressionId;
    private boolean isPreloadWebView;
    private JSONArray landingPageParams;
    private long mExpiryDurationInMillis;
    private long mInsertionTimestampInMillis;
    private String markupType;
    private final JSONObject metaInfo;
    private String pubContent;
    private String sf;
    private final JSONArray trackers;
    private final List<TrackingInfo> trackingInfo;
    private final JSONObject transaction;
    private String webVast;

    public C3040h() {
        this.webVast = "";
        this.impressionId = "";
        this.trackingInfo = EmptyList.X;
        this.transaction = new JSONObject();
        this.pubContent = "";
        this.markupType = "unknown";
        this.adMetaInfo$delegate = LazyKt.b(new C3024g(this));
        this.mInsertionTimestampInMillis = System.currentTimeMillis();
    }

    public static /* synthetic */ void B() {
    }

    public static /* synthetic */ void g() {
    }

    public static /* synthetic */ void r() {
    }

    public static /* synthetic */ void v() {
    }

    public final String A() {
        return this.sf;
    }

    public final Boolean C() {
        JSONObject jSONObject = this.contextData;
        if (jSONObject != null) {
            return Boolean.valueOf(jSONObject.optBoolean("enabled"));
        }
        return null;
    }

    public final JSONArray D() {
        JSONObject jSONObject = this.adContent;
        if (jSONObject != null) {
            return jSONObject.optJSONArray("trackingEvents");
        }
        return null;
    }

    public final JSONObject E() {
        return this.transaction;
    }

    public final String F() {
        return this.webVast;
    }

    public final boolean G() {
        return this.isPreloadWebView;
    }

    public final void a(JSONArray jSONArray) {
        this.assetUrls = jSONArray;
    }

    public final String b() {
        return this.adAuctionMeta;
    }

    public final JSONObject c() {
        return this.adContent;
    }

    public final void d(String str) {
        this.sf = str;
    }

    public final void e(String str) {
        Intrinsics.f(str, "<set-?>");
        this.webVast = str;
    }

    public final String f() {
        return this.adType;
    }

    public final String h() {
        JSONObject jSONObject = this.contextData;
        if (jSONObject != null) {
            return jSONObject.optString("advertisedContent", null);
        }
        return null;
    }

    public final boolean i() {
        return this.allowAutoRedirection;
    }

    public final Long j() {
        try {
            JSONObject jSONObject = this.adContent;
            if (jSONObject == null || !jSONObject.has("asPlcId")) {
                return null;
            }
            return Long.valueOf(jSONObject.getLong("asPlcId"));
        } catch (JSONException e2) {
            String TAG2 = TAG;
            Intrinsics.e(TAG2, "TAG");
            S5 s5 = S5.f23167a;
            S5.d.a(new C3011f2(e2));
        }
        return null;
    }

    public final JSONArray k() {
        return this.assetUrls;
    }

    public final String l() {
        JSONObject jSONObject = this.adContent;
        if (jSONObject != null) {
            return jSONObject.optString("baseEventUrl", null);
        }
        return null;
    }

    public final Long m() {
        JSONObject jSONObject = this.contextData;
        if (jSONObject != null) {
            return Long.valueOf(jSONObject.optLong("bidderId"));
        }
        return null;
    }

    public final int n() {
        JSONObject jSONObject = this.contextData;
        if (jSONObject != null) {
            return jSONObject.optInt("casAdTypeId", -1);
        }
        return -1;
    }

    public final String o() {
        JSONObject jSONObject = this.adContent;
        String strOptString = jSONObject != null ? jSONObject.optString("creativeId") : null;
        return strOptString == null ? "" : strOptString;
    }

    public final String p() {
        JSONObject jSONObject = this.metaInfo;
        if (jSONObject != null) {
            return jSONObject.optString("creativeType", null);
        }
        return null;
    }

    public final C3200r0 q() {
        return this.features;
    }

    public final String s() {
        return this.impressionId;
    }

    public final String t() {
        JSONObject jSONObject = this.metaInfo;
        if (jSONObject != null) {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("landingPageParams");
            this.landingPageParams = jSONArrayOptJSONArray;
            if (jSONArrayOptJSONArray != null) {
                Object objOpt = jSONArrayOptJSONArray.opt(0);
                JSONObject jSONObject2 = objOpt instanceof JSONObject ? (JSONObject) objOpt : null;
                if (jSONObject2 != null) {
                    String strOptString = jSONObject2.optString("openMode", "DEFAULT");
                    Intrinsics.e(strOptString, "optString(...)");
                    return strOptString;
                }
            }
        }
        return "DEFAULT";
    }

    public final String u() {
        return this.markupType;
    }

    public final String w() {
        JSONObject jSONObject = this.adContent;
        String strOptString = jSONObject != null ? jSONObject.optString("telemetryMetadataBlob") : null;
        return strOptString == null ? "" : strOptString;
    }

    public final String x() {
        return this.pubContent;
    }

    public final Set<C3307xb> y() {
        HashSet hashSet = new HashSet();
        try {
            JSONArray jSONArray = this.assetUrls;
            if (jSONArray != null) {
                int length = jSONArray.length();
                for (int i2 = 0; i2 < length; i2++) {
                    JSONObject jSONObject = new JSONObject(jSONArray.getString(i2));
                    byte b2 = (byte) jSONObject.getInt("type");
                    String strOptString = jSONObject.optString("url");
                    Intrinsics.c(strOptString);
                    if (strOptString.length() > 0) {
                        hashSet.add(new C3307xb(b2, strOptString));
                    }
                }
            }
        } catch (JSONException e2) {
            String TAG2 = TAG;
            Intrinsics.e(TAG2, "TAG");
            S5 s5 = S5.f23167a;
            S5.d.a(new C3011f2(e2));
        }
        return hashSet;
    }

    public final Map<String, String> z() {
        try {
            JSONObject jSONObject = this.adContent;
            JSONObject jSONObject2 = jSONObject != null ? jSONObject.getJSONObject("pubContent") : null;
            if (jSONObject2 != null) {
                Companion.getClass();
                if (!jSONObject2.has("rewards")) {
                    return null;
                }
                HashMap map = new HashMap();
                JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("rewards");
                if (jSONObjectOptJSONObject != null) {
                    Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        String string = jSONObjectOptJSONObject.getString(next);
                        Intrinsics.c(next);
                        Intrinsics.c(string);
                        map.put(next, string);
                    }
                }
                return map;
            }
        } catch (JSONException e2) {
            String TAG2 = TAG;
            Intrinsics.e(TAG2, "TAG");
            S5 s5 = S5.f23167a;
            S5.d.a(new C3011f2(e2));
        }
        return null;
    }

    public final void a(boolean z2) {
        this.isPreloadWebView = z2;
    }

    public final void b(String str) {
        try {
            this.transaction.put(C3312y0.CTX_HASH_KEY, str);
            JSONObject jSONObject = this.adContent;
            if (jSONObject != null) {
                jSONObject.put("transaction", this.transaction);
            }
        } catch (JSONException e2) {
            String TAG2 = TAG;
            Intrinsics.e(TAG2, "TAG");
            S5 s5 = S5.f23167a;
            S5.d.a(new C3011f2(e2));
        }
    }

    public final List<String> c(String type) {
        JSONArray jSONArrayOptJSONArray;
        Intrinsics.f(type, "type");
        JSONArray jSONArray = this.trackers;
        if (jSONArray != null && jSONArray.length() != 0) {
            LinkedList linkedList = new LinkedList();
            int length = this.trackers.length();
            for (int i2 = 0; i2 < length; i2++) {
                try {
                    JSONObject jSONObject = this.trackers.getJSONObject(i2);
                    if (type.equals(jSONObject.optString("type")) && (jSONArrayOptJSONArray = jSONObject.optJSONArray("url")) != null) {
                        int length2 = jSONArrayOptJSONArray.length();
                        for (int i3 = 0; i3 < length2; i3++) {
                            linkedList.add(jSONArrayOptJSONArray.getString(i3));
                        }
                    }
                } catch (JSONException unused) {
                    return null;
                }
            }
            if (!linkedList.isEmpty()) {
                return linkedList;
            }
        } else if (!this.trackingInfo.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (TrackingInfo trackingInfo : this.trackingInfo) {
                for (Trackers trackers : trackingInfo.getTrackers()) {
                    try {
                        if (type.equals(trackers.getType())) {
                            arrayList.addAll(trackers.getUrl());
                            List<String> imExts = trackers.getImExts();
                            ArrayList arrayList2 = new ArrayList(CollectionsKt.n(imExts, 10));
                            Iterator<T> it = imExts.iterator();
                            while (it.hasNext()) {
                                arrayList2.add(trackingInfo.getImBaseUrl() + ((String) it.next()));
                            }
                            arrayList.addAll(arrayList2);
                        }
                    } catch (Exception unused2) {
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return arrayList;
        }
        return null;
    }

    public final AdMetaInfo d() {
        return (AdMetaInfo) this.adMetaInfo$delegate.getX();
    }

    public final AdQualityControl e() {
        return this.adQualityControl;
    }

    public final void f(String pubContent) throws JSONException {
        Intrinsics.f(pubContent, "pubContent");
        if ("inmobiJson".equals(this.markupType)) {
            JSONObject jSONObject = this.adContent;
            if (jSONObject != null) {
                jSONObject.put("pubContent", new JSONObject(pubContent));
            }
        } else {
            JSONObject jSONObject2 = this.adContent;
            if (jSONObject2 != null) {
                jSONObject2.put("pubContent", pubContent);
            }
        }
        this.pubContent = pubContent;
    }

    public final void a(C3200r0 c3200r0) {
        this.features = c3200r0;
    }

    public final void a() throws IllegalStateException {
        if (!Intrinsics.a(this.markupType, "unknown")) {
            if (this.impressionId.length() != 0) {
                return;
            }
            String TAG2 = TAG;
            Intrinsics.e(TAG2, "TAG");
            AbstractC3048h7.a((byte) 1, TAG2, "Impression Id is Null");
            throw new IllegalArgumentException("Invalid Ad");
        }
        String TAG3 = TAG;
        Intrinsics.e(TAG3, "TAG");
        AbstractC3048h7.a((byte) 1, TAG3, "UnKnown MarkUp Type");
        throw new IllegalArgumentException("Invalid Ad");
    }

    public C3040h(C3040h ad, JSONArray jSONArray) {
        Intrinsics.f(ad, "ad");
        this.webVast = "";
        this.impressionId = "";
        this.trackingInfo = EmptyList.X;
        this.transaction = new JSONObject();
        this.pubContent = "";
        this.markupType = "unknown";
        this.adMetaInfo$delegate = LazyKt.b(new C3024g(this));
        C3175p6.b(ad, this);
        this.assetUrls = jSONArray;
    }

    public final void a(JSONObject jSONObject, String str, long j) {
        this.adContent = jSONObject;
        this.adType = str;
        this.mInsertionTimestampInMillis = System.currentTimeMillis();
        this.mExpiryDurationInMillis = j;
        String str2 = this.sf;
        if (str2 != null) {
            if (!B2.a(str2)) {
                str2 = null;
            }
            if (str2 != null) {
                this.features = new C3200r0(str2);
            }
        }
    }

    public final boolean a(long j) {
        long jCurrentTimeMillis;
        long j2 = this.mExpiryDurationInMillis;
        if ((j2 == -1 ? -1L : this.mInsertionTimestampInMillis + j2) == -1) {
            jCurrentTimeMillis = (TimeUnit.SECONDS.toMillis(j) + this.mInsertionTimestampInMillis) - System.currentTimeMillis();
        } else {
            jCurrentTimeMillis = (j2 != -1 ? this.mInsertionTimestampInMillis + j2 : -1L) - System.currentTimeMillis();
        }
        return jCurrentTimeMillis < 0;
    }

    public final void a(String buyerPrice) {
        Intrinsics.f(buyerPrice, "buyerPrice");
        try {
            this.transaction.put(C3312y0.BUYER_PRICE, Double.parseDouble(buyerPrice));
            JSONObject jSONObject = this.adContent;
            if (jSONObject != null) {
                jSONObject.put("transaction", this.transaction);
            }
        } catch (Exception e2) {
            S5 s5 = S5.f23167a;
            S5.d.a(AbstractC3285w5.a(e2, "event"));
        }
    }

    public final void a(JSONObject jSONObject) throws JSONException {
        if (jSONObject != null) {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                String str = this.pubContent;
                Intrinsics.c(next);
                String string = jSONObject.getString(next);
                Intrinsics.e(string, "getString(...)");
                this.pubContent = StringsKt.I(str, next, string);
            }
        }
        f(this.pubContent);
    }
}
