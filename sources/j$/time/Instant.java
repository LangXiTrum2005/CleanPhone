package j$.time;

import j$.time.format.DateTimeFormatter;
import j$.time.temporal.TemporalAccessor;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class Instant implements j$.time.temporal.m, j$.time.temporal.n, Comparable<Instant>, Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Instant f42997c = new Instant(0, 0);
    private static final long serialVersionUID = -665713676816604388L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f42998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f42999b;

    @Override // java.lang.Comparable
    public final int compareTo(Instant instant) {
        Instant instant2 = instant;
        int iCompare = Long.compare(this.f42998a, instant2.f42998a);
        return iCompare != 0 ? iCompare : this.f42999b - instant2.f42999b;
    }

    static {
        V(-31557014167219200L, 0L);
        V(31556889864403199L, 999999999L);
    }

    public static Instant U(long j) {
        return r(j, 0);
    }

    public static Instant V(long j, long j2) {
        return r(Math.addExact(j, Math.floorDiv(j2, 1000000000L)), (int) Math.floorMod(j2, 1000000000L));
    }

    public static Instant ofEpochMilli(long j) {
        long j2 = 1000;
        return r(Math.floorDiv(j, j2), ((int) Math.floorMod(j, j2)) * 1000000);
    }

    public static Instant from(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof Instant) {
            return (Instant) temporalAccessor;
        }
        Objects.requireNonNull(temporalAccessor, "temporal");
        try {
            return V(temporalAccessor.e(j$.time.temporal.a.INSTANT_SECONDS), temporalAccessor.g(j$.time.temporal.a.NANO_OF_SECOND));
        } catch (c e2) {
            throw new c("Unable to obtain Instant from TemporalAccessor: " + temporalAccessor + " of type " + temporalAccessor.getClass().getName(), e2);
        }
    }

    private static Instant r(long j, int i2) {
        if ((((long) i2) | j) == 0) {
            return f42997c;
        }
        if (j < -31557014167219200L || j > 31556889864403199L) {
            throw new c("Instant exceeds minimum or maximum instant");
        }
        return new Instant(j, i2);
    }

    private Instant(long j, int i2) {
        this.f42998a = j;
        this.f42999b = i2;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean d(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            return rVar == j$.time.temporal.a.INSTANT_SECONDS || rVar == j$.time.temporal.a.NANO_OF_SECOND || rVar == j$.time.temporal.a.MICRO_OF_SECOND || rVar == j$.time.temporal.a.MILLI_OF_SECOND;
        }
        return rVar != null && rVar.Y(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int g(j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return super.k(rVar).a(rVar.r(this), rVar);
        }
        int i2 = f.f43064a[((j$.time.temporal.a) rVar).ordinal()];
        int i3 = this.f42999b;
        if (i2 == 1) {
            return i3;
        }
        if (i2 == 2) {
            return i3 / 1000;
        }
        if (i2 == 3) {
            return i3 / 1000000;
        }
        if (i2 == 4) {
            j$.time.temporal.a.INSTANT_SECONDS.b0(this.f42998a);
        }
        throw new j$.time.temporal.v(d.a("Unsupported field: ", rVar));
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long e(j$.time.temporal.r rVar) {
        int i2;
        if (!(rVar instanceof j$.time.temporal.a)) {
            return rVar.r(this);
        }
        int i3 = f.f43064a[((j$.time.temporal.a) rVar).ordinal()];
        int i4 = this.f42999b;
        if (i3 == 1) {
            return i4;
        }
        if (i3 == 2) {
            i2 = i4 / 1000;
        } else {
            if (i3 != 3) {
                if (i3 == 4) {
                    return this.f42998a;
                }
                throw new j$.time.temporal.v(d.a("Unsupported field: ", rVar));
            }
            i2 = i4 / 1000000;
        }
        return i2;
    }

    public final long C() {
        return this.f42998a;
    }

    public final int J() {
        return this.f42999b;
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: i */
    public final j$.time.temporal.m m(h hVar) {
        return (Instant) hVar.b(this);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m h(long j, j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return (Instant) rVar.p(this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) rVar;
        aVar.c0(j);
        int i2 = f.f43064a[aVar.ordinal()];
        int i3 = this.f42999b;
        long j2 = this.f42998a;
        if (i2 != 1) {
            if (i2 == 2) {
                int i4 = ((int) j) * 1000;
                if (i4 != i3) {
                    return r(j2, i4);
                }
            } else if (i2 == 3) {
                int i5 = ((int) j) * 1000000;
                if (i5 != i3) {
                    return r(j2, i5);
                }
            } else {
                if (i2 != 4) {
                    throw new j$.time.temporal.v(d.a("Unsupported field: ", rVar));
                }
                if (j != j2) {
                    return r(j, i3);
                }
            }
        } else if (j != i3) {
            return r(j2, (int) j);
        }
        return this;
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: b0, reason: merged with bridge method [inline-methods] */
    public final Instant l(long j, j$.time.temporal.u uVar) {
        if (!(uVar instanceof j$.time.temporal.b)) {
            return (Instant) uVar.p(this, j);
        }
        switch (f.f43065b[((j$.time.temporal.b) uVar).ordinal()]) {
            case 1:
                return Y(0L, j);
            case 2:
                return Y(j / 1000000, (j % 1000000) * 1000);
            case 3:
                return Y(j / 1000, (j % 1000) * 1000000);
            case 4:
                return Y(j, 0L);
            case 5:
                return Y(Math.multiplyExact(j, 60), 0L);
            case 6:
                return Y(Math.multiplyExact(j, com.smartdigimkt.o1.b.l2), 0L);
            case 7:
                return Y(Math.multiplyExact(j, com.smartdigimkt.o1.b.K0), 0L);
            case 8:
                return Y(Math.multiplyExact(j, 86400), 0L);
            default:
                throw new j$.time.temporal.v("Unsupported unit: " + uVar);
        }
    }

    private Instant Y(long j, long j2) {
        if ((j | j2) == 0) {
            return this;
        }
        return V(Math.addExact(Math.addExact(this.f42998a, j), j2 / 1000000000), ((long) this.f42999b) + (j2 % 1000000000));
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m c(long j, j$.time.temporal.u uVar) {
        return j == Long.MIN_VALUE ? l(Long.MAX_VALUE, uVar).l(1L, uVar) : l(-j, uVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object a(j$.time.temporal.t tVar) {
        if (tVar == j$.time.temporal.s.e()) {
            return j$.time.temporal.b.NANOS;
        }
        if (tVar == j$.time.temporal.s.a() || tVar == j$.time.temporal.s.g() || tVar == j$.time.temporal.s.f() || tVar == j$.time.temporal.s.d() || tVar == j$.time.temporal.s.b() || tVar == j$.time.temporal.s.c()) {
            return null;
        }
        return tVar.i(this);
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.m b(j$.time.temporal.m mVar) {
        return mVar.h(this.f42998a, j$.time.temporal.a.INSTANT_SECONDS).h(this.f42999b, j$.time.temporal.a.NANO_OF_SECOND);
    }

    public OffsetDateTime atOffset(ZoneOffset zoneOffset) {
        return OffsetDateTime.C(this, zoneOffset);
    }

    public ZonedDateTime atZone(ZoneId zoneId) {
        return ZonedDateTime.J(this, zoneId);
    }

    public long toEpochMilli() {
        long j = this.f42998a;
        int i2 = this.f42999b;
        return (j >= 0 || i2 <= 0) ? Math.addExact(Math.multiplyExact(j, 1000), i2 / 1000000) : Math.addExact(Math.multiplyExact(j + 1, 1000), (i2 / 1000000) - 1000);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Instant) {
            Instant instant = (Instant) obj;
            if (this.f42998a == instant.f42998a && this.f42999b == instant.f42999b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f42998a;
        return (this.f42999b * 51) + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return DateTimeFormatter.f.a(this);
    }

    private Object writeReplace() {
        return new r((byte) 2, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    final void c0(DataOutput dataOutput) throws IOException {
        dataOutput.writeLong(this.f42998a);
        dataOutput.writeInt(this.f42999b);
    }
}
