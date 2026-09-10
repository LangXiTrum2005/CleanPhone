package com.adcolony.sdk;

import android.app.Activity;
import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Context f8950a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static k f8951b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static boolean f8952c = false;
    static boolean d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static boolean f8953e = false;

    public static void a(AdColonyAppOptions adColonyAppOptions) {
        f8953e = adColonyAppOptions.getIsChildDirectedApp() && (!adColonyAppOptions.isPrivacyFrameworkRequiredSet(AdColonyAppOptions.COPPA) || adColonyAppOptions.getPrivacyFrameworkRequired(AdColonyAppOptions.COPPA));
    }

    public static k b() {
        if (!d()) {
            Context contextA = a();
            if (contextA == null) {
                return new k();
            }
            f8951b = new k();
            f8951b.a(new AdColonyAppOptions().a(c0.h(c0.c(contextA.getFilesDir().getAbsolutePath() + "/adc3/AppInfo"), com.smartdigimkt.f3.b.f35043u)), false);
        }
        return f8951b;
    }

    public static boolean c() {
        return f8950a != null;
    }

    public static boolean d() {
        return f8951b != null;
    }

    public static boolean e() {
        return f8952c;
    }

    public static void f() {
        b().r().j();
    }

    public static void a(Context context, AdColonyAppOptions adColonyAppOptions, boolean z2) {
        a((z2 && (context instanceof Activity)) ? ((Activity) context).getApplication() : context);
        d = true;
        if (f8951b == null) {
            f8951b = new k();
            adColonyAppOptions.b(context);
            f8951b.a(adColonyAppOptions, z2);
        } else {
            adColonyAppOptions.b(context);
            f8951b.a(adColonyAppOptions);
        }
        a(adColonyAppOptions);
        q qVarN = f8951b.n();
        qVarN.a(context);
        qVarN.b(context);
        new e0.a().a("Configuring AdColony").a(e0.d);
        f8951b.c(false);
        f8951b.x().g(false);
        f8951b.d(true);
        f8951b.x().c(false);
        f8951b.x().d(true);
    }

    public static void b(String str, j0 j0Var) {
        b().r().b(str, j0Var);
    }

    public static void a(Context context) {
        f8950a = context;
    }

    public static Context a() {
        return f8950a;
    }

    public static void a(String str, j0 j0Var) {
        b().r().a(str, j0Var);
    }

    public static j0 a(String str, j0 j0Var, boolean z2) {
        b().r().a(str, j0Var);
        return j0Var;
    }

    public static void a(String str, f1 f1Var) {
        if (f1Var == null) {
            f1Var = c0.b();
        }
        c0.a(f1Var, "m_type", str);
        b().r().c(f1Var);
    }
}
