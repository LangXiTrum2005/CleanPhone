package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class c4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f7651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f7652b;

    public c4(JSONObject jSONObject, com.applovin.impl.sdk.l lVar) {
        this.f7651a = JsonUtils.getString(jSONObject, "id", "");
        this.f7652b = JsonUtils.getString(jSONObject, "price", null);
    }

    public String a() {
        return this.f7651a;
    }

    public String b() {
        return this.f7652b;
    }
}
