package j$.time.chrono;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class D extends AbstractC3542d {
    private static final long serialVersionUID = 1300372329181994526L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final transient j$.time.h f43018a;

    D(j$.time.h hVar) {
        Objects.requireNonNull(hVar, "isoDate");
        this.f43018a = hVar;
    }

    @Override // j$.time.chrono.InterfaceC3540b
    public final m f() {
        return B.d;
    }

    @Override // j$.time.chrono.AbstractC3542d, j$.time.chrono.InterfaceC3540b
    public final int hashCode() {
        B.d.getClass();
        return this.f43018a.hashCode() ^ (-1990173233);
    }

    @Override // j$.time.chrono.InterfaceC3540b
    public final n u() {
        return V() >= 1 ? E.ROC : E.BEFORE_ROC;
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
        int i2 = C.f43017a[aVar.ordinal()];
        if (i2 == 1 || i2 == 2 || i2 == 3) {
            return this.f43018a.k(rVar);
        }
        if (i2 != 4) {
            return B.d.W(aVar);
        }
        j$.time.temporal.w wVarC = j$.time.temporal.a.YEAR.C();
        return j$.time.temporal.w.j(1L, V() <= 0 ? (-wVarC.e()) + 1912 : wVarC.d() - 1911);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long e(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            int i2 = C.f43017a[((j$.time.temporal.a) rVar).ordinal()];
            if (i2 == 4) {
                int iV = V();
                if (iV < 1) {
                    iV = 1 - iV;
                }
                return iV;
            }
            j$.time.h hVar = this.f43018a;
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
        return this.f43018a.c0() - 1911;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004b  */
    /* JADX WARN: Code duplicated, block: B:18:0x005d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x005f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x006a  */
    /* JADX WARN: Code duplicated, block: B:24:0x0079  */
    /* JADX WARN: Code duplicated, block: B:26:0x0084  */
    /* JADX WARN: Code duplicated, block: B:28:0x008b  */
    /* JADX WARN: Code duplicated, block: B:29:0x008e  */
    @Override // j$.time.chrono.AbstractC3542d, j$.time.temporal.m
    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public final D h(long j, j$.time.temporal.r rVar) {
        int iA;
        int i2;
        int i3;
        if (rVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) rVar;
            if (e(aVar) == j) {
                return this;
            }
            int[] iArr = C.f43017a;
            int i4 = iArr[aVar.ordinal()];
            j$.time.h hVar = this.f43018a;
            if (i4 == 4) {
                iA = B.d.W(aVar).a(j, aVar);
                i2 = iArr[aVar.ordinal()];
                if (i2 != 4) {
                    if (V() >= 1) {
                        i3 = iA + 1911;
                    } else {
                        i3 = 1912 - iA;
                    }
                    return b0(hVar.u0(i3));
                }
                if (i2 != 6) {
                    return b0(hVar.u0(iA + 1911));
                }
                if (i2 == 7) {
                    return b0(hVar.u0(1912 - V()));
                }
            } else {
                if (i4 == 5) {
                    B.d.W(aVar).b(j, aVar);
                    return b0(hVar.n0(j - (((((long) V()) * 12) + ((long) hVar.b0())) - 1)));
                }
                if (i4 == 6 || i4 == 7) {
                    iA = B.d.W(aVar).a(j, aVar);
                    i2 = iArr[aVar.ordinal()];
                    if (i2 != 4) {
                        if (V() >= 1) {
                            i3 = iA + 1911;
                        } else {
                            i3 = 1912 - iA;
                        }
                        return b0(hVar.u0(i3));
                    }
                    if (i2 != 6) {
                        return b0(hVar.u0(iA + 1911));
                    }
                    if (i2 == 7) {
                        return b0(hVar.u0(1912 - V()));
                    }
                }
            }
            return b0(hVar.h(j, rVar));
        }
        return (D) super.h(j, rVar);
    }

    @Override // j$.time.chrono.AbstractC3542d, j$.time.temporal.m
    /* JADX INFO: renamed from: i */
    public final j$.time.temporal.m m(j$.time.h hVar) {
        return (D) super.m(hVar);
    }

    @Override // j$.time.chrono.AbstractC3542d, j$.time.chrono.InterfaceC3540b
    public final InterfaceC3540b m(j$.time.temporal.n nVar) {
        return (D) super.m(nVar);
    }

    @Override // j$.time.chrono.AbstractC3542d, j$.time.chrono.InterfaceC3540b
    public final InterfaceC3540b N(j$.time.temporal.q qVar) {
        return (D) super.N(qVar);
    }

    @Override // j$.time.chrono.AbstractC3542d
    final InterfaceC3540b U(long j) {
        return b0(this.f43018a.p0(j));
    }

    @Override // j$.time.chrono.AbstractC3542d
    final InterfaceC3540b J(long j) {
        return b0(this.f43018a.n0(j));
    }

    @Override // j$.time.chrono.AbstractC3542d
    final InterfaceC3540b C(long j) {
        return b0(this.f43018a.m0(j));
    }

    @Override // j$.time.chrono.AbstractC3542d, j$.time.chrono.InterfaceC3540b, j$.time.temporal.m
    public final InterfaceC3540b l(long j, j$.time.temporal.u uVar) {
        return (D) super.l(j, uVar);
    }

    @Override // j$.time.chrono.AbstractC3542d, j$.time.temporal.m
    public final j$.time.temporal.m l(long j, j$.time.temporal.u uVar) {
        return (D) super.l(j, uVar);
    }

    @Override // j$.time.chrono.AbstractC3542d, j$.time.chrono.InterfaceC3540b, j$.time.temporal.m
    public final InterfaceC3540b c(long j, j$.time.temporal.u uVar) {
        return (D) super.c(j, uVar);
    }

    @Override // j$.time.chrono.AbstractC3542d, j$.time.chrono.InterfaceC3540b, j$.time.temporal.m
    public final j$.time.temporal.m c(long j, j$.time.temporal.u uVar) {
        return (D) super.c(j, uVar);
    }

    private D b0(j$.time.h hVar) {
        return hVar.equals(this.f43018a) ? this : new D(hVar);
    }

    @Override // j$.time.chrono.InterfaceC3540b
    public final long v() {
        return this.f43018a.v();
    }

    @Override // j$.time.chrono.AbstractC3542d, j$.time.chrono.InterfaceC3540b
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof D) {
            return this.f43018a.equals(((D) obj).f43018a);
        }
        return false;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new F((byte) 7, this);
    }

    @Override // j$.time.chrono.InterfaceC3540b
    public final InterfaceC3543e L(j$.time.k kVar) {
        return C3545g.C(this, kVar);
    }
}
