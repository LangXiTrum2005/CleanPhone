package com.google.android.gms.internal.ads;

import com.applovin.sdk.AppLovinEventParameters;
import com.google.android.gms.ads.internal.zzt;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class nt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f17944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f17945b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f17946c;

    public nt(JSONObject jSONObject) throws JSONException {
        jSONObject.optString("id");
        JSONArray jSONArray = jSONObject.getJSONArray("adapters");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            arrayList.add(jSONArray.getString(i10));
        }
        this.f17944a = Collections.unmodifiableList(arrayList);
        jSONObject.optString("allocation_id", null);
        zzt.zzx();
        pt.a("clickurl", jSONObject);
        zzt.zzx();
        pt.a("imp_urls", jSONObject);
        zzt.zzx();
        pt.a("downloaded_imp_urls", jSONObject);
        zzt.zzx();
        pt.a("fill_urls", jSONObject);
        zzt.zzx();
        pt.a("video_start_urls", jSONObject);
        zzt.zzx();
        pt.a("video_complete_urls", jSONObject);
        zzt.zzx();
        pt.a("video_reward_urls", jSONObject);
        jSONObject.optString(AppLovinEventParameters.CHECKOUT_TRANSACTION_IDENTIFIER);
        jSONObject.optString("valid_from_timestamp");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("ad");
        if (jSONObjectOptJSONObject != null) {
            zzt.zzx();
            pt.a("manual_impression_urls", jSONObjectOptJSONObject);
        }
        if (jSONObjectOptJSONObject != null) {
            jSONObjectOptJSONObject.toString();
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("data");
        this.f17945b = jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.toString() : null;
        if (jSONObjectOptJSONObject2 != null) {
            jSONObjectOptJSONObject2.optString("class_name");
        }
        jSONObject.optString("html_template", null);
        jSONObject.optString("ad_base_url", null);
        JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("assets");
        if (jSONObjectOptJSONObject3 != null) {
            jSONObjectOptJSONObject3.toString();
        }
        zzt.zzx();
        pt.a("template_ids", jSONObject);
        JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("ad_loader_options");
        if (jSONObjectOptJSONObject4 != null) {
            jSONObjectOptJSONObject4.toString();
        }
        this.f17946c = jSONObject.optString("response_type", null);
        jSONObject.optLong("ad_network_timeout_millis", -1L);
    }
}
