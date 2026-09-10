package com.kochava.tracker.installreferrer.internal;

import com.kochava.core.json.internal.JsonObject;
import com.kochava.core.json.internal.JsonObjectApi;

/* JADX INFO: loaded from: classes5.dex */
public final class InstallReferrer implements InstallReferrerApi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f28237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f28238b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InstallReferrerStatus f28239c;
    public final String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Long f28240e;
    public final Long f;
    public final Long g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Long f28241h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Boolean f28242i;
    public final String j;

    public InstallReferrer(int i2, double d, InstallReferrerStatus installReferrerStatus, String str, Long l2, Long l3, Long l4, Long l5, Boolean bool, String str2) {
        this.f28237a = i2;
        this.f28238b = d;
        this.f28239c = installReferrerStatus;
        this.d = str;
        this.f28240e = l2;
        this.f = l3;
        this.g = l4;
        this.f28241h = l5;
        this.f28242i = bool;
        this.j = str2;
    }

    public static InstallReferrer a(JsonObjectApi jsonObjectApi) {
        int iIntValue = jsonObjectApi.s(0, "attempt_count").intValue();
        double dDoubleValue = jsonObjectApi.f("duration", Double.valueOf(0.0d)).doubleValue();
        String string = jsonObjectApi.getString("status", "");
        for (InstallReferrerStatus installReferrerStatus : InstallReferrerStatus.values()) {
            if (installReferrerStatus.X.equals(string)) {
                return new InstallReferrer(iIntValue, dDoubleValue, installReferrerStatus, jsonObjectApi.getString("referrer", null), jsonObjectApi.n("install_begin_time", null), jsonObjectApi.n("install_begin_server_time", null), jsonObjectApi.n("referrer_click_time", null), jsonObjectApi.n("referrer_click_server_time", null), jsonObjectApi.j("google_play_instant", null), jsonObjectApi.getString("install_version", null));
            }
        }
        installReferrerStatus = InstallReferrerStatus.NotGathered;
        return new InstallReferrer(iIntValue, dDoubleValue, installReferrerStatus, jsonObjectApi.getString("referrer", null), jsonObjectApi.n("install_begin_time", null), jsonObjectApi.n("install_begin_server_time", null), jsonObjectApi.n("referrer_click_time", null), jsonObjectApi.n("referrer_click_server_time", null), jsonObjectApi.j("google_play_instant", null), jsonObjectApi.getString("install_version", null));
    }

    @Override // com.kochava.tracker.installreferrer.internal.InstallReferrerApi
    public final JsonObject toJson() {
        JsonObject jsonObjectW = JsonObject.w();
        jsonObjectW.z(this.f28237a, "attempt_count");
        jsonObjectW.q(this.f28238b, "duration");
        jsonObjectW.g("status", this.f28239c.X);
        String str = this.d;
        if (str != null) {
            jsonObjectW.g("referrer", str);
        }
        Long l2 = this.f28240e;
        if (l2 != null) {
            jsonObjectW.B(l2.longValue(), "install_begin_time");
        }
        Long l3 = this.f;
        if (l3 != null) {
            jsonObjectW.B(l3.longValue(), "install_begin_server_time");
        }
        Long l4 = this.g;
        if (l4 != null) {
            jsonObjectW.B(l4.longValue(), "referrer_click_time");
        }
        Long l5 = this.f28241h;
        if (l5 != null) {
            jsonObjectW.B(l5.longValue(), "referrer_click_server_time");
        }
        Boolean bool = this.f28242i;
        if (bool != null) {
            jsonObjectW.o("google_play_instant", bool.booleanValue());
        }
        String str2 = this.j;
        if (str2 != null) {
            jsonObjectW.g("install_version", str2);
        }
        return jsonObjectW;
    }
}
