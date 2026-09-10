package u3;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import com.google.android.gms.internal.ads.b2;
import com.google.android.gms.internal.ads.q2;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import i1.e0;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import l1.x;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class t implements n2.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f51857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f51858b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f51859c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l1.q f51860d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SparseIntArray f51861e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final j0.h f51862f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final k3.k f51863g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final SparseArray f51864h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final SparseBooleanArray f51865i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final SparseBooleanArray f51866j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final o f51867k;
    public s2.b l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public n2.m f51868m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f51869n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f51870o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f51871p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f51872q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public v f51873r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f51874s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f51875t;

    public t(int i10, int i11, k3.k kVar, x xVar, j0.h hVar) {
        this.f51862f = hVar;
        this.f51857a = i10;
        this.f51858b = i11;
        this.f51863g = kVar;
        if (i10 == 1 || i10 == 2) {
            this.f51859c = Collections.singletonList(xVar);
        } else {
            ArrayList arrayList = new ArrayList();
            this.f51859c = arrayList;
            arrayList.add(xVar);
        }
        this.f51860d = new l1.q(new byte[9400], 0);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.f51865i = sparseBooleanArray;
        this.f51866j = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.f51864h = sparseArray;
        this.f51861e = new SparseIntArray();
        this.f51867k = new o(1);
        this.f51868m = n2.m.f46479t9;
        this.f51875t = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i12 = 0; i12 < size; i12++) {
            sparseArray.put(sparseArray2.keyAt(i12), (v) sparseArray2.valueAt(i12));
        }
        sparseArray.put(0, new s(new m5.k(this)));
        this.f51873r = null;
    }

    @Override // n2.k
    public final boolean a(n2.l lVar) throws EOFException, InterruptedIOException {
        byte[] bArr = this.f51860d.f44813a;
        n2.h hVar = (n2.h) lVar;
        hVar.peekFully(bArr, 0, 940, false);
        for (int i10 = 0; i10 < 188; i10++) {
            int i11 = 0;
            while (true) {
                if (i11 >= 5) {
                    hVar.skipFully(i10, false);
                    return true;
                }
                if (bArr[(i11 * 188) + i10] != 71) {
                    break;
                }
                i11++;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6, types: [int] */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8, types: [int] */
    /* JADX WARN: Type inference failed for: r7v1, types: [android.util.SparseArray] */
    /* JADX WARN: Type inference failed for: r7v2, types: [android.util.SparseBooleanArray] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [u3.v] */
    /* JADX WARN: Type inference failed for: r8v9 */
    @Override // n2.k
    public final int b(n2.l lVar, q2 q2Var) throws e0 {
        n2.l lVar2;
        ?? r2;
        int i10;
        int i11;
        int i12;
        int i13;
        v vVar;
        boolean z10;
        long J;
        long J2;
        long length = lVar.getLength();
        int i14 = this.f51857a;
        boolean z11 = i14 == 2;
        if (this.f51870o) {
            o oVar = this.f51867k;
            if (length != -1 && !z11 && !oVar.f51827d) {
                int i15 = this.f51875t;
                x xVar = oVar.f51825b;
                l1.q qVar = oVar.f51826c;
                if (i15 <= 0) {
                    oVar.a(lVar);
                    return 0;
                }
                if (oVar.f51829f) {
                    if (oVar.f51831h == C.TIME_UNSET) {
                        oVar.a(lVar);
                        return 0;
                    }
                    if (oVar.f51828e) {
                        long j10 = oVar.f51830g;
                        if (j10 == C.TIME_UNSET) {
                            oVar.a(lVar);
                            return 0;
                        }
                        oVar.f51832i = xVar.c(oVar.f51831h) - xVar.b(j10);
                        oVar.a(lVar);
                        return 0;
                    }
                    int iMin = (int) Math.min(112800, lVar.getLength());
                    long j11 = 0;
                    if (lVar.getPosition() != j11) {
                        q2Var.f18888a = j11;
                        return 1;
                    }
                    qVar.J(iMin);
                    lVar.resetPeekPosition();
                    lVar.peekFully(qVar.f44813a, 0, iMin);
                    int i16 = qVar.f44815c;
                    for (int i17 = qVar.f44814b; i17 < i16; i17++) {
                        if (qVar.f44813a[i17] == 71) {
                            J = x7.a.J(qVar, i17, i15);
                            if (J != C.TIME_UNSET) {
                                oVar.f51830g = J;
                                oVar.f51828e = true;
                                return 0;
                            }
                        }
                    }
                    J = -9223372036854775807L;
                    oVar.f51830g = J;
                    oVar.f51828e = true;
                    return 0;
                }
                long length2 = lVar.getLength();
                int iMin2 = (int) Math.min(112800, length2);
                long j12 = length2 - ((long) iMin2);
                if (lVar.getPosition() != j12) {
                    q2Var.f18888a = j12;
                    return 1;
                }
                qVar.J(iMin2);
                lVar.resetPeekPosition();
                lVar.peekFully(qVar.f44813a, 0, iMin2);
                int i18 = qVar.f44814b;
                int i19 = qVar.f44815c;
                for (int i20 = i19 - 188; i20 >= i18; i20--) {
                    byte[] bArr = qVar.f44813a;
                    int i21 = 0;
                    for (int i22 = -4; i22 <= 4; i22++) {
                        int i23 = (i22 * 188) + i20;
                        if (i23 < i18 || i23 >= i19 || bArr[i23] != 71) {
                            i21 = 0;
                        } else {
                            i21++;
                            if (i21 == 5) {
                                J2 = x7.a.J(qVar, i20, i15);
                                if (J2 == C.TIME_UNSET) {
                                    break;
                                }
                                oVar.f51831h = J2;
                                oVar.f51829f = true;
                                return 0;
                            }
                        }
                    }
                }
                J2 = -9223372036854775807L;
                oVar.f51831h = J2;
                oVar.f51829f = true;
                return 0;
            }
            if (this.f51871p) {
                i10 = 1;
                z10 = false;
                i11 = i14;
            } else {
                this.f51871p = true;
                long j13 = oVar.f51832i;
                if (j13 != C.TIME_UNSET) {
                    i10 = 1;
                    i11 = i14;
                    z10 = false;
                    s2.b bVar = new s2.b(new j2.n(25), new b2.p(this.f51875t, oVar.f51825b), j13, j13 + 1, 0L, length, 188L, 940);
                    this.l = bVar;
                    this.f51868m.u((n2.c) bVar.f14172b);
                } else {
                    i10 = 1;
                    z10 = false;
                    i11 = i14;
                    this.f51868m.u(new n2.o(j13));
                }
            }
            if (this.f51872q) {
                this.f51872q = z10;
                seek(0L, 0L);
                if (lVar.getPosition() != 0) {
                    q2Var.f18888a = 0L;
                    return i10;
                }
            }
            s2.b bVar2 = this.l;
            if (bVar2 != null && ((b2) bVar2.f14174d) != null) {
                return bVar2.a(lVar, q2Var);
            }
            lVar2 = lVar;
            r2 = z10;
        } else {
            lVar2 = lVar;
            r2 = 0;
            i10 = 1;
            i11 = i14;
        }
        l1.q qVar2 = this.f51860d;
        byte[] bArr2 = qVar2.f44813a;
        if (9400 - qVar2.f44814b < 188) {
            int iA = qVar2.a();
            if (iA > 0) {
                System.arraycopy(bArr2, qVar2.f44814b, bArr2, r2, iA);
            }
            qVar2.K(bArr2, iA);
        }
        while (true) {
            int iA2 = qVar2.a();
            ?? r10 = this.f51864h;
            if (iA2 >= 188) {
                int i24 = qVar2.f44814b;
                int i25 = qVar2.f44815c;
                byte[] bArr3 = qVar2.f44813a;
                int i26 = i24;
                while (i26 < i25 && bArr3[i26] != 71) {
                    i26++;
                }
                qVar2.M(i26);
                int i27 = i26 + 188;
                ?? r11 = 0;
                if (i27 > i25) {
                    int i28 = (i26 - i24) + this.f51874s;
                    this.f51874s = i28;
                    i12 = i11;
                    i13 = 2;
                    if (i12 == 2 && i28 > 376) {
                        throw e0.a(null, "Cannot find sync byte. Most likely not a Transport Stream.");
                    }
                } else {
                    i12 = i11;
                    i13 = 2;
                    this.f51874s = r2;
                }
                int i29 = qVar2.f44815c;
                if (i27 > i29) {
                    return r2;
                }
                int iM = qVar2.m();
                if ((8388608 & iM) != 0) {
                    qVar2.M(i27);
                    return r2;
                }
                ?? r12 = (4194304 & iM) != 0 ? 1 : r2;
                int i30 = (2096896 & iM) >> 8;
                ?? r14 = (iM & 32) != 0 ? 1 : r2;
                if ((iM & 16) != 0) {
                    vVar = (v) r10.get(i30);
                }
                if (r11 == 0) {
                    r11 = vVar;
                    qVar2.M(i27);
                    return r2;
                }
                if (i12 != i13) {
                    int i31 = iM & 15;
                    SparseIntArray sparseIntArray = this.f51861e;
                    int i32 = sparseIntArray.get(i30, i31 - 1);
                    sparseIntArray.put(i30, i31);
                    if (i32 == i31) {
                        qVar2.M(i27);
                        return r2;
                    }
                    if (i31 != ((i32 + 1) & 15)) {
                        r11.seek();
                    }
                }
                if (r14 != 0) {
                    int iZ = qVar2.z();
                    r12 = (r12 == true ? 1 : 0) | ((qVar2.z() & 64) != 0 ? i13 : r2);
                    qVar2.N(iZ - 1);
                }
                boolean z12 = this.f51870o;
                if (i12 == i13 || z12 || !this.f51866j.get(i30, r2)) {
                    qVar2.L(i27);
                    r11.b(r12, qVar2);
                    qVar2.L(i29);
                }
                if (i12 != i13 && !z12 && this.f51870o && length != -1) {
                    this.f51872q = true;
                }
                qVar2.M(i27);
                return r2;
            }
            int i33 = qVar2.f44815c;
            int i34 = lVar2.read(bArr2, i33, 9400 - i33);
            if (i34 == -1) {
                for (?? r13 = r2; r13 < r10.size(); r13++) {
                    v vVar2 = (v) r10.valueAt(r13);
                    if (vVar2 instanceof n) {
                        n nVar = (n) vVar2;
                        ?? r3 = (!z11 || nVar.d()) ? i10 : r2;
                        if (nVar.f51815c == 3 && nVar.f51822j == -1 && ((!z11 || !(nVar.f51813a instanceof h)) && r3 != 0)) {
                            nVar.b(i10, new l1.q());
                        }
                    }
                    i10 = 1;
                }
                return -1;
            }
            qVar2.L(i33 + i34);
            i10 = 1;
        }
    }

    @Override // n2.k
    public final void c(n2.m mVar) {
        if ((this.f51858b & 1) == 0) {
            mVar = new bc.s(mVar, this.f51863g);
        }
        this.f51868m = mVar;
    }

    @Override // n2.k
    public final void seek(long j10, long j11) {
        s2.b bVar;
        long j12;
        SparseArray sparseArray = this.f51864h;
        List list = this.f51859c;
        go.k.t(this.f51857a != 2);
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            x xVar = (x) list.get(i10);
            synchronized (xVar) {
                j12 = xVar.f44827b;
            }
            boolean z10 = j12 == C.TIME_UNSET;
            if (!z10) {
                long jD = xVar.d();
                z10 = (jD == C.TIME_UNSET || jD == 0 || jD == j11) ? false : true;
            }
            if (z10) {
                xVar.f(j11);
            }
        }
        if (j11 != 0 && (bVar = this.l) != null) {
            bVar.c(j11);
        }
        this.f51860d.J(0);
        this.f51861e.clear();
        for (int i11 = 0; i11 < sparseArray.size(); i11++) {
            ((v) sparseArray.valueAt(i11)).seek();
        }
        this.f51874s = 0;
    }

    @Override // n2.k
    public final void release() {
    }
}
