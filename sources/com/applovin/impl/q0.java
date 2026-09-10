package com.applovin.impl;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final a f9033a = new a("Age Restricted User", b5.f7559r);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a f9034b = new a("Has User Consent", b5.f7558q);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final a f9035c = new a("\"Do Not Sell\"", b5.f7560s);

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f9036a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final b5 f9037b;

        public a(String str, b5 b5Var) {
            this.f9036a = str;
            this.f9037b = b5Var;
        }

        public Boolean b(Context context) {
            if (context != null) {
                return (Boolean) c5.a(this.f9037b, (Object) null, context);
            }
            com.applovin.impl.sdk.p.h("AppLovinSdk", "Failed to get value for key: " + this.f9037b);
            return null;
        }

        public String a() {
            return this.f9036a;
        }

        public String a(Context context) {
            Boolean boolB = b(context);
            return boolB != null ? boolB.toString() : "No value set";
        }
    }

    public static a a() {
        return f9035c;
    }

    public static a b() {
        return f9034b;
    }

    public static a c() {
        return f9033a;
    }

    public static boolean a(boolean z10, Context context) {
        return a(b5.f7560s, Boolean.valueOf(z10), context);
    }

    public static boolean b(boolean z10, Context context) {
        return a(b5.f7558q, Boolean.valueOf(z10), context);
    }

    public static String a(Context context) {
        return a(f9034b, context) + a(f9035c, context);
    }

    private static boolean a(b5 b5Var, Boolean bool, Context context) {
        if (context == null) {
            com.applovin.impl.sdk.p.h("AppLovinSdk", "Failed to update compliance value for key: " + b5Var);
            return false;
        }
        try {
            Boolean bool2 = (Boolean) c5.a(b5Var, (Object) null, context);
            c5.b(b5Var, bool, context);
            return bool2 == null || bool2 != bool;
        } catch (Throwable th2) {
            com.applovin.impl.sdk.p.c("ComplianceManager", "Unable to update compliance", th2);
            com.applovin.impl.sdk.l lVar = com.applovin.impl.sdk.l.E0;
            if (lVar != null) {
                lVar.E().a("ComplianceManager", "updateCompliance", th2);
            }
            return false;
        }
    }

    private static String a(a aVar, Context context) {
        return "\n" + aVar.f9036a + " - " + aVar.a(context);
    }
}
