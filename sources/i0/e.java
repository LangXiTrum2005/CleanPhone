package i0;

import android.os.LocaleList;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e f42487b = new e(new f(new LocaleList(new Locale[0])));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f42488a;

    public e(f fVar) {
        this.f42488a = fVar;
    }

    public static e a(String str) {
        if (str == null || str.isEmpty()) {
            return f42487b;
        }
        String[] strArrSplit = str.split(",", -1);
        int length = strArrSplit.length;
        Locale[] localeArr = new Locale[length];
        for (int i10 = 0; i10 < length; i10++) {
            localeArr[i10] = Locale.forLanguageTag(strArrSplit[i10]);
        }
        return new e(new f(new LocaleList(localeArr)));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            return this.f42488a.equals(((e) obj).f42488a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f42488a.f42489a.hashCode();
    }

    public final String toString() {
        return this.f42488a.f42489a.toString();
    }
}
