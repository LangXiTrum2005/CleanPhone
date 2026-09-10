package h2;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import go.k;
import java.util.ArrayList;
import oa.e0;
import oa.f0;
import oa.j0;
import oa.l1;
import oa.n1;
import oa.p;
import oa.w1;
import oa.z;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final z f42077b = new z(new p(new d2.c(4), l1.f47272a), new p(new d2.c(5), w1.f47340a));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f42078a = new ArrayList();

    @Override // h2.a
    public final j0 a(long j10) {
        ArrayList arrayList = this.f42078a;
        if (!arrayList.isEmpty()) {
            if (j10 >= ((k3.a) arrayList.get(0)).f44269b) {
                ArrayList arrayList2 = new ArrayList();
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    k3.a aVar = (k3.a) arrayList.get(i10);
                    if (j10 >= aVar.f44269b && j10 < aVar.f44271d) {
                        arrayList2.add(aVar);
                    }
                    if (j10 < aVar.f44269b) {
                        break;
                    }
                }
                n1 n1VarF = j0.F(f42077b, arrayList2);
                e0 e0VarU = j0.u();
                for (int i11 = 0; i11 < n1VarF.f47283d; i11++) {
                    e0VarU.d(((k3.a) n1VarF.get(i11)).f44268a);
                }
                return e0VarU.g();
            }
        }
        f0 f0Var = j0.f47265b;
        return n1.f47281e;
    }

    @Override // h2.a
    public final long b(long j10) {
        ArrayList arrayList = this.f42078a;
        if (arrayList.isEmpty()) {
            return C.TIME_UNSET;
        }
        if (j10 < ((k3.a) arrayList.get(0)).f44269b) {
            return C.TIME_UNSET;
        }
        long jMax = ((k3.a) arrayList.get(0)).f44269b;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            long j11 = ((k3.a) arrayList.get(i10)).f44269b;
            long j12 = ((k3.a) arrayList.get(i10)).f44271d;
            if (j12 > j10) {
                if (j11 > j10) {
                    break;
                }
                jMax = Math.max(jMax, j11);
            } else {
                jMax = Math.max(jMax, j12);
            }
        }
        return jMax;
    }

    @Override // h2.a
    public final long c(long j10) {
        int i10 = 0;
        long jMin = -9223372036854775807L;
        while (true) {
            ArrayList arrayList = this.f42078a;
            if (i10 >= arrayList.size()) {
                break;
            }
            long j11 = ((k3.a) arrayList.get(i10)).f44269b;
            long j12 = ((k3.a) arrayList.get(i10)).f44271d;
            if (j10 < j11) {
                if (jMin != C.TIME_UNSET) {
                    jMin = Math.min(jMin, j11);
                    break;
                }
                jMin = j11;
                break;
            }
            if (j10 < j12) {
                jMin = jMin == C.TIME_UNSET ? j12 : Math.min(jMin, j12);
            }
            i10++;
        }
        if (jMin != C.TIME_UNSET) {
            return jMin;
        }
        return Long.MIN_VALUE;
    }

    @Override // h2.a
    public final void clear() {
        this.f42078a.clear();
    }

    @Override // h2.a
    public final boolean d(k3.a aVar, long j10) {
        long j11 = aVar.f44269b;
        k.i(j11 != C.TIME_UNSET);
        k.i(aVar.f44270c != C.TIME_UNSET);
        boolean z10 = j11 <= j10 && j10 < aVar.f44271d;
        ArrayList arrayList = this.f42078a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (j11 >= ((k3.a) arrayList.get(size)).f44269b) {
                arrayList.add(size + 1, aVar);
                return z10;
            }
        }
        arrayList.add(0, aVar);
        return z10;
    }

    @Override // h2.a
    public final void e(long j10) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f42078a;
            if (i10 >= arrayList.size()) {
                return;
            }
            long j11 = ((k3.a) arrayList.get(i10)).f44269b;
            if (j10 > j11 && j10 > ((k3.a) arrayList.get(i10)).f44271d) {
                arrayList.remove(i10);
                i10--;
            } else if (j10 < j11) {
                return;
            }
            i10++;
        }
    }
}
