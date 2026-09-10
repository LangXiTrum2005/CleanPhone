package j$.time;

import com.p004ironsource.d9;
import j$.time.chrono.InterfaceC3540b;
import j$.time.chrono.InterfaceC3543e;
import j$.time.chrono.InterfaceC3548j;
import j$.time.format.DateTimeFormatter;
import j$.time.temporal.TemporalAccessor;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class ZonedDateTime implements j$.time.temporal.m, InterfaceC3548j, Serializable {
    private static final long serialVersionUID = -6260982410461394882L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LocalDateTime f43011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ZoneOffset f43012b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ZoneId f43013c;

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m c(long j, j$.time.temporal.u uVar) {
        j$.time.temporal.b bVar = (j$.time.temporal.b) uVar;
        return j == Long.MIN_VALUE ? l(Long.MAX_VALUE, bVar).l(1L, bVar) : l(-j, bVar);
    }

    public static ZonedDateTime U(LocalDateTime localDateTime, ZoneId zoneId, ZoneOffset zoneOffset) {
        Objects.requireNonNull(localDateTime, "localDateTime");
        Objects.requireNonNull(zoneId, "zone");
        if (zoneId instanceof ZoneOffset) {
            return new ZonedDateTime(localDateTime, zoneId, (ZoneOffset) zoneId);
        }
        j$.time.zone.f fVarC = zoneId.C();
        List listG = fVarC.g(localDateTime);
        if (listG.size() == 1) {
            zoneOffset = (ZoneOffset) listG.get(0);
        } else if (listG.size() == 0) {
            j$.time.zone.b bVarF = fVarC.f(localDateTime);
            localDateTime = localDateTime.i0(bVarF.C().J());
            zoneOffset = bVarF.J();
        } else if (zoneOffset == null || !listG.contains(zoneOffset)) {
            zoneOffset = (ZoneOffset) listG.get(0);
            Objects.requireNonNull(zoneOffset, "offset");
        }
        return new ZonedDateTime(localDateTime, zoneId, zoneOffset);
    }

    public static ZonedDateTime J(Instant instant, ZoneId zoneId) {
        Objects.requireNonNull(instant, "instant");
        Objects.requireNonNull(zoneId, "zone");
        return r(instant.C(), instant.J(), zoneId);
    }

    private static ZonedDateTime r(long j, int i2, ZoneId zoneId) {
        ZoneOffset zoneOffsetD = zoneId.C().d(Instant.V(j, i2));
        return new ZonedDateTime(LocalDateTime.f0(j, i2, zoneOffsetD), zoneId, zoneOffsetD);
    }

    public static ZonedDateTime C(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof ZonedDateTime) {
            return (ZonedDateTime) temporalAccessor;
        }
        try {
            ZoneId zoneIdR = ZoneId.r(temporalAccessor);
            j$.time.temporal.a aVar = j$.time.temporal.a.INSTANT_SECONDS;
            if (!temporalAccessor.d(aVar)) {
                return U(LocalDateTime.e0(h.J(temporalAccessor), k.J(temporalAccessor)), zoneIdR, null);
            }
            return r(temporalAccessor.e(aVar), temporalAccessor.g(j$.time.temporal.a.NANO_OF_SECOND), zoneIdR);
        } catch (c e2) {
            throw new c("Unable to obtain ZonedDateTime from TemporalAccessor: " + temporalAccessor + " of type " + temporalAccessor.getClass().getName(), e2);
        }
    }

    public static ZonedDateTime parse(CharSequence charSequence, DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return (ZonedDateTime) dateTimeFormatter.e(charSequence, new x());
    }

    private ZonedDateTime(LocalDateTime localDateTime, ZoneId zoneId, ZoneOffset zoneOffset) {
        this.f43011a = localDateTime;
        this.f43012b = zoneOffset;
        this.f43013c = zoneId;
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
            return this.f43011a.k(rVar);
        }
        return rVar.J(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int g(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            int i2 = y.f43217a[((j$.time.temporal.a) rVar).ordinal()];
            if (i2 == 1) {
                throw new j$.time.temporal.v("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
            }
            if (i2 == 2) {
                return this.f43012b.getTotalSeconds();
            }
            return this.f43011a.g(rVar);
        }
        return super.g(rVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long e(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            int i2 = y.f43217a[((j$.time.temporal.a) rVar).ordinal()];
            if (i2 == 1) {
                return Q();
            }
            if (i2 == 2) {
                return this.f43012b.getTotalSeconds();
            }
            return this.f43011a.e(rVar);
        }
        return rVar.r(this);
    }

    @Override // j$.time.chrono.InterfaceC3548j
    public final ZoneOffset getOffset() {
        return this.f43012b;
    }

    @Override // j$.time.chrono.InterfaceC3548j
    public final ZoneId S() {
        return this.f43013c;
    }

    @Override // j$.time.chrono.InterfaceC3548j
    public final InterfaceC3548j I(ZoneId zoneId) {
        Objects.requireNonNull(zoneId, "zone");
        return this.f43013c.equals(zoneId) ? this : U(this.f43011a, zoneId, this.f43012b);
    }

    @Override // j$.time.chrono.InterfaceC3548j
    public final InterfaceC3543e B() {
        return this.f43011a;
    }

    public final LocalDateTime b0() {
        return this.f43011a;
    }

    @Override // j$.time.chrono.InterfaceC3548j
    public final InterfaceC3540b o() {
        return this.f43011a.k0();
    }

    @Override // j$.time.chrono.InterfaceC3548j
    public final k n() {
        return this.f43011a.n();
    }

    @Override // j$.time.chrono.InterfaceC3548j
    /* JADX INFO: renamed from: c0, reason: merged with bridge method [inline-methods] */
    public final ZonedDateTime m(h hVar) {
        return U(LocalDateTime.e0(hVar, this.f43011a.n()), this.f43013c, this.f43012b);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m h(long j, j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) rVar;
            int i2 = y.f43217a[aVar.ordinal()];
            LocalDateTime localDateTime = this.f43011a;
            ZoneId zoneId = this.f43013c;
            if (i2 == 1) {
                return r(j, localDateTime.J(), zoneId);
            }
            ZoneOffset zoneOffset = this.f43012b;
            if (i2 != 2) {
                return U(localDateTime.h(j, rVar), zoneId, zoneOffset);
            }
            ZoneOffset zoneOffsetF0 = ZoneOffset.f0(aVar.b0(j));
            return (zoneOffsetF0.equals(zoneOffset) || !zoneId.C().g(localDateTime).contains(zoneOffsetF0)) ? this : new ZonedDateTime(localDateTime, zoneId, zoneOffsetF0);
        }
        return (ZonedDateTime) rVar.p(this, j);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
    public final ZonedDateTime l(long j, j$.time.temporal.u uVar) {
        if (uVar instanceof j$.time.temporal.b) {
            j$.time.temporal.b bVar = (j$.time.temporal.b) uVar;
            int iCompareTo = bVar.compareTo(j$.time.temporal.b.DAYS);
            ZoneOffset zoneOffset = this.f43012b;
            ZoneId zoneId = this.f43013c;
            LocalDateTime localDateTime = this.f43011a;
            if (iCompareTo >= 0 && bVar != j$.time.temporal.b.FOREVER) {
                return U(localDateTime.l(j, uVar), zoneId, zoneOffset);
            }
            LocalDateTime localDateTimeG0 = localDateTime.l(j, uVar);
            Objects.requireNonNull(localDateTimeG0, "localDateTime");
            Objects.requireNonNull(zoneOffset, "offset");
            Objects.requireNonNull(zoneId, "zone");
            if (zoneId.C().g(localDateTimeG0).contains(zoneOffset)) {
                return new ZonedDateTime(localDateTimeG0, zoneId, zoneOffset);
            }
            return r(localDateTimeG0.a0(zoneOffset), localDateTimeG0.J(), zoneId);
        }
        return (ZonedDateTime) uVar.p(this, j);
    }

    @Override // j$.time.chrono.InterfaceC3548j
    /* JADX INFO: renamed from: j */
    public final InterfaceC3548j c(long j, j$.time.temporal.b bVar) {
        return j == Long.MIN_VALUE ? l(Long.MAX_VALUE, bVar).l(1L, bVar) : l(-j, bVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object a(j$.time.temporal.t tVar) {
        if (tVar == j$.time.temporal.s.b()) {
            return this.f43011a.k0();
        }
        return super.a(tVar);
    }

    public String format(DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return dateTimeFormatter.a(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ZonedDateTime) {
            ZonedDateTime zonedDateTime = (ZonedDateTime) obj;
            if (this.f43011a.equals(zonedDateTime.f43011a) && this.f43012b.equals(zonedDateTime.f43012b) && this.f43013c.equals(zonedDateTime.f43013c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f43011a.hashCode() ^ this.f43012b.hashCode()) ^ Integer.rotateLeft(this.f43013c.hashCode(), 3);
    }

    public final String toString() {
        String string = this.f43011a.toString();
        ZoneOffset zoneOffset = this.f43012b;
        String str = string + zoneOffset.toString();
        ZoneId zoneId = this.f43013c;
        if (zoneOffset == zoneId) {
            return str;
        }
        return str + d9.i.d + zoneId.toString() + d9.i.f24752e;
    }

    private Object writeReplace() {
        return new r((byte) 6, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    final void d0(DataOutput dataOutput) {
        this.f43011a.o0(dataOutput);
        this.f43012b.i0(dataOutput);
        this.f43013c.b0((ObjectOutput) dataOutput);
    }

    static ZonedDateTime Y(ObjectInput objectInput) throws IOException {
        LocalDateTime localDateTime = LocalDateTime.f43000c;
        h hVar = h.d;
        LocalDateTime localDateTimeE0 = LocalDateTime.e0(h.h0(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), k.l0(objectInput));
        ZoneOffset zoneOffsetH0 = ZoneOffset.h0(objectInput);
        ZoneId zoneId = (ZoneId) r.a(objectInput);
        Objects.requireNonNull(zoneId, "zone");
        if ((zoneId instanceof ZoneOffset) && !zoneOffsetH0.equals(zoneId)) {
            throw new IllegalArgumentException("ZoneId must match ZoneOffset");
        }
        return new ZonedDateTime(localDateTimeE0, zoneId, zoneOffsetH0);
    }
}
