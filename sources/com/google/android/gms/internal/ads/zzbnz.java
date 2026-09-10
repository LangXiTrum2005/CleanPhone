package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbnz {
    public static final Intent zza(Uri uri, Context context, zzayq zzayqVar, View view, zzfio zzfioVar) {
        if (uri == null) {
            return null;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.addFlags(268435456);
        intent.setData(uri);
        intent.setAction("android.intent.action.VIEW");
        return intent;
    }

    public static final ResolveInfo zzb(Intent intent, Context context, zzayq zzayqVar, View view, zzfio zzfioVar) {
        return zzc(intent, new ArrayList(), context, zzayqVar, view, zzfioVar);
    }

    public static final ResolveInfo zzc(Intent intent, ArrayList arrayList, Context context, zzayq zzayqVar, View view, zzfio zzfioVar) {
        ResolveInfo resolveInfo = null;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return null;
            }
            List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
            ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(intent, 65536);
            if (listQueryIntentActivities != null && resolveInfoResolveActivity != null) {
                for (int i2 = 0; i2 < listQueryIntentActivities.size(); i2++) {
                    if (resolveInfoResolveActivity.activityInfo.name.equals(listQueryIntentActivities.get(i2).activityInfo.name)) {
                        resolveInfo = resolveInfoResolveActivity;
                        break;
                    }
                }
            }
            arrayList.addAll(listQueryIntentActivities);
            return resolveInfo;
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(th, "OpenSystemBrowserHandler.getDefaultBrowserResolverForIntent");
            return resolveInfo;
        }
    }

    public static final Intent zzd(Intent intent, ResolveInfo resolveInfo, Context context, zzayq zzayqVar, View view, zzfio zzfioVar) {
        Intent intent2 = new Intent(intent);
        ActivityInfo activityInfo = resolveInfo.activityInfo;
        intent2.setClassName(activityInfo.packageName, activityInfo.name);
        return intent2;
    }
}
