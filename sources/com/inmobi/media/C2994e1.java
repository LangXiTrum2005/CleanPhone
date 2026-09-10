package com.inmobi.media;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.e1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C2994e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f23537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f23538b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f23539c;
    public static final String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final HashMap f23540e = new HashMap();
    public static final byte f;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v7 */
    static {
        PackageManager packageManager;
        byte b2 = 2;
        f = (byte) 2;
        Context contextD = Uc.d();
        String strValueOf = null;
        if (contextD != null) {
            try {
                packageManager = contextD.getPackageManager();
            } catch (Exception unused) {
            }
        } else {
            packageManager = null;
        }
        ApplicationInfo applicationInfo = packageManager != null ? packageManager.getApplicationInfo(contextD.getPackageName(), 128) : null;
        if (applicationInfo != null) {
            String str = applicationInfo.packageName;
            f23537a = str;
            d = applicationInfo.loadLabel(packageManager).toString();
            Intrinsics.c(str);
            f23538b = packageManager.getInstallerPackageName(str);
        }
        PackageInfo packageInfo = packageManager != null ? packageManager.getPackageInfo(contextD.getPackageName(), 128) : null;
        if (packageInfo != null && ((strValueOf = packageInfo.versionName) == null || strValueOf.length() == 0)) {
            strValueOf = Build.VERSION.SDK_INT < 28 ? String.valueOf(packageInfo.versionCode) : String.valueOf(packageInfo.getLongVersionCode());
        }
        if (B2.a(strValueOf)) {
            f23539c = strValueOf;
        }
        try {
            b2 = L3.f22938a.H() ? !NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted() : 0;
        } catch (Error | Exception unused2) {
        }
        f = b2;
        String str2 = f23537a;
        if (str2 != null) {
            f23540e.put("u-appbid", str2);
        }
        String str3 = d;
        if (str3 != null) {
            f23540e.put("u-appdnm", str3);
        }
        String str4 = f23539c;
        if (str4 != null) {
            f23540e.put("u-appver", str4);
        }
        f23540e.put("u-appsecure", String.valueOf((int) b2));
    }
}
