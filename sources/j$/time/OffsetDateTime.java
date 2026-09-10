package j$.time;

import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class OffsetDateTime implements j$.time.temporal.m, j$.time.temporal.n, Comparable<OffsetDateTime>, Serializable {
    private static final long serialVersionUID = 2287754244819255394L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LocalDateTime f43003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ZoneOffset f43004b;

    @Override // java.lang.Comparable
    public final int compareTo(OffsetDateTime offsetDateTime) {
        int iY;
        OffsetDateTime offsetDateTime2 = offsetDateTime;
        ZoneOffset zoneOffset = offsetDateTime2.f43004b;
        ZoneOffset zoneOffset2 = this.f43004b;
        if (zoneOffset2.equals(zoneOffset)) {
            iY = toLocalDateTime().compareTo(offsetDateTime2.toLocalDateTime());
        } else {
            LocalDateTime localDateTime = this.f43003a;
            long jA0 = localDateTime.a0(zoneOffset2);
            ZoneOffset zoneOffset3 = offsetDateTime2.f43004b;
            LocalDateTime localDateTime2 = offsetDateTime2.f43003a;
            int iCompare = Long.compare(jA0, localDateTime2.a0(zoneOffset3));
            iY = iCompare == 0 ? localDateTime.n().Y() - localDateTime2.n().Y() : iCompare;
        }
        return iY == 0 ? toLocalDateTime().compareTo(offsetDateTime2.toLocalDateTime()) : iY;
    }

    static {
        LocalDateTime localDateTime = LocalDateTime.f43000c;
        ZoneOffset zoneOffset = ZoneOffset.g;
        localDateTime.getClass();
        r(localDateTime, zoneOffset);
        LocalDateTime localDateTime2 = LocalDateTime.d;
        ZoneOffset zoneOffset2 = ZoneOffset.f;
        localDateTime2.getClass();
        r(localDateTime2, zoneOffset2);
    }

    public static OffsetDateTime r(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        return new OffsetDateTime(localDateTime, zoneOffset);
    }

    public static OffsetDateTime C(Instant instant, ZoneId zoneId) {
        Objects.requireNonNull(instant, "instant");
        Objects.requireNonNull(zoneId, "zone");
        ZoneOffset zoneOffsetD = zoneId.C().d(instant);
        return new OffsetDateTime(LocalDateTime.f0(instant.C(), instant.J(), zoneOffsetD), zoneOffsetD);
    }

    private OffsetDateTime(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        Objects.requireNonNull(localDateTime, "dateTime");
        this.f43003a = localDateTime;
        Objects.requireNonNull(zoneOffset, "offset");
        this.f43004b = zoneOffset;
    }

    private OffsetDateTime V(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        return (this.f43003a == localDateTime && this.f43004b.equals(zoneOffset)) ? this : new OffsetDateTime(localDateTime, zoneOffset);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean d(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            return true;
        }
        return rVar != null && rVar.Y(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.w k(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            if (rVar == j$.time.temporal.a.INSTANT_SECONDS || rVar == j$.time.temporal.a.OFFSET_SECONDS) {
                return ((j$.time.temporal.a) rVar).C();
            }
            return this.f43003a.k(rVar);
        }
        return rVar.J(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int g(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            int i2 = p.f43163a[((j$.time.temporal.a) rVar).ordinal()];
            if (i2 == 1) {
                throw new j$.time.temporal.v("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
            }
            if (i2 == 2) {
                return this.f43004b.getTotalSeconds();
            }
            return this.f43003a.g(rVar);
        }
        return super.g(rVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long e(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            int i2 = p.f43163a[((j$.time.temporal.a) rVar).ordinal()];
            ZoneOffset zoneOffset = this.f43004b;
            LocalDateTime localDateTime = this.f43003a;
            if (i2 == 1) {
                return localDateTime.a0(zoneOffset);
            }
            if (i2 == 2) {
                return zoneOffset.getTotalSeconds();
            }
            return localDateTime.e(rVar);
        }
        return rVar.r(this);
    }

    public LocalDateTime toLocalDateTime() {
        return this.f43003a;
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: i */
    public final j$.time.temporal.m m(h hVar) {
        return V(this.f43003a.m0(hVar), this.f43004b);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m h(long j, j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) rVar;
            int i2 = p.f43163a[aVar.ordinal()];
            ZoneOffset zoneOffset = this.f43004b;
            LocalDateTime localDateTime = this.f43003a;
            if (i2 == 1) {
                return C(Instant.V(j, localDateTime.J()), zoneOffset);
            }
            if (i2 == 2) {
                return V(localDateTime, ZoneOffset.f0(aVar.b0(j)));
            }
            return V(localDateTime.h(j, rVar), zoneOffset);
        }
        return (OffsetDateTime) rVar.p(this, j);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public final OffsetDateTime l(long j, j$.time.temporal.u uVar) {
        if (uVar instanceof j$.time.temporal.b) {
            return V(this.f43003a.l(j, uVar), this.f43004b);
        }
        return (OffsetDateTime) uVar.p(this, j);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m c(long j, j$.time.temporal.u uVar) {
        return j == Long.MIN_VALUE ? l(Long.MAX_VALUE, uVar).l(1L, uVar) : l(-j, uVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object a(j$.time.temporal.t tVar) {
        if (tVar == j$.time.temporal.s.d() || tVar == j$.time.temporal.s.f()) {
            return this.f43004b;
        }
        if (tVar == j$.time.temporal.s.g()) {
            return null;
        }
        j$.time.temporal.t tVarB = j$.time.temporal.s.b();
        LocalDateTime localDateTime = this.f43003a;
        if (tVar == tVarB) {
            return localDateTime.k0();
        }
        if (tVar == j$.time.temporal.s.c()) {
            return localDateTime.n();
        }
        if (tVar == j$.time.temporal.s.a()) {
            return j$.time.chrono.t.d;
        }
        if (tVar == j$.time.temporal.s.e()) {
            return j$.time.temporal.b.NANOS;
        }
        return tVar.i(this);
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.m b(j$.time.temporal.m mVar) {
        j$.time.temporal.a aVar = j$.time.temporal.a.EPOCH_DAY;
        LocalDateTime localDateTime = this.f43003a;
        return mVar.h(localDateTime.k0().v(), aVar).h(localDateTime.n().m0(), j$.time.temporal.a.NANO_OF_DAY).h(this.f43004b.getTotalSeconds(), j$.time.temporal.a.OFFSET_SECONDS);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OffsetDateTime) {
            OffsetDateTime offsetDateTime = (OffsetDateTime) obj;
            if (this.f43003a.equals(offsetDateTime.f43003a) && this.f43004b.equals(offsetDateTime.f43004b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f43003a.hashCode() ^ this.f43004b.hashCode();
    }

    public final String toString() {
        return this.f43003a.toString() + this.f43004b.toString();
    }

    private Object writeReplace() {
        return new r((byte) 10, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    final void writeExternal(ObjectOutput objectOutput) {
        this.f43003a.o0(objectOutput);
        this.f43004b.i0(objectOutput);
    }

    static OffsetDateTime U(ObjectInput objectInput) {
        LocalDateTime localDateTime = LocalDateTime.f43000c;
        h hVar = h.d;
        return new OffsetDateTime(LocalDateTime.e0(h.h0(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), k.l0(objectInput)), ZoneOffset.h0(objectInput));
    }
}
