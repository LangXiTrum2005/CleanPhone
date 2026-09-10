package com.smartdigimkt.o8;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import com.smartdigimkt.sdk.basead.ui.web.WebLandPageActivity;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class c {
    public static void a(String str) {
        List<ResolveInfo> listA;
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent.addFlags(268468224);
            Context contextK = com.smartdigimkt.m6.b.p().k();
            if (contextK != null) {
                com.smartdigimkt.l8.a aVarB = com.smartdigimkt.k8.a.e().b();
                if (aVarB != null && aVarB.f() && (listA = a(contextK, intent)) != null && listA.size() > 1) {
                    String str2 = listA.get(0).activityInfo != null ? listA.get(0).activityInfo.packageName : "";
                    if (!TextUtils.isEmpty(str2)) {
                        intent.setPackage(str2);
                    }
                }
                contextK.startActivity(intent);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void a(Context context, String str) {
        try {
            WebLandPageActivity.a(context, str);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static List<ResolveInfo> a(Context context, Intent intent) {
        return (com.smartdigimkt.m6.b.p().a("ail_deny") || com.smartdigimkt.m6.b.p().a("bil_deny") || context == null || intent == null) ? new ArrayList() : context.getPackageManager().queryIntentActivities(intent, 131072);
    }
}
