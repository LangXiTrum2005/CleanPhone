package com.smartdigimkt.j4;

/* JADX INFO: loaded from: classes.dex */
final class w {
    private static final int s = 1000;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f36047i;
    private int j;
    private int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f36048l;
    private com.smartdigimkt.w3.m q;
    private int r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f36042a = 1000;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int[] f36043b = new int[1000];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long[] f36044c = new long[1000];
    private long[] f = new long[1000];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int[] f36045e = new int[1000];
    private int[] d = new int[1000];
    private com.smartdigimkt.b4.m.a[] g = new com.smartdigimkt.b4.m.a[1000];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.smartdigimkt.w3.m[] f36046h = new com.smartdigimkt.w3.m[1000];
    private long m = Long.MIN_VALUE;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f36049n = Long.MIN_VALUE;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f36050p = true;
    private boolean o = true;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f36051a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f36052b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public com.smartdigimkt.b4.m.a f36053c;
    }

    public void a(boolean z2) {
        this.f36047i = 0;
        this.j = 0;
        this.k = 0;
        this.f36048l = 0;
        this.o = true;
        this.m = Long.MIN_VALUE;
        this.f36049n = Long.MIN_VALUE;
        if (z2) {
            this.q = null;
            this.f36050p = true;
        }
    }

    public long b(int i2) {
        int i3 = i() - i2;
        com.smartdigimkt.p4.a.a(i3 >= 0 && i3 <= this.f36047i - this.f36048l);
        int i4 = this.f36047i - i3;
        this.f36047i = i4;
        this.f36049n = Math.max(this.m, c(i4));
        int i5 = this.f36047i;
        if (i5 == 0) {
            return 0L;
        }
        int iD = d(i5 - 1);
        return this.f36044c[iD] + ((long) this.d[iD]);
    }

    public synchronized long c() {
        int i2 = this.f36048l;
        if (i2 == 0) {
            return -1L;
        }
        return a(i2);
    }

    public int d() {
        return this.j;
    }

    public synchronized long e() {
        return this.f36047i == 0 ? Long.MIN_VALUE : this.f[this.k];
    }

    public void f(int i2) {
        this.r = i2;
    }

    public int g() {
        return this.j + this.f36048l;
    }

    public synchronized com.smartdigimkt.w3.m h() {
        return this.f36050p ? null : this.q;
    }

    public int i() {
        return this.j + this.f36047i;
    }

    public synchronized boolean j() {
        return this.f36048l != this.f36047i;
    }

    public int k() {
        return j() ? this.f36043b[d(this.f36048l)] : this.r;
    }

    public synchronized void l() {
        this.f36048l = 0;
    }

    private int d(int i2) {
        int i3 = this.k + i2;
        int i4 = this.f36042a;
        return i3 < i4 ? i3 : i3 - i4;
    }

    public synchronized boolean e(int i2) {
        int i3 = this.j;
        if (i3 > i2 || i2 > this.f36047i + i3) {
            return false;
        }
        this.f36048l = i2 - i3;
        return true;
    }

    public synchronized long f() {
        return this.f36049n;
    }

    private long c(int i2) {
        long jMax = Long.MIN_VALUE;
        if (i2 == 0) {
            return Long.MIN_VALUE;
        }
        int iD = d(i2 - 1);
        for (int i3 = 0; i3 < i2; i3++) {
            jMax = Math.max(jMax, this.f[iD]);
            if ((this.f36045e[iD] & 1) != 0) {
                return jMax;
            }
            iD--;
            if (iD == -1) {
                iD = this.f36042a - 1;
            }
        }
        return jMax;
    }

    public synchronized long b(long j, boolean z2, boolean z3) throws Throwable {
        Throwable th;
        try {
            try {
                int i2 = this.f36047i;
                if (i2 != 0) {
                    long[] jArr = this.f;
                    int i3 = this.k;
                    if (j >= jArr[i3]) {
                        if (z3) {
                            try {
                                int i4 = this.f36048l;
                                if (i4 != i2) {
                                    i2 = i4 + 1;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                throw th;
                            }
                        }
                        int iA = a(i3, i2, j, z2);
                        if (iA == -1) {
                            return -1L;
                        }
                        return a(iA);
                    }
                }
                return -1L;
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
            throw th;
        }
    }

    public synchronized int a(com.smartdigimkt.w3.n nVar, com.smartdigimkt.z3.e eVar, boolean z2, boolean z3, com.smartdigimkt.w3.m mVar, a aVar) {
        if (!j()) {
            if (z3) {
                eVar.d(4);
                return -4;
            }
            com.smartdigimkt.w3.m mVar2 = this.q;
            if (mVar2 == null || (!z2 && mVar2 == mVar)) {
                return -3;
            }
            nVar.f39343a = mVar2;
            return -5;
        }
        int iD = d(this.f36048l);
        if (!z2 && this.f36046h[iD] == mVar) {
            if (eVar.g()) {
                return -3;
            }
            eVar.d = this.f[iD];
            eVar.d(this.f36045e[iD]);
            aVar.f36051a = this.d[iD];
            aVar.f36052b = this.f36044c[iD];
            aVar.f36053c = this.g[iD];
            this.f36048l++;
            return -4;
        }
        nVar.f39343a = this.f36046h[iD];
        return -5;
    }

    public synchronized long b() {
        int i2 = this.f36047i;
        if (i2 == 0) {
            return -1L;
        }
        return a(i2);
    }

    public synchronized void b(long j) {
        this.f36049n = Math.max(this.f36049n, j);
    }

    public synchronized int a(long j, boolean z2, boolean z3) throws Throwable {
        try {
            try {
                int iD = d(this.f36048l);
                if (!j() || j < this.f[iD] || (j > this.f36049n && !z3)) {
                    return -1;
                }
                int iA = a(iD, this.f36047i - this.f36048l, j, z2);
                if (iA == -1) {
                    return -1;
                }
                this.f36048l += iA;
                return iA;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    public synchronized int a() {
        int i2;
        int i3 = this.f36047i;
        i2 = i3 - this.f36048l;
        this.f36048l = i3;
        return i2;
    }

    public synchronized boolean a(com.smartdigimkt.w3.m mVar) {
        try {
            if (mVar == null) {
                this.f36050p = true;
                return false;
            }
            this.f36050p = false;
            if (com.smartdigimkt.p4.f0.a(mVar, this.q)) {
                return false;
            }
            this.q = mVar;
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void a(long j, int i2, long j2, int i3, com.smartdigimkt.b4.m.a aVar) {
        try {
            if (this.o) {
                if ((i2 & 1) == 0) {
                    return;
                } else {
                    this.o = false;
                }
            }
            com.smartdigimkt.p4.a.b(!this.f36050p);
            b(j);
            int iD = d(this.f36047i);
            this.f[iD] = j;
            long[] jArr = this.f36044c;
            jArr[iD] = j2;
            this.d[iD] = i3;
            this.f36045e[iD] = i2;
            this.g[iD] = aVar;
            this.f36046h[iD] = this.q;
            this.f36043b[iD] = this.r;
            int i4 = this.f36047i + 1;
            this.f36047i = i4;
            int i5 = this.f36042a;
            if (i4 == i5) {
                int i6 = i5 + 1000;
                int[] iArr = new int[i6];
                long[] jArr2 = new long[i6];
                long[] jArr3 = new long[i6];
                int[] iArr2 = new int[i6];
                int[] iArr3 = new int[i6];
                com.smartdigimkt.b4.m.a[] aVarArr = new com.smartdigimkt.b4.m.a[i6];
                com.smartdigimkt.w3.m[] mVarArr = new com.smartdigimkt.w3.m[i6];
                int i7 = this.k;
                int i8 = i5 - i7;
                System.arraycopy(jArr, i7, jArr2, 0, i8);
                System.arraycopy(this.f, this.k, jArr3, 0, i8);
                System.arraycopy(this.f36045e, this.k, iArr2, 0, i8);
                System.arraycopy(this.d, this.k, iArr3, 0, i8);
                System.arraycopy(this.g, this.k, aVarArr, 0, i8);
                System.arraycopy(this.f36046h, this.k, mVarArr, 0, i8);
                System.arraycopy(this.f36043b, this.k, iArr, 0, i8);
                int i9 = this.k;
                System.arraycopy(this.f36044c, 0, jArr2, i8, i9);
                System.arraycopy(this.f, 0, jArr3, i8, i9);
                System.arraycopy(this.f36045e, 0, iArr2, i8, i9);
                System.arraycopy(this.d, 0, iArr3, i8, i9);
                System.arraycopy(this.g, 0, aVarArr, i8, i9);
                System.arraycopy(this.f36046h, 0, mVarArr, i8, i9);
                System.arraycopy(this.f36043b, 0, iArr, i8, i9);
                this.f36044c = jArr2;
                this.f = jArr3;
                this.f36045e = iArr2;
                this.d = iArr3;
                this.g = aVarArr;
                this.f36046h = mVarArr;
                this.f36043b = iArr;
                this.k = 0;
                this.f36047i = this.f36042a;
                this.f36042a = i6;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized boolean a(long j) {
        if (this.f36047i == 0) {
            return j > this.m;
        }
        if (Math.max(this.m, c(this.f36048l)) >= j) {
            return false;
        }
        int i2 = this.f36047i;
        int iD = d(i2 - 1);
        while (i2 > this.f36048l && this.f[iD] >= j) {
            i2--;
            iD--;
            if (iD == -1) {
                iD = this.f36042a - 1;
            }
        }
        b(this.j + i2);
        return true;
    }

    private int a(int i2, int i3, long j, boolean z2) {
        int i4 = -1;
        for (int i5 = 0; i5 < i3 && this.f[i2] <= j; i5++) {
            if (!z2 || (this.f36045e[i2] & 1) != 0) {
                i4 = i5;
            }
            i2++;
            if (i2 == this.f36042a) {
                i2 = 0;
            }
        }
        return i4;
    }

    private long a(int i2) {
        this.m = Math.max(this.m, c(i2));
        int i3 = this.f36047i - i2;
        this.f36047i = i3;
        this.j += i2;
        int i4 = this.k + i2;
        this.k = i4;
        int i5 = this.f36042a;
        if (i4 >= i5) {
            this.k = i4 - i5;
        }
        int i6 = this.f36048l - i2;
        this.f36048l = i6;
        if (i6 < 0) {
            this.f36048l = 0;
        }
        if (i3 == 0) {
            int i7 = this.k;
            if (i7 != 0) {
                i5 = i7;
            }
            int i8 = i5 - 1;
            return this.f36044c[i8] + ((long) this.d[i8]);
        }
        return this.f36044c[this.k];
    }
}
