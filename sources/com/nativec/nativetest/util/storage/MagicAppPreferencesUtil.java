package com.nativec.nativetest.util.storage;

import android.content.Context;

/* JADX INFO: loaded from: classes5.dex */
public class MagicAppPreferencesUtil {
    public static String a(Context context) {
        return context.getSharedPreferences("MagicMain", 0).getString("mm_device_id", "");
    }
}
