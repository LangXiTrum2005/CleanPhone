package com.kochava.tracker.install.internal;

import com.kochava.core.json.internal.JsonObject;
import com.kochava.core.json.internal.JsonObjectApi;
import com.smartdigimkt.b0.a;

/* JADX INFO: loaded from: classes5.dex */
public final class LastInstall implements LastInstallApi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f28233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f28234c;
    public final String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f28235e;
    public final Long f;
    public final Boolean g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f28236h;

    public LastInstall() {
        this.f28232a = null;
        this.f28233b = null;
        this.f28234c = null;
        this.d = null;
        this.f28235e = null;
        this.f = null;
        this.g = null;
        this.f28236h = 0L;
    }

    public static LastInstall a(JsonObjectApi jsonObjectApi) {
        return new LastInstall(jsonObjectApi.getString("kochava_device_id", null), jsonObjectApi.getString("kochava_app_id", null), jsonObjectApi.getString(a.s1, null), jsonObjectApi.getString("app_version", null), jsonObjectApi.getString(a.h1, null), jsonObjectApi.n("time", null), jsonObjectApi.j("sdk_disabled", null), jsonObjectApi.n("count", 0L).longValue());
    }

    @Override // com.kochava.tracker.install.internal.LastInstallApi
    public final JsonObject toJson() {
        JsonObject jsonObjectW = JsonObject.w();
        String str = this.f28232a;
        if (str != null) {
            jsonObjectW.g("kochava_device_id", str);
        }
        String str2 = this.f28233b;
        if (str2 != null) {
            jsonObjectW.g("kochava_app_id", str2);
        }
        String str3 = this.f28234c;
        if (str3 != null) {
            jsonObjectW.g(a.s1, str3);
        }
        String str4 = this.d;
        if (str4 != null) {
            jsonObjectW.g("app_version", str4);
        }
        String str5 = this.f28235e;
        if (str5 != null) {
            jsonObjectW.g(a.h1, str5);
        }
        Long l2 = this.f;
        if (l2 != null) {
            jsonObjectW.B(l2.longValue(), "time");
        }
        Boolean bool = this.g;
        if (bool != null) {
            jsonObjectW.o("sdk_disabled", bool.booleanValue());
        }
        jsonObjectW.B(this.f28236h, "count");
        return jsonObjectW;
    }

    public LastInstall(String str, String str2, String str3, String str4, String str5, Long l2, Boolean bool, long j) {
        this.f28232a = str;
        this.f28233b = str2;
        this.f28234c = str3;
        this.d = str4;
        this.f28235e = str5;
        this.f = l2;
        this.g = bool;
        this.f28236h = j;
    }
}
