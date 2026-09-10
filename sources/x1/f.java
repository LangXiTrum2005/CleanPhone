package x1;

import android.graphics.Bitmap;
import android.os.Trace;
import b2.d0;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import go.k;
import i1.p;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import m0.s1;
import p1.h;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends p1.a {
    public int A;
    public int B;
    public p C;
    public b D;
    public o1.d E;
    public d F;
    public Bitmap G;
    public boolean H;
    public d0 I;
    public d0 J;
    public int K;
    public boolean L;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e5.f f53561s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final o1.d f53562t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final ArrayDeque f53563u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f53564v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f53565w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public e f53566x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f53567y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f53568z;

    public f(e5.f fVar) {
        super(4);
        this.f53561s = fVar;
        this.F = d.f53557a;
        this.f53562t = new o1.d(0);
        this.f53566x = e.f53558c;
        this.f53563u = new ArrayDeque();
        this.f53568z = C.TIME_UNSET;
        this.f53567y = C.TIME_UNSET;
        this.A = 0;
        this.B = 1;
    }

    @Override // p1.a
    public final int A(p pVar) {
        this.f53561s.getClass();
        return e5.f.a(pVar);
    }

    /* JADX WARN: Code duplicated, block: B:45:0x008a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x008c  */
    /* JADX WARN: Code duplicated, block: B:47:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:52:0x00da  */
    /* JADX WARN: Code duplicated, block: B:55:0x00df A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x00e1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:57:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:60:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:66:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:69:0x0104  */
    /* JADX WARN: Code duplicated, block: B:77:0x012d  */
    /* JADX WARN: Code duplicated, block: B:79:0x0146  */
    public final boolean D(long j10) throws h {
        boolean z10;
        d0 d0Var;
        boolean z11;
        int i10;
        boolean z12;
        int i11;
        int i12;
        p pVar;
        Bitmap bitmapCreateBitmap;
        Bitmap bitmap = this.G;
        if ((bitmap == null || this.I != null) && (this.B != 0 || this.f47912h == 2)) {
            ArrayDeque arrayDeque = this.f53563u;
            if (bitmap == null) {
                this.D.getClass();
                a aVar = (a) this.D.dequeueOutputBuffer();
                if (aVar != null) {
                    if (!aVar.c(4)) {
                        k.o(aVar.f53553e, "Non-EOS buffer came back from the decoder without bitmap.");
                        this.G = aVar.f53553e;
                        aVar.h();
                        if (this.H && this.G != null && this.I != null) {
                            this.C.getClass();
                            p pVar2 = this.C;
                            int i13 = pVar2.M;
                            int i14 = pVar2.N;
                            z10 = ((i13 != 1 && i14 == 1) || i13 == -1 || i14 == -1) ? false : true;
                            d0Var = this.I;
                            if (((Bitmap) d0Var.f5247d) == null) {
                                if (z10) {
                                    int i15 = d0Var.f5246c;
                                    this.G.getClass();
                                    int width = this.G.getWidth();
                                    p pVar3 = this.C;
                                    pVar3.getClass();
                                    int i16 = width / pVar3.M;
                                    int height = this.G.getHeight();
                                    p pVar4 = this.C;
                                    pVar4.getClass();
                                    int i17 = height / pVar4.N;
                                    int i18 = this.C.M;
                                    bitmapCreateBitmap = Bitmap.createBitmap(this.G, (i15 % i18) * i16, (i15 / i18) * i17, i16, i17);
                                } else {
                                    bitmapCreateBitmap = this.G;
                                    bitmapCreateBitmap.getClass();
                                }
                                d0Var.f5247d = bitmapCreateBitmap;
                            }
                            ((Bitmap) this.I.f5247d).getClass();
                            long j11 = this.I.f5245b - j10;
                            if (this.f47912h == 2) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            i10 = this.B;
                            if (i10 != 0) {
                                if (i10 != 1) {
                                    z11 = true;
                                } else {
                                    if (i10 == 3) {
                                        throw new IllegalStateException();
                                    }
                                    z11 = false;
                                }
                            }
                            if (!z11 || j11 < 30000) {
                                d dVar = this.F;
                                long j12 = this.f53566x.f53560b;
                                dVar.getClass();
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if (z12) {
                                d0 d0Var2 = this.I;
                                d0Var2.getClass();
                                long j13 = d0Var2.f5245b;
                                this.f53567y = j13;
                                while (!arrayDeque.isEmpty() && j13 >= ((e) arrayDeque.peek()).f53559a) {
                                    this.f53566x = (e) arrayDeque.removeFirst();
                                }
                                this.B = 3;
                                if (z10) {
                                    d0 d0Var3 = this.I;
                                    d0Var3.getClass();
                                    i11 = d0Var3.f5246c;
                                    p pVar5 = this.C;
                                    pVar5.getClass();
                                    i12 = pVar5.N;
                                    pVar = this.C;
                                    pVar.getClass();
                                    if (i11 == (i12 * pVar.M) - 1) {
                                        this.G = null;
                                    }
                                } else {
                                    this.G = null;
                                }
                                this.I = this.J;
                                this.J = null;
                                return true;
                            }
                        }
                    } else {
                        if (this.A == 3) {
                            G();
                            this.C.getClass();
                            F();
                            return false;
                        }
                        aVar.h();
                        if (arrayDeque.isEmpty()) {
                            this.f53565w = true;
                            return false;
                        }
                    }
                }
            } else if (this.H) {
                this.C.getClass();
                p pVar6 = this.C;
                int i19 = pVar6.M;
                int i110 = pVar6.N;
                if (i19 != 1) {
                }
                d0Var = this.I;
                if (((Bitmap) d0Var.f5247d) == null) {
                    if (z10) {
                        int i111 = d0Var.f5246c;
                        this.G.getClass();
                        int width2 = this.G.getWidth();
                        p pVar7 = this.C;
                        pVar7.getClass();
                        int i112 = width2 / pVar7.M;
                        int height2 = this.G.getHeight();
                        p pVar8 = this.C;
                        pVar8.getClass();
                        int i113 = height2 / pVar8.N;
                        int i114 = this.C.M;
                        bitmapCreateBitmap = Bitmap.createBitmap(this.G, (i111 % i114) * i112, (i111 / i114) * i113, i112, i113);
                    } else {
                        bitmapCreateBitmap = this.G;
                        bitmapCreateBitmap.getClass();
                    }
                    d0Var.f5247d = bitmapCreateBitmap;
                }
                ((Bitmap) this.I.f5247d).getClass();
                long j14 = this.I.f5245b - j10;
                if (this.f47912h == 2) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                i10 = this.B;
                if (i10 != 0) {
                    if (i10 != 1) {
                        z11 = true;
                    } else {
                        if (i10 == 3) {
                            throw new IllegalStateException();
                        }
                        z11 = false;
                    }
                }
                if (z11) {
                    d dVar2 = this.F;
                    long j15 = this.f53566x.f53560b;
                    dVar2.getClass();
                    z12 = true;
                } else {
                    d dVar3 = this.F;
                    long j16 = this.f53566x.f53560b;
                    dVar3.getClass();
                    z12 = true;
                }
                if (z12) {
                    d0 d0Var4 = this.I;
                    d0Var4.getClass();
                    long j17 = d0Var4.f5245b;
                    this.f53567y = j17;
                    while (!arrayDeque.isEmpty()) {
                        this.f53566x = (e) arrayDeque.removeFirst();
                    }
                    this.B = 3;
                    if (z10) {
                        d0 d0Var5 = this.I;
                        d0Var5.getClass();
                        i11 = d0Var5.f5246c;
                        p pVar9 = this.C;
                        pVar9.getClass();
                        i12 = pVar9.N;
                        pVar = this.C;
                        pVar.getClass();
                        if (i11 == (i12 * pVar.M) - 1) {
                            this.G = null;
                        }
                    } else {
                        this.G = null;
                    }
                    this.I = this.J;
                    this.J = null;
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x002f  */
    /* JADX WARN: Code duplicated, block: B:21:0x0036  */
    /* JADX WARN: Code duplicated, block: B:23:0x004e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0058  */
    /* JADX WARN: Code duplicated, block: B:27:0x005b  */
    /* JADX WARN: Code duplicated, block: B:30:0x0060  */
    /* JADX WARN: Code duplicated, block: B:32:0x0066  */
    /* JADX WARN: Code duplicated, block: B:36:0x0077  */
    /* JADX WARN: Code duplicated, block: B:38:0x0082  */
    /* JADX WARN: Code duplicated, block: B:39:0x0084  */
    /* JADX WARN: Code duplicated, block: B:41:0x0087  */
    /* JADX WARN: Code duplicated, block: B:44:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:60:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:69:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:75:0x0105  */
    /* JADX WARN: Code duplicated, block: B:80:0x010d  */
    /* JADX WARN: Code duplicated, block: B:83:0x011e  */
    /* JADX WARN: Code duplicated, block: B:85:0x0123  */
    /* JADX WARN: Code duplicated, block: B:87:0x0134  */
    /* JADX WARN: Code duplicated, block: B:88:0x0137  */
    /* JADX WARN: Code duplicated, block: B:91:0x0143  */
    public final boolean E(long j10) {
        int iV;
        ByteBuffer byteBuffer;
        o1.d dVar;
        boolean z10;
        o1.d dVar2;
        long j11;
        boolean z11;
        d0 d0Var;
        boolean z12;
        p pVar;
        boolean z13;
        boolean z14;
        p pVar2;
        int i10;
        o1.d dVar3;
        if (!this.H || this.I == null) {
            s1 s1Var = this.f47907c;
            s1Var.c();
            b bVar = this.D;
            if (bVar != null && this.A != 3 && !this.f53564v) {
                if (this.E == null) {
                    o1.d dVar4 = (o1.d) bVar.dequeueInputBuffer();
                    this.E = dVar4;
                    if (dVar4 != null) {
                        if (this.A == 2) {
                            this.E.getClass();
                            this.E.f22444b = 4;
                            b bVar2 = this.D;
                            bVar2.getClass();
                            bVar2.b(this.E);
                            this.E = null;
                            this.A = 3;
                            return false;
                        }
                        iV = v(s1Var, this.E, 0);
                        if (iV != -5) {
                            p pVar3 = (p) s1Var.f45752c;
                            pVar3.getClass();
                            this.C = pVar3;
                            this.L = true;
                            this.A = 2;
                            return true;
                        }
                        if (iV != -4) {
                            this.E.j();
                            byteBuffer = this.E.f47035e;
                            if (byteBuffer != null || byteBuffer.remaining() <= 0) {
                                dVar = this.E;
                                dVar.getClass();
                                if (dVar.c(4)) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                            } else {
                                z10 = true;
                            }
                            if (z10) {
                                o1.d dVar5 = this.E;
                                dVar5.getClass();
                                dVar5.f47033c = this.C;
                                b bVar3 = this.D;
                                bVar3.getClass();
                                o1.d dVar6 = this.E;
                                dVar6.getClass();
                                bVar3.b(dVar6);
                                this.K = 0;
                            }
                            dVar2 = this.E;
                            dVar2.getClass();
                            if (dVar2.c(4)) {
                                this.H = true;
                            } else {
                                int i11 = this.K;
                                j11 = dVar2.f47037g;
                                this.J = new d0(i11, j11);
                                this.K = i11 + 1;
                                if (this.H) {
                                    this.I = this.J;
                                    this.J = null;
                                } else {
                                    if (j11 - 30000 <= j10 || j10 > 30000 + j11) {
                                        z11 = false;
                                    } else {
                                        z11 = true;
                                    }
                                    d0Var = this.I;
                                    if (d0Var != null || d0Var.f5245b > j10 || j10 >= j11) {
                                        z12 = false;
                                    } else {
                                        z12 = true;
                                    }
                                    pVar = this.C;
                                    pVar.getClass();
                                    if (pVar.M != -1 || (i10 = (pVar2 = this.C).N) == -1 || i11 == (i10 * pVar2.M) - 1) {
                                        z13 = true;
                                    } else {
                                        z13 = false;
                                    }
                                    if (!z11 || z12 || z13) {
                                        z14 = true;
                                    } else {
                                        z14 = false;
                                    }
                                    this.H = z14;
                                    if (z12 || z11) {
                                        this.I = this.J;
                                        this.J = null;
                                    }
                                }
                            }
                            dVar3 = this.E;
                            dVar3.getClass();
                            if (dVar3.c(4)) {
                                this.f53564v = true;
                                this.E = null;
                                return false;
                            }
                            long j12 = this.f53568z;
                            o1.d dVar7 = this.E;
                            dVar7.getClass();
                            this.f53568z = Math.max(j12, dVar7.f47037g);
                            if (z10) {
                                this.E = null;
                            } else {
                                o1.d dVar8 = this.E;
                                dVar8.getClass();
                                dVar8.g();
                            }
                            return !this.H;
                        }
                        if (iV != -3) {
                            throw new IllegalStateException();
                        }
                    }
                } else {
                    if (this.A == 2) {
                        this.E.getClass();
                        this.E.f22444b = 4;
                        b bVar4 = this.D;
                        bVar4.getClass();
                        bVar4.b(this.E);
                        this.E = null;
                        this.A = 3;
                        return false;
                    }
                    iV = v(s1Var, this.E, 0);
                    if (iV != -5) {
                        p pVar4 = (p) s1Var.f45752c;
                        pVar4.getClass();
                        this.C = pVar4;
                        this.L = true;
                        this.A = 2;
                        return true;
                    }
                    if (iV != -4) {
                        this.E.j();
                        byteBuffer = this.E.f47035e;
                        if (byteBuffer != null) {
                            dVar = this.E;
                            dVar.getClass();
                            if (dVar.c(4)) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                        } else {
                            dVar = this.E;
                            dVar.getClass();
                            if (dVar.c(4)) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                        }
                        if (z10) {
                            o1.d dVar9 = this.E;
                            dVar9.getClass();
                            dVar9.f47033c = this.C;
                            b bVar5 = this.D;
                            bVar5.getClass();
                            o1.d dVar10 = this.E;
                            dVar10.getClass();
                            bVar5.b(dVar10);
                            this.K = 0;
                        }
                        dVar2 = this.E;
                        dVar2.getClass();
                        if (dVar2.c(4)) {
                            this.H = true;
                        } else {
                            int i12 = this.K;
                            j11 = dVar2.f47037g;
                            this.J = new d0(i12, j11);
                            this.K = i12 + 1;
                            if (this.H) {
                                this.I = this.J;
                                this.J = null;
                            } else {
                                if (j11 - 30000 <= j10) {
                                    z11 = false;
                                } else {
                                    z11 = false;
                                }
                                d0Var = this.I;
                                if (d0Var != null) {
                                    z12 = false;
                                } else {
                                    z12 = false;
                                }
                                pVar = this.C;
                                pVar.getClass();
                                if (pVar.M != -1) {
                                    z13 = true;
                                } else {
                                    z13 = true;
                                }
                                if (z11) {
                                    z14 = true;
                                } else {
                                    z14 = true;
                                }
                                this.H = z14;
                                if (z12) {
                                    this.I = this.J;
                                    this.J = null;
                                } else {
                                    this.I = this.J;
                                    this.J = null;
                                }
                            }
                        }
                        dVar3 = this.E;
                        dVar3.getClass();
                        if (dVar3.c(4)) {
                            this.f53564v = true;
                            this.E = null;
                            return false;
                        }
                        long j13 = this.f53568z;
                        o1.d dVar11 = this.E;
                        dVar11.getClass();
                        this.f53568z = Math.max(j13, dVar11.f47037g);
                        if (z10) {
                            this.E = null;
                        } else {
                            o1.d dVar12 = this.E;
                            dVar12.getClass();
                            dVar12.g();
                        }
                        return !this.H;
                    }
                    if (iV != -3) {
                        throw new IllegalStateException();
                    }
                }
            }
        }
        return false;
    }

    public final void F() throws h {
        if (this.L) {
            p pVar = this.C;
            pVar.getClass();
            e5.f fVar = this.f53561s;
            fVar.getClass();
            int iA = e5.f.a(pVar);
            if (iA != p1.a.c(4, 0, 0, 0) && iA != p1.a.c(3, 0, 0, 0)) {
                throw d(new c("Provided decoder factory can't create decoder for format."), this.C, false, 4005);
            }
            b bVar = this.D;
            if (bVar != null) {
                bVar.release();
            }
            this.D = new b(fVar.f39094b);
            this.L = false;
        }
    }

    public final void G() {
        this.E = null;
        this.A = 0;
        this.f53568z = C.TIME_UNSET;
        b bVar = this.D;
        if (bVar != null) {
            bVar.release();
            this.D = null;
        }
    }

    @Override // p1.a
    public final String h() {
        return "ImageRenderer";
    }

    @Override // p1.a, p1.y0
    public final void handleMessage(int i10, Object obj) {
        if (i10 != 15) {
            return;
        }
        d dVar = obj instanceof d ? (d) obj : null;
        if (dVar == null) {
            dVar = d.f53557a;
        }
        this.F = dVar;
    }

    @Override // p1.a
    public final boolean j() {
        return this.f53565w;
    }

    @Override // p1.a
    public final boolean l() {
        int i10 = this.B;
        if (i10 != 3) {
            return i10 == 0 && this.H;
        }
        return true;
    }

    @Override // p1.a
    public final void m() {
        this.C = null;
        this.f53566x = e.f53558c;
        this.f53563u.clear();
        G();
        this.F.getClass();
    }

    @Override // p1.a
    public final void n(boolean z10, boolean z11) {
        this.B = z11 ? 1 : 0;
    }

    @Override // p1.a
    public final void o(long j10, boolean z10, boolean z11) {
        this.B = Math.min(this.B, 1);
        this.f53565w = false;
        this.f53564v = false;
        this.G = null;
        this.I = null;
        this.J = null;
        this.H = false;
        this.E = null;
        b bVar = this.D;
        if (bVar != null) {
            bVar.flush();
        }
        this.f53563u.clear();
    }

    @Override // p1.a
    public final void p() {
        G();
    }

    @Override // p1.a
    public final void q() {
        G();
        this.B = Math.min(this.B, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
    
        if (r2 >= r6) goto L15;
     */
    @Override // p1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void t(i1.p[] r5, long r6, long r8, f2.c0 r10) {
        /*
            r4 = this;
            x1.e r5 = r4.f53566x
            long r5 = r5.f53560b
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r5 == 0) goto L31
            java.util.ArrayDeque r5 = r4.f53563u
            boolean r6 = r5.isEmpty()
            if (r6 == 0) goto L26
            long r6 = r4.f53568z
            int r10 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r10 == 0) goto L31
            long r2 = r4.f53567y
            int r10 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r10 == 0) goto L26
            int r6 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r6 < 0) goto L26
            goto L31
        L26:
            x1.e r6 = new x1.e
            long r0 = r4.f53568z
            r6.<init>(r0, r8)
            r5.add(r6)
            return
        L31:
            x1.e r5 = new x1.e
            r5.<init>(r0, r8)
            r4.f53566x = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: x1.f.t(i1.p[], long, long, f2.c0):void");
    }

    @Override // p1.a
    public final void w(long j10, long j11) throws h {
        if (this.f53565w) {
            return;
        }
        if (this.C == null) {
            s1 s1Var = this.f47907c;
            s1Var.c();
            o1.d dVar = this.f53562t;
            dVar.g();
            int iV = v(s1Var, dVar, 2);
            if (iV != -5) {
                if (iV == -4) {
                    k.t(dVar.c(4));
                    this.f53564v = true;
                    this.f53565w = true;
                    return;
                }
                return;
            }
            p pVar = (p) s1Var.f45752c;
            pVar.getClass();
            this.C = pVar;
            this.L = true;
        }
        if (this.D == null) {
            F();
        }
        try {
            Trace.beginSection("drainAndFeedDecoder");
            while (D(j10)) {
            }
            while (E(j10)) {
            }
            Trace.endSection();
        } catch (c e10) {
            throw d(e10, null, false, 4003);
        }
    }
}
