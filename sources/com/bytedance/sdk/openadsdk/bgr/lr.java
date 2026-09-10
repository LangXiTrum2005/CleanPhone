package com.bytedance.sdk.openadsdk.bgr;

import android.app.Activity;
import android.os.Build;

/* JADX INFO: loaded from: classes2.dex */
public class lr {
    public static void ri(Activity activity) {
        if (activity == null || Build.VERSION.SDK_INT == 26) {
            return;
        }
        try {
            if (activity.getRequestedOrientation() == 1) {
                return;
            }
            activity.setRequestedOrientation(1);
        } catch (Throwable unused) {
        }
    }
}
