package u3;

import com.google.android.gms.internal.ads.ga;
import com.google.android.gms.internal.ads.ma;
import com.google.android.gms.internal.ads.t0;
import com.google.android.gms.internal.ads.xd1;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import i1.d0;
import java.util.Objects;
import n2.a0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f51678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xd1 f51679b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l1.q f51680c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f51681d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f51682e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f51683f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f51684g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public a0 f51685h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f51686i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f51687j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f51688k;
    public long l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public i1.p f51689m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f51690n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f51691o;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(String str) {
        this(0, 0, null, str);
        this.f51678a = 0;
    }

    @Override // u3.f
    public final void b(l1.q qVar) {
        switch (this.f51678a) {
            case 0:
                this.f51685h.getClass();
                while (qVar.a() > 0) {
                    int i10 = this.f51686i;
                    l1.q qVar2 = this.f51680c;
                    if (i10 == 0) {
                        while (qVar.a() > 0) {
                            if (this.f51688k) {
                                int iZ = qVar.z();
                                if (iZ == 119) {
                                    this.f51688k = false;
                                    this.f51686i = 1;
                                    byte[] bArr = qVar2.f44813a;
                                    bArr[0] = 11;
                                    bArr[1] = 119;
                                    this.f51687j = 2;
                                }
                                this.f51688k = iZ == 11;
                            } else {
                                this.f51688k = qVar.z() == 11;
                            }
                            break;
                        }
                    } else if (i10 == 1) {
                        byte[] bArr2 = qVar2.f44813a;
                        int iMin = Math.min(qVar.a(), 128 - this.f51687j);
                        qVar.k(bArr2, this.f51687j, iMin);
                        int i11 = this.f51687j + iMin;
                        this.f51687j = i11;
                        if (i11 == 128) {
                            xd1 xd1Var = this.f51679b;
                            xd1Var.q(0);
                            ma maVarQ = n2.b.q(xd1Var);
                            int i12 = maVarQ.f17364e;
                            int i13 = maVarQ.f17360a;
                            int i14 = maVarQ.f17361b;
                            String str = (String) maVarQ.f17365f;
                            i1.p pVar = this.f51689m;
                            if (pVar == null || i14 != pVar.F || i13 != pVar.G || !Objects.equals(str, pVar.f42643n)) {
                                i1.o oVar = new i1.o();
                                oVar.f42589a = this.f51684g;
                                oVar.l = d0.n(this.f51683f);
                                oVar.f42600m = d0.n(str);
                                oVar.E = i14;
                                oVar.F = i13;
                                oVar.f42592d = this.f51681d;
                                oVar.f42594f = this.f51682e;
                                oVar.f42597i = i12;
                                if (MimeTypes.AUDIO_AC3.equals(str)) {
                                    oVar.f42596h = i12;
                                }
                                i1.p pVar2 = new i1.p(oVar);
                                this.f51689m = pVar2;
                                this.f51685h.b(pVar2);
                            }
                            this.f51690n = maVarQ.f17362c;
                            this.l = (((long) maVarQ.f17363d) * 1000000) / ((long) this.f51689m.G);
                            qVar2.M(0);
                            this.f51685h.g(128, qVar2);
                            this.f51686i = 2;
                        }
                    } else if (i10 == 2) {
                        int iMin2 = Math.min(qVar.a(), this.f51690n - this.f51687j);
                        this.f51685h.g(iMin2, qVar);
                        int i15 = this.f51687j + iMin2;
                        this.f51687j = i15;
                        if (i15 == this.f51690n) {
                            go.k.t(this.f51691o != C.TIME_UNSET);
                            this.f51685h.a(this.f51691o, 1, this.f51690n, 0, null);
                            this.f51691o += this.l;
                            this.f51686i = 0;
                        }
                    }
                }
                break;
            default:
                this.f51685h.getClass();
                while (qVar.a() > 0) {
                    int i16 = this.f51686i;
                    l1.q qVar3 = this.f51680c;
                    if (i16 == 0) {
                        while (qVar.a() > 0) {
                            if (this.f51688k) {
                                int iZ2 = qVar.z();
                                this.f51688k = iZ2 == 172;
                                if (iZ2 == 64 || iZ2 == 65) {
                                    boolean z10 = iZ2 == 65;
                                    this.f51686i = 1;
                                    byte[] bArr3 = qVar3.f44813a;
                                    bArr3[0] = -84;
                                    bArr3[1] = (byte) (z10 ? 65 : 64);
                                    this.f51687j = 2;
                                }
                            } else {
                                this.f51688k = qVar.z() == 172;
                            }
                            break;
                        }
                    } else if (i16 == 1) {
                        byte[] bArr4 = qVar3.f44813a;
                        int iMin3 = Math.min(qVar.a(), 16 - this.f51687j);
                        qVar.k(bArr4, this.f51687j, iMin3);
                        int i17 = this.f51687j + iMin3;
                        this.f51687j = i17;
                        if (i17 == 16) {
                            xd1 xd1Var2 = this.f51679b;
                            xd1Var2.q(0);
                            t0 t0VarR = n2.b.r(xd1Var2);
                            int i18 = t0VarR.f20103a;
                            i1.p pVar3 = this.f51689m;
                            if (pVar3 == null || 2 != pVar3.F || i18 != pVar3.G || !"audio/ac4".equals(pVar3.f42643n)) {
                                i1.o oVar2 = new i1.o();
                                oVar2.f42589a = this.f51684g;
                                oVar2.l = d0.n(this.f51683f);
                                oVar2.f42600m = d0.n("audio/ac4");
                                oVar2.E = 2;
                                oVar2.F = i18;
                                oVar2.f42592d = this.f51681d;
                                oVar2.f42594f = this.f51682e;
                                i1.p pVar4 = new i1.p(oVar2);
                                this.f51689m = pVar4;
                                this.f51685h.b(pVar4);
                            }
                            this.f51690n = t0VarR.f20104b;
                            this.l = (((long) t0VarR.f20105c) * 1000000) / ((long) this.f51689m.G);
                            qVar3.M(0);
                            this.f51685h.g(16, qVar3);
                            this.f51686i = 2;
                        }
                    } else if (i16 == 2) {
                        int iMin4 = Math.min(qVar.a(), this.f51690n - this.f51687j);
                        this.f51685h.g(iMin4, qVar);
                        int i19 = this.f51687j + iMin4;
                        this.f51687j = i19;
                        if (i19 == this.f51690n) {
                            go.k.t(this.f51691o != C.TIME_UNSET);
                            this.f51685h.a(this.f51691o, 1, this.f51690n, 0, null);
                            this.f51691o += this.l;
                            this.f51686i = 0;
                        }
                    }
                }
                break;
        }
    }

    @Override // u3.f
    public final void d(boolean z10) {
        int i10 = this.f51678a;
    }

    @Override // u3.f
    public final void g(n2.m mVar, ga gaVar) {
        switch (this.f51678a) {
            case 0:
                gaVar.a();
                gaVar.b();
                this.f51684g = gaVar.f14806e;
                gaVar.b();
                this.f51685h = mVar.track(gaVar.f14805d, 1);
                break;
            default:
                gaVar.a();
                gaVar.b();
                this.f51684g = gaVar.f14806e;
                gaVar.b();
                this.f51685h = mVar.track(gaVar.f14805d, 1);
                break;
        }
    }

    @Override // u3.f
    public final void h(int i10, long j10) {
        switch (this.f51678a) {
            case 0:
                this.f51691o = j10;
                break;
            default:
                this.f51691o = j10;
                break;
        }
    }

    @Override // u3.f
    public final void seek() {
        switch (this.f51678a) {
            case 0:
                this.f51686i = 0;
                this.f51687j = 0;
                this.f51688k = false;
                this.f51691o = C.TIME_UNSET;
                break;
            default:
                this.f51686i = 0;
                this.f51687j = 0;
                this.f51688k = false;
                this.f51691o = C.TIME_UNSET;
                break;
        }
    }

    public b(int i10, int i11, String str, String str2) {
        this.f51678a = i11;
        switch (i11) {
            case 1:
                xd1 xd1Var = new xd1(new byte[16], 16);
                this.f51679b = xd1Var;
                this.f51680c = new l1.q(xd1Var.f21843b);
                this.f51686i = 0;
                this.f51687j = 0;
                this.f51688k = false;
                this.f51691o = C.TIME_UNSET;
                this.f51681d = str;
                this.f51682e = i10;
                this.f51683f = str2;
                break;
            default:
                xd1 xd1Var2 = new xd1(new byte[128], 128);
                this.f51679b = xd1Var2;
                this.f51680c = new l1.q(xd1Var2.f21843b);
                this.f51686i = 0;
                this.f51691o = C.TIME_UNSET;
                this.f51681d = str;
                this.f51682e = i10;
                this.f51683f = str2;
                break;
        }
    }

    private final void a(boolean z10) {
    }

    private final void c(boolean z10) {
    }
}
