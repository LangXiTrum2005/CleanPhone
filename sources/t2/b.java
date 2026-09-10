package t2;

import com.google.android.gms.internal.ads.q2;
import com.google.android.gms.internal.ads.xd1;
import com.google.android.gms.internal.ads.z1;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import i1.d0;
import i1.e0;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import l1.q;
import n2.a0;
import n2.h;
import n2.j;
import n2.k;
import n2.l;
import n2.m;
import n2.o;
import n2.r;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f50418a = new q(4);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f50419b = new q(9);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f50420c = new q(11);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q f50421d = new q();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c f50422e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public m f50423f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f50424g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f50425h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f50426i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f50427j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f50428k;
    public int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f50429m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f50430n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public a f50431o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public d f50432p;

    public b() {
        c cVar = new c(new j());
        cVar.f50433b = C.TIME_UNSET;
        cVar.f50434c = new long[0];
        cVar.f50435d = new long[0];
        this.f50422e = cVar;
        this.f50424g = 1;
    }

    @Override // n2.k
    public final boolean a(l lVar) {
        q qVar = this.f50418a;
        h hVar = (h) lVar;
        hVar.peekFully(qVar.f44813a, 0, 3, false);
        qVar.M(0);
        if (qVar.C() == 4607062) {
            hVar.peekFully(qVar.f44813a, 0, 2, false);
            qVar.M(0);
            if ((qVar.G() & 250) == 0) {
                hVar.peekFully(qVar.f44813a, 0, 4, false);
                qVar.M(0);
                int iM = qVar.m();
                hVar.f46468f = 0;
                hVar.b(iM, false);
                hVar.peekFully(qVar.f44813a, 0, 4, false);
                qVar.M(0);
                if (qVar.m() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:102:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:145:0x03ac  */
    /* JADX WARN: Code duplicated, block: B:146:0x03b0  */
    /* JADX WARN: Code duplicated, block: B:184:0x03bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:194:0x0009 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x017b  */
    /* JADX WARN: Code duplicated, block: B:61:0x017f  */
    @Override // n2.k
    public final int b(l lVar, q2 q2Var) throws e0 {
        long j10;
        long j11;
        int i10;
        int i11;
        long j12;
        boolean z10;
        boolean z11;
        long j13;
        boolean z12;
        this.f50423f.getClass();
        while (true) {
            int i12 = this.f50424g;
            if (i12 == 1) {
                q qVar = this.f50419b;
                if (!lVar.readFully(qVar.f44813a, 0, 9, true)) {
                    return -1;
                }
                qVar.M(0);
                qVar.N(4);
                int iZ = qVar.z();
                boolean z13 = (iZ & 4) != 0;
                boolean z14 = (iZ & 1) != 0;
                if (z13 && this.f50431o == null) {
                    this.f50431o = new a(this.f50423f.track(8, 1));
                }
                if (z14 && this.f50432p == null) {
                    this.f50432p = new d(this.f50423f.track(9, 2));
                }
                this.f50423f.endTracks();
                this.f50427j = qVar.m() - 5;
                this.f50424g = 2;
            } else if (i12 == 2) {
                lVar.skipFully(this.f50427j);
                this.f50427j = 0;
                this.f50424g = 3;
            } else if (i12 == 3) {
                q qVar2 = this.f50420c;
                if (!lVar.readFully(qVar2.f44813a, 0, 11, true)) {
                    return -1;
                }
                qVar2.M(0);
                this.f50428k = qVar2.z();
                this.l = qVar2.C();
                this.f50429m = qVar2.C();
                this.f50429m = (((long) (qVar2.z() << 24)) | this.f50429m) * 1000;
                qVar2.N(3);
                this.f50424g = 4;
            } else {
                if (i12 != 4) {
                    throw new IllegalStateException();
                }
                boolean z15 = this.f50425h;
                c cVar = this.f50422e;
                if (z15) {
                    j10 = this.f50426i + this.f50429m;
                } else {
                    if (cVar.f50433b == C.TIME_UNSET) {
                        j11 = 0;
                    } else {
                        j10 = this.f50429m;
                    }
                    i10 = this.f50428k;
                    if (i10 == 8 || this.f50431o == null) {
                        i11 = 0;
                        if (i10 == 9 || this.f50432p == null) {
                            j12 = -9223372036854775807L;
                            if (i10 == 18 || this.f50430n) {
                                lVar.skipFully(this.l);
                                z10 = false;
                                z11 = false;
                            } else {
                                q qVarE = e(lVar);
                                cVar.getClass();
                                cVar.getClass();
                                if (qVarE.z() == 2 && "onMetaData".equals(c.J0(qVarE)) && qVarE.a() != 0 && qVarE.z() == 8) {
                                    HashMap mapI0 = c.I0(qVarE);
                                    Object obj = mapI0.get(IronSourceConstants.EVENTS_DURATION);
                                    double d10 = 1000000.0d;
                                    if (obj instanceof Double) {
                                        double dDoubleValue = ((Double) obj).doubleValue();
                                        if (dDoubleValue > 0.0d) {
                                            cVar.f50433b = (long) (dDoubleValue * 1000000.0d);
                                        }
                                    }
                                    Object obj2 = mapI0.get("keyframes");
                                    if (obj2 instanceof Map) {
                                        Map map = (Map) obj2;
                                        Object obj3 = map.get("filepositions");
                                        Object obj4 = map.get("times");
                                        if ((obj3 instanceof List) && (obj4 instanceof List)) {
                                            List list = (List) obj3;
                                            List list2 = (List) obj4;
                                            int size = list2.size();
                                            cVar.f50434c = new long[size];
                                            cVar.f50435d = new long[size];
                                            int i13 = 0;
                                            while (i13 < size) {
                                                Object obj5 = list.get(i13);
                                                Object obj6 = list2.get(i13);
                                                if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                                                    cVar.f50434c = new long[0];
                                                    cVar.f50435d = new long[0];
                                                    break;
                                                }
                                                double d11 = d10;
                                                cVar.f50434c[i13] = (long) (((Double) obj6).doubleValue() * d11);
                                                cVar.f50435d[i13] = ((Double) obj5).longValue();
                                                i13++;
                                                d10 = d11;
                                            }
                                        }
                                    }
                                }
                                long j14 = cVar.f50433b;
                                if (j14 != C.TIME_UNSET) {
                                    this.f50423f.u(new r(cVar.f50435d, cVar.f50434c, j14));
                                    this.f50430n = true;
                                }
                            }
                        } else {
                            if (!this.f50430n) {
                                this.f50423f.u(new o(C.TIME_UNSET));
                                this.f50430n = true;
                            }
                            d dVar = this.f50432p;
                            q qVarE2 = e(lVar);
                            dVar.getClass();
                            int iZ2 = qVarE2.z();
                            int i14 = (iZ2 >> 4) & 15;
                            int i15 = iZ2 & 15;
                            if (i15 != 7) {
                                throw new e2.d(l1.d.e(i15, "Video format not supported: "), 1);
                            }
                            dVar.f50441g = i14;
                            if (i14 != 5) {
                                q qVar3 = dVar.f50436b;
                                a0 a0Var = (a0) dVar.f3623a;
                                q qVar4 = dVar.f50437c;
                                int iZ3 = qVarE2.z();
                                qVarE2.f(3);
                                byte[] bArr = qVarE2.f44813a;
                                j12 = -9223372036854775807L;
                                int i16 = qVarE2.f44814b;
                                int i17 = i16 + 1;
                                qVarE2.f44814b = i17;
                                int i18 = ((bArr[i16] & 255) << 24) >> 8;
                                int i19 = i16 + 2;
                                qVarE2.f44814b = i19;
                                int i20 = ((bArr[i17] & 255) << 8) | i18;
                                qVarE2.f44814b = i16 + 3;
                                long j15 = (((long) ((bArr[i19] & 255) | i20)) * 1000) + j11;
                                boolean z16 = false;
                                if (iZ3 == 0 && !dVar.f50439e) {
                                    byte[] bArr2 = new byte[qVarE2.a()];
                                    q qVar5 = new q(bArr2);
                                    qVarE2.k(bArr2, 0, qVarE2.a());
                                    z1 z1VarA = z1.a(qVar5);
                                    dVar.f50438d = z1VarA.f22447b;
                                    i1.o oVar = new i1.o();
                                    oVar.l = d0.n("video/x-flv");
                                    oVar.f42600m = d0.n("video/avc");
                                    oVar.f42598j = z1VarA.l;
                                    oVar.f42607t = z1VarA.f22448c;
                                    oVar.f42608u = z1VarA.f22449d;
                                    oVar.f42613z = z1VarA.f22456k;
                                    oVar.f42603p = z1VarA.f22446a;
                                    q4.a.o(oVar, a0Var);
                                    dVar.f50439e = true;
                                } else if (iZ3 == 1 && dVar.f50439e) {
                                    int i21 = dVar.f50441g == 1 ? 1 : 0;
                                    if (dVar.f50440f || i21 != 0) {
                                        byte[] bArr3 = qVar4.f44813a;
                                        bArr3[0] = 0;
                                        bArr3[1] = 0;
                                        bArr3[2] = 0;
                                        int i22 = 4 - dVar.f50438d;
                                        int i23 = 0;
                                        while (qVarE2.a() > 0) {
                                            qVarE2.k(qVar4.f44813a, i22, dVar.f50438d);
                                            qVar4.M(0);
                                            int iD = qVar4.D();
                                            qVar3.M(0);
                                            a0Var.g(4, qVar3);
                                            a0Var.g(iD, qVarE2);
                                            i23 = i23 + 4 + iD;
                                        }
                                        ((a0) dVar.f3623a).a(j15, i21, i23, 0, null);
                                        dVar.f50440f = true;
                                        z16 = true;
                                    }
                                }
                                if (z16) {
                                    z10 = true;
                                }
                                z11 = true;
                            } else {
                                j12 = -9223372036854775807L;
                            }
                        }
                        z10 = false;
                        z11 = true;
                    } else {
                        if (!this.f50430n) {
                            this.f50423f.u(new o(C.TIME_UNSET));
                            this.f50430n = true;
                        }
                        a aVar = this.f50431o;
                        q qVarE3 = e(lVar);
                        a0 a0Var2 = (a0) aVar.f3623a;
                        if (aVar.f50415b) {
                            i11 = 0;
                            qVarE3.N(1);
                        } else {
                            int iZ4 = qVarE3.z();
                            int i24 = (iZ4 >> 4) & 15;
                            aVar.f50417d = i24;
                            i11 = 0;
                            if (i24 == 2) {
                                int i25 = a.f50414e[(iZ4 >> 2) & 3];
                                i1.o oVar2 = new i1.o();
                                oVar2.l = d0.n("video/x-flv");
                                oVar2.f42600m = d0.n(MimeTypes.AUDIO_MPEG);
                                oVar2.E = 1;
                                oVar2.F = i25;
                                q4.a.o(oVar2, a0Var2);
                                aVar.f50416c = true;
                            } else if (i24 == 7 || i24 == 8) {
                                String str = i24 == 7 ? MimeTypes.AUDIO_ALAW : MimeTypes.AUDIO_MLAW;
                                i1.o oVar3 = new i1.o();
                                oVar3.l = d0.n("video/x-flv");
                                oVar3.f42600m = d0.n(str);
                                oVar3.E = 1;
                                oVar3.F = 8000;
                                q4.a.o(oVar3, a0Var2);
                                aVar.f50416c = true;
                            } else if (i24 != 10) {
                                throw new e2.d("Audio format not supported: " + aVar.f50417d, 1);
                            }
                            aVar.f50415b = true;
                        }
                        a0 a0Var3 = (a0) aVar.f3623a;
                        if (aVar.f50417d == 2) {
                            int iA = qVarE3.a();
                            a0Var3.g(iA, qVarE3);
                            ((a0) aVar.f3623a).a(j11, 1, iA, 0, null);
                        } else {
                            int iZ5 = qVarE3.z();
                            z12 = false;
                            if (iZ5 == 0 && !aVar.f50416c) {
                                int iA2 = qVarE3.a();
                                byte[] bArr4 = new byte[iA2];
                                qVarE3.k(bArr4, 0, iA2);
                                n2.a aVarS = n2.b.s(new xd1(bArr4, iA2), false);
                                i1.o oVar4 = new i1.o();
                                oVar4.l = d0.n("video/x-flv");
                                oVar4.f42600m = d0.n(MimeTypes.AUDIO_AAC);
                                oVar4.f42598j = aVarS.f46420a;
                                oVar4.E = aVarS.f46422c;
                                oVar4.F = aVarS.f46421b;
                                oVar4.f42603p = Collections.singletonList(bArr4);
                                q4.a.o(oVar4, a0Var3);
                                aVar.f50416c = true;
                            } else if (aVar.f50417d != 10 || iZ5 == 1) {
                                int iA3 = qVarE3.a();
                                a0Var3.g(iA3, qVarE3);
                                ((a0) aVar.f3623a).a(j11, 1, iA3, 0, null);
                            }
                            z11 = true;
                            j12 = -9223372036854775807L;
                            z10 = z12;
                        }
                        z12 = true;
                        z11 = true;
                        j12 = -9223372036854775807L;
                        z10 = z12;
                    }
                    if (!this.f50425h && z10) {
                        this.f50425h = true;
                        if (cVar.f50433b == j12) {
                            j13 = -this.f50429m;
                        } else {
                            j13 = 0;
                        }
                        this.f50426i = j13;
                    }
                    this.f50427j = 4;
                    this.f50424g = 2;
                    if (z11) {
                        return i11;
                    }
                }
                j11 = j10;
                i10 = this.f50428k;
                if (i10 == 8) {
                    i11 = 0;
                    if (i10 == 9) {
                        j12 = -9223372036854775807L;
                        if (i10 == 18) {
                        }
                        lVar.skipFully(this.l);
                        z10 = false;
                        z11 = false;
                    } else {
                        j12 = -9223372036854775807L;
                        if (i10 == 18) {
                        }
                        lVar.skipFully(this.l);
                        z10 = false;
                        z11 = false;
                    }
                } else {
                    i11 = 0;
                    if (i10 == 9) {
                        j12 = -9223372036854775807L;
                        if (i10 == 18) {
                        }
                        lVar.skipFully(this.l);
                        z10 = false;
                        z11 = false;
                    } else {
                        j12 = -9223372036854775807L;
                        if (i10 == 18) {
                        }
                        lVar.skipFully(this.l);
                        z10 = false;
                        z11 = false;
                    }
                }
                if (!this.f50425h) {
                    this.f50425h = true;
                    if (cVar.f50433b == j12) {
                        j13 = -this.f50429m;
                    } else {
                        j13 = 0;
                    }
                    this.f50426i = j13;
                }
                this.f50427j = 4;
                this.f50424g = 2;
                if (z11) {
                    return i11;
                }
            }
        }
    }

    @Override // n2.k
    public final void c(m mVar) {
        this.f50423f = mVar;
    }

    public final q e(l lVar) {
        int i10 = this.l;
        q qVar = this.f50421d;
        byte[] bArr = qVar.f44813a;
        if (i10 > bArr.length) {
            qVar.K(new byte[Math.max(bArr.length * 2, i10)], 0);
        } else {
            qVar.M(0);
        }
        qVar.L(this.l);
        lVar.readFully(qVar.f44813a, 0, this.l);
        return qVar;
    }

    @Override // n2.k
    public final void seek(long j10, long j11) {
        if (j10 == 0) {
            this.f50424g = 1;
            this.f50425h = false;
        } else {
            this.f50424g = 3;
        }
        this.f50427j = 0;
    }

    @Override // n2.k
    public final void release() {
    }
}
