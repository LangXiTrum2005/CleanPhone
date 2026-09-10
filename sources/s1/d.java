package s1;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import i1.n0;
import i1.o0;
import i1.p0;
import i1.u;
import i1.y;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends p0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f50002b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f50003c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f50004d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f50005e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f50006f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f50007g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f50008h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t1.c f50009i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final y f50010j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final u f50011k;

    public d(long j10, long j11, long j12, int i10, long j13, long j14, long j15, t1.c cVar, y yVar, u uVar) {
        go.k.t(cVar.f50342d == (uVar != null));
        this.f50002b = j10;
        this.f50003c = j11;
        this.f50004d = j12;
        this.f50005e = i10;
        this.f50006f = j13;
        this.f50007g = j14;
        this.f50008h = j15;
        this.f50009i = cVar;
        this.f50010j = yVar;
        this.f50011k = uVar;
    }

    @Override // i1.p0
    public final int b(Object obj) {
        int iIntValue;
        if ((obj instanceof Integer) && (iIntValue = ((Integer) obj).intValue() - this.f50005e) >= 0 && iIntValue < h()) {
            return iIntValue;
        }
        return -1;
    }

    @Override // i1.p0
    public final n0 f(int i10, n0 n0Var, boolean z10) {
        go.k.m(i10, h());
        t1.c cVar = this.f50009i;
        String str = z10 ? cVar.a(i10).f50372a : null;
        Integer numValueOf = z10 ? Integer.valueOf(this.f50005e + i10) : null;
        long jC = cVar.c(i10);
        long jM = l1.y.M(cVar.a(i10).f50373b - cVar.a(0).f50373b) - this.f50006f;
        n0Var.getClass();
        n0Var.h(str, numValueOf, 0, jC, jM, i1.c.f42523c, false);
        return n0Var;
    }

    @Override // i1.p0
    public final int h() {
        return this.f50009i.f50350m.size();
    }

    @Override // i1.p0
    public final Object l(int i10) {
        go.k.m(i10, h());
        return Integer.valueOf(this.f50005e + i10);
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00c7  */
    @Override // i1.p0
    public final o0 m(int i10, o0 o0Var, long j10) {
        boolean z10;
        long j11;
        long j12;
        boolean z11;
        long j13;
        g gVarB;
        go.k.m(i10, 1);
        t1.c cVar = this.f50009i;
        boolean z12 = cVar.f50342d;
        long timeUs = this.f50008h;
        if (z12 && cVar.f50343e != C.TIME_UNSET && cVar.f50340b == C.TIME_UNSET) {
            long j14 = 0;
            if (j10 > 0) {
                timeUs += j10;
                if (timeUs > this.f50007g) {
                    z10 = true;
                    j12 = -9223372036854775807L;
                    j11 = -9223372036854775807L;
                }
                Object obj = o0.f42614q;
                if (cVar.f50342d || cVar.f50343e == j11 || cVar.f50340b != j11) {
                    z11 = false;
                } else {
                    z11 = z10;
                }
                o0Var.b(this.f50010j, cVar, this.f50002b, this.f50003c, this.f50004d, true, z11, this.f50011k, j12, this.f50007g, h() - 1, this.f50006f);
                return o0Var;
            }
            long j15 = this.f50006f + timeUs;
            long jC = cVar.c(0);
            int i11 = 0;
            while (i11 < cVar.f50350m.size() - 1 && j15 >= jC) {
                j15 -= jC;
                i11++;
                jC = cVar.c(i11);
            }
            t1.h hVarA = cVar.a(i11);
            List list = hVarA.f50374c;
            z10 = true;
            int size = list.size();
            j11 = -9223372036854775807L;
            int i12 = 0;
            while (true) {
                if (i12 >= size) {
                    j13 = j14;
                    i12 = -1;
                    break;
                }
                j13 = j14;
                if (((t1.a) list.get(i12)).f50330b == 2) {
                    break;
                }
                i12++;
                j14 = j13;
            }
            if (i12 != -1 && (gVarB = ((t1.m) ((t1.a) hVarA.f50374c.get(i12)).f50331c.get(0)).b()) != null && gVarB.q(jC) != j13) {
                timeUs = (gVarB.getTimeUs(gVarB.k(j15, jC)) + timeUs) - j15;
            }
        } else {
            z10 = true;
            j11 = -9223372036854775807L;
        }
        j12 = timeUs;
        Object obj2 = o0.f42614q;
        if (cVar.f50342d) {
            z11 = false;
        } else {
            z11 = false;
        }
        o0Var.b(this.f50010j, cVar, this.f50002b, this.f50003c, this.f50004d, true, z11, this.f50011k, j12, this.f50007g, h() - 1, this.f50006f);
        return o0Var;
    }

    @Override // i1.p0
    public final int o() {
        return 1;
    }
}
