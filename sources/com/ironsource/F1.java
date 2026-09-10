package com.ironsource;

import java.util.HashSet;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class F1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f26045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashSet<String> f26046b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f26047c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f26048d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f26049e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f26050f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f26051g;

    public F1(JSONObject applicationCrashReporterSettings) throws JSONException {
        kotlin.jvm.internal.n.f(applicationCrashReporterSettings, "applicationCrashReporterSettings");
        this.f26045a = applicationCrashReporterSettings.optBoolean("enabled", false);
        List<String> listB = C0391ia.b(applicationCrashReporterSettings.optJSONArray(H1.f26218b));
        this.f26046b = listB != null ? xj.n.M0(listB) : null;
        String strOptString = applicationCrashReporterSettings.optString(H1.f26219c);
        kotlin.jvm.internal.n.e(strOptString, "applicationCrashReporter…(CRASHREPORTER_URL_FIELD)");
        this.f26047c = strOptString;
        String strOptString2 = applicationCrashReporterSettings.optString(H1.f26220d);
        kotlin.jvm.internal.n.e(strOptString2, "applicationCrashReporter…SHREPORTER_KEYWORD_FIELD)");
        this.f26048d = strOptString2;
        this.f26049e = applicationCrashReporterSettings.optBoolean(H1.f26221e, false);
        this.f26050f = applicationCrashReporterSettings.optInt("timeout", 5000);
        this.f26051g = applicationCrashReporterSettings.optBoolean(H1.f26223g, false);
    }

    public final int a() {
        return this.f26050f;
    }

    public final HashSet<String> b() {
        return this.f26046b;
    }

    public final String c() {
        return this.f26048d;
    }

    public final String d() {
        return this.f26047c;
    }

    public final boolean e() {
        return this.f26049e;
    }

    public final boolean f() {
        return this.f26045a;
    }

    public final boolean g() {
        return this.f26051g;
    }
}
