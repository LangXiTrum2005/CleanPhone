package com.kochava.tracker.samsungreferrer;

import com.kochava.core.json.internal.JsonObject;
import com.kochava.core.json.internal.JsonObjectApi;

/* JADX INFO: loaded from: classes5.dex */
public final class SamsungReferrer implements SamsungReferrerApi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f28313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f28314b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f28315c;
    public final SamsungReferrerStatus d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f28316e;
    public final Long f;
    public final Long g;

    public SamsungReferrer(long j, int i2, double d, SamsungReferrerStatus samsungReferrerStatus, String str, Long l2, Long l3) {
        this.f28313a = j;
        this.f28314b = i2;
        this.f28315c = d;
        this.d = samsungReferrerStatus;
        this.f28316e = str;
        this.f = l2;
        this.g = l3;
    }

    public static SamsungReferrer b(JsonObjectApi jsonObjectApi) {
        long jLongValue = jsonObjectApi.n("gather_time_millis", 0L).longValue();
        int iIntValue = jsonObjectApi.s(0, "attempt_count").intValue();
        double dDoubleValue = jsonObjectApi.f("duration", Double.valueOf(0.0d)).doubleValue();
        String string = jsonObjectApi.getString("status", "");
        for (SamsungReferrerStatus samsungReferrerStatus : SamsungReferrerStatus.values()) {
            if (samsungReferrerStatus.X.equals(string)) {
                return new SamsungReferrer(jLongValue, iIntValue, dDoubleValue, samsungReferrerStatus, jsonObjectApi.getString("referrer", null), jsonObjectApi.n("install_begin_time", null), jsonObjectApi.n("referrer_click_time", null));
            }
        }
        samsungReferrerStatus = SamsungReferrerStatus.NotGathered;
        return new SamsungReferrer(jLongValue, iIntValue, dDoubleValue, samsungReferrerStatus, jsonObjectApi.getString("referrer", null), jsonObjectApi.n("install_begin_time", null), jsonObjectApi.n("referrer_click_time", null));
    }

    @Override // com.kochava.tracker.samsungreferrer.SamsungReferrerApi
    public final JsonObject a() {
        JsonObject jsonObjectW = JsonObject.w();
        jsonObjectW.z(this.f28314b, "attempt_count");
        jsonObjectW.q(this.f28315c, "duration");
        jsonObjectW.g("status", this.d.X);
        String str = this.f28316e;
        if (str != null) {
            jsonObjectW.g("referrer", str);
        }
        Long l2 = this.f;
        if (l2 != null) {
            jsonObjectW.B(l2.longValue(), "install_begin_time");
        }
        Long l3 = this.g;
        if (l3 != null) {
            jsonObjectW.B(l3.longValue(), "referrer_click_time");
        }
        return jsonObjectW;
    }

    public final JsonObject c() {
        JsonObject jsonObjectW = JsonObject.w();
        jsonObjectW.B(this.f28313a, "gather_time_millis");
        jsonObjectW.z(this.f28314b, "attempt_count");
        jsonObjectW.q(this.f28315c, "duration");
        jsonObjectW.g("status", this.d.X);
        String str = this.f28316e;
        if (str != null) {
            jsonObjectW.g("referrer", str);
        }
        Long l2 = this.f;
        if (l2 != null) {
            jsonObjectW.B(l2.longValue(), "install_begin_time");
        }
        Long l3 = this.g;
        if (l3 != null) {
            jsonObjectW.B(l3.longValue(), "referrer_click_time");
        }
        return jsonObjectW;
    }
}
