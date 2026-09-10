package com.kochava.tracker.huaweireferrer.internal;

import com.kochava.core.json.internal.JsonObject;
import com.kochava.core.json.internal.JsonObjectApi;

/* JADX INFO: loaded from: classes5.dex */
public final class HuaweiReferrer implements HuaweiReferrerApi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f28172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f28173b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HuaweiReferrerStatus f28174c;
    public final String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Long f28175e;
    public final Long f;

    public HuaweiReferrer(int i2, double d, HuaweiReferrerStatus huaweiReferrerStatus, String str, Long l2, Long l3) {
        this.f28172a = i2;
        this.f28173b = d;
        this.f28174c = huaweiReferrerStatus;
        this.d = str;
        this.f28175e = l2;
        this.f = l3;
    }

    public static HuaweiReferrer a(JsonObjectApi jsonObjectApi) {
        int iIntValue = jsonObjectApi.s(0, "attempt_count").intValue();
        double dDoubleValue = jsonObjectApi.f("duration", Double.valueOf(0.0d)).doubleValue();
        String string = jsonObjectApi.getString("status", "");
        for (HuaweiReferrerStatus huaweiReferrerStatus : HuaweiReferrerStatus.values()) {
            if (huaweiReferrerStatus.X.equals(string)) {
                return new HuaweiReferrer(iIntValue, dDoubleValue, huaweiReferrerStatus, jsonObjectApi.getString("referrer", null), jsonObjectApi.n("install_begin_time", null), jsonObjectApi.n("referrer_click_time", null));
            }
        }
        huaweiReferrerStatus = HuaweiReferrerStatus.NotGathered;
        return new HuaweiReferrer(iIntValue, dDoubleValue, huaweiReferrerStatus, jsonObjectApi.getString("referrer", null), jsonObjectApi.n("install_begin_time", null), jsonObjectApi.n("referrer_click_time", null));
    }

    @Override // com.kochava.tracker.huaweireferrer.internal.HuaweiReferrerApi
    public final JsonObject toJson() {
        JsonObject jsonObjectW = JsonObject.w();
        jsonObjectW.z(this.f28172a, "attempt_count");
        jsonObjectW.q(this.f28173b, "duration");
        jsonObjectW.g("status", this.f28174c.X);
        String str = this.d;
        if (str != null) {
            jsonObjectW.g("referrer", str);
        }
        Long l2 = this.f28175e;
        if (l2 != null) {
            jsonObjectW.B(l2.longValue(), "install_begin_time");
        }
        Long l3 = this.f;
        if (l3 != null) {
            jsonObjectW.B(l3.longValue(), "referrer_click_time");
        }
        return jsonObjectW;
    }
}
