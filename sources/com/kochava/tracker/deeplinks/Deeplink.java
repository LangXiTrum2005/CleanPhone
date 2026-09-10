package com.kochava.tracker.deeplinks;

import com.kochava.core.json.internal.JsonObject;
import com.kochava.core.json.internal.JsonObjectApi;

/* JADX INFO: loaded from: classes5.dex */
public final class Deeplink implements DeeplinkApi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JsonObjectApi f28157b;

    public Deeplink() {
        this.f28156a = "";
        JsonObject jsonObjectW = JsonObject.w();
        this.f28157b = jsonObjectW;
        jsonObjectW.g("destination", "");
    }

    public static Deeplink a(String str, JsonObjectApi jsonObjectApi) {
        return jsonObjectApi != null ? new Deeplink(str, jsonObjectApi) : new Deeplink(str, JsonObject.w());
    }

    public Deeplink(String str, JsonObjectApi jsonObjectApi) {
        String string = jsonObjectApi.getString("destination", str);
        this.f28156a = string;
        jsonObjectApi.g("destination", string);
        this.f28157b = jsonObjectApi;
    }
}
