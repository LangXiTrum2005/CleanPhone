package com.smartdigimkt.j4;

import android.net.Uri;
import android.os.Handler;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
final class n implements r, com.smartdigimkt.b4.g, com.smartdigimkt.n4.t.a<c>, com.smartdigimkt.n4.t.d, x.b {
    private static final long N0 = 10000;
    private f0 A0;
    private boolean[] C0;
    private boolean[] D0;
    private boolean[] E0;
    private boolean F0;
    private long H0;
    private boolean J0;
    private int K0;
    private boolean L0;
    private boolean M0;
    private final Uri X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private final com.smartdigimkt.n4.h f35995Y;
    private final int Z;
    private final t.a e0;
    private final e f0;
    private final com.smartdigimkt.n4.b g0;
    private final String h0;
    private final long i0;
    private final d k0;
    private r.a p0;
    private com.smartdigimkt.b4.k q0;
    private boolean t0;
    private boolean u0;
    private int v0;
    private boolean w0;
    private boolean x0;
    private boolean y0;
    private int z0;
    private final com.smartdigimkt.n4.t j0 = new com.smartdigimkt.n4.t("Loader:ExtractorMediaPeriod");
    private final com.smartdigimkt.p4.f l0 = new com.smartdigimkt.p4.f();
    private final Runnable m0 = new a();
    private final Runnable n0 = new b();
    private final Handler o0 = new Handler();
    private int[] s0 = new int[0];
    private x[] r0 = new x[0];
    private long I0 = -9223372036854775807L;
    private long G0 = -1;
    private long B0 = -9223372036854775807L;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            n.this.k();
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (n.this.M0) {
                return;
            }
            n.this.p0.a(n.this);
        }
    }

    public final class c implements com.smartdigimkt.n4.t.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Uri f35996a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final com.smartdigimkt.n4.h f35997b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final d f35998c;
        private final com.smartdigimkt.p4.f d;
        private volatile boolean f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private long f36000h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private com.smartdigimkt.n4.k f36001i;
        private long k;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final com.smartdigimkt.b4.j f35999e = new com.smartdigimkt.b4.j();
        private boolean g = true;
        private long j = -1;

        public c(Uri uri, com.smartdigimkt.n4.h hVar, d dVar, com.smartdigimkt.p4.f fVar) {
            this.f35996a = (Uri) com.smartdigimkt.p4.a.a(uri);
            this.f35997b = (com.smartdigimkt.n4.h) com.smartdigimkt.p4.a.a(hVar);
            this.f35998c = (d) com.smartdigimkt.p4.a.a(dVar);
            this.d = fVar;
        }

        public void a(long j, long j2) {
            this.f35999e.f33921a = j;
            this.f36000h = j2;
            this.g = true;
        }

        @Override // com.smartdigimkt.n4.t.c
        public void b() {
            this.f = true;
        }

        @Override // com.smartdigimkt.n4.t.c
        public void a() throws Throwable {
            com.smartdigimkt.b4.b bVar;
            int iA = 0;
            while (iA == 0 && !this.f) {
                try {
                    long jD = this.f35999e.f33921a;
                    com.smartdigimkt.n4.k kVar = new com.smartdigimkt.n4.k(this.f35996a, jD, -1L, n.this.h0);
                    this.f36001i = kVar;
                    long jA = this.f35997b.a(kVar);
                    this.j = jA;
                    if (jA != -1) {
                        this.j = jA + jD;
                    }
                    bVar = new com.smartdigimkt.b4.b(this.f35997b, jD, this.j);
                    try {
                        com.smartdigimkt.b4.e eVarA = this.f35998c.a(bVar, this.f35997b.c());
                        if (this.g) {
                            eVarA.a(jD, this.f36000h);
                            this.g = false;
                        }
                        while (iA == 0 && !this.f) {
                            this.d.a();
                            iA = eVarA.a(bVar, this.f35999e);
                            if (bVar.d() > n.this.i0 + jD) {
                                jD = bVar.d();
                                this.d.b();
                                n.this.o0.post(n.this.n0);
                            }
                        }
                        if (iA == 1) {
                            iA = 0;
                        } else {
                            this.f35999e.f33921a = bVar.d();
                            this.k = this.f35999e.f33921a - this.f36001i.f37006c;
                        }
                        com.smartdigimkt.p4.f0.a(this.f35997b);
                    } catch (Throwable th) {
                        th = th;
                        if (iA != 1 && bVar != null) {
                            this.f35999e.f33921a = bVar.d();
                            this.k = this.f35999e.f33921a - this.f36001i.f37006c;
                        }
                        com.smartdigimkt.p4.f0.a(this.f35997b);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    bVar = null;
                }
            }
        }
    }

    public interface e {
        void a(long j, boolean z2);
    }

    public final class f implements y {
        private final int X;

        public f(int i2) {
            this.X = i2;
        }

        @Override // com.smartdigimkt.j4.y
        public int d(long j) {
            return n.this.a(this.X, j);
        }

        @Override // com.smartdigimkt.j4.y
        public boolean isReady() {
            return n.this.a(this.X);
        }

        @Override // com.smartdigimkt.j4.y
        public void a() throws IOException {
            n.this.l();
        }

        @Override // com.smartdigimkt.j4.y
        public int a(com.smartdigimkt.w3.n nVar, com.smartdigimkt.z3.e eVar, boolean z2) {
            return n.this.a(this.X, nVar, eVar, z2);
        }
    }

    public n(Uri uri, com.smartdigimkt.n4.h hVar, com.smartdigimkt.b4.e[] eVarArr, int i2, t.a aVar, e eVar, com.smartdigimkt.n4.b bVar, String str, int i3) {
        this.X = uri;
        this.f35995Y = hVar;
        this.Z = i2;
        this.e0 = aVar;
        this.f0 = eVar;
        this.g0 = bVar;
        this.h0 = str;
        this.i0 = i3;
        this.k0 = new d(eVarArr, this);
        this.v0 = i2 == -1 ? 3 : i2;
        aVar.a();
    }

    private int h() {
        int i2 = 0;
        for (x xVar : this.r0) {
            i2 += xVar.i();
        }
        return i2;
    }

    private long i() {
        long jMax = Long.MIN_VALUE;
        for (x xVar : this.r0) {
            jMax = Math.max(jMax, xVar.f());
        }
        return jMax;
    }

    private boolean j() {
        return this.I0 != -9223372036854775807L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        if (this.M0 || this.u0 || this.q0 == null || !this.t0) {
            return;
        }
        for (x xVar : this.r0) {
            if (xVar.h() == null) {
                return;
            }
        }
        this.l0.b();
        int length = this.r0.length;
        e0[] e0VarArr = new e0[length];
        this.D0 = new boolean[length];
        this.C0 = new boolean[length];
        this.E0 = new boolean[length];
        this.B0 = this.q0.b();
        int i2 = 0;
        while (true) {
            boolean z2 = true;
            if (i2 >= length) {
                break;
            }
            com.smartdigimkt.w3.m mVarH = this.r0[i2].h();
            e0VarArr[i2] = new e0(mVarH);
            String str = mVarH.f;
            if (!com.smartdigimkt.p4.o.m(str) && !com.smartdigimkt.p4.o.k(str)) {
                z2 = false;
            }
            this.D0[i2] = z2;
            this.F0 = z2 | this.F0;
            i2++;
        }
        this.A0 = new f0(e0VarArr);
        if (this.Z == -1 && this.G0 == -1 && this.q0.b() == -9223372036854775807L) {
            this.v0 = 6;
        }
        this.u0 = true;
        this.f0.a(this.B0, this.q0.a());
        this.p0.a((r) this);
    }

    private void n() {
        c cVar = new c(this.X, this.f35995Y, this.k0, this.l0);
        if (this.u0) {
            com.smartdigimkt.p4.a.b(j());
            long j = this.B0;
            if (j != -9223372036854775807L && this.I0 >= j) {
                this.L0 = true;
                this.I0 = -9223372036854775807L;
                return;
            } else {
                cVar.a(this.q0.a(this.I0).f33922a.f33927b, this.I0);
                this.I0 = -9223372036854775807L;
            }
        }
        this.K0 = h();
        this.e0.a(cVar.f36001i, 1, -1, null, 0, null, cVar.f36000h, this.B0, this.j0.a(cVar, this, this.v0));
    }

    private boolean o() {
        return this.x0 || j();
    }

    @Override // com.smartdigimkt.j4.r, com.smartdigimkt.j4.z
    public void b(long j) {
    }

    public void l() throws IOException {
        this.j0.a(this.v0);
    }

    public void m() {
        if (this.u0) {
            for (x xVar : this.r0) {
                xVar.b();
            }
        }
        this.j0.a(this);
        this.o0.removeCallbacksAndMessages(null);
        this.p0 = null;
        this.M0 = true;
        this.e0.b();
    }

    @Override // com.smartdigimkt.j4.r, com.smartdigimkt.j4.z
    public long c() {
        long jI;
        if (this.L0) {
            return Long.MIN_VALUE;
        }
        if (j()) {
            return this.I0;
        }
        if (this.F0) {
            int length = this.r0.length;
            jI = Long.MAX_VALUE;
            for (int i2 = 0; i2 < length; i2++) {
                if (this.D0[i2]) {
                    jI = Math.min(jI, this.r0[i2].f());
                }
            }
        } else {
            jI = i();
        }
        return jI == Long.MIN_VALUE ? this.H0 : jI;
    }

    @Override // com.smartdigimkt.n4.t.d
    public void d() {
        for (x xVar : this.r0) {
            xVar.l();
        }
        this.k0.a();
    }

    @Override // com.smartdigimkt.j4.r
    public long e() {
        if (!this.y0) {
            this.e0.c();
            this.y0 = true;
        }
        if (!this.x0) {
            return -9223372036854775807L;
        }
        if (!this.L0 && h() <= this.K0) {
            return -9223372036854775807L;
        }
        this.x0 = false;
        return this.H0;
    }

    @Override // com.smartdigimkt.j4.r
    public f0 f() {
        return this.A0;
    }

    @Override // com.smartdigimkt.j4.r
    public void g() throws IOException {
        l();
    }

    @Override // com.smartdigimkt.j4.r, com.smartdigimkt.j4.z
    public long b() {
        if (this.z0 == 0) {
            return Long.MIN_VALUE;
        }
        return c();
    }

    private void b(int i2) {
        if (this.E0[i2]) {
            return;
        }
        com.smartdigimkt.w3.m mVarA = this.A0.a(i2).a(0);
        this.e0.a(com.smartdigimkt.p4.o.f(mVarA.f), mVarA, 0, (Object) null, this.H0);
        this.E0[i2] = true;
    }

    private boolean d(long j) {
        int length = this.r0.length;
        for (int i2 = 0; i2 < length; i2++) {
            x xVar = this.r0[i2];
            xVar.m();
            if (xVar.a(j, true, false) == -1 && (this.D0[i2] || !this.F0)) {
                return false;
            }
        }
        return true;
    }

    @Override // com.smartdigimkt.j4.r
    public void a(r.a aVar, long j) {
        this.p0 = aVar;
        this.l0.c();
        n();
    }

    @Override // com.smartdigimkt.j4.r
    public long a(com.smartdigimkt.m4.f[] fVarArr, boolean[] zArr, y[] yVarArr, boolean[] zArr2, long j) {
        com.smartdigimkt.m4.f fVar;
        com.smartdigimkt.p4.a.b(this.u0);
        int i2 = this.z0;
        int i3 = 0;
        for (int i4 = 0; i4 < fVarArr.length; i4++) {
            y yVar = yVarArr[i4];
            if (yVar != null && (fVarArr[i4] == null || !zArr[i4])) {
                int i5 = ((f) yVar).X;
                com.smartdigimkt.p4.a.b(this.C0[i5]);
                this.z0--;
                this.C0[i5] = false;
                yVarArr[i4] = null;
            }
        }
        boolean z2 = !this.w0 ? j == 0 : i2 != 0;
        for (int i6 = 0; i6 < fVarArr.length; i6++) {
            if (yVarArr[i6] == null && (fVar = fVarArr[i6]) != null) {
                com.smartdigimkt.p4.a.b(fVar.j() == 1);
                com.smartdigimkt.p4.a.b(fVar.b(0) == 0);
                int iA = this.A0.a(fVar.f());
                com.smartdigimkt.p4.a.b(!this.C0[iA]);
                this.z0++;
                this.C0[iA] = true;
                yVarArr[i6] = new f(iA);
                zArr2[i6] = true;
                if (!z2) {
                    x xVar = this.r0[iA];
                    xVar.m();
                    z2 = xVar.a(j, true, true) == -1 && xVar.g() != 0;
                }
            }
        }
        if (this.z0 == 0) {
            this.J0 = false;
            this.x0 = false;
            if (this.j0.c()) {
                x[] xVarArr = this.r0;
                int length = xVarArr.length;
                while (i3 < length) {
                    xVarArr[i3].b();
                    i3++;
                }
                this.j0.b();
            } else {
                x[] xVarArr2 = this.r0;
                int length2 = xVarArr2.length;
                while (i3 < length2) {
                    xVarArr2[i3].l();
                    i3++;
                }
            }
        } else if (z2) {
            j = c(j);
            while (i3 < yVarArr.length) {
                if (yVarArr[i3] != null) {
                    zArr2[i3] = true;
                }
                i3++;
            }
        }
        this.w0 = true;
        return j;
    }

    @Override // com.smartdigimkt.j4.r
    public long c(long j) {
        if (!this.q0.a()) {
            j = 0;
        }
        this.H0 = j;
        this.x0 = false;
        if (j() || !d(j)) {
            this.J0 = false;
            this.I0 = j;
            this.L0 = false;
            if (this.j0.c()) {
                this.j0.b();
                return j;
            }
            for (x xVar : this.r0) {
                xVar.l();
            }
        }
        return j;
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.smartdigimkt.b4.e[] f36003a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final com.smartdigimkt.b4.g f36004b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private com.smartdigimkt.b4.e f36005c;

        public d(com.smartdigimkt.b4.e[] eVarArr, com.smartdigimkt.b4.g gVar) {
            this.f36003a = eVarArr;
            this.f36004b = gVar;
        }

        public com.smartdigimkt.b4.e a(com.smartdigimkt.b4.f fVar, Uri uri) throws InterruptedException, IOException {
            com.smartdigimkt.b4.e eVar = this.f36005c;
            if (eVar != null) {
                return eVar;
            }
            for (com.smartdigimkt.b4.e eVar2 : this.f36003a) {
                try {
                    if (eVar2.a(fVar)) {
                        this.f36005c = eVar2;
                        fVar.b();
                        break;
                    }
                    continue;
                } catch (EOFException unused) {
                } catch (Throwable th) {
                    fVar.b();
                    throw th;
                }
                fVar.b();
            }
            com.smartdigimkt.b4.e eVar3 = this.f36005c;
            if (eVar3 == null) {
                throw new g0(android.support.v4.media.a.r(new StringBuilder("None of the available extractors ("), com.smartdigimkt.p4.f0.a(this.f36003a), ") could read the stream."), uri);
            }
            eVar3.a(this.f36004b);
            return this.f36005c;
        }

        public void a() {
            com.smartdigimkt.b4.e eVar = this.f36005c;
            if (eVar != null) {
                eVar.release();
                this.f36005c = null;
            }
        }
    }

    private void c(int i2) {
        if (this.J0 && this.D0[i2] && !this.r0[i2].j()) {
            this.I0 = 0L;
            this.J0 = false;
            this.x0 = true;
            this.H0 = 0L;
            this.K0 = 0;
            for (x xVar : this.r0) {
                xVar.l();
            }
            this.p0.a(this);
        }
    }

    @Override // com.smartdigimkt.j4.r
    public void a(long j, boolean z2) {
        int length = this.r0.length;
        for (int i2 = 0; i2 < length; i2++) {
            this.r0[i2].b(j, z2, this.C0[i2]);
        }
    }

    @Override // com.smartdigimkt.j4.r, com.smartdigimkt.j4.z
    public boolean a(long j) {
        if (this.L0 || this.J0) {
            return false;
        }
        if (this.u0 && this.z0 == 0) {
            return false;
        }
        boolean zC = this.l0.c();
        if (this.j0.c()) {
            return zC;
        }
        n();
        return true;
    }

    @Override // com.smartdigimkt.j4.r
    public long a(long j, com.smartdigimkt.w3.c0 c0Var) {
        if (!this.q0.a()) {
            return 0L;
        }
        com.smartdigimkt.b4.k.a aVarA = this.q0.a(j);
        return com.smartdigimkt.p4.f0.a(j, c0Var, aVarA.f33922a.f33926a, aVarA.f33923b.f33926a);
    }

    public boolean a(int i2) {
        if (o()) {
            return false;
        }
        return this.L0 || this.r0[i2].j();
    }

    public int a(int i2, com.smartdigimkt.w3.n nVar, com.smartdigimkt.z3.e eVar, boolean z2) {
        if (o()) {
            return -3;
        }
        int iA = this.r0[i2].a(nVar, eVar, z2, this.L0, this.H0);
        if (iA == -4) {
            b(i2);
            return iA;
        }
        if (iA == -3) {
            c(i2);
        }
        return iA;
    }

    public int a(int i2, long j) {
        int iA = 0;
        if (o()) {
            return 0;
        }
        x xVar = this.r0[i2];
        if (this.L0 && j > xVar.f()) {
            iA = xVar.a();
        } else {
            int iA2 = xVar.a(j, true, true);
            if (iA2 != -1) {
                iA = iA2;
            }
        }
        if (iA > 0) {
            b(i2);
            return iA;
        }
        c(i2);
        return iA;
    }

    @Override // com.smartdigimkt.n4.t.a
    public void a(c cVar, long j, long j2) {
        if (this.B0 == -9223372036854775807L) {
            long jI = i();
            long j3 = jI == Long.MIN_VALUE ? 0L : jI + 10000;
            this.B0 = j3;
            this.f0.a(j3, this.q0.a());
        }
        this.e0.b(cVar.f36001i, 1, -1, null, 0, null, cVar.f36000h, this.B0, j, j2, cVar.k);
        a(cVar);
        this.L0 = true;
        this.p0.a(this);
    }

    @Override // com.smartdigimkt.n4.t.a
    public void a(c cVar, long j, long j2, boolean z2) {
        this.e0.a(cVar.f36001i, 1, -1, null, 0, null, cVar.f36000h, this.B0, j, j2, cVar.k);
        if (z2) {
            return;
        }
        a(cVar);
        for (x xVar : this.r0) {
            xVar.l();
        }
        if (this.z0 > 0) {
            this.p0.a(this);
        }
    }

    @Override // com.smartdigimkt.n4.t.a
    public int a(c cVar, long j, long j2, IOException iOException) {
        boolean zA = a(iOException);
        this.e0.a(cVar.f36001i, 1, -1, null, 0, null, cVar.f36000h, this.B0, j, j2, cVar.k, iOException, zA);
        a(cVar);
        if (zA) {
            return 3;
        }
        int iH = h();
        boolean z2 = iH > this.K0;
        if (a(cVar, iH)) {
            return z2 ? 1 : 0;
        }
        return 2;
    }

    @Override // com.smartdigimkt.b4.g
    public com.smartdigimkt.b4.m a(int i2, int i3) {
        int length = this.r0.length;
        for (int i4 = 0; i4 < length; i4++) {
            if (this.s0[i4] == i2) {
                return this.r0[i4];
            }
        }
        x xVar = new x(this.g0);
        xVar.a(this);
        int i5 = length + 1;
        int[] iArrCopyOf = Arrays.copyOf(this.s0, i5);
        this.s0 = iArrCopyOf;
        iArrCopyOf[length] = i2;
        x[] xVarArr = (x[]) Arrays.copyOf(this.r0, i5);
        this.r0 = xVarArr;
        xVarArr[length] = xVar;
        return xVar;
    }

    @Override // com.smartdigimkt.b4.g
    public void a() {
        this.t0 = true;
        this.o0.post(this.m0);
    }

    @Override // com.smartdigimkt.b4.g
    public void a(com.smartdigimkt.b4.k kVar) {
        this.q0 = kVar;
        this.o0.post(this.m0);
    }

    @Override // com.smartdigimkt.j4.x.b
    public void a(com.smartdigimkt.w3.m mVar) {
        this.o0.post(this.m0);
    }

    private void a(c cVar) {
        if (this.G0 == -1) {
            this.G0 = cVar.j;
        }
    }

    private boolean a(c cVar, int i2) {
        com.smartdigimkt.b4.k kVar;
        if (this.G0 == -1 && ((kVar = this.q0) == null || kVar.b() == -9223372036854775807L)) {
            if (this.u0 && !o()) {
                this.J0 = true;
                return false;
            }
            this.x0 = this.u0;
            this.H0 = 0L;
            this.K0 = 0;
            for (x xVar : this.r0) {
                xVar.l();
            }
            cVar.a(0L, 0L);
            return true;
        }
        this.K0 = i2;
        return true;
    }

    private static boolean a(IOException iOException) {
        return iOException instanceof g0;
    }
}
