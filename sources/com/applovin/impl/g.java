package com.applovin.impl;

import android.provider.Settings;
import com.applovin.adview.AppLovinFullscreenActivity;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g {
    public static void a(com.applovin.impl.sdk.ad.b bVar, AppLovinFullscreenActivity appLovinFullscreenActivity, com.applovin.impl.sdk.l lVar) {
        String strB = d.b(appLovinFullscreenActivity);
        String strA = d.a(appLovinFullscreenActivity);
        String packageName = appLovinFullscreenActivity.getPackageName();
        boolean z10 = false;
        boolean z11 = StringUtils.isValidString(strB) && !strB.equals(packageName);
        if (StringUtils.isValidString(strA) && !strA.equals(packageName)) {
            z10 = true;
        }
        if (z11 || z10) {
            Map mapA = h2.a((AppLovinAdImpl) bVar);
            mapA.put("details", "activityTaskAffinityMismatch=" + z11 + ",baseActivityTaskAffinityMismatch=" + z10);
            lVar.E().a(f2.M0, "taskAffinityMismatch", mapA);
        }
    }

    public static void a(com.applovin.impl.adview.b bVar, com.applovin.impl.sdk.l lVar) {
        if (bVar == null) {
            return;
        }
        boolean zA = s.a(bVar);
        boolean zCanDrawOverlays = Settings.canDrawOverlays(bVar.getContext());
        if (zCanDrawOverlays || zA) {
            Map mapA = h2.a((AppLovinAdImpl) bVar.getCurrentAd());
            mapA.put("details", "canDrawOverlays=" + zCanDrawOverlays + ",isViewOverlaid=" + zA);
            lVar.E().a(f2.M0, "overlayViolation", mapA);
        }
    }
}
