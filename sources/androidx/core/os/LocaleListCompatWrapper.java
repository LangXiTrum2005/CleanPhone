package androidx.core.os;

import com.smartdigimkt.d2.a;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
final class LocaleListCompatWrapper implements LocaleListInterface {

    public static class Api21Impl {
        public static String a(Locale locale) {
            return locale.getScript();
        }
    }

    static {
        new Locale(a.Z, "XA");
        new Locale(a.X, "XB");
        LocaleListCompat localeListCompat = LocaleListCompat.f4353b;
        String[] strArrSplit = "en-Latn".split(TokenBuilder.TOKEN_DELIMITER, -1);
        if (strArrSplit.length > 2) {
            new Locale(strArrSplit[0], strArrSplit[1], strArrSplit[2]);
        } else if (strArrSplit.length > 1) {
            new Locale(strArrSplit[0], strArrSplit[1]);
        } else {
            if (strArrSplit.length != 1) {
                throw new IllegalArgumentException("Can not parse language tag: [en-Latn]");
            }
            new Locale(strArrSplit[0]);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LocaleListCompatWrapper)) {
            return false;
        }
        ((LocaleListCompatWrapper) obj).getClass();
        throw null;
    }

    @Override // androidx.core.os.LocaleListInterface
    public final Object getLocaleList() {
        return null;
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        throw null;
    }
}
