package p2;

import bc.s;
import com.google.android.gms.internal.ads.q2;
import com.google.android.gms.internal.ads.t0;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import i1.d0;
import i1.e0;
import i1.o;
import i1.p;
import j2.n;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import l1.q;
import l1.y;
import n2.a0;
import n2.k;
import n2.l;
import n2.m;
import oa.f0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f48209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t0 f48210b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f48211c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n f48212d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f48213e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public m f48214f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c f48215g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f48216h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public e[] f48217i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f48218j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public e f48219k;
    public int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f48220m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f48221n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f48222o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f48223p;

    public b(int i10, n nVar) {
        this.f48212d = nVar;
        this.f48211c = (i10 & 1) == 0;
        this.f48209a = new q(12);
        this.f48210b = new t0();
        this.f48214f = new n(26);
        this.f48217i = new e[0];
        this.f48220m = -1L;
        this.f48221n = -1L;
        this.l = -1;
        this.f48216h = C.TIME_UNSET;
    }

    @Override // n2.k
    public final boolean a(l lVar) {
        q qVar = this.f48209a;
        lVar.peekFully(qVar.f44813a, 0, 12);
        qVar.M(0);
        if (qVar.o() != 1179011410) {
            return false;
        }
        qVar.N(4);
        return qVar.o() == 541677121;
    }

    /* JADX WARN: Code duplicated, block: B:175:0x039e  */
    /* JADX WARN: Code duplicated, block: B:65:0x0104  */
    /* JADX WARN: Code duplicated, block: B:67:0x010d  */
    @Override // n2.k
    public final int b(l lVar, q2 q2Var) throws e0 {
        boolean z10;
        e eVar;
        int i10;
        e eVar2;
        if (this.f48218j != -1) {
            long position = lVar.getPosition();
            long j10 = this.f48218j;
            if (j10 < position || j10 > 262144 + position) {
                q2Var.f18888a = j10;
                z10 = true;
            } else {
                lVar.skipFully((int) (j10 - position));
                z10 = false;
            }
        } else {
            z10 = false;
        }
        this.f48218j = -1L;
        if (z10) {
            return 1;
        }
        int i11 = this.f48213e;
        int i12 = 4;
        e eVar3 = null;
        t0 t0Var = this.f48210b;
        q qVar = this.f48209a;
        switch (i11) {
            case 0:
                if (!a(lVar)) {
                    throw e0.a(null, "AVI Header List not found");
                }
                lVar.skipFully(12);
                this.f48213e = 1;
                return 0;
            case 1:
                lVar.readFully(qVar.f44813a, 0, 12);
                qVar.M(0);
                t0Var.getClass();
                t0Var.f20103a = qVar.o();
                t0Var.f20104b = qVar.o();
                t0Var.f20105c = 0;
                if (t0Var.f20103a != 1414744396) {
                    throw e0.a(null, "LIST expected, found: " + t0Var.f20103a);
                }
                int iO = qVar.o();
                t0Var.f20105c = iO;
                if (iO == 1819436136) {
                    this.l = t0Var.f20104b;
                    this.f48213e = 2;
                    return 0;
                }
                throw e0.a(null, "hdrl expected, found: " + t0Var.f20105c);
            case 2:
                int i13 = this.l - 4;
                q qVar2 = new q(i13);
                lVar.readFully(qVar2.f44813a, 0, i13);
                f fVarB = f.b(1819436136, qVar2);
                int i14 = fVarB.f48247b;
                if (i14 != 1819436136) {
                    throw e0.a(null, "Unexpected header list type " + i14);
                }
                c cVar = (c) fVarB.a(c.class);
                if (cVar == null) {
                    throw e0.a(null, "AviHeader not found");
                }
                this.f48215g = cVar;
                this.f48216h = ((long) cVar.f48226c) * ((long) cVar.f48224a);
                ArrayList arrayList = new ArrayList();
                f0 f0VarListIterator = fVarB.f48246a.listIterator(0);
                int i15 = 0;
                while (f0VarListIterator.hasNext()) {
                    a aVar = (a) f0VarListIterator.next();
                    if (aVar.getType() == 1819440243) {
                        f fVar = (f) aVar;
                        int i16 = i15 + 1;
                        d dVar = (d) fVar.a(d.class);
                        g gVar = (g) fVar.a(g.class);
                        if (dVar == null) {
                            l1.a.s("AviExtractor", "Missing Stream Header");
                        } else if (gVar == null) {
                            l1.a.s("AviExtractor", "Missing Stream Format");
                        } else {
                            long j11 = dVar.f48230d;
                            long j12 = 1000000 * ((long) dVar.f48228b);
                            long j13 = dVar.f48229c;
                            String str = y.f44830a;
                            long jU = y.U(j11, j12, j13, RoundingMode.DOWN);
                            p pVar = gVar.f48248a;
                            o oVarA = pVar.a();
                            oVarA.f42589a = Integer.toString(i15);
                            int i17 = dVar.f48231e;
                            if (i17 != 0) {
                                oVarA.f42601n = i17;
                            }
                            h hVar = (h) fVar.a(h.class);
                            if (hVar != null) {
                                oVarA.f42590b = hVar.f48249a;
                            }
                            int iH = d0.h(pVar.f42643n);
                            if (iH == 1 || iH == 2) {
                                a0 a0VarTrack = this.f48214f.track(i15, iH);
                                a0VarTrack.b(new p(oVarA));
                                a0VarTrack.e(jU);
                                this.f48216h = Math.max(this.f48216h, jU);
                                eVar = new e(i15, dVar, a0VarTrack);
                            }
                            if (eVar != null) {
                                arrayList.add(eVar);
                            }
                            i15 = i16;
                        }
                        eVar = null;
                        if (eVar != null) {
                            arrayList.add(eVar);
                        }
                        i15 = i16;
                    }
                }
                this.f48217i = (e[]) arrayList.toArray(new e[0]);
                this.f48214f.endTracks();
                this.f48213e = 3;
                return 0;
            case 3:
                if (this.f48220m != -1) {
                    long position2 = lVar.getPosition();
                    long j14 = this.f48220m;
                    if (position2 != j14) {
                        this.f48218j = j14;
                        return 0;
                    }
                }
                lVar.peekFully(qVar.f44813a, 0, 12);
                lVar.resetPeekPosition();
                qVar.M(0);
                t0Var.getClass();
                t0Var.f20103a = qVar.o();
                t0Var.f20104b = qVar.o();
                t0Var.f20105c = 0;
                int iO2 = qVar.o();
                int i18 = t0Var.f20103a;
                if (i18 == 1179011410) {
                    lVar.skipFully(12);
                    return 0;
                }
                if (i18 != 1414744396 || iO2 != 1769369453) {
                    this.f48218j = lVar.getPosition() + ((long) t0Var.f20104b) + 8;
                    return 0;
                }
                long position3 = lVar.getPosition();
                this.f48220m = position3;
                this.f48221n = position3 + ((long) t0Var.f20104b) + 8;
                if (!this.f48223p) {
                    c cVar2 = this.f48215g;
                    cVar2.getClass();
                    if ((cVar2.f48225b & 16) == 16) {
                        this.f48213e = 4;
                        this.f48218j = this.f48221n;
                        return 0;
                    }
                    this.f48214f.u(new n2.o(this.f48216h));
                    this.f48223p = true;
                }
                this.f48218j = lVar.getPosition() + 12;
                this.f48213e = 6;
                return 0;
            case 4:
                lVar.readFully(qVar.f44813a, 0, 8);
                qVar.M(0);
                int iO3 = qVar.o();
                int iO4 = qVar.o();
                if (iO3 != 829973609) {
                    this.f48218j = lVar.getPosition() + ((long) iO4);
                    return 0;
                }
                this.f48213e = 5;
                this.f48222o = iO4;
                return 0;
            case 5:
                q qVar3 = new q(this.f48222o);
                lVar.readFully(qVar3.f44813a, 0, this.f48222o);
                long j15 = 0;
                if (qVar3.a() >= 16) {
                    int i19 = qVar3.f44814b;
                    qVar3.N(8);
                    long jO = qVar3.o();
                    long j16 = this.f48220m;
                    j15 = jO <= j16 ? j16 + 8 : 0L;
                    qVar3.M(i19);
                }
                while (qVar3.a() >= 16) {
                    int iO5 = qVar3.o();
                    int iO6 = qVar3.o();
                    long jO2 = ((long) qVar3.o()) + j15;
                    qVar3.N(i12);
                    e[] eVarArr = this.f48217i;
                    int length = eVarArr.length;
                    int i20 = 0;
                    while (true) {
                        if (i20 < length) {
                            eVar2 = eVarArr[i20];
                            if (eVar2.f48235c != iO5 && eVar2.f48236d != iO5) {
                                i20++;
                            }
                        } else {
                            eVar2 = null;
                        }
                    }
                    if (eVar2 != null) {
                        boolean z11 = (iO6 & 16) == 16;
                        if (eVar2.l == -1) {
                            eVar2.l = jO2;
                        }
                        if (z11) {
                            if (eVar2.f48243k == eVar2.f48245n.length) {
                                long[] jArr = eVar2.f48244m;
                                eVar2.f48244m = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
                                int[] iArr = eVar2.f48245n;
                                eVar2.f48245n = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
                            }
                            long[] jArr2 = eVar2.f48244m;
                            int i21 = eVar2.f48243k;
                            jArr2[i21] = jO2;
                            eVar2.f48245n[i21] = eVar2.f48242j;
                            eVar2.f48243k = i21 + 1;
                        }
                        eVar2.f48242j++;
                    }
                    i12 = 4;
                }
                for (e eVar4 : this.f48217i) {
                    eVar4.f48244m = Arrays.copyOf(eVar4.f48244m, eVar4.f48243k);
                    eVar4.f48245n = Arrays.copyOf(eVar4.f48245n, eVar4.f48243k);
                    if ((eVar4.f48235c & 1651965952) == 1651965952 && eVar4.f48233a.f48232f != 0 && (i10 = eVar4.f48243k) > 0) {
                        eVar4.f48238f = i10;
                    }
                }
                this.f48223p = true;
                if (this.f48217i.length == 0) {
                    this.f48214f.u(new n2.o(this.f48216h));
                } else {
                    this.f48214f.u(new n2.o(this, this.f48216h, 2));
                }
                this.f48213e = 6;
                this.f48218j = this.f48220m;
                return 0;
            case 6:
                if (lVar.getPosition() >= this.f48221n) {
                    return -1;
                }
                e eVar5 = this.f48219k;
                if (eVar5 != null) {
                    int i22 = eVar5.f48240h;
                    int iC = i22 - eVar5.f48234b.c(lVar, i22, false);
                    eVar5.f48240h = iC;
                    boolean z12 = iC == 0;
                    if (z12) {
                        if (eVar5.f48239g > 0) {
                            a0 a0Var = eVar5.f48234b;
                            int i23 = eVar5.f48241i;
                            a0Var.a((eVar5.f48237e * ((long) i23)) / ((long) eVar5.f48238f), Arrays.binarySearch(eVar5.f48245n, i23) >= 0 ? 1 : 0, eVar5.f48239g, 0, null);
                        }
                        eVar5.f48241i++;
                    }
                    if (z12) {
                        this.f48219k = null;
                    }
                    return 0;
                }
                if ((lVar.getPosition() & 1) == 1) {
                    lVar.skipFully(1);
                }
                lVar.peekFully(qVar.f44813a, 0, 12);
                qVar.M(0);
                int iO7 = qVar.o();
                if (iO7 == 1414744396) {
                    qVar.M(8);
                    lVar.skipFully(qVar.o() == 1769369453 ? 12 : 8);
                    lVar.resetPeekPosition();
                    return 0;
                }
                int iO8 = qVar.o();
                if (iO7 == 1263424842) {
                    this.f48218j = lVar.getPosition() + ((long) iO8) + 8;
                    return 0;
                }
                lVar.skipFully(8);
                lVar.resetPeekPosition();
                for (e eVar6 : this.f48217i) {
                    if (eVar6.f48235c == iO7 || eVar6.f48236d == iO7) {
                        eVar3 = eVar6;
                        if (eVar3 == null) {
                            this.f48218j = lVar.getPosition() + ((long) iO8);
                            return 0;
                        }
                        eVar3.f48239g = iO8;
                        eVar3.f48240h = iO8;
                        this.f48219k = eVar3;
                        return 0;
                    }
                }
                if (eVar3 == null) {
                    this.f48218j = lVar.getPosition() + ((long) iO8);
                    return 0;
                }
                eVar3.f48239g = iO8;
                eVar3.f48240h = iO8;
                this.f48219k = eVar3;
                return 0;
            default:
                throw new AssertionError();
        }
    }

    @Override // n2.k
    public final void c(m mVar) {
        this.f48213e = 0;
        if (this.f48211c) {
            mVar = new s(mVar, this.f48212d);
        }
        this.f48214f = mVar;
        this.f48218j = -1L;
    }

    @Override // n2.k
    public final void seek(long j10, long j11) {
        this.f48218j = -1L;
        this.f48219k = null;
        for (e eVar : this.f48217i) {
            if (eVar.f48243k == 0) {
                eVar.f48241i = 0;
            } else {
                eVar.f48241i = eVar.f48245n[y.f(eVar.f48244m, j10, true)];
            }
        }
        if (j10 != 0) {
            this.f48213e = 6;
        } else if (this.f48217i.length == 0) {
            this.f48213e = 0;
        } else {
            this.f48213e = 3;
        }
    }

    @Override // n2.k
    public final void release() {
    }
}
