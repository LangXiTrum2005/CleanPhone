package j$.time.format;

import com.thinkup.core.common.n.mo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Objects;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes2.dex */
public final class v {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final C3550a f43127h = new C3550a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final HashMap f43128i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private v f43129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final v f43130b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayList f43131c;
    private final boolean d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f43132e;
    private char f;
    private int g;

    static {
        HashMap map = new HashMap();
        f43128i = map;
        map.put('G', j$.time.temporal.a.ERA);
        map.put('y', j$.time.temporal.a.YEAR_OF_ERA);
        map.put(Character.valueOf(AbstractJsonLexerKt.UNICODE_ESC), j$.time.temporal.a.YEAR);
        j$.time.temporal.r rVar = j$.time.temporal.j.f43183a;
        map.put('Q', rVar);
        map.put('q', rVar);
        j$.time.temporal.a aVar = j$.time.temporal.a.MONTH_OF_YEAR;
        map.put('M', aVar);
        map.put('L', aVar);
        map.put('D', j$.time.temporal.a.DAY_OF_YEAR);
        map.put('d', j$.time.temporal.a.DAY_OF_MONTH);
        map.put('F', j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH);
        j$.time.temporal.a aVar2 = j$.time.temporal.a.DAY_OF_WEEK;
        map.put('E', aVar2);
        map.put('c', aVar2);
        map.put('e', aVar2);
        map.put('a', j$.time.temporal.a.AMPM_OF_DAY);
        map.put('H', j$.time.temporal.a.HOUR_OF_DAY);
        map.put('k', j$.time.temporal.a.CLOCK_HOUR_OF_DAY);
        map.put('K', j$.time.temporal.a.HOUR_OF_AMPM);
        map.put('h', j$.time.temporal.a.CLOCK_HOUR_OF_AMPM);
        map.put('m', j$.time.temporal.a.MINUTE_OF_HOUR);
        map.put('s', j$.time.temporal.a.SECOND_OF_MINUTE);
        j$.time.temporal.a aVar3 = j$.time.temporal.a.NANO_OF_SECOND;
        map.put('S', aVar3);
        map.put('A', j$.time.temporal.a.MILLI_OF_DAY);
        map.put('n', aVar3);
        map.put('N', j$.time.temporal.a.NANO_OF_DAY);
        map.put('g', j$.time.temporal.l.f43189a);
    }

    public v() {
        this.f43129a = this;
        this.f43131c = new ArrayList();
        this.g = -1;
        this.f43130b = null;
        this.d = false;
    }

    private v(v vVar) {
        this.f43129a = this;
        this.f43131c = new ArrayList();
        this.g = -1;
        this.f43130b = vVar;
        this.d = true;
    }

    public final void u() {
        d(q.SENSITIVE);
    }

    public final void t() {
        d(q.INSENSITIVE);
    }

    public final void w() {
        d(q.STRICT);
    }

    public final void v() {
        d(q.LENIENT);
    }

    public final void n(j$.time.temporal.r rVar) {
        m(new j(rVar, 1, 19, G.NORMAL));
    }

    public final void o(j$.time.temporal.r rVar, int i2) {
        Objects.requireNonNull(rVar, "field");
        if (i2 < 1 || i2 > 19) {
            throw new IllegalArgumentException("The width must be from 1 to 19 inclusive but was " + i2);
        }
        m(new j(rVar, i2, i2, G.NOT_NEGATIVE));
    }

    public final void p(j$.time.temporal.r rVar, int i2, int i3, G g) {
        if (i2 == i3 && g == G.NOT_NEGATIVE) {
            o(rVar, i3);
            return;
        }
        Objects.requireNonNull(rVar, "field");
        Objects.requireNonNull(g, "signStyle");
        if (i2 < 1 || i2 > 19) {
            throw new IllegalArgumentException("The minimum width must be from 1 to 19 inclusive but was " + i2);
        }
        if (i3 < 1 || i3 > 19) {
            throw new IllegalArgumentException("The maximum width must be from 1 to 19 inclusive but was " + i3);
        }
        if (i3 < i2) {
            throw new IllegalArgumentException("The maximum width must exceed or equal the minimum width but " + i3 + " < " + i2);
        }
        m(new j(rVar, i2, i3, g));
    }

    private void m(j jVar) {
        j jVarE;
        v vVar = this.f43129a;
        int i2 = vVar.g;
        if (i2 >= 0) {
            j jVar2 = (j) vVar.f43131c.get(i2);
            int i3 = jVar.f43097b;
            int i4 = jVar.f43098c;
            if (i3 == i4 && jVar.d == G.NOT_NEGATIVE) {
                jVarE = jVar2.f(i4);
                d(jVar.e());
                this.f43129a.g = i2;
            } else {
                jVarE = jVar2.e();
                this.f43129a.g = d(jVar);
            }
            this.f43129a.f43131c.set(i2, jVarE);
            return;
        }
        vVar.g = d(jVar);
    }

    public final void b(j$.time.temporal.a aVar, int i2, int i3, boolean z2) {
        if (i2 == i3 && !z2) {
            m(new C3556g(aVar, i2, i3, z2));
        } else {
            d(new C3556g(aVar, i2, i3, z2));
        }
    }

    public final void l(j$.time.temporal.r rVar, H h2) {
        Objects.requireNonNull(h2, "textStyle");
        d(new r(rVar, h2, C.d()));
    }

    public final void k(j$.time.temporal.a aVar, HashMap map) {
        Objects.requireNonNull(aVar, "field");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        H h2 = H.FULL;
        d(new r(aVar, h2, new C3551b(new B(Collections.singletonMap(h2, linkedHashMap)))));
    }

    public final void c() {
        d(new C3557h());
    }

    public final void i() {
        d(k.f43100e);
    }

    public final void h(String str, String str2) {
        d(new k(str, str2));
    }

    public final void g(H h2) {
        Objects.requireNonNull(h2, "style");
        if (h2 != H.FULL && h2 != H.SHORT) {
            throw new IllegalArgumentException("Style must be either full or short");
        }
        d(new C3558i(h2, 0));
    }

    public final void q() {
        d(new t(f43127h, "ZoneRegionId()"));
    }

    public final void e(char c2) {
        d(new C3553d(c2));
    }

    public final void f(String str) {
        Objects.requireNonNull(str, "literal");
        if (str.isEmpty()) {
            return;
        }
        if (str.length() == 1) {
            d(new C3553d(str.charAt(0)));
        } else {
            d(new C3558i(str, 1));
        }
    }

    public final void a(DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        d(dateTimeFormatter.g());
    }

    /* JADX WARN: Code duplicated, block: B:118:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:119:0x01cb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:120:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:131:0x020c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:149:0x024a  */
    /* JADX WARN: Code duplicated, block: B:151:0x024e  */
    /* JADX WARN: Code duplicated, block: B:152:0x025b  */
    /* JADX WARN: Code duplicated, block: B:154:0x0260  */
    /* JADX WARN: Code duplicated, block: B:155:0x0267 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:156:0x0269  */
    /* JADX WARN: Code duplicated, block: B:157:0x026e  */
    /* JADX WARN: Code duplicated, block: B:158:0x0273  */
    /* JADX WARN: Code duplicated, block: B:260:0x046c  */
    /* JADX WARN: Code duplicated, block: B:262:0x0476  */
    /* JADX WARN: Code duplicated, block: B:263:0x047a  */
    /* JADX WARN: Code duplicated, block: B:295:0x01d2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:308:0x0485 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:75:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:83:0x011d  */
    public final void j(String str) {
        String strSubstring;
        int i2;
        int i3;
        boolean z2;
        int i4;
        int i5;
        char c2;
        int i6;
        int i7;
        Objects.requireNonNull(str, "pattern");
        int i8 = 0;
        while (i8 < str.length()) {
            char cCharAt = str.charAt(i8);
            if ((cCharAt >= 'A' && cCharAt <= 'Z') || (cCharAt >= 'a' && cCharAt <= 'z')) {
                int i9 = i8 + 1;
                while (i9 < str.length() && str.charAt(i9) == cCharAt) {
                    i9++;
                }
                int i10 = i9 - i8;
                if (cCharAt == 'p') {
                    if (i9 >= str.length() || (((cCharAt = str.charAt(i9)) < 'A' || cCharAt > 'Z') && (cCharAt < 'a' || cCharAt > 'z'))) {
                        i6 = i9;
                        i7 = i10;
                        i10 = 0;
                    } else {
                        i6 = i9 + 1;
                        while (i6 < str.length() && str.charAt(i6) == cCharAt) {
                            i6++;
                        }
                        i7 = i6 - i9;
                    }
                    if (i10 == 0) {
                        throw new IllegalArgumentException("Pad letter 'p' must be followed by valid pad pattern: ".concat(str));
                    }
                    if (i10 < 1) {
                        throw new IllegalArgumentException("The pad width must be at least one but was " + i10);
                    }
                    v vVar = this.f43129a;
                    vVar.f43132e = i10;
                    vVar.f = ' ';
                    vVar.g = -1;
                    i10 = i7;
                    i2 = i6;
                } else {
                    i2 = i9;
                }
                j$.time.temporal.r rVar = (j$.time.temporal.r) f43128i.get(Character.valueOf(cCharAt));
                if (rVar == null) {
                    char c3 = cCharAt;
                    if (c3 == 'z') {
                        if (i10 > 4) {
                            throw new IllegalArgumentException("Too many pattern letters: " + c3);
                        }
                        if (i10 == 4) {
                            d(new u(H.FULL, false));
                        } else {
                            d(new u(H.SHORT, false));
                        }
                    } else if (c3 == 'V') {
                        if (i10 != 2) {
                            throw new IllegalArgumentException("Pattern letter count must be 2: " + c3);
                        }
                        d(new t(j$.time.temporal.s.g(), "ZoneId()"));
                    } else if (c3 != 'v') {
                        String str2 = "+0000";
                        if (c3 == 'Z') {
                            if (i10 < 4) {
                                h("+HHMM", "+0000");
                            } else if (i10 == 4) {
                                g(H.FULL);
                            } else {
                                if (i10 != 5) {
                                    throw new IllegalArgumentException("Too many pattern letters: " + c3);
                                }
                                h("+HH:MM:ss", "Z");
                            }
                        } else if (c3 == 'O') {
                            if (i10 == 1) {
                                g(H.SHORT);
                            } else {
                                if (i10 != 4) {
                                    throw new IllegalArgumentException("Pattern letter count must be 1 or 4: " + c3);
                                }
                                g(H.FULL);
                            }
                        } else if (c3 == 'X') {
                            if (i10 > 5) {
                                throw new IllegalArgumentException("Too many pattern letters: " + c3);
                            }
                            h(k.d[i10 + (i10 == 1 ? 0 : 1)], "Z");
                        } else if (c3 == 'x') {
                            if (i10 > 5) {
                                throw new IllegalArgumentException("Too many pattern letters: " + c3);
                            }
                            if (i10 == 1) {
                                str2 = "+00";
                            } else if (i10 % 2 != 0) {
                                str2 = "+00:00";
                            }
                            h(k.d[i10 + (i10 == 1 ? 0 : 1)], str2);
                        } else if (c3 != 'W') {
                            int i11 = i10;
                            if (c3 == 'w') {
                                if (i11 > 2) {
                                    throw new IllegalArgumentException("Too many pattern letters: " + c3);
                                }
                                m(new s(c3, i11, i11, 2, 0));
                            } else {
                                if (c3 != 'Y') {
                                    throw new IllegalArgumentException("Unknown pattern letter: " + c3);
                                }
                                if (i11 == 2) {
                                    m(new s(c3, i11, i11, 2, 0));
                                } else {
                                    m(new s(c3, i11, i11, 19, 0));
                                }
                            }
                        } else {
                            if (i10 > 1) {
                                throw new IllegalArgumentException("Too many pattern letters: " + c3);
                            }
                            m(new s(c3, i10, i10, i10, 0));
                        }
                    } else if (i10 == 1) {
                        d(new u(H.SHORT, true));
                    } else {
                        if (i10 != 4) {
                            throw new IllegalArgumentException("Wrong number of  pattern letters: " + c3);
                        }
                        d(new u(H.FULL, true));
                    }
                } else if (cCharAt == 'A') {
                    p(rVar, i10, 19, G.NOT_NEGATIVE);
                } else if (cCharAt == 'Q') {
                    i3 = i10;
                    cCharAt = cCharAt;
                    z2 = false;
                    if (i3 == 1 || i3 == 2) {
                        if (cCharAt == 'e') {
                            m(new s(cCharAt, i3, i3, i3, 0));
                        } else {
                            i4 = i3;
                            if (cCharAt == 'E') {
                                l(rVar, H.SHORT);
                            } else if (i4 == 1) {
                                n(rVar);
                            } else {
                                o(rVar, 2);
                            }
                        }
                    } else if (i3 == 3) {
                        l(rVar, z2 ? H.SHORT_STANDALONE : H.SHORT);
                    } else if (i3 == 4) {
                        l(rVar, z2 ? H.FULL_STANDALONE : H.FULL);
                    } else {
                        if (i3 != 5) {
                            throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                        }
                        l(rVar, z2 ? H.NARROW_STANDALONE : H.NARROW);
                    }
                } else if (cCharAt == 'S') {
                    int i12 = i10;
                    b(j$.time.temporal.a.NANO_OF_SECOND, i12, i12, false);
                } else if (cCharAt == 'a') {
                    char c4 = cCharAt;
                    if (i10 != 1) {
                        throw new IllegalArgumentException("Too many pattern letters: " + c4);
                    }
                    l(rVar, H.SHORT);
                } else if (cCharAt == 'k') {
                    i5 = i10;
                    c2 = cCharAt;
                    if (i5 == 1) {
                        n(rVar);
                    } else {
                        if (i5 == 2) {
                            throw new IllegalArgumentException("Too many pattern letters: " + c2);
                        }
                        o(rVar, i5);
                    }
                } else if (cCharAt == 'q') {
                    i3 = i10;
                    z2 = true;
                    if (i3 == 1) {
                        if (cCharAt == 'e') {
                            m(new s(cCharAt, i3, i3, i3, 0));
                        } else {
                            i4 = i3;
                            if (cCharAt == 'E') {
                                l(rVar, H.SHORT);
                            } else if (i4 == 1) {
                                n(rVar);
                            } else {
                                o(rVar, 2);
                            }
                        }
                    } else if (cCharAt == 'e') {
                        m(new s(cCharAt, i3, i3, i3, 0));
                    } else {
                        i4 = i3;
                        if (cCharAt == 'E') {
                            l(rVar, H.SHORT);
                        } else if (i4 == 1) {
                            n(rVar);
                        } else {
                            o(rVar, 2);
                        }
                    }
                } else if (cCharAt == 's') {
                    i5 = i10;
                    c2 = cCharAt;
                    if (i5 == 1) {
                        n(rVar);
                    } else {
                        if (i5 == 2) {
                            throw new IllegalArgumentException("Too many pattern letters: " + c2);
                        }
                        o(rVar, i5);
                    }
                } else if (cCharAt == 'u' || cCharAt == 'y') {
                    int i13 = i10;
                    if (i13 == 2) {
                        j$.time.h hVar = p.f43115h;
                        Objects.requireNonNull(hVar, "baseDate");
                        m(new p(rVar, hVar));
                    } else if (i13 < 4) {
                        p(rVar, i13, 19, G.NORMAL);
                    } else {
                        p(rVar, i13, 19, G.EXCEEDS_PAD);
                    }
                } else if (cCharAt == 'g') {
                    p(rVar, i10, 19, G.NORMAL);
                } else if (cCharAt == 'h' || cCharAt == 'm') {
                    i5 = i10;
                    c2 = cCharAt;
                    if (i5 == 1) {
                        n(rVar);
                    } else {
                        if (i5 == 2) {
                            throw new IllegalArgumentException("Too many pattern letters: " + c2);
                        }
                        o(rVar, i5);
                    }
                } else if (cCharAt != 'n') {
                    switch (cCharAt) {
                        case 'D':
                            int i14 = i10;
                            char c5 = cCharAt;
                            if (i14 == 1) {
                                n(rVar);
                            } else {
                                if (i14 != 2 && i14 != 3) {
                                    throw new IllegalArgumentException("Too many pattern letters: " + c5);
                                }
                                p(rVar, i14, 3, G.NOT_NEGATIVE);
                            }
                            break;
                        case mo.oom.onn /* 69 */:
                            i3 = i10;
                            cCharAt = cCharAt;
                            z2 = false;
                            if (i3 == 1) {
                                if (cCharAt == 'e') {
                                    i4 = i3;
                                    if (cCharAt == 'E') {
                                        l(rVar, H.SHORT);
                                    } else if (i4 == 1) {
                                        o(rVar, 2);
                                    } else {
                                        n(rVar);
                                    }
                                } else {
                                    m(new s(cCharAt, i3, i3, i3, 0));
                                }
                            } else if (cCharAt == 'e') {
                                i4 = i3;
                                if (cCharAt == 'E') {
                                    l(rVar, H.SHORT);
                                } else if (i4 == 1) {
                                    o(rVar, 2);
                                } else {
                                    n(rVar);
                                }
                            } else {
                                m(new s(cCharAt, i3, i3, i3, 0));
                            }
                            break;
                        case com.smartdigimkt.f3.b.B0 /* 70 */:
                            char c6 = cCharAt;
                            if (i10 != 1) {
                                throw new IllegalArgumentException("Too many pattern letters: " + c6);
                            }
                            n(rVar);
                            break;
                            break;
                        case 'G':
                            int i15 = i10;
                            char c7 = cCharAt;
                            if (i15 == 1 || i15 == 2 || i15 == 3) {
                                l(rVar, H.SHORT);
                            } else if (i15 == 4) {
                                l(rVar, H.FULL);
                            } else {
                                if (i15 != 5) {
                                    throw new IllegalArgumentException("Too many pattern letters: " + c7);
                                }
                                l(rVar, H.NARROW);
                            }
                            break;
                        case 'H':
                            i5 = i10;
                            c2 = cCharAt;
                            if (i5 == 1) {
                                n(rVar);
                            } else {
                                if (i5 == 2) {
                                    throw new IllegalArgumentException("Too many pattern letters: " + c2);
                                }
                                o(rVar, i5);
                            }
                            break;
                        default:
                            switch (cCharAt) {
                                case mo.oom.oom /* 75 */:
                                    i5 = i10;
                                    c2 = cCharAt;
                                    if (i5 == 1) {
                                        n(rVar);
                                    } else {
                                        if (i5 == 2) {
                                            throw new IllegalArgumentException("Too many pattern letters: " + c2);
                                        }
                                        o(rVar, i5);
                                    }
                                    break;
                                case 'L':
                                    i3 = i10;
                                    z2 = true;
                                    if (i3 == 1) {
                                        if (cCharAt == 'e') {
                                            i4 = i3;
                                            if (cCharAt == 'E') {
                                                l(rVar, H.SHORT);
                                            } else if (i4 == 1) {
                                                o(rVar, 2);
                                            } else {
                                                n(rVar);
                                            }
                                        } else {
                                            m(new s(cCharAt, i3, i3, i3, 0));
                                        }
                                    } else if (cCharAt == 'e') {
                                        i4 = i3;
                                        if (cCharAt == 'E') {
                                            l(rVar, H.SHORT);
                                        } else if (i4 == 1) {
                                            o(rVar, 2);
                                        } else {
                                            n(rVar);
                                        }
                                    } else {
                                        m(new s(cCharAt, i3, i3, i3, 0));
                                    }
                                    break;
                                case mo.oom.ono /* 77 */:
                                    i3 = i10;
                                    cCharAt = cCharAt;
                                    z2 = false;
                                    if (i3 == 1) {
                                        if (cCharAt == 'e') {
                                            i4 = i3;
                                            if (cCharAt == 'E') {
                                                l(rVar, H.SHORT);
                                            } else if (i4 == 1) {
                                                o(rVar, 2);
                                            } else {
                                                n(rVar);
                                            }
                                        } else {
                                            m(new s(cCharAt, i3, i3, i3, 0));
                                        }
                                    } else if (cCharAt == 'e') {
                                        i4 = i3;
                                        if (cCharAt == 'E') {
                                            l(rVar, H.SHORT);
                                        } else if (i4 == 1) {
                                            o(rVar, 2);
                                        } else {
                                            n(rVar);
                                        }
                                    } else {
                                        m(new s(cCharAt, i3, i3, i3, 0));
                                    }
                                    break;
                                case 'N':
                                    p(rVar, i10, 19, G.NOT_NEGATIVE);
                                    break;
                                default:
                                    switch (cCharAt) {
                                        case 'c':
                                            if (i10 != 1) {
                                                i3 = i10;
                                                if (i3 == 2) {
                                                    throw new IllegalArgumentException("Invalid pattern \"cc\"");
                                                }
                                                z2 = true;
                                                if (i3 == 1) {
                                                    if (cCharAt == 'e') {
                                                        i4 = i3;
                                                        if (cCharAt == 'E') {
                                                            l(rVar, H.SHORT);
                                                        } else if (i4 == 1) {
                                                            o(rVar, 2);
                                                        } else {
                                                            n(rVar);
                                                        }
                                                    } else {
                                                        m(new s(cCharAt, i3, i3, i3, 0));
                                                    }
                                                } else if (cCharAt == 'e') {
                                                    i4 = i3;
                                                    if (cCharAt == 'E') {
                                                        l(rVar, H.SHORT);
                                                    } else if (i4 == 1) {
                                                        o(rVar, 2);
                                                    } else {
                                                        n(rVar);
                                                    }
                                                } else {
                                                    m(new s(cCharAt, i3, i3, i3, 0));
                                                }
                                            } else {
                                                m(new s(cCharAt, i10, i10, i10, 0));
                                            }
                                            break;
                                        case 'd':
                                            i5 = i10;
                                            c2 = cCharAt;
                                            if (i5 == 1) {
                                                n(rVar);
                                            } else {
                                                if (i5 == 2) {
                                                    throw new IllegalArgumentException("Too many pattern letters: " + c2);
                                                }
                                                o(rVar, i5);
                                            }
                                            break;
                                        case 'e':
                                            i3 = i10;
                                            cCharAt = cCharAt;
                                            z2 = false;
                                            if (i3 == 1) {
                                                if (cCharAt == 'e') {
                                                    i4 = i3;
                                                    if (cCharAt == 'E') {
                                                        l(rVar, H.SHORT);
                                                    } else if (i4 == 1) {
                                                        o(rVar, 2);
                                                    } else {
                                                        n(rVar);
                                                    }
                                                } else {
                                                    m(new s(cCharAt, i3, i3, i3, 0));
                                                }
                                            } else if (cCharAt == 'e') {
                                                i4 = i3;
                                                if (cCharAt == 'E') {
                                                    l(rVar, H.SHORT);
                                                } else if (i4 == 1) {
                                                    o(rVar, 2);
                                                } else {
                                                    n(rVar);
                                                }
                                            } else {
                                                m(new s(cCharAt, i3, i3, i3, 0));
                                            }
                                            break;
                                        default:
                                            if (i10 != 1) {
                                                o(rVar, i10);
                                            } else {
                                                n(rVar);
                                            }
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                } else {
                    p(rVar, i10, 19, G.NOT_NEGATIVE);
                }
                i8 = i2 - 1;
            } else if (cCharAt == '\'') {
                int i16 = i8 + 1;
                int i17 = i16;
                while (i17 < str.length()) {
                    if (str.charAt(i17) == '\'') {
                        int i18 = i17 + 1;
                        if (i18 < str.length() && str.charAt(i18) == '\'') {
                            i17 = i18;
                        } else {
                            if (i17 < str.length()) {
                                throw new IllegalArgumentException("Pattern ends with an incomplete string literal: ".concat(str));
                            }
                            strSubstring = str.substring(i16, i17);
                            if (strSubstring.isEmpty()) {
                                e('\'');
                            } else {
                                f(strSubstring.replace("''", "'"));
                            }
                            i8 = i17;
                        }
                    }
                    i17++;
                }
                if (i17 < str.length()) {
                    throw new IllegalArgumentException("Pattern ends with an incomplete string literal: ".concat(str));
                }
                strSubstring = str.substring(i16, i17);
                if (strSubstring.isEmpty()) {
                    e('\'');
                } else {
                    f(strSubstring.replace("''", "'"));
                }
                i8 = i17;
            } else if (cCharAt == '[') {
                s();
            } else if (cCharAt == ']') {
                if (this.f43129a.f43130b == null) {
                    throw new IllegalArgumentException("Pattern invalid as it contains ] without previous [");
                }
                r();
            } else {
                if (cCharAt == '{' || cCharAt == '}' || cCharAt == '#') {
                    throw new IllegalArgumentException("Pattern includes reserved character: '" + cCharAt + "'");
                }
                e(cCharAt);
            }
            i8++;
        }
    }

    public final void s() {
        v vVar = this.f43129a;
        vVar.g = -1;
        this.f43129a = new v(vVar);
    }

    public final void r() {
        v vVar = this.f43129a;
        if (vVar.f43130b == null) {
            throw new IllegalStateException("Cannot call optionalEnd() as there was no previous call to optionalStart()");
        }
        if (vVar.f43131c.size() > 0) {
            v vVar2 = this.f43129a;
            C3554e c3554e = new C3554e(vVar2.f43131c, vVar2.d);
            this.f43129a = this.f43129a.f43130b;
            d(c3554e);
            return;
        }
        this.f43129a = this.f43129a.f43130b;
    }

    private int d(InterfaceC3555f interfaceC3555f) {
        Objects.requireNonNull(interfaceC3555f, "pp");
        v vVar = this.f43129a;
        int i2 = vVar.f43132e;
        if (i2 > 0) {
            l lVar = new l(interfaceC3555f, i2, vVar.f);
            vVar.f43132e = 0;
            vVar.f = (char) 0;
            interfaceC3555f = lVar;
        }
        vVar.f43131c.add(interfaceC3555f);
        v vVar2 = this.f43129a;
        vVar2.g = -1;
        return vVar2.f43131c.size() - 1;
    }

    public final DateTimeFormatter x() {
        return z(Locale.getDefault(), F.SMART, null);
    }

    final DateTimeFormatter y(F f, j$.time.chrono.t tVar) {
        return z(Locale.getDefault(), f, tVar);
    }

    private DateTimeFormatter z(Locale locale, F f, j$.time.chrono.t tVar) {
        Objects.requireNonNull(locale, "locale");
        while (this.f43129a.f43130b != null) {
            r();
        }
        C3554e c3554e = new C3554e(this.f43131c, false);
        D d = D.f43071a;
        return new DateTimeFormatter(c3554e, locale, f, tVar);
    }
}
