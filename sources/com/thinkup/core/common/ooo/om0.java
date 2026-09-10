package com.thinkup.core.common.ooo;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import com.thinkup.core.basead.ui.web.WebLandPageActivity;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class om0 {
    public static void o(String str) {
        List<ResolveInfo> listO;
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent.addFlags(268468224);
            Context contextOn = com.thinkup.core.common.n.o0n.m().on();
            if (contextOn != null) {
                com.thinkup.core.oo.m mVarM = com.thinkup.core.oo.o0.o(com.thinkup.core.common.n.o0n.m().on()).m(com.thinkup.core.common.n.o0n.m().o00());
                if (mVarM != null && mVarM.oomn() && (listO = o(contextOn, intent)) != null && listO.size() > 1) {
                    String str2 = listO.get(0).activityInfo != null ? listO.get(0).activityInfo.packageName : "";
                    if (!TextUtils.isEmpty(str2)) {
                        intent.setPackage(str2);
                    }
                }
                contextOn.startActivity(intent);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void o(Context context, String str) {
        try {
            WebLandPageActivity.o(context, str);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static List<ResolveInfo> o(Context context, Intent intent) {
        return (com.thinkup.core.common.n.o0n.m().n("ail_deny") || com.thinkup.core.common.n.o0n.m().n("bil_deny") || context == null || intent == null) ? new ArrayList() : context.getPackageManager().queryIntentActivities(intent, 131072);
    }
}
