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
public final class B extends AbstractC3539a implements Serializable {
    public static final B d = new B();
    private static final long serialVersionUID = 1039765215346859963L;

    @Override // j$.time.chrono.m
    public final String s() {
        return "Minguo";
    }

    @Override // j$.time.chrono.m
    public final n P(int i2) {
        if (i2 == 0) {
            return E.BEFORE_ROC;
        }
        if (i2 == 1) {
            return E.ROC;
        }
        throw new j$.time.c("Invalid era: " + i2);
    }

    @Override // j$.time.chrono.m
    public final String T() {
        return "roc";
    }

    @Override // j$.time.chrono.m
    public final InterfaceC3540b G(int i2, int i3, int i4) {
        return new D(j$.time.h.h0(i2 + 1911, i3, i4));
    }

    @Override // j$.time.chrono.m
    public final InterfaceC3540b A(int i2, int i3) {
        return new D(j$.time.h.k0(i2 + 1911, i3));
    }

    @Override // j$.time.chrono.m
    public final InterfaceC3540b q(long j) {
        return new D(j$.time.h.j0(j));
    }

    @Override // j$.time.chrono.m
    public final InterfaceC3540b M() {
        return new D(j$.time.h.J(j$.time.h.g0(j$.time.b.c())));
    }

    @Override // j$.time.chrono.m
    public final InterfaceC3540b t(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof D) {
            return (D) temporalAccessor;
        }
        return new D(j$.time.h.J(temporalAccessor));
    }

    @Override // j$.time.chrono.m
    public final boolean E(long j) {
        return t.d.E(j + 1911);
    }

    @Override // j$.time.chrono.m
    public final int w(n nVar, int i2) {
        if (nVar instanceof E) {
            return nVar == E.ROC ? i2 : 1 - i2;
        }
        throw new ClassCastException("Era must be MinguoEra");
    }

    @Override // j$.time.chrono.m
    public final List D() {
        return j$.time.b.b(E.values());
    }

    @Override // j$.time.chrono.m
    public final j$.time.temporal.w W(j$.time.temporal.a aVar) {
        int i2 = A.f43016a[aVar.ordinal()];
        if (i2 == 1) {
            j$.time.temporal.w wVarC = j$.time.temporal.a.PROLEPTIC_MONTH.C();
            return j$.time.temporal.w.j(wVarC.e() - 22932, wVarC.d() - 22932);
        }
        if (i2 == 2) {
            j$.time.temporal.w wVarC2 = j$.time.temporal.a.YEAR.C();
            return j$.time.temporal.w.k(1L, wVarC2.d() - 1911, (-wVarC2.e()) + 1912);
        }
        if (i2 == 3) {
            j$.time.temporal.w wVarC3 = j$.time.temporal.a.YEAR.C();
            return j$.time.temporal.w.j(wVarC3.e() - 1911, wVarC3.d() - 1911);
        }
        return aVar.C();
    }

    @Override // j$.time.chrono.AbstractC3539a, j$.time.chrono.m
    public final InterfaceC3540b R(Map map, j$.time.format.F f) {
        return (D) super.R(map, f);
    }

    private B() {
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.chrono.m
    public final InterfaceC3548j y(Instant instant, ZoneId zoneId) {
        return l.J(this, instant, zoneId);
    }

    Object writeReplace() {
        return new F((byte) 1, this);
    }
}
