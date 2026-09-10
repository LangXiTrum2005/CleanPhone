package com.bytedance.sdk.openadsdk.core.ri;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import arytenoidectomy.marial;
import com.bytedance.sdk.component.utils.ac;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class ri {
    private static Boolean lr;
    private static String ri;

    public static int lr(Context context) {
        try {
            return !TextUtils.isEmpty(ri(context)) ? 1 : 0;
        } catch (Throwable unused) {
        }
    }

    public static String ri(Context context) {
        String str = ri;
        if (str != null) {
            return str;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
            ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(intent, 0);
            String str2 = resolveInfoResolveActivity != null ? resolveInfoResolveActivity.activityInfo.packageName : null;
            List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 0);
            ArrayList arrayList = new ArrayList();
            for (ResolveInfo resolveInfo : listQueryIntentActivities) {
                Intent intent2 = new Intent();
                intent2.setAction("android.support.customtabs.action.CustomTabsService");
                intent2.setPackage(resolveInfo.activityInfo.packageName);
                if (packageManager.resolveService(intent2, 0) != null) {
                    arrayList.add(resolveInfo.activityInfo.packageName);
                }
            }
            if (arrayList.isEmpty()) {
                ri = null;
            } else if (TextUtils.isEmpty(str2) || ri(context, intent) || !arrayList.contains(str2)) {
                ri = (String) arrayList.get(0);
            } else {
                ri = str2;
            }
        } catch (Throwable th) {
            ac.ik("CustomTabsHelper", th.getMessage());
        }
        return ri;
    }

    private static boolean ri(Context context, Intent intent) {
        try {
            List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 64);
            if (listQueryIntentActivities.size() == 0) {
                return false;
            }
            for (ResolveInfo resolveInfo : listQueryIntentActivities) {
                IntentFilter intentFilter = resolveInfo.filter;
                if (intentFilter != null && intentFilter.countDataAuthorities() != 0 && intentFilter.countDataPaths() != 0 && resolveInfo.activityInfo != null) {
                    return true;
                }
            }
        } catch (RuntimeException unused) {
        }
        return false;
    }

    public static int ri() {
        Boolean bool = lr;
        return (bool != null && bool.booleanValue()) ? 1 : 0;
    }

    public static void ri(Context context, String str, marial marialVar, Uri uri) {
        marialVar.f14372attabal.setPackage(str);
        marialVar.attabal(context, uri);
    }
}
