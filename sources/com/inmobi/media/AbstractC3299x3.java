package com.inmobi.media;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.x3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC3299x3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f24096a;

    public static final String a(Context context) {
        if (!L3.f22938a.F()) {
            return null;
        }
        if (context == null || f24096a != null) {
            return f24096a;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.google.com"));
            ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(intent, 0);
            String str = resolveInfoResolveActivity != null ? resolveInfoResolveActivity.activityInfo.packageName : null;
            List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 0);
            Intrinsics.e(listQueryIntentActivities, "queryIntentActivities(...)");
            ArrayList arrayList = new ArrayList();
            for (ResolveInfo resolveInfo : listQueryIntentActivities) {
                Intent intent2 = new Intent();
                intent2.setAction("android.support.customtabs.action.CustomTabsService");
                intent2.setPackage(resolveInfo.activityInfo.packageName);
                if (packageManager.resolveService(intent2, 0) != null) {
                    String packageName = resolveInfo.activityInfo.packageName;
                    Intrinsics.e(packageName, "packageName");
                    arrayList.add(packageName);
                }
            }
            if (arrayList.isEmpty()) {
                f24096a = null;
            } else if (arrayList.size() == 1) {
                f24096a = (String) arrayList.get(0);
            } else if (!TextUtils.isEmpty(str) && !a(context, intent) && CollectionsKt.o(arrayList, str)) {
                f24096a = str;
            } else if (arrayList.contains("com.android.chrome")) {
                f24096a = "com.android.chrome";
            } else if (arrayList.contains("com.chrome.beta")) {
                f24096a = "com.chrome.beta";
            } else if (arrayList.contains("com.chrome.dev")) {
                f24096a = "com.chrome.dev";
            } else if (arrayList.contains("com.google.android.apps.chrome")) {
                f24096a = "com.google.android.apps.chrome";
            }
        } catch (Exception unused) {
        }
        return f24096a;
    }

    public static boolean a(Context context, Intent intent) {
        try {
            List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 64);
            Intrinsics.e(listQueryIntentActivities, "queryIntentActivities(...)");
            for (ResolveInfo resolveInfo : listQueryIntentActivities) {
                IntentFilter intentFilter = resolveInfo.filter;
                if (intentFilter != null && intentFilter.countDataAuthorities() != 0 && intentFilter.countDataPaths() != 0 && resolveInfo.activityInfo != null) {
                    return true;
                }
            }
            return false;
        } catch (RuntimeException unused) {
            Log.e("x3", "Runtime exception while getting specialized handlers");
            return false;
        }
    }
}
