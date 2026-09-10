package k3;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import l1.y;
import oa.f0;
import oa.j0;
import oa.l1;
import oa.n1;
import oa.p;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p f44272c = new p(new d2.c(11), l1.f47272a);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j0 f44273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f44274b;

    /* JADX WARN: Code duplicated, block: B:37:0x00cf  */
    public b(n1 n1Var) {
        int i10 = n1Var.f47283d;
        long j10 = C.TIME_UNSET;
        int i11 = 0;
        if (i10 == 1) {
            f0 f0VarListIterator = n1Var.listIterator(0);
            Object next = f0VarListIterator.next();
            if (f0VarListIterator.hasNext()) {
                StringBuilder sb2 = new StringBuilder("expected one element but was: <");
                sb2.append(next);
                while (i11 < 4 && f0VarListIterator.hasNext()) {
                    sb2.append(", ");
                    sb2.append(f0VarListIterator.next());
                    i11++;
                }
                if (f0VarListIterator.hasNext()) {
                    sb2.append(", ...");
                }
                sb2.append('>');
                throw new IllegalArgumentException(sb2.toString());
            }
            a aVar = (a) next;
            long j11 = aVar.f44269b;
            j0 j0Var = aVar.f44268a;
            long j12 = aVar.f44270c;
            long j13 = j11 == C.TIME_UNSET ? 0L : j11;
            if (j12 == C.TIME_UNSET) {
                this.f44273a = j0.B(j0Var);
                this.f44274b = new long[]{j13};
                return;
            } else {
                f0 f0Var = j0.f47265b;
                this.f44273a = j0.C(j0Var, n1.f47281e);
                this.f44274b = new long[]{j13, j12 + j13};
                return;
            }
        }
        long[] jArr = new long[i10 * 2];
        this.f44274b = jArr;
        Arrays.fill(jArr, Long.MAX_VALUE);
        ArrayList arrayList = new ArrayList();
        n1 n1VarF = j0.F(f44272c, n1Var);
        int i12 = 0;
        while (i11 < n1VarF.f47283d) {
            a aVar2 = (a) n1VarF.get(i11);
            long j14 = aVar2.f44269b;
            long j15 = aVar2.f44270c;
            j0 j0Var2 = aVar2.f44268a;
            j14 = j14 == j10 ? 0L : j14;
            long j16 = j14 + j15;
            if (i12 != 0) {
                int i13 = i12 - 1;
                long j17 = this.f44274b[i13];
                if (j17 < j14) {
                    this.f44274b[i12] = j14;
                    arrayList.add(j0Var2);
                    i12++;
                } else if (j17 == j14 && ((j0) arrayList.get(i13)).isEmpty()) {
                    arrayList.set(i13, j0Var2);
                } else {
                    l1.a.s("CuesWithTimingSubtitle", "Truncating unsupported overlapping cues.");
                    this.f44274b[i13] = j14;
                    arrayList.set(i13, j0Var2);
                }
            } else {
                this.f44274b[i12] = j14;
                arrayList.add(j0Var2);
                i12++;
            }
            if (j15 != j10) {
                this.f44274b[i12] = j16;
                arrayList.add(n1.f47281e);
                i12++;
            }
            i11++;
            j10 = j10;
        }
        this.f44273a = j0.x(arrayList);
    }

    @Override // k3.d
    public final List getCues(long j10) {
        int iF = y.f(this.f44274b, j10, false);
        if (iF != -1) {
            return (j0) this.f44273a.get(iF);
        }
        f0 f0Var = j0.f47265b;
        return n1.f47281e;
    }

    @Override // k3.d
    public final long getEventTime(int i10) {
        go.k.i(i10 < this.f44273a.size());
        return this.f44274b[i10];
    }

    @Override // k3.d
    public final int getEventTimeCount() {
        return this.f44273a.size();
    }

    @Override // k3.d
    public final int getNextEventTimeIndex(long j10) {
        int iB = y.b(this.f44274b, j10, false);
        if (iB < this.f44273a.size()) {
            return iB;
        }
        return -1;
    }
}
