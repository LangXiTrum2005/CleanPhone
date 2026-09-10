package com.smartdigimkt.c4;

import com.smartdigimkt.p4.f0;
import com.smartdigimkt.p4.p;
import com.smartdigimkt.p4.s;
import com.smartdigimkt.w3.t;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayDeque;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class g implements com.smartdigimkt.b4.e, com.smartdigimkt.b4.k {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private static final int f34252A = 2;
    private static final long C = 262144;
    private static final long D = 10485760;
    public static final int x = 1;
    private static final int y = 0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final int f34255z = 1;
    private final int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final s f34256e;
    private final s f;
    private final s g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ArrayDeque<com.smartdigimkt.c4.a.C0451a> f34257h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f34258i;
    private int j;
    private long k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f34259l;
    private s m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f34260n;
    private int o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f34261p;
    private com.smartdigimkt.b4.g q;
    private c[] r;
    private long[][] s;
    private int t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f34262u;
    private boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final com.smartdigimkt.b4.h f34254w = new a();

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private static final int f34253B = f0.d("qt  ");

    public class a implements com.smartdigimkt.b4.h {
        @Override // com.smartdigimkt.b4.h
        public com.smartdigimkt.b4.e[] a() {
            return new com.smartdigimkt.b4.e[]{new g()};
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final j f34263a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final m f34264b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final com.smartdigimkt.b4.m f34265c;
        public int d;

        public c(j jVar, m mVar, com.smartdigimkt.b4.m mVar2) {
            this.f34263a = jVar;
            this.f34264b = mVar;
            this.f34265c = mVar2;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface d {
    }

    public g() {
        this(0);
    }

    private void c() {
        this.f34258i = 0;
        this.f34259l = 0;
    }

    private void d(long j) {
        for (c cVar : this.r) {
            m mVar = cVar.f34264b;
            int iA = mVar.a(j);
            if (iA == -1) {
                iA = mVar.b(j);
            }
            cVar.d = iA;
        }
    }

    @Override // com.smartdigimkt.b4.k
    public boolean a() {
        return true;
    }

    @Override // com.smartdigimkt.b4.k
    public long b() {
        return this.f34262u;
    }

    @Override // com.smartdigimkt.b4.e
    public void release() {
    }

    public g(int i2) {
        this.d = i2;
        this.g = new s(16);
        this.f34257h = new ArrayDeque<>();
        this.f34256e = new s(p.f37595b);
        this.f = new s(4);
        this.f34260n = -1;
    }

    private boolean b(com.smartdigimkt.b4.f fVar) throws InterruptedException, IOException {
        if (this.f34259l == 0) {
            if (!fVar.a(this.g.f37616a, 0, 8, true)) {
                return false;
            }
            this.f34259l = 8;
            this.g.e(0);
            this.k = this.g.z();
            this.j = this.g.i();
        }
        long j = this.k;
        if (j == 1) {
            fVar.c(this.g.f37616a, 8, 8);
            this.f34259l += 8;
            this.k = this.g.C();
        } else if (j == 0) {
            long jA = fVar.a();
            if (jA == -1 && !this.f34257h.isEmpty()) {
                jA = this.f34257h.peek().V0;
            }
            if (jA != -1) {
                this.k = (jA - fVar.d()) + ((long) this.f34259l);
            }
        }
        if (this.k < this.f34259l) {
            throw new t("Atom size less than header length (unsupported).");
        }
        if (a(this.j)) {
            long jD = (fVar.d() + this.k) - ((long) this.f34259l);
            this.f34257h.push(new com.smartdigimkt.c4.a.C0451a(this.j, jD));
            if (this.k == this.f34259l) {
                c(jD);
            } else {
                c();
            }
        } else if (b(this.j)) {
            com.smartdigimkt.p4.a.b(this.f34259l == 8);
            com.smartdigimkt.p4.a.b(this.k <= 2147483647L);
            s sVar = new s((int) this.k);
            this.m = sVar;
            System.arraycopy(this.g.f37616a, 0, sVar.f37616a, 0, 8);
            this.f34258i = 1;
        } else {
            this.m = null;
            this.f34258i = 1;
        }
        return true;
    }

    @Override // com.smartdigimkt.b4.e
    public boolean a(com.smartdigimkt.b4.f fVar) throws InterruptedException, IOException {
        return i.b(fVar);
    }

    private void c(long j) throws t {
        while (!this.f34257h.isEmpty() && this.f34257h.peek().V0 == j) {
            com.smartdigimkt.c4.a.C0451a c0451aPop = this.f34257h.pop();
            if (c0451aPop.f34171a == com.smartdigimkt.c4.a.H) {
                a(c0451aPop);
                this.f34257h.clear();
                this.f34258i = 2;
            } else if (!this.f34257h.isEmpty()) {
                this.f34257h.peek().a(c0451aPop);
            }
        }
        if (this.f34258i != 2) {
            c();
        }
    }

    @Override // com.smartdigimkt.b4.e
    public void a(com.smartdigimkt.b4.g gVar) {
        this.q = gVar;
    }

    @Override // com.smartdigimkt.b4.e
    public void a(long j, long j2) {
        this.f34257h.clear();
        this.f34259l = 0;
        this.f34260n = -1;
        this.o = 0;
        this.f34261p = 0;
        if (j == 0) {
            c();
        } else if (this.r != null) {
            d(j2);
        }
    }

    @Override // com.smartdigimkt.b4.e
    public int a(com.smartdigimkt.b4.f fVar, com.smartdigimkt.b4.j jVar) throws InterruptedException, IOException {
        while (true) {
            int i2 = this.f34258i;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        return c(fVar, jVar);
                    }
                    throw new IllegalStateException();
                }
                if (b(fVar, jVar)) {
                    return 1;
                }
            } else if (!b(fVar)) {
                return -1;
            }
        }
    }

    private int c(com.smartdigimkt.b4.f fVar, com.smartdigimkt.b4.j jVar) throws InterruptedException, IOException {
        long jD = fVar.d();
        if (this.f34260n == -1) {
            int iB = b(jD);
            this.f34260n = iB;
            if (iB == -1) {
                return -1;
            }
        }
        c cVar = this.r[this.f34260n];
        com.smartdigimkt.b4.m mVar = cVar.f34265c;
        int i2 = cVar.d;
        m mVar2 = cVar.f34264b;
        long j = mVar2.f34294c[i2];
        int i3 = mVar2.d[i2];
        long j2 = (j - jD) + ((long) this.o);
        if (j2 >= 0 && j2 < 262144) {
            if (cVar.f34263a.g == 1) {
                j2 += 8;
                i3 -= 8;
            }
            fVar.b((int) j2);
            int i4 = cVar.f34263a.j;
            if (i4 == 0) {
                while (true) {
                    int i5 = this.o;
                    if (i5 >= i3) {
                        break;
                    }
                    int iA = mVar.a(fVar, i3 - i5, false);
                    this.o += iA;
                    this.f34261p -= iA;
                }
            } else {
                byte[] bArr = this.f.f37616a;
                bArr[0] = 0;
                bArr[1] = 0;
                bArr[2] = 0;
                int i6 = 4 - i4;
                while (this.o < i3) {
                    int i7 = this.f34261p;
                    if (i7 == 0) {
                        fVar.c(this.f.f37616a, i6, i4);
                        this.f.e(0);
                        this.f34261p = this.f.B();
                        this.f34256e.e(0);
                        mVar.a(this.f34256e, 4);
                        this.o += 4;
                        i3 += i6;
                    } else {
                        int iA2 = mVar.a(fVar, i7, false);
                        this.o += iA2;
                        this.f34261p -= iA2;
                    }
                }
            }
            int i8 = i3;
            m mVar3 = cVar.f34264b;
            mVar.a(mVar3.f[i2], mVar3.g[i2], i8, 0, null);
            cVar.d++;
            this.f34260n = -1;
            this.o = 0;
            this.f34261p = 0;
            return 0;
        }
        jVar.f33921a = j;
        return 1;
    }

    @Override // com.smartdigimkt.b4.k
    public com.smartdigimkt.b4.k.a a(long j) {
        long j2;
        long j3;
        int iB;
        c[] cVarArr = this.r;
        if (cVarArr.length == 0) {
            return new com.smartdigimkt.b4.k.a(com.smartdigimkt.b4.l.f33925c);
        }
        int i2 = this.t;
        long jA = -1;
        if (i2 != -1) {
            m mVar = cVarArr[i2].f34264b;
            int iA = a(mVar, j);
            if (iA == -1) {
                return new com.smartdigimkt.b4.k.a(com.smartdigimkt.b4.l.f33925c);
            }
            long j4 = mVar.f[iA];
            j2 = mVar.f34294c[iA];
            if (j4 >= j || iA >= mVar.f34293b - 1 || (iB = mVar.b(j)) == -1 || iB == iA) {
                j3 = -9223372036854775807L;
            } else {
                j3 = mVar.f[iB];
                jA = mVar.f34294c[iB];
            }
            j = j4;
        } else {
            j2 = Long.MAX_VALUE;
            j3 = -9223372036854775807L;
        }
        int i3 = 0;
        while (true) {
            c[] cVarArr2 = this.r;
            if (i3 >= cVarArr2.length) {
                break;
            }
            if (i3 != this.t) {
                m mVar2 = cVarArr2[i3].f34264b;
                long jA2 = a(mVar2, j, j2);
                if (j3 != -9223372036854775807L) {
                    jA = a(mVar2, j3, jA);
                }
                j2 = jA2;
            }
            i3++;
        }
        com.smartdigimkt.b4.l lVar = new com.smartdigimkt.b4.l(j, j2);
        if (j3 == -9223372036854775807L) {
            return new com.smartdigimkt.b4.k.a(lVar);
        }
        return new com.smartdigimkt.b4.k.a(lVar, new com.smartdigimkt.b4.l(j3, jA));
    }

    private boolean b(com.smartdigimkt.b4.f fVar, com.smartdigimkt.b4.j jVar) throws InterruptedException, IOException {
        boolean z2;
        long j = this.k - ((long) this.f34259l);
        long jD = fVar.d() + j;
        s sVar = this.m;
        if (sVar != null) {
            fVar.c(sVar.f37616a, this.f34259l, (int) j);
            if (this.j == com.smartdigimkt.c4.a.g) {
                this.v = a(this.m);
            } else if (!this.f34257h.isEmpty()) {
                this.f34257h.peek().a(new com.smartdigimkt.c4.a.b(this.j, this.m));
            }
        } else {
            if (j < 262144) {
                fVar.b((int) j);
            } else {
                jVar.f33921a = fVar.d() + j;
                z2 = true;
            }
            c(jD);
            return (z2 || this.f34258i == 2) ? false : true;
        }
        z2 = false;
        c(jD);
        if (z2) {
        }
    }

    private void a(com.smartdigimkt.c4.a.C0451a c0451a) throws t {
        com.smartdigimkt.e4.a aVarA;
        ArrayList<m> arrayListA;
        ArrayList arrayList = new ArrayList();
        com.smartdigimkt.b4.i iVar = new com.smartdigimkt.b4.i();
        com.smartdigimkt.c4.a.b bVarF = c0451a.f(com.smartdigimkt.c4.a.G0);
        if (bVarF != null) {
            aVarA = com.smartdigimkt.c4.b.a(bVarF, this.v);
            if (aVarA != null) {
                iVar.a(aVarA);
            }
        } else {
            aVarA = null;
        }
        int i2 = 1;
        int i3 = 0;
        try {
            arrayListA = a(c0451a, iVar, (this.d & 1) != 0);
        } catch (com.smartdigimkt.c4.b.g unused) {
            iVar = new com.smartdigimkt.b4.i();
            arrayListA = a(c0451a, iVar, true);
        }
        int size = arrayListA.size();
        long jMax = -9223372036854775807L;
        int size2 = -1;
        while (i3 < size) {
            m mVar = arrayListA.get(i3);
            j jVar = mVar.f34292a;
            c cVar = new c(jVar, mVar, this.q.a(i3, jVar.f34274b));
            com.smartdigimkt.w3.m mVarA = jVar.f.a(mVar.f34295e + 30);
            if (jVar.f34274b == i2) {
                if (iVar.a()) {
                    mVarA = mVarA.a(iVar.f33919a, iVar.f33920b);
                }
                if (aVarA != null) {
                    mVarA = mVarA.a(aVarA);
                }
            }
            cVar.f34265c.a(mVarA);
            com.smartdigimkt.b4.i iVar2 = iVar;
            com.smartdigimkt.e4.a aVar = aVarA;
            long j = jVar.f34276e;
            if (j == -9223372036854775807L) {
                j = mVar.f34296h;
            }
            jMax = Math.max(jMax, j);
            if (jVar.f34274b == 2 && size2 == -1) {
                size2 = arrayList.size();
            }
            arrayList.add(cVar);
            i3++;
            aVarA = aVar;
            iVar = iVar2;
            i2 = 1;
        }
        this.t = size2;
        this.f34262u = jMax;
        c[] cVarArr = (c[]) arrayList.toArray(new c[arrayList.size()]);
        this.r = cVarArr;
        this.s = a(cVarArr);
        this.q.a();
        this.q.a(this);
    }

    private int b(long j) {
        int i2 = -1;
        int i3 = -1;
        int i4 = 0;
        long j2 = Long.MAX_VALUE;
        boolean z2 = true;
        long j3 = Long.MAX_VALUE;
        boolean z3 = true;
        long j4 = Long.MAX_VALUE;
        while (true) {
            c[] cVarArr = this.r;
            if (i4 >= cVarArr.length) {
                break;
            }
            c cVar = cVarArr[i4];
            int i5 = cVar.d;
            m mVar = cVar.f34264b;
            if (i5 != mVar.f34293b) {
                long j5 = mVar.f34294c[i5];
                long j6 = this.s[i4][i5];
                long j7 = j5 - j;
                boolean z4 = j7 < 0 || j7 >= 262144;
                if ((!z4 && z3) || (z4 == z3 && j7 < j4)) {
                    z3 = z4;
                    j3 = j6;
                    i3 = i4;
                    j4 = j7;
                }
                if (j6 < j2) {
                    z2 = z4;
                    j2 = j6;
                    i2 = i4;
                }
            }
            i4++;
        }
        return (j2 == Long.MAX_VALUE || !z2 || j3 < j2 + D) ? i3 : i2;
    }

    private static boolean b(int i2) {
        return i2 == com.smartdigimkt.c4.a.X || i2 == com.smartdigimkt.c4.a.f34148I || i2 == com.smartdigimkt.c4.a.f34156Y || i2 == com.smartdigimkt.c4.a.Z || i2 == com.smartdigimkt.c4.a.s0 || i2 == com.smartdigimkt.c4.a.t0 || i2 == com.smartdigimkt.c4.a.u0 || i2 == com.smartdigimkt.c4.a.W || i2 == com.smartdigimkt.c4.a.v0 || i2 == com.smartdigimkt.c4.a.w0 || i2 == com.smartdigimkt.c4.a.x0 || i2 == com.smartdigimkt.c4.a.y0 || i2 == com.smartdigimkt.c4.a.z0 || i2 == com.smartdigimkt.c4.a.f34154U || i2 == com.smartdigimkt.c4.a.g || i2 == com.smartdigimkt.c4.a.G0;
    }

    private ArrayList<m> a(com.smartdigimkt.c4.a.C0451a c0451a, com.smartdigimkt.b4.i iVar, boolean z2) throws t {
        boolean z3;
        ArrayList<m> arrayList = new ArrayList<>();
        int i2 = 0;
        while (i2 < c0451a.X0.size()) {
            com.smartdigimkt.c4.a.C0451a c0451a2 = c0451a.X0.get(i2);
            if (c0451a2.f34171a != com.smartdigimkt.c4.a.f34149J) {
                z3 = z2;
            } else {
                z3 = z2;
                j jVarA = com.smartdigimkt.c4.b.a(c0451a2, c0451a.f(com.smartdigimkt.c4.a.f34148I), -9223372036854775807L, (com.smartdigimkt.a4.e) null, z3, this.v);
                if (jVarA != null) {
                    m mVarA = com.smartdigimkt.c4.b.a(jVarA, c0451a2.e(com.smartdigimkt.c4.a.K).e(com.smartdigimkt.c4.a.L).e(com.smartdigimkt.c4.a.M), iVar);
                    if (mVarA.f34293b != 0) {
                        arrayList.add(mVarA);
                    }
                }
            }
            i2++;
            z2 = z3;
        }
        return arrayList;
    }

    private static long[][] a(c[] cVarArr) {
        long[][] jArr = new long[cVarArr.length][];
        int[] iArr = new int[cVarArr.length];
        long[] jArr2 = new long[cVarArr.length];
        boolean[] zArr = new boolean[cVarArr.length];
        for (int i2 = 0; i2 < cVarArr.length; i2++) {
            jArr[i2] = new long[cVarArr[i2].f34264b.f34293b];
            jArr2[i2] = cVarArr[i2].f34264b.f[0];
        }
        long j = 0;
        int i3 = 0;
        while (i3 < cVarArr.length) {
            long j2 = Long.MAX_VALUE;
            int i4 = -1;
            for (int i5 = 0; i5 < cVarArr.length; i5++) {
                if (!zArr[i5]) {
                    long j3 = jArr2[i5];
                    if (j3 <= j2) {
                        i4 = i5;
                        j2 = j3;
                    }
                }
            }
            int i6 = iArr[i4];
            long[] jArr3 = jArr[i4];
            jArr3[i6] = j;
            m mVar = cVarArr[i4].f34264b;
            j += (long) mVar.d[i6];
            int i7 = i6 + 1;
            iArr[i4] = i7;
            if (i7 < jArr3.length) {
                jArr2[i4] = mVar.f[i7];
            } else {
                zArr[i4] = true;
                i3++;
            }
        }
        return jArr;
    }

    private static long a(m mVar, long j, long j2) {
        int iA = a(mVar, j);
        return iA == -1 ? j2 : Math.min(mVar.f34294c[iA], j2);
    }

    private static int a(m mVar, long j) {
        int iA = mVar.a(j);
        return iA == -1 ? mVar.b(j) : iA;
    }

    private static boolean a(s sVar) {
        sVar.e(8);
        if (sVar.i() == f34253B) {
            return true;
        }
        sVar.f(4);
        while (sVar.a() > 0) {
            if (sVar.i() == f34253B) {
                return true;
            }
        }
        return false;
    }

    private static boolean a(int i2) {
        return i2 == com.smartdigimkt.c4.a.H || i2 == com.smartdigimkt.c4.a.f34149J || i2 == com.smartdigimkt.c4.a.K || i2 == com.smartdigimkt.c4.a.L || i2 == com.smartdigimkt.c4.a.M || i2 == com.smartdigimkt.c4.a.f34155V;
    }
}
