package j$.time.chrono;

import com.google.android.gms.ads.RequestConfiguration;
import j$.time.ZoneId;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: renamed from: j$.time.chrono.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C3545g implements InterfaceC3543e, j$.time.temporal.m, j$.time.temporal.n, Serializable {
    private static final long serialVersionUID = 4556003607393004514L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final transient InterfaceC3540b f43031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final transient j$.time.k f43032b;

    static C3545g C(InterfaceC3540b interfaceC3540b, j$.time.k kVar) {
        return new C3545g(interfaceC3540b, kVar);
    }

    static C3545g r(m mVar, j$.time.temporal.m mVar2) {
        C3545g c3545g = (C3545g) mVar2;
        if (mVar.equals(c3545g.f())) {
            return c3545g;
        }
        throw new ClassCastException("Chronology mismatch, required: " + mVar.s() + ", actual: " + c3545g.f().s());
    }

    private C3545g(InterfaceC3540b interfaceC3540b, j$.time.k kVar) {
        Objects.requireNonNull(kVar, "time");
        this.f43031a = interfaceC3540b;
        this.f43032b = kVar;
    }

    private C3545g b0(j$.time.temporal.m mVar, j$.time.k kVar) {
        InterfaceC3540b interfaceC3540b = this.f43031a;
        return (interfaceC3540b == mVar && this.f43032b == kVar) ? this : new C3545g(AbstractC3542d.r(interfaceC3540b.f(), mVar), kVar);
    }

    @Override // j$.time.chrono.InterfaceC3543e
    public final InterfaceC3540b o() {
        return this.f43031a;
    }

    @Override // j$.time.chrono.InterfaceC3543e
    public final j$.time.k n() {
        return this.f43032b;
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
            return (((j$.time.temporal.a) rVar).d0() ? this.f43032b : this.f43031a).k(rVar);
        }
        return rVar.J(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int g(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) rVar).d0() ? this.f43032b.g(rVar) : this.f43031a.g(rVar);
        }
        return k(rVar).a(e(rVar), rVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long e(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) rVar).d0() ? this.f43032b.e(rVar) : this.f43031a.e(rVar);
        }
        return rVar.r(this);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: i */
    public final j$.time.temporal.m m(j$.time.h hVar) {
        return b0(hVar, this.f43032b);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public final C3545g h(long j, j$.time.temporal.r rVar) {
        boolean z2 = rVar instanceof j$.time.temporal.a;
        InterfaceC3540b interfaceC3540b = this.f43031a;
        if (z2) {
            boolean zD0 = ((j$.time.temporal.a) rVar).d0();
            j$.time.k kVar = this.f43032b;
            if (zD0) {
                return b0(interfaceC3540b, kVar.h(j, rVar));
            }
            return b0(interfaceC3540b.h(j, rVar), kVar);
        }
        return r(interfaceC3540b.f(), rVar.p(this, j));
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public final C3545g l(long j, j$.time.temporal.u uVar) {
        boolean z2 = uVar instanceof j$.time.temporal.b;
        InterfaceC3540b interfaceC3540b = this.f43031a;
        if (z2) {
            int i2 = AbstractC3544f.f43030a[((j$.time.temporal.b) uVar).ordinal()];
            j$.time.k kVar = this.f43032b;
            switch (i2) {
                case 1:
                    return V(this.f43031a, 0L, 0L, 0L, j);
                case 2:
                    C3545g c3545gB0 = b0(interfaceC3540b.l(j / 86400000000L, (j$.time.temporal.u) j$.time.temporal.b.DAYS), kVar);
                    return c3545gB0.V(c3545gB0.f43031a, 0L, 0L, 0L, (j % 86400000000L) * 1000);
                case 3:
                    C3545g c3545gB1 = b0(interfaceC3540b.l(j / 86400000, (j$.time.temporal.u) j$.time.temporal.b.DAYS), kVar);
                    return c3545gB1.V(c3545gB1.f43031a, 0L, 0L, 0L, (j % 86400000) * 1000000);
                case 4:
                    return U(j);
                case 5:
                    return V(this.f43031a, 0L, j, 0L, 0L);
                case 6:
                    return V(this.f43031a, j, 0L, 0L, 0L);
                case 7:
                    C3545g c3545gB2 = b0(interfaceC3540b.l(j / 256, (j$.time.temporal.u) j$.time.temporal.b.DAYS), kVar);
                    return c3545gB2.V(c3545gB2.f43031a, (j % 256) * 12, 0L, 0L, 0L);
                default:
                    return b0(interfaceC3540b.l(j, uVar), kVar);
            }
        }
        return r(interfaceC3540b.f(), uVar.p(this, j));
    }

    final C3545g U(long j) {
        return V(this.f43031a, 0L, 0L, j, 0L);
    }

    private C3545g V(InterfaceC3540b interfaceC3540b, long j, long j2, long j3, long j4) {
        long j5 = j | j2 | j3 | j4;
        j$.time.k kVarE0 = this.f43032b;
        if (j5 == 0) {
            return b0(interfaceC3540b, kVarE0);
        }
        long j6 = j2 / 1440;
        long j7 = j / 24;
        long j8 = (j2 % 1440) * 60000000000L;
        long j9 = ((j % 24) * 3600000000000L) + j8 + ((j3 % 86400) * 1000000000) + (j4 % 86400000000000L);
        long jM0 = kVarE0.m0();
        long j10 = j9 + jM0;
        long jFloorDiv = Math.floorDiv(j10, 86400000000000L) + j7 + j6 + (j3 / 86400) + (j4 / 86400000000000L);
        long jFloorMod = Math.floorMod(j10, 86400000000000L);
        if (jFloorMod != jM0) {
            kVarE0 = j$.time.k.e0(jFloorMod);
        }
        return b0(interfaceC3540b.l(jFloorDiv, (j$.time.temporal.u) j$.time.temporal.b.DAYS), kVarE0);
    }

    @Override // j$.time.chrono.InterfaceC3543e
    public final InterfaceC3548j H(ZoneId zoneId) {
        return l.C(zoneId, null, this);
    }

    private Object writeReplace() {
        return new F((byte) 2, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    final void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeObject(this.f43031a);
        objectOutput.writeObject(this.f43032b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InterfaceC3543e) && compareTo((InterfaceC3543e) obj) == 0;
    }

    public final int hashCode() {
        return this.f43031a.hashCode() ^ this.f43032b.hashCode();
    }

    public final String toString() {
        return this.f43031a.toString() + RequestConfiguration.MAX_AD_CONTENT_RATING_T + this.f43032b.toString();
    }
}
