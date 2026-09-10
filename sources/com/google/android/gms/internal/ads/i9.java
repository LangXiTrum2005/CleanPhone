package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class i9 implements j9, u3.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f15659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f15660c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f15661d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f15662e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f15663f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f15664g;

    public i9(int i10) {
        this.f15658a = i10;
        switch (i10) {
            case 3:
                this.f15663f = new l1.q(10);
                this.f15660c = C.TIME_UNSET;
                break;
            default:
                this.f15663f = new np0(10);
                this.f15660c = C.TIME_UNSET;
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.j9
    public void a(boolean z10) {
        int i10;
        switch (this.f15658a) {
            case 0:
                if (this.f15659b) {
                    ps1.c0(this.f15660c != C.TIME_UNSET);
                    for (h3 h3Var : (h3[]) this.f15664g) {
                        h3Var.c(this.f15660c, 1, this.f15662e, 0, null);
                    }
                    this.f15659b = false;
                }
                break;
            default:
                ((h3) this.f15664g).getClass();
                if (this.f15659b && (i10 = this.f15661d) != 0 && this.f15662e == i10) {
                    ps1.c0(this.f15660c != C.TIME_UNSET);
                    ((h3) this.f15664g).c(this.f15660c, 1, this.f15661d, 0, null);
                    this.f15659b = false;
                    break;
                }
                break;
        }
    }

    @Override // u3.f
    public void b(l1.q qVar) {
        boolean z10;
        boolean z11;
        switch (this.f15658a) {
            case 2:
                if (this.f15659b) {
                    if (this.f15661d == 2) {
                        if (qVar.a() == 0) {
                            z11 = false;
                        } else {
                            if (qVar.z() != 32) {
                                this.f15659b = false;
                            }
                            this.f15661d--;
                            z11 = this.f15659b;
                        }
                        if (!z11) {
                        }
                    }
                    if (this.f15661d == 1) {
                        if (qVar.a() == 0) {
                            z10 = false;
                        } else {
                            if (qVar.z() != 0) {
                                this.f15659b = false;
                            }
                            this.f15661d--;
                            z10 = this.f15659b;
                        }
                        if (!z10) {
                        }
                    }
                    int i10 = qVar.f44814b;
                    int iA = qVar.a();
                    for (n2.a0 a0Var : (n2.a0[]) this.f15664g) {
                        qVar.M(i10);
                        a0Var.g(iA, qVar);
                    }
                    this.f15662e += iA;
                }
                break;
            default:
                l1.q qVar2 = (l1.q) this.f15663f;
                ((n2.a0) this.f15664g).getClass();
                if (this.f15659b) {
                    int iA2 = qVar.a();
                    int i11 = this.f15662e;
                    if (i11 < 10) {
                        int iMin = Math.min(iA2, 10 - i11);
                        System.arraycopy(qVar.f44813a, qVar.f44814b, qVar2.f44813a, this.f15662e, iMin);
                        if (this.f15662e + iMin == 10) {
                            qVar2.M(0);
                            if (73 == qVar2.z() && 68 == qVar2.z() && 51 == qVar2.z()) {
                                qVar2.N(3);
                                this.f15661d = qVar2.y() + 10;
                            } else {
                                l1.a.s("Id3Reader", "Discarding invalid ID3 tag");
                                this.f15659b = false;
                            }
                        }
                    }
                    int iMin2 = Math.min(iA2, this.f15661d - this.f15662e);
                    ((n2.a0) this.f15664g).g(iMin2, qVar);
                    this.f15662e += iMin2;
                    break;
                }
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.j9
    public void c(int i10, long j10) {
        switch (this.f15658a) {
            case 0:
                if ((i10 & 4) != 0) {
                    this.f15659b = true;
                    this.f15660c = j10;
                    this.f15662e = 0;
                    this.f15661d = 2;
                    break;
                }
                break;
            default:
                if ((i10 & 4) != 0) {
                    this.f15659b = true;
                    this.f15660c = j10;
                    this.f15661d = 0;
                    this.f15662e = 0;
                    break;
                }
                break;
        }
    }

    @Override // u3.f
    public void d(boolean z10) {
        int i10;
        switch (this.f15658a) {
            case 2:
                if (this.f15659b) {
                    go.k.t(this.f15660c != C.TIME_UNSET);
                    for (n2.a0 a0Var : (n2.a0[]) this.f15664g) {
                        a0Var.a(this.f15660c, 1, this.f15662e, 0, null);
                    }
                    this.f15659b = false;
                }
                break;
            default:
                ((n2.a0) this.f15664g).getClass();
                if (this.f15659b && (i10 = this.f15661d) != 0 && this.f15662e == i10) {
                    go.k.t(this.f15660c != C.TIME_UNSET);
                    ((n2.a0) this.f15664g).a(this.f15660c, 1, this.f15661d, 0, null);
                    this.f15659b = false;
                    break;
                }
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.j9
    public void e(o2 o2Var, ga gaVar) {
        switch (this.f15658a) {
            case 0:
                int i10 = 0;
                while (true) {
                    h3[] h3VarArr = (h3[]) this.f15664g;
                    if (i10 < h3VarArr.length) {
                        fa faVar = (fa) ((List) this.f15663f).get(i10);
                        gaVar.c();
                        gaVar.d();
                        h3 h3VarE = o2Var.e(gaVar.f14805d, 3);
                        i12 i12Var = new i12();
                        gaVar.d();
                        i12Var.f15499a = gaVar.f14806e;
                        i12Var.d("video/mp2t");
                        i12Var.e(MimeTypes.APPLICATION_DVBSUBS);
                        i12Var.f15514q = Collections.singletonList(faVar.f14349b);
                        i12Var.f15502d = faVar.f14348a;
                        h3VarE.f(new g22(i12Var));
                        h3VarArr[i10] = h3VarE;
                        i10++;
                    }
                    break;
                }
                break;
            default:
                gaVar.c();
                gaVar.d();
                h3 h3VarE2 = o2Var.e(gaVar.f14805d, 5);
                this.f15664g = h3VarE2;
                i12 i12Var2 = new i12();
                gaVar.d();
                i12Var2.f15499a = gaVar.f14806e;
                i12Var2.d("video/mp2t");
                i12Var2.e(MimeTypes.APPLICATION_ID3);
                h3VarE2.f(new g22(i12Var2));
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.j9
    public void f(np0 np0Var) {
        boolean z10;
        boolean z11;
        switch (this.f15658a) {
            case 0:
                if (this.f15659b) {
                    if (this.f15661d == 2) {
                        if (np0Var.B() == 0) {
                            z11 = false;
                        } else {
                            if (np0Var.K() != 32) {
                                this.f15659b = false;
                            }
                            this.f15661d--;
                            z11 = this.f15659b;
                        }
                        if (!z11) {
                        }
                    }
                    if (this.f15661d == 1) {
                        if (np0Var.B() == 0) {
                            z10 = false;
                        } else {
                            if (np0Var.K() != 0) {
                                this.f15659b = false;
                            }
                            this.f15661d--;
                            z10 = this.f15659b;
                        }
                        if (!z10) {
                        }
                    }
                    int i10 = np0Var.f17881b;
                    int iB = np0Var.B();
                    for (h3 h3Var : (h3[]) this.f15664g) {
                        np0Var.E(i10);
                        h3Var.b(iB, np0Var);
                    }
                    this.f15662e += iB;
                }
                break;
            default:
                ((h3) this.f15664g).getClass();
                if (this.f15659b) {
                    int iB2 = np0Var.B();
                    int i11 = this.f15662e;
                    if (i11 < 10) {
                        int iMin = Math.min(iB2, 10 - i11);
                        byte[] bArr = np0Var.f17880a;
                        int i12 = np0Var.f17881b;
                        np0 np0Var2 = (np0) this.f15663f;
                        System.arraycopy(bArr, i12, np0Var2.f17880a, this.f15662e, iMin);
                        if (this.f15662e + iMin == 10) {
                            np0Var2.E(0);
                            if (np0Var2.K() == 73 && np0Var2.K() == 68 && np0Var2.K() == 51) {
                                np0Var2.G(3);
                                this.f15661d = np0Var2.g() + 10;
                            } else {
                                v71.y("Id3Reader", "Discarding invalid ID3 tag");
                                this.f15659b = false;
                            }
                        }
                    }
                    int iMin2 = Math.min(iB2, this.f15661d - this.f15662e);
                    ((h3) this.f15664g).b(iMin2, np0Var);
                    this.f15662e += iMin2;
                    break;
                }
                break;
        }
    }

    @Override // u3.f
    public void g(n2.m mVar, ga gaVar) {
        switch (this.f15658a) {
            case 2:
                n2.a0[] a0VarArr = (n2.a0[]) this.f15664g;
                for (int i10 = 0; i10 < a0VarArr.length; i10++) {
                    u3.u uVar = (u3.u) ((List) this.f15663f).get(i10);
                    gaVar.a();
                    gaVar.b();
                    n2.a0 a0VarTrack = mVar.track(gaVar.f14805d, 3);
                    i1.o oVar = new i1.o();
                    gaVar.b();
                    oVar.f42589a = gaVar.f14806e;
                    oVar.l = i1.d0.n("video/mp2t");
                    oVar.f42600m = i1.d0.n(MimeTypes.APPLICATION_DVBSUBS);
                    oVar.f42603p = Collections.singletonList(uVar.f51877b);
                    oVar.f42592d = uVar.f51876a;
                    q4.a.o(oVar, a0VarTrack);
                    a0VarArr[i10] = a0VarTrack;
                }
                break;
            default:
                gaVar.a();
                gaVar.b();
                n2.a0 a0VarTrack2 = mVar.track(gaVar.f14805d, 5);
                this.f15664g = a0VarTrack2;
                i1.o oVar2 = new i1.o();
                gaVar.b();
                oVar2.f42589a = gaVar.f14806e;
                oVar2.l = i1.d0.n("video/mp2t");
                oVar2.f42600m = i1.d0.n(MimeTypes.APPLICATION_ID3);
                q4.a.o(oVar2, a0VarTrack2);
                break;
        }
    }

    @Override // u3.f
    public void h(int i10, long j10) {
        switch (this.f15658a) {
            case 2:
                if ((i10 & 4) != 0) {
                    this.f15659b = true;
                    this.f15660c = j10;
                    this.f15662e = 0;
                    this.f15661d = 2;
                    break;
                }
                break;
            default:
                if ((i10 & 4) != 0) {
                    this.f15659b = true;
                    this.f15660c = j10;
                    this.f15661d = 0;
                    this.f15662e = 0;
                    break;
                }
                break;
        }
    }

    @Override // u3.f
    public void seek() {
        switch (this.f15658a) {
            case 2:
                this.f15659b = false;
                this.f15660c = C.TIME_UNSET;
                break;
            default:
                this.f15659b = false;
                this.f15660c = C.TIME_UNSET;
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.j9
    public void zza() {
        switch (this.f15658a) {
            case 0:
                this.f15659b = false;
                this.f15660c = C.TIME_UNSET;
                break;
            default:
                this.f15659b = false;
                this.f15660c = C.TIME_UNSET;
                break;
        }
    }

    public i9(List list, int i10) {
        this.f15658a = i10;
        switch (i10) {
            case 2:
                this.f15663f = list;
                this.f15664g = new n2.a0[list.size()];
                this.f15660c = C.TIME_UNSET;
                break;
            default:
                this.f15663f = list;
                this.f15664g = new h3[list.size()];
                this.f15660c = C.TIME_UNSET;
                break;
        }
    }
}
