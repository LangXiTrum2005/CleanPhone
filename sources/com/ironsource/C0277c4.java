package com.ironsource;

import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.c4, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class C0277c4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f28343a = "SSA_CORE.SDKController.runFunction";

    public static String a(C0295d4 c0295d4) {
        return String.format("%1$s('%2$s%3$s'%4$s)", f28343a, c0295d4.b(), a(c0295d4.c()), b(c0295d4));
    }

    private static String b(C0295d4 c0295d4) {
        return (c0295d4.d() == null || c0295d4.a() == null) ? "" : String.format(", '%1$s', '%2$s'", c0295d4.d(), c0295d4.a());
    }

    private static String a(JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.length() != 0) {
            return jSONObject.toString();
        }
        return "";
    }
}
