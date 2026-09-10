package s1;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import f2.c1;
import i1.p;
import l1.y;
import m0.s1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f50050a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long[] f50052c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f50053d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public t1.g f50054e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f50055f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f50056g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v6.c f50051b = new v6.c(13);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f50057h = C.TIME_UNSET;

    public j(t1.g gVar, p pVar, boolean z10) {
        this.f50050a = pVar;
        this.f50054e = gVar;
        this.f50052c = gVar.f50369b;
        a(gVar, z10);
    }

    public final void a(t1.g gVar, boolean z10) {
        int i10 = this.f50056g;
        long j10 = C.TIME_UNSET;
        long j11 = i10 == 0 ? -9223372036854775807L : this.f50052c[i10 - 1];
        this.f50053d = z10;
        this.f50054e = gVar;
        long[] jArr = gVar.f50369b;
        this.f50052c = jArr;
        long j12 = this.f50057h;
        if (j12 == C.TIME_UNSET) {
            if (j11 != C.TIME_UNSET) {
                this.f50056g = y.b(jArr, j11, false);
            }
        } else {
            int iB = y.b(jArr, j12, true);
            this.f50056g = iB;
            if (this.f50053d && iB == this.f50052c.length) {
                j10 = j12;
            }
            this.f50057h = j10;
        }
    }

    @Override // f2.c1
    public final int h(s1 s1Var, o1.d dVar, int i10) {
        int i11 = this.f50056g;
        boolean z10 = i11 == this.f50052c.length;
        if (z10 && !this.f50053d) {
            dVar.f22444b = 4;
            return -4;
        }
        if ((i10 & 2) != 0 || !this.f50055f) {
            s1Var.f45752c = this.f50050a;
            this.f50055f = true;
            return -5;
        }
        if (z10) {
            return -3;
        }
        if ((i10 & 1) == 0) {
            this.f50056g = i11 + 1;
        }
        if ((i10 & 4) == 0) {
            byte[] bArrO = this.f50051b.o(this.f50054e.f50368a[i11]);
            dVar.i(bArrO.length);
            dVar.f47035e.put(bArrO);
        }
        dVar.f47037g = this.f50052c[i11];
        dVar.f22444b = 1;
        return -4;
    }

    @Override // f2.c1
    public final boolean isReady() {
        return true;
    }

    @Override // f2.c1
    public final int skipData(long j10) {
        int iMax = Math.max(this.f50056g, y.b(this.f50052c, j10, true));
        int i10 = iMax - this.f50056g;
        this.f50056g = iMax;
        return i10;
    }

    @Override // f2.c1
    public final void maybeThrowError() {
    }
}
