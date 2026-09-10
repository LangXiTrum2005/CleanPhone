package j$.time.chrono;

import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class z implements n, Serializable {
    public static final z d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final z[] f43058e;
    private static final long serialVersionUID = 1466499369062886794L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final transient int f43059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final transient j$.time.h f43060b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final transient String f43061c;

    static {
        z zVar = new z(-1, j$.time.h.h0(1868, 1, 1), "Meiji");
        d = zVar;
        f43058e = new z[]{zVar, new z(0, j$.time.h.h0(1912, 7, 30), "Taisho"), new z(1, j$.time.h.h0(1926, 12, 25), "Showa"), new z(2, j$.time.h.h0(1989, 1, 8), "Heisei"), new z(3, j$.time.h.h0(2019, 5, 1), "Reiwa")};
    }

    static z r() {
        z[] zVarArr = f43058e;
        return zVarArr[zVarArr.length - 1];
    }

    static long y() {
        int iC0 = 1000000000 - r().f43060b.c0();
        z[] zVarArr = f43058e;
        int iC1 = zVarArr[0].f43060b.c0();
        for (int i2 = 1; i2 < zVarArr.length; i2++) {
            z zVar = zVarArr[i2];
            iC0 = Math.min(iC0, (zVar.f43060b.c0() - iC1) + 1);
            iC1 = zVar.f43060b.c0();
        }
        return iC0;
    }

    static long x() {
        long jF = j$.time.temporal.a.DAY_OF_YEAR.C().f();
        for (z zVar : f43058e) {
            jF = Math.min(jF, (zVar.f43060b.K() - zVar.f43060b.Y()) + 1);
            if (zVar.t() != null) {
                jF = Math.min(jF, zVar.t().f43060b.Y() - 1);
            }
        }
        return jF;
    }

    private z(int i2, j$.time.h hVar, String str) {
        this.f43059a = i2;
        this.f43060b = hVar;
        this.f43061c = str;
    }

    final j$.time.h s() {
        return this.f43060b;
    }

    public static z w(int i2) {
        int i3 = i2 + 1;
        if (i3 >= 0) {
            z[] zVarArr = f43058e;
            if (i3 < zVarArr.length) {
                return zVarArr[i3];
            }
        }
        throw new j$.time.c("Invalid era: " + i2);
    }

    public static z[] A() {
        z[] zVarArr = f43058e;
        return (z[]) Arrays.copyOf(zVarArr, zVarArr.length);
    }

    static z q(j$.time.h hVar) {
        if (hVar.d0(y.d)) {
            throw new j$.time.c("JapaneseDate before Meiji 6 are not supported");
        }
        z[] zVarArr = f43058e;
        for (int length = zVarArr.length - 1; length >= 0; length--) {
            z zVar = zVarArr[length];
            if (hVar.compareTo(zVar.f43060b) >= 0) {
                return zVar;
            }
        }
        return null;
    }

    @Override // j$.time.chrono.n
    public final int p() {
        return this.f43059a;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.w k(j$.time.temporal.r rVar) {
        j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
        if (rVar == aVar) {
            return w.d.W(aVar);
        }
        return super.k(rVar);
    }

    public final String toString() {
        return this.f43061c;
    }

    final z t() {
        if (this == r()) {
            return null;
        }
        return w(this.f43059a + 1);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new F((byte) 5, this);
    }

    final void C(DataOutput dataOutput) throws IOException {
        dataOutput.writeByte(this.f43059a);
    }
}
