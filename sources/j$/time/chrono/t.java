package j$.time.chrono;

import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.ZonedDateTime;
import j$.time.temporal.TemporalAccessor;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class t extends AbstractC3539a implements Serializable {
    public static final t d = new t();
    private static final long serialVersionUID = -1440403870442975015L;

    @Override // j$.time.chrono.m
    public final n P(int i2) {
        if (i2 == 0) {
            return u.BCE;
        }
        if (i2 == 1) {
            return u.CE;
        }
        throw new j$.time.c("Invalid era: " + i2);
    }

    @Override // j$.time.chrono.m
    public final String s() {
        return "ISO";
    }

    @Override // j$.time.chrono.m
    public final String T() {
        return "iso8601";
    }

    @Override // j$.time.chrono.m
    public final InterfaceC3540b G(int i2, int i3, int i4) {
        return j$.time.h.h0(i2, i3, i4);
    }

    @Override // j$.time.chrono.m
    public final InterfaceC3540b A(int i2, int i3) {
        return j$.time.h.k0(i2, i3);
    }

    @Override // j$.time.chrono.m
    public final InterfaceC3540b q(long j) {
        return j$.time.h.j0(j);
    }

    @Override // j$.time.chrono.m
    public final InterfaceC3540b t(TemporalAccessor temporalAccessor) {
        return j$.time.h.J(temporalAccessor);
    }

    private t() {
    }

    @Override // j$.time.chrono.m
    public final InterfaceC3543e x(LocalDateTime localDateTime) {
        return LocalDateTime.C(localDateTime);
    }

    @Override // j$.time.chrono.m
    public final InterfaceC3548j y(Instant instant, ZoneId zoneId) {
        return ZonedDateTime.J(instant, zoneId);
    }

    @Override // j$.time.chrono.m
    public final InterfaceC3540b M() {
        return j$.time.h.J(j$.time.h.g0(j$.time.b.c()));
    }

    @Override // j$.time.chrono.m
    public final boolean E(long j) {
        if ((3 & j) == 0) {
            return j % 100 != 0 || j % 400 == 0;
        }
        return false;
    }

    @Override // j$.time.chrono.m
    public final int w(n nVar, int i2) {
        if (nVar instanceof u) {
            return nVar == u.CE ? i2 : 1 - i2;
        }
        throw new ClassCastException("Era must be IsoEra");
    }

    @Override // j$.time.chrono.m
    public final List D() {
        return j$.time.b.b(u.values());
    }

    @Override // j$.time.chrono.AbstractC3539a, j$.time.chrono.m
    public final InterfaceC3540b R(Map map, j$.time.format.F f) {
        return (j$.time.h) super.R(map, f);
    }

    @Override // j$.time.chrono.AbstractC3539a
    final void U(Map map, j$.time.format.F f) {
        j$.time.temporal.a aVar = j$.time.temporal.a.PROLEPTIC_MONTH;
        Long l2 = (Long) map.remove(aVar);
        if (l2 != null) {
            if (f != j$.time.format.F.LENIENT) {
                aVar.c0(l2.longValue());
            }
            long j = 12;
            AbstractC3539a.p(map, j$.time.temporal.a.MONTH_OF_YEAR, ((int) Math.floorMod(l2.longValue(), j)) + 1);
            AbstractC3539a.p(map, j$.time.temporal.a.YEAR, Math.floorDiv(l2.longValue(), j));
        }
    }

    @Override // j$.time.chrono.AbstractC3539a
    final InterfaceC3540b Y(Map map, j$.time.format.F f) {
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR_OF_ERA;
        Long l2 = (Long) map.remove(aVar);
        if (l2 != null) {
            if (f != j$.time.format.F.LENIENT) {
                aVar.c0(l2.longValue());
            }
            Long l3 = (Long) map.remove(j$.time.temporal.a.ERA);
            if (l3 != null) {
                if (l3.longValue() == 1) {
                    AbstractC3539a.p(map, j$.time.temporal.a.YEAR, l2.longValue());
                    return null;
                }
                if (l3.longValue() == 0) {
                    AbstractC3539a.p(map, j$.time.temporal.a.YEAR, Math.subtractExact(1L, l2.longValue()));
                    return null;
                }
                throw new j$.time.c("Invalid value for era: " + l3);
            }
            j$.time.temporal.a aVar2 = j$.time.temporal.a.YEAR;
            Long l4 = (Long) map.get(aVar2);
            if (f != j$.time.format.F.STRICT) {
                AbstractC3539a.p(map, aVar2, (l4 == null || l4.longValue() > 0) ? l2.longValue() : Math.subtractExact(1L, l2.longValue()));
                return null;
            }
            if (l4 != null) {
                long jLongValue = l4.longValue();
                long jLongValue2 = l2.longValue();
                if (jLongValue <= 0) {
                    jLongValue2 = Math.subtractExact(1L, jLongValue2);
                }
                AbstractC3539a.p(map, aVar2, jLongValue2);
                return null;
            }
            map.put(aVar, l2);
            return null;
        }
        j$.time.temporal.a aVar3 = j$.time.temporal.a.ERA;
        if (!map.containsKey(aVar3)) {
            return null;
        }
        aVar3.c0(((Long) map.get(aVar3)).longValue());
        return null;
    }

    @Override // j$.time.chrono.AbstractC3539a
    final InterfaceC3540b V(Map map, j$.time.format.F f) {
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        int iB0 = aVar.b0(((Long) map.remove(aVar)).longValue());
        boolean z2 = true;
        if (f == j$.time.format.F.LENIENT) {
            return j$.time.h.h0(iB0, 1, 1).n0(Math.subtractExact(((Long) map.remove(j$.time.temporal.a.MONTH_OF_YEAR)).longValue(), 1L)).m0(Math.subtractExact(((Long) map.remove(j$.time.temporal.a.DAY_OF_MONTH)).longValue(), 1L));
        }
        j$.time.temporal.a aVar2 = j$.time.temporal.a.MONTH_OF_YEAR;
        int iB1 = aVar2.b0(((Long) map.remove(aVar2)).longValue());
        j$.time.temporal.a aVar3 = j$.time.temporal.a.DAY_OF_MONTH;
        int iB2 = aVar3.b0(((Long) map.remove(aVar3)).longValue());
        if (f == j$.time.format.F.SMART) {
            if (iB1 == 4 || iB1 == 6 || iB1 == 9 || iB1 == 11) {
                iB2 = Math.min(iB2, 30);
            } else if (iB1 == 2) {
                j$.time.m mVar = j$.time.m.FEBRUARY;
                long j = iB0;
                int i2 = j$.time.t.f43171b;
                if ((3 & j) != 0 || (j % 100 == 0 && j % 400 != 0)) {
                    z2 = false;
                }
                iB2 = Math.min(iB2, mVar.C(z2));
            }
        }
        return j$.time.h.h0(iB0, iB1, iB2);
    }

    @Override // j$.time.chrono.m
    public final j$.time.temporal.w W(j$.time.temporal.a aVar) {
        return aVar.C();
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    Object writeReplace() {
        return new F((byte) 1, this);
    }
}
