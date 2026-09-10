package com.bytedance.sdk.openadsdk.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.browser.customtabs.CustomTabsSession;
import com.bytedance.sdk.openadsdk.activity.TTBaseActivity;
import com.bytedance.sdk.openadsdk.core.act.AdActAction;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public class DY {
    /* JADX INFO: Access modifiers changed from: private */
    public static com.bytedance.sdk.openadsdk.STP.Lxb.LD LD(String str, int i, com.bytedance.sdk.openadsdk.core.model.tD tDVar) {
        com.bytedance.sdk.openadsdk.STP.Lxb.LD ld = new com.bytedance.sdk.openadsdk.STP.Lxb.LD();
        ld.Lxb(str);
        ld.Lxb(tDVar);
        ld.LD(nJ.Lxb(tDVar));
        ld.Lxb(i);
        ld.Lxb(false);
        ld.LD(tDVar.sRq());
        return ld;
    }

    public static boolean Lxb(Context context, final String str, final com.bytedance.sdk.openadsdk.core.model.tD tDVar, final String str2) {
        if (context instanceof Activity) {
            if (!Lxb((Activity) context)) {
                context = null;
            }
        } else {
            Activity activityLD = com.bytedance.sdk.openadsdk.core.IeN.Lxb().JXs().LD();
            if (activityLD != null && Lxb(activityLD)) {
                context = activityLD;
            }
        }
        if (context == null) {
            context = com.bytedance.sdk.openadsdk.core.kqm.Lxb();
        }
        if (context == null) {
            return false;
        }
        final String strLxb = nJ.Lxb(tDVar);
        if (!com.bytedance.sdk.component.utils.IeN.Lxb(str)) {
            com.bytedance.sdk.openadsdk.ZU.lk.Lxb(LD(str2, 5, tDVar));
            return false;
        }
        final String strLD = com.bytedance.sdk.openadsdk.core.model.tD.LD(context, tDVar);
        if (!TextUtils.isEmpty(strLD)) {
            try {
                final CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
                builder.setUrlBarHidingEnabled(false);
                builder.setShareState(2);
                final Context context2 = context;
                new AdActAction(context, tDVar, str2, str).Lxb(new AdActAction.BindCustomTabsServiceCallback() { // from class: com.bytedance.sdk.openadsdk.utils.DY.1
                    @Override // com.bytedance.sdk.openadsdk.core.act.AdActAction.BindCustomTabsServiceCallback
                    public void onBindFail(int i, String str3) {
                        com.bytedance.sdk.openadsdk.STP.Lxb.LD LD = DY.LD(str2, i, tDVar);
                        LD.lk(str3);
                        com.bytedance.sdk.openadsdk.ZU.lk.Lxb(LD);
                        DY.LD(context2, str, tDVar, str2, strLxb);
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.act.AdActAction.BindCustomTabsServiceCallback
                    public void onBindSuccess(CustomTabsSession customTabsSession) {
                        if (customTabsSession != null) {
                            try {
                                builder.setSession(customTabsSession);
                            } catch (Throwable th) {
                                String message = th.getMessage();
                                com.bytedance.sdk.component.utils.sLN.Lxb("OpenUtils", message);
                                com.bytedance.sdk.openadsdk.STP.Lxb.LD LD = DY.LD(str2, 13, tDVar);
                                LD.lk(message);
                                com.bytedance.sdk.openadsdk.ZU.lk.Lxb(LD);
                                DY.LD(context2, str, tDVar, str2, strLxb);
                                return;
                            }
                        }
                        CustomTabsIntent customTabsIntentBuild = builder.build();
                        if (!(context2 instanceof Activity)) {
                            customTabsIntentBuild.intent.addFlags(268435456);
                        }
                        com.bytedance.sdk.openadsdk.core.act.lk.Lxb(context2, strLD, customTabsIntentBuild, Uri.parse(str));
                        Context context3 = context2;
                        if (context3 instanceof TTBaseActivity) {
                            ((TTBaseActivity) context3).LD(true);
                        }
                        com.bytedance.sdk.openadsdk.STP.Lxb.LD LD2 = DY.LD(str2, 100, tDVar);
                        LD2.Lxb(true);
                        LD2.LD(8);
                        com.bytedance.sdk.openadsdk.ZU.lk.Lxb(LD2);
                    }
                });
                return true;
            } catch (Throwable th) {
                String message = th.getMessage();
                com.bytedance.sdk.component.utils.sLN.Lxb("OpenUtils", message);
                com.bytedance.sdk.openadsdk.STP.Lxb.LD LD = LD(str2, 12, tDVar);
                LD.lk(message);
                com.bytedance.sdk.openadsdk.ZU.lk.Lxb(LD);
                return LD(context, str, tDVar, str2, strLxb);
            }
        }
        return LD(context, str, tDVar, str2, strLxb);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean LD(Context context, String str, com.bytedance.sdk.openadsdk.core.model.tD tDVar, String str2, String str3) {
        Intent intent = new Intent("android.intent.action.VIEW");
        try {
            intent.setData(Uri.parse(str));
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            try {
                context.startActivity(intent);
                com.bytedance.sdk.openadsdk.STP.Lxb.LD LD = LD(str2, 100, tDVar);
                LD.Lxb(true);
                LD.LD(2);
                com.bytedance.sdk.openadsdk.ZU.lk.Lxb(LD);
                return true;
            } catch (Throwable th) {
                String message = th.getMessage();
                com.bytedance.sdk.openadsdk.STP.Lxb.LD LD2 = LD(str2, 7, tDVar);
                LD2.lk(message);
                LD2.LD(2);
                com.bytedance.sdk.openadsdk.ZU.lk.Lxb(LD2);
                return false;
            }
        } catch (Throwable th2) {
            String message2 = th2.getMessage();
            com.bytedance.sdk.openadsdk.STP.Lxb.LD LD3 = LD(str2, 6, tDVar);
            LD3.lk(message2);
            LD3.LD(2);
            com.bytedance.sdk.openadsdk.ZU.lk.Lxb(LD3);
            return false;
        }
    }

    public static boolean Lxb(String str) {
        return !TextUtils.isEmpty(str);
    }

    public static boolean Lxb(Activity activity) {
        return (activity == null || activity.isDestroyed() || activity.isFinishing()) ? false : true;
    }

    public static boolean LD(Context context, String str, com.bytedance.sdk.openadsdk.core.model.tD tDVar, String str2) {
        if (context instanceof Activity) {
            if (!Lxb((Activity) context)) {
                context = null;
            }
        } else {
            Activity activityLD = com.bytedance.sdk.openadsdk.core.IeN.Lxb().JXs().LD();
            if (activityLD != null && Lxb(activityLD)) {
                context = activityLD;
            }
        }
        if (context == null) {
            context = com.bytedance.sdk.openadsdk.core.kqm.Lxb();
        }
        Context context2 = context;
        if (context2 == null || !Lxb(str)) {
            return false;
        }
        Uri uri = Uri.parse(str);
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(uri);
        HashMap mapV = AbstractC3950lJ.v("deeplink_url", str);
        mapV.put("jsb_deeplink", 1);
        if (com.bytedance.sdk.openadsdk.brP.Lxb.Lxb.lk.Lxb()) {
            return com.bytedance.sdk.openadsdk.brP.Lxb.Lxb.lk.Lxb(context2, str, tDVar, nJ.LD(tDVar), mapV, true);
        }
        if (nJ.OY(context2)) {
            if (nJ.Lxb(context2, intent)) {
                com.bytedance.sdk.openadsdk.ZU.lk.Lxb(tDVar, str2, "open_url_app", mapV);
                try {
                    if (!(context2 instanceof Activity)) {
                        intent.addFlags(268435456);
                    }
                    context2.startActivity(intent);
                    com.bytedance.sdk.openadsdk.ZU.sLN.Lxb().Lxb(mapV).Lxb(tDVar, str2);
                    return true;
                } catch (Throwable unused) {
                }
            }
            return false;
        }
        try {
            if (!(context2 instanceof Activity)) {
                intent.addFlags(268435456);
            }
            com.bytedance.sdk.openadsdk.ZU.lk.Lxb(tDVar, str2, "open_url_app", mapV);
            context2.startActivity(intent);
            com.bytedance.sdk.openadsdk.ZU.sLN.Lxb().Lxb(mapV).Lxb(tDVar, str2);
            return true;
        } catch (Exception unused2) {
            return false;
        }
    }
}
