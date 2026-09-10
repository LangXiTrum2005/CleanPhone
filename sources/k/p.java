package k;

import android.content.res.Configuration;
import android.os.LocaleList;
import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class p {
    public static void a(@NonNull Configuration configuration, @NonNull Configuration configuration2, @NonNull Configuration configuration3) {
        LocaleList locales = configuration.getLocales();
        LocaleList locales2 = configuration2.getLocales();
        if (locales.equals(locales2)) {
            return;
        }
        configuration3.setLocales(locales2);
        configuration3.locale = configuration2.locale;
    }

    public static i0.e b(Configuration configuration) {
        return i0.e.a(configuration.getLocales().toLanguageTags());
    }

    public static void c(i0.e eVar) {
        LocaleList.setDefault(LocaleList.forLanguageTags(eVar.f42488a.f42489a.toLanguageTags()));
    }

    public static void d(Configuration configuration, i0.e eVar) {
        configuration.setLocales(LocaleList.forLanguageTags(eVar.f42488a.f42489a.toLanguageTags()));
    }
}
