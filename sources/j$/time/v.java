package j$.time;

import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import j$.time.format.G;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class v implements j$.time.temporal.m, j$.time.temporal.n, Comparable, Serializable {
    private static final long serialVersionUID = 4183400860270640070L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f43213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f43214b;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        v vVar = (v) obj;
        int i2 = this.f43213a - vVar.f43213a;
        return i2 == 0 ? this.f43214b - vVar.f43214b : i2;
    }

    static {
        j$.time.format.v vVar = new j$.time.format.v();
        vVar.p(j$.time.temporal.a.YEAR, 4, 10, G.EXCEEDS_PAD);
        vVar.e('-');
        vVar.o(j$.time.temporal.a.MONTH_OF_YEAR, 2);
        vVar.x();
    }

    private v(int i2, int i3) {
        this.f43213a = i2;
        this.f43214b = i3;
    }

    private v Y(int i2, int i3) {
        return (this.f43213a == i2 && this.f43214b == i3) ? this : new v(i2, i3);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean d(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            return rVar == j$.time.temporal.a.YEAR || rVar == j$.time.temporal.a.MONTH_OF_YEAR || rVar == j$.time.temporal.a.PROLEPTIC_MONTH || rVar == j$.time.temporal.a.YEAR_OF_ERA || rVar == j$.time.temporal.a.ERA;
        }
        return rVar != null && rVar.Y(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.w k(j$.time.temporal.r rVar) {
        if (rVar == j$.time.temporal.a.YEAR_OF_ERA) {
            return j$.time.temporal.w.j(1L, this.f43213a <= 0 ? 1000000000L : 999999999L);
        }
        return super.k(rVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int g(j$.time.temporal.r rVar) {
        return k(rVar).a(e(rVar), rVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long e(j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return rVar.r(this);
        }
        int i2 = u.f43211a[((j$.time.temporal.a) rVar).ordinal()];
        if (i2 == 1) {
            return this.f43214b;
        }
        if (i2 == 2) {
            return r();
        }
        int i3 = this.f43213a;
        if (i2 == 3) {
            if (i3 < 1) {
                i3 = 1 - i3;
            }
            return i3;
        }
        if (i2 == 4) {
            return i3;
        }
        if (i2 == 5) {
            return i3 < 1 ? 0 : 1;
        }
        throw new j$.time.temporal.v(d.a("Unsupported field: ", rVar));
    }

    private long r() {
        return ((((long) this.f43213a) * 12) + ((long) this.f43214b)) - 1;
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: i */
    public final j$.time.temporal.m m(h hVar) {
        return (v) hVar.b(this);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: b0, reason: merged with bridge method [inline-methods] */
    public final v h(long j, j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return (v) rVar.p(this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) rVar;
        aVar.c0(j);
        int i2 = u.f43211a[aVar.ordinal()];
        int i3 = this.f43213a;
        if (i2 == 1) {
            int i4 = (int) j;
            j$.time.temporal.a.MONTH_OF_YEAR.c0(i4);
            return Y(i3, i4);
        }
        if (i2 == 2) {
            return J(j - r());
        }
        int i5 = this.f43214b;
        if (i2 == 3) {
            if (i3 < 1) {
                j = 1 - j;
            }
            int i6 = (int) j;
            j$.time.temporal.a.YEAR.c0(i6);
            return Y(i6, i5);
        }
        if (i2 == 4) {
            int i7 = (int) j;
            j$.time.temporal.a.YEAR.c0(i7);
            return Y(i7, i5);
        }
        if (i2 != 5) {
            throw new j$.time.temporal.v(d.a("Unsupported field: ", rVar));
        }
        if (e(j$.time.temporal.a.ERA) == j) {
            return this;
        }
        int i8 = 1 - i3;
        j$.time.temporal.a.YEAR.c0(i8);
        return Y(i8, i5);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public final v l(long j, j$.time.temporal.u uVar) {
        if (!(uVar instanceof j$.time.temporal.b)) {
            return (v) uVar.p(this, j);
        }
        switch (u.f43212b[((j$.time.temporal.b) uVar).ordinal()]) {
            case 1:
                return J(j);
            case 2:
                return U(j);
            case 3:
                return U(Math.multiplyExact(j, 10));
            case 4:
                return U(Math.multiplyExact(j, 100));
            case 5:
                return U(Math.multiplyExact(j, 1000));
            case 6:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return h(Math.addExact(e(aVar), j), aVar);
            default:
                throw new j$.time.temporal.v("Unsupported unit: " + uVar);
        }
    }

    public final v U(long j) {
        return j == 0 ? this : Y(j$.time.temporal.a.YEAR.b0(((long) this.f43213a) + j), this.f43214b);
    }

    public final v J(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = (((long) this.f43213a) * 12) + ((long) (this.f43214b - 1)) + j;
        long j3 = 12;
        return Y(j$.time.temporal.a.YEAR.b0(Math.floorDiv(j2, j3)), ((int) Math.floorMod(j2, j3)) + 1);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m c(long j, j$.time.temporal.u uVar) {
        return j == Long.MIN_VALUE ? l(Long.MAX_VALUE, uVar).l(1L, uVar) : l(-j, uVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object a(j$.time.temporal.t tVar) {
        if (tVar == j$.time.temporal.s.a()) {
            return j$.time.chrono.t.d;
        }
        if (tVar == j$.time.temporal.s.e()) {
            return j$.time.temporal.b.MONTHS;
        }
        return super.a(tVar);
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.m b(j$.time.temporal.m mVar) {
        if (!j$.time.chrono.m.F(mVar).equals(j$.time.chrono.t.d)) {
            throw new c("Adjustment only supported on ISO date-time");
        }
        return mVar.h(r(), j$.time.temporal.a.PROLEPTIC_MONTH);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof v) {
            v vVar = (v) obj;
            if (this.f43213a == vVar.f43213a && this.f43214b == vVar.f43214b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f43214b << 27) ^ this.f43213a;
    }

    public final String toString() {
        int i2 = this.f43213a;
        int iAbs = Math.abs(i2);
        StringBuilder sb = new StringBuilder(9);
        if (iAbs >= 1000) {
            sb.append(i2);
        } else if (i2 < 0) {
            sb.append(i2 - 10000);
            sb.deleteCharAt(1);
        } else {
            sb.append(i2 + 10000);
            sb.deleteCharAt(0);
        }
        int i3 = this.f43214b;
        sb.append(i3 < 10 ? "-0" : TokenBuilder.TOKEN_DELIMITER);
        sb.append(i3);
        return sb.toString();
    }

    private Object writeReplace() {
        return new r((byte) 12, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    final void c0(DataOutput dataOutput) {
        dataOutput.writeInt(this.f43213a);
        dataOutput.writeByte(this.f43214b);
    }

    static v V(ObjectInput objectInput) throws IOException {
        int i2 = objectInput.readInt();
        byte b2 = objectInput.readByte();
        j$.time.temporal.a.YEAR.c0(i2);
        j$.time.temporal.a.MONTH_OF_YEAR.c0(b2);
        return new v(i2, b2);
    }
}
