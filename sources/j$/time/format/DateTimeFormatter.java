package j$.time.format;

import com.p004ironsource.d9;
import j$.time.temporal.TemporalAccessor;
import java.io.IOException;
import java.text.ParsePosition;
import java.util.HashMap;
import java.util.Locale;
import java.util.Objects;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes2.dex */
public final class DateTimeFormatter {
    public static final DateTimeFormatter ISO_DATE_TIME;
    public static final DateTimeFormatter ISO_LOCAL_DATE;
    public static final DateTimeFormatter f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3554e f43072a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Locale f43073b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final D f43074c;
    private final F d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final j$.time.chrono.t f43075e;

    public static DateTimeFormatter ofPattern(String str) {
        v vVar = new v();
        vVar.j(str);
        return vVar.x();
    }

    static {
        v vVar = new v();
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        G g = G.EXCEEDS_PAD;
        vVar.p(aVar, 4, 10, g);
        vVar.e('-');
        j$.time.temporal.a aVar2 = j$.time.temporal.a.MONTH_OF_YEAR;
        vVar.o(aVar2, 2);
        vVar.e('-');
        j$.time.temporal.a aVar3 = j$.time.temporal.a.DAY_OF_MONTH;
        vVar.o(aVar3, 2);
        F f2 = F.STRICT;
        j$.time.chrono.t tVar = j$.time.chrono.t.d;
        DateTimeFormatter dateTimeFormatterY = vVar.y(f2, tVar);
        ISO_LOCAL_DATE = dateTimeFormatterY;
        v vVar2 = new v();
        vVar2.t();
        vVar2.a(dateTimeFormatterY);
        vVar2.i();
        vVar2.y(f2, tVar);
        v vVar3 = new v();
        vVar3.t();
        vVar3.a(dateTimeFormatterY);
        vVar3.s();
        vVar3.i();
        vVar3.y(f2, tVar);
        v vVar4 = new v();
        j$.time.temporal.a aVar4 = j$.time.temporal.a.HOUR_OF_DAY;
        vVar4.o(aVar4, 2);
        vVar4.e(AbstractJsonLexerKt.COLON);
        j$.time.temporal.a aVar5 = j$.time.temporal.a.MINUTE_OF_HOUR;
        vVar4.o(aVar5, 2);
        vVar4.s();
        vVar4.e(AbstractJsonLexerKt.COLON);
        j$.time.temporal.a aVar6 = j$.time.temporal.a.SECOND_OF_MINUTE;
        vVar4.o(aVar6, 2);
        vVar4.s();
        vVar4.b(j$.time.temporal.a.NANO_OF_SECOND, 0, 9, true);
        DateTimeFormatter dateTimeFormatterY2 = vVar4.y(f2, null);
        v vVar5 = new v();
        vVar5.t();
        vVar5.a(dateTimeFormatterY2);
        vVar5.i();
        vVar5.y(f2, null);
        v vVar6 = new v();
        vVar6.t();
        vVar6.a(dateTimeFormatterY2);
        vVar6.s();
        vVar6.i();
        vVar6.y(f2, null);
        v vVar7 = new v();
        vVar7.t();
        vVar7.a(dateTimeFormatterY);
        vVar7.e('T');
        vVar7.a(dateTimeFormatterY2);
        DateTimeFormatter dateTimeFormatterY3 = vVar7.y(f2, tVar);
        v vVar8 = new v();
        vVar8.t();
        vVar8.a(dateTimeFormatterY3);
        vVar8.v();
        vVar8.i();
        vVar8.w();
        DateTimeFormatter dateTimeFormatterY4 = vVar8.y(f2, tVar);
        v vVar9 = new v();
        vVar9.a(dateTimeFormatterY4);
        vVar9.s();
        vVar9.e(AbstractJsonLexerKt.BEGIN_LIST);
        vVar9.u();
        vVar9.q();
        vVar9.e(AbstractJsonLexerKt.END_LIST);
        vVar9.y(f2, tVar);
        v vVar10 = new v();
        vVar10.a(dateTimeFormatterY3);
        vVar10.s();
        vVar10.i();
        vVar10.s();
        vVar10.e(AbstractJsonLexerKt.BEGIN_LIST);
        vVar10.u();
        vVar10.q();
        vVar10.e(AbstractJsonLexerKt.END_LIST);
        ISO_DATE_TIME = vVar10.y(f2, tVar);
        v vVar11 = new v();
        vVar11.t();
        vVar11.p(aVar, 4, 10, g);
        vVar11.e('-');
        vVar11.o(j$.time.temporal.a.DAY_OF_YEAR, 3);
        vVar11.s();
        vVar11.i();
        vVar11.y(f2, tVar);
        v vVar12 = new v();
        vVar12.t();
        vVar12.p(j$.time.temporal.j.f43185c, 4, 10, g);
        vVar12.f("-W");
        vVar12.o(j$.time.temporal.j.f43184b, 2);
        vVar12.e('-');
        j$.time.temporal.a aVar7 = j$.time.temporal.a.DAY_OF_WEEK;
        vVar12.o(aVar7, 1);
        vVar12.s();
        vVar12.i();
        vVar12.y(f2, tVar);
        v vVar13 = new v();
        vVar13.t();
        vVar13.c();
        f = vVar13.y(f2, null);
        v vVar14 = new v();
        vVar14.t();
        vVar14.o(aVar, 4);
        vVar14.o(aVar2, 2);
        vVar14.o(aVar3, 2);
        vVar14.s();
        vVar14.v();
        vVar14.h("+HHMMss", "Z");
        vVar14.w();
        vVar14.y(f2, tVar);
        HashMap map = new HashMap();
        map.put(1L, "Mon");
        map.put(2L, "Tue");
        map.put(3L, "Wed");
        map.put(4L, "Thu");
        map.put(5L, "Fri");
        map.put(6L, "Sat");
        map.put(7L, "Sun");
        HashMap map2 = new HashMap();
        map2.put(1L, "Jan");
        map2.put(2L, "Feb");
        map2.put(3L, "Mar");
        map2.put(4L, "Apr");
        map2.put(5L, "May");
        map2.put(6L, "Jun");
        map2.put(7L, "Jul");
        map2.put(8L, "Aug");
        map2.put(9L, "Sep");
        map2.put(10L, "Oct");
        map2.put(11L, "Nov");
        map2.put(12L, "Dec");
        v vVar15 = new v();
        vVar15.t();
        vVar15.v();
        vVar15.s();
        vVar15.k(aVar7, map);
        vVar15.f(", ");
        vVar15.r();
        vVar15.p(aVar3, 1, 2, G.NOT_NEGATIVE);
        vVar15.e(' ');
        vVar15.k(aVar2, map2);
        vVar15.e(' ');
        vVar15.o(aVar, 4);
        vVar15.e(' ');
        vVar15.o(aVar4, 2);
        vVar15.e(AbstractJsonLexerKt.COLON);
        vVar15.o(aVar5, 2);
        vVar15.s();
        vVar15.e(AbstractJsonLexerKt.COLON);
        vVar15.o(aVar6, 2);
        vVar15.r();
        vVar15.e(' ');
        vVar15.h("+HHMM", "GMT");
        vVar15.y(F.SMART, tVar);
    }

    DateTimeFormatter(C3554e c3554e, Locale locale, F f2, j$.time.chrono.t tVar) {
        D d = D.f43071a;
        this.f43072a = c3554e;
        Objects.requireNonNull(locale, "locale");
        this.f43073b = locale;
        this.f43074c = d;
        Objects.requireNonNull(f2, "resolverStyle");
        this.d = f2;
        this.f43075e = tVar;
    }

    public final Locale d() {
        return this.f43073b;
    }

    public final D c() {
        return this.f43074c;
    }

    public final j$.time.chrono.m b() {
        return this.f43075e;
    }

    public final String a(TemporalAccessor temporalAccessor) {
        StringBuilder sb = new StringBuilder(32);
        try {
            this.f43072a.p(new z(temporalAccessor, this), sb);
            return sb.toString();
        } catch (IOException e2) {
            throw new j$.time.c(e2.getMessage(), e2);
        }
    }

    public final Object e(CharSequence charSequence, j$.time.x xVar) {
        String string;
        Objects.requireNonNull(charSequence, "text");
        try {
            return ((E) f(charSequence)).a(xVar);
        } catch (x e2) {
            throw e2;
        } catch (RuntimeException e3) {
            if (charSequence.length() > 64) {
                string = charSequence.subSequence(0, 64).toString() + "...";
            } else {
                string = charSequence.toString();
            }
            x xVar2 = new x("Text '" + string + "' could not be parsed: " + e3.getMessage(), e3);
            charSequence.toString();
            throw xVar2;
        }
    }

    private TemporalAccessor f(CharSequence charSequence) {
        String string;
        ParsePosition parsePosition = new ParsePosition(0);
        Objects.requireNonNull(charSequence, "text");
        w wVar = new w(this);
        int iR = this.f43072a.r(wVar, charSequence, parsePosition.getIndex());
        if (iR < 0) {
            parsePosition.setErrorIndex(~iR);
            wVar = null;
        } else {
            parsePosition.setIndex(iR);
        }
        if (wVar == null || parsePosition.getErrorIndex() >= 0 || parsePosition.getIndex() < charSequence.length()) {
            if (charSequence.length() > 64) {
                string = charSequence.subSequence(0, 64).toString() + "...";
            } else {
                string = charSequence.toString();
            }
            if (parsePosition.getErrorIndex() >= 0) {
                String str = "Text '" + string + "' could not be parsed at index " + parsePosition.getErrorIndex();
                parsePosition.getErrorIndex();
                throw new x(str, charSequence);
            }
            String str2 = "Text '" + string + "' could not be parsed, unparsed text found at index " + parsePosition.getIndex();
            parsePosition.getIndex();
            throw new x(str2, charSequence);
        }
        return wVar.t(this.d);
    }

    final C3554e g() {
        return this.f43072a.a();
    }

    public final String toString() {
        String string = this.f43072a.toString();
        return string.startsWith(d9.i.d) ? string : string.substring(1, string.length() - 1);
    }
}
