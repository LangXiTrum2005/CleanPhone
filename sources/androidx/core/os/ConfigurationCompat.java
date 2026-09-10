package androidx.core.os;

import android.content.res.Configuration;
import android.os.LocaleList;

/* JADX INFO: loaded from: classes.dex */
public final class ConfigurationCompat {

    public static class Api24Impl {
        public static LocaleList a(Configuration configuration) {
            return configuration.getLocales();
        }

        public static void b(Configuration configuration, LocaleListCompat localeListCompat) {
            configuration.setLocales(localeListCompat.f4354a.f4356a);
        }
    }

    public static LocaleListCompat a(Configuration configuration) {
        return LocaleListCompat.g(Api24Impl.a(configuration));
    }

    public static void b(Configuration configuration, LocaleListCompat localeListCompat) {
        Api24Impl.b(configuration, localeListCompat);
    }
}
