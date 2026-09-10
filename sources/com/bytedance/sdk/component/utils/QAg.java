package com.bytedance.sdk.component.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public class QAg {

    @SuppressLint({"StaticFieldLeak"})
    private static Context Lxb;

    private static Configuration LD(Context context, String str, String str2) {
        Configuration configuration = new Configuration(context.getResources().getConfiguration());
        configuration.setLocale(new Locale(str, str2));
        return configuration;
    }

    public static void Lxb(Context context, String str, String str2) {
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        try {
            Lxb = context.createConfigurationContext(LD(context, str, str2));
        } catch (Throwable th) {
            sLN.LD(th.getMessage());
        }
        tD.Lxb(Lxb);
    }
}
