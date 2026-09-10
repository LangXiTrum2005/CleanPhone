package com.applovin.impl;

import com.adjust.sdk.Constants;
import com.applovin.impl.sdk.utils.JsonUtils;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final JSONObject f8058a;

    public h1(JSONObject jSONObject) {
        this.f8058a = jSONObject;
    }

    public Integer a() {
        return JsonUtils.getInteger(this.f8058a, "dark_mode_toolbar_color", null);
    }

    public String b() {
        return JsonUtils.getString(this.f8058a, "digital_asset_link_url", null);
    }

    public Boolean c() {
        return JsonUtils.getBoolean(this.f8058a, "instant_apps_enabled", null);
    }

    public String d() {
        return JsonUtils.getString(this.f8058a, Constants.REFERRER, null);
    }

    public Integer e() {
        return JsonUtils.getInteger(this.f8058a, "session_url_relation", null);
    }

    public Integer f() {
        return JsonUtils.getInteger(this.f8058a, "share_state", null);
    }

    public Boolean g() {
        return JsonUtils.getBoolean(this.f8058a, "should_show_title", null);
    }

    public Integer h() {
        return JsonUtils.getInteger(this.f8058a, "toolbar_color", null);
    }

    public Boolean i() {
        return JsonUtils.getBoolean(this.f8058a, "url_bar_hiding_enabled", null);
    }
}
