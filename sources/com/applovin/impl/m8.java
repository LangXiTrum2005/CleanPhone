package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class m8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f8413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f8414b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f8415c;

    public m8(JSONObject jSONObject) {
        this.f8413a = JsonUtils.getString(jSONObject, "user_type", "all");
        this.f8414b = JsonUtils.getString(jSONObject, "device_type", "all");
        this.f8415c = JsonUtils.getStringList(jSONObject, "segments", null);
    }

    public String a() {
        return this.f8413a;
    }

    public String b() {
        return this.f8414b;
    }

    public List c() {
        return this.f8415c;
    }
}
