package j$.time;

import com.google.android.gms.ads.RequestConfiguration;
import j$.time.chrono.InterfaceC3540b;
import j$.time.chrono.InterfaceC3543e;
import j$.time.chrono.InterfaceC3548j;
import j$.time.format.DateTimeFormatter;
import j$.time.temporal.TemporalAccessor;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class LocalDateTime implements j$.time.temporal.m, j$.time.temporal.n, InterfaceC3543e, Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final LocalDateTime f43000c = e0(h.d, k.f43152e);
    public static final LocalDateTime d = e0(h.f43145e, k.f);
    private static final long serialVersionUID = 6207766400415563566L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h f43001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k f43002b;

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m c(long j, j$.time.temporal.u uVar) {
        j$.time.temporal.b bVar = (j$.time.temporal.b) uVar;
        return j == Long.MIN_VALUE ? l(Long.MAX_VALUE, bVar).l(1L, bVar) : l(-j, bVar);
    }

    @Override // j$.time.chrono.InterfaceC3543e
    public final InterfaceC3548j H(ZoneId zoneId) {
        return ZonedDateTime.U(this, zoneId, null);
    }

    public static LocalDateTime c0(int i2) {
        return new LocalDateTime(h.h0(i2, 12, 31), k.c0(0));
    }

    public static LocalDateTime d0(int i2, int i3, int i4, int i5, int i6, int i7) {
        return new LocalDateTime(h.h0(i2, i3, i4), k.d0(i5, i6, i7, 0));
    }

    public static LocalDateTime e0(h hVar, k kVar) {
        Objects.requireNonNull(hVar, "date");
        Objects.requireNonNull(kVar, "time");
        return new LocalDateTime(hVar, kVar);
    }

    public static LocalDateTime f0(long j, int i2, ZoneOffset zoneOffset) {
        Objects.requireNonNull(zoneOffset, "offset");
        long j2 = i2;
        j$.time.temporal.a.NANO_OF_SECOND.c0(j2);
        long totalSeconds = j + ((long) zoneOffset.getTotalSeconds());
        long j3 = 86400;
        return new LocalDateTime(h.j0(Math.floorDiv(totalSeconds, j3)), k.e0((((long) ((int) Math.floorMod(totalSeconds, j3))) * 1000000000) + j2));
    }

    public static LocalDateTime C(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof LocalDateTime) {
            return (LocalDateTime) temporalAccessor;
        }
        if (temporalAccessor instanceof ZonedDateTime) {
            return ((ZonedDateTime) temporalAccessor).b0();
        }
        if (temporalAccessor instanceof OffsetDateTime) {
            return ((OffsetDateTime) temporalAccessor).toLocalDateTime();
        }
        try {
            return new LocalDateTime(h.J(temporalAccessor), k.J(temporalAccessor));
        } catch (c e2) {
            throw new c("Unable to obtain LocalDateTime from TemporalAccessor: " + temporalAccessor + " of type " + temporalAccessor.getClass().getName(), e2);
        }
    }

    private LocalDateTime(h hVar, k kVar) {
        this.f43001a = hVar;
        this.f43002b = kVar;
    }

    private LocalDateTime n0(h hVar, k kVar) {
        return (this.f43001a == hVar && this.f43002b == kVar) ? this : new LocalDateTime(hVar, kVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean d(j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return rVar != null && rVar.Y(this);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) rVar;
        return aVar.V() || aVar.d0();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.w k(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) rVar).d0() ? this.f43002b.k(rVar) : this.f43001a.k(rVar);
        }
        return rVar.J(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int g(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) rVar).d0() ? this.f43002b.g(rVar) : this.f43001a.g(rVar);
        }
        return super.g(rVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long e(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) rVar).d0() ? this.f43002b.e(rVar) : this.f43001a.e(rVar);
        }
        return rVar.r(this);
    }

    private int r(LocalDateTime localDateTime) {
        int iR = this.f43001a.r(localDateTime.f43001a);
        return iR == 0 ? this.f43002b.compareTo(localDateTime.f43002b) : iR;
    }

    public final h k0() {
        return this.f43001a;
    }

    @Override // j$.time.chrono.InterfaceC3543e
    public final InterfaceC3540b o() {
        return this.f43001a;
    }

    public final int V() {
        return this.f43001a.c0();
    }

    @Override // j$.time.chrono.InterfaceC3543e
    public final k n() {
        return this.f43002b;
    }

    public final int U() {
        return this.f43002b.b0();
    }

    public final int J() {
        return this.f43002b.Y();
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: i */
    public final j$.time.temporal.m m(h hVar) {
        return n0(hVar, this.f43002b);
    }

    public final LocalDateTime m0(h hVar) {
        return n0(hVar, this.f43002b);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: l0, reason: merged with bridge method [inline-methods] */
    public final LocalDateTime h(long j, j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            boolean zD0 = ((j$.time.temporal.a) rVar).d0();
            k kVar = this.f43002b;
            h hVar = this.f43001a;
            if (zD0) {
                return n0(hVar, kVar.h(j, rVar));
            }
            return n0(hVar.h(j, rVar), kVar);
        }
        return (LocalDateTime) rVar.p(this, j);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: g0, reason: merged with bridge method [inline-methods] */
    public final LocalDateTime l(long j, j$.time.temporal.u uVar) {
        if (!(uVar instanceof j$.time.temporal.b)) {
            return (LocalDateTime) uVar.p(this, j);
        }
        switch (i.f43149a[((j$.time.temporal.b) uVar).ordinal()]) {
            case 1:
                return j0(this.f43001a, 0L, 0L, 0L, j);
            case 2:
                LocalDateTime localDateTimeH0 = h0(j / 86400000000L);
                return localDateTimeH0.j0(localDateTimeH0.f43001a, 0L, 0L, 0L, (j % 86400000000L) * 1000);
            case 3:
                LocalDateTime localDateTimeH1 = h0(j / 86400000);
                return localDateTimeH1.j0(localDateTimeH1.f43001a, 0L, 0L, 0L, (j % 86400000) * 1000000);
            case 4:
                return i0(j);
            case 5:
                return j0(this.f43001a, 0L, j, 0L, 0L);
            case 6:
                return j0(this.f43001a, j, 0L, 0L, 0L);
            case 7:
                LocalDateTime localDateTimeH2 = h0(j / 256);
                return localDateTimeH2.j0(localDateTimeH2.f43001a, (j % 256) * 12, 0L, 0L, 0L);
            default:
                return n0(this.f43001a.l(j, uVar), this.f43002b);
        }
    }

    public final LocalDateTime h0(long j) {
        return n0(this.f43001a.m0(j), this.f43002b);
    }

    public final LocalDateTime i0(long j) {
        return j0(this.f43001a, 0L, 0L, j, 0L);
    }

    @Override // j$.time.chrono.InterfaceC3543e
    /* JADX INFO: renamed from: j */
    public final InterfaceC3543e c(long j, j$.time.temporal.b bVar) {
        return j == Long.MIN_VALUE ? l(Long.MAX_VALUE, bVar).l(1L, bVar) : l(-j, bVar);
    }

    private LocalDateTime j0(h hVar, long j, long j2, long j3, long j4) {
        long j5 = j | j2 | j3 | j4;
        k kVarE0 = this.f43002b;
        if (j5 == 0) {
            return n0(hVar, kVarE0);
        }
        long j6 = j / 24;
        long j7 = j6 + (j2 / 1440) + (j3 / 86400) + (j4 / 86400000000000L);
        long j8 = 1;
        long j9 = ((j % 24) * 3600000000000L) + ((j2 % 1440) * 60000000000L) + ((j3 % 86400) * 1000000000) + (j4 % 86400000000000L);
        long jM0 = kVarE0.m0();
        long j10 = (j9 * j8) + jM0;
        long jFloorDiv = Math.floorDiv(j10, 86400000000000L) + (j7 * j8);
        long jFloorMod = Math.floorMod(j10, 86400000000000L);
        if (jFloorMod != jM0) {
            kVarE0 = k.e0(jFloorMod);
        }
        return n0(hVar.m0(jFloorDiv), kVarE0);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object a(j$.time.temporal.t tVar) {
        if (tVar == j$.time.temporal.s.b()) {
            return this.f43001a;
        }
        return super.a(tVar);
    }

    public String format(DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return dateTimeFormatter.a(this);
    }

    @Override // j$.time.chrono.InterfaceC3543e, java.lang.Comparable
    /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
    public final int compareTo(InterfaceC3543e interfaceC3543e) {
        if (interfaceC3543e instanceof LocalDateTime) {
            return r((LocalDateTime) interfaceC3543e);
        }
        return super.compareTo(interfaceC3543e);
    }

    public final boolean Y(LocalDateTime localDateTime) {
        if (localDateTime != null) {
            return r(localDateTime) > 0;
        }
        long jV = this.f43001a.v();
        long jV2 = localDateTime.f43001a.v();
        if (jV <= jV2) {
            return jV == jV2 && this.f43002b.m0() > localDateTime.f43002b.m0();
        }
        return true;
    }

    public final boolean b0(LocalDateTime localDateTime) {
        if (localDateTime != null) {
            return r(localDateTime) < 0;
        }
        long jV = this.f43001a.v();
        long jV2 = localDateTime.f43001a.v();
        if (jV >= jV2) {
            return jV == jV2 && this.f43002b.m0() < localDateTime.f43002b.m0();
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LocalDateTime) {
            LocalDateTime localDateTime = (LocalDateTime) obj;
            if (this.f43001a.equals(localDateTime.f43001a) && this.f43002b.equals(localDateTime.f43002b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f43001a.hashCode() ^ this.f43002b.hashCode();
    }

    public final String toString() {
        return this.f43001a.toString() + RequestConfiguration.MAX_AD_CONTENT_RATING_T + this.f43002b.toString();
    }

    private Object writeReplace() {
        return new r((byte) 5, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    final void o0(DataOutput dataOutput) {
        this.f43001a.v0(dataOutput);
        this.f43002b.q0(dataOutput);
    }
}
