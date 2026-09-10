package com.iab.omid.library.ironsrc.utils;

import android.app.UiModeManager;
import android.content.Context;
import com.iab.omid.library.ironsrc.adsession.DeviceCategory;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static UiModeManager f25289a;

    public static DeviceCategory a() {
        UiModeManager uiModeManager = f25289a;
        if (uiModeManager == null) {
            return DeviceCategory.OTHER;
        }
        int currentModeType = uiModeManager.getCurrentModeType();
        if (currentModeType != 1) {
            return currentModeType != 4 ? DeviceCategory.OTHER : DeviceCategory.CTV;
        }
        return DeviceCategory.MOBILE;
    }

    public static void a(Context context) {
        if (context != null) {
            f25289a = (UiModeManager) context.getSystemService("uimode");
        }
    }
}
