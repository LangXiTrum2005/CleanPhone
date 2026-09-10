package u3;

import com.google.android.gms.internal.ads.ga;
import com.google.android.gms.internal.ads.n9;
import com.google.android.gms.internal.ads.w9;
import com.google.android.gms.internal.ads.xd1;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import i1.d0;
import java.util.Arrays;
import java.util.Collections;
import l1.y;
import n2.a0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements f {
    public static final float[] l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qd.i f51755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l1.q f51756b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean[] f51757c = new boolean[4];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i f51758d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final w9 f51759e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public n9 f51760f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f51761g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f51762h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public a0 f51763i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f51764j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f51765k;

    public j(qd.i iVar) {
        this.f51755a = iVar;
        i iVar2 = new i();
        iVar2.f51754e = new byte[128];
        this.f51758d = iVar2;
        this.f51765k = C.TIME_UNSET;
        this.f51759e = new w9(178, 1);
        this.f51756b = new l1.q();
    }

    /* JADX WARN: Code duplicated, block: B:97:0x0232  */
    @Override // u3.f
    public final void b(l1.q qVar) {
        int i10;
        int i11;
        boolean z10;
        int i12;
        int i13;
        float f10;
        this.f51760f.getClass();
        this.f51763i.getClass();
        int i14 = qVar.f44814b;
        int i15 = qVar.f44815c;
        byte[] bArr = qVar.f44813a;
        this.f51761g += (long) qVar.a();
        this.f51763i.g(qVar.a(), qVar);
        while (true) {
            int iB = m1.n.b(bArr, i14, i15, this.f51757c);
            i iVar = this.f51758d;
            w9 w9Var = this.f51759e;
            if (iB == i15) {
                if (!this.f51764j) {
                    iVar.a(bArr, i14, i15);
                }
                this.f51760f.a(bArr, i14, i15);
                if (w9Var != null) {
                    w9Var.a(bArr, i14, i15);
                    return;
                }
                return;
            }
            int i16 = iB + 3;
            byte b10 = qVar.f44813a[i16];
            int i17 = b10 & 255;
            int i18 = iB - i14;
            if (this.f51764j) {
                i10 = i15;
                i11 = i16;
            } else {
                if (i18 > 0) {
                    iVar.a(bArr, i14, iB);
                }
                int i19 = i18 < 0 ? -i18 : 0;
                int i20 = iVar.f51751b;
                if (i20 != 0) {
                    i10 = i15;
                    if (i20 == 1) {
                        i11 = i16;
                        i13 = 0;
                        if (i17 != 181) {
                            l1.a.s("H263Reader", "Unexpected start code value");
                            iVar.f51750a = false;
                            iVar.f51752c = 0;
                            iVar.f51751b = 0;
                        } else {
                            iVar.f51751b = 2;
                        }
                    } else if (i20 != 2) {
                        i11 = i16;
                        if (i20 != 3) {
                            if (i20 != 4) {
                                throw new IllegalStateException();
                            }
                            if (i17 == 179 || i17 == 181) {
                                iVar.f51752c -= i19;
                                iVar.f51750a = false;
                                a0 a0Var = this.f51763i;
                                int i21 = iVar.f51753d;
                                String str = this.f51762h;
                                str.getClass();
                                byte[] bArrCopyOf = Arrays.copyOf(iVar.f51754e, iVar.f51752c);
                                xd1 xd1Var = new xd1(bArrCopyOf, bArrCopyOf.length);
                                xd1Var.u(i21);
                                xd1Var.u(4);
                                xd1Var.s();
                                xd1Var.t(8);
                                if (xd1Var.h()) {
                                    xd1Var.t(4);
                                    xd1Var.t(3);
                                }
                                int i22 = xd1Var.i(4);
                                if (i22 == 15) {
                                    int i23 = xd1Var.i(8);
                                    int i24 = xd1Var.i(8);
                                    if (i24 == 0) {
                                        l1.a.s("H263Reader", "Invalid aspect ratio");
                                        f10 = 1.0f;
                                    } else {
                                        f10 = i23 / i24;
                                    }
                                } else if (i22 < 7) {
                                    f10 = l[i22];
                                } else {
                                    l1.a.s("H263Reader", "Invalid aspect ratio");
                                    f10 = 1.0f;
                                }
                                if (xd1Var.h()) {
                                    xd1Var.t(2);
                                    xd1Var.t(1);
                                    if (xd1Var.h()) {
                                        xd1Var.t(15);
                                        xd1Var.s();
                                        xd1Var.t(15);
                                        xd1Var.s();
                                        xd1Var.t(15);
                                        xd1Var.s();
                                        xd1Var.t(3);
                                        xd1Var.t(11);
                                        xd1Var.s();
                                        xd1Var.t(15);
                                        xd1Var.s();
                                    }
                                }
                                if (xd1Var.i(2) != 0) {
                                    l1.a.s("H263Reader", "Unhandled video object layer shape");
                                }
                                xd1Var.s();
                                int i25 = xd1Var.i(16);
                                xd1Var.s();
                                if (xd1Var.h()) {
                                    if (i25 == 0) {
                                        l1.a.s("H263Reader", "Invalid vop_increment_time_resolution");
                                    } else {
                                        int i26 = 0;
                                        for (int i27 = i25 - 1; i27 > 0; i27 >>= 1) {
                                            i26++;
                                        }
                                        xd1Var.t(i26);
                                    }
                                }
                                xd1Var.s();
                                int i28 = xd1Var.i(13);
                                xd1Var.s();
                                int i29 = xd1Var.i(13);
                                xd1Var.s();
                                xd1Var.s();
                                i1.o oVar = new i1.o();
                                oVar.f42589a = str;
                                oVar.l = d0.n("video/mp2t");
                                oVar.f42600m = d0.n(MimeTypes.VIDEO_MP4V);
                                oVar.f42607t = i28;
                                oVar.f42608u = i29;
                                oVar.f42613z = f10;
                                oVar.f42603p = Collections.singletonList(bArrCopyOf);
                                q4.a.o(oVar, a0Var);
                                this.f51764j = true;
                            } else {
                                i13 = 0;
                            }
                        } else if ((b10 & 240) != 32) {
                            l1.a.s("H263Reader", "Unexpected start code value");
                            i13 = 0;
                            iVar.f51750a = false;
                            iVar.f51752c = 0;
                            iVar.f51751b = 0;
                        } else {
                            i13 = 0;
                            iVar.f51753d = iVar.f51752c;
                            iVar.f51751b = 4;
                        }
                    } else {
                        i11 = i16;
                        i13 = 0;
                        if (i17 > 31) {
                            l1.a.s("H263Reader", "Unexpected start code value");
                            iVar.f51750a = false;
                            iVar.f51752c = 0;
                            iVar.f51751b = 0;
                        } else {
                            iVar.f51751b = 3;
                        }
                    }
                } else {
                    i10 = i15;
                    i11 = i16;
                    i13 = 0;
                    if (i17 == 176) {
                        iVar.f51751b = 1;
                        iVar.f51750a = true;
                    }
                }
                iVar.a(i.f51749f, i13, 3);
            }
            this.f51760f.a(bArr, i14, iB);
            if (w9Var == null) {
                z10 = true;
            } else {
                if (i18 > 0) {
                    w9Var.a(bArr, i14, iB);
                    i12 = 0;
                } else {
                    i12 = -i18;
                }
                if (w9Var.b(i12)) {
                    int iN = m1.n.n(w9Var.f21460d, w9Var.f21461e);
                    String str2 = y.f44830a;
                    byte[] bArr2 = w9Var.f21460d;
                    l1.q qVar2 = this.f51756b;
                    qVar2.K(bArr2, iN);
                    this.f51755a.l(this.f51765k, qVar2);
                }
                if (i17 == 178) {
                    z10 = true;
                    if (qVar.f44813a[iB + 2] == 1) {
                        w9Var.d(i17);
                    }
                } else {
                    z10 = true;
                }
            }
            int i30 = i10 - iB;
            this.f51760f.b(this.f51761g - ((long) i30), i30, this.f51764j);
            n9 n9Var = this.f51760f;
            long j10 = this.f51765k;
            n9Var.f17718d = i17;
            n9Var.f17717c = false;
            n9Var.f17715a = (i17 == 182 || i17 == 179) ? z10 : false;
            n9Var.f17716b = i17 == 182 ? z10 : false;
            n9Var.f17719e = 0;
            n9Var.f17721g = j10;
            i15 = i10;
            i14 = i11;
        }
    }

    @Override // u3.f
    public final void d(boolean z10) {
        this.f51760f.getClass();
        if (z10) {
            this.f51760f.b(this.f51761g, 0, this.f51764j);
            n9 n9Var = this.f51760f;
            n9Var.f17715a = false;
            n9Var.f17716b = false;
            n9Var.f17717c = false;
            n9Var.f17718d = -1;
        }
    }

    @Override // u3.f
    public final void g(n2.m mVar, ga gaVar) {
        gaVar.a();
        gaVar.b();
        this.f51762h = gaVar.f14806e;
        gaVar.b();
        a0 a0VarTrack = mVar.track(gaVar.f14805d, 2);
        this.f51763i = a0VarTrack;
        this.f51760f = new n9(a0VarTrack);
        this.f51755a.n(mVar, gaVar);
    }

    @Override // u3.f
    public final void h(int i10, long j10) {
        this.f51765k = j10;
    }

    @Override // u3.f
    public final void seek() {
        m1.n.a(this.f51757c);
        i iVar = this.f51758d;
        iVar.f51750a = false;
        iVar.f51752c = 0;
        iVar.f51751b = 0;
        n9 n9Var = this.f51760f;
        if (n9Var != null) {
            n9Var.f17715a = false;
            n9Var.f17716b = false;
            n9Var.f17717c = false;
            n9Var.f17718d = -1;
        }
        w9 w9Var = this.f51759e;
        if (w9Var != null) {
            w9Var.c();
        }
        this.f51761g = 0L;
        this.f51765k = C.TIME_UNSET;
    }
}
