package com.ironsource.mediationsdk.logger;

import com.applovin.sdk.AppLovinEventTypes;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.ironsource.C0474n4;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private IronSourceLogger.IronSourceTag f29595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f29596b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f29597c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f29598d;

    public b(IronSourceLogger.IronSourceTag ironSourceTag, String str, String str2, int i10) {
        this.f29595a = ironSourceTag;
        this.f29596b = str;
        this.f29597c = str2;
        this.f29598d = i10;
    }

    public int a() {
        return this.f29598d;
    }

    public JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("timestamp", this.f29596b);
            jSONObject.put(ViewHierarchyConstants.TAG_KEY, this.f29595a);
            jSONObject.put(AppLovinEventTypes.USER_COMPLETED_LEVEL, this.f29598d);
            jSONObject.put("message", this.f29597c);
            return jSONObject;
        } catch (JSONException e10) {
            C0474n4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return jSONObject;
        }
    }
}
