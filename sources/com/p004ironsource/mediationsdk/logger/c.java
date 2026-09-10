package com.p004ironsource.mediationsdk.logger;

import com.applovin.sdk.AppLovinEventTypes;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.p004ironsource.q9;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private IronSourceLogger.IronSourceTag f25948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f25949b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f25950c;
    private int d;

    public c(IronSourceLogger.IronSourceTag ironSourceTag, String str, String str2, int i2) {
        this.f25948a = ironSourceTag;
        this.f25949b = str;
        this.f25950c = str2;
        this.d = i2;
    }

    public int a() {
        return this.d;
    }

    public JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("timestamp", this.f25949b);
            jSONObject.put("tag", this.f25948a);
            jSONObject.put(AppLovinEventTypes.USER_COMPLETED_LEVEL, this.d);
            jSONObject.put(PglCryptUtils.KEY_MESSAGE, this.f25950c);
            return jSONObject;
        } catch (JSONException e2) {
            q9.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
            return jSONObject;
        }
    }
}
