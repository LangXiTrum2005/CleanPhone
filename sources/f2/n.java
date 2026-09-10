package f2;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.List;
import oa.n1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class n implements e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n1 f40408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f40409b;

    public n(List list, List list2) {
        oa.e0 e0VarU = oa.j0.u();
        go.k.i(list.size() == list2.size());
        for (int i10 = 0; i10 < list.size(); i10++) {
            e0VarU.b(new m((e1) list.get(i10), (List) list2.get(i10)));
        }
        this.f40408a = e0VarU.g();
        this.f40409b = C.TIME_UNSET;
    }

    @Override // f2.e1
    public final boolean f(p1.k0 k0Var) {
        boolean zF;
        boolean z10 = false;
        do {
            long nextLoadPositionUs = getNextLoadPositionUs();
            if (nextLoadPositionUs == Long.MIN_VALUE) {
                return z10;
            }
            int i10 = 0;
            zF = false;
            while (true) {
                n1 n1Var = this.f40408a;
                if (i10 >= n1Var.f47283d) {
                    break;
                }
                long nextLoadPositionUs2 = ((m) n1Var.get(i10)).f40403a.getNextLoadPositionUs();
                boolean z11 = nextLoadPositionUs2 != Long.MIN_VALUE && nextLoadPositionUs2 <= k0Var.f48103a;
                if (nextLoadPositionUs2 == nextLoadPositionUs || z11) {
                    zF |= ((m) n1Var.get(i10)).f40403a.f(k0Var);
                }
                i10++;
            }
            z10 |= zF;
        } while (zF);
        return z10;
    }

    @Override // f2.e1
    public final long getBufferedPositionUs() {
        int i10 = 0;
        long jMin = Long.MAX_VALUE;
        long jMin2 = Long.MAX_VALUE;
        while (true) {
            n1 n1Var = this.f40408a;
            if (i10 >= n1Var.f47283d) {
                break;
            }
            m mVar = (m) n1Var.get(i10);
            long bufferedPositionUs = mVar.f40403a.getBufferedPositionUs();
            oa.j0 j0Var = mVar.f40404b;
            if ((j0Var.contains(1) || j0Var.contains(2) || j0Var.contains(4)) && bufferedPositionUs != Long.MIN_VALUE) {
                jMin = Math.min(jMin, bufferedPositionUs);
            }
            if (bufferedPositionUs != Long.MIN_VALUE) {
                jMin2 = Math.min(jMin2, bufferedPositionUs);
            }
            i10++;
        }
        if (jMin != Long.MAX_VALUE) {
            this.f40409b = jMin;
            return jMin;
        }
        if (jMin2 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        long j10 = this.f40409b;
        return j10 != C.TIME_UNSET ? j10 : jMin2;
    }

    @Override // f2.e1
    public final long getNextLoadPositionUs() {
        int i10 = 0;
        long jMin = Long.MAX_VALUE;
        while (true) {
            n1 n1Var = this.f40408a;
            if (i10 >= n1Var.f47283d) {
                break;
            }
            long nextLoadPositionUs = ((m) n1Var.get(i10)).f40403a.getNextLoadPositionUs();
            if (nextLoadPositionUs != Long.MIN_VALUE) {
                jMin = Math.min(jMin, nextLoadPositionUs);
            }
            i10++;
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // f2.e1
    public final boolean isLoading() {
        int i10 = 0;
        while (true) {
            n1 n1Var = this.f40408a;
            if (i10 >= n1Var.f47283d) {
                return false;
            }
            if (((m) n1Var.get(i10)).f40403a.isLoading()) {
                return true;
            }
            i10++;
        }
    }

    @Override // f2.e1
    public final void reevaluateBuffer(long j10) {
        int i10 = 0;
        while (true) {
            n1 n1Var = this.f40408a;
            if (i10 >= n1Var.f47283d) {
                return;
            }
            ((m) n1Var.get(i10)).reevaluateBuffer(j10);
            i10++;
        }
    }
}
