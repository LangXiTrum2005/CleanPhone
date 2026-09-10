package v1;

import android.net.Uri;
import android.util.SparseArray;
import b2.w;
import com.google.android.gms.internal.ads.az1;
import com.google.android.gms.internal.ads.bq0;
import com.ironsource.X3;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import ea.b0;
import f2.a0;
import f2.c1;
import f2.i0;
import f2.k1;
import i1.c0;
import i1.d0;
import i1.e0;
import i1.q0;
import java.io.IOException;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import l1.y;
import n1.z;
import oa.f0;
import oa.j0;
import oa.k0;
import oa.n1;
import p1.e1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class l implements a0, w1.u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f52348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w1.d f52349b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final na.g f52350c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final z f52351d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final u1.h f52352e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i0 f52353f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b0 f52354g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final i0 f52355h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final v9.e f52356i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final IdentityHashMap f52357j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final k0 f52358k;
    public final b0 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f52359m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f52360n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final q1.j f52361o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final rb.c f52362p = new rb.c(this, 12);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public f2.z f52363q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f52364r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public k1 f52365s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public r[] f52366t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public r[] f52367u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f52368v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public f2.n f52369w;

    public l(c cVar, w1.d dVar, na.g gVar, z zVar, u1.h hVar, i0 i0Var, b0 b0Var, i0 i0Var2, v9.e eVar, b0 b0Var2, boolean z10, int i10, q1.j jVar) {
        this.f52348a = cVar;
        this.f52349b = dVar;
        this.f52350c = gVar;
        this.f52351d = zVar;
        this.f52352e = hVar;
        this.f52353f = i0Var;
        this.f52354g = b0Var;
        this.f52355h = i0Var2;
        this.f52356i = eVar;
        this.l = b0Var2;
        this.f52359m = z10;
        this.f52360n = i10;
        this.f52361o = jVar;
        b0Var2.getClass();
        f0 f0Var = j0.f47265b;
        n1 n1Var = n1.f47281e;
        this.f52369w = new f2.n(n1Var, n1Var);
        this.f52357j = new IdentityHashMap();
        this.f52358k = new k0(18);
        this.f52366t = new r[0];
        this.f52367u = new r[0];
    }

    public static i1.p i(i1.p pVar, i1.p pVar2, boolean z10) {
        c0 c0Var;
        int i10;
        String str;
        String str2;
        j0 j0Var;
        int i11;
        int i12;
        String str3;
        f0 f0Var = j0.f47265b;
        n1 n1Var = n1.f47281e;
        if (pVar2 != null) {
            str2 = pVar2.f42641k;
            c0Var = pVar2.l;
            i11 = pVar2.F;
            i10 = pVar2.f42635e;
            i12 = pVar2.f42636f;
            str = pVar2.f42634d;
            str3 = pVar2.f42632b;
            j0Var = pVar2.f42633c;
        } else {
            String strW = y.w(pVar.f42641k, 1);
            c0Var = pVar.l;
            if (z10) {
                i11 = pVar.F;
                i10 = pVar.f42635e;
                i12 = pVar.f42636f;
                str = pVar.f42634d;
                str3 = pVar.f42632b;
                str2 = strW;
                j0Var = pVar.f42633c;
            } else {
                i10 = 0;
                str = null;
                str2 = strW;
                j0Var = n1Var;
                i11 = -1;
                i12 = 0;
                str3 = null;
            }
        }
        String strD = d0.d(str2);
        int i13 = z10 ? pVar.f42638h : -1;
        int i14 = z10 ? pVar.f42639i : -1;
        i1.o oVar = new i1.o();
        oVar.f42589a = pVar.f42631a;
        oVar.f42590b = str3;
        oVar.f42591c = j0.x(j0Var);
        oVar.l = d0.n(pVar.f42642m);
        oVar.f42600m = d0.n(strD);
        oVar.f42598j = str2;
        oVar.f42599k = c0Var;
        oVar.f42596h = i13;
        oVar.f42597i = i14;
        oVar.E = i11;
        oVar.f42593e = i10;
        oVar.f42594f = i12;
        oVar.f42592d = str;
        return new i1.p(oVar);
    }

    @Override // f2.a0
    public final long a(long j10, e1 e1Var) {
        for (r rVar : this.f52367u) {
            if (rVar.A == 2) {
                i iVar = rVar.f52396d;
                w1.d dVar = iVar.f52318g;
                int selectedIndex = iVar.f52328r.getSelectedIndex();
                Uri[] uriArr = iVar.f52316e;
                w1.m mVarA = (selectedIndex >= uriArr.length || selectedIndex == -1) ? null : dVar.a(true, uriArr[iVar.f52328r.getSelectedIndexInTrackGroup()]);
                if (mVarA == null) {
                    break;
                }
                j0 j0Var = mVarA.f52846r;
                if (j0Var.isEmpty()) {
                    break;
                }
                long j11 = mVarA.f52837h - dVar.f52769n;
                long j12 = j10 - j11;
                int iD = y.d(j0Var, Long.valueOf(j12), true);
                long j13 = ((w1.j) j0Var.get(iD)).f52821e;
                return e1Var.a(j12, j13, (!mVarA.f52873c || iD == j0Var.size() - 1) ? j13 : ((w1.j) j0Var.get(iD + 1)).f52821e) + j11;
            }
        }
        return j10;
    }

    @Override // w1.u
    public final void b() {
        for (r rVar : this.f52366t) {
            j2.m mVar = rVar.f52402j;
            i iVar = rVar.f52396d;
            ArrayList arrayList = rVar.f52405n;
            if (!arrayList.isEmpty()) {
                k kVar = (k) oa.q.k(arrayList);
                int iB = iVar.b(kVar);
                int i10 = kVar.f52336o;
                if (iB == 1) {
                    if (!kVar.f()) {
                        go.k.t(i10 != -1);
                        w1.m mVarA = iVar.f52318g.a(false, iVar.f52316e[iVar.f52319h.a(kVar.f41369d)]);
                        mVarA.getClass();
                        j0 j0Var = mVarA.f52846r;
                        int i11 = (int) (kVar.f41413j - mVarA.f52840k);
                        kVar.K = i11 < 0 ? 0L : ((w1.h) (i11 < j0Var.size() ? ((w1.j) j0Var.get(i11)).f52816m : mVarA.f52847s).get(i10)).f52819c;
                    }
                } else if (iB == 0) {
                    rVar.f52409r.post(new l2.u(29, rVar, kVar));
                } else if (iB == 2 && !rVar.T && mVar.c()) {
                    mVar.a();
                }
            }
        }
        this.f52363q.h(this);
    }

    /* JADX WARN: Code duplicated, block: B:120:0x027f  */
    /* JADX WARN: Code duplicated, block: B:122:0x0287  */
    /* JADX WARN: Code duplicated, block: B:124:0x028b  */
    /* JADX WARN: Code duplicated, block: B:126:0x0291  */
    /* JADX WARN: Code duplicated, block: B:156:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:195:0x028d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x0199  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r30v0 */
    /* JADX WARN: Type inference failed for: r30v2 */
    /* JADX WARN: Type inference failed for: r30v3, types: [int] */
    /* JADX WARN: Type inference failed for: r30v5 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v49 */
    /* JADX WARN: Type inference failed for: r7v5, types: [int] */
    /* JADX WARN: Type inference failed for: r7v50 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v40 */
    /* JADX WARN: Type inference failed for: r9v5 */
    @Override // f2.a0
    public final long c(i2.r[] rVarArr, boolean[] zArr, c1[] c1VarArr, boolean[] zArr2, long j10) throws Throwable {
        IdentityHashMap identityHashMap;
        Object[] objArr;
        int[] iArr;
        boolean z10;
        i iVar;
        int i10;
        int i11;
        Object[] objArr2;
        int i12;
        int[] iArr2;
        r[] rVarArr2;
        r rVar;
        boolean z11;
        boolean z12;
        Object[] objArr3;
        int i13;
        int i14;
        Object[] objArr4;
        Object[] objArr5;
        int i15;
        ?? r30;
        int[] iArr3 = new int[rVarArr.length];
        int[] iArr4 = new int[rVarArr.length];
        int i16 = 0;
        while (true) {
            int length = rVarArr.length;
            identityHashMap = this.f52357j;
            if (i16 >= length) {
                break;
            }
            c1 c1Var = c1VarArr[i16];
            iArr3[i16] = c1Var == null ? -1 : ((Integer) identityHashMap.get(c1Var)).intValue();
            iArr4[i16] = -1;
            i2.r rVar2 = rVarArr[i16];
            if (rVar2 != null) {
                q0 trackGroup = rVar2.getTrackGroup();
                int i17 = 0;
                while (true) {
                    r[] rVarArr3 = this.f52366t;
                    if (i17 >= rVarArr3.length) {
                        break;
                    }
                    r rVar3 = rVarArr3[i17];
                    rVar3.i();
                    if (rVar3.I.b(trackGroup) != -1) {
                        iArr4[i16] = i17;
                        break;
                    }
                    i17++;
                }
            }
            i16++;
        }
        identityHashMap.clear();
        int length2 = rVarArr.length;
        int length3 = rVarArr.length;
        c1[] c1VarArr2 = new c1[length3];
        int length4 = rVarArr.length;
        i2.r[] rVarArr4 = new i2.r[length4];
        boolean z13 = false;
        r[] rVarArr5 = new r[this.f52366t.length];
        int i18 = length3;
        int i19 = 0;
        int i20 = 0;
        boolean z14 = false;
        Object[] objArr6 = new c1[length2];
        Object[] objArr7 = c1VarArr2;
        while (i19 < this.f52366t.length) {
            int i21 = length2;
            ?? r10 = z13;
            Object[] objArr8 = objArr6;
            while (true) {
                objArr = objArr8;
                if (r10 >= rVarArr.length) {
                    break;
                }
                objArr7[r10] = iArr3[r10] == i19 ? c1VarArr[r10] : null;
                rVarArr4[r10] = iArr4[r10] == i19 ? rVarArr[r10] : null;
                objArr8 = objArr;
                r10++;
            }
            r rVar4 = this.f52366t[i19];
            j2.m mVar = rVar4.f52402j;
            int i22 = i19;
            i iVar2 = rVar4.f52396d;
            Uri[] uriArr = iVar2.f52316e;
            w1.d dVar = iVar2.f52318g;
            ArrayList arrayList = rVar4.f52405n;
            rVar4.i();
            int i23 = rVar4.E;
            Object[] objArr9 = objArr7;
            ?? r11 = z13;
            while (r11 < length4) {
                n nVar = (n) objArr9[r11];
                if (nVar == null || (rVarArr4[r11] != null && zArr[r11])) {
                    r30 = r11;
                } else {
                    r30 = r11;
                    rVar4.E--;
                    if (nVar.f52383c != -1) {
                        r rVar5 = nVar.f52382b;
                        int i24 = nVar.f52381a;
                        rVar5.i();
                        rVar5.K.getClass();
                        int i25 = rVar5.K[i24];
                        go.k.t(rVar5.N[i25]);
                        rVar5.N[i25] = z13;
                        nVar.f52383c = -1;
                    }
                    objArr9[r30 == true ? 1 : 0] = null;
                }
                rVarArr4 = rVarArr4;
                r11 = r30 + 1;
            }
            i2.r[] rVarArr6 = rVarArr4;
            boolean z15 = true;
            if (z14) {
                iArr = iArr3;
                z10 = true;
            } else {
                if (rVar4.S) {
                    if (i23 != 0) {
                        iArr = iArr3;
                    }
                    iArr = iArr3;
                    z10 = true;
                } else {
                    iArr = iArr3;
                    if (j10 != rVar4.P) {
                        z10 = true;
                    }
                }
                z10 = z13;
            }
            i2.r rVar6 = iVar2.f52328r;
            boolean z16 = z10;
            i2.r rVar7 = rVar6;
            ?? r12 = z13;
            while (r12 < length4) {
                ?? r31 = r12;
                i2.r rVar8 = rVarArr6[r31 == true ? 1 : 0];
                if (rVar8 == null) {
                    i15 = length4;
                } else {
                    i15 = length4;
                    boolean z17 = z16;
                    int iB = rVar4.I.b(rVar8.getTrackGroup());
                    if (iB == rVar4.L) {
                        w1.c cVar = (w1.c) dVar.f52760d.get(uriArr[iVar2.f52328r.getSelectedIndexInTrackGroup()]);
                        if (cVar != null) {
                            cVar.f52755k = z13;
                        }
                        iVar2.f52328r = rVar8;
                        rVar7 = rVar8;
                    }
                    if (objArr9[r31 == true ? 1 : 0] == null) {
                        rVar4.E++;
                        n nVar2 = new n(rVar4, iB);
                        objArr9[r31 == true ? 1 : 0] = nVar2;
                        zArr2[r31 == true ? 1 : 0] = z15;
                        if (rVar4.K != null) {
                            nVar2.a();
                            if (z17) {
                                z16 = z17;
                            } else {
                                q qVar = rVar4.f52413v[rVar4.K[iB]];
                                z16 = (qVar.t() == 0 || qVar.G(j10, z15)) ? false : true;
                            }
                        } else {
                            z16 = z17;
                        }
                    } else {
                        z16 = z17;
                    }
                }
                length4 = i15;
                z13 = false;
                z15 = true;
                r12 = (r31 == true ? 1 : 0) + 1;
            }
            int i26 = length4;
            boolean z18 = z16;
            if (rVar4.E == 0) {
                w1.c cVar2 = (w1.c) dVar.f52760d.get(uriArr[iVar2.f52328r.getSelectedIndexInTrackGroup()]);
                if (cVar2 != null) {
                    cVar2.f52755k = false;
                }
                iVar2.f52324n = null;
                rVar4.G = null;
                rVar4.R = true;
                arrayList.clear();
                if (mVar.c()) {
                    if (rVar4.C) {
                        for (q qVar2 : rVar4.f52413v) {
                            qVar2.k();
                        }
                    }
                    mVar.a();
                } else {
                    rVar4.x();
                }
                iVar = iVar2;
                i13 = i18;
                i11 = i21;
                objArr3 = objArr;
                i12 = i22;
                z12 = z18;
                iArr2 = iArr4;
                rVarArr2 = rVarArr5;
                rVar = rVar4;
            } else {
                boolean z19 = true;
                if (arrayList.isEmpty() || Objects.equals(rVar7, rVar6)) {
                    iVar = iVar2;
                    i10 = i18;
                    i11 = i21;
                    objArr2 = objArr;
                    i12 = i22;
                    iArr2 = iArr4;
                    rVarArr2 = rVarArr5;
                    rVar = rVar4;
                } else {
                    if (rVar4.S) {
                        iVar = iVar2;
                        i10 = i18;
                        i11 = i21;
                        objArr4 = objArr;
                        i12 = i22;
                        iArr2 = iArr4;
                        rVarArr2 = rVarArr5;
                        rVar = rVar4;
                    } else {
                        long j11 = j10 < 0 ? -j10 : 0L;
                        k kVarQ = rVar4.q();
                        long j12 = j11;
                        g2.n[] nVarArrA = iVar2.a(kVarQ, j10);
                        iVar = iVar2;
                        List list = rVar4.f52406o;
                        i10 = i18;
                        i11 = i21;
                        Object[] objArr10 = objArr;
                        i12 = i22;
                        iArr2 = iArr4;
                        rVarArr2 = rVarArr5;
                        rVar = rVar4;
                        i2.r rVar9 = rVar7;
                        rVar9.b(j10, j12, C.TIME_UNSET, list, nVarArrA);
                        if (rVar9.getSelectedIndexInTrackGroup() != iVar.f52319h.a(kVarQ.f41369d)) {
                            z19 = true;
                            objArr4 = objArr10;
                        } else {
                            z19 = true;
                            objArr2 = objArr10;
                        }
                    }
                    rVar.R = z19;
                    z11 = z19;
                    z12 = z11;
                    objArr3 = objArr4;
                    if (z12) {
                        rVar.y(j10, z11);
                        i13 = i10;
                        i14 = 0;
                        while (i14 < i13) {
                            if (objArr9[i14] != null) {
                                zArr2[i14] = z19;
                            }
                            i14++;
                            z19 = true;
                        }
                    } else {
                        i13 = i10;
                    }
                }
                z11 = z14;
                z12 = z18;
                objArr3 = objArr2;
                if (z12) {
                    rVar.y(j10, z11);
                    i13 = i10;
                    i14 = 0;
                    while (i14 < i13) {
                        if (objArr9[i14] != null) {
                            zArr2[i14] = z19;
                        }
                        i14++;
                        z19 = true;
                    }
                } else {
                    i13 = i10;
                }
            }
            ArrayList arrayList2 = rVar.f52410s;
            arrayList2.clear();
            for (int i27 = 0; i27 < i13; i27++) {
                Object obj = objArr9[i27];
                if (obj != null) {
                    arrayList2.add((n) obj);
                }
            }
            rVar.S = true;
            int i28 = 0;
            boolean z20 = false;
            Object[] objArr11 = objArr3;
            while (i28 < rVarArr.length) {
                Object obj2 = objArr9[i28];
                int i29 = i12;
                if (iArr2[i28] == i29) {
                    obj2.getClass();
                    objArr5 = objArr11;
                    objArr5[i28] = obj2;
                    identityHashMap.put(obj2, Integer.valueOf(i29));
                    z20 = true;
                } else {
                    objArr5 = objArr11;
                    if (iArr[i28] == i29) {
                        go.k.t(obj2 == null);
                    }
                }
                i28++;
                objArr11 = objArr5;
                i12 = i29;
            }
            Object[] objArr12 = objArr11;
            int i30 = i12;
            int i31 = i20;
            if (z20) {
                rVarArr2[i31] = rVar;
                i20 = i31 + 1;
                if (i31 == 0) {
                    iVar.l = true;
                    if (z12) {
                        ((SparseArray) this.f52358k.f47269b).clear();
                        z14 = true;
                    } else {
                        r[] rVarArr7 = this.f52367u;
                        if (rVarArr7.length == 0 || rVar != rVarArr7[0]) {
                            ((SparseArray) this.f52358k.f47269b).clear();
                            z14 = true;
                        }
                    }
                } else {
                    iVar.l = i30 < this.f52368v;
                }
            }
            i19 = i30 + 1;
            iArr4 = iArr2;
            iArr3 = iArr;
            rVarArr5 = rVarArr2;
            objArr7 = objArr9;
            rVarArr4 = rVarArr6;
            length2 = i11;
            z13 = false;
            i18 = i13;
            objArr6 = objArr12;
            length4 = i26;
        }
        boolean z21 = z13;
        System.arraycopy(objArr6, z21 ? 1 : 0, c1VarArr, z21 ? 1 : 0, length2);
        r[] rVarArr8 = (r[]) y.O(rVarArr5, i20);
        this.f52367u = rVarArr8;
        n1 n1VarY = j0.y(rVarArr8);
        AbstractList abstractListZ = oa.q.z(n1VarY, new d2.c(14));
        this.l.getClass();
        this.f52369w = new f2.n(n1VarY, abstractListZ);
        return j10;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0046  */
    /* JADX WARN: Code duplicated, block: B:23:0x004f A[LOOP:1: B:18:0x0042->B:23:0x004f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:36:0x0079  */
    /* JADX WARN: Code duplicated, block: B:37:0x007e  */
    /* JADX WARN: Code duplicated, block: B:47:0x0052 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x0053 A[EDGE_INSN: B:48:0x0053->B:25:0x0053 BREAK  A[LOOP:1: B:18:0x0042->B:23:0x004f], SYNTHETIC] */
    @Override // w1.u
    public final boolean d(Uri uri, w wVar, boolean z10) {
        long j10;
        int i10;
        int iIndexOf;
        boolean z11;
        w1.c cVar;
        boolean zA;
        boolean z12 = true;
        for (r rVar : this.f52366t) {
            i iVar = rVar.f52396d;
            Uri[] uriArr = iVar.f52316e;
            if (y.m(uriArr, uri)) {
                if (!z10) {
                    b0 b0Var = rVar.f52401i;
                    bq0 bq0VarG = com.bumptech.glide.c.g(iVar.f52328r);
                    b0Var.getClass();
                    com.google.android.gms.internal.ads.a0 a0VarC = b0.c(bq0VarG, wVar);
                    if (a0VarC != null && a0VarC.f11791a == 2) {
                        j10 = a0VarC.f11792b;
                    }
                    i10 = 0;
                    while (true) {
                        if (i10 < uriArr.length) {
                            i10 = -1;
                            break;
                        }
                        if (uriArr[i10].equals(uri)) {
                            break;
                        }
                        i10++;
                    }
                    if (i10 != -1 && (iIndexOf = iVar.f52328r.indexOf(i10)) != -1) {
                        iVar.f52325o = uri;
                        if (j10 != C.TIME_UNSET && iVar.f52328r.c(iIndexOf, j10)) {
                            cVar = (w1.c) iVar.f52318g.f52760d.get(uri);
                            if (cVar != null) {
                                zA = w1.c.a(cVar, j10);
                            } else {
                                zA = false;
                            }
                            if (zA) {
                            }
                        }
                        z11 = false;
                    }
                    z12 &= z11;
                }
                j10 = -9223372036854775807L;
                i10 = 0;
                while (true) {
                    if (i10 < uriArr.length) {
                        i10 = -1;
                        break;
                    }
                    if (uriArr[i10].equals(uri)) {
                        break;
                        break;
                    }
                    i10++;
                }
                if (i10 != -1) {
                    iVar.f52325o = uri;
                    if (j10 != C.TIME_UNSET) {
                        cVar = (w1.c) iVar.f52318g.f52760d.get(uri);
                        if (cVar != null) {
                            zA = w1.c.a(cVar, j10);
                        } else {
                            zA = false;
                        }
                        if (zA) {
                        }
                    }
                    z11 = false;
                }
                z12 &= z11;
            }
            z11 = true;
            z12 &= z11;
        }
        this.f52363q.h(this);
        return z12;
    }

    @Override // f2.a0
    public final void e(f2.z zVar, long j10) {
        c cVar;
        boolean z10;
        List list;
        List list2;
        HashSet hashSet;
        int i10;
        HashSet hashSet2;
        int i11;
        boolean z11;
        int i12;
        boolean z12;
        Uri[] uriArr;
        this.f52363q = zVar;
        w1.d dVar = this.f52349b;
        dVar.getClass();
        dVar.f52761e.add(this);
        w1.p pVar = dVar.f52766j;
        pVar.getClass();
        List list3 = pVar.f52865g;
        List list4 = pVar.f52863e;
        Map map = Collections.EMPTY_MAP;
        boolean zIsEmpty = list4.isEmpty();
        List list5 = pVar.f52866h;
        int i13 = 0;
        this.f52364r = 0;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        c cVar2 = this.f52348a;
        boolean z13 = this.f52359m;
        if (zIsEmpty) {
            cVar = cVar2;
            z10 = z13;
            list = list3;
            list2 = list5;
        } else {
            i1.p pVar2 = pVar.f52868j;
            int size = list4.size();
            int[] iArr = new int[size];
            int i14 = 0;
            int i15 = 0;
            while (true) {
                list2 = list5;
                if (i14 >= list4.size()) {
                    break;
                }
                i1.p pVar3 = ((w1.o) list4.get(i14)).f52856b;
                int i16 = pVar3.f42651v;
                String str = pVar3.f42641k;
                if (i16 > 0 || y.w(str, 2) != null) {
                    iArr[i14] = 2;
                    i15++;
                } else if (y.w(str, 1) != null) {
                    iArr[i14] = 1;
                    i13++;
                } else {
                    iArr[i14] = -1;
                }
                i14++;
                list5 = list2;
            }
            if (i15 > 0) {
                z12 = false;
                i12 = i15;
                z11 = true;
            } else if (i13 < size) {
                z11 = false;
                i12 = size - i13;
                z12 = true;
            } else {
                z11 = false;
                i12 = size;
                z12 = false;
            }
            Uri[] uriArr2 = new Uri[i12];
            i1.p[] pVarArr = new i1.p[i12];
            int[] iArr2 = new int[i12];
            int i17 = 0;
            int i18 = 0;
            while (i17 < list4.size()) {
                if (z11) {
                    uriArr = uriArr2;
                    if (iArr[i17] == 2) {
                    }
                    i17++;
                    uriArr2 = uriArr;
                } else {
                    uriArr = uriArr2;
                }
                if (!z12 || iArr[i17] != 1) {
                    w1.o oVar = (w1.o) list4.get(i17);
                    uriArr[i18] = oVar.f52855a;
                    pVarArr[i18] = oVar.f52856b;
                    iArr2[i18] = i17;
                    i18++;
                }
                i17++;
                uriArr2 = uriArr;
            }
            Uri[] uriArr3 = uriArr2;
            String str2 = pVarArr[0].f42641k;
            int iV = y.v(2, str2);
            int iV2 = y.v(1, str2);
            boolean z14 = (iV2 == 1 || (iV2 == 0 && list3.isEmpty())) && iV <= 1 && iV2 + iV > 0;
            cVar = cVar2;
            list = list3;
            z10 = z13;
            r rVarH = h(X3.i.Z, (z11 || iV2 <= 0) ? 0 : 1, uriArr3, pVarArr, pVar.f52868j, pVar.f52869k, map, j10);
            arrayList.add(rVarH);
            arrayList2.add(iArr2);
            if (z10 && z14) {
                ArrayList arrayList3 = new ArrayList();
                if (iV > 0) {
                    i1.p[] pVarArr2 = new i1.p[i12];
                    int i19 = 0;
                    while (i19 < i12) {
                        i1.p pVar4 = pVarArr[i19];
                        String strW = y.w(pVar4.f42641k, 2);
                        String strD = d0.d(strW);
                        i1.o oVar2 = new i1.o();
                        oVar2.f42589a = pVar4.f42631a;
                        oVar2.f42590b = pVar4.f42632b;
                        oVar2.f42591c = j0.x(pVar4.f42633c);
                        oVar2.l = d0.n(pVar4.f42642m);
                        oVar2.f42600m = d0.n(strD);
                        oVar2.f42598j = strW;
                        oVar2.f42599k = pVar4.l;
                        oVar2.f42596h = pVar4.f42638h;
                        oVar2.f42597i = pVar4.f42639i;
                        oVar2.f42607t = pVar4.f42650u;
                        oVar2.f42608u = pVar4.f42651v;
                        oVar2.f42611x = pVar4.f42654y;
                        oVar2.f42593e = pVar4.f42635e;
                        oVar2.f42594f = pVar4.f42636f;
                        pVarArr2[i19] = new i1.p(oVar2);
                        i19++;
                        pVarArr = pVarArr;
                    }
                    i1.p[] pVarArr3 = pVarArr;
                    arrayList3.add(new q0(X3.i.Z, pVarArr2));
                    if (iV2 > 0 && (pVar2 != null || list.isEmpty())) {
                        arrayList3.add(new q0("main:audio", i(pVarArr3[0], pVar2, false)));
                    }
                    List list6 = pVar.f52869k;
                    if (list6 != null) {
                        for (int i20 = 0; i20 < list6.size(); i20++) {
                            arrayList3.add(new q0(l1.d.e(i20, "main:cc:"), cVar.b((i1.p) list6.get(i20))));
                        }
                    }
                } else {
                    i1.p[] pVarArr4 = new i1.p[i12];
                    for (int i21 = 0; i21 < i12; i21++) {
                        pVarArr4[i21] = i(pVarArr[i21], pVar2, true);
                    }
                    arrayList3.add(new q0(X3.i.Z, pVarArr4));
                }
                i1.o oVar3 = new i1.o();
                oVar3.f42589a = "ID3";
                oVar3.f42600m = d0.n(MimeTypes.APPLICATION_ID3);
                q0 q0Var = new q0("main:id3", new i1.p(oVar3));
                arrayList3.add(q0Var);
                rVarH.w((q0[]) arrayList3.toArray(new q0[0]), arrayList3.indexOf(q0Var));
            } else {
                cVar = cVar;
            }
        }
        ArrayList arrayList4 = new ArrayList(list.size());
        ArrayList arrayList5 = new ArrayList(list.size());
        ArrayList arrayList6 = new ArrayList(list.size());
        HashSet hashSet3 = new HashSet();
        int i22 = 0;
        while (i22 < list.size()) {
            List list7 = list;
            String str3 = ((w1.n) list7.get(i22)).f52854c;
            if (hashSet3.add(str3)) {
                arrayList4.clear();
                arrayList5.clear();
                arrayList6.clear();
                boolean z15 = true;
                for (int i23 = 0; i23 < list7.size(); i23++) {
                    if (str3.equals(((w1.n) list7.get(i23)).f52854c)) {
                        w1.n nVar = (w1.n) list7.get(i23);
                        arrayList6.add(Integer.valueOf(i23));
                        Uri uri = nVar.f52852a;
                        i1.p pVar5 = nVar.f52853b;
                        arrayList4.add(uri);
                        arrayList5.add(pVar5);
                        z15 &= y.v(1, pVar5.f42641k) == 1;
                    }
                }
                String strConcat = "audio:".concat(str3);
                String str4 = y.f44830a;
                list = list7;
                hashSet2 = hashSet3;
                i11 = i22;
                r rVarH2 = h(strConcat, 1, (Uri[]) arrayList4.toArray(new Uri[0]), (i1.p[]) arrayList5.toArray(new i1.p[0]), null, Collections.EMPTY_LIST, map, j10);
                arrayList2.add(com.bumptech.glide.c.H(arrayList6));
                arrayList.add(rVarH2);
                if (z10 && z15) {
                    rVarH2.w(new q0[]{new q0(strConcat, (i1.p[]) arrayList5.toArray(new i1.p[0]))}, new int[0]);
                }
            } else {
                hashSet2 = hashSet3;
                i11 = i22;
                list = list7;
            }
            i22 = i11 + 1;
            hashSet3 = hashSet2;
        }
        this.f52368v = arrayList.size();
        ArrayList arrayList7 = new ArrayList(list2.size());
        ArrayList arrayList8 = new ArrayList(list2.size());
        ArrayList arrayList9 = new ArrayList(list2.size());
        HashSet hashSet4 = new HashSet();
        int i24 = 0;
        while (i24 < list2.size()) {
            list2 = list2;
            String str5 = ((w1.n) list2.get(i24)).f52854c;
            if (hashSet4.add(str5)) {
                arrayList7.clear();
                arrayList8.clear();
                arrayList9.clear();
                for (int i25 = 0; i25 < list2.size(); i25++) {
                    if (str5.equals(((w1.n) list2.get(i25)).f52854c)) {
                        w1.n nVar2 = (w1.n) list2.get(i25);
                        arrayList9.add(Integer.valueOf(i25));
                        arrayList7.add(nVar2.f52852a);
                        arrayList8.add(nVar2.f52853b);
                    }
                }
                String strConcat2 = "subtitle:".concat(str5);
                i1.p[] pVarArr5 = (i1.p[]) arrayList8.toArray(new i1.p[0]);
                String str6 = y.f44830a;
                Uri[] uriArr4 = (Uri[]) arrayList7.toArray(new Uri[0]);
                f0 f0Var = j0.f47265b;
                hashSet = hashSet4;
                i10 = i24;
                r rVarH3 = h(strConcat2, 3, uriArr4, pVarArr5, null, n1.f47281e, map, j10);
                arrayList2.add(com.bumptech.glide.c.H(arrayList9));
                arrayList.add(rVarH3);
                int length = pVarArr5.length;
                i1.p[] pVarArr6 = new i1.p[length];
                for (int i26 = 0; i26 < length; i26++) {
                    pVarArr6[i26] = cVar.b(pVarArr5[i26]);
                }
                rVarH3.w(new q0[]{new q0(strConcat2, pVarArr6)}, new int[0]);
            } else {
                hashSet = hashSet4;
                i10 = i24;
            }
            i24 = i10 + 1;
            hashSet4 = hashSet;
        }
        this.f52366t = (r[]) arrayList.toArray(new r[0]);
        this.f52364r = this.f52366t.length;
        for (int i27 = 0; i27 < this.f52368v; i27++) {
            this.f52366t[i27].f52396d.l = true;
        }
        for (r rVar : this.f52366t) {
            if (!rVar.D) {
                az1 az1Var = new az1();
                az1Var.f12554a = rVar.P;
                rVar.f(new p1.k0(az1Var));
            }
        }
        this.f52367u = this.f52366t;
    }

    @Override // f2.e1
    public final boolean f(p1.k0 k0Var) {
        if (this.f52365s != null) {
            return this.f52369w.f(k0Var);
        }
        for (r rVar : this.f52366t) {
            if (!rVar.D) {
                az1 az1Var = new az1();
                az1Var.f12554a = rVar.P;
                rVar.f(new p1.k0(az1Var));
            }
        }
        return false;
    }

    @Override // f2.a0
    public final void g(long j10) throws Throwable {
        for (r rVar : this.f52367u) {
            if (rVar.C && !rVar.s()) {
                int length = rVar.f52413v.length;
                for (int i10 = 0; i10 < length; i10++) {
                    rVar.f52413v[i10].j(j10, rVar.N[i10]);
                }
            }
        }
    }

    @Override // f2.e1
    public final long getBufferedPositionUs() {
        return this.f52369w.getBufferedPositionUs();
    }

    @Override // f2.e1
    public final long getNextLoadPositionUs() {
        return this.f52369w.getNextLoadPositionUs();
    }

    @Override // f2.a0
    public final k1 getTrackGroups() {
        k1 k1Var = this.f52365s;
        k1Var.getClass();
        return k1Var;
    }

    public final r h(String str, int i10, Uri[] uriArr, i1.p[] pVarArr, i1.p pVar, List list, Map map, long j10) {
        return new r(str, i10, this.f52362p, new i(this.f52348a, this.f52349b, uriArr, pVarArr, this.f52350c, this.f52351d, this.f52358k, list, this.f52361o), map, this.f52356i, j10, pVar, this.f52352e, this.f52353f, this.f52354g, this.f52355h, this.f52360n, null);
    }

    @Override // f2.e1
    public final boolean isLoading() {
        return this.f52369w.isLoading();
    }

    @Override // f2.a0
    public final void maybeThrowPrepareError() throws IOException {
        for (r rVar : this.f52366t) {
            rVar.v();
            if (rVar.T && !rVar.D) {
                throw e0.a(null, "Loading finished before preparation is complete.");
            }
        }
    }

    @Override // f2.a0
    public final long readDiscontinuity() {
        return C.TIME_UNSET;
    }

    @Override // f2.e1
    public final void reevaluateBuffer(long j10) {
        this.f52369w.reevaluateBuffer(j10);
    }

    @Override // f2.a0
    public final long seekToUs(long j10) throws Throwable {
        r[] rVarArr = this.f52367u;
        if (rVarArr.length > 0) {
            boolean zY = rVarArr[0].y(j10, false);
            int i10 = 1;
            while (true) {
                r[] rVarArr2 = this.f52367u;
                if (i10 >= rVarArr2.length) {
                    break;
                }
                rVarArr2[i10].y(j10, zY);
                i10++;
            }
            if (zY) {
                ((SparseArray) this.f52358k.f47269b).clear();
            }
        }
        return j10;
    }
}
