package com.zg.adlib.util;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.LocaleList;
import android.util.DisplayMetrics;
import com.smartdigimkt.d2.a;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0005J\u0006\u0010\r\u001a\u00020\u0007¨\u0006\u000e"}, d2 = {"Lcom/zg/adlib/util/LanguageUtil;", "", "<init>", "()V", "getAppLocale", "Ljava/util/Locale;", "language", "", "setAppLanguage", "", "context", "Landroid/content/Context;", "locale", "getDefaultLanguageTag", "app_debug"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LanguageUtil {
    public static final LanguageUtil INSTANCE = new LanguageUtil();

    private LanguageUtil() {
    }

    public final Locale getAppLocale(String language) {
        Intrinsics.f(language, "language");
        if ("de".equals(language)) {
            Locale locale = Locale.GERMANY;
            Intrinsics.c(locale);
            return locale;
        }
        if (a.T.equals(language)) {
            Locale locale2 = Locale.JAPAN;
            Intrinsics.c(locale2);
            return locale2;
        }
        if (a.W.equals(language)) {
            Locale locale3 = Locale.FRANCE;
            Intrinsics.c(locale3);
            return locale3;
        }
        if ("it".equals(language)) {
            Locale locale4 = Locale.ITALY;
            Intrinsics.c(locale4);
            return locale4;
        }
        if (a.f34402V.equals(language)) {
            Locale locale5 = Locale.KOREA;
            Intrinsics.c(locale5);
            return locale5;
        }
        if ("es".equals(language)) {
            return new Locale("es", "ES");
        }
        if ("pt".equals(language)) {
            return new Locale("pt", "PT");
        }
        if ("nl".equals(language)) {
            return new Locale("nl", "NL");
        }
        if ("tr".equals(language)) {
            return new Locale("tr", "TR");
        }
        Locale locale6 = Locale.ENGLISH;
        Intrinsics.c(locale6);
        return locale6;
    }

    public final String getDefaultLanguageTag() {
        return Locale.getDefault().getLanguage() + "";
    }

    public final void setAppLanguage(Context context, Locale locale) {
        Intrinsics.f(context, "context");
        Intrinsics.f(locale, "locale");
        Resources resources = context.getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        Configuration configuration = resources.getConfiguration();
        configuration.setLocale(locale);
        configuration.setLocales(new LocaleList(locale));
        context.createConfigurationContext(configuration);
        resources.updateConfiguration(configuration, displayMetrics);
    }
}
