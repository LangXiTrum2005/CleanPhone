package j$.time;

import j$.time.format.G;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class t implements j$.time.temporal.m, j$.time.temporal.n, Comparable, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f43171b = 0;
    private static final long serialVersionUID = -23038383694477807L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f43172a;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f43172a - ((t) obj).f43172a;
    }

    static {
        j$.time.format.v vVar = new j$.time.format.v();
        vVar.p(j$.time.temporal.a.YEAR, 4, 10, G.EXCEEDS_PAD);
        vVar.x();
    }

    public static t r(int i2) {
        j$.time.temporal.a.YEAR.c0(i2);
        return new t(i2);
    }

    private t(int i2) {
        this.f43172a = i2;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean d(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            return rVar == j$.time.temporal.a.YEAR || rVar == j$.time.temporal.a.YEAR_OF_ERA || rVar == j$.time.temporal.a.ERA;
        }
        return rVar != null && rVar.Y(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.w k(j$.time.temporal.r rVar) {
        if (rVar == j$.time.temporal.a.YEAR_OF_ERA) {
            return j$.time.temporal.w.j(1L, this.f43172a <= 0 ? 1000000000L : 999999999L);
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
        int i2 = s.f43169a[((j$.time.temporal.a) rVar).ordinal()];
        int i3 = this.f43172a;
        if (i2 == 1) {
            if (i3 < 1) {
                i3 = 1 - i3;
            }
            return i3;
        }
        if (i2 == 2) {
            return i3;
        }
        if (i2 == 3) {
            return i3 < 1 ? 0 : 1;
        }
        throw new j$.time.temporal.v(d.a("Unsupported field: ", rVar));
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: i */
    public final j$.time.temporal.m m(h hVar) {
        return (t) hVar.b(this);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public final t h(long j, j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return (t) rVar.p(this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) rVar;
        aVar.c0(j);
        int i2 = s.f43169a[aVar.ordinal()];
        int i3 = this.f43172a;
        if (i2 == 1) {
            if (i3 < 1) {
                j = 1 - j;
            }
            return r((int) j);
        }
        if (i2 == 2) {
            return r((int) j);
        }
        if (i2 == 3) {
            return e(j$.time.temporal.a.ERA) == j ? this : r(1 - i3);
        }
        throw new j$.time.temporal.v(d.a("Unsupported field: ", rVar));
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public final t l(long j, j$.time.temporal.u uVar) {
        if (!(uVar instanceof j$.time.temporal.b)) {
            return (t) uVar.p(this, j);
        }
        int i2 = s.f43170b[((j$.time.temporal.b) uVar).ordinal()];
        if (i2 == 1) {
            return J(j);
        }
        if (i2 == 2) {
            return J(Math.multiplyExact(j, 10));
        }
        if (i2 == 3) {
            return J(Math.multiplyExact(j, 100));
        }
        if (i2 == 4) {
            return J(Math.multiplyExact(j, 1000));
        }
        if (i2 == 5) {
            j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
            return h(Math.addExact(e(aVar), j), aVar);
        }
        throw new j$.time.temporal.v("Unsupported unit: " + uVar);
    }

    public final t J(long j) {
        return j == 0 ? this : r(j$.time.temporal.a.YEAR.b0(((long) this.f43172a) + j));
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
            return j$.time.temporal.b.YEARS;
        }
        return super.a(tVar);
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.m b(j$.time.temporal.m mVar) {
        if (!j$.time.chrono.m.F(mVar).equals(j$.time.chrono.t.d)) {
            throw new c("Adjustment only supported on ISO date-time");
        }
        return mVar.h(this.f43172a, j$.time.temporal.a.YEAR);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof t) {
            if (this.f43172a == ((t) obj).f43172a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f43172a;
    }

    public final String toString() {
        return Integer.toString(this.f43172a);
    }

    private Object writeReplace() {
        return new r((byte) 11, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    final void V(DataOutput dataOutput) {
        dataOutput.writeInt(this.f43172a);
    }
}
