package j$.time.temporal;

import j$.time.format.F;
import java.util.HashMap;

/* JADX WARN: Enum visitor error
java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.nodes.MethodNode.getBasicBlocks()" is null
	at jadx.core.dex.visitors.EnumVisitor.searchEnumSuperCtrInsn(EnumVisitor.java:495)
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:473)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes2.dex */
abstract class h implements r {
    public static final h DAY_OF_QUARTER;
    public static final h QUARTER_OF_YEAR;
    public static final h WEEK_BASED_YEAR;
    public static final h WEEK_OF_WEEK_BASED_YEAR;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f43179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ h[] f43180b;

    @Override // j$.time.temporal.r
    public final boolean V() {
        return true;
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) f43180b.clone();
    }

    static {
        h hVar = new h() { // from class: j$.time.temporal.d
            @Override // j$.time.temporal.r
            public final w C() {
                return w.k(1L, 90L, 92L);
            }

            @Override // j$.time.temporal.r
            public final boolean Y(TemporalAccessor temporalAccessor) {
                if (!temporalAccessor.d(a.DAY_OF_YEAR) || !temporalAccessor.d(a.MONTH_OF_YEAR) || !temporalAccessor.d(a.YEAR)) {
                    return false;
                }
                r rVar = j.f43183a;
                return j$.time.chrono.m.F(temporalAccessor).equals(j$.time.chrono.t.d);
            }

            @Override // j$.time.temporal.r
            public final w J(TemporalAccessor temporalAccessor) {
                if (!Y(temporalAccessor)) {
                    throw new v("Unsupported field: DayOfQuarter");
                }
                long jE = temporalAccessor.e(h.QUARTER_OF_YEAR);
                if (jE == 1) {
                    return j$.time.chrono.t.d.E(temporalAccessor.e(a.YEAR)) ? w.j(1L, 91L) : w.j(1L, 90L);
                }
                if (jE == 2) {
                    return w.j(1L, 91L);
                }
                if (jE == 3 || jE == 4) {
                    return w.j(1L, 92L);
                }
                return C();
            }

            @Override // j$.time.temporal.r
            public final long r(TemporalAccessor temporalAccessor) {
                if (!Y(temporalAccessor)) {
                    throw new v("Unsupported field: DayOfQuarter");
                }
                return temporalAccessor.g(a.DAY_OF_YEAR) - h.f43179a[((temporalAccessor.g(a.MONTH_OF_YEAR) - 1) / 3) + (j$.time.chrono.t.d.E(temporalAccessor.e(a.YEAR)) ? 4 : 0)];
            }

            @Override // j$.time.temporal.r
            public final m p(m mVar, long j) {
                long jR = r(mVar);
                C().b(j, this);
                a aVar = a.DAY_OF_YEAR;
                return mVar.h((j - jR) + mVar.e(aVar), aVar);
            }

            @Override // j$.time.temporal.r
            public final TemporalAccessor U(HashMap map, TemporalAccessor temporalAccessor, F f) {
                long jSubtractExact;
                j$.time.h hVarN0;
                a aVar = a.YEAR;
                Long l2 = (Long) map.get(aVar);
                r rVar = h.QUARTER_OF_YEAR;
                Long l3 = (Long) map.get(rVar);
                if (l2 == null || l3 == null) {
                    return null;
                }
                int iB0 = aVar.b0(l2.longValue());
                long jLongValue = ((Long) map.get(h.DAY_OF_QUARTER)).longValue();
                r rVar2 = j.f43183a;
                if (!j$.time.chrono.m.F(temporalAccessor).equals(j$.time.chrono.t.d)) {
                    throw new j$.time.c("Resolve requires IsoChronology");
                }
                if (f == F.LENIENT) {
                    hVarN0 = j$.time.h.h0(iB0, 1, 1).n0(Math.multiplyExact(Math.subtractExact(l3.longValue(), 1L), 3));
                    jSubtractExact = Math.subtractExact(jLongValue, 1L);
                } else {
                    j$.time.h hVarH0 = j$.time.h.h0(iB0, ((rVar.C().a(l3.longValue(), rVar) - 1) * 3) + 1, 1);
                    if (jLongValue < 1 || jLongValue > 90) {
                        if (f == F.STRICT) {
                            J(hVarH0).b(jLongValue, this);
                        } else {
                            C().b(jLongValue, this);
                        }
                    }
                    jSubtractExact = jLongValue - 1;
                    hVarN0 = hVarH0;
                }
                map.remove(this);
                map.remove(aVar);
                map.remove(rVar);
                return hVarN0.m0(jSubtractExact);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "DayOfQuarter";
            }
        };
        DAY_OF_QUARTER = hVar;
        h hVar2 = new h() { // from class: j$.time.temporal.e
            @Override // j$.time.temporal.r
            public final w C() {
                return w.j(1L, 4L);
            }

            @Override // j$.time.temporal.r
            public final boolean Y(TemporalAccessor temporalAccessor) {
                if (!temporalAccessor.d(a.MONTH_OF_YEAR)) {
                    return false;
                }
                r rVar = j.f43183a;
                return j$.time.chrono.m.F(temporalAccessor).equals(j$.time.chrono.t.d);
            }

            @Override // j$.time.temporal.r
            public final long r(TemporalAccessor temporalAccessor) {
                if (!Y(temporalAccessor)) {
                    throw new v("Unsupported field: QuarterOfYear");
                }
                return (temporalAccessor.e(a.MONTH_OF_YEAR) + 2) / 3;
            }

            @Override // j$.time.temporal.r
            public final w J(TemporalAccessor temporalAccessor) {
                if (!Y(temporalAccessor)) {
                    throw new v("Unsupported field: QuarterOfYear");
                }
                return C();
            }

            @Override // j$.time.temporal.r
            public final m p(m mVar, long j) {
                long jR = r(mVar);
                C().b(j, this);
                a aVar = a.MONTH_OF_YEAR;
                return mVar.h(((j - jR) * 3) + mVar.e(aVar), aVar);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "QuarterOfYear";
            }
        };
        QUARTER_OF_YEAR = hVar2;
        h hVar3 = new h() { // from class: j$.time.temporal.f
            @Override // j$.time.temporal.r
            public final w C() {
                return w.k(1L, 52L, 53L);
            }

            @Override // j$.time.temporal.r
            public final boolean Y(TemporalAccessor temporalAccessor) {
                if (!temporalAccessor.d(a.EPOCH_DAY)) {
                    return false;
                }
                r rVar = j.f43183a;
                return j$.time.chrono.m.F(temporalAccessor).equals(j$.time.chrono.t.d);
            }

            @Override // j$.time.temporal.r
            public final w J(TemporalAccessor temporalAccessor) {
                if (!Y(temporalAccessor)) {
                    throw new v("Unsupported field: WeekOfWeekBasedYear");
                }
                return h.f0(j$.time.h.J(temporalAccessor));
            }

            @Override // j$.time.temporal.r
            public final long r(TemporalAccessor temporalAccessor) {
                if (!Y(temporalAccessor)) {
                    throw new v("Unsupported field: WeekOfWeekBasedYear");
                }
                return h.c0(j$.time.h.J(temporalAccessor));
            }

            @Override // j$.time.temporal.r
            public final m p(m mVar, long j) {
                C().b(j, this);
                return mVar.l(Math.subtractExact(j, r(mVar)), b.WEEKS);
            }

            @Override // j$.time.temporal.r
            public final TemporalAccessor U(HashMap map, TemporalAccessor temporalAccessor, F f) {
                j$.time.h hVarH;
                long j;
                long j2;
                r rVar = h.WEEK_BASED_YEAR;
                Long l2 = (Long) map.get(rVar);
                a aVar = a.DAY_OF_WEEK;
                Long l3 = (Long) map.get(aVar);
                if (l2 == null || l3 == null) {
                    return null;
                }
                int iA = rVar.C().a(l2.longValue(), rVar);
                long jLongValue = ((Long) map.get(h.WEEK_OF_WEEK_BASED_YEAR)).longValue();
                r rVar2 = j.f43183a;
                if (j$.time.chrono.m.F(temporalAccessor).equals(j$.time.chrono.t.d)) {
                    j$.time.h hVarH0 = j$.time.h.h0(iA, 1, 4);
                    if (f == F.LENIENT) {
                        long jLongValue2 = l3.longValue();
                        if (jLongValue2 > 7) {
                            long j3 = jLongValue2 - 1;
                            j = 1;
                            hVarH0 = hVarH0.o0(j3 / 7);
                            j2 = j3 % 7;
                        } else {
                            j = 1;
                            if (jLongValue2 < 1) {
                                hVarH0 = hVarH0.o0(Math.subtractExact(jLongValue2, 7L) / 7);
                                j2 = (jLongValue2 + 6) % 7;
                            }
                            hVarH = hVarH0.o0(Math.subtractExact(jLongValue, j)).h(jLongValue2, aVar);
                        }
                        jLongValue2 = j2 + j;
                        hVarH = hVarH0.o0(Math.subtractExact(jLongValue, j)).h(jLongValue2, aVar);
                    } else {
                        int iB0 = aVar.b0(l3.longValue());
                        if (jLongValue < 1 || jLongValue > 52) {
                            if (f == F.STRICT) {
                                h.f0(hVarH0).b(jLongValue, this);
                            } else {
                                C().b(jLongValue, this);
                            }
                        }
                        hVarH = hVarH0.o0(jLongValue - 1).h(iB0, aVar);
                    }
                    map.remove(this);
                    map.remove(rVar);
                    map.remove(aVar);
                    return hVarH;
                }
                throw new j$.time.c("Resolve requires IsoChronology");
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "WeekOfWeekBasedYear";
            }
        };
        WEEK_OF_WEEK_BASED_YEAR = hVar3;
        h hVar4 = new h() { // from class: j$.time.temporal.g
            @Override // j$.time.temporal.r
            public final w C() {
                return a.YEAR.C();
            }

            @Override // j$.time.temporal.r
            public final boolean Y(TemporalAccessor temporalAccessor) {
                if (!temporalAccessor.d(a.EPOCH_DAY)) {
                    return false;
                }
                r rVar = j.f43183a;
                return j$.time.chrono.m.F(temporalAccessor).equals(j$.time.chrono.t.d);
            }

            @Override // j$.time.temporal.r
            public final long r(TemporalAccessor temporalAccessor) {
                if (!Y(temporalAccessor)) {
                    throw new v("Unsupported field: WeekBasedYear");
                }
                return h.g0(j$.time.h.J(temporalAccessor));
            }

            @Override // j$.time.temporal.r
            public final w J(TemporalAccessor temporalAccessor) {
                if (!Y(temporalAccessor)) {
                    throw new v("Unsupported field: WeekBasedYear");
                }
                return C();
            }

            @Override // j$.time.temporal.r
            public final m p(m mVar, long j) {
                if (!Y(mVar)) {
                    throw new v("Unsupported field: WeekBasedYear");
                }
                int iA = a.YEAR.C().a(j, h.WEEK_BASED_YEAR);
                j$.time.h hVarJ = j$.time.h.J(mVar);
                a aVar = a.DAY_OF_WEEK;
                int iG = hVarJ.g(aVar);
                int iC0 = h.c0(hVarJ);
                if (iC0 == 53 && h.h0(iA) == 52) {
                    iC0 = 52;
                }
                j$.time.h hVarH0 = j$.time.h.h0(iA, 1, 4);
                return mVar.m(hVarH0.m0(((iC0 - 1) * 7) + (iG - hVarH0.g(aVar))));
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "WeekBasedYear";
            }
        };
        WEEK_BASED_YEAR = hVar4;
        f43180b = new h[]{hVar, hVar2, hVar3, hVar4};
        f43179a = new int[]{0, 90, 181, 273, 0, 91, 182, 274};
    }

    static w f0(j$.time.h hVar) {
        return w.j(1L, h0(g0(hVar)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int h0(int i2) {
        j$.time.h hVarH0 = j$.time.h.h0(i2, 1, 1);
        if (hVarH0.V() != j$.time.e.THURSDAY) {
            return (hVarH0.V() == j$.time.e.WEDNESDAY && hVarH0.O()) ? 53 : 52;
        }
        return 53;
    }

    static int c0(j$.time.h hVar) {
        int iOrdinal = hVar.V().ordinal();
        int iY = hVar.Y() - 1;
        int i2 = (3 - iOrdinal) + iY;
        int i3 = i2 - ((i2 / 7) * 7);
        int i4 = i3 - 3;
        if (i4 < -3) {
            i4 = i3 + 4;
        }
        if (iY < i4) {
            return (int) w.j(1L, h0(g0(hVar.t0(180).p0(-1L)))).d();
        }
        int i5 = ((iY - i4) / 7) + 1;
        if (i5 != 53 || i4 == -3 || (i4 == -2 && hVar.O())) {
            return i5;
        }
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int g0(j$.time.h hVar) {
        int iC0 = hVar.c0();
        int iY = hVar.Y();
        if (iY <= 3) {
            return iY - hVar.V().ordinal() < -2 ? iC0 - 1 : iC0;
        }
        if (iY >= 363) {
            return ((iY - 363) - (hVar.O() ? 1 : 0)) - hVar.V().ordinal() >= 0 ? iC0 + 1 : iC0;
        }
        return iC0;
    }
}
