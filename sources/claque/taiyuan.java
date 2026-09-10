package claque;

import android.os.LocaleList;
import java.util.Locale;

/* JADX INFO: compiled from: LocaleListCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class taiyuan {

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final taiyuan f15636saneness = attabal(new Locale[0]);

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final cutely f15637attabal;

    /* JADX INFO: compiled from: LocaleListCompat.java */
    public static class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final Locale[] f15638attabal = {new Locale("en", "XA"), new Locale("ar", "XB")};

        public static Locale attabal(String str) {
            return Locale.forLanguageTag(str);
        }
    }

    /* JADX INFO: compiled from: LocaleListCompat.java */
    public static class saneness {
        public static LocaleList attabal(Locale... localeArr) {
            return new LocaleList(localeArr);
        }
    }

    public taiyuan(cutely cutelyVar) {
        this.f15637attabal = cutelyVar;
    }

    public static taiyuan attabal(Locale... localeArr) {
        return taiyuan(saneness.attabal(localeArr));
    }

    public static taiyuan saneness(String str) {
        if (str == null || str.isEmpty()) {
            return wireman();
        }
        String[] strArrSplit = str.split(",", -1);
        int length = strArrSplit.length;
        Locale[] localeArr = new Locale[length];
        for (int i = 0; i < length; i++) {
            localeArr[i] = attabal.attabal(strArrSplit[i]);
        }
        return attabal(localeArr);
    }

    public static taiyuan taiyuan(LocaleList localeList) {
        return new taiyuan(new apical(localeList));
    }

    public static taiyuan wireman() {
        return f15636saneness;
    }

    public int beachfront() {
        return this.f15637attabal.size();
    }

    public String competently() {
        return this.f15637attabal.attabal();
    }

    public Locale dern(int i) {
        return this.f15637attabal.get(i);
    }

    public boolean equals(Object obj) {
        return (obj instanceof taiyuan) && this.f15637attabal.equals(((taiyuan) obj).f15637attabal);
    }

    public int hashCode() {
        return this.f15637attabal.hashCode();
    }

    public Object impromptu() {
        return this.f15637attabal.getLocaleList();
    }

    public boolean marial() {
        return this.f15637attabal.isEmpty();
    }

    public String toString() {
        return this.f15637attabal.toString();
    }
}
