package j$.time.chrono;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class J extends AbstractC3542d {
    private static final long serialVersionUID = -8722293800195731463L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final transient j$.time.h f43024a;

    J(j$.time.h hVar) {
        Objects.requireNonNull(hVar, "isoDate");
        this.f43024a = hVar;
    }

    @Override // j$.time.chrono.InterfaceC3540b
    public final m f() {
        return H.d;
    }

    @Override // j$.time.chrono.AbstractC3542d, j$.time.chrono.InterfaceC3540b
    public final int hashCode() {
        H.d.getClass();
        return this.f43024a.hashCode() ^ 146118545;
    }

    @Override // j$.time.chrono.InterfaceC3540b
    public final n u() {
        return V() >= 1 ? K.BE : K.BEFORE_BE;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.w k(j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return rVar.J(this);
        }
        if (!d(rVar)) {
            throw new j$.time.temporal.v(j$.time.d.a("Unsupported field: ", rVar));
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) rVar;
        int i2 = I.f43023a[aVar.ordinal()];
        if (i2 == 1 || i2 == 2 || i2 == 3) {
            return this.f43024a.k(rVar);
        }
        if (i2 != 4) {
            return H.d.W(aVar);
        }
        j$.time.temporal.w wVarC = j$.time.temporal.a.YEAR.C();
        return j$.time.temporal.w.j(1L, V() <= 0 ? (-(wVarC.e() + 543)) + 1 : 543 + wVarC.d());
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long e(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            int i2 = I.f43023a[((j$.time.temporal.a) rVar).ordinal()];
            if (i2 == 4) {
                int iV = V();
                if (iV < 1) {
                    iV = 1 - iV;
                }
                return iV;
            }
            j$.time.h hVar = this.f43024a;
            if (i2 == 5) {
                return ((((long) V()) * 12) + ((long) hVar.b0())) - 1;
            }
            if (i2 == 6) {
                return V();
            }
            if (i2 != 7) {
                return hVar.e(rVar);
            }
            return V() < 1 ? 0 : 1;
        }
        return rVar.r(this);
    }

    private int V() {
        return this.f43024a.c0() + 543;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004b  */
    /* JADX WARN: Code duplicated, block: B:18:0x005d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x005f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x006a  */
    /* JADX WARN: Code duplicated, block: B:24:0x0079  */
    /* JADX WARN: Code duplicated, block: B:26:0x0084  */
    /* JADX WARN: Code duplicated, block: B:29:0x008c  */
    @Override // j$.time.chrono.AbstractC3542d, j$.time.temporal.m
    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public final J h(long j, j$.time.temporal.r rVar) {
        int iA;
        int i2;
        if (rVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) rVar;
            if (e(aVar) == j) {
                return this;
            }
            int[] iArr = I.f43023a;
            int i3 = iArr[aVar.ordinal()];
            j$.time.h hVar = this.f43024a;
            if (i3 == 4) {
                iA = H.d.W(aVar).a(j, aVar);
                i2 = iArr[aVar.ordinal()];
                if (i2 != 4) {
                    if (V() < 1) {
                        iA = 1 - iA;
                    }
                    return b0(hVar.u0(iA - 543));
                }
                if (i2 != 6) {
                    return b0(hVar.u0(iA - 543));
                }
                if (i2 == 7) {
                    return b0(hVar.u0((-542) - V()));
                }
            } else {
                if (i3 == 5) {
                    H.d.W(aVar).b(j, aVar);
                    return b0(hVar.n0(j - (((((long) V()) * 12) + ((long) hVar.b0())) - 1)));
                }
                if (i3 == 6 || i3 == 7) {
                    iA = H.d.W(aVar).a(j, aVar);
                    i2 = iArr[aVar.ordinal()];
                    if (i2 != 4) {
                        if (V() < 1) {
                            iA = 1 - iA;
                        }
                        return b0(hVar.u0(iA - 543));
                    }
                    if (i2 != 6) {
                        return b0(hVar.u0(iA - 543));
                    }
                    if (i2 == 7) {
                        return b0(hVar.u0((-542) - V()));
                    }
                }
            }
            return b0(hVar.h(j, rVar));
        }
        return (J) super.h(j, rVar);
    }

    @Override // j$.time.chrono.AbstractC3542d, j$.time.temporal.m
    /* JADX INFO: renamed from: i */
    public final j$.time.temporal.m m(j$.time.h hVar) {
        return (J) super.m(hVar);
    }

    @Override // j$.time.chrono.AbstractC3542d, j$.time.chrono.InterfaceC3540b
    public final InterfaceC3540b m(j$.time.temporal.n nVar) {
        return (J) super.m(nVar);
    }

    @Override // j$.time.chrono.AbstractC3542d, j$.time.chrono.InterfaceC3540b
    public final InterfaceC3540b N(j$.time.temporal.q qVar) {
        return (J) super.N(qVar);
    }

    @Override // j$.time.chrono.AbstractC3542d
    final InterfaceC3540b U(long j) {
        return b0(this.f43024a.p0(j));
    }

    @Override // j$.time.chrono.AbstractC3542d
    final InterfaceC3540b J(long j) {
        return b0(this.f43024a.n0(j));
    }

    @Override // j$.time.chrono.AbstractC3542d
    final InterfaceC3540b C(long j) {
        return b0(this.f43024a.m0(j));
    }

    @Override // j$.time.chrono.AbstractC3542d, j$.time.chrono.InterfaceC3540b, j$.time.temporal.m
    public final InterfaceC3540b l(long j, j$.time.temporal.u uVar) {
        return (J) super.l(j, uVar);
    }

    @Override // j$.time.chrono.AbstractC3542d, j$.time.temporal.m
    public final j$.time.temporal.m l(long j, j$.time.temporal.u uVar) {
        return (J) super.l(j, uVar);
    }

    @Override // j$.time.chrono.AbstractC3542d, j$.time.chrono.InterfaceC3540b, j$.time.temporal.m
    public final InterfaceC3540b c(long j, j$.time.temporal.u uVar) {
        return (J) super.c(j, uVar);
    }

    @Override // j$.time.chrono.AbstractC3542d, j$.time.chrono.InterfaceC3540b, j$.time.temporal.m
    public final j$.time.temporal.m c(long j, j$.time.temporal.u uVar) {
        return (J) super.c(j, uVar);
    }

    private J b0(j$.time.h hVar) {
        return hVar.equals(this.f43024a) ? this : new J(hVar);
    }

    @Override // j$.time.chrono.InterfaceC3540b
    public final long v() {
        return this.f43024a.v();
    }

    @Override // j$.time.chrono.AbstractC3542d, j$.time.chrono.InterfaceC3540b
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof J) {
            return this.f43024a.equals(((J) obj).f43024a);
        }
        return false;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new F((byte) 8, this);
    }

    @Override // j$.time.chrono.InterfaceC3540b
    public final InterfaceC3543e L(j$.time.k kVar) {
        return C3545g.C(this, kVar);
    }
}
