package com.applovin.impl;

import android.content.Context;
import com.startapp.simple.bloomfilter.codec.IOUtils;

/* JADX INFO: renamed from: com.applovin.impl.p0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0955p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final a f11436a = new a("Age Restricted User", z4.r);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a f11437b = new a("Has User Consent", z4.q);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final a f11438c = new a("\"Do Not Sell\"", z4.s);

    /* JADX INFO: renamed from: com.applovin.impl.p0$a */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f11439a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final z4 f11440b;

        public a(String str, z4 z4Var) {
            this.f11439a = str;
            this.f11440b = z4Var;
        }

        public Boolean b(Context context) {
            if (context != null) {
                return (Boolean) a5.a(this.f11440b, (Object) null, context);
            }
            com.applovin.impl.sdk.o.h("AppLovinSdk", "Failed to get value for key: " + this.f11440b);
            return null;
        }

        public String a() {
            return this.f11439a;
        }

        public String a(Context context) {
            Boolean boolB = b(context);
            return boolB != null ? boolB.toString() : "No value set";
        }
    }

    public static a a() {
        return f11438c;
    }

    public static a b() {
        return f11437b;
    }

    public static a c() {
        return f11436a;
    }

    public static boolean a(boolean z2, Context context) {
        return a(z4.s, Boolean.valueOf(z2), context);
    }

    public static boolean b(boolean z2, Context context) {
        return a(z4.q, Boolean.valueOf(z2), context);
    }

    public static String a(Context context) {
        return a(f11437b, context) + a(f11438c, context);
    }

    private static boolean a(z4 z4Var, Boolean bool, Context context) {
        if (context == null) {
            com.applovin.impl.sdk.o.h("AppLovinSdk", "Failed to update compliance value for key: " + z4Var);
            return false;
        }
        try {
            Boolean bool2 = (Boolean) a5.a(z4Var, (Object) null, context);
            a5.b(z4Var, bool, context);
            return bool2 == null || bool2 != bool;
        } catch (Throwable th) {
            com.applovin.impl.sdk.o.c("ComplianceManager", "Unable to update compliance", th);
            com.applovin.impl.sdk.k kVar = com.applovin.impl.sdk.k.C0;
            if (kVar != null) {
                kVar.D().a("ComplianceManager", "updateCompliance", th);
            }
            return false;
        }
    }

    private static String a(a aVar, Context context) {
        return IOUtils.LINE_SEPARATOR_UNIX + aVar.f11439a + " - " + aVar.a(context);
    }
}
