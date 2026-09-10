package be;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Objects;
import java.util.TimeZone;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class h extends com.google.gson.t {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f5620c = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f5621a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f5622b;

    public h(g gVar) {
        ArrayList arrayList = new ArrayList();
        this.f5622b = arrayList;
        Objects.requireNonNull(gVar);
        this.f5621a = gVar;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (ae.j.f3508a >= 9) {
            arrayList.add(new SimpleDateFormat(wi.d.i("MMM d, yyyy", " ", "h:mm:ss a"), locale));
        }
    }

    @Override // com.google.gson.t
    public final Object b(ge.a aVar) throws IOException {
        Date dateB;
        if (aVar.H() == 9) {
            aVar.D();
            return null;
        }
        String strF = aVar.F();
        synchronized (this.f5622b) {
            try {
                for (DateFormat dateFormat : this.f5622b) {
                    TimeZone timeZone = dateFormat.getTimeZone();
                    try {
                        try {
                            dateB = dateFormat.parse(strF);
                            dateFormat.setTimeZone(timeZone);
                        } catch (ParseException unused) {
                            dateFormat.setTimeZone(timeZone);
                        }
                    } catch (Throwable th2) {
                        dateFormat.setTimeZone(timeZone);
                        throw th2;
                    }
                }
                try {
                    dateB = ce.a.b(strF, new ParsePosition(0));
                } catch (ParseException e10) {
                    StringBuilder sbK = d5.u.k("Failed parsing '", strF, "' as Date; at path ");
                    sbK.append(aVar.t());
                    throw new com.google.gson.m(sbK.toString(), e10);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return this.f5621a.a(dateB);
    }

    @Override // com.google.gson.t
    public final void c(ge.b bVar, Object obj) throws IOException {
        String str;
        Date date = (Date) obj;
        if (date == null) {
            bVar.s();
            return;
        }
        DateFormat dateFormat = (DateFormat) this.f5622b.get(0);
        synchronized (this.f5622b) {
            str = dateFormat.format(date);
        }
        bVar.B(str);
    }

    public final String toString() {
        DateFormat dateFormat = (DateFormat) this.f5622b.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            return "DefaultDateTypeAdapter(" + ((SimpleDateFormat) dateFormat).toPattern() + ')';
        }
        return "DefaultDateTypeAdapter(" + dateFormat.getClass().getSimpleName() + ')';
    }
}
