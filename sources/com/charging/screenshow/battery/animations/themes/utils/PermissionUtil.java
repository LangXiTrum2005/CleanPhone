package com.charging.screenshow.battery.animations.themes.utils;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.PowerManager;
import android.provider.Settings;
import com.charging.screenshow.battery.animations.themes.activity.BaseAct;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/charging/screenshow/battery/animations/themes/utils/PermissionUtil;", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PermissionUtil {
    public static boolean a(BaseAct baseAct) {
        return Settings.canDrawOverlays(baseAct);
    }

    public static boolean b(BaseAct baseAct) {
        PowerManager powerManager = (PowerManager) baseAct.getSystemService("power");
        if (powerManager != null) {
            return powerManager.isIgnoringBatteryOptimizations(baseAct.getPackageName());
        }
        return false;
    }

    public static void c(Context context) {
        Intrinsics.f(context, "context");
        if (Settings.canDrawOverlays(context)) {
            return;
        }
        context.startActivity(new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse("package:" + context.getPackageName())));
    }

    public static void d(Context context) {
        Intrinsics.f(context, "context");
        try {
            Intent intent = new Intent("android.settings.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS");
            intent.setData(Uri.parse("package:" + context.getPackageName()));
            context.startActivity(intent);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}
