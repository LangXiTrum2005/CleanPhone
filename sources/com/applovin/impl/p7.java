package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.Locale;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class p7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.l f8979a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f8980b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f8981c = a(b5.l);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f8982d = a(b5.f7554m);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f8983e = (String) c5.a(b5.f7555n, (Object) null, com.applovin.impl.sdk.l.p());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f8984f = (String) c5.a(b5.f7556o, (Object) null, com.applovin.impl.sdk.l.p());

    public p7(com.applovin.impl.sdk.l lVar) {
        this.f8979a = lVar;
        a(f());
    }

    private String f() {
        if (!((Boolean) this.f8979a.a(z4.Q3)).booleanValue()) {
            this.f8979a.c(b5.f7553k);
        }
        String str = (String) this.f8979a.a(b5.f7553k);
        if (!StringUtils.isValidString(str)) {
            return null;
        }
        this.f8979a.Q();
        if (com.applovin.impl.sdk.p.a()) {
            this.f8979a.Q().a("AppLovinSdk", "Using identifier (" + str + ") from previous session");
        }
        return str;
    }

    public String a() {
        return this.f8982d;
    }

    public String b() {
        return this.f8983e;
    }

    public String c() {
        return this.f8981c;
    }

    public String d() {
        return this.f8984f;
    }

    public String e() {
        return this.f8980b;
    }

    private String a(b5 b5Var) {
        String str = (String) c5.a(b5Var, (Object) null, com.applovin.impl.sdk.l.p());
        if (StringUtils.isValidString(str)) {
            return str;
        }
        String lowerCase = UUID.randomUUID().toString().toLowerCase(Locale.US);
        c5.b(b5Var, lowerCase, com.applovin.impl.sdk.l.p());
        return lowerCase;
    }

    public void b(String str) {
        this.f8983e = str;
        c5.b(b5.f7555n, str, com.applovin.impl.sdk.l.p());
    }

    public void c(String str) {
        this.f8984f = str;
        c5.b(b5.f7556o, str, com.applovin.impl.sdk.l.p());
    }

    public void a(String str) {
        if (((Boolean) this.f8979a.a(z4.Q3)).booleanValue()) {
            this.f8979a.b(b5.f7553k, str);
        }
        this.f8980b = str;
        this.f8979a.u().b(str, a());
    }

    public static String a(com.applovin.impl.sdk.l lVar) {
        b5 b5Var = b5.f7557p;
        String str = (String) lVar.a(b5Var);
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        String strValueOf = String.valueOf(((int) (Math.random() * 100.0d)) + 1);
        lVar.b(b5Var, strValueOf);
        return strValueOf;
    }
}
