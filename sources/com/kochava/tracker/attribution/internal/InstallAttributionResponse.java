package com.kochava.tracker.attribution.internal;

import com.kochava.core.json.internal.JsonObject;
import com.kochava.core.json.internal.JsonObjectApi;
import com.kochava.tracker.attribution.InstallAttribution;
import com.zg.adlib.storage.AppPreferencesKeys;

/* JADX INFO: loaded from: classes5.dex */
public final class InstallAttributionResponse implements InstallAttributionResponseApi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonObjectApi f28100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f28101b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f28102c;
    public final boolean d;

    public InstallAttributionResponse() {
        this.f28100a = JsonObject.w();
        this.f28101b = 0L;
        this.f28102c = "";
        this.d = false;
    }

    public static InstallAttributionResponse a(JsonObjectApi jsonObjectApi) {
        return new InstallAttributionResponse(jsonObjectApi.k("raw", true), jsonObjectApi.n("retrieved_time_millis", 0L).longValue(), jsonObjectApi.getString(AppPreferencesKeys.DEVICE_ID, ""), jsonObjectApi.j("first_install", Boolean.FALSE).booleanValue());
    }

    public final InstallAttribution b() {
        boolean zC = c();
        JsonObjectApi jsonObjectApi = this.f28100a;
        return new InstallAttribution(jsonObjectApi, zC && jsonObjectApi.length() > 0 && !jsonObjectApi.getString("network_id", "").isEmpty(), this.d);
    }

    public final boolean c() {
        return this.f28101b > 0;
    }

    public InstallAttributionResponse(JsonObjectApi jsonObjectApi, long j, String str, boolean z2) {
        this.f28100a = jsonObjectApi;
        this.f28101b = j;
        this.f28102c = str;
        this.d = z2;
    }
}
