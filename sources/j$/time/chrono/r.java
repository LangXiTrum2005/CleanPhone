package j$.time.chrono;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;

/* JADX INFO: loaded from: classes2.dex */
public final class r extends AbstractC3542d {
    private static final long serialVersionUID = -5207853542612002020L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final transient p f43048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final transient int f43049b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final transient int f43050c;
    private final transient int d;

    static r Y(p pVar, int i2, int i3, int i4) {
        return new r(pVar, i2, i3, i4);
    }

    static r b0(p pVar, long j) {
        return new r(pVar, j);
    }

    private r(p pVar, int i2, int i3, int i4) {
        pVar.g0(i2, i3, i4);
        this.f43048a = pVar;
        this.f43049b = i2;
        this.f43050c = i3;
        this.d = i4;
    }

    private r(p pVar, long j) {
        int[] iArrH0 = pVar.h0((int) j);
        this.f43048a = pVar;
        this.f43049b = iArrH0[0];
        this.f43050c = iArrH0[1];
        this.d = iArrH0[2];
    }

    @Override // j$.time.chrono.InterfaceC3540b
    public final m f() {
        return this.f43048a;
    }

    @Override // j$.time.chrono.InterfaceC3540b
    public final n u() {
        return s.AH;
    }

    @Override // j$.time.chrono.InterfaceC3540b
    public final int K() {
        return this.f43048a.j0(this.f43049b);
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
        int i2 = q.f43047a[aVar.ordinal()];
        p pVar = this.f43048a;
        if (i2 == 1) {
            return j$.time.temporal.w.j(1L, pVar.i0(this.f43049b, this.f43050c));
        }
        if (i2 != 2) {
            return i2 != 3 ? pVar.W(aVar) : j$.time.temporal.w.j(1L, 5L);
        }
        return j$.time.temporal.w.j(1L, K());
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long e(j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return rVar.r(this);
        }
        int i2 = q.f43047a[((j$.time.temporal.a) rVar).ordinal()];
        int i3 = this.f43050c;
        int i4 = this.d;
        int i5 = this.f43049b;
        switch (i2) {
            case 1:
                return i4;
            case 2:
                return V();
            case 3:
                return ((i4 - 1) / 7) + 1;
            case 4:
                return ((int) Math.floorMod(v() + 3, 7)) + 1;
            case 5:
                return ((i4 - 1) % 7) + 1;
            case 6:
                return ((V() - 1) % 7) + 1;
            case 7:
                return v();
            case 8:
                return ((V() - 1) / 7) + 1;
            case 9:
                return i3;
            case 10:
                return ((((long) i5) * 12) + ((long) i3)) - 1;
            case 11:
                return i5;
            case 12:
                return i5;
            case 13:
                return i5 <= 1 ? 0 : 1;
            default:
                throw new j$.time.temporal.v(j$.time.d.a("Unsupported field: ", rVar));
        }
    }

    @Override // j$.time.chrono.AbstractC3542d, j$.time.temporal.m
    /* JADX INFO: renamed from: f0, reason: merged with bridge method [inline-methods] */
    public final r h(long j, j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return (r) super.h(j, rVar);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) rVar;
        p pVar = this.f43048a;
        pVar.W(aVar).b(j, aVar);
        int i2 = (int) j;
        int i3 = q.f43047a[aVar.ordinal()];
        int i4 = this.d;
        int i5 = this.f43050c;
        int i6 = this.f43049b;
        switch (i3) {
            case 1:
                return e0(i6, i5, i2);
            case 2:
                return C(Math.min(i2, K()) - V());
            case 3:
                return C((j - e(j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH)) * 7);
            case 4:
                return C(j - ((long) (((int) Math.floorMod(v() + 3, 7)) + 1)));
            case 5:
                return C(j - e(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case 6:
                return C(j - e(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 7:
                return new r(pVar, j);
            case 8:
                return C((j - e(j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR)) * 7);
            case 9:
                return e0(i6, i2, i4);
            case 10:
                return J(j - (((((long) i6) * 12) + ((long) i5)) - 1));
            case 11:
                if (i6 < 1) {
                    i2 = 1 - i2;
                }
                return e0(i2, i5, i4);
            case 12:
                return e0(i2, i5, i4);
            case 13:
                return e0(1 - i6, i5, i4);
            default:
                throw new j$.time.temporal.v(j$.time.d.a("Unsupported field: ", rVar));
        }
    }

    private r e0(int i2, int i3, int i4) {
        p pVar = this.f43048a;
        int iI0 = pVar.i0(i2, i3);
        if (i4 > iI0) {
            i4 = iI0;
        }
        return new r(pVar, i2, i3, i4);
    }

    @Override // j$.time.chrono.AbstractC3542d, j$.time.temporal.m
    /* JADX INFO: renamed from: i */
    public final j$.time.temporal.m m(j$.time.h hVar) {
        return (r) super.m(hVar);
    }

    @Override // j$.time.chrono.AbstractC3542d, j$.time.chrono.InterfaceC3540b
    public final InterfaceC3540b m(j$.time.temporal.n nVar) {
        return (r) super.m(nVar);
    }

    @Override // j$.time.chrono.AbstractC3542d, j$.time.chrono.InterfaceC3540b
    public final InterfaceC3540b N(j$.time.temporal.q qVar) {
        return (r) super.N(qVar);
    }

    @Override // j$.time.chrono.InterfaceC3540b
    public final long v() {
        return this.f43048a.g0(this.f43049b, this.f43050c, this.d);
    }

    private int V() {
        return this.f43048a.f0(this.f43049b, this.f43050c) + this.d;
    }

    @Override // j$.time.chrono.InterfaceC3540b
    public final boolean O() {
        return this.f43048a.E(this.f43049b);
    }

    @Override // j$.time.chrono.AbstractC3542d
    final InterfaceC3540b U(long j) {
        return j == 0 ? this : e0(Math.addExact(this.f43049b, (int) j), this.f43050c, this.d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.time.chrono.AbstractC3542d
    /* JADX INFO: renamed from: d0, reason: merged with bridge method [inline-methods] */
    public final r J(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = (((long) this.f43049b) * 12) + ((long) (this.f43050c - 1)) + j;
        return e0(this.f43048a.c0(Math.floorDiv(j2, 12L)), ((int) Math.floorMod(j2, 12L)) + 1, this.d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.time.chrono.AbstractC3542d
    /* JADX INFO: renamed from: c0, reason: merged with bridge method [inline-methods] */
    public final r C(long j) {
        return new r(this.f43048a, v() + j);
    }

    @Override // j$.time.chrono.AbstractC3542d, j$.time.chrono.InterfaceC3540b, j$.time.temporal.m
    public final InterfaceC3540b l(long j, j$.time.temporal.u uVar) {
        return (r) super.l(j, uVar);
    }

    @Override // j$.time.chrono.AbstractC3542d, j$.time.temporal.m
    public final j$.time.temporal.m l(long j, j$.time.temporal.u uVar) {
        return (r) super.l(j, uVar);
    }

    @Override // j$.time.chrono.AbstractC3542d, j$.time.chrono.InterfaceC3540b, j$.time.temporal.m
    public final InterfaceC3540b c(long j, j$.time.temporal.u uVar) {
        return (r) super.c(j, uVar);
    }

    @Override // j$.time.chrono.AbstractC3542d, j$.time.chrono.InterfaceC3540b, j$.time.temporal.m
    public final j$.time.temporal.m c(long j, j$.time.temporal.u uVar) {
        return (r) super.c(j, uVar);
    }

    @Override // j$.time.chrono.AbstractC3542d, j$.time.chrono.InterfaceC3540b
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof r) {
            r rVar = (r) obj;
            if (this.f43049b == rVar.f43049b && this.f43050c == rVar.f43050c && this.d == rVar.d && this.f43048a.equals(rVar.f43048a)) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.chrono.AbstractC3542d, j$.time.chrono.InterfaceC3540b
    public final int hashCode() {
        this.f43048a.getClass();
        int i2 = this.f43049b;
        return (((i2 << 11) + (this.f43050c << 6)) + this.d) ^ ((i2 & (-2048)) ^ 2100100019);
    }

    @Override // j$.time.chrono.InterfaceC3540b
    public final InterfaceC3543e L(j$.time.k kVar) {
        return C3545g.C(this, kVar);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new F((byte) 6, this);
    }

    final void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeObject(this.f43048a);
        objectOutput.writeInt(g(j$.time.temporal.a.YEAR));
        objectOutput.writeByte(g(j$.time.temporal.a.MONTH_OF_YEAR));
        objectOutput.writeByte(g(j$.time.temporal.a.DAY_OF_MONTH));
    }
}
