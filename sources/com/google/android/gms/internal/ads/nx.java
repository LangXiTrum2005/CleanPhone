package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class nx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f18005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18006b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f18007c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f18008d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f18009e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f18010f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f18011g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final JSONObject f18012h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f18013i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f18014j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f18015k;
    public final boolean l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f18016m;

    public nx(JSONObject jSONObject) {
        Long lValueOf;
        Long lValueOf2 = -1L;
        this.f18010f = jSONObject.optString("url");
        this.f18006b = jSONObject.optString("base_uri");
        this.f18007c = jSONObject.optString("post_parameters");
        this.f18008d = a(jSONObject.optString("drt_include"));
        this.f18016m = jSONObject.optString("content_type");
        this.l = a(jSONObject.optString("use_compression"));
        this.f18009e = a(jSONObject.optString("cookies_include", com.ironsource.mediationsdk.metadata.a.f29610g));
        jSONObject.optString("request_id");
        jSONObject.optString("type");
        String strOptString = jSONObject.optString("errors");
        this.f18005a = strOptString == null ? null : Arrays.asList(strOptString.split(","));
        this.f18011g = jSONObject.optInt("valid", 0) == 1 ? -2 : 1;
        jSONObject.optString("fetched_ad");
        jSONObject.optBoolean("render_test_ad_label");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("preprocessor_flags");
        this.f18012h = jSONObjectOptJSONObject == null ? new JSONObject() : jSONObjectOptJSONObject;
        jSONObject.optString("analytics_query_ad_event_id");
        jSONObject.optBoolean("is_analytics_logging_enabled");
        this.f18013i = jSONObject.optString("pool_key");
        String strOptString2 = jSONObject.optString("start_time");
        if (TextUtils.isEmpty(strOptString2)) {
            lValueOf = lValueOf2;
        } else {
            try {
                lValueOf = Long.valueOf(strOptString2);
            } catch (NumberFormatException unused) {
                lValueOf = lValueOf2;
            }
        }
        this.f18014j = lValueOf.longValue();
        String strOptString3 = jSONObject.optString("end_time");
        if (!TextUtils.isEmpty(strOptString3)) {
            try {
                lValueOf2 = Long.valueOf(strOptString3);
            } catch (NumberFormatException unused2) {
            }
        }
        this.f18015k = lValueOf2.longValue();
    }

    public static boolean a(String str) {
        if (str != null) {
            return str.equals("1") || str.equals(com.ironsource.mediationsdk.metadata.a.f29610g);
        }
        return false;
    }
}
