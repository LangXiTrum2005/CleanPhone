package j$.time.temporal;

import com.p004ironsource.d9;
import j$.time.chrono.InterfaceC3540b;
import j$.time.format.F;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
final class x implements r {
    private static final w f = w.j(1, 7);
    private static final w g = w.k(0, 4, 6);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final w f43200h = w.k(0, 52, 54);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final w f43201i = w.k(1, 52, 53);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f43202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final y f43203b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Enum f43204c;
    private final Enum d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final w f43205e;

    @Override // j$.time.temporal.r
    public final boolean V() {
        return true;
    }

    static x e(y yVar) {
        return new x("DayOfWeek", yVar, b.DAYS, b.WEEKS, f);
    }

    static x h(y yVar) {
        return new x("WeekOfMonth", yVar, b.WEEKS, b.MONTHS, g);
    }

    static x i(y yVar) {
        return new x("WeekOfWeekBasedYear", yVar, b.WEEKS, j.d, f43201i);
    }

    static x g(y yVar) {
        return new x("WeekBasedYear", yVar, j.d, b.FOREVER, a.YEAR.C());
    }

    private InterfaceC3540b f(j$.time.chrono.m mVar, int i2, int i3, int i4) {
        InterfaceC3540b interfaceC3540bG = mVar.G(i2, 1, 1);
        int iL = l(1, b(interfaceC3540bG));
        return interfaceC3540bG.l(((Math.min(i3, a(iL, this.f43203b.f() + interfaceC3540bG.K()) - 1) - 1) * 7) + (i4 - 1) + (-iL), (u) b.DAYS);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private x(String str, y yVar, u uVar, u uVar2, w wVar) {
        this.f43202a = str;
        this.f43203b = yVar;
        this.f43204c = (Enum) uVar;
        this.d = (Enum) uVar2;
        this.f43205e = wVar;
    }

    @Override // j$.time.temporal.r
    public final long r(TemporalAccessor temporalAccessor) {
        int iC;
        b bVar = b.WEEKS;
        Enum r1 = this.d;
        if (r1 == bVar) {
            iC = b(temporalAccessor);
        } else if (r1 != b.MONTHS) {
            if (r1 != b.YEARS) {
                if (r1 == y.f43206h) {
                    iC = d(temporalAccessor);
                } else if (r1 == b.FOREVER) {
                    iC = c(temporalAccessor);
                } else {
                    throw new IllegalStateException("unreachable, rangeUnit: " + r1 + ", this: " + this);
                }
            } else {
                int iB = b(temporalAccessor);
                int iG = temporalAccessor.g(a.DAY_OF_YEAR);
                iC = a(l(iG, iB), iG);
            }
        } else {
            int iB2 = b(temporalAccessor);
            int iG2 = temporalAccessor.g(a.DAY_OF_MONTH);
            iC = a(l(iG2, iB2), iG2);
        }
        return iC;
    }

    private int b(TemporalAccessor temporalAccessor) {
        return Math.floorMod(temporalAccessor.g(a.DAY_OF_WEEK) - this.f43203b.e().p(), 7) + 1;
    }

    private int c(TemporalAccessor temporalAccessor) {
        int iB = b(temporalAccessor);
        int iG = temporalAccessor.g(a.YEAR);
        a aVar = a.DAY_OF_YEAR;
        int iG2 = temporalAccessor.g(aVar);
        int iL = l(iG2, iB);
        int iA = a(iL, iG2);
        if (iA == 0) {
            return iG - 1;
        }
        return iA >= a(iL, this.f43203b.f() + ((int) temporalAccessor.k(aVar).d())) ? iG + 1 : iG;
    }

    private int d(TemporalAccessor temporalAccessor) {
        int iB = b(temporalAccessor);
        a aVar = a.DAY_OF_YEAR;
        int iG = temporalAccessor.g(aVar);
        int iL = l(iG, iB);
        int iA = a(iL, iG);
        if (iA == 0) {
            return d(j$.time.chrono.m.F(temporalAccessor).t(temporalAccessor).c(iG, (u) b.DAYS));
        }
        if (iA <= 50) {
            return iA;
        }
        int iA2 = a(iL, this.f43203b.f() + ((int) temporalAccessor.k(aVar).d()));
        return iA >= iA2 ? (iA - iA2) + 1 : iA;
    }

    private int l(int i2, int i3) {
        int iFloorMod = Math.floorMod(i2 - i3, 7);
        return iFloorMod + 1 > this.f43203b.f() ? 7 - iFloorMod : -iFloorMod;
    }

    private static int a(int i2, int i3) {
        return ((i3 - 1) + (i2 + 7)) / 7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [j$.time.temporal.u, java.lang.Enum] */
    @Override // j$.time.temporal.r
    public final m p(m mVar, long j) {
        int iA = this.f43205e.a(j, this);
        int iG = mVar.g(this);
        if (iA == iG) {
            return mVar;
        }
        if (this.d == b.FOREVER) {
            y yVar = this.f43203b;
            return f(j$.time.chrono.m.F(mVar), (int) j, mVar.g(yVar.f43210e), mVar.g(yVar.f43209c));
        }
        return mVar.l(iA - iG, this.f43204c);
    }

    @Override // j$.time.temporal.r
    public final TemporalAccessor U(HashMap map, TemporalAccessor temporalAccessor, F f2) {
        InterfaceC3540b interfaceC3540bL;
        InterfaceC3540b interfaceC3540bL2;
        InterfaceC3540b interfaceC3540bL3;
        long jLongValue = ((Long) map.get(this)).longValue();
        int intExact = Math.toIntExact(jLongValue);
        b bVar = b.WEEKS;
        Enum r7 = this.d;
        w wVar = this.f43205e;
        y yVar = this.f43203b;
        if (r7 == bVar) {
            long jFloorMod = Math.floorMod((wVar.a(jLongValue, this) - 1) + (yVar.e().p() - 1), 7) + 1;
            map.remove(this);
            map.put(a.DAY_OF_WEEK, Long.valueOf(jFloorMod));
            return null;
        }
        a aVar = a.DAY_OF_WEEK;
        if (!map.containsKey(aVar)) {
            return null;
        }
        int iFloorMod = Math.floorMod(aVar.b0(((Long) map.get(aVar)).longValue()) - yVar.e().p(), 7) + 1;
        j$.time.chrono.m mVarF = j$.time.chrono.m.F(temporalAccessor);
        a aVar2 = a.YEAR;
        if (!map.containsKey(aVar2)) {
            if ((r7 != y.f43206h && r7 != b.FOREVER) || !map.containsKey(yVar.f) || !map.containsKey(yVar.f43210e)) {
                return null;
            }
            int iA = ((x) yVar.f).f43205e.a(((Long) map.get(yVar.f)).longValue(), yVar.f);
            if (f2 == F.LENIENT) {
                interfaceC3540bL = f(mVarF, iA, 1, iFloorMod).l(Math.subtractExact(((Long) map.get(yVar.f43210e)).longValue(), 1L), (u) bVar);
            } else {
                InterfaceC3540b interfaceC3540bF = f(mVarF, iA, ((x) yVar.f43210e).f43205e.a(((Long) map.get(yVar.f43210e)).longValue(), yVar.f43210e), iFloorMod);
                if (f2 == F.STRICT && c(interfaceC3540bF) != iA) {
                    throw new j$.time.c("Strict mode rejected resolved date as it is in a different week-based-year");
                }
                interfaceC3540bL = interfaceC3540bF;
            }
            map.remove(this);
            map.remove(yVar.f);
            map.remove(yVar.f43210e);
            map.remove(aVar);
            return interfaceC3540bL;
        }
        int iB0 = aVar2.b0(((Long) map.get(aVar2)).longValue());
        b bVar2 = b.MONTHS;
        if (r7 == bVar2) {
            a aVar3 = a.MONTH_OF_YEAR;
            if (map.containsKey(aVar3)) {
                long jLongValue2 = ((Long) map.get(aVar3)).longValue();
                long j = intExact;
                if (f2 == F.LENIENT) {
                    InterfaceC3540b interfaceC3540bL4 = mVarF.G(iB0, 1, 1).l(Math.subtractExact(jLongValue2, 1L), (u) bVar2);
                    int iB = b(interfaceC3540bL4);
                    int iG = interfaceC3540bL4.g(a.DAY_OF_MONTH);
                    interfaceC3540bL3 = interfaceC3540bL4.l(Math.addExact(Math.multiplyExact(Math.subtractExact(j, a(l(iG, iB), iG)), 7), iFloorMod - b(interfaceC3540bL4)), (u) b.DAYS);
                } else {
                    InterfaceC3540b interfaceC3540bG = mVarF.G(iB0, aVar3.b0(jLongValue2), 1);
                    long jA = wVar.a(j, this);
                    int iB2 = b(interfaceC3540bG);
                    int iG2 = interfaceC3540bG.g(a.DAY_OF_MONTH);
                    InterfaceC3540b interfaceC3540bL5 = interfaceC3540bG.l((((int) (jA - ((long) a(l(iG2, iB2), iG2)))) * 7) + (iFloorMod - b(interfaceC3540bG)), (u) b.DAYS);
                    if (f2 == F.STRICT && interfaceC3540bL5.e(aVar3) != jLongValue2) {
                        throw new j$.time.c("Strict mode rejected resolved date as it is in a different month");
                    }
                    interfaceC3540bL3 = interfaceC3540bL5;
                }
                map.remove(this);
                map.remove(aVar2);
                map.remove(aVar3);
                map.remove(aVar);
                return interfaceC3540bL3;
            }
        }
        if (r7 != b.YEARS) {
            return null;
        }
        long j2 = intExact;
        InterfaceC3540b interfaceC3540bG2 = mVarF.G(iB0, 1, 1);
        if (f2 == F.LENIENT) {
            int iB3 = b(interfaceC3540bG2);
            int iG3 = interfaceC3540bG2.g(a.DAY_OF_YEAR);
            interfaceC3540bL2 = interfaceC3540bG2.l(Math.addExact(Math.multiplyExact(Math.subtractExact(j2, a(l(iG3, iB3), iG3)), 7), iFloorMod - b(interfaceC3540bG2)), (u) b.DAYS);
        } else {
            long jA2 = wVar.a(j2, this);
            int iB4 = b(interfaceC3540bG2);
            int iG4 = interfaceC3540bG2.g(a.DAY_OF_YEAR);
            InterfaceC3540b interfaceC3540bL6 = interfaceC3540bG2.l((((int) (jA2 - ((long) a(l(iG4, iB4), iG4)))) * 7) + (iFloorMod - b(interfaceC3540bG2)), (u) b.DAYS);
            if (f2 == F.STRICT && interfaceC3540bL6.e(aVar2) != iB0) {
                throw new j$.time.c("Strict mode rejected resolved date as it is in a different year");
            }
            interfaceC3540bL2 = interfaceC3540bL6;
        }
        map.remove(this);
        map.remove(aVar2);
        map.remove(aVar);
        return interfaceC3540bL2;
    }

    @Override // j$.time.temporal.r
    public final w C() {
        return this.f43205e;
    }

    @Override // j$.time.temporal.r
    public final boolean Y(TemporalAccessor temporalAccessor) {
        if (!temporalAccessor.d(a.DAY_OF_WEEK)) {
            return false;
        }
        b bVar = b.WEEKS;
        Enum r1 = this.d;
        if (r1 == bVar) {
            return true;
        }
        if (r1 == b.MONTHS) {
            return temporalAccessor.d(a.DAY_OF_MONTH);
        }
        if (r1 == b.YEARS) {
            return temporalAccessor.d(a.DAY_OF_YEAR);
        }
        if (r1 == y.f43206h) {
            return temporalAccessor.d(a.DAY_OF_YEAR);
        }
        if (r1 == b.FOREVER) {
            return temporalAccessor.d(a.YEAR);
        }
        return false;
    }

    @Override // j$.time.temporal.r
    public final w J(TemporalAccessor temporalAccessor) {
        b bVar = b.WEEKS;
        Enum r1 = this.d;
        if (r1 == bVar) {
            return this.f43205e;
        }
        if (r1 == b.MONTHS) {
            return j(temporalAccessor, a.DAY_OF_MONTH);
        }
        if (r1 == b.YEARS) {
            return j(temporalAccessor, a.DAY_OF_YEAR);
        }
        if (r1 == y.f43206h) {
            return k(temporalAccessor);
        }
        if (r1 == b.FOREVER) {
            return a.YEAR.C();
        }
        throw new IllegalStateException("unreachable, rangeUnit: " + r1 + ", this: " + this);
    }

    private w j(TemporalAccessor temporalAccessor, a aVar) {
        int iL = l(temporalAccessor.g(aVar), b(temporalAccessor));
        w wVarK = temporalAccessor.k(aVar);
        return w.j(a(iL, (int) wVarK.e()), a(iL, (int) wVarK.d()));
    }

    private w k(TemporalAccessor temporalAccessor) {
        a aVar = a.DAY_OF_YEAR;
        if (!temporalAccessor.d(aVar)) {
            return f43200h;
        }
        int iB = b(temporalAccessor);
        int iG = temporalAccessor.g(aVar);
        int iL = l(iG, iB);
        int iA = a(iL, iG);
        if (iA == 0) {
            return k(j$.time.chrono.m.F(temporalAccessor).t(temporalAccessor).c(iG + 7, (u) b.DAYS));
        }
        int iD = (int) temporalAccessor.k(aVar).d();
        int iA2 = a(iL, this.f43203b.f() + iD);
        if (iA >= iA2) {
            return k(j$.time.chrono.m.F(temporalAccessor).t(temporalAccessor).l((iD - iG) + 8, (u) b.DAYS));
        }
        return w.j(1L, iA2 - 1);
    }

    public final String toString() {
        return this.f43202a + d9.i.d + this.f43203b.toString() + d9.i.f24752e;
    }
}
