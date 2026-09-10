package androidx.core.text;

import android.icu.util.ULocale;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class ICUCompat {

    public static class Api21Impl {
        public static String a(Locale locale) {
            return locale.getScript();
        }
    }

    public static class Api24Impl {
        public static ULocale a(Object obj) {
            return ULocale.addLikelySubtags((ULocale) obj);
        }

        public static ULocale b(Locale locale) {
            return ULocale.forLocale(locale);
        }

        public static String c(Object obj) {
            return ((ULocale) obj).getScript();
        }
    }

    public static String a(Locale locale) {
        return Api24Impl.c(Api24Impl.a(Api24Impl.b(locale)));
    }
}
