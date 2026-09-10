package j$.time.format;

import j$.time.temporal.TemporalAccessor;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
final class p extends j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final j$.time.h f43115h = j$.time.h.h0(2000, 1, 1);
    private final j$.time.h g;

    /* synthetic */ p(j$.time.temporal.r rVar, j$.time.h hVar, int i2) {
        this(rVar, 2, 2, hVar, i2);
    }

    p(j$.time.temporal.r rVar, j$.time.h hVar) {
        this(rVar, 2, 2, hVar, 0);
        if (hVar == null) {
            long j = 0;
            if (!rVar.C().i(j)) {
                throw new IllegalArgumentException("The base value must be within the range of the field");
            }
            if (j + j.f[2] > 2147483647L) {
                throw new j$.time.c("Unable to add printer-parser as the range exceeds the capacity of an int");
            }
        }
    }

    private p(j$.time.temporal.r rVar, int i2, int i3, j$.time.h hVar, int i4) {
        super(rVar, i2, i3, G.NOT_NEGATIVE, i4);
        this.g = hVar;
    }

    @Override // j$.time.format.j
    final long b(z zVar, long j) {
        long jAbs = Math.abs(j);
        j$.time.h hVar = this.g;
        long jG = hVar != null ? j$.time.chrono.m.F(zVar.d()).t(hVar).g(this.f43096a) : 0;
        long[] jArr = j.f;
        if (j >= jG) {
            long j2 = jArr[this.f43097b];
            if (j < jG + j2) {
                return jAbs % j2;
            }
        }
        return jAbs % jArr[this.f43098c];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [j$.time.format.o] */
    @Override // j$.time.format.j
    final int d(w wVar, long j, int i2, int i3) {
        p pVar;
        w wVar2;
        final long j2;
        final int i4;
        final int i5;
        int iG;
        long j3;
        TemporalAccessor temporalAccessor = this.g;
        if (temporalAccessor != null) {
            iG = wVar.h().t(temporalAccessor).g(this.f43096a);
            pVar = this;
            final w wVar3 = wVar;
            j2 = j;
            i4 = i2;
            i5 = i3;
            wVar3.a(new Consumer() { // from class: j$.time.format.o
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    this.f43111a.d(wVar3, j2, i4, i5);
                }
            });
            wVar2 = wVar3;
        } else {
            pVar = this;
            wVar2 = wVar;
            j2 = j;
            i4 = i2;
            i5 = i3;
            iG = 0;
        }
        int i6 = i5 - i4;
        int i7 = pVar.f43097b;
        if (i6 != i7 || j2 < 0) {
            j3 = j2;
        } else {
            long j4 = j.f[i7];
            long j5 = iG;
            long j6 = j5 - (j5 % j4);
            long j7 = iG > 0 ? j6 + j2 : j6 - j2;
            j3 = j7 < j5 ? j7 + j4 : j7;
        }
        return wVar2.o(pVar.f43096a, j3, i4, i5);
    }

    @Override // j$.time.format.j
    final j e() {
        if (this.f43099e == -1) {
            return this;
        }
        return new p(this.f43096a, this.f43097b, this.f43098c, this.g, -1);
    }

    @Override // j$.time.format.j
    final j f(int i2) {
        int i3 = this.f43099e + i2;
        return new p(this.f43096a, this.f43097b, this.f43098c, this.g, i3);
    }

    @Override // j$.time.format.j
    final boolean c(w wVar) {
        if (wVar.l()) {
            return super.c(wVar);
        }
        return false;
    }

    @Override // j$.time.format.j
    public final String toString() {
        j$.time.h hVar = this.g;
        return "ReducedValue(" + this.f43096a + "," + this.f43097b + "," + this.f43098c + "," + (hVar != null ? hVar : 0) + ")";
    }
}
