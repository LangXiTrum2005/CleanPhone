package j$.time;

import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import j$.time.chrono.InterfaceC3540b;
import j$.time.chrono.InterfaceC3543e;
import j$.time.temporal.TemporalAccessor;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class h implements j$.time.temporal.m, j$.time.temporal.n, InterfaceC3540b, Serializable {
    public static final h d = h0(-999999999, 1, 1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final h f43145e = h0(999999999, 12, 31);
    private static final long serialVersionUID = 2942565459149668126L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f43146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final short f43147b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final short f43148c;

    static {
        h0(1970, 1, 1);
    }

    public static h i0(int i2, m mVar, int i3) {
        j$.time.temporal.a.YEAR.c0(i2);
        j$.time.temporal.a.DAY_OF_MONTH.c0(i3);
        return C(i2, mVar.p(), i3);
    }

    public static h h0(int i2, int i3, int i4) {
        j$.time.temporal.a.YEAR.c0(i2);
        j$.time.temporal.a.MONTH_OF_YEAR.c0(i3);
        j$.time.temporal.a.DAY_OF_MONTH.c0(i4);
        return C(i2, i3, i4);
    }

    public static h k0(int i2, int i3) {
        long j = i2;
        j$.time.temporal.a.YEAR.c0(j);
        j$.time.temporal.a.DAY_OF_YEAR.c0(i3);
        boolean zE = j$.time.chrono.t.d.E(j);
        if (i3 == 366 && !zE) {
            throw new c("Invalid date 'DayOfYear 366' as '" + i2 + "' is not a leap year");
        }
        m mVarU = m.U(((i3 - 1) / 31) + 1);
        if (i3 > (mVarU.C(zE) + mVarU.r(zE)) - 1) {
            mVarU = mVarU.V();
        }
        return new h(i2, mVarU.p(), (i3 - mVarU.r(zE)) + 1);
    }

    public static h j0(long j) {
        long j2;
        j$.time.temporal.a.EPOCH_DAY.c0(j);
        long j3 = 719468 + j;
        if (j3 < 0) {
            long j4 = ((j + 719469) / 146097) - 1;
            j2 = j4 * 400;
            j3 += (-j4) * 146097;
        } else {
            j2 = 0;
        }
        long j5 = ((j3 * 400) + 591) / 146097;
        long j6 = j3 - ((j5 / 400) + (((j5 / 4) + (j5 * 365)) - (j5 / 100)));
        if (j6 < 0) {
            j5--;
            j6 = j3 - ((j5 / 400) + (((j5 / 4) + (365 * j5)) - (j5 / 100)));
        }
        int i2 = (int) j6;
        int i3 = ((i2 * 5) + 2) / 153;
        return new h(j$.time.temporal.a.YEAR.b0(j5 + j2 + ((long) (i3 / 10))), ((i3 + 2) % 12) + 1, (i2 - (((i3 * 306) + 5) / 10)) + 1);
    }

    public static h J(TemporalAccessor temporalAccessor) {
        Objects.requireNonNull(temporalAccessor, "temporal");
        h hVar = (h) temporalAccessor.a(j$.time.temporal.s.b());
        if (hVar != null) {
            return hVar;
        }
        throw new c("Unable to obtain LocalDate from TemporalAccessor: " + temporalAccessor + " of type " + temporalAccessor.getClass().getName());
    }

    private static h C(int i2, int i3, int i4) {
        int i5 = 28;
        if (i4 > 28) {
            if (i3 != 2) {
                i5 = (i3 == 4 || i3 == 6 || i3 == 9 || i3 == 11) ? 30 : 31;
            } else if (j$.time.chrono.t.d.E(i2)) {
                i5 = 29;
            }
            if (i4 > i5) {
                if (i4 == 29) {
                    throw new c("Invalid date 'February 29' as '" + i2 + "' is not a leap year");
                }
                throw new c("Invalid date '" + m.U(i3).name() + " " + i4 + "'");
            }
        }
        return new h(i2, i3, i4);
    }

    private static h q0(int i2, int i3, int i4) {
        if (i3 == 2) {
            i4 = Math.min(i4, j$.time.chrono.t.d.E((long) i2) ? 29 : 28);
        } else if (i3 == 4 || i3 == 6 || i3 == 9 || i3 == 11) {
            i4 = Math.min(i4, 30);
        }
        return new h(i2, i3, i4);
    }

    private h(int i2, int i3, int i4) {
        this.f43146a = i2;
        this.f43147b = (short) i3;
        this.f43148c = (short) i4;
    }

    public static h g0(b bVar) {
        Instant instantOfEpochMilli = Instant.ofEpochMilli(System.currentTimeMillis());
        ZoneId zoneIdA = bVar.a();
        Objects.requireNonNull(instantOfEpochMilli, "instant");
        Objects.requireNonNull(zoneIdA, "zone");
        return j0(Math.floorDiv(instantOfEpochMilli.C() + ((long) zoneIdA.C().d(instantOfEpochMilli).getTotalSeconds()), 86400));
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.w k(j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return rVar.J(this);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) rVar;
        if (!aVar.V()) {
            throw new j$.time.temporal.v(d.a("Unsupported field: ", rVar));
        }
        int i2 = g.f43143a[aVar.ordinal()];
        if (i2 == 1) {
            return j$.time.temporal.w.j(1L, e0());
        }
        if (i2 == 2) {
            return j$.time.temporal.w.j(1L, K());
        }
        if (i2 == 3) {
            return j$.time.temporal.w.j(1L, (m.U(this.f43147b) != m.FEBRUARY || O()) ? 5L : 4L);
        }
        if (i2 != 4) {
            return ((j$.time.temporal.a) rVar).C();
        }
        return this.f43146a <= 0 ? j$.time.temporal.w.j(1L, 1000000000L) : j$.time.temporal.w.j(1L, 999999999L);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int g(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            return U(rVar);
        }
        return super.g(rVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long e(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            if (rVar == j$.time.temporal.a.EPOCH_DAY) {
                return v();
            }
            if (rVar != j$.time.temporal.a.PROLEPTIC_MONTH) {
                return U(rVar);
            }
            return ((((long) this.f43146a) * 12) + ((long) this.f43147b)) - 1;
        }
        return rVar.r(this);
    }

    private int U(j$.time.temporal.r rVar) {
        int i2;
        int i3 = g.f43143a[((j$.time.temporal.a) rVar).ordinal()];
        short s = this.f43148c;
        int i4 = this.f43146a;
        switch (i3) {
            case 1:
                return s;
            case 2:
                return Y();
            case 3:
                i2 = (s - 1) / 7;
                break;
            case 4:
                return i4 >= 1 ? i4 : 1 - i4;
            case 5:
                return V().p();
            case 6:
                i2 = (s - 1) % 7;
                break;
            case 7:
                return ((Y() - 1) % 7) + 1;
            case 8:
                throw new j$.time.temporal.v("Invalid field 'EpochDay' for get() method, use getLong() instead");
            case 9:
                return ((Y() - 1) / 7) + 1;
            case 10:
                return this.f43147b;
            case 11:
                throw new j$.time.temporal.v("Invalid field 'ProlepticMonth' for get() method, use getLong() instead");
            case 12:
                return i4;
            case 13:
                return i4 >= 1 ? 1 : 0;
            default:
                throw new j$.time.temporal.v(d.a("Unsupported field: ", rVar));
        }
        return i2 + 1;
    }

    @Override // j$.time.chrono.InterfaceC3540b
    public final j$.time.chrono.m f() {
        return j$.time.chrono.t.d;
    }

    @Override // j$.time.chrono.InterfaceC3540b
    public final j$.time.chrono.n u() {
        return this.f43146a >= 1 ? j$.time.chrono.u.CE : j$.time.chrono.u.BCE;
    }

    public final int c0() {
        return this.f43146a;
    }

    public final int b0() {
        return this.f43147b;
    }

    public final int Y() {
        return (m.U(this.f43147b).r(O()) + this.f43148c) - 1;
    }

    public final e V() {
        return e.r(((int) Math.floorMod(v() + 3, 7)) + 1);
    }

    @Override // j$.time.chrono.InterfaceC3540b
    public final boolean O() {
        return j$.time.chrono.t.d.E(this.f43146a);
    }

    public final int e0() {
        short s = this.f43147b;
        if (s != 2) {
            return (s == 4 || s == 6 || s == 9 || s == 11) ? 30 : 31;
        }
        return O() ? 29 : 28;
    }

    @Override // j$.time.chrono.InterfaceC3540b
    public final int K() {
        return O() ? 366 : 365;
    }

    @Override // j$.time.chrono.InterfaceC3540b
    /* JADX INFO: renamed from: s0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final h m(j$.time.temporal.n nVar) {
        if (nVar instanceof h) {
            return (h) nVar;
        }
        return (h) nVar.b(this);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: r0, reason: merged with bridge method [inline-methods] */
    public final h h(long j, j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return (h) rVar.p(this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) rVar;
        aVar.c0(j);
        int i2 = g.f43143a[aVar.ordinal()];
        short s = this.f43148c;
        short s2 = this.f43147b;
        int i3 = this.f43146a;
        switch (i2) {
            case 1:
                int i4 = (int) j;
                if (s != i4) {
                    return h0(i3, s2, i4);
                }
                return this;
            case 2:
                return t0((int) j);
            case 3:
                return o0(j - e(j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH));
            case 4:
                if (i3 < 1) {
                    j = 1 - j;
                }
                return u0((int) j);
            case 5:
                return m0(j - ((long) V().p()));
            case 6:
                return m0(j - e(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case 7:
                return m0(j - e(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 8:
                return j0(j);
            case 9:
                return o0(j - e(j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR));
            case 10:
                int i5 = (int) j;
                if (s2 != i5) {
                    j$.time.temporal.a.MONTH_OF_YEAR.c0(i5);
                    return q0(i3, i5, s);
                }
                return this;
            case 11:
                return n0(j - (((((long) i3) * 12) + ((long) s2)) - 1));
            case 12:
                return u0((int) j);
            case 13:
                if (e(j$.time.temporal.a.ERA) != j) {
                    return u0(1 - i3);
                }
                return this;
            default:
                throw new j$.time.temporal.v(d.a("Unsupported field: ", rVar));
        }
    }

    public final h u0(int i2) {
        if (this.f43146a == i2) {
            return this;
        }
        j$.time.temporal.a.YEAR.c0(i2);
        return q0(i2, this.f43147b, this.f43148c);
    }

    public final h t0(int i2) {
        return Y() == i2 ? this : k0(this.f43146a, i2);
    }

    @Override // j$.time.chrono.InterfaceC3540b
    public final InterfaceC3540b N(j$.time.temporal.q qVar) {
        if (qVar instanceof q) {
            q qVar2 = (q) qVar;
            return n0(qVar2.d()).m0(qVar2.a());
        }
        Objects.requireNonNull(qVar, "amountToAdd");
        return (h) qVar.p(this);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: l0, reason: merged with bridge method [inline-methods] */
    public final h l(long j, j$.time.temporal.u uVar) {
        if (!(uVar instanceof j$.time.temporal.b)) {
            return (h) uVar.p(this, j);
        }
        switch (g.f43144b[((j$.time.temporal.b) uVar).ordinal()]) {
            case 1:
                return m0(j);
            case 2:
                return o0(j);
            case 3:
                return n0(j);
            case 4:
                return p0(j);
            case 5:
                return p0(Math.multiplyExact(j, 10));
            case 6:
                return p0(Math.multiplyExact(j, 100));
            case 7:
                return p0(Math.multiplyExact(j, 1000));
            case 8:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return h(Math.addExact(e(aVar), j), aVar);
            default:
                throw new j$.time.temporal.v("Unsupported unit: " + uVar);
        }
    }

    public final h p0(long j) {
        return j == 0 ? this : q0(j$.time.temporal.a.YEAR.b0(((long) this.f43146a) + j), this.f43147b, this.f43148c);
    }

    public final h n0(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = (((long) this.f43146a) * 12) + ((long) (this.f43147b - 1)) + j;
        long j3 = 12;
        return q0(j$.time.temporal.a.YEAR.b0(Math.floorDiv(j2, j3)), ((int) Math.floorMod(j2, j3)) + 1, this.f43148c);
    }

    public final h o0(long j) {
        return m0(Math.multiplyExact(j, 7));
    }

    public final h m0(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = ((long) this.f43148c) + j;
        if (j2 > 0) {
            short s = this.f43147b;
            int i2 = this.f43146a;
            if (j2 <= 28) {
                return new h(i2, s, (int) j2);
            }
            if (j2 <= 59) {
                long jE0 = e0();
                if (j2 <= jE0) {
                    return new h(i2, s, (int) j2);
                }
                if (s < 12) {
                    return new h(i2, s + 1, (int) (j2 - jE0));
                }
                int i3 = i2 + 1;
                j$.time.temporal.a.YEAR.c0(i3);
                return new h(i3, 1, (int) (j2 - jE0));
            }
        }
        return j0(Math.addExact(v(), j));
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: f0, reason: merged with bridge method [inline-methods] */
    public final h c(long j, j$.time.temporal.b bVar) {
        return j == Long.MIN_VALUE ? l(Long.MAX_VALUE, bVar).l(1L, bVar) : l(-j, bVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object a(j$.time.temporal.t tVar) {
        return tVar == j$.time.temporal.s.b() ? this : super.a(tVar);
    }

    @Override // j$.time.chrono.InterfaceC3540b
    public final InterfaceC3543e L(k kVar) {
        return LocalDateTime.e0(this, kVar);
    }

    @Override // j$.time.chrono.InterfaceC3540b
    public final long v() {
        long j;
        long j2 = this.f43146a;
        long j3 = this.f43147b;
        long j4 = 365 * j2;
        if (j2 >= 0) {
            j = ((j2 + 399) / 400) + (((3 + j2) / 4) - ((99 + j2) / 100)) + j4;
        } else {
            j = j4 - ((j2 / (-400)) + ((j2 / (-4)) - (j2 / (-100))));
        }
        long j5 = (((367 * j3) - 362) / 12) + j + ((long) (this.f43148c - 1));
        if (j3 > 2) {
            j5 = !O() ? j5 - 2 : j5 - 1;
        }
        return j5 - 719528;
    }

    @Override // j$.time.chrono.InterfaceC3540b, java.lang.Comparable
    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
    public final int compareTo(InterfaceC3540b interfaceC3540b) {
        if (interfaceC3540b instanceof h) {
            return r((h) interfaceC3540b);
        }
        return super.compareTo(interfaceC3540b);
    }

    final int r(h hVar) {
        int i2 = this.f43146a - hVar.f43146a;
        if (i2 != 0) {
            return i2;
        }
        int i3 = this.f43147b - hVar.f43147b;
        return i3 == 0 ? this.f43148c - hVar.f43148c : i3;
    }

    public final boolean d0(h hVar) {
        if (hVar != null) {
            return r(hVar) < 0;
        }
        return v() < hVar.v();
    }

    @Override // j$.time.chrono.InterfaceC3540b
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && r((h) obj) == 0;
    }

    @Override // j$.time.chrono.InterfaceC3540b
    public final int hashCode() {
        int i2 = this.f43146a;
        return (((i2 << 11) + (this.f43147b << 6)) + this.f43148c) ^ (i2 & (-2048));
    }

    @Override // j$.time.chrono.InterfaceC3540b
    public final String toString() {
        int i2 = this.f43146a;
        int iAbs = Math.abs(i2);
        StringBuilder sb = new StringBuilder(10);
        if (iAbs >= 1000) {
            if (i2 > 9999) {
                sb.append('+');
            }
            sb.append(i2);
        } else if (i2 < 0) {
            sb.append(i2 - 10000);
            sb.deleteCharAt(1);
        } else {
            sb.append(i2 + 10000);
            sb.deleteCharAt(0);
        }
        String str = TokenBuilder.TOKEN_DELIMITER;
        short s = this.f43147b;
        sb.append(s < 10 ? "-0" : TokenBuilder.TOKEN_DELIMITER);
        sb.append((int) s);
        short s2 = this.f43148c;
        if (s2 < 10) {
            str = "-0";
        }
        sb.append(str);
        sb.append((int) s2);
        return sb.toString();
    }

    private Object writeReplace() {
        return new r((byte) 3, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    final void v0(DataOutput dataOutput) throws IOException {
        dataOutput.writeInt(this.f43146a);
        dataOutput.writeByte(this.f43147b);
        dataOutput.writeByte(this.f43148c);
    }
}
