package com.blankj.utilcode.util;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.text.TextUtils;
import java.util.Locale;

/* JADX INFO: compiled from: LanguageUtils.java */
/* JADX INFO: loaded from: classes2.dex */
public class formularize {
    public static void attabal(Activity activity) {
        String strDern = rotuma.impassible().dern("KEY_LOCALE");
        if (TextUtils.isEmpty(strDern)) {
            return;
        }
        Locale localeSaneness = "VALUE_FOLLOW_SYSTEM".equals(strDern) ? saneness(Resources.getSystem().getConfiguration()) : marial(strDern);
        if (localeSaneness == null) {
            return;
        }
        competently(activity, localeSaneness);
        competently(adultoid.attabal(), localeSaneness);
    }

    public static Locale beachfront(String str) {
        if (!dern(str)) {
            return null;
        }
        try {
            int iIndexOf = str.indexOf("$");
            return new Locale(str.substring(0, iIndexOf), str.substring(iIndexOf + 1));
        } catch (Exception unused) {
            return null;
        }
    }

    public static void competently(Context context, Locale locale) {
        Resources resources = context.getResources();
        Configuration configuration = resources.getConfiguration();
        wireman(configuration, locale);
        resources.updateConfiguration(configuration, resources.getDisplayMetrics());
    }

    public static boolean dern(String str) {
        int i = 0;
        for (char c : str.toCharArray()) {
            if (c == '$') {
                if (i >= 1) {
                    return false;
                }
                i++;
            }
        }
        return i == 1;
    }

    public static Locale marial(String str) {
        Locale localeBeachfront = beachfront(str);
        if (localeBeachfront == null) {
            rotuma.impassible().beachfront("KEY_LOCALE");
        }
        return localeBeachfront;
    }

    public static Locale saneness(Configuration configuration) {
        return configuration.getLocales().get(0);
    }

    public static void wireman(Configuration configuration, Locale locale) {
        configuration.setLocale(locale);
    }
}
