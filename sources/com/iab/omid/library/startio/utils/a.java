package com.iab.omid.library.startio.utils;

import android.app.UiModeManager;
import android.content.Context;
import com.iab.omid.library.startio.adsession.DeviceCategory;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static UiModeManager f22283a;

    public static DeviceCategory a() {
        UiModeManager uiModeManager = f22283a;
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
            f22283a = (UiModeManager) context.getSystemService("uimode");
        }
    }
}
