package com.bytedance.sdk.component.utils;

import android.content.Context;
import android.content.res.Configuration;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public class co {
    private static Context ri;

    private static Configuration lr(Context context, String str, String str2) {
        Configuration configuration = new Configuration(context.getResources().getConfiguration());
        configuration.setLocale(new Locale(str, str2));
        return configuration;
    }

    public static void ri(Context context, String str, String str2) {
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        try {
            ri = context.createConfigurationContext(lr(context, str, str2));
        } catch (Throwable th) {
            th.getMessage();
        }
        uq.ri(ri);
    }
}
