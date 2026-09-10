package com.kochava.tracker.deeplinks.internal;

import com.kochava.core.json.internal.JsonObject;

/* JADX INFO: loaded from: classes5.dex */
public final class InstantAppDeeplink implements InstantAppDeeplinkApi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f28159b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f28160c;

    public InstantAppDeeplink(String str, String str2, long j) {
        this.f28158a = str;
        this.f28159b = str2;
        this.f28160c = j;
    }

    @Override // com.kochava.tracker.deeplinks.internal.InstantAppDeeplinkApi
    public final JsonObject toJson() {
        JsonObject jsonObjectW = JsonObject.w();
        jsonObjectW.g("install_app_id", this.f28158a);
        jsonObjectW.g("install_url", this.f28159b);
        jsonObjectW.B(this.f28160c, "install_time");
        return jsonObjectW;
    }
}
