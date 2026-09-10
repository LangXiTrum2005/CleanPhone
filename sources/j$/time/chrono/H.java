package j$.time.chrono;

import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.temporal.TemporalAccessor;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class H extends AbstractC3539a implements Serializable {
    public static final H d = new H();
    private static final long serialVersionUID = 2775954514031616474L;

    static {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        map.put(com.smartdigimkt.d2.a.Z, new String[]{"BB", "BE"});
        map.put("th", new String[]{"BB", "BE"});
        map2.put(com.smartdigimkt.d2.a.Z, new String[]{"B.B.", "B.E."});
        map2.put("th", new String[]{"พ.ศ.", "ปีก่อนคริสต์กาลที่"});
        map3.put(com.smartdigimkt.d2.a.Z, new String[]{"Before Buddhist", "Budhhist Era"});
        map3.put("th", new String[]{"พุทธศักราช", "ปีก่อนคริสต์กาลที่"});
    }

    @Override // j$.time.chrono.m
    public final n P(int i2) {
        if (i2 == 0) {
            return K.BEFORE_BE;
        }
        if (i2 == 1) {
            return K.BE;
        }
        throw new j$.time.c("Invalid era: " + i2);
    }

    @Override // j$.time.chrono.m
    public final String s() {
        return "ThaiBuddhist";
    }

    @Override // j$.time.chrono.m
    public final String T() {
        return "buddhist";
    }

    @Override // j$.time.chrono.m
    public final InterfaceC3540b G(int i2, int i3, int i4) {
        return new J(j$.time.h.h0(i2 - 543, i3, i4));
    }

    @Override // j$.time.chrono.m
    public final InterfaceC3540b A(int i2, int i3) {
        return new J(j$.time.h.k0(i2 - 543, i3));
    }

    @Override // j$.time.chrono.m
    public final InterfaceC3540b q(long j) {
        return new J(j$.time.h.j0(j));
    }

    @Override // j$.time.chrono.m
    public final InterfaceC3540b M() {
        return new J(j$.time.h.J(j$.time.h.g0(j$.time.b.c())));
    }

    @Override // j$.time.chrono.m
    public final InterfaceC3540b t(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof J) {
            return (J) temporalAccessor;
        }
        return new J(j$.time.h.J(temporalAccessor));
    }

    @Override // j$.time.chrono.m
    public final boolean E(long j) {
        return t.d.E(j - 543);
    }

    @Override // j$.time.chrono.m
    public final int w(n nVar, int i2) {
        if (nVar instanceof K) {
            return nVar == K.BE ? i2 : 1 - i2;
        }
        throw new ClassCastException("Era must be BuddhistEra");
    }

    private H() {
    }

    @Override // j$.time.chrono.m
    public final List D() {
        return j$.time.b.b(K.values());
    }

    @Override // j$.time.chrono.m
    public final j$.time.temporal.w W(j$.time.temporal.a aVar) {
        int i2 = G.f43022a[aVar.ordinal()];
        if (i2 == 1) {
            j$.time.temporal.w wVarC = j$.time.temporal.a.PROLEPTIC_MONTH.C();
            return j$.time.temporal.w.j(wVarC.e() + 6516, wVarC.d() + 6516);
        }
        if (i2 == 2) {
            j$.time.temporal.w wVarC2 = j$.time.temporal.a.YEAR.C();
            return j$.time.temporal.w.k(1L, (-(wVarC2.e() + 543)) + 1, wVarC2.d() + 543);
        }
        if (i2 == 3) {
            j$.time.temporal.w wVarC3 = j$.time.temporal.a.YEAR.C();
            return j$.time.temporal.w.j(wVarC3.e() + 543, wVarC3.d() + 543);
        }
        return aVar.C();
    }

    @Override // j$.time.chrono.AbstractC3539a, j$.time.chrono.m
    public final InterfaceC3540b R(Map map, j$.time.format.F f) {
        return (J) super.R(map, f);
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
