package com.google.android.gms.internal.ads;

import android.app.UiModeManager;
import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfta {
    private static UiModeManager zza;

    public static void zza(Context context) {
        if (context != null) {
            zza = (UiModeManager) context.getSystemService("uimode");
        }
    }

    public static zzfrn zzb() {
        UiModeManager uiModeManager = zza;
        if (uiModeManager == null) {
            return zzfrn.OTHER;
        }
        int currentModeType = uiModeManager.getCurrentModeType();
        if (currentModeType != 1) {
            return currentModeType != 4 ? zzfrn.OTHER : zzfrn.CTV;
        }
        return zzfrn.MOBILE;
    }
}
