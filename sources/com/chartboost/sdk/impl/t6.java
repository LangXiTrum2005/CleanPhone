package com.chartboost.sdk.impl;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.LocaleList;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class t6 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f15177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Application f15178c;
    public static f6 d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t6 f15176a = new t6();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static String f15179e = "not available";
    public static String f = "not available";
    public static String g = "not available";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static String f15180h = "not available";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static String f15181i = "not available";
    public static String j = "not available";
    public static String k = "not available";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static String f15182l = "not available";
    public static String m = "unknown";

    public final void a(Application app, f6 dm) {
        Intrinsics.f(app, "app");
        Intrinsics.f(dm, "dm");
        if (f15177b) {
            return;
        }
        f15178c = app;
        d = dm;
        try {
            String MANUFACTURER = Build.MANUFACTURER;
            Intrinsics.e(MANUFACTURER, "MANUFACTURER");
            f15179e = MANUFACTURER;
            String MODEL = Build.MODEL;
            Intrinsics.e(MODEL, "MODEL");
            f = MODEL;
            g = "Android " + Build.VERSION.RELEASE;
            f15180h = n() ? "Amazon" : com.p004ironsource.d9.d;
            String country = Locale.getDefault().getCountry();
            if (country == null) {
                country = "Cannot retrieve country";
            }
            f15181i = country;
            String strM = m();
            if (strM == null) {
                strM = "Cannot retrieve language";
            }
            j = strM;
            f15182l = g3.a();
            String strA = a(app);
            if (strA == null) {
                strA = "Unknown version";
            }
            k = strA;
        } catch (Exception e2) {
            za.b("Failed to initialize EnvironmentManager", e2);
        }
        f15177b = true;
    }

    public final String b() {
        a();
        return k;
    }

    public final Application c() {
        return f15178c;
    }

    public final String d() {
        a();
        return f15181i;
    }

    public final String e() {
        a();
        return m;
    }

    public final String f() {
        a();
        return j;
    }

    public final String g() {
        a();
        return f15179e;
    }

    public final String h() {
        a();
        return f;
    }

    public final String i() {
        a();
        return g;
    }

    public final String j() {
        a();
        return f15180h;
    }

    public final String k() {
        a();
        return f15182l;
    }

    public final f6 l() {
        a();
        return d;
    }

    public final String m() {
        try {
            return LocaleList.getDefault().get(0).getLanguage();
        } catch (Exception e2) {
            za.a("Cannot retrieve language", e2);
            return null;
        }
    }

    public final boolean n() {
        return "Amazon".equalsIgnoreCase(Build.MANUFACTURER);
    }

    public final boolean o() {
        return f15177b;
    }

    public final String a(Context context) {
        PackageInfo packageInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            String packageName = context.getPackageName();
            if (packageManager != null && packageName != null) {
                if (Build.VERSION.SDK_INT >= 33) {
                    packageInfo = packageManager.getPackageInfo(packageName, PackageManager.PackageInfoFlags.of(0L));
                } else {
                    packageInfo = packageManager.getPackageInfo(packageName, 0);
                }
                if (packageInfo != null) {
                    return packageInfo.versionName;
                }
            }
        } catch (Exception e2) {
            za.b("Exception while retrieving appVersion: " + e2.getMessage(), (Throwable) null, 2, (Object) null);
        }
        return null;
    }

    public final void a() {
        if (f15177b) {
            return;
        }
        za.b("EnvironmentManager not initialized. Call init() first.", (Throwable) null, 2, (Object) null);
    }
}
