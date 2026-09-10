package com.smartdigimkt.l4;

import android.util.Log;
import com.smartdigimkt.j4.x;
import com.smartdigimkt.j4.y;
import com.smartdigimkt.j4.z;
import com.smartdigimkt.l4.g;
import com.smartdigimkt.n4.t;
import com.smartdigimkt.p4.f0;
import com.smartdigimkt.w3.c0;
import com.smartdigimkt.w3.m;
import com.smartdigimkt.w3.n;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class f<T extends g> implements y, z, t.a<c>, t.d {
    private static final String w0 = "ChunkSampleStream";
    public final int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private final int[] f36352Y;
    private final m[] Z;
    private final boolean[] e0;
    private final T f0;
    private final z.a<f<T>> g0;
    private final com.smartdigimkt.j4.t.a h0;
    private final int i0;
    private final t j0 = new t("Loader:ChunkSampleStream");
    private final e k0 = new e();
    private final ArrayList<com.smartdigimkt.l4.a> l0;
    private final List<com.smartdigimkt.l4.a> m0;
    private final x n0;
    private final x[] o0;
    private final com.smartdigimkt.l4.b p0;
    private m q0;
    private b<T> r0;
    private long s0;
    private long t0;
    long u0;
    boolean v0;

    public final class a implements y {
        public final f<T> X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        private final x f36353Y;
        private final int Z;
        private boolean e0;

        public a(f<T> fVar, x xVar, int i2) {
            this.X = fVar;
            this.f36353Y = xVar;
            this.Z = i2;
        }

        private void b() {
            if (this.e0) {
                return;
            }
            f.this.h0.a(f.this.f36352Y[this.Z], f.this.Z[this.Z], 0, (Object) null, f.this.t0);
            this.e0 = true;
        }

        @Override // com.smartdigimkt.j4.y
        public void a() throws IOException {
        }

        public void c() {
            com.smartdigimkt.p4.a.b(f.this.e0[this.Z]);
            f.this.e0[this.Z] = false;
        }

        @Override // com.smartdigimkt.j4.y
        public int d(long j) {
            int iA;
            if (!f.this.v0 || j <= this.f36353Y.f()) {
                iA = this.f36353Y.a(j, true, true);
                if (iA == -1) {
                    iA = 0;
                }
            } else {
                iA = this.f36353Y.a();
            }
            if (iA > 0) {
                b();
            }
            return iA;
        }

        @Override // com.smartdigimkt.j4.y
        public boolean isReady() {
            f fVar = f.this;
            if (fVar.v0) {
                return true;
            }
            return !fVar.j() && this.f36353Y.j();
        }

        @Override // com.smartdigimkt.j4.y
        public int a(n nVar, com.smartdigimkt.z3.e eVar, boolean z2) {
            if (f.this.j()) {
                return -3;
            }
            x xVar = this.f36353Y;
            f fVar = f.this;
            int iA = xVar.a(nVar, eVar, z2, fVar.v0, fVar.u0);
            if (iA == -4) {
                b();
            }
            return iA;
        }
    }

    public interface b<T extends g> {
        void a(f<T> fVar);
    }

    public f(int i2, int[] iArr, m[] mVarArr, T t, z.a<f<T>> aVar, com.smartdigimkt.n4.b bVar, long j, int i3, com.smartdigimkt.j4.t.a aVar2) {
        this.X = i2;
        this.f36352Y = iArr;
        this.Z = mVarArr;
        this.f0 = t;
        this.g0 = aVar;
        this.h0 = aVar2;
        this.i0 = i3;
        ArrayList<com.smartdigimkt.l4.a> arrayList = new ArrayList<>();
        this.l0 = arrayList;
        this.m0 = Collections.unmodifiableList(arrayList);
        int i4 = 0;
        int length = iArr == null ? 0 : iArr.length;
        this.o0 = new x[length];
        this.e0 = new boolean[length];
        int i5 = length + 1;
        int[] iArr2 = new int[i5];
        x[] xVarArr = new x[i5];
        x xVar = new x(bVar);
        this.n0 = xVar;
        iArr2[0] = i2;
        xVarArr[0] = xVar;
        while (i4 < length) {
            x xVar2 = new x(bVar);
            this.o0[i4] = xVar2;
            int i6 = i4 + 1;
            xVarArr[i6] = xVar2;
            iArr2[i6] = iArr[i4];
            i4 = i6;
        }
        this.p0 = new com.smartdigimkt.l4.b(iArr2, xVarArr);
        this.s0 = j;
        this.t0 = j;
    }

    private com.smartdigimkt.l4.a i() {
        return (com.smartdigimkt.l4.a) android.support.v4.media.a.d(1, this.l0);
    }

    public T h() {
        return this.f0;
    }

    @Override // com.smartdigimkt.j4.y
    public boolean isReady() {
        if (this.v0) {
            return true;
        }
        return !j() && this.n0.j();
    }

    public boolean j() {
        return this.s0 != -9223372036854775807L;
    }

    public void k() {
        a((b) null);
    }

    @Override // com.smartdigimkt.j4.z
    public long b() {
        if (j()) {
            return this.s0;
        }
        if (this.v0) {
            return Long.MIN_VALUE;
        }
        return i().g;
    }

    @Override // com.smartdigimkt.j4.z
    public long c() {
        if (this.v0) {
            return Long.MIN_VALUE;
        }
        if (j()) {
            return this.s0;
        }
        long jMax = this.t0;
        com.smartdigimkt.l4.a aVarI = i();
        if (!aVarI.f()) {
            aVarI = this.l0.size() > 1 ? (com.smartdigimkt.l4.a) android.support.v4.media.a.d(2, this.l0) : null;
        }
        if (aVarI != null) {
            jMax = Math.max(jMax, aVarI.g);
        }
        return Math.max(jMax, this.n0.f());
    }

    @Override // com.smartdigimkt.n4.t.d
    public void d() {
        this.n0.l();
        for (x xVar : this.o0) {
            xVar.l();
        }
        b<T> bVar = this.r0;
        if (bVar != null) {
            bVar.a(this);
        }
    }

    public void e(long j) {
        com.smartdigimkt.l4.a aVar;
        boolean zD;
        this.t0 = j;
        this.n0.m();
        if (!j()) {
            int i2 = 0;
            while (true) {
                if (i2 < this.l0.size()) {
                    aVar = this.l0.get(i2);
                    long j2 = aVar.f;
                    if (j2 == j && aVar.j == -9223372036854775807L) {
                        break;
                    } else if (j2 <= j) {
                        i2++;
                    }
                }
                aVar = null;
                break;
            }
            if (aVar != null) {
                zD = this.n0.d(aVar.a(0));
                this.u0 = Long.MIN_VALUE;
            } else {
                zD = this.n0.a(j, true, (j > b() ? 1 : (j == b() ? 0 : -1)) < 0) != -1;
                this.u0 = this.t0;
            }
            if (zD) {
                for (x xVar : this.o0) {
                    xVar.m();
                    xVar.a(j, true, false);
                }
                return;
            }
        }
        this.s0 = j;
        this.v0 = false;
        this.l0.clear();
        if (this.j0.c()) {
            this.j0.b();
            return;
        }
        this.n0.l();
        for (x xVar2 : this.o0) {
            xVar2.l();
        }
    }

    public void a(long j, boolean z2) {
        int iD = this.n0.d();
        this.n0.b(j, z2, true);
        int iD2 = this.n0.d();
        if (iD2 <= iD) {
            return;
        }
        long jE = this.n0.e();
        int i2 = 0;
        while (true) {
            x[] xVarArr = this.o0;
            if (i2 < xVarArr.length) {
                xVarArr[i2].b(jE, z2, this.e0[i2]);
                i2++;
            } else {
                a(iD2);
                return;
            }
        }
    }

    @Override // com.smartdigimkt.j4.z
    public void b(long j) {
        int size;
        int iA;
        if (this.j0.c() || j() || (size = this.l0.size()) <= (iA = this.f0.a(j, this.m0))) {
            return;
        }
        while (true) {
            if (iA >= size) {
                iA = size;
                break;
            } else if (!c(iA)) {
                break;
            } else {
                iA++;
            }
        }
        if (iA == size) {
            return;
        }
        long j2 = i().g;
        com.smartdigimkt.l4.a aVarB = b(iA);
        if (this.l0.isEmpty()) {
            this.s0 = this.t0;
        }
        this.v0 = false;
        this.h0.a(this.X, aVarB.f, j2);
    }

    @Override // com.smartdigimkt.j4.y
    public int d(long j) {
        int iA = 0;
        if (j()) {
            return 0;
        }
        if (this.v0 && j > this.n0.f()) {
            iA = this.n0.a();
        } else {
            int iA2 = this.n0.a(j, true, true);
            if (iA2 != -1) {
                iA = iA2;
            }
        }
        if (iA > 0) {
            a(this.n0.g(), iA);
        }
        return iA;
    }

    private void d(int i2) {
        com.smartdigimkt.l4.a aVar = this.l0.get(i2);
        m mVar = aVar.f36342c;
        if (!mVar.equals(this.q0)) {
            this.h0.a(this.X, mVar, aVar.d, aVar.f36343e, aVar.f);
        }
        this.q0 = mVar;
    }

    public f<T>.a a(long j, int i2) {
        for (int i3 = 0; i3 < this.o0.length; i3++) {
            if (this.f36352Y[i3] == i2) {
                com.smartdigimkt.p4.a.b(!this.e0[i3]);
                this.e0[i3] = true;
                this.o0[i3].m();
                this.o0[i3].a(j, true, true);
                return new a(this, this.o0[i3], i3);
            }
        }
        throw new IllegalStateException();
    }

    private int b(int i2, int i3) {
        do {
            i3++;
            if (i3 >= this.l0.size()) {
                return this.l0.size() - 1;
            }
        } while (this.l0.get(i3).a(0) <= i2);
        return i3 - 1;
    }

    private boolean c(int i2) {
        int iG;
        com.smartdigimkt.l4.a aVar = this.l0.get(i2);
        if (this.n0.g() > aVar.a(0)) {
            return true;
        }
        int i3 = 0;
        do {
            x[] xVarArr = this.o0;
            if (i3 >= xVarArr.length) {
                return false;
            }
            iG = xVarArr[i3].g();
            i3++;
        } while (iG <= aVar.a(i3));
        return true;
    }

    private com.smartdigimkt.l4.a b(int i2) {
        com.smartdigimkt.l4.a aVar = this.l0.get(i2);
        ArrayList<com.smartdigimkt.l4.a> arrayList = this.l0;
        f0.a((List) arrayList, i2, arrayList.size());
        int i3 = 0;
        this.n0.a(aVar.a(0));
        while (true) {
            x[] xVarArr = this.o0;
            if (i3 >= xVarArr.length) {
                return aVar;
            }
            x xVar = xVarArr[i3];
            i3++;
            xVar.a(aVar.a(i3));
        }
    }

    public long a(long j, c0 c0Var) {
        return this.f0.a(j, c0Var);
    }

    public void a(b<T> bVar) {
        this.r0 = bVar;
        this.n0.b();
        for (x xVar : this.o0) {
            xVar.b();
        }
        this.j0.a(this);
    }

    @Override // com.smartdigimkt.j4.y
    public void a() throws IOException {
        this.j0.a();
        if (this.j0.c()) {
            return;
        }
        this.f0.a();
    }

    @Override // com.smartdigimkt.j4.y
    public int a(n nVar, com.smartdigimkt.z3.e eVar, boolean z2) {
        if (j()) {
            return -3;
        }
        int iA = this.n0.a(nVar, eVar, z2, this.v0, this.u0);
        if (iA == -4) {
            a(this.n0.g(), 1);
        }
        return iA;
    }

    @Override // com.smartdigimkt.n4.t.a
    public void a(c cVar, long j, long j2) {
        this.f0.a(cVar);
        this.h0.b(cVar.f36340a, cVar.f36341b, this.X, cVar.f36342c, cVar.d, cVar.f36343e, cVar.f, cVar.g, j, j2, cVar.c());
        this.g0.a(this);
    }

    @Override // com.smartdigimkt.n4.t.a
    public void a(c cVar, long j, long j2, boolean z2) {
        this.h0.a(cVar.f36340a, cVar.f36341b, this.X, cVar.f36342c, cVar.d, cVar.f36343e, cVar.f, cVar.g, j, j2, cVar.c());
        if (z2) {
            return;
        }
        this.n0.l();
        for (x xVar : this.o0) {
            xVar.l();
        }
        this.g0.a(this);
    }

    @Override // com.smartdigimkt.n4.t.a
    public int a(c cVar, long j, long j2, IOException iOException) {
        boolean z2;
        long jC = cVar.c();
        boolean zA = a(cVar);
        int size = this.l0.size() - 1;
        boolean z3 = (jC != 0 && zA && c(size)) ? false : true;
        if (!this.f0.a(cVar, z3, iOException)) {
            z2 = false;
        } else if (z3) {
            if (zA) {
                com.smartdigimkt.p4.a.b(b(size) == cVar);
                if (this.l0.isEmpty()) {
                    this.s0 = this.t0;
                }
            }
            z2 = true;
        } else {
            Log.w(w0, "Ignoring attempt to cancel non-cancelable load.");
            z2 = false;
        }
        this.h0.a(cVar.f36340a, cVar.f36341b, this.X, cVar.f36342c, cVar.d, cVar.f36343e, cVar.f, cVar.g, j, j2, jC, iOException, z2);
        if (!z2) {
            return 0;
        }
        this.g0.a(this);
        return 2;
    }

    @Override // com.smartdigimkt.j4.z
    public boolean a(long j) {
        com.smartdigimkt.l4.a aVarI;
        long j2;
        if (this.v0 || this.j0.c()) {
            return false;
        }
        boolean zJ = j();
        if (zJ) {
            j2 = this.s0;
            aVarI = null;
        } else {
            aVarI = i();
            j2 = aVarI.g;
        }
        this.f0.a(aVarI, j, j2, this.k0);
        e eVar = this.k0;
        boolean z2 = eVar.f36351b;
        c cVar = eVar.f36350a;
        eVar.a();
        if (z2) {
            this.s0 = -9223372036854775807L;
            this.v0 = true;
            return true;
        }
        if (cVar == null) {
            return false;
        }
        if (a(cVar)) {
            com.smartdigimkt.l4.a aVar = (com.smartdigimkt.l4.a) cVar;
            if (zJ) {
                long j3 = aVar.f;
                long j4 = this.s0;
                if (j3 == j4) {
                    j4 = Long.MIN_VALUE;
                }
                this.u0 = j4;
                this.s0 = -9223372036854775807L;
            }
            aVar.a(this.p0);
            this.l0.add(aVar);
        }
        this.h0.a(cVar.f36340a, cVar.f36341b, this.X, cVar.f36342c, cVar.d, cVar.f36343e, cVar.f, cVar.g, this.j0.a(cVar, this, this.i0));
        return true;
    }

    private boolean a(c cVar) {
        return cVar instanceof com.smartdigimkt.l4.a;
    }

    private void a(int i2) {
        int iB = b(i2, 0);
        if (iB > 0) {
            f0.a((List) this.l0, 0, iB);
        }
    }

    private void a(int i2, int i3) {
        int iB = b(i2 - i3, 0);
        int iB2 = i3 == 1 ? iB : b(i2 - 1, iB);
        while (iB <= iB2) {
            d(iB);
            iB++;
        }
    }
}
