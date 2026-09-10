package com.bytedance.sdk.openadsdk.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.media3.extractor.text.ttml.a;
import com.bytedance.sdk.openadsdk.activity.TTBaseActivity;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public class oth {
    private static com.bytedance.sdk.openadsdk.bjy.qdl.ud qdl(String str, int i2, com.bytedance.sdk.openadsdk.core.model.ljh ljhVar) {
        com.bytedance.sdk.openadsdk.bjy.qdl.ud udVar = new com.bytedance.sdk.openadsdk.bjy.qdl.ud();
        udVar.qdl(str);
        udVar.qdl(ljhVar);
        udVar.ud(gy.qdl(ljhVar));
        udVar.qdl(i2);
        udVar.qdl(false);
        udVar.ud(ljhVar.ygv());
        return udVar;
    }

    public static boolean ud(Context context, String str, com.bytedance.sdk.openadsdk.core.model.ljh ljhVar, String str2) {
        if (!(context instanceof Activity)) {
            Activity activityUd = com.bytedance.sdk.openadsdk.core.bjy.qdl().mzz().ud();
            if (activityUd != null && qdl(activityUd)) {
                context = activityUd;
            }
        } else if (!qdl((Activity) context)) {
            context = null;
        }
        if (context == null) {
            context = com.bytedance.sdk.openadsdk.core.yt.qdl();
        }
        Context context2 = context;
        if (context2 == null || !qdl(str)) {
            return false;
        }
        Uri uri = Uri.parse(str);
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(uri);
        HashMap mapS = a.s("deeplink_url", str);
        mapS.put("jsb_deeplink", 1);
        if (com.bytedance.sdk.openadsdk.exc.qdl.qdl.lnr.qdl()) {
            return com.bytedance.sdk.openadsdk.exc.qdl.qdl.lnr.qdl(context2, str, ljhVar, gy.ud(ljhVar), mapS, true);
        }
        try {
            if (!(context2 instanceof Activity)) {
                intent.addFlags(268435456);
            }
            com.bytedance.sdk.openadsdk.mml.lnr.qdl(ljhVar, str2, "open_url_app", mapS);
            context2.startActivity(intent);
            com.bytedance.sdk.openadsdk.mml.exu.qdl().qdl(mapS).qdl(ljhVar, str2);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean qdl(Context context, String str, com.bytedance.sdk.openadsdk.core.model.ljh ljhVar, String str2) {
        if (context instanceof Activity) {
            if (!qdl((Activity) context)) {
                context = null;
            }
        } else {
            Activity activityUd = com.bytedance.sdk.openadsdk.core.bjy.qdl().mzz().ud();
            if (activityUd != null && qdl(activityUd)) {
                context = activityUd;
            }
        }
        if (context == null) {
            context = com.bytedance.sdk.openadsdk.core.yt.qdl();
        }
        if (context == null) {
            return false;
        }
        String strQdl = gy.qdl(ljhVar);
        if (!com.bytedance.sdk.component.utils.jl.qdl(str)) {
            com.bytedance.sdk.openadsdk.mml.lnr.qdl(qdl(str2, 5, ljhVar));
            return false;
        }
        String strUd = com.bytedance.sdk.openadsdk.core.model.ljh.ud(context, ljhVar);
        if (!TextUtils.isEmpty(strUd)) {
            try {
                CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
                builder.f3708a.putExtra("android.support.customtabs.extra.ENABLE_URLBAR_HIDING", false);
                builder.e(2);
                try {
                    CustomTabsIntent customTabsIntentA = builder.a();
                    if (!(context instanceof Activity)) {
                        customTabsIntentA.f3706a.addFlags(268435456);
                    }
                    com.bytedance.sdk.openadsdk.core.qdl.qdl.qdl(context, strUd, customTabsIntentA, Uri.parse(str));
                    if (context instanceof TTBaseActivity) {
                        ((TTBaseActivity) context).lnr(true);
                    }
                    com.bytedance.sdk.openadsdk.bjy.qdl.ud udVarQdl = qdl(str2, 100, ljhVar);
                    udVarQdl.qdl(true);
                    udVarQdl.ud(8);
                    com.bytedance.sdk.openadsdk.mml.lnr.qdl(udVarQdl);
                    return true;
                } catch (Throwable th) {
                    String message = th.getMessage();
                    com.bytedance.sdk.component.utils.aaj.lnr("OpenUtils", message);
                    com.bytedance.sdk.openadsdk.bjy.qdl.ud udVarQdl2 = qdl(str2, 13, ljhVar);
                    udVarQdl2.lnr(message);
                    com.bytedance.sdk.openadsdk.mml.lnr.qdl(udVarQdl2);
                    qdl(context, str, ljhVar, str2, strQdl);
                    return true;
                }
            } catch (Throwable th2) {
                String message2 = th2.getMessage();
                com.bytedance.sdk.component.utils.aaj.lnr("OpenUtils", message2);
                com.bytedance.sdk.openadsdk.bjy.qdl.ud udVarQdl3 = qdl(str2, 12, ljhVar);
                udVarQdl3.lnr(message2);
                com.bytedance.sdk.openadsdk.mml.lnr.qdl(udVarQdl3);
                return qdl(context, str, ljhVar, str2, strQdl);
            }
        }
        return qdl(context, str, ljhVar, str2, strQdl);
    }

    private static boolean qdl(Context context, String str, com.bytedance.sdk.openadsdk.core.model.ljh ljhVar, String str2, String str3) {
        Intent intent = new Intent("android.intent.action.VIEW");
        try {
            intent.setData(Uri.parse(str));
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            try {
                context.startActivity(intent);
                com.bytedance.sdk.openadsdk.bjy.qdl.ud udVarQdl = qdl(str2, 100, ljhVar);
                udVarQdl.qdl(true);
                udVarQdl.ud(2);
                com.bytedance.sdk.openadsdk.mml.lnr.qdl(udVarQdl);
                return true;
            } catch (Throwable th) {
                String message = th.getMessage();
                com.bytedance.sdk.openadsdk.bjy.qdl.ud udVarQdl2 = qdl(str2, 7, ljhVar);
                udVarQdl2.lnr(message);
                udVarQdl2.ud(2);
                com.bytedance.sdk.openadsdk.mml.lnr.qdl(udVarQdl2);
                return false;
            }
        } catch (Throwable th2) {
            String message2 = th2.getMessage();
            com.bytedance.sdk.openadsdk.bjy.qdl.ud udVarQdl3 = qdl(str2, 6, ljhVar);
            udVarQdl3.lnr(message2);
            udVarQdl3.ud(2);
            com.bytedance.sdk.openadsdk.mml.lnr.qdl(udVarQdl3);
            return false;
        }
    }

    public static boolean qdl(String str) {
        return !TextUtils.isEmpty(str);
    }

    public static boolean qdl(Activity activity) {
        return (activity == null || activity.isDestroyed() || activity.isFinishing()) ? false : true;
    }
}
