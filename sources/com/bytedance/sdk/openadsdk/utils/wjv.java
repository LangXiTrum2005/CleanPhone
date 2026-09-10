package com.bytedance.sdk.openadsdk.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import arytenoidectomy.marial;
import com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public class wjv {
    /* JADX INFO: Access modifiers changed from: private */
    public static com.bytedance.sdk.openadsdk.slm.ri.lr lr(String str, int i, com.bytedance.sdk.openadsdk.core.model.wjv wjvVar) {
        com.bytedance.sdk.openadsdk.slm.ri.lr lrVar = new com.bytedance.sdk.openadsdk.slm.ri.lr();
        lrVar.ri(str);
        lrVar.ri(wjvVar);
        lrVar.lr(ig.ri(wjvVar));
        lrVar.ri(i);
        lrVar.ri(false);
        lrVar.lr(wjvVar.adz());
        return lrVar;
    }

    public static boolean ri(Context context, String str, com.bytedance.sdk.openadsdk.core.model.wjv wjvVar, String str2, boolean z) {
        if (!(context instanceof Activity)) {
            Activity activityLr = com.bytedance.sdk.openadsdk.core.slm.ri().fi().lr();
            if (activityLr != null && ri(activityLr)) {
                context = activityLr;
            }
        } else if (!ri((Activity) context)) {
            context = null;
        }
        if (context == null) {
            context = com.bytedance.sdk.openadsdk.core.nr.ri();
        }
        if (context == null) {
            return false;
        }
        ig.ri(wjvVar);
        if (!com.bytedance.sdk.component.utils.nr.ri(str)) {
            com.bytedance.sdk.openadsdk.ka.ik.ri(lr(str2, 5, wjvVar));
            return false;
        }
        String strLr = com.bytedance.sdk.openadsdk.core.model.wjv.lr(context, wjvVar);
        if (TextUtils.isEmpty(strLr)) {
            return lr(context, str, wjvVar, str2, z);
        }
        try {
            marial.wireman wiremanVar = new marial.wireman();
            wiremanVar.adultoid(false);
            wiremanVar.polloi(2);
            try {
                marial marialVarAttabal = wiremanVar.attabal();
                if (!(context instanceof Activity)) {
                    marialVarAttabal.f14372attabal.addFlags(268435456);
                }
                com.bytedance.sdk.openadsdk.core.ri.ri.ri(context, strLr, marialVarAttabal, Uri.parse(str));
                if (context instanceof TTBaseActivity) {
                    ((TTBaseActivity) context).ik(true);
                }
                com.bytedance.sdk.openadsdk.slm.ri.lr lrVarLr = lr(str2, 100, wjvVar);
                lrVarLr.ri(true);
                lrVarLr.lr(8);
                com.bytedance.sdk.openadsdk.ka.ik.ri(lrVarLr);
            } catch (Throwable th) {
                String message = th.getMessage();
                com.bytedance.sdk.component.utils.ac.ik("OpenUtils", message);
                com.bytedance.sdk.openadsdk.slm.ri.lr lrVarLr2 = lr(str2, 13, wjvVar);
                lrVarLr2.ik(message);
                com.bytedance.sdk.openadsdk.ka.ik.ri(lrVarLr2);
                lr(context, str, wjvVar, str2, true);
            }
            return true;
        } catch (Throwable th2) {
            String message2 = th2.getMessage();
            com.bytedance.sdk.component.utils.ac.ik("OpenUtils", message2);
            com.bytedance.sdk.openadsdk.slm.ri.lr lrVarLr3 = lr(str2, 12, wjvVar);
            lrVarLr3.ik(message2);
            com.bytedance.sdk.openadsdk.ka.ik.ri(lrVarLr3);
            return lr(context, str, wjvVar, str2, z);
        }
    }

    private static boolean lr(Context context, String str, final com.bytedance.sdk.openadsdk.core.model.wjv wjvVar, final String str2, boolean z) {
        Intent intent = new Intent("android.intent.action.VIEW");
        try {
            intent.setData(Uri.parse(str));
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            return com.bytedance.sdk.component.utils.lr.ri(context, intent, new com.bytedance.sdk.component.utils.lr.InterfaceC0216lr() { // from class: com.bytedance.sdk.openadsdk.utils.wjv.1
                @Override // com.bytedance.sdk.component.utils.lr.InterfaceC0216lr
                public void ri() {
                    com.bytedance.sdk.openadsdk.slm.ri.lr lrVarLr = wjv.lr(str2, 100, wjvVar);
                    lrVarLr.ri(true);
                    lrVarLr.lr(2);
                    com.bytedance.sdk.openadsdk.ka.ik.ri(lrVarLr);
                }

                @Override // com.bytedance.sdk.component.utils.lr.InterfaceC0216lr
                public void ri(Throwable th) {
                    String message = th.getMessage();
                    com.bytedance.sdk.openadsdk.slm.ri.lr lrVarLr = wjv.lr(str2, 7, wjvVar);
                    lrVarLr.ik(message);
                    lrVarLr.lr(2);
                    com.bytedance.sdk.openadsdk.ka.ik.ri(lrVarLr);
                }
            }, z);
        } catch (Throwable th) {
            String message = th.getMessage();
            com.bytedance.sdk.openadsdk.slm.ri.lr lrVarLr = lr(str2, 6, wjvVar);
            lrVarLr.ik(message);
            lrVarLr.lr(2);
            com.bytedance.sdk.openadsdk.ka.ik.ri(lrVarLr);
            return false;
        }
    }

    public static boolean ri(Context context, String str, com.bytedance.sdk.openadsdk.core.model.wjv wjvVar, String str2) {
        if (context instanceof Activity) {
            if (!ri((Activity) context)) {
                context = null;
            }
        } else {
            Activity activityLr = com.bytedance.sdk.openadsdk.core.slm.ri().fi().lr();
            if (activityLr != null && ri(activityLr)) {
                context = activityLr;
            }
        }
        if (context == null) {
            context = com.bytedance.sdk.openadsdk.core.nr.ri();
        }
        Context context2 = context;
        if (context2 == null || !ri(str)) {
            return false;
        }
        new Intent("android.intent.action.VIEW").setData(Uri.parse(str));
        HashMap map = new HashMap();
        map.put("deeplink_url", str);
        map.put("jsb_deeplink", 1);
        return com.bytedance.sdk.openadsdk.ihz.ri.ri.ri.ri(context2, str, wjvVar, ig.lr(wjvVar), map, true);
    }

    public static boolean ri(String str) {
        return !TextUtils.isEmpty(str);
    }

    public static boolean ri(Activity activity) {
        return (activity == null || activity.isDestroyed() || activity.isFinishing()) ? false : true;
    }
}
