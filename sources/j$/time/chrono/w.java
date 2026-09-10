package j$.time.chrono;

import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.temporal.TemporalAccessor;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class w extends AbstractC3539a implements Serializable {
    public static final w d = new w();
    private static final long serialVersionUID = 459996390165777884L;

    @Override // j$.time.chrono.m
    public final String s() {
        return "Japanese";
    }

    @Override // j$.time.chrono.m
    public final String T() {
        return "japanese";
    }

    @Override // j$.time.chrono.m
    public final InterfaceC3540b G(int i2, int i3, int i4) {
        return new y(j$.time.h.h0(i2, i3, i4));
    }

    @Override // j$.time.chrono.m
    public final InterfaceC3540b A(int i2, int i3) {
        return new y(j$.time.h.k0(i2, i3));
    }

    @Override // j$.time.chrono.m
    public final InterfaceC3540b q(long j) {
        return new y(j$.time.h.j0(j));
    }

    @Override // j$.time.chrono.m
    public final InterfaceC3540b M() {
        return new y(j$.time.h.J(j$.time.h.g0(j$.time.b.c())));
    }

    @Override // j$.time.chrono.m
    public final InterfaceC3540b t(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof y) {
            return (y) temporalAccessor;
        }
        return new y(j$.time.h.J(temporalAccessor));
    }

    @Override // j$.time.chrono.m
    public final boolean E(long j) {
        return t.d.E(j);
    }

    private w() {
    }

    @Override // j$.time.chrono.m
    public final int w(n nVar, int i2) {
        if (!(nVar instanceof z)) {
            throw new ClassCastException("Era must be JapaneseEra");
        }
        z zVar = (z) nVar;
        int iC0 = (zVar.s().c0() + i2) - 1;
        if (i2 != 1 && (iC0 < -999999999 || iC0 > 999999999 || iC0 < zVar.s().c0() || nVar != z.q(j$.time.h.h0(iC0, 1, 1)))) {
            throw new j$.time.c("Invalid yearOfEra value");
        }
        return iC0;
    }

    @Override // j$.time.chrono.m
    public final n P(int i2) {
        return z.w(i2);
    }

    @Override // j$.time.chrono.m
    public final List D() {
        return j$.time.b.b(z.A());
    }

    @Override // j$.time.chrono.m
    public final j$.time.temporal.w W(j$.time.temporal.a aVar) {
        switch (v.f43053a[aVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                throw new j$.time.temporal.v("Unsupported field: " + aVar);
            case 5:
                return j$.time.temporal.w.k(1L, z.y(), 999999999 - z.r().s().c0());
            case 6:
                return j$.time.temporal.w.k(1L, z.x(), j$.time.temporal.a.DAY_OF_YEAR.C().d());
            case 7:
                return j$.time.temporal.w.j(y.d.c0(), 999999999L);
            case 8:
                return j$.time.temporal.w.j(z.d.p(), z.r().p());
            default:
                return aVar.C();
        }
    }

    @Override // j$.time.chrono.AbstractC3539a, j$.time.chrono.m
    public final InterfaceC3540b R(Map map, j$.time.format.F f) {
        return (y) super.R(map, f);
    }

    @Override // j$.time.chrono.AbstractC3539a
    final InterfaceC3540b Y(Map map, j$.time.format.F f) {
        y yVarD0;
        j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
        Long l2 = (Long) map.get(aVar);
        z zVarW = l2 != null ? z.w(W(aVar).a(l2.longValue(), aVar)) : null;
        j$.time.temporal.a aVar2 = j$.time.temporal.a.YEAR_OF_ERA;
        Long l3 = (Long) map.get(aVar2);
        int iA = l3 != null ? W(aVar2).a(l3.longValue(), aVar2) : 0;
        if (zVarW == null && l3 != null && !map.containsKey(j$.time.temporal.a.YEAR) && f != j$.time.format.F.STRICT) {
            zVarW = z.A()[z.A().length - 1];
        }
        if (l3 != null && zVarW != null) {
            j$.time.temporal.a aVar3 = j$.time.temporal.a.MONTH_OF_YEAR;
            if (map.containsKey(aVar3)) {
                j$.time.temporal.a aVar4 = j$.time.temporal.a.DAY_OF_MONTH;
                if (map.containsKey(aVar4)) {
                    map.remove(aVar);
                    map.remove(aVar2);
                    if (f == j$.time.format.F.LENIENT) {
                        return new y(j$.time.h.h0((zVarW.s().c0() + iA) - 1, 1, 1)).Y(Math.subtractExact(((Long) map.remove(aVar3)).longValue(), 1L), j$.time.temporal.b.MONTHS).Y(Math.subtractExact(((Long) map.remove(aVar4)).longValue(), 1L), j$.time.temporal.b.DAYS);
                    }
                    int iA2 = W(aVar3).a(((Long) map.remove(aVar3)).longValue(), aVar3);
                    int iA3 = W(aVar4).a(((Long) map.remove(aVar4)).longValue(), aVar4);
                    if (f != j$.time.format.F.SMART) {
                        j$.time.h hVar = y.d;
                        j$.time.h hVarH0 = j$.time.h.h0((zVarW.s().c0() + iA) - 1, iA2, iA3);
                        if (hVarH0.d0(zVarW.s()) || zVarW != z.q(hVarH0)) {
                            throw new j$.time.c("year, month, and day not valid for Era");
                        }
                        return new y(zVarW, iA, hVarH0);
                    }
                    if (iA < 1) {
                        throw new j$.time.c("Invalid YearOfEra: " + iA);
                    }
                    int iC0 = (zVarW.s().c0() + iA) - 1;
                    try {
                        yVarD0 = new y(j$.time.h.h0(iC0, iA2, iA3));
                    } catch (j$.time.c unused) {
                        yVarD0 = new y(j$.time.h.h0(iC0, iA2, 1)).d0(new j$.time.temporal.p(0));
                    }
                    if (yVarD0.V() == zVarW || yVarD0.g(j$.time.temporal.a.YEAR_OF_ERA) <= 1 || iA <= 1) {
                        return yVarD0;
                    }
                    throw new j$.time.c("Invalid YearOfEra for Era: " + zVarW + " " + iA);
                }
            }
            j$.time.temporal.a aVar5 = j$.time.temporal.a.DAY_OF_YEAR;
            if (map.containsKey(aVar5)) {
                map.remove(aVar);
                map.remove(aVar2);
                if (f == j$.time.format.F.LENIENT) {
                    return new y(j$.time.h.k0((zVarW.s().c0() + iA) - 1, 1)).Y(Math.subtractExact(((Long) map.remove(aVar5)).longValue(), 1L), j$.time.temporal.b.DAYS);
                }
                int iA4 = W(aVar5).a(((Long) map.remove(aVar5)).longValue(), aVar5);
                j$.time.h hVar2 = y.d;
                j$.time.h hVarK0 = iA == 1 ? j$.time.h.k0(zVarW.s().c0(), (zVarW.s().Y() + iA4) - 1) : j$.time.h.k0((zVarW.s().c0() + iA) - 1, iA4);
                if (hVarK0.d0(zVarW.s()) || zVarW != z.q(hVarK0)) {
                    throw new j$.time.c("Invalid parameters");
                }
                return new y(zVarW, iA, hVarK0);
            }
        }
        return null;
    }

    @Override // j$.time.chrono.m
    public final InterfaceC3548j y(Instant instant, ZoneId zoneId) {
        return l.J(this, instant, zoneId);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    Object writeReplace() {
        return new F((byte) 1, this);
    }
}
