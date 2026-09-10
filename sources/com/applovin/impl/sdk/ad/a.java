package com.applovin.impl.sdk.ad;

import android.net.Uri;
import android.text.TextUtils;
import com.applovin.impl.i4;
import com.applovin.impl.j5;
import com.applovin.impl.s4;
import com.applovin.impl.sdk.l;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.unity3d.services.UnityAdsConstants;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends b implements s4 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final String f9345p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final String f9346q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final String f9347r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final i4 f9348s;

    public a(JSONObject jSONObject, JSONObject jSONObject2, l lVar) {
        super(jSONObject, jSONObject2, lVar);
        this.f9345p = d1();
        this.f9346q = h1();
        this.f9347r = g1();
        this.f9348s = new i4(this);
    }

    private String g1() {
        return getStringFromAdObject("stream_url", "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o(j5 j5Var) {
        j5Var.b("html", this.f9345p);
        j5Var.b("stream_url", this.f9347r);
    }

    @Override // com.applovin.impl.sdk.ad.b
    public boolean A0() {
        return containsKeyForAdObject("stream_url");
    }

    @Override // com.applovin.impl.sdk.ad.b
    public void C0() {
        j5 j5Var = this.synchronizedAdObject;
        if (j5Var != null) {
            j5Var.a(new d(this, 0));
            return;
        }
        synchronized (this.adObjectLock) {
            JsonUtils.putString(this.adObject, "html", this.f9345p);
            JsonUtils.putString(this.adObject, "stream_url", this.f9347r);
        }
    }

    @Override // com.applovin.impl.sdk.ad.b
    public String I() {
        return this.f9346q;
    }

    public void a(Uri uri) {
        j5 j5Var = this.synchronizedAdObject;
        if (j5Var != null) {
            j5Var.b("video", uri.toString());
            return;
        }
        synchronized (this.adObjectLock) {
            JsonUtils.putString(this.adObject, "video", uri.toString());
        }
    }

    public void b(List list) {
        String strD1 = d1();
        if (CollectionUtils.isEmpty(list) || TextUtils.isEmpty(strD1)) {
            return;
        }
        Map mapL = l();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String string = ((Uri) it.next()).toString();
            String str = (String) mapL.get(string);
            if (StringUtils.isValidString(str)) {
                strD1 = StringUtils.replace(strD1, string, str);
            }
        }
        d(strD1);
    }

    @Override // com.applovin.impl.sdk.ad.b
    public Uri b0() {
        String stringFromAdObject = getStringFromAdObject("video_click_url", "");
        return StringUtils.isValidString(stringFromAdObject) ? Uri.parse(stringFromAdObject) : b1();
    }

    public Uri b1() {
        String stringFromAdObject = getStringFromAdObject(CampaignEx.JSON_KEY_CLICK_URL, "");
        if (StringUtils.isValidString(stringFromAdObject)) {
            return Uri.parse(stringFromAdObject);
        }
        return null;
    }

    public com.applovin.impl.adview.e.a c1() {
        return a(getIntFromAdObject("expandable_style", com.applovin.impl.adview.e.a.INVISIBLE.b()));
    }

    public void d(String str) {
        j5 j5Var = this.synchronizedAdObject;
        if (j5Var != null) {
            j5Var.b("html", str);
            return;
        }
        synchronized (this.adObjectLock) {
            JsonUtils.putString(this.adObject, "html", str);
        }
    }

    public String d1() {
        return getStringFromAdObject("html", "");
    }

    public float e1() {
        return getFloatFromAdObject("mraid_close_delay_graphic", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    public String f1() {
        return this.f9347r;
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public JSONObject getOriginalFullResponse() {
        JSONObject jSONObjectDeepCopy;
        JSONObject jSONObjectA;
        j5 j5Var = this.synchronizedFullResponse;
        if (j5Var != null) {
            jSONObjectA = j5Var.a();
        } else {
            synchronized (this.fullResponseLock) {
                jSONObjectDeepCopy = JsonUtils.deepCopy(this.fullResponse);
            }
            jSONObjectA = jSONObjectDeepCopy;
        }
        JSONArray jSONArrayX = defpackage.e.x(com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS, jSONObjectA);
        if (jSONArrayX.length() > 0) {
            JSONObject jSONObject = JsonUtils.getJSONObject(jSONArrayX, 0, new JSONObject());
            JsonUtils.putString(jSONObject, "html", this.f9345p);
            JsonUtils.putString(jSONObject, "video", this.f9346q);
            JsonUtils.putString(jSONObject, "stream_url", this.f9347r);
        }
        return jSONObjectA;
    }

    public String h1() {
        return getStringFromAdObject("video", "");
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public boolean hasVideoUrl() {
        return k0() != null;
    }

    public boolean i1() {
        if (this.adObject.has("close_button_expandable_hidden")) {
            return getBooleanFromAdObject("close_button_expandable_hidden", Boolean.FALSE);
        }
        return true;
    }

    @Override // com.applovin.impl.sdk.ad.b, com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.g4
    public boolean isOpenMeasurementEnabled() {
        if (this.sdk.g0().e()) {
            return true;
        }
        return getBooleanFromAdObject("omsdk_enabled", Boolean.FALSE);
    }

    public void j1() {
        j5 j5Var = this.synchronizedAdObject;
        if (j5Var != null) {
            j5Var.c("stream_url");
            return;
        }
        synchronized (this.adObjectLock) {
            this.adObject.remove("stream_url");
        }
    }

    @Override // com.applovin.impl.sdk.ad.b
    public Uri k0() {
        String strG1 = g1();
        if (StringUtils.isValidString(strG1)) {
            return Uri.parse(strG1);
        }
        String strH1 = h1();
        if (StringUtils.isValidString(strH1)) {
            return Uri.parse(strH1);
        }
        return null;
    }

    @Override // com.applovin.impl.sdk.ad.b
    public boolean w0() {
        return getBooleanFromFullResponse("is_persisted_ad", false);
    }

    public long a1() {
        return getLongFromAdObject("ad_load_timeout_ms", 0L);
    }

    @Override // com.applovin.impl.sdk.ad.b, com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.g4
    public i4 getAdEventTracker() {
        return this.f9348s;
    }

    public static a a(JSONObject jSONObject, l lVar) {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        if (jSONObject == null || (jSONObject2 = JsonUtils.getJSONObject(jSONObject, "full_response", (JSONObject) null)) == null || (jSONObject3 = JsonUtils.getJSONObject(JsonUtils.getJSONArray(jSONObject2, com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS, new JSONArray()), 0, (JSONObject) null)) == null) {
            return null;
        }
        String string = JsonUtils.getString(jSONObject3, "html", "");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        String string2 = JsonUtils.getString(jSONObject3, "video", "");
        JsonUtils.putString(jSONObject3, "html", JsonUtils.getString(jSONObject, "original_html_source", ""));
        JsonUtils.putString(jSONObject3, "video", JsonUtils.getString(jSONObject, "original_video_uri_string", ""));
        a aVar = new a(jSONObject3, jSONObject2, lVar);
        JSONObject jSONObject4 = JsonUtils.getJSONObject(jSONObject, "cached_ad_html_resources_urls", new JSONObject());
        Iterator<String> itKeys = jSONObject4.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String string3 = JsonUtils.getString(jSONObject4, next, null);
            if (!TextUtils.isEmpty(next) && !TextUtils.isEmpty(string3)) {
                aVar.a(next, string3);
            }
        }
        aVar.d(string);
        if (StringUtils.isValidString(string2)) {
            aVar.a(Uri.parse(string2));
        }
        return aVar;
    }

    @Override // com.applovin.impl.s4
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, "original_html_source", this.f9345p);
        JsonUtils.putString(jSONObject, "original_video_uri_string", this.f9346q);
        JsonUtils.putString(jSONObject, "original_video_stream_uri_string", this.f9347r);
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
