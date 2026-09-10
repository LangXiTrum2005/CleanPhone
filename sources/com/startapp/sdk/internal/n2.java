package com.startapp.sdk.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public abstract class n2 {
    public static boolean a(Context context, String url, boolean z2) {
        ActivityInfo activityInfo;
        ActivityInfo activityInfo2;
        Intrinsics.f(context, "context");
        Intrinsics.f(url, "url");
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(url));
        intent.addCategory("android.intent.category.BROWSABLE");
        Bundle bundle = new Bundle();
        Object obj = null;
        bundle.putBinder("android.support.customtabs.extra.SESSION", null);
        intent.putExtras(bundle);
        if (z2) {
            try {
                Intent intent2 = new Intent("android.intent.action.MAIN");
                intent2.addCategory("android.intent.category.APP_BROWSER");
                List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(intent2, 0);
                Intrinsics.e(listQueryIntentActivities, "queryIntentActivities(...)");
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : listQueryIntentActivities) {
                    ResolveInfo resolveInfo = (ResolveInfo) obj2;
                    if (resolveInfo != null && (activityInfo2 = resolveInfo.activityInfo) != null && activityInfo2.enabled && activityInfo2.exported && activityInfo2.packageName != null) {
                        arrayList.add(obj2);
                    }
                }
                List<ResolveInfo> listQueryIntentActivities2 = context.getPackageManager().queryIntentActivities(intent, 0);
                Intrinsics.e(listQueryIntentActivities2, "queryIntentActivities(...)");
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : listQueryIntentActivities2) {
                    ResolveInfo resolveInfo2 = (ResolveInfo) obj3;
                    if (resolveInfo2 != null && (activityInfo = resolveInfo2.activityInfo) != null && activityInfo.enabled && activityInfo.exported && activityInfo.packageName != null) {
                        arrayList2.add(obj3);
                    }
                }
                loop2: for (Object obj4 : arrayList) {
                    ResolveInfo resolveInfo3 = (ResolveInfo) obj4;
                    if (!arrayList2.isEmpty()) {
                        Iterator it = arrayList2.iterator();
                        while (it.hasNext()) {
                            if (resolveInfo3.activityInfo.packageName.equals(((ResolveInfo) it.next()).activityInfo.packageName)) {
                                obj = obj4;
                                break loop2;
                            }
                        }
                    }
                }
                ResolveInfo resolveInfo4 = (ResolveInfo) obj;
                if (resolveInfo4 != null) {
                    intent.setPackage(resolveInfo4.activityInfo.packageName);
                }
            } catch (Throwable th) {
                g9.a(th);
            }
        }
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        try {
            context.startActivity(intent);
            return true;
        } catch (Throwable th2) {
            g9.a(th2);
            return false;
        }
    }
}
