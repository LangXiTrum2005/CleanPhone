package j$.time.chrono;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class y extends AbstractC3542d {
    static final j$.time.h d = j$.time.h.h0(1873, 1, 1);
    private static final long serialVersionUID = -305327627230580483L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final transient j$.time.h f43055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient z f43056b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private transient int f43057c;

    y(j$.time.h hVar) {
        if (hVar.d0(d)) {
            throw new j$.time.c("JapaneseDate before Meiji 6 is not supported");
        }
        z zVarQ = z.q(hVar);
        this.f43056b = zVarQ;
        this.f43057c = (hVar.c0() - zVarQ.s().c0()) + 1;
        this.f43055a = hVar;
    }

    y(z zVar, int i2, j$.time.h hVar) {
        if (hVar.d0(d)) {
            throw new j$.time.c("JapaneseDate before Meiji 6 is not supported");
        }
        this.f43056b = zVar;
        this.f43057c = i2;
        this.f43055a = hVar;
    }

    @Override // j$.time.chrono.InterfaceC3540b
    public final m f() {
        return w.d;
    }

    @Override // j$.time.chrono.AbstractC3542d, j$.time.chrono.InterfaceC3540b
    public final int hashCode() {
        w.d.getClass();
        return this.f43055a.hashCode() ^ (-688086063);
    }

    public final z V() {
        return this.f43056b;
    }

    @Override // j$.time.chrono.InterfaceC3540b
    public final n u() {
        return this.f43056b;
    }

    @Override // j$.time.chrono.InterfaceC3540b
    public final int K() {
        int iK;
        z zVar = this.f43056b;
        z zVarT = zVar.t();
        j$.time.h hVar = this.f43055a;
        if (zVarT != null && zVarT.s().c0() == hVar.c0()) {
            iK = zVarT.s().Y() - 1;
        } else {
            iK = hVar.K();
        }
        return this.f43057c == 1 ? iK - (zVar.s().Y() - 1) : iK;
    }

    @Override // j$.time.chrono.InterfaceC3540b, j$.time.temporal.TemporalAccessor
    public final boolean d(j$.time.temporal.r rVar) {
        if (rVar == j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH || rVar == j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR || rVar == j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH || rVar == j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR) {
            return false;
        }
        if (rVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) rVar).V();
        }
        return rVar != null && rVar.Y(this);
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
        int i2 = x.f43054a[aVar.ordinal()];
        if (i2 == 1) {
            return j$.time.temporal.w.j(1L, this.f43055a.e0());
        }
        if (i2 == 2) {
            return j$.time.temporal.w.j(1L, K());
        }
        if (i2 != 3) {
            return w.d.W(aVar);
        }
        z zVar = this.f43056b;
        int iC0 = zVar.s().c0();
        z zVarT = zVar.t();
        return zVarT != null ? j$.time.temporal.w.j(1L, (zVarT.s().c0() - iC0) + 1) : j$.time.temporal.w.j(1L, 999999999 - iC0);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long e(j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return rVar.r(this);
        }
        int i2 = x.f43054a[((j$.time.temporal.a) rVar).ordinal()];
        int i3 = this.f43057c;
        z zVar = this.f43056b;
        j$.time.h hVar = this.f43055a;
        switch (i2) {
            case 2:
                return i3 == 1 ? (hVar.Y() - zVar.s().Y()) + 1 : hVar.Y();
            case 3:
                return i3;
            case 4:
            case 5:
            case 6:
            case 7:
                throw new j$.time.temporal.v(j$.time.d.a("Unsupported field: ", rVar));
            case 8:
                return zVar.p();
            default:
                return hVar.e(rVar);
        }
    }

    @Override // j$.time.chrono.AbstractC3542d, j$.time.temporal.m
    /* JADX INFO: renamed from: b0, reason: merged with bridge method [inline-methods] */
    public final y h(long j, j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) rVar;
            if (e(aVar) == j) {
                return this;
            }
            int[] iArr = x.f43054a;
            int i2 = iArr[aVar.ordinal()];
            j$.time.h hVar = this.f43055a;
            if (i2 == 3 || i2 == 8 || i2 == 9) {
                w wVar = w.d;
                int iA = wVar.W(aVar).a(j, aVar);
                int i3 = iArr[aVar.ordinal()];
                if (i3 == 3) {
                    return c0(hVar.u0(wVar.w(this.f43056b, iA)));
                }
                if (i3 == 8) {
                    return c0(hVar.u0(wVar.w(z.w(iA), this.f43057c)));
                }
                if (i3 == 9) {
                    return c0(hVar.u0(iA));
                }
            }
            return c0(hVar.h(j, rVar));
        }
        return (y) super.h(j, rVar);
    }

    public final y d0(j$.time.temporal.p pVar) {
        return (y) super.m(pVar);
    }

    @Override // j$.time.chrono.AbstractC3542d, j$.time.temporal.m
    /* JADX INFO: renamed from: i */
    public final j$.time.temporal.m m(j$.time.h hVar) {
        return (y) super.m(hVar);
    }

    @Override // j$.time.chrono.AbstractC3542d, j$.time.chrono.InterfaceC3540b
    public final InterfaceC3540b m(j$.time.temporal.n nVar) {
        return (y) super.m(nVar);
    }

    @Override // j$.time.chrono.AbstractC3542d, j$.time.chrono.InterfaceC3540b
    public final InterfaceC3540b N(j$.time.temporal.q qVar) {
        return (y) super.N(qVar);
    }

    @Override // j$.time.chrono.InterfaceC3540b
    public final InterfaceC3543e L(j$.time.k kVar) {
        return C3545g.C(this, kVar);
    }

    @Override // j$.time.chrono.AbstractC3542d
    final InterfaceC3540b U(long j) {
        return c0(this.f43055a.p0(j));
    }

    @Override // j$.time.chrono.AbstractC3542d
    final InterfaceC3540b J(long j) {
        return c0(this.f43055a.n0(j));
    }

    @Override // j$.time.chrono.AbstractC3542d
    final InterfaceC3540b C(long j) {
        return c0(this.f43055a.m0(j));
    }

    public final y Y(long j, j$.time.temporal.b bVar) {
        return (y) super.l(j, (j$.time.temporal.u) bVar);
    }

    @Override // j$.time.chrono.AbstractC3542d, j$.time.chrono.InterfaceC3540b, j$.time.temporal.m
    public final InterfaceC3540b l(long j, j$.time.temporal.u uVar) {
        return (y) super.l(j, uVar);
    }

    @Override // j$.time.chrono.AbstractC3542d, j$.time.temporal.m
    public final j$.time.temporal.m l(long j, j$.time.temporal.u uVar) {
        return (y) super.l(j, uVar);
    }

    @Override // j$.time.chrono.AbstractC3542d, j$.time.chrono.InterfaceC3540b, j$.time.temporal.m
    public final InterfaceC3540b c(long j, j$.time.temporal.u uVar) {
        return (y) super.c(j, uVar);
    }

    @Override // j$.time.chrono.AbstractC3542d, j$.time.chrono.InterfaceC3540b, j$.time.temporal.m
    public final j$.time.temporal.m c(long j, j$.time.temporal.u uVar) {
        return (y) super.c(j, uVar);
    }

    private y c0(j$.time.h hVar) {
        return hVar.equals(this.f43055a) ? this : new y(hVar);
    }

    @Override // j$.time.chrono.InterfaceC3540b
    public final long v() {
        return this.f43055a.v();
    }

    @Override // j$.time.chrono.AbstractC3542d, j$.time.chrono.InterfaceC3540b
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof y) {
            return this.f43055a.equals(((y) obj).f43055a);
        }
        return false;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new F((byte) 4, this);
    }
}
