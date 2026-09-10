package u3;

import com.google.android.gms.internal.ads.ga;
import com.google.android.gms.internal.ads.xd1;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import l1.x;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class n implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f51813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xd1 f51814b = new xd1(new byte[10], 10);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f51815c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f51816d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public x f51817e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f51818f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f51819g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f51820h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f51821i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f51822j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f51823k;
    public long l;

    public n(f fVar) {
        this.f51813a = fVar;
    }

    @Override // u3.v
    public final void a(x xVar, n2.m mVar, ga gaVar) {
        this.f51817e = xVar;
        this.f51813a.g(mVar, gaVar);
    }

    @Override // u3.v
    public final void b(int i10, l1.q qVar) {
        this.f51817e.getClass();
        int i11 = i10 & 1;
        int i12 = -1;
        int i13 = 2;
        f fVar = this.f51813a;
        if (i11 != 0) {
            int i14 = this.f51815c;
            if (i14 != 0 && i14 != 1) {
                if (i14 == 2) {
                    l1.a.s("PesReader", "Unexpected start indicator reading extended header");
                } else {
                    if (i14 != 3) {
                        throw new IllegalStateException();
                    }
                    if (this.f51822j != -1) {
                        l1.a.s("PesReader", "Unexpected start indicator: expected " + this.f51822j + " more bytes");
                    }
                    fVar.d(qVar.f44815c == 0);
                }
            }
            this.f51815c = 1;
            this.f51816d = 0;
        }
        int i15 = i10;
        while (qVar.a() > 0) {
            int i16 = this.f51815c;
            if (i16 != 0) {
                xd1 xd1Var = this.f51814b;
                if (i16 != 1) {
                    if (i16 == i13) {
                        if (c(qVar, xd1Var.f21843b, Math.min(10, this.f51821i)) && c(qVar, null, this.f51821i)) {
                            xd1Var.q(0);
                            this.l = C.TIME_UNSET;
                            if (this.f51818f) {
                                xd1Var.t(4);
                                long jI = ((long) xd1Var.i(3)) << 30;
                                xd1Var.t(1);
                                long jI2 = ((long) (xd1Var.i(15) << 15)) | jI;
                                xd1Var.t(1);
                                long jI3 = jI2 | ((long) xd1Var.i(15));
                                xd1Var.t(1);
                                if (!this.f51820h && this.f51819g) {
                                    xd1Var.t(4);
                                    long jI4 = ((long) xd1Var.i(3)) << 30;
                                    xd1Var.t(1);
                                    long jI5 = jI4 | ((long) (xd1Var.i(15) << 15));
                                    xd1Var.t(1);
                                    long jI6 = jI5 | ((long) xd1Var.i(15));
                                    xd1Var.t(1);
                                    this.f51817e.b(jI6);
                                    this.f51820h = true;
                                }
                                this.l = this.f51817e.b(jI3);
                            }
                            i15 |= this.f51823k ? 4 : 0;
                            fVar.h(i15, this.l);
                            this.f51815c = 3;
                            this.f51816d = 0;
                        }
                    } else {
                        if (i16 != 3) {
                            throw new IllegalStateException();
                        }
                        int iA = qVar.a();
                        int i17 = this.f51822j;
                        int i18 = i17 == i12 ? 0 : iA - i17;
                        if (i18 > 0) {
                            iA -= i18;
                            qVar.L(qVar.f44814b + iA);
                        }
                        fVar.b(qVar);
                        int i19 = this.f51822j;
                        if (i19 != i12) {
                            int i20 = i19 - iA;
                            this.f51822j = i20;
                            if (i20 == 0) {
                                fVar.d(false);
                                this.f51815c = 1;
                                this.f51816d = 0;
                            }
                        }
                    }
                } else if (c(qVar, xd1Var.f21843b, 9)) {
                    this.f51815c = d() ? 2 : 0;
                    this.f51816d = 0;
                }
            } else {
                qVar.N(qVar.a());
            }
            i12 = -1;
            i13 = 2;
        }
    }

    public final boolean c(l1.q qVar, byte[] bArr, int i10) {
        int iMin = Math.min(qVar.a(), i10 - this.f51816d);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            qVar.N(iMin);
        } else {
            qVar.k(bArr, this.f51816d, iMin);
        }
        int i11 = this.f51816d + iMin;
        this.f51816d = i11;
        return i11 == i10;
    }

    public final boolean d() {
        xd1 xd1Var = this.f51814b;
        xd1Var.q(0);
        int i10 = xd1Var.i(24);
        if (i10 != 1) {
            d5.u.v(i10, "Unexpected start code prefix: ", "PesReader");
            this.f51822j = -1;
            return false;
        }
        xd1Var.t(8);
        int i11 = xd1Var.i(16);
        xd1Var.t(5);
        this.f51823k = xd1Var.h();
        xd1Var.t(2);
        this.f51818f = xd1Var.h();
        this.f51819g = xd1Var.h();
        xd1Var.t(6);
        int i12 = xd1Var.i(8);
        this.f51821i = i12;
        if (i11 == 0) {
            this.f51822j = -1;
        } else {
            int i13 = (i11 - 3) - i12;
            this.f51822j = i13;
            if (i13 < 0) {
                l1.a.s("PesReader", "Found negative packet payload size: " + this.f51822j);
                this.f51822j = -1;
            }
        }
        return true;
    }

    @Override // u3.v
    public final void seek() {
        this.f51815c = 0;
        this.f51816d = 0;
        this.f51820h = false;
        this.f51813a.seek();
    }
}
