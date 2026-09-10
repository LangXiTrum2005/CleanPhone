package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import java.io.EOFException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class n42 implements h3 {
    public boolean A;
    public g22 B;
    public boolean C;
    public boolean D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k42 f17645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b2.d0 f17646b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final pb f17647c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final s6 f17648d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public h42 f17649e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public g22 f17650f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public z61 f17651g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f17652h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long[] f17653i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long[] f17654j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int[] f17655k;
    public int[] l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long[] f17656m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public g3[] f17657n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f17658o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f17659p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f17660q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f17661r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f17662s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f17663t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f17664u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f17665v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f17666w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f17667x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f17668y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f17669z;

    public n42(u uVar, s6 s6Var, f81 f81Var) {
        this.f17648d = s6Var;
        k42 k42Var = new k42();
        k42Var.f16312b = uVar;
        k42Var.f16313c = new np0(32);
        c7 c7Var = new c7(0L);
        k42Var.f16314d = c7Var;
        k42Var.f16315e = c7Var;
        k42Var.f16316f = c7Var;
        this.f17645a = k42Var;
        this.f17646b = new b2.d0(3);
        this.f17652h = 1000;
        this.f17653i = new long[1000];
        this.f17654j = new long[1000];
        this.f17656m = new long[1000];
        this.l = new int[1000];
        this.f17655k = new int[1000];
        this.f17657n = new g3[1000];
        this.f17647c = new pb(9, false);
        this.f17662s = Long.MIN_VALUE;
        this.f17664u = Long.MIN_VALUE;
        this.f17665v = Long.MIN_VALUE;
        this.A = true;
        this.f17669z = true;
        this.C = true;
        this.f17663t = Long.MIN_VALUE;
        this.f17666w = -1;
        this.f17667x = -1;
    }

    public final void a(g22 g22Var, f81 f81Var) {
        g22 g22Var2 = this.f17650f;
        g02 g02Var = g22Var2 == null ? null : g22Var2.f14682s;
        this.f17650f = g22Var;
        g02 g02Var2 = g22Var.f14682s;
        this.f17648d.getClass();
        int i10 = g02Var2 != null ? 1 : 0;
        i12 i12Var = new i12(g22Var);
        i12Var.N = i10;
        f81Var.f14318c = new g22(i12Var);
        f81Var.f14317b = this.f17651g;
        if (g22Var2 == null || !Objects.equals(g02Var, g02Var2)) {
            z61 z61Var = g02Var2 != null ? new z61(new a22(new d22())) : null;
            this.f17651g = z61Var;
            f81Var.f14317b = z61Var;
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003c  */
    /* JADX WARN: Code duplicated, block: B:65:0x0100 A[Catch: all -> 0x0068, TryCatch #0 {all -> 0x0068, blocks: (B:22:0x0049, B:24:0x004e, B:28:0x0064, B:31:0x006b, B:35:0x0073, B:58:0x00b8, B:63:0x00e7, B:84:0x0150, B:86:0x0159, B:65:0x0100, B:67:0x0104, B:69:0x0116, B:73:0x011f, B:74:0x0124, B:76:0x012a, B:80:0x0138, B:82:0x013d, B:83:0x014d, B:92:0x01c7, B:38:0x008b, B:57:0x00b6, B:43:0x0094, B:45:0x0098, B:46:0x009b, B:48:0x00a5, B:52:0x00ac, B:56:0x00b4), top: B:95:0x0049 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x0104 A[Catch: all -> 0x0068, TryCatch #0 {all -> 0x0068, blocks: (B:22:0x0049, B:24:0x004e, B:28:0x0064, B:31:0x006b, B:35:0x0073, B:58:0x00b8, B:63:0x00e7, B:84:0x0150, B:86:0x0159, B:65:0x0100, B:67:0x0104, B:69:0x0116, B:73:0x011f, B:74:0x0124, B:76:0x012a, B:80:0x0138, B:82:0x013d, B:83:0x014d, B:92:0x01c7, B:38:0x008b, B:57:0x00b6, B:43:0x0094, B:45:0x0098, B:46:0x009b, B:48:0x00a5, B:52:0x00ac, B:56:0x00b4), top: B:95:0x0049 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x0116 A[Catch: all -> 0x0068, TryCatch #0 {all -> 0x0068, blocks: (B:22:0x0049, B:24:0x004e, B:28:0x0064, B:31:0x006b, B:35:0x0073, B:58:0x00b8, B:63:0x00e7, B:84:0x0150, B:86:0x0159, B:65:0x0100, B:67:0x0104, B:69:0x0116, B:73:0x011f, B:74:0x0124, B:76:0x012a, B:80:0x0138, B:82:0x013d, B:83:0x014d, B:92:0x01c7, B:38:0x008b, B:57:0x00b6, B:43:0x0094, B:45:0x0098, B:46:0x009b, B:48:0x00a5, B:52:0x00ac, B:56:0x00b4), top: B:95:0x0049 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x011c  */
    /* JADX WARN: Code duplicated, block: B:72:0x011e  */
    /* JADX WARN: Code duplicated, block: B:76:0x012a A[Catch: all -> 0x0068, TryCatch #0 {all -> 0x0068, blocks: (B:22:0x0049, B:24:0x004e, B:28:0x0064, B:31:0x006b, B:35:0x0073, B:58:0x00b8, B:63:0x00e7, B:84:0x0150, B:86:0x0159, B:65:0x0100, B:67:0x0104, B:69:0x0116, B:73:0x011f, B:74:0x0124, B:76:0x012a, B:80:0x0138, B:82:0x013d, B:83:0x014d, B:92:0x01c7, B:38:0x008b, B:57:0x00b6, B:43:0x0094, B:45:0x0098, B:46:0x009b, B:48:0x00a5, B:52:0x00ac, B:56:0x00b4), top: B:95:0x0049 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x0135  */
    /* JADX WARN: Code duplicated, block: B:79:0x0137  */
    /* JADX WARN: Code duplicated, block: B:82:0x013d A[Catch: all -> 0x0068, TryCatch #0 {all -> 0x0068, blocks: (B:22:0x0049, B:24:0x004e, B:28:0x0064, B:31:0x006b, B:35:0x0073, B:58:0x00b8, B:63:0x00e7, B:84:0x0150, B:86:0x0159, B:65:0x0100, B:67:0x0104, B:69:0x0116, B:73:0x011f, B:74:0x0124, B:76:0x012a, B:80:0x0138, B:82:0x013d, B:83:0x014d, B:92:0x01c7, B:38:0x008b, B:57:0x00b6, B:43:0x0094, B:45:0x0098, B:46:0x009b, B:48:0x00a5, B:52:0x00ac, B:56:0x00b4), top: B:95:0x0049 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x01c6  */
    @Override // com.google.android.gms.internal.ads.h3
    public final void c(long j10, int i10, int i11, int i12, g3 g3Var) {
        int i13;
        int i14;
        g22 g22Var;
        int i15;
        SparseArray sparseArray;
        int iKeyAt;
        boolean z10;
        boolean z11;
        if (this.f17669z) {
            if ((i10 & 1) == 0) {
                return;
            } else {
                this.f17669z = false;
            }
        }
        if (!this.C) {
            i13 = i10;
        } else {
            if (j10 < this.f17662s) {
                return;
            }
            if ((i10 & 1) == 0) {
                if (!this.D) {
                    v71.y("SampleQueue", "Overriding unexpected non-sync sample for format: ".concat(String.valueOf(this.B)));
                    this.D = true;
                }
                i13 = i10 | 1;
            } else {
                i13 = i10;
            }
        }
        long j11 = (this.f17645a.f16311a - ((long) i11)) - ((long) i12);
        synchronized (this) {
            try {
                int i16 = this.f17658o;
                if (i16 > 0) {
                    int iJ = j(i16 - 1);
                    ps1.v(this.f17654j[iJ] + ((long) this.f17655k[iJ]) <= j11);
                }
                int i17 = 536870912 & i13;
                this.f17668y = i17 != 0;
                this.f17665v = Math.max(this.f17665v, j10);
                int i18 = this.f17659p;
                int i19 = this.f17658o;
                int i20 = i18 + i19;
                long j12 = this.f17663t;
                if (j12 != Long.MIN_VALUE && this.f17666w == -1) {
                    if (j10 >= j12) {
                        int i21 = this.f17667x;
                        if (i21 == -1) {
                            this.f17667x = i20;
                            i21 = i20;
                        }
                        int i22 = (i20 - i21) + 1;
                        int i23 = i13 & 1;
                        g22 g22Var2 = this.B;
                        int i24 = 16;
                        if (g22Var2 != null && (i14 = g22Var2.f14680q) != -1) {
                            i24 = i14;
                        }
                        if (i22 >= i24 + 1 || i23 != 0 || i17 != 0) {
                            this.f17666w = i21;
                        }
                    }
                    this.f17667x = -1;
                }
                int iJ2 = j(i19);
                this.f17656m[iJ2] = j10;
                this.f17654j[iJ2] = j11;
                this.f17655k[iJ2] = i11;
                this.l[iJ2] = i13;
                this.f17657n[iJ2] = g3Var;
                this.f17653i[iJ2] = 0;
                pb pbVar = this.f17647c;
                if (((SparseArray) pbVar.f18583b).size() == 0) {
                    g22Var = this.B;
                    if (g22Var != null) {
                        throw null;
                    }
                    i15 = this.f17659p + this.f17658o;
                    m42 m42Var = new m42(g22Var);
                    sparseArray = (SparseArray) pbVar.f18583b;
                    if (pbVar.f18582a == -1) {
                        if (sparseArray.size() == 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        ps1.c0(z11);
                        pbVar.f18582a = 0;
                    }
                    if (sparseArray.size() > 0) {
                        iKeyAt = sparseArray.keyAt(sparseArray.size() - 1);
                        if (i15 >= iKeyAt) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        ps1.v(z10);
                        if (iKeyAt == i15) {
                            ((l42) pbVar.f18584c).mo161zza(sparseArray.valueAt(sparseArray.size() - 1));
                        }
                    }
                    sparseArray.append(i15, m42Var);
                } else {
                    SparseArray sparseArray2 = (SparseArray) pbVar.f18583b;
                    if (!((m42) sparseArray2.valueAt(sparseArray2.size() - 1)).f17245a.equals(this.B)) {
                        g22Var = this.B;
                        if (g22Var != null) {
                            throw null;
                        }
                        i15 = this.f17659p + this.f17658o;
                        m42 m42Var2 = new m42(g22Var);
                        sparseArray = (SparseArray) pbVar.f18583b;
                        if (pbVar.f18582a == -1) {
                            if (sparseArray.size() == 0) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            ps1.c0(z11);
                            pbVar.f18582a = 0;
                        }
                        if (sparseArray.size() > 0) {
                            iKeyAt = sparseArray.keyAt(sparseArray.size() - 1);
                            if (i15 >= iKeyAt) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            ps1.v(z10);
                            if (iKeyAt == i15) {
                                ((l42) pbVar.f18584c).mo161zza(sparseArray.valueAt(sparseArray.size() - 1));
                            }
                        }
                        sparseArray.append(i15, m42Var2);
                    }
                }
                int i25 = this.f17658o + 1;
                this.f17658o = i25;
                int i26 = this.f17652h;
                if (i25 == i26) {
                    int i27 = i26 + 1000;
                    long[] jArr = new long[i27];
                    long[] jArr2 = new long[i27];
                    long[] jArr3 = new long[i27];
                    int[] iArr = new int[i27];
                    int[] iArr2 = new int[i27];
                    g3[] g3VarArr = new g3[i27];
                    int i28 = this.f17660q;
                    int i29 = i26 - i28;
                    System.arraycopy(this.f17654j, i28, jArr2, 0, i29);
                    System.arraycopy(this.f17656m, this.f17660q, jArr3, 0, i29);
                    System.arraycopy(this.l, this.f17660q, iArr, 0, i29);
                    System.arraycopy(this.f17655k, this.f17660q, iArr2, 0, i29);
                    System.arraycopy(this.f17657n, this.f17660q, g3VarArr, 0, i29);
                    System.arraycopy(this.f17653i, this.f17660q, jArr, 0, i29);
                    int i30 = this.f17660q;
                    System.arraycopy(this.f17654j, 0, jArr2, i29, i30);
                    System.arraycopy(this.f17656m, 0, jArr3, i29, i30);
                    System.arraycopy(this.l, 0, iArr, i29, i30);
                    System.arraycopy(this.f17655k, 0, iArr2, i29, i30);
                    System.arraycopy(this.f17657n, 0, g3VarArr, i29, i30);
                    System.arraycopy(this.f17653i, 0, jArr, i29, i30);
                    this.f17654j = jArr2;
                    this.f17656m = jArr3;
                    this.l = iArr;
                    this.f17655k = iArr2;
                    this.f17657n = g3VarArr;
                    this.f17653i = jArr;
                    this.f17660q = 0;
                    this.f17652h = i27;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.h3
    public final int d(vx1 vx1Var, int i10, boolean z10) throws EOFException {
        k42 k42Var = this.f17645a;
        int iB = k42Var.b(i10);
        c7 c7Var = (c7) k42Var.f16316f;
        t tVar = (t) c7Var.f13072c;
        byte[] bArr = tVar.f20102a;
        long j10 = k42Var.f16311a - c7Var.f13070a;
        tVar.getClass();
        int iT = vx1Var.t(bArr, (int) j10, iB);
        if (iT == -1) {
            if (z10) {
                return -1;
            }
            throw new EOFException();
        }
        long j11 = k42Var.f16311a + ((long) iT);
        k42Var.f16311a = j11;
        c7 c7Var2 = (c7) k42Var.f16316f;
        if (j11 == c7Var2.f13071b) {
            k42Var.f16316f = (c7) c7Var2.f13073d;
        }
        return iT;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x004f A[Catch: all -> 0x004d, TryCatch #0 {all -> 0x004d, blocks: (B:4:0x0002, B:8:0x000e, B:13:0x0020, B:15:0x0038, B:19:0x0051, B:21:0x005f, B:25:0x0068, B:18:0x004f), top: B:35:0x0002 }] */
    @Override // com.google.android.gms.internal.ads.h3
    public final void f(g22 g22Var) {
        boolean z10;
        synchronized (this) {
            z10 = false;
            try {
                this.A = false;
                if (!Objects.equals(g22Var, this.B)) {
                    pb pbVar = this.f17647c;
                    if (((SparseArray) pbVar.f18583b).size() == 0) {
                        this.B = g22Var;
                    } else {
                        SparseArray sparseArray = (SparseArray) pbVar.f18583b;
                        if (((m42) sparseArray.valueAt(sparseArray.size() - 1)).f17245a.equals(g22Var)) {
                            SparseArray sparseArray2 = (SparseArray) pbVar.f18583b;
                            this.B = ((m42) sparseArray2.valueAt(sparseArray2.size() - 1)).f17245a;
                        } else {
                            this.B = g22Var;
                        }
                    }
                    boolean z11 = this.C;
                    g22 g22Var2 = this.B;
                    String str = g22Var2.f14678o;
                    this.C = z11 & (na.e(str) == 1 && na.c(str, g22Var2.f14675k));
                    this.D = false;
                    z10 = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        h42 h42Var = this.f17649e;
        if (h42Var == null || !z10) {
            return;
        }
        h42Var.f15137o.post(h42Var.f15135m);
    }

    @Override // com.google.android.gms.internal.ads.h3
    public final void g(np0 np0Var, int i10, int i11) {
        while (true) {
            k42 k42Var = this.f17645a;
            if (i10 <= 0) {
                k42Var.getClass();
                return;
            }
            int iB = k42Var.b(i10);
            c7 c7Var = (c7) k42Var.f16316f;
            t tVar = (t) c7Var.f13072c;
            byte[] bArr = tVar.f20102a;
            long j10 = k42Var.f16311a - c7Var.f13070a;
            tVar.getClass();
            np0Var.H(bArr, (int) j10, iB);
            i10 -= iB;
            long j11 = k42Var.f16311a + ((long) iB);
            k42Var.f16311a = j11;
            c7 c7Var2 = (c7) k42Var.f16316f;
            if (j11 == c7Var2.f13071b) {
                k42Var.f16316f = (c7) c7Var2.f13073d;
            }
        }
    }

    public final int h(int i10, int i11, long j10, boolean z10) {
        int i12 = -1;
        for (int i13 = 0; i13 < i11; i13++) {
            long j11 = this.f17656m[i10];
            if (j11 > j10) {
                break;
            }
            if (!z10 || (this.l[i10] & 1) != 0) {
                if (j11 == j10) {
                    return i13;
                }
                i12 = i13;
            }
            i10++;
            if (i10 == this.f17652h) {
                i10 = 0;
            }
        }
        return i12;
    }

    public final long i(int i10) {
        long j10 = this.f17664u;
        long jMax = Long.MIN_VALUE;
        int i11 = 0;
        if (i10 != 0) {
            int iJ = j(i10 - 1);
            for (int i12 = 0; i12 < i10; i12++) {
                jMax = Math.max(jMax, this.f17656m[iJ]);
                if ((this.l[iJ] & 1) != 0) {
                    break;
                }
                iJ--;
                if (iJ == -1) {
                    iJ = this.f17652h - 1;
                }
            }
        }
        this.f17664u = Math.max(j10, jMax);
        this.f17658o -= i10;
        int i13 = this.f17659p + i10;
        this.f17659p = i13;
        int i14 = this.f17660q + i10;
        this.f17660q = i14;
        int i15 = this.f17652h;
        if (i14 >= i15) {
            this.f17660q = i14 - i15;
        }
        int i16 = this.f17661r - i10;
        this.f17661r = i16;
        if (i16 < 0) {
            this.f17661r = 0;
        }
        while (true) {
            pb pbVar = this.f17647c;
            SparseArray sparseArray = (SparseArray) pbVar.f18583b;
            if (i11 >= sparseArray.size() - 1) {
                break;
            }
            int i17 = i11 + 1;
            if (i13 < sparseArray.keyAt(i17)) {
                break;
            }
            ((l42) pbVar.f18584c).mo161zza(sparseArray.valueAt(i11));
            sparseArray.removeAt(i11);
            int i18 = pbVar.f18582a;
            if (i18 > 0) {
                pbVar.f18582a = i18 - 1;
            }
            i11 = i17;
        }
        if (this.f17658o != 0) {
            return this.f17654j[this.f17660q];
        }
        int i19 = this.f17660q;
        if (i19 == 0) {
            i19 = this.f17652h;
        }
        int i20 = i19 - 1;
        return this.f17654j[i20] + ((long) this.f17655k[i20]);
    }

    public final int j(int i10) {
        int i11 = this.f17660q + i10;
        int i12 = this.f17652h;
        return i11 < i12 ? i11 : i11 - i12;
    }

    public final void k(boolean z10) {
        pb pbVar;
        SparseArray sparseArray;
        k42 k42Var = this.f17645a;
        u uVar = (u) k42Var.f16312b;
        c7 c7Var = (c7) k42Var.f16314d;
        if (((t) c7Var.f13072c) != null) {
            uVar.b(c7Var);
            c7Var.f13072c = null;
            c7Var.f13073d = null;
        }
        c7 c7Var2 = (c7) k42Var.f16314d;
        int i10 = 0;
        ps1.c0(((t) c7Var2.f13072c) == null);
        c7Var2.f13070a = 0L;
        c7Var2.f13071b = 65536L;
        c7 c7Var3 = (c7) k42Var.f16314d;
        k42Var.f16315e = c7Var3;
        k42Var.f16316f = c7Var3;
        k42Var.f16311a = 0L;
        uVar.zzd();
        this.f17658o = 0;
        this.f17659p = 0;
        this.f17660q = 0;
        this.f17661r = 0;
        this.f17666w = -1;
        this.f17667x = -1;
        this.f17669z = true;
        this.f17662s = Long.MIN_VALUE;
        this.f17664u = Long.MIN_VALUE;
        this.f17665v = Long.MIN_VALUE;
        this.f17668y = false;
        while (true) {
            pbVar = this.f17647c;
            sparseArray = (SparseArray) pbVar.f18583b;
            if (i10 >= sparseArray.size()) {
                break;
            }
            ((l42) pbVar.f18584c).mo161zza(sparseArray.valueAt(i10));
            i10++;
        }
        pbVar.f18582a = -1;
        sparseArray.clear();
        if (z10) {
            this.B = null;
            this.A = true;
            this.C = true;
        }
    }

    public final synchronized g22 l() {
        if (this.A) {
            return null;
        }
        return this.B;
    }

    public final synchronized boolean m(boolean z10) {
        int i10;
        try {
            int i11 = this.f17659p;
            int i12 = this.f17661r;
            int i13 = i11 + i12;
            int i14 = this.f17666w;
            boolean z11 = true;
            if (i14 != -1 && i13 >= i14) {
                return true;
            }
            if (i12 != this.f17658o) {
                if (!(i14 == -1 && (i10 = this.f17667x) != -1 && i11 + i12 >= i10)) {
                    if (((m42) this.f17647c.d(i13)).f17245a != this.f17650f) {
                        return true;
                    }
                    int iJ = j(this.f17661r);
                    if (this.f17651g != null) {
                        int i15 = this.l[iJ];
                        z11 = false;
                    }
                    return z11;
                }
            }
            if (!z10 && !this.f17668y) {
                g22 g22Var = this.B;
                if (g22Var == null) {
                    z11 = false;
                } else if (g22Var == this.f17650f) {
                    return false;
                }
            }
            return z11;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0097 */
    /* JADX WARN: Code duplicated, block: B:27:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized boolean n(long r11, boolean r13) throws java.lang.Throwable {
        /*
            r10 = this;
            monitor-enter(r10)
            monitor-enter(r10)     // Catch: java.lang.Throwable -> L88
            r0 = 0
            r10.f17661r = r0     // Catch: java.lang.Throwable -> L90
            com.google.android.gms.internal.ads.k42 r1 = r10.f17645a     // Catch: java.lang.Throwable -> L90
            java.lang.Object r2 = r1.f16314d     // Catch: java.lang.Throwable -> L90
            com.google.android.gms.internal.ads.c7 r2 = (com.google.android.gms.internal.ads.c7) r2     // Catch: java.lang.Throwable -> L90
            r1.f16315e = r2     // Catch: java.lang.Throwable -> L90
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L8d
            int r4 = r10.j(r0)     // Catch: java.lang.Throwable -> L83
            long r1 = r10.f17663t     // Catch: java.lang.Throwable -> L83
            r5 = -9223372036854775808
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 == 0) goto L26
            long r5 = r10.f17665v     // Catch: java.lang.Throwable -> L21
            long r1 = java.lang.Math.min(r5, r1)     // Catch: java.lang.Throwable -> L21
            goto L28
        L21:
            r0 = move-exception
            r11 = r0
            r3 = r10
            goto L99
        L26:
            long r1 = r10.f17665v     // Catch: java.lang.Throwable -> L83
        L28:
            int r3 = r10.f17661r     // Catch: java.lang.Throwable -> L88
            int r5 = r10.f17658o     // Catch: java.lang.Throwable -> L88
            r9 = 1
            if (r3 == r5) goto L31
            r6 = r9
            goto L32
        L31:
            r6 = r0
        L32:
            if (r6 == 0) goto L44
            long[] r6 = r10.f17656m     // Catch: java.lang.Throwable -> L83
            r6 = r6[r4]     // Catch: java.lang.Throwable -> L83
            int r6 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r6 < 0) goto L44
            int r1 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r1 <= 0) goto L46
            if (r13 == 0) goto L44
            r13 = r9
            goto L46
        L44:
            r3 = r10
            goto L86
        L46:
            boolean r1 = r10.C     // Catch: java.lang.Throwable -> L83
            r2 = -1
            if (r1 == 0) goto L6c
            int r5 = r5 - r3
            r1 = r0
        L4d:
            if (r1 >= r5) goto L65
            long[] r3 = r10.f17656m     // Catch: java.lang.Throwable -> L21
            r6 = r3[r4]     // Catch: java.lang.Throwable -> L21
            int r3 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r3 >= 0) goto L61
            int r4 = r4 + 1
            int r3 = r10.f17652h     // Catch: java.lang.Throwable -> L21
            if (r4 != r3) goto L5e
            r4 = r0
        L5e:
            int r1 = r1 + 1
            goto L4d
        L61:
            r3 = r10
            r6 = r11
            r5 = r1
            goto L74
        L65:
            r3 = r10
            r6 = r11
            if (r13 == 0) goto L6a
            goto L74
        L6a:
            r5 = r2
            goto L74
        L6c:
            int r5 = r5 - r3
            r8 = 1
            r3 = r10
            r6 = r11
            int r5 = r3.h(r4, r5, r6, r8)     // Catch: java.lang.Throwable -> L80
        L74:
            if (r5 != r2) goto L77
            goto L86
        L77:
            r3.f17662s = r6     // Catch: java.lang.Throwable -> L80
            int r10 = r3.f17661r     // Catch: java.lang.Throwable -> L80
            int r10 = r10 + r5
            r3.f17661r = r10     // Catch: java.lang.Throwable -> L80
            monitor-exit(r3)
            return r9
        L80:
            r0 = move-exception
        L81:
            r11 = r0
            goto L99
        L83:
            r0 = move-exception
            r3 = r10
            goto L81
        L86:
            monitor-exit(r3)
            return r0
        L88:
            r0 = move-exception
            r3 = r10
        L8a:
            r10 = r0
            r11 = r10
            goto L99
        L8d:
            r0 = move-exception
            r3 = r10
            goto L8a
        L90:
            r0 = move-exception
            r3 = r10
        L92:
            r10 = r0
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L97
            throw r10     // Catch: java.lang.Throwable -> L95
        L95:
            r0 = move-exception
            goto L8a
        L97:
            r0 = move-exception
            goto L92
        L99:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L80
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.n42.n(long, boolean):boolean");
    }

    public final void o() {
        long jI;
        k42 k42Var = this.f17645a;
        synchronized (this) {
            int i10 = this.f17658o;
            jI = i10 == 0 ? -1L : i(i10);
        }
        k42Var.a(jI);
    }
}
