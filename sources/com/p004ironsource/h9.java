package com.p004ironsource;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class h9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f25224a = "SSA_CORE.SDKController.runFunction";

    public static String a(i9 i9Var) {
        return String.format("%1$s('%2$s%3$s'%4$s)", f25224a, i9Var.b(), a(i9Var.c()), b(i9Var));
    }

    private static String b(i9 i9Var) {
        return (i9Var.d() == null || i9Var.a() == null) ? "" : String.format(", '%1$s', '%2$s'", i9Var.d(), i9Var.a());
    }

    private static String a(JSONObject jSONObject) {
        return (jSONObject == null || jSONObject.length() == 0) ? "" : jSONObject.toString();
    }
}
