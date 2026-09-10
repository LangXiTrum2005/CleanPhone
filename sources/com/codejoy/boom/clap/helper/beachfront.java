package com.codejoy.boom.clap.helper;

import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import java.util.Locale;
import java.util.Objects;

/* JADX INFO: compiled from: LanguageHelper.java */
/* JADX INFO: loaded from: classes2.dex */
public class beachfront {
    public static Resources attabal(PackageManager packageManager, String str, Locale locale) {
        Objects.toString(locale);
        try {
            Resources resourcesForApplication = packageManager.getResourcesForApplication(str);
            try {
                saneness(resourcesForApplication, locale);
                return resourcesForApplication;
            } catch (PackageManager.NameNotFoundException unused) {
                return resourcesForApplication;
            }
        } catch (PackageManager.NameNotFoundException unused2) {
            return null;
        }
    }

    public static void saneness(Resources resources, Locale locale) {
        Configuration configuration = resources.getConfiguration();
        if (locale.getLanguage().equals("zh-hant")) {
            locale = Locale.forLanguageTag("zh-TW");
        } else if (locale.getLanguage().equals("zh-hans")) {
            locale = Locale.forLanguageTag("zh-CN");
        }
        configuration.locale = locale;
        resources.updateConfiguration(configuration, null);
    }
}
