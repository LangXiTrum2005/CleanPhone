package j$.time;

import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class OffsetTime implements j$.time.temporal.m, j$.time.temporal.n, Comparable<OffsetTime>, Serializable {
    private static final long serialVersionUID = 7264499704384272492L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k f43005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ZoneOffset f43006b;

    @Override // java.lang.Comparable
    public final int compareTo(OffsetTime offsetTime) {
        OffsetTime offsetTime2 = offsetTime;
        ZoneOffset zoneOffset = offsetTime2.f43006b;
        ZoneOffset zoneOffset2 = this.f43006b;
        boolean zEquals = zoneOffset2.equals(zoneOffset);
        k kVar = offsetTime2.f43005a;
        k kVar2 = this.f43005a;
        if (zEquals) {
            return kVar2.compareTo(kVar);
        }
        int iCompare = Long.compare(kVar2.m0() - (((long) zoneOffset2.getTotalSeconds()) * 1000000000), kVar.m0() - (((long) offsetTime2.f43006b.getTotalSeconds()) * 1000000000));
        return iCompare == 0 ? kVar2.compareTo(kVar) : iCompare;
    }

    static {
        k kVar = k.f43152e;
        ZoneOffset zoneOffset = ZoneOffset.g;
        kVar.getClass();
        r(kVar, zoneOffset);
        k kVar2 = k.f;
        ZoneOffset zoneOffset2 = ZoneOffset.f;
        kVar2.getClass();
        r(kVar2, zoneOffset2);
    }

    public static OffsetTime now(ZoneId zoneId) {
        Objects.requireNonNull(zoneId, "zone");
        a aVar = zoneId == ZoneOffset.UTC ? a.f43014b : new a(zoneId);
        Objects.requireNonNull(aVar, "clock");
        Instant instantOfEpochMilli = Instant.ofEpochMilli(System.currentTimeMillis());
        ZoneOffset zoneOffsetD = aVar.a().C().d(instantOfEpochMilli);
        Objects.requireNonNull(instantOfEpochMilli, "instant");
        Objects.requireNonNull(zoneOffsetD, "zone");
        ZoneOffset zoneOffsetD2 = j$.time.zone.f.i(zoneOffsetD).d(instantOfEpochMilli);
        return new OffsetTime(k.e0((((long) ((int) Math.floorMod(instantOfEpochMilli.C() + ((long) zoneOffsetD2.getTotalSeconds()), 86400))) * 1000000000) + ((long) instantOfEpochMilli.J())), zoneOffsetD2);
    }

    public static OffsetTime r(k kVar, ZoneOffset zoneOffset) {
        return new OffsetTime(kVar, zoneOffset);
    }

    private OffsetTime(k kVar, ZoneOffset zoneOffset) {
        Objects.requireNonNull(kVar, "time");
        this.f43005a = kVar;
        Objects.requireNonNull(zoneOffset, "offset");
        this.f43006b = zoneOffset;
    }

    private OffsetTime U(k kVar, ZoneOffset zoneOffset) {
        return (this.f43005a == kVar && this.f43006b.equals(zoneOffset)) ? this : new OffsetTime(kVar, zoneOffset);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean d(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) rVar).d0() || rVar == j$.time.temporal.a.OFFSET_SECONDS;
        }
        return rVar != null && rVar.Y(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.w k(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            if (rVar == j$.time.temporal.a.OFFSET_SECONDS) {
                return ((j$.time.temporal.a) rVar).C();
            }
            return this.f43005a.k(rVar);
        }
        return rVar.J(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long e(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            if (rVar == j$.time.temporal.a.OFFSET_SECONDS) {
                return this.f43006b.getTotalSeconds();
            }
            return this.f43005a.e(rVar);
        }
        return rVar.r(this);
    }

    public ZoneOffset getOffset() {
        return this.f43006b;
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: i */
    public final j$.time.temporal.m m(h hVar) {
        return (OffsetTime) hVar.b(this);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m h(long j, j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = j$.time.temporal.a.OFFSET_SECONDS;
            k kVar = this.f43005a;
            if (rVar == aVar) {
                return U(kVar, ZoneOffset.f0(((j$.time.temporal.a) rVar).b0(j)));
            }
            return U(kVar.h(j, rVar), this.f43006b);
        }
        return (OffsetTime) rVar.p(this, j);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public final OffsetTime l(long j, j$.time.temporal.u uVar) {
        if (uVar instanceof j$.time.temporal.b) {
            return U(this.f43005a.l(j, uVar), this.f43006b);
        }
        return (OffsetTime) uVar.p(this, j);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m c(long j, j$.time.temporal.u uVar) {
        return j == Long.MIN_VALUE ? l(Long.MAX_VALUE, uVar).l(1L, uVar) : l(-j, uVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object a(j$.time.temporal.t tVar) {
        if (tVar == j$.time.temporal.s.d() || tVar == j$.time.temporal.s.f()) {
            return this.f43006b;
        }
        if (((tVar == j$.time.temporal.s.g()) || (tVar == j$.time.temporal.s.a())) || tVar == j$.time.temporal.s.b()) {
            return null;
        }
        if (tVar == j$.time.temporal.s.c()) {
            return this.f43005a;
        }
        if (tVar == j$.time.temporal.s.e()) {
            return j$.time.temporal.b.NANOS;
        }
        return tVar.i(this);
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.m b(j$.time.temporal.m mVar) {
        return mVar.h(this.f43005a.m0(), j$.time.temporal.a.NANO_OF_DAY).h(this.f43006b.getTotalSeconds(), j$.time.temporal.a.OFFSET_SECONDS);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OffsetTime) {
            OffsetTime offsetTime = (OffsetTime) obj;
            if (this.f43005a.equals(offsetTime.f43005a) && this.f43006b.equals(offsetTime.f43006b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f43005a.hashCode() ^ this.f43006b.hashCode();
    }

    public final String toString() {
        return this.f43005a.toString() + this.f43006b.toString();
    }

    private Object writeReplace() {
        return new r((byte) 9, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    final void writeExternal(ObjectOutput objectOutput) {
        this.f43005a.q0(objectOutput);
        this.f43006b.i0(objectOutput);
    }

    static OffsetTime J(ObjectInput objectInput) {
        return new OffsetTime(k.l0(objectInput), ZoneOffset.h0(objectInput));
    }
}
