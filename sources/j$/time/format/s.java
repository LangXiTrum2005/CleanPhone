package j$.time.format;

import java.util.Calendar;
import java.util.Locale;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class s extends j {
    private char g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f43120h;

    s(char c2, int i2, int i3, int i4, int i5) {
        super(null, i3, i4, G.NOT_NEGATIVE, i5);
        this.g = c2;
        this.f43120h = i2;
    }

    @Override // j$.time.format.j
    final j e() {
        if (this.f43099e == -1) {
            return this;
        }
        return new s(this.g, this.f43120h, this.f43097b, this.f43098c, -1);
    }

    @Override // j$.time.format.j
    final j f(int i2) {
        int i3 = this.f43099e + i2;
        return new s(this.g, this.f43120h, this.f43097b, this.f43098c, i3);
    }

    @Override // j$.time.format.j, j$.time.format.InterfaceC3555f
    public final boolean p(z zVar, StringBuilder sb) {
        return g(zVar.c()).p(zVar, sb);
    }

    @Override // j$.time.format.j, j$.time.format.InterfaceC3555f
    public final int r(w wVar, CharSequence charSequence, int i2) {
        return g(wVar.i()).r(wVar, charSequence, i2);
    }

    private j g(Locale locale) {
        j$.time.temporal.r rVarI;
        j$.time.temporal.u uVar = j$.time.temporal.y.f43206h;
        Objects.requireNonNull(locale, "locale");
        Calendar calendar = Calendar.getInstance(new Locale(locale.getLanguage(), locale.getCountry()));
        j$.time.temporal.y yVarG = j$.time.temporal.y.g(j$.time.e.SUNDAY.C(calendar.getFirstDayOfWeek() - 1), calendar.getMinimalDaysInFirstWeek());
        char c2 = this.g;
        if (c2 == 'W') {
            rVarI = yVarG.i();
        } else {
            if (c2 == 'Y') {
                j$.time.temporal.r rVarH = yVarG.h();
                int i2 = this.f43120h;
                if (i2 == 2) {
                    return new p(rVarH, p.f43115h, this.f43099e);
                }
                return new j(rVarH, i2, 19, i2 < 4 ? G.NORMAL : G.EXCEEDS_PAD, this.f43099e);
            }
            if (c2 == 'c' || c2 == 'e') {
                rVarI = yVarG.d();
            } else if (c2 == 'w') {
                rVarI = yVarG.j();
            } else {
                throw new IllegalStateException("unreachable");
            }
        }
        return new j(rVarI, this.f43097b, this.f43098c, G.NOT_NEGATIVE, this.f43099e);
    }

    @Override // j$.time.format.j
    public final String toString() {
        StringBuilder sb = new StringBuilder(30);
        sb.append("Localized(");
        int i2 = this.f43120h;
        char c2 = this.g;
        if (c2 != 'Y') {
            if (c2 == 'W') {
                sb.append("WeekOfMonth");
            } else if (c2 == 'c' || c2 == 'e') {
                sb.append("DayOfWeek");
            } else if (c2 == 'w') {
                sb.append("WeekOfWeekBasedYear");
            }
            sb.append(",");
            sb.append(i2);
        } else if (i2 == 1) {
            sb.append("WeekBasedYear");
        } else if (i2 == 2) {
            sb.append("ReducedValue(WeekBasedYear,2,2,2000-01-01)");
        } else {
            sb.append("WeekBasedYear,");
            sb.append(i2);
            sb.append(",19,");
            sb.append(i2 < 4 ? G.NORMAL : G.EXCEEDS_PAD);
        }
        sb.append(")");
        return sb.toString();
    }
}
