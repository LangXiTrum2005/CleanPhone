package com.applovin.impl;

import android.content.Context;
import android.provider.Settings;
import com.applovin.adview.AppLovinFullscreenActivity;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.Map;

/* JADX INFO: renamed from: com.applovin.impl.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0936g {
    public static void a(com.applovin.impl.sdk.ad.b bVar, AppLovinFullscreenActivity appLovinFullscreenActivity, com.applovin.impl.sdk.k kVar) {
        String strB = AbstractC0930d.b(appLovinFullscreenActivity);
        String strA = AbstractC0930d.a(appLovinFullscreenActivity);
        String packageName = appLovinFullscreenActivity.getPackageName();
        boolean z2 = false;
        boolean z3 = StringUtils.isValidString(strB) && !strB.equals(packageName);
        if (StringUtils.isValidString(strA) && !strA.equals(packageName)) {
            z2 = true;
        }
        if (z3 || z2) {
            Map mapA = f2.a((AppLovinAdImpl) bVar);
            mapA.put("activity_task_affinity_mismatch", String.valueOf(z3));
            mapA.put("base_activity_task_affinity_mismatch", String.valueOf(z2));
            kVar.D().a(d2.E0, "taskAffinityMismatch", mapA);
        }
    }

    public static void a(com.applovin.impl.adview.b bVar, com.applovin.impl.sdk.k kVar) {
        if (bVar == null) {
            return;
        }
        boolean zA = AbstractC0959s.a(bVar);
        boolean zA2 = a(bVar.getContext());
        if (zA2 || zA) {
            Map mapA = f2.a((AppLovinAdImpl) bVar.getCurrentAd());
            mapA.put("can_draw_overlays", String.valueOf(zA2));
            mapA.put("is_ad_view_overlaid", String.valueOf(zA));
            kVar.D().a(d2.E0, "overlayViolation", mapA);
        }
    }

    private static boolean a(Context context) {
        if (AbstractC0953o0.e()) {
            return Settings.canDrawOverlays(context);
        }
        return AbstractC0953o0.a("android.permission.SYSTEM_ALERT_WINDOW", context);
    }
}
