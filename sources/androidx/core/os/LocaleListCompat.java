package androidx.core.os;

import android.os.LocaleList;
import androidx.core.text.ICUCompat;
import com.smartdigimkt.d2.a;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class LocaleListCompat {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final LocaleListCompat f4353b = a(new Locale[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocaleListPlatformWrapper f4354a;

    public static class Api21Impl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Locale[] f4355a = {new Locale(a.Z, "XA"), new Locale(a.X, "XB")};

        public static Locale a(String str) {
            return Locale.forLanguageTag(str);
        }

        public static boolean b(Locale locale, Locale locale2) {
            if (locale.equals(locale2)) {
                return true;
            }
            if (locale.getLanguage().equals(locale2.getLanguage())) {
                Locale[] localeArr = f4355a;
                for (Locale locale3 : localeArr) {
                    if (locale3.equals(locale)) {
                        return false;
                    }
                }
                for (Locale locale4 : localeArr) {
                    if (locale4.equals(locale2)) {
                        return false;
                    }
                }
                String strA = ICUCompat.a(locale);
                if (!strA.isEmpty()) {
                    return strA.equals(ICUCompat.a(locale2));
                }
                String country = locale.getCountry();
                if (country.isEmpty() || country.equals(locale2.getCountry())) {
                    return true;
                }
            }
            return false;
        }
    }

    public static class Api24Impl {
        public static LocaleList a(Locale... localeArr) {
            return new LocaleList(localeArr);
        }

        public static LocaleList b() {
            return LocaleList.getAdjustedDefault();
        }

        public static LocaleList c() {
            return LocaleList.getDefault();
        }
    }

    public LocaleListCompat(LocaleListPlatformWrapper localeListPlatformWrapper) {
        this.f4354a = localeListPlatformWrapper;
    }

    public static LocaleListCompat a(Locale... localeArr) {
        return g(Api24Impl.a(localeArr));
    }

    public static LocaleListCompat b(String str) {
        if (str == null || str.isEmpty()) {
            return f4353b;
        }
        String[] strArrSplit = str.split(",", -1);
        int length = strArrSplit.length;
        Locale[] localeArr = new Locale[length];
        for (int i2 = 0; i2 < length; i2++) {
            localeArr[i2] = Api21Impl.a(strArrSplit[i2]);
        }
        return a(localeArr);
    }

    public static LocaleListCompat g(LocaleList localeList) {
        return new LocaleListCompat(new LocaleListPlatformWrapper(localeList));
    }

    public final Locale c(int i2) {
        return this.f4354a.f4356a.get(i2);
    }

    public final boolean d() {
        return this.f4354a.f4356a.isEmpty();
    }

    public final int e() {
        return this.f4354a.f4356a.size();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof LocaleListCompat) {
            return this.f4354a.equals(((LocaleListCompat) obj).f4354a);
        }
        return false;
    }

    public final String f() {
        return this.f4354a.f4356a.toLanguageTags();
    }

    public final int hashCode() {
        return this.f4354a.f4356a.hashCode();
    }

    public final String toString() {
        return this.f4354a.f4356a.toString();
    }
}
