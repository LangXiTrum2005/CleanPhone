package ads_mobile_sdk;

import android.app.UiModeManager;
import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public abstract class tv1 {
    public static UiModeManager a;

    public static void a(Context context) {
        a = (UiModeManager) context.getSystemService("uimode");
    }

    public static int a() {
        UiModeManager uiModeManager = a;
        if (uiModeManager == null) {
            return 3;
        }
        int currentModeType = uiModeManager.getCurrentModeType();
        if (currentModeType != 1) {
            return currentModeType != 4 ? 3 : 1;
        }
        return 2;
    }
}
