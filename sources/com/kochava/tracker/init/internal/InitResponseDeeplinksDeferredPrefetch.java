package com.kochava.tracker.init.internal;

import com.kochava.core.json.internal.JsonObject;
import com.kochava.core.json.internal.JsonObjectApi;
import com.smartdigimkt.m6.a;

/* JADX INFO: loaded from: classes5.dex */
public final class InitResponseDeeplinksDeferredPrefetch implements InitResponseDeeplinksDeferredPrefetchApi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f28192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f28193b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final JsonObjectApi f28194c;

    public InitResponseDeeplinksDeferredPrefetch(boolean z2, String str, JsonObjectApi jsonObjectApi) {
        this.f28192a = z2;
        this.f28193b = str;
        this.f28194c = jsonObjectApi;
    }

    @Override // com.kochava.tracker.init.internal.InitResponseDeeplinksDeferredPrefetchApi
    public final JsonObject toJson() {
        JsonObject jsonObjectW = JsonObject.w();
        jsonObjectW.o("match", this.f28192a);
        String str = this.f28193b;
        if (str != null) {
            jsonObjectW.g("detail", str);
        }
        JsonObjectApi jsonObjectApi = this.f28194c;
        if (jsonObjectApi != null) {
            jsonObjectW.r(a.r.j, jsonObjectApi);
        }
        return jsonObjectW;
    }
}
