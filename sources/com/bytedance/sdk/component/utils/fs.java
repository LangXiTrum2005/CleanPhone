package com.bytedance.sdk.component.utils;

import android.content.Context;
import android.content.res.Configuration;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class fs {
    private static Context qdl;

    public static void qdl(Context context, String str, String str2) {
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        try {
            qdl = context.createConfigurationContext(ud(context, str, str2));
        } catch (Throwable th) {
            th.getMessage();
        }
        ljh.qdl(qdl);
    }

    private static Configuration ud(Context context, String str, String str2) {
        Configuration configuration = new Configuration(context.getResources().getConfiguration());
        configuration.setLocale(new Locale(str, str2));
        return configuration;
    }
}
