package com.applovin.impl;

import android.net.Uri;
import android.text.TextUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class r7 extends com.applovin.impl.sdk.ad.b implements s4 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final String f9185p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final String f9186q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final a8 f9187r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final long f9188s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final e8 f9189t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final u7 f9190u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final String f9191v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final t7 f9192w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final n4 f9193x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final Set f9194y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final Set f9195z;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private JSONObject f9196a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private JSONObject f9197b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private com.applovin.impl.sdk.l f9198c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f9199d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f9200e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String f9201f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private a8 f9202g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private e8 f9203h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private u7 f9204i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private t7 f9205j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private Set f9206k;
        private Set l;

        public b b(JSONObject jSONObject) {
            if (jSONObject != null) {
                this.f9197b = jSONObject;
                return this;
            }
            throw new IllegalArgumentException("No full ad response specified.");
        }

        public b b(String str) {
            this.f9200e = str;
            return this;
        }

        public b b(Set set) {
            this.f9206k = set;
            return this;
        }

        public b a(JSONObject jSONObject) {
            if (jSONObject != null) {
                this.f9196a = jSONObject;
                return this;
            }
            throw new IllegalArgumentException("No ad object specified.");
        }

        public b a(com.applovin.impl.sdk.l lVar) {
            if (lVar != null) {
                this.f9198c = lVar;
                return this;
            }
            throw new IllegalArgumentException("No sdk specified.");
        }

        public b a(String str) {
            this.f9201f = str;
            return this;
        }

        public b a(a8 a8Var) {
            this.f9202g = a8Var;
            return this;
        }

        public b a(e8 e8Var) {
            this.f9203h = e8Var;
            return this;
        }

        public b a(u7 u7Var) {
            this.f9204i = u7Var;
            return this;
        }

        public b a(t7 t7Var) {
            this.f9205j = t7Var;
            return this;
        }

        public b a(Set set) {
            this.l = set;
            return this;
        }

        public b a(long j10) {
            this.f9199d = j10;
            return this;
        }

        public r7 a() {
            return new r7(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public enum c {
        COMPANION_AD,
        VIDEO
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public enum d {
        IMPRESSION,
        VIDEO_CLICK,
        COMPANION_CLICK,
        VIDEO,
        COMPANION,
        INDUSTRY_ICON_IMPRESSION,
        INDUSTRY_ICON_CLICK,
        ERROR
    }

    private Set d1() {
        u7 u7Var = this.f9190u;
        return u7Var != null ? u7Var.b() : Collections.EMPTY_SET;
    }

    private String g1() {
        String stringFromAdObject = getStringFromAdObject("vimp_url", null);
        if (stringFromAdObject != null) {
            return stringFromAdObject.replace("{CLCODE}", getClCode());
        }
        return null;
    }

    private Set k1() {
        e8 e8Var = this.f9189t;
        return e8Var != null ? e8Var.b() : Collections.EMPTY_SET;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List o(j5 j5Var) {
        return q7.a(defpackage.e.y(j5Var, "vimp_urls"), getClCode(), null, g1(), J(), J0(), this.sdk);
    }

    @Override // com.applovin.impl.sdk.ad.b
    public List A() {
        List listA;
        j5 j5Var = this.synchronizedAdObject;
        if (j5Var != null) {
            return (List) j5Var.a(new t8(this, 2));
        }
        synchronized (this.adObjectLock) {
            listA = q7.a(getJsonObjectFromAdObject("vimp_urls", new JSONObject()), getClCode(), null, g1(), J(), J0(), this.sdk);
        }
        return listA;
    }

    @Override // com.applovin.impl.sdk.ad.b
    public boolean A0() {
        return getBooleanFromAdObject("vast_is_streaming", Boolean.FALSE);
    }

    @Override // com.applovin.impl.sdk.ad.b
    public String I() {
        return this.f9191v;
    }

    public Set a(d dVar, String str) {
        return a(dVar, new String[]{str});
    }

    @Override // com.applovin.impl.sdk.ad.b
    public Uri b0() {
        return b1();
    }

    public Uri b1() {
        e8 e8Var = this.f9189t;
        if (e8Var != null) {
            return e8Var.c();
        }
        return null;
    }

    public u7 c1() {
        return this.f9190u;
    }

    public void d(String str) {
        j5 j5Var = this.synchronizedAdObject;
        if (j5Var != null) {
            j5Var.b("html_template", str);
            return;
        }
        synchronized (this.adObjectLock) {
            JsonUtils.putString(this.adObject, "html_template", str);
        }
    }

    public String e1() {
        return getStringFromAdObject("html_template", "");
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r7) || !super.equals(obj)) {
            return false;
        }
        r7 r7Var = (r7) obj;
        String str = this.f9185p;
        if (str == null ? r7Var.f9185p != null : !str.equals(r7Var.f9185p)) {
            return false;
        }
        String str2 = this.f9186q;
        if (str2 == null ? r7Var.f9186q != null : !str2.equals(r7Var.f9186q)) {
            return false;
        }
        a8 a8Var = this.f9187r;
        if (a8Var == null ? r7Var.f9187r != null : !a8Var.equals(r7Var.f9187r)) {
            return false;
        }
        e8 e8Var = this.f9189t;
        if (e8Var == null ? r7Var.f9189t != null : !e8Var.equals(r7Var.f9189t)) {
            return false;
        }
        u7 u7Var = this.f9190u;
        if (u7Var == null ? r7Var.f9190u != null : !u7Var.equals(r7Var.f9190u)) {
            return false;
        }
        t7 t7Var = this.f9192w;
        if (t7Var == null ? r7Var.f9192w != null : !t7Var.equals(r7Var.f9192w)) {
            return false;
        }
        Set set = this.f9194y;
        if (set == null ? r7Var.f9194y != null : !set.equals(r7Var.f9194y)) {
            return false;
        }
        Set set2 = this.f9195z;
        if (set2 != null) {
            return set2.equals(r7Var.f9195z);
        }
        return r7Var.f9195z == null;
    }

    public c f1() {
        return "companion_ad".equalsIgnoreCase(getStringFromAdObject("vast_first_caching_operation", "companion_ad")) ? c.COMPANION_AD : c.VIDEO;
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase
    public long getCreatedAtMillis() {
        return this.f9188s;
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public JSONObject getOriginalFullResponse() {
        return this.fullResponse;
    }

    public x7 h1() {
        e8 e8Var = this.f9189t;
        if (e8Var != null) {
            return e8Var.f();
        }
        return null;
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public boolean hasVideoUrl() {
        List listG;
        e8 e8Var = this.f9189t;
        return (e8Var == null || (listG = e8Var.g()) == null || listG.size() <= 0) ? false : true;
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public int hashCode() {
        int iHashCode = super.hashCode() * 31;
        String str = this.f9185p;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f9186q;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        a8 a8Var = this.f9187r;
        int iHashCode4 = (iHashCode3 + (a8Var != null ? a8Var.hashCode() : 0)) * 31;
        e8 e8Var = this.f9189t;
        int iHashCode5 = (iHashCode4 + (e8Var != null ? e8Var.hashCode() : 0)) * 31;
        u7 u7Var = this.f9190u;
        int iHashCode6 = (iHashCode5 + (u7Var != null ? u7Var.hashCode() : 0)) * 31;
        t7 t7Var = this.f9192w;
        int iHashCode7 = (iHashCode6 + (t7Var != null ? t7Var.hashCode() : 0)) * 31;
        Set set = this.f9194y;
        int iHashCode8 = (iHashCode7 + (set != null ? set.hashCode() : 0)) * 31;
        Set set2 = this.f9195z;
        return iHashCode8 + (set2 != null ? set2.hashCode() : 0);
    }

    public long i1() {
        return getLongFromAdObject("real_close_delay", 0L);
    }

    @Override // com.applovin.impl.sdk.ad.b, com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.g4
    public boolean isOpenMeasurementEnabled() {
        return getBooleanFromAdObject("omsdk_enabled", Boolean.TRUE) && this.f9192w != null;
    }

    public a8 j1() {
        return this.f9187r;
    }

    @Override // com.applovin.impl.sdk.ad.b
    public Uri k0() {
        f8 f8VarM1 = m1();
        if (f8VarM1 != null) {
            return f8VarM1.e();
        }
        return null;
    }

    public e8 l1() {
        return this.f9189t;
    }

    public f8 m1() {
        Long lF = s0.f(this.sdk);
        return this.f9189t.a(lF != null ? lF.longValue() : 0L);
    }

    public boolean n1() {
        return h1() != null;
    }

    public boolean o1() {
        return getBooleanFromAdObject("vast_immediate_ad_load", Boolean.TRUE);
    }

    public void p1() {
        j5 j5Var = this.synchronizedAdObject;
        if (j5Var != null) {
            j5Var.c("vast_is_streaming");
            return;
        }
        synchronized (this.adObjectLock) {
            this.adObject.remove("vast_is_streaming");
        }
    }

    public boolean q1() {
        return getBooleanFromAdObject("cache_companion_ad", Boolean.TRUE);
    }

    public boolean r1() {
        return getBooleanFromAdObject("cache_video", Boolean.TRUE);
    }

    public boolean s1() {
        return getBooleanFromAdObject("vast_fire_click_trackers_on_html_clicks", Boolean.FALSE);
    }

    public boolean t1() {
        return getBooleanFromAdObject("iopms", Boolean.FALSE);
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public String toString() {
        return "VastAd{title='" + this.f9185p + "', adDescription='" + this.f9186q + "', systemInfo=" + this.f9187r + ", videoCreative=" + this.f9189t + ", companionAd=" + this.f9190u + ", adVerifications=" + this.f9192w + ", impressionTrackers=" + this.f9194y + ", errorTrackers=" + this.f9195z + '}';
    }

    public boolean u1() {
        return getBooleanFromAdObject("iopmsfsr", Boolean.TRUE);
    }

    @Override // com.applovin.impl.sdk.ad.b
    public boolean w0() {
        return getBooleanFromFullResponse("is_persisted_ad", false);
    }

    @Override // com.applovin.impl.sdk.ad.b
    public boolean z0() {
        return getBooleanFromAdObject("video_clickable", Boolean.FALSE) && b1() != null;
    }

    private r7(b bVar) {
        super(bVar.f9196a, bVar.f9197b, bVar.f9198c);
        this.f9185p = bVar.f9200e;
        this.f9187r = bVar.f9202g;
        this.f9186q = bVar.f9201f;
        this.f9189t = bVar.f9203h;
        this.f9190u = bVar.f9204i;
        this.f9192w = bVar.f9205j;
        this.f9194y = bVar.f9206k;
        this.f9195z = bVar.l;
        this.f9193x = new n4(this);
        Uri uriK0 = k0();
        if (uriK0 != null) {
            this.f9191v = uriK0.toString();
        } else {
            this.f9191v = "";
        }
        this.f9188s = bVar.f9199d;
    }

    public Set a(d dVar, String[] strArr) {
        this.sdk.Q();
        if (com.applovin.impl.sdk.p.a()) {
            this.sdk.Q().a("VastAd", "Retrieving trackers of type '" + dVar + "' and events '" + Arrays.toString(strArr) + "'...");
        }
        if (dVar == d.IMPRESSION) {
            return this.f9194y;
        }
        if (dVar == d.VIDEO_CLICK) {
            return k1();
        }
        if (dVar == d.COMPANION_CLICK) {
            return d1();
        }
        if (dVar == d.VIDEO) {
            return a(c.VIDEO, strArr);
        }
        if (dVar == d.COMPANION) {
            return a(c.COMPANION_AD, strArr);
        }
        if (dVar == d.INDUSTRY_ICON_CLICK) {
            return h1().b();
        }
        if (dVar == d.INDUSTRY_ICON_IMPRESSION) {
            return h1().f();
        }
        if (dVar == d.ERROR) {
            return this.f9195z;
        }
        this.sdk.Q();
        if (com.applovin.impl.sdk.p.a()) {
            this.sdk.Q().b("VastAd", "Failed to retrieve trackers of invalid type '" + dVar + "' and events '" + Arrays.toString(strArr) + "'");
        }
        return Collections.EMPTY_SET;
    }

    public t7 a1() {
        return this.f9192w;
    }

    @Override // com.applovin.impl.sdk.ad.b, com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.g4
    public n4 getAdEventTracker() {
        return this.f9193x;
    }

    @Override // com.applovin.impl.sdk.ad.b
    public void C0() {
    }

    private Set a(c cVar, String[] strArr) {
        Map mapD;
        u7 u7Var;
        e8 e8Var;
        if (strArr != null && strArr.length > 0) {
            if (cVar == c.VIDEO && (e8Var = this.f9189t) != null) {
                mapD = e8Var.e();
            } else {
                mapD = (cVar != c.COMPANION_AD || (u7Var = this.f9190u) == null) ? null : u7Var.d();
            }
            HashSet hashSet = new HashSet();
            if (mapD != null && !mapD.isEmpty()) {
                for (String str : strArr) {
                    if (mapD.containsKey(str)) {
                        hashSet.addAll((Collection) mapD.get(str));
                    }
                }
            }
            return Collections.unmodifiableSet(hashSet);
        }
        return Collections.EMPTY_SET;
    }

    public static r7 a(JSONObject jSONObject, com.applovin.impl.sdk.l lVar) {
        if (jSONObject == null) {
            return null;
        }
        b bVar = new b();
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "full_response", (JSONObject) null);
        if (jSONObject2 == null) {
            return null;
        }
        bVar.f9197b = jSONObject2;
        JSONObject jSONObject3 = JsonUtils.getJSONObject(JsonUtils.getJSONArray(jSONObject2, com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS, new JSONArray()), 0, (JSONObject) null);
        if (jSONObject3 == null) {
            return null;
        }
        bVar.f9196a = jSONObject3;
        bVar.f9198c = lVar;
        bVar.f9199d = JsonUtils.getLong(jSONObject, "created_at_millis", 0L);
        bVar.f9200e = JsonUtils.getString(jSONObject, "title", "");
        bVar.f9201f = JsonUtils.getString(jSONObject, "ad_description", "");
        bVar.f9202g = a8.a(JsonUtils.getJSONObject(jSONObject, "system_info", (JSONObject) null), lVar);
        bVar.f9203h = e8.a(JsonUtils.getJSONObject(jSONObject, "video_creative", (JSONObject) null), lVar);
        bVar.f9204i = u7.a(JsonUtils.getJSONObject(jSONObject, "companion_ad", (JSONObject) null), lVar);
        bVar.f9205j = t7.a(JsonUtils.getJSONObject(jSONObject, "ad_verifications", (JSONObject) null), lVar);
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "impression_trackers", new JSONArray());
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            b8 b8VarA = b8.a(JsonUtils.getJSONObject(jSONArray, i10, (JSONObject) null), lVar);
            if (b8VarA != null) {
                hashSet.add(b8VarA);
            }
        }
        bVar.f9206k = hashSet;
        JSONArray jSONArray2 = JsonUtils.getJSONArray(jSONObject, "error_trackers", new JSONArray());
        HashSet hashSet2 = new HashSet();
        for (int i11 = 0; i11 < jSONArray2.length(); i11++) {
            b8 b8VarA2 = b8.a(JsonUtils.getJSONObject(jSONArray2, i11, (JSONObject) null), lVar);
            if (b8VarA2 != null) {
                hashSet2.add(b8VarA2);
            }
        }
        bVar.l = hashSet2;
        r7 r7Var = new r7(bVar);
        JSONObject jSONObject4 = JsonUtils.getJSONObject(jSONObject, "cached_ad_html_resources_urls", new JSONObject());
        Iterator<String> itKeys = jSONObject4.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String string = JsonUtils.getString(jSONObject4, next, null);
            if (!TextUtils.isEmpty(next) && !TextUtils.isEmpty(string)) {
                r7Var.a(next, string);
            }
        }
        return r7Var;
    }

    @Override // com.applovin.impl.s4
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putLong(jSONObject, "created_at_millis", this.f9188s);
        JsonUtils.putString(jSONObject, "title", this.f9185p);
        JsonUtils.putString(jSONObject, "ad_description", this.f9186q);
        a8 a8Var = this.f9187r;
        if (a8Var != null) {
            JsonUtils.putJSONObject(jSONObject, "system_info", a8Var.a());
        }
        e8 e8Var = this.f9189t;
        if (e8Var != null) {
            JsonUtils.putJSONObject(jSONObject, "video_creative", e8Var.a());
        }
        u7 u7Var = this.f9190u;
        if (u7Var != null) {
            JsonUtils.putJSONObject(jSONObject, "companion_ad", u7Var.a());
        }
        t7 t7Var = this.f9192w;
        if (t7Var != null) {
            JsonUtils.putJSONObject(jSONObject, "ad_verifications", t7Var.a());
        }
        if (this.f9194y != null) {
            JSONArray jSONArray = new JSONArray();
            Iterator it = this.f9194y.iterator();
            while (it.hasNext()) {
                jSONArray.put(((b8) it.next()).a());
            }
            JsonUtils.putJsonArray(jSONObject, "impression_trackers", jSONArray);
        }
        if (this.f9195z != null) {
            JSONArray jSONArray2 = new JSONArray();
            Iterator it2 = this.f9195z.iterator();
            while (it2.hasNext()) {
                jSONArray2.put(((b8) it2.next()).a());
            }
            JsonUtils.putJsonArray(jSONObject, "error_trackers", jSONArray2);
        }
        JSONObject jSONObject2 = new JSONObject();
        for (Map.Entry entry : l().entrySet()) {
            JsonUtils.putString(jSONObject2, (String) entry.getKey(), (String) entry.getValue());
        }
        JsonUtils.putJSONObject(jSONObject, "cached_ad_html_resources_urls", jSONObject2);
        j5 j5Var = this.synchronizedFullResponse;
        if (j5Var != null) {
            JsonUtils.putJSONObject(jSONObject, "full_response", j5Var.a());
            return jSONObject;
        }
        synchronized (this.fullResponseLock) {
            JsonUtils.putJSONObject(jSONObject, "full_response", this.fullResponse);
        }
        return jSONObject;
    }
}
