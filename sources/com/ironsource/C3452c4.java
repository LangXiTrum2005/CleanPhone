package com.ironsource;

import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.c4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C3452c4 {
    public static final String a = "SSA_CORE.SDKController.runFunction";

    public static String a(C3470d4 c3470d4) {
        return String.format("%1$s('%2$s%3$s'%4$s)", a, c3470d4.b(), a(c3470d4.c()), b(c3470d4));
    }

    private static String b(C3470d4 c3470d4) {
        return (c3470d4.d() == null || c3470d4.a() == null) ? "" : String.format(", '%1$s', '%2$s'", c3470d4.d(), c3470d4.a());
    }

    private static String a(JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.length() != 0) {
            return jSONObject.toString();
        }
        return "";
    }
}
