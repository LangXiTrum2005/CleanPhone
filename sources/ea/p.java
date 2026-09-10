package ea;

import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class p extends t1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f39677c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f39678d;

    @Override // ea.t1
    public final boolean H0() {
        Calendar calendar = Calendar.getInstance();
        this.f39677c = TimeUnit.MINUTES.convert(calendar.get(16) + calendar.get(15), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        Locale locale2 = Locale.ENGLISH;
        String lowerCase = language.toLowerCase(locale2);
        String lowerCase2 = locale.getCountry().toLowerCase(locale2);
        this.f39678d = q4.a.j(new StringBuilder(String.valueOf(lowerCase).length() + 1 + String.valueOf(lowerCase2).length()), lowerCase, "-", lowerCase2);
        return false;
    }

    public final long K0() {
        I0();
        return this.f39677c;
    }

    public final String L0() {
        I0();
        return this.f39678d;
    }
}
