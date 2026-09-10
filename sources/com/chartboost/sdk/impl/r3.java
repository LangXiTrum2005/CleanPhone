package com.chartboost.sdk.impl;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class r3 {
    public JSONObject a(p3 p3Var) {
        return p3Var == null ? new JSONObject() : s2.a(s2.a("carrier-name", p3Var.d()), s2.a("mobile-country-code", p3Var.a()), s2.a("mobile-network-code", p3Var.b()), s2.a("iso-country-code", p3Var.c()), s2.a("phone-type", Integer.valueOf(p3Var.e())));
    }
}
