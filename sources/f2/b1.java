package f2;

import android.util.SparseArray;
import com.google.android.gms.internal.ads.c7;
import java.io.EOFException;
import java.util.Objects;
import m0.s1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class b1 implements n2.a0 {
    public i1.p A;
    public i1.p B;
    public long C;
    public boolean E;
    public long F;
    public boolean G;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y0 f40279a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u1.h f40282d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i0 f40283e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public a1 f40284f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public i1.p f40285g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public na.g f40286h;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f40293p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f40294q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f40295r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f40296s;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f40300w;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f40303z;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b2.d0 f40280b = new b2.d0(5);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f40287i = 1000;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long[] f40288j = new long[1000];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long[] f40289k = new long[1000];

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long[] f40291n = new long[1000];

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int[] f40290m = new int[1000];
    public int[] l = new int[1000];

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public n2.z[] f40292o = new n2.z[1000];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b2.p f40281c = new b2.p(new com.unity3d.ads.adplayer.b(13));

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f40297t = Long.MIN_VALUE;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f40298u = Long.MIN_VALUE;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f40299v = Long.MIN_VALUE;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f40302y = true;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f40301x = true;
    public boolean D = true;

    public b1(v9.e eVar, u1.h hVar, i0 i0Var) {
        this.f40282d = hVar;
        this.f40283e = i0Var;
        this.f40279a = new y0(eVar);
    }

    public final void A(i1.p pVar, s1 s1Var) {
        i1.p pVar2;
        i1.p pVar3 = this.f40285g;
        boolean z10 = pVar3 == null;
        i1.m mVar = pVar3 == null ? null : pVar3.f42647r;
        this.f40285g = pVar;
        i1.m mVar2 = pVar.f42647r;
        u1.h hVar = this.f40282d;
        if (hVar != null) {
            int iD = hVar.d(pVar);
            i1.o oVarA = pVar.a();
            oVarA.N = iD;
            pVar2 = new i1.p(oVarA);
        } else {
            pVar2 = pVar;
        }
        s1Var.f45752c = pVar2;
        s1Var.f45751b = this.f40286h;
        if (hVar == null) {
            return;
        }
        if (z10 || !Objects.equals(mVar, mVar2)) {
            na.g gVar = this.f40286h;
            i0 i0Var = this.f40283e;
            na.g gVarB = hVar.b(i0Var, pVar);
            this.f40286h = gVarB;
            s1Var.f45751b = gVarB;
            if (gVar != null) {
                gVar.D(i0Var);
            }
        }
    }

    public final synchronized long B() {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f40296s != this.f40293p ? this.f40288j[u(this.f40296s)] : this.C;
    }

    public final int C(s1 s1Var, o1.d dVar, int i10, boolean z10) {
        int i11;
        boolean z11 = (i10 & 2) != 0;
        b2.d0 d0Var = this.f40280b;
        synchronized (this) {
            try {
                dVar.f47036f = false;
                i11 = -3;
                if (this.f40296s != this.f40293p) {
                    i1.p pVar = ((z0) this.f40281c.i(t())).f40534a;
                    if (z11 || pVar != this.f40285g) {
                        A(pVar, s1Var);
                        i11 = -5;
                    } else {
                        int iU = u(this.f40296s);
                        if (y(iU)) {
                            dVar.f22444b = this.f40290m[iU];
                            if (this.f40296s == this.f40293p - 1 && (z10 || this.f40300w)) {
                                dVar.a(536870912);
                            }
                            dVar.f47037g = this.f40291n[iU];
                            d0Var.f5246c = this.l[iU];
                            d0Var.f5245b = this.f40289k[iU];
                            d0Var.f5247d = this.f40292o[iU];
                            i11 = -4;
                        } else {
                            dVar.f47036f = true;
                        }
                    }
                } else if (z10 || this.f40300w) {
                    dVar.f22444b = 4;
                    dVar.f47037g = Long.MIN_VALUE;
                    i11 = -4;
                } else {
                    i1.p pVar2 = this.B;
                    if (pVar2 != null && (z11 || pVar2 != this.f40285g)) {
                        A(pVar2, s1Var);
                        i11 = -5;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (i11 == -4 && !dVar.c(4)) {
            boolean z12 = (i10 & 1) != 0;
            if ((i10 & 4) == 0) {
                if (z12) {
                    y0 y0Var = this.f40279a;
                    y0.e(y0Var.f40531e, dVar, this.f40280b, y0Var.f40529c);
                } else {
                    y0 y0Var2 = this.f40279a;
                    y0Var2.f40531e = y0.e(y0Var2.f40531e, dVar, this.f40280b, y0Var2.f40529c);
                }
            }
            if (!z12) {
                this.f40296s++;
            }
        }
        return i11;
    }

    public final void D() {
        E(true);
        na.g gVar = this.f40286h;
        if (gVar != null) {
            gVar.D(this.f40283e);
            this.f40286h = null;
            this.f40285g = null;
        }
    }

    public final void E(boolean z10) {
        y0 y0Var = this.f40279a;
        c7 c7Var = y0Var.f40530d;
        if (((j2.a) c7Var.f13072c) != null) {
            v9.e eVar = y0Var.f40527a;
            synchronized (eVar) {
                ((p1.f) eVar.f52505d).f48012c.b(c7Var);
                c7 c7Var2 = c7Var;
                while (c7Var2 != null) {
                    j2.a aVar = (j2.a) c7Var2.f13072c;
                    aVar.getClass();
                    eVar.J(aVar);
                    c7Var2 = (c7) c7Var2.f13073d;
                    if (c7Var2 == null || ((j2.a) c7Var2.f13072c) == null) {
                        c7Var2 = null;
                    }
                }
            }
            c7Var.f13072c = null;
            c7Var.f13073d = null;
        }
        c7 c7Var3 = y0Var.f40530d;
        int i10 = y0Var.f40528b;
        go.k.t(((j2.a) c7Var3.f13072c) == null);
        c7Var3.f13070a = 0L;
        c7Var3.f13071b = i10;
        c7 c7Var4 = y0Var.f40530d;
        y0Var.f40531e = c7Var4;
        y0Var.f40532f = c7Var4;
        y0Var.f40533g = 0L;
        v9.e eVar2 = y0Var.f40527a;
        synchronized (eVar2) {
            ((p1.f) eVar2.f52505d).f48012c.d();
        }
        this.f40293p = 0;
        this.f40294q = 0;
        this.f40295r = 0;
        this.f40296s = 0;
        this.f40301x = true;
        this.f40297t = Long.MIN_VALUE;
        this.f40298u = Long.MIN_VALUE;
        this.f40299v = Long.MIN_VALUE;
        this.f40300w = false;
        b2.p pVar = this.f40281c;
        SparseArray sparseArray = (SparseArray) pVar.f5364c;
        for (int i11 = 0; i11 < sparseArray.size(); i11++) {
            ((com.unity3d.ads.adplayer.b) pVar.f5365d).accept(sparseArray.valueAt(i11));
        }
        pVar.f5363b = -1;
        sparseArray.clear();
        if (z10) {
            this.A = null;
            this.B = null;
            this.f40302y = true;
            this.D = true;
        }
    }

    public final synchronized boolean F(int i10) {
        synchronized (this) {
            this.f40296s = 0;
            y0 y0Var = this.f40279a;
            y0Var.f40531e = y0Var.f40530d;
        }
        int i11 = this.f40294q;
        if (i10 >= i11 && i10 <= this.f40293p + i11) {
            this.f40297t = Long.MIN_VALUE;
            this.f40296s = i10 - i11;
            return true;
        }
        return false;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0083 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized boolean G(long r12, boolean r14) throws java.lang.Throwable {
        /*
            r11 = this;
            monitor-enter(r11)
            monitor-enter(r11)     // Catch: java.lang.Throwable -> L74
            r0 = 0
            r11.f40296s = r0     // Catch: java.lang.Throwable -> L7c
            f2.y0 r1 = r11.f40279a     // Catch: java.lang.Throwable -> L7c
            com.google.android.gms.internal.ads.c7 r2 = r1.f40530d     // Catch: java.lang.Throwable -> L7c
            r1.f40531e = r2     // Catch: java.lang.Throwable -> L7c
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L79
            int r4 = r11.u(r0)     // Catch: java.lang.Throwable -> L6f
            int r1 = r11.f40296s     // Catch: java.lang.Throwable -> L74
            int r2 = r11.f40293p     // Catch: java.lang.Throwable -> L74
            r9 = 1
            if (r1 == r2) goto L19
            r3 = r9
            goto L1a
        L19:
            r3 = r0
        L1a:
            if (r3 == 0) goto L2c
            long[] r3 = r11.f40291n     // Catch: java.lang.Throwable -> L6f
            r5 = r3[r4]     // Catch: java.lang.Throwable -> L6f
            int r3 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r3 < 0) goto L2c
            long r5 = r11.f40299v     // Catch: java.lang.Throwable -> L6f
            int r3 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r3 <= 0) goto L2e
            if (r14 != 0) goto L2e
        L2c:
            r3 = r11
            goto L72
        L2e:
            boolean r3 = r11.D     // Catch: java.lang.Throwable -> L6f
            r10 = -1
            if (r3 == 0) goto L56
            int r2 = r2 - r1
            r1 = r0
        L35:
            if (r1 >= r2) goto L4f
            long[] r3 = r11.f40291n     // Catch: java.lang.Throwable -> L4b
            r5 = r3[r4]     // Catch: java.lang.Throwable -> L4b
            int r3 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r3 < 0) goto L41
            r2 = r1
            goto L53
        L41:
            int r4 = r4 + 1
            int r3 = r11.f40287i     // Catch: java.lang.Throwable -> L4b
            if (r4 != r3) goto L48
            r4 = r0
        L48:
            int r1 = r1 + 1
            goto L35
        L4b:
            r0 = move-exception
            r12 = r0
            r3 = r11
            goto L85
        L4f:
            if (r14 == 0) goto L52
            goto L53
        L52:
            r2 = r10
        L53:
            r3 = r11
            r6 = r12
            goto L5f
        L56:
            int r5 = r2 - r1
            r8 = 1
            r3 = r11
            r6 = r12
            int r2 = r3.o(r4, r5, r6, r8)     // Catch: java.lang.Throwable -> L6c
        L5f:
            if (r2 != r10) goto L63
            monitor-exit(r3)
            return r0
        L63:
            r3.f40297t = r6     // Catch: java.lang.Throwable -> L6c
            int r11 = r3.f40296s     // Catch: java.lang.Throwable -> L6c
            int r11 = r11 + r2
            r3.f40296s = r11     // Catch: java.lang.Throwable -> L6c
            monitor-exit(r3)
            return r9
        L6c:
            r0 = move-exception
        L6d:
            r12 = r0
            goto L85
        L6f:
            r0 = move-exception
            r3 = r11
            goto L6d
        L72:
            monitor-exit(r3)
            return r0
        L74:
            r0 = move-exception
            r3 = r11
        L76:
            r11 = r0
            r12 = r11
            goto L85
        L79:
            r0 = move-exception
            r3 = r11
            goto L76
        L7c:
            r0 = move-exception
            r3 = r11
        L7e:
            r11 = r0
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L83
            throw r11     // Catch: java.lang.Throwable -> L81
        L81:
            r0 = move-exception
            goto L76
        L83:
            r0 = move-exception
            goto L7e
        L85:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L6c
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: f2.b1.G(long, boolean):boolean");
    }

    /* JADX WARN: Code duplicated, block: B:9:0x000e  */
    public final synchronized void H(int i10) {
        boolean z10;
        if (i10 >= 0) {
            try {
                if (this.f40296s + i10 <= this.f40293p) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        } else {
            z10 = false;
        }
        go.k.i(z10);
        this.f40296s += i10;
    }

    /* JADX WARN: Code duplicated, block: B:75:0x010c A[Catch: all -> 0x00ab, TryCatch #1 {all -> 0x00ab, blocks: (B:55:0x008d, B:57:0x0091, B:61:0x00a7, B:64:0x00ae, B:68:0x00b6, B:73:0x00f1, B:96:0x016c, B:98:0x0175, B:75:0x010c, B:77:0x0115, B:79:0x011d, B:81:0x0132, B:85:0x013b, B:86:0x0140, B:88:0x0146, B:92:0x0154, B:94:0x0159, B:95:0x0169, B:78:0x011b), top: B:104:0x008d }] */
    /* JADX WARN: Code duplicated, block: B:77:0x0115 A[Catch: all -> 0x00ab, TryCatch #1 {all -> 0x00ab, blocks: (B:55:0x008d, B:57:0x0091, B:61:0x00a7, B:64:0x00ae, B:68:0x00b6, B:73:0x00f1, B:96:0x016c, B:98:0x0175, B:75:0x010c, B:77:0x0115, B:79:0x011d, B:81:0x0132, B:85:0x013b, B:86:0x0140, B:88:0x0146, B:92:0x0154, B:94:0x0159, B:95:0x0169, B:78:0x011b), top: B:104:0x008d }] */
    /* JADX WARN: Code duplicated, block: B:78:0x011b A[Catch: all -> 0x00ab, TryCatch #1 {all -> 0x00ab, blocks: (B:55:0x008d, B:57:0x0091, B:61:0x00a7, B:64:0x00ae, B:68:0x00b6, B:73:0x00f1, B:96:0x016c, B:98:0x0175, B:75:0x010c, B:77:0x0115, B:79:0x011d, B:81:0x0132, B:85:0x013b, B:86:0x0140, B:88:0x0146, B:92:0x0154, B:94:0x0159, B:95:0x0169, B:78:0x011b), top: B:104:0x008d }] */
    /* JADX WARN: Code duplicated, block: B:81:0x0132 A[Catch: all -> 0x00ab, TryCatch #1 {all -> 0x00ab, blocks: (B:55:0x008d, B:57:0x0091, B:61:0x00a7, B:64:0x00ae, B:68:0x00b6, B:73:0x00f1, B:96:0x016c, B:98:0x0175, B:75:0x010c, B:77:0x0115, B:79:0x011d, B:81:0x0132, B:85:0x013b, B:86:0x0140, B:88:0x0146, B:92:0x0154, B:94:0x0159, B:95:0x0169, B:78:0x011b), top: B:104:0x008d }] */
    /* JADX WARN: Code duplicated, block: B:83:0x0138  */
    /* JADX WARN: Code duplicated, block: B:84:0x013a  */
    /* JADX WARN: Code duplicated, block: B:88:0x0146 A[Catch: all -> 0x00ab, TryCatch #1 {all -> 0x00ab, blocks: (B:55:0x008d, B:57:0x0091, B:61:0x00a7, B:64:0x00ae, B:68:0x00b6, B:73:0x00f1, B:96:0x016c, B:98:0x0175, B:75:0x010c, B:77:0x0115, B:79:0x011d, B:81:0x0132, B:85:0x013b, B:86:0x0140, B:88:0x0146, B:92:0x0154, B:94:0x0159, B:95:0x0169, B:78:0x011b), top: B:104:0x008d }] */
    /* JADX WARN: Code duplicated, block: B:90:0x0151  */
    /* JADX WARN: Code duplicated, block: B:91:0x0153  */
    /* JADX WARN: Code duplicated, block: B:94:0x0159 A[Catch: all -> 0x00ab, TryCatch #1 {all -> 0x00ab, blocks: (B:55:0x008d, B:57:0x0091, B:61:0x00a7, B:64:0x00ae, B:68:0x00b6, B:73:0x00f1, B:96:0x016c, B:98:0x0175, B:75:0x010c, B:77:0x0115, B:79:0x011d, B:81:0x0132, B:85:0x013b, B:86:0x0140, B:88:0x0146, B:92:0x0154, B:94:0x0159, B:95:0x0169, B:78:0x011b), top: B:104:0x008d }] */
    @Override // n2.a0
    public void a(long j10, int i10, int i11, int i12, n2.z zVar) {
        u1.h hVar;
        u1.g gVar;
        b2.p pVar;
        int i13;
        SparseArray sparseArray;
        int iKeyAt;
        boolean z10;
        boolean z11;
        boolean z12;
        if (this.f40303z) {
            i1.p pVar2 = this.A;
            pVar2.getClass();
            b(pVar2);
        }
        int i14 = i10 & 1;
        boolean z13 = i14 != 0;
        if (this.f40301x) {
            if (!z13) {
                return;
            } else {
                this.f40301x = false;
            }
        }
        long j11 = j10 + this.F;
        if (this.D) {
            if (j11 < this.f40297t) {
                return;
            }
            if (i14 == 0) {
                if (!this.E) {
                    l1.a.s("SampleQueue", "Overriding unexpected non-sync sample for format: " + this.B);
                    this.E = true;
                }
                i10 |= 1;
            }
        }
        if (this.G) {
            if (!z13) {
                return;
            }
            synchronized (this) {
                if (this.f40293p == 0) {
                    z12 = j11 > this.f40298u;
                } else if (r() >= j11) {
                    z12 = false;
                } else {
                    m(this.f40294q + h(j11));
                    z12 = true;
                }
            }
            if (!z12) {
                return;
            } else {
                this.G = false;
            }
        }
        long j12 = (this.f40279a.f40533g - ((long) i11)) - ((long) i12);
        synchronized (this) {
            try {
                int i15 = this.f40293p;
                if (i15 > 0) {
                    int iU = u(i15 - 1);
                    go.k.i(this.f40289k[iU] + ((long) this.l[iU]) <= j12);
                }
                this.f40300w = (536870912 & i10) != 0;
                this.f40299v = Math.max(this.f40299v, j11);
                int iU2 = u(this.f40293p);
                this.f40291n[iU2] = j11;
                this.f40289k[iU2] = j12;
                this.l[iU2] = i11;
                this.f40290m[iU2] = i10;
                this.f40292o[iU2] = zVar;
                this.f40288j[iU2] = this.C;
                if (((SparseArray) this.f40281c.f5364c).size() == 0) {
                    i1.p pVar3 = this.B;
                    pVar3.getClass();
                    hVar = this.f40282d;
                    if (hVar != null) {
                        hVar.getClass();
                        gVar = u1.g.f51660a;
                    } else {
                        gVar = u1.g.f51660a;
                    }
                    pVar = this.f40281c;
                    i13 = this.f40294q + this.f40293p;
                    z0 z0Var = new z0(pVar3, gVar);
                    sparseArray = (SparseArray) pVar.f5364c;
                    if (pVar.f5363b == -1) {
                        if (sparseArray.size() == 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        go.k.t(z11);
                        pVar.f5363b = 0;
                    }
                    if (sparseArray.size() > 0) {
                        iKeyAt = sparseArray.keyAt(sparseArray.size() - 1);
                        if (i13 >= iKeyAt) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        go.k.i(z10);
                        if (iKeyAt == i13) {
                            ((com.unity3d.ads.adplayer.b) pVar.f5365d).accept(sparseArray.valueAt(sparseArray.size() - 1));
                        }
                    }
                    sparseArray.append(i13, z0Var);
                } else {
                    SparseArray sparseArray2 = (SparseArray) this.f40281c.f5364c;
                    if (!((z0) sparseArray2.valueAt(sparseArray2.size() - 1)).f40534a.equals(this.B)) {
                        i1.p pVar4 = this.B;
                        pVar4.getClass();
                        hVar = this.f40282d;
                        if (hVar != null) {
                            hVar.getClass();
                            gVar = u1.g.f51660a;
                        } else {
                            gVar = u1.g.f51660a;
                        }
                        pVar = this.f40281c;
                        i13 = this.f40294q + this.f40293p;
                        z0 z0Var2 = new z0(pVar4, gVar);
                        sparseArray = (SparseArray) pVar.f5364c;
                        if (pVar.f5363b == -1) {
                            if (sparseArray.size() == 0) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            go.k.t(z11);
                            pVar.f5363b = 0;
                        }
                        if (sparseArray.size() > 0) {
                            iKeyAt = sparseArray.keyAt(sparseArray.size() - 1);
                            if (i13 >= iKeyAt) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            go.k.i(z10);
                            if (iKeyAt == i13) {
                                ((com.unity3d.ads.adplayer.b) pVar.f5365d).accept(sparseArray.valueAt(sparseArray.size() - 1));
                            }
                        }
                        sparseArray.append(i13, z0Var2);
                    }
                }
                int i16 = this.f40293p + 1;
                this.f40293p = i16;
                int i17 = this.f40287i;
                if (i16 == i17) {
                    int i18 = i17 + 1000;
                    long[] jArr = new long[i18];
                    long[] jArr2 = new long[i18];
                    long[] jArr3 = new long[i18];
                    int[] iArr = new int[i18];
                    int[] iArr2 = new int[i18];
                    n2.z[] zVarArr = new n2.z[i18];
                    int i19 = this.f40295r;
                    int i20 = i17 - i19;
                    System.arraycopy(this.f40289k, i19, jArr2, 0, i20);
                    System.arraycopy(this.f40291n, this.f40295r, jArr3, 0, i20);
                    System.arraycopy(this.f40290m, this.f40295r, iArr, 0, i20);
                    System.arraycopy(this.l, this.f40295r, iArr2, 0, i20);
                    System.arraycopy(this.f40292o, this.f40295r, zVarArr, 0, i20);
                    System.arraycopy(this.f40288j, this.f40295r, jArr, 0, i20);
                    int i21 = this.f40295r;
                    System.arraycopy(this.f40289k, 0, jArr2, i20, i21);
                    System.arraycopy(this.f40291n, 0, jArr3, i20, i21);
                    System.arraycopy(this.f40290m, 0, iArr, i20, i21);
                    System.arraycopy(this.l, 0, iArr2, i20, i21);
                    System.arraycopy(this.f40292o, 0, zVarArr, i20, i21);
                    System.arraycopy(this.f40288j, 0, jArr, i20, i21);
                    this.f40289k = jArr2;
                    this.f40291n = jArr3;
                    this.f40290m = iArr;
                    this.l = iArr2;
                    this.f40292o = zVarArr;
                    this.f40288j = jArr;
                    this.f40295r = 0;
                    this.f40287i = i18;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0059 A[Catch: all -> 0x0057, TryCatch #0 {all -> 0x0057, blocks: (B:4:0x000a, B:8:0x0016, B:13:0x0028, B:15:0x0041, B:19:0x005b, B:18:0x0059), top: B:29:0x000a }] */
    @Override // n2.a0
    public final void b(i1.p pVar) {
        i1.p pVarP = p(pVar);
        boolean z10 = false;
        this.f40303z = false;
        this.A = pVar;
        synchronized (this) {
            try {
                this.f40302y = false;
                if (!Objects.equals(pVarP, this.B)) {
                    if (((SparseArray) this.f40281c.f5364c).size() == 0) {
                        this.B = pVarP;
                    } else {
                        SparseArray sparseArray = (SparseArray) this.f40281c.f5364c;
                        if (((z0) sparseArray.valueAt(sparseArray.size() - 1)).f40534a.equals(pVarP)) {
                            SparseArray sparseArray2 = (SparseArray) this.f40281c.f5364c;
                            this.B = ((z0) sparseArray2.valueAt(sparseArray2.size() - 1)).f40534a;
                        } else {
                            this.B = pVarP;
                        }
                    }
                    boolean z11 = this.D;
                    i1.p pVar2 = this.B;
                    this.D = z11 & i1.d0.a(pVar2.f42643n, pVar2.f42641k);
                    this.E = false;
                    z10 = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        a1 a1Var = this.f40284f;
        if (a1Var == null || !z10) {
            return;
        }
        a1Var.h();
    }

    @Override // n2.a0
    public final void d(l1.q qVar, int i10, int i11) {
        while (true) {
            y0 y0Var = this.f40279a;
            if (i10 <= 0) {
                y0Var.getClass();
                return;
            }
            int iB = y0Var.b(i10);
            c7 c7Var = y0Var.f40532f;
            j2.a aVar = (j2.a) c7Var.f13072c;
            qVar.k(aVar.f43624a, ((int) (y0Var.f40533g - c7Var.f13070a)) + aVar.f43625b, iB);
            i10 -= iB;
            long j10 = y0Var.f40533g + ((long) iB);
            y0Var.f40533g = j10;
            c7 c7Var2 = y0Var.f40532f;
            if (j10 == c7Var2.f13071b) {
                y0Var.f40532f = (c7) c7Var2.f13073d;
            }
        }
    }

    @Override // n2.a0
    public final int f(i1.i iVar, int i10, boolean z10) throws EOFException {
        y0 y0Var = this.f40279a;
        int iB = y0Var.b(i10);
        c7 c7Var = y0Var.f40532f;
        j2.a aVar = (j2.a) c7Var.f13072c;
        int i11 = iVar.read(aVar.f43624a, ((int) (y0Var.f40533g - c7Var.f13070a)) + aVar.f43625b, iB);
        if (i11 == -1) {
            if (z10) {
                return -1;
            }
            throw new EOFException();
        }
        long j10 = y0Var.f40533g + ((long) i11);
        y0Var.f40533g = j10;
        c7 c7Var2 = y0Var.f40532f;
        if (j10 == c7Var2.f13071b) {
            y0Var.f40532f = (c7) c7Var2.f13073d;
        }
        return i11;
    }

    public final int h(long j10) {
        int i10 = this.f40293p;
        int iU = u(i10 - 1);
        while (i10 > this.f40296s && this.f40291n[iU] >= j10) {
            i10--;
            iU--;
            if (iU == -1) {
                iU = this.f40287i - 1;
            }
        }
        return i10;
    }

    public final long i(int i10) {
        this.f40298u = Math.max(this.f40298u, s(i10));
        this.f40293p -= i10;
        int i11 = this.f40294q + i10;
        this.f40294q = i11;
        int i12 = this.f40295r + i10;
        this.f40295r = i12;
        int i13 = this.f40287i;
        if (i12 >= i13) {
            this.f40295r = i12 - i13;
        }
        int i14 = this.f40296s - i10;
        this.f40296s = i14;
        int i15 = 0;
        if (i14 < 0) {
            this.f40296s = 0;
        }
        b2.p pVar = this.f40281c;
        SparseArray sparseArray = (SparseArray) pVar.f5364c;
        while (i15 < sparseArray.size() - 1) {
            int i16 = i15 + 1;
            if (i11 < sparseArray.keyAt(i16)) {
                break;
            }
            ((com.unity3d.ads.adplayer.b) pVar.f5365d).accept(sparseArray.valueAt(i15));
            sparseArray.removeAt(i15);
            int i17 = pVar.f5363b;
            if (i17 > 0) {
                pVar.f5363b = i17 - 1;
            }
            i15 = i16;
        }
        if (this.f40293p != 0) {
            return this.f40289k[this.f40295r];
        }
        int i18 = this.f40295r;
        if (i18 == 0) {
            i18 = this.f40287i;
        }
        int i19 = i18 - 1;
        return this.f40289k[i19] + ((long) this.l[i19]);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0013  */
    public final void j(long j10, boolean z10) throws Throwable {
        Throwable th2;
        y0 y0Var = this.f40279a;
        synchronized (this) {
            try {
                try {
                    int i10 = this.f40293p;
                    long jI = -1;
                    if (i10 != 0) {
                        long[] jArr = this.f40291n;
                        int i11 = this.f40295r;
                        if (j10 >= jArr[i11]) {
                            if (z10) {
                                try {
                                    int i12 = this.f40296s;
                                    if (i12 != i10) {
                                        i10 = i12 + 1;
                                    }
                                } catch (Throwable th3) {
                                    th2 = th3;
                                    throw th2;
                                }
                            }
                            int iO = o(i11, i10, j10, false);
                            if (iO != -1) {
                                jI = i(iO);
                            }
                        }
                    }
                    y0Var.a(jI);
                } catch (Throwable th4) {
                    th = th4;
                    th2 = th;
                    throw th2;
                }
            } catch (Throwable th5) {
                th = th5;
                th2 = th;
                throw th2;
            }
        }
    }

    public final void k() {
        long jI;
        y0 y0Var = this.f40279a;
        synchronized (this) {
            int i10 = this.f40293p;
            jI = i10 == 0 ? -1L : i(i10);
        }
        y0Var.a(jI);
    }

    public final void l(long j10) {
        if (this.f40293p == 0) {
            return;
        }
        go.k.i(j10 > r());
        n(this.f40294q + h(j10));
    }

    public final long m(int i10) {
        int i11 = this.f40294q;
        int i12 = this.f40293p;
        int i13 = (i11 + i12) - i10;
        boolean z10 = false;
        go.k.i(i13 >= 0 && i13 <= i12 - this.f40296s);
        int i14 = this.f40293p - i13;
        this.f40293p = i14;
        this.f40299v = Math.max(this.f40298u, s(i14));
        if (i13 == 0 && this.f40300w) {
            z10 = true;
        }
        this.f40300w = z10;
        b2.p pVar = this.f40281c;
        SparseArray sparseArray = (SparseArray) pVar.f5364c;
        for (int size = sparseArray.size() - 1; size >= 0 && i10 < sparseArray.keyAt(size); size--) {
            ((com.unity3d.ads.adplayer.b) pVar.f5365d).accept(sparseArray.valueAt(size));
            sparseArray.removeAt(size);
        }
        pVar.f5363b = sparseArray.size() > 0 ? Math.min(pVar.f5363b, sparseArray.size() - 1) : -1;
        int i15 = this.f40293p;
        if (i15 == 0) {
            return 0L;
        }
        int iU = u(i15 - 1);
        return this.f40289k[iU] + ((long) this.l[iU]);
    }

    public final void n(int i10) {
        y0 y0Var = this.f40279a;
        long jM = m(i10);
        int i11 = y0Var.f40528b;
        go.k.i(jM <= y0Var.f40533g);
        y0Var.f40533g = jM;
        if (jM != 0) {
            c7 c7Var = y0Var.f40530d;
            if (jM != c7Var.f13070a) {
                while (y0Var.f40533g > c7Var.f13071b) {
                    c7Var = (c7) c7Var.f13073d;
                }
                c7 c7Var2 = (c7) c7Var.f13073d;
                c7Var2.getClass();
                if (((j2.a) c7Var2.f13072c) != null) {
                    v9.e eVar = y0Var.f40527a;
                    synchronized (eVar) {
                        ((p1.f) eVar.f52505d).f48012c.b(c7Var2);
                        c7 c7Var3 = c7Var2;
                        while (c7Var3 != null) {
                            j2.a aVar = (j2.a) c7Var3.f13072c;
                            aVar.getClass();
                            eVar.J(aVar);
                            c7Var3 = (c7) c7Var3.f13073d;
                            if (c7Var3 == null || ((j2.a) c7Var3.f13072c) == null) {
                                c7Var3 = null;
                            }
                        }
                    }
                    c7Var2.f13072c = null;
                    c7Var2.f13073d = null;
                }
                c7 c7Var4 = new c7(c7Var.f13071b, i11);
                c7Var.f13073d = c7Var4;
                if (y0Var.f40533g == c7Var.f13071b) {
                    c7Var = c7Var4;
                }
                y0Var.f40532f = c7Var;
                if (y0Var.f40531e == c7Var2) {
                    y0Var.f40531e = c7Var4;
                    return;
                }
                return;
            }
        }
        c7 c7Var5 = y0Var.f40530d;
        if (((j2.a) c7Var5.f13072c) != null) {
            v9.e eVar2 = y0Var.f40527a;
            synchronized (eVar2) {
                ((p1.f) eVar2.f52505d).f48012c.b(c7Var5);
                c7 c7Var6 = c7Var5;
                while (c7Var6 != null) {
                    j2.a aVar2 = (j2.a) c7Var6.f13072c;
                    aVar2.getClass();
                    eVar2.J(aVar2);
                    c7Var6 = (c7) c7Var6.f13073d;
                    if (c7Var6 == null || ((j2.a) c7Var6.f13072c) == null) {
                        c7Var6 = null;
                    }
                }
            }
            c7Var5.f13072c = null;
            c7Var5.f13073d = null;
        }
        c7 c7Var7 = new c7(y0Var.f40533g, i11);
        y0Var.f40530d = c7Var7;
        y0Var.f40531e = c7Var7;
        y0Var.f40532f = c7Var7;
    }

    public final int o(int i10, int i11, long j10, boolean z10) {
        int i12 = -1;
        for (int i13 = 0; i13 < i11; i13++) {
            long j11 = this.f40291n[i10];
            if (j11 > j10) {
                break;
            }
            if (!z10 || (this.f40290m[i10] & 1) != 0) {
                if (j11 == j10) {
                    return i13;
                }
                i12 = i13;
            }
            i10++;
            if (i10 == this.f40287i) {
                i10 = 0;
            }
        }
        return i12;
    }

    public i1.p p(i1.p pVar) {
        if (this.F == 0 || pVar.f42648s == Long.MAX_VALUE) {
            return pVar;
        }
        i1.o oVarA = pVar.a();
        oVarA.f42605r = pVar.f42648s + this.F;
        return new i1.p(oVarA);
    }

    public final synchronized long q() {
        return this.f40299v;
    }

    public final synchronized long r() {
        return Math.max(this.f40298u, s(this.f40296s));
    }

    public final long s(int i10) {
        long jMax = Long.MIN_VALUE;
        if (i10 == 0) {
            return Long.MIN_VALUE;
        }
        int iU = u(i10 - 1);
        for (int i11 = 0; i11 < i10; i11++) {
            jMax = Math.max(jMax, this.f40291n[iU]);
            if ((this.f40290m[iU] & 1) != 0) {
                return jMax;
            }
            iU--;
            if (iU == -1) {
                iU = this.f40287i - 1;
            }
        }
        return jMax;
    }

    public final int t() {
        return this.f40294q + this.f40296s;
    }

    public final int u(int i10) {
        int i11 = this.f40295r + i10;
        int i12 = this.f40287i;
        return i11 < i12 ? i11 : i11 - i12;
    }

    public final synchronized int v(long j10, boolean z10) {
        try {
            try {
                int iU = u(this.f40296s);
                int i10 = this.f40296s;
                int i11 = this.f40293p;
                if (!(i10 != i11) || j10 < this.f40291n[iU]) {
                    return 0;
                }
                if (j10 > this.f40299v && z10) {
                    return i11 - i10;
                }
                int iO = o(iU, i11 - i10, j10, true);
                if (iO == -1) {
                    return 0;
                }
                return iO;
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    public final synchronized i1.p w() {
        return this.f40302y ? null : this.B;
    }

    public final synchronized boolean x(boolean z10) {
        i1.p pVar;
        boolean z11 = false;
        if (this.f40296s != this.f40293p) {
            if (((z0) this.f40281c.i(t())).f40534a != this.f40285g) {
                return true;
            }
            return y(u(this.f40296s));
        }
        if (z10 || this.f40300w || ((pVar = this.B) != null && pVar != this.f40285g)) {
            z11 = true;
        }
        return z11;
    }

    public final boolean y(int i10) {
        na.g gVar = this.f40286h;
        if (gVar == null || gVar.B() == 4) {
            return true;
        }
        if ((this.f40290m[i10] & 1073741824) != 0) {
            return false;
        }
        this.f40286h.getClass();
        return false;
    }

    public final void z() throws u1.c {
        na.g gVar = this.f40286h;
        if (gVar == null || gVar.B() != 1) {
            return;
        }
        u1.c cVarX = this.f40286h.x();
        cVarX.getClass();
        throw cVarX;
    }
}
