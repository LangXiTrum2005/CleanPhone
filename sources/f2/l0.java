package f2;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import oa.n1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class l0 implements a0, z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0[] f40392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean[] f40393b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IdentityHashMap f40394c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ea.b0 f40395d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f40396e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashMap f40397f = new HashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public z f40398g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public k1 f40399h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public a0[] f40400i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public n f40401j;

    public l0(ea.b0 b0Var, long[] jArr, a0... a0VarArr) {
        this.f40395d = b0Var;
        this.f40392a = a0VarArr;
        b0Var.getClass();
        oa.f0 f0Var = oa.j0.f47265b;
        n1 n1Var = n1.f47281e;
        this.f40401j = new n(n1Var, n1Var);
        this.f40394c = new IdentityHashMap();
        this.f40400i = new a0[0];
        this.f40393b = new boolean[a0VarArr.length];
        for (int i10 = 0; i10 < a0VarArr.length; i10++) {
            long j10 = jArr[i10];
            if (j10 != 0) {
                this.f40393b[i10] = true;
                this.f40392a[i10] = new i1(a0VarArr[i10], j10);
            }
        }
    }

    @Override // f2.a0
    public final long a(long j10, p1.e1 e1Var) {
        a0[] a0VarArr = this.f40400i;
        return (a0VarArr.length > 0 ? a0VarArr[0] : this.f40392a[0]).a(j10, e1Var);
    }

    @Override // f2.a0
    public final long c(i2.r[] rVarArr, boolean[] zArr, c1[] c1VarArr, boolean[] zArr2, long j10) {
        IdentityHashMap identityHashMap;
        int[] iArr = new int[rVarArr.length];
        int[] iArr2 = new int[rVarArr.length];
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int length = rVarArr.length;
            identityHashMap = this.f40394c;
            if (i11 >= length) {
                break;
            }
            c1 c1Var = c1VarArr[i11];
            Integer num = c1Var == null ? null : (Integer) identityHashMap.get(c1Var);
            iArr[i11] = num == null ? -1 : num.intValue();
            i2.r rVar = rVarArr[i11];
            if (rVar != null) {
                String str = rVar.getTrackGroup().f42660b;
                iArr2[i11] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr2[i11] = -1;
            }
            i11++;
        }
        identityHashMap.clear();
        int length2 = rVarArr.length;
        c1[] c1VarArr2 = new c1[length2];
        c1[] c1VarArr3 = new c1[rVarArr.length];
        i2.r[] rVarArr2 = new i2.r[rVarArr.length];
        a0[] a0VarArr = this.f40392a;
        ArrayList arrayList = new ArrayList(a0VarArr.length);
        long j11 = j10;
        int i12 = 0;
        while (i12 < a0VarArr.length) {
            int i13 = i10;
            while (i13 < rVarArr.length) {
                c1VarArr3[i13] = iArr[i13] == i12 ? c1VarArr[i13] : null;
                if (iArr2[i13] == i12) {
                    i2.r rVar2 = rVarArr[i13];
                    rVar2.getClass();
                    i1.q0 q0Var = (i1.q0) this.f40397f.get(rVar2.getTrackGroup());
                    q0Var.getClass();
                    rVarArr2[i13] = new k0(rVar2, q0Var);
                } else {
                    rVarArr2[i13] = null;
                }
                i13++;
                iArr = iArr;
            }
            int[] iArr3 = iArr;
            a0[] a0VarArr2 = a0VarArr;
            int i14 = i12;
            long jC = a0VarArr2[i12].c(rVarArr2, zArr, c1VarArr3, zArr2, j11);
            if (i14 == 0) {
                j11 = jC;
            } else if (jC != j11) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z10 = false;
            for (int i15 = 0; i15 < rVarArr.length; i15++) {
                if (iArr2[i15] == i14) {
                    c1 c1Var2 = c1VarArr3[i15];
                    c1Var2.getClass();
                    c1VarArr2[i15] = c1VarArr3[i15];
                    identityHashMap.put(c1Var2, Integer.valueOf(i14));
                    z10 = true;
                } else if (iArr3[i15] == i14) {
                    go.k.t(c1VarArr3[i15] == null);
                }
            }
            if (z10) {
                arrayList.add(a0VarArr2[i14]);
            }
            i12 = i14 + 1;
            a0VarArr = a0VarArr2;
            iArr = iArr3;
            i10 = 0;
        }
        int i16 = i10;
        System.arraycopy(c1VarArr2, i16, c1VarArr, i16, length2);
        this.f40400i = (a0[]) arrayList.toArray(new a0[i16]);
        AbstractList abstractListZ = oa.q.z(arrayList, new d2.c(2));
        this.f40395d.getClass();
        this.f40401j = new n(arrayList, abstractListZ);
        return j11;
    }

    @Override // f2.a0
    public final void e(z zVar, long j10) {
        this.f40398g = zVar;
        ArrayList arrayList = this.f40396e;
        a0[] a0VarArr = this.f40392a;
        Collections.addAll(arrayList, a0VarArr);
        for (a0 a0Var : a0VarArr) {
            a0Var.e(this, j10);
        }
    }

    @Override // f2.e1
    public final boolean f(p1.k0 k0Var) {
        ArrayList arrayList = this.f40396e;
        if (arrayList.isEmpty()) {
            return this.f40401j.f(k0Var);
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((a0) arrayList.get(i10)).f(k0Var);
        }
        return false;
    }

    @Override // f2.a0
    public final void g(long j10) {
        for (a0 a0Var : this.f40400i) {
            a0Var.g(j10);
        }
    }

    @Override // f2.e1
    public final long getBufferedPositionUs() {
        return this.f40401j.getBufferedPositionUs();
    }

    @Override // f2.e1
    public final long getNextLoadPositionUs() {
        return this.f40401j.getNextLoadPositionUs();
    }

    @Override // f2.a0
    public final k1 getTrackGroups() {
        k1 k1Var = this.f40399h;
        k1Var.getClass();
        return k1Var;
    }

    @Override // f2.d1
    public final void h(e1 e1Var) {
        z zVar = this.f40398g;
        zVar.getClass();
        zVar.h(this);
    }

    @Override // f2.e1
    public final boolean isLoading() {
        return this.f40401j.isLoading();
    }

    @Override // f2.z
    public final void j(a0 a0Var) {
        ArrayList arrayList = this.f40396e;
        arrayList.remove(a0Var);
        if (arrayList.isEmpty()) {
            a0[] a0VarArr = this.f40392a;
            int i10 = 0;
            for (a0 a0Var2 : a0VarArr) {
                i10 += a0Var2.getTrackGroups().f40386a;
            }
            i1.q0[] q0VarArr = new i1.q0[i10];
            int i11 = 0;
            for (int i12 = 0; i12 < a0VarArr.length; i12++) {
                k1 trackGroups = a0VarArr[i12].getTrackGroups();
                int i13 = trackGroups.f40386a;
                int i14 = 0;
                while (i14 < i13) {
                    i1.q0 q0VarA = trackGroups.a(i14);
                    int i15 = q0VarA.f42659a;
                    i1.p[] pVarArr = new i1.p[i15];
                    for (int i16 = 0; i16 < i15; i16++) {
                        i1.p pVar = q0VarA.f42662d[i16];
                        i1.o oVarA = pVar.a();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(i12);
                        sb2.append(":");
                        String str = pVar.f42631a;
                        if (str == null) {
                            str = "";
                        }
                        sb2.append(str);
                        oVarA.f42589a = sb2.toString();
                        pVarArr[i16] = new i1.p(oVarA);
                    }
                    i1.q0 q0Var = new i1.q0(i12 + ":" + q0VarA.f42660b, pVarArr);
                    this.f40397f.put(q0Var, q0VarA);
                    q0VarArr[i11] = q0Var;
                    i14++;
                    i11++;
                }
            }
            this.f40399h = new k1(q0VarArr);
            z zVar = this.f40398g;
            zVar.getClass();
            zVar.j(this);
        }
    }

    @Override // f2.a0
    public final void maybeThrowPrepareError() {
        for (a0 a0Var : this.f40392a) {
            a0Var.maybeThrowPrepareError();
        }
    }

    @Override // f2.a0
    public final long readDiscontinuity() {
        long j10 = -9223372036854775807L;
        for (a0 a0Var : this.f40400i) {
            long discontinuity = a0Var.readDiscontinuity();
            if (discontinuity == C.TIME_UNSET) {
                if (j10 != C.TIME_UNSET && a0Var.seekToUs(j10) != j10) {
                    throw new IllegalStateException("Unexpected child seekToUs result.");
                }
            } else if (j10 == C.TIME_UNSET) {
                for (a0 a0Var2 : this.f40400i) {
                    if (a0Var2 == a0Var) {
                        break;
                    }
                    if (a0Var2.seekToUs(discontinuity) != discontinuity) {
                        throw new IllegalStateException("Unexpected child seekToUs result.");
                    }
                }
                j10 = discontinuity;
            } else if (discontinuity != j10) {
                throw new IllegalStateException("Conflicting discontinuities.");
            }
        }
        return j10;
    }

    @Override // f2.e1
    public final void reevaluateBuffer(long j10) {
        this.f40401j.reevaluateBuffer(j10);
    }

    @Override // f2.a0
    public final long seekToUs(long j10) {
        long jSeekToUs = this.f40400i[0].seekToUs(j10);
        int i10 = 1;
        while (true) {
            a0[] a0VarArr = this.f40400i;
            if (i10 >= a0VarArr.length) {
                return jSeekToUs;
            }
            if (a0VarArr[i10].seekToUs(jSeekToUs) != jSeekToUs) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i10++;
        }
    }
}
