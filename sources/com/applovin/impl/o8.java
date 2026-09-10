package com.applovin.impl;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class o8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f8910a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f8913d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static String f8914e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static String f8915f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f8911b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final AtomicBoolean f8912c = new AtomicBoolean();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final AtomicBoolean f8916g = new AtomicBoolean();

    static {
        com.applovin.impl.sdk.l lVar = com.applovin.impl.sdk.l.E0;
        if (lVar != null && ((Boolean) lVar.a(z4.f10177j4)).booleanValue() && e()) {
            f8910a = (String) c5.a(b5.M, "", com.applovin.impl.sdk.l.p());
        } else {
            f8910a = "";
            c5.b(b5.M, (Object) null, com.applovin.impl.sdk.l.p());
        }
    }

    public static void a(com.applovin.impl.sdk.l lVar) {
        if (f8912c.getAndSet(true)) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new p9(1, lVar));
    }

    public static String b() {
        return f8915f;
    }

    public static String c() {
        return f8914e;
    }

    public static int d() {
        return f8913d;
    }

    public static void b(com.applovin.impl.sdk.l lVar) {
        if (f8916g.getAndSet(true)) {
            return;
        }
        PackageInfo packageInfoC = c(lVar);
        if (packageInfoC != null) {
            f8913d = packageInfoC.versionCode;
            f8914e = packageInfoC.versionName;
            f8915f = packageInfoC.packageName;
        } else {
            lVar.Q();
            if (com.applovin.impl.sdk.p.a()) {
                lVar.Q().b("WebViewDataCollector", "Failed to get WebView package info");
            }
        }
    }

    private static PackageInfo c(com.applovin.impl.sdk.l lVar) {
        PackageManager packageManager = com.applovin.impl.sdk.l.p().getPackageManager();
        if (p0.e()) {
            return WebView.getCurrentWebViewPackage();
        }
        Iterator it = lVar.c(z4.f10263u4).iterator();
        while (it.hasNext()) {
            try {
                return packageManager.getPackageInfo((String) it.next(), 0);
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void d(com.applovin.impl.sdk.l lVar) {
        try {
            synchronized (f8911b) {
                try {
                    String defaultUserAgent = WebSettings.getDefaultUserAgent(com.applovin.impl.sdk.l.p());
                    if (!TextUtils.isEmpty(defaultUserAgent)) {
                        f8910a = defaultUserAgent;
                        c5.b(b5.M, f8910a, com.applovin.impl.sdk.l.p());
                    } else {
                        lVar.Q();
                        if (com.applovin.impl.sdk.p.a()) {
                            lVar.Q().b("WebViewDataCollector", "Collected invalid user agent");
                        }
                        lVar.E().a(f2.f7860j1, "collectedInvalidUserAgent");
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            lVar.Q();
            if (com.applovin.impl.sdk.p.a()) {
                lVar.Q().a("WebViewDataCollector", "Failed to collect user agent", th3);
            }
            lVar.E().a("WebViewDataCollector", "collectUserAgent", th3);
        }
    }

    private static boolean e() {
        boolean zIsValidString;
        synchronized (f8911b) {
            zIsValidString = StringUtils.isValidString((String) c5.a(b5.M, "", com.applovin.impl.sdk.l.p()));
        }
        return zIsValidString;
    }

    public static String a() {
        String str;
        synchronized (f8911b) {
            str = f8910a;
        }
        return str;
    }
}
