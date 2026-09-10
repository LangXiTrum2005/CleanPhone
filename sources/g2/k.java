package g2;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import eb.d0;
import f2.b1;
import i1.p;
import l1.q;
import n1.y;
import n2.a0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f41404o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final long f41405p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e f41406q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f41407r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public volatile boolean f41408s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f41409t;

    public k(n1.h hVar, n1.k kVar, p pVar, int i10, Object obj, long j10, long j11, long j12, long j13, long j14, int i11, long j15, e eVar) {
        super(hVar, kVar, pVar, i10, obj, j10, j11, j12, j13, j14);
        this.f41404o = i11;
        this.f41405p = j15;
        this.f41406q = eVar;
    }

    @Override // g2.m
    public final long a() {
        return this.f41413j + ((long) this.f41404o);
    }

    @Override // g2.m
    public final boolean b() {
        return this.f41409t;
    }

    @Override // j2.j
    public final void cancelLoad() {
        this.f41408s = true;
    }

    @Override // j2.j
    public final void load() {
        d0 d0Var = this.f41342m;
        d0Var.getClass();
        if (this.f41407r == 0) {
            long j10 = this.f41405p;
            for (b1 b1Var : (b1[]) d0Var.f39977c) {
                if (b1Var.F != j10) {
                    b1Var.F = j10;
                    b1Var.f40303z = true;
                }
            }
            e eVar = this.f41406q;
            long j11 = this.f41341k;
            long j12 = C.TIME_UNSET;
            long j13 = j11 == C.TIME_UNSET ? -9223372036854775807L : j11 - this.f41405p;
            long j14 = this.l;
            if (j14 != C.TIME_UNSET) {
                j12 = j14 - this.f41405p;
            }
            eVar.b(d0Var, j13, j12);
        }
        try {
            n1.k kVarA = this.f41367b.a(this.f41407r);
            y yVar = this.f41374i;
            n2.h hVar = new n2.h(yVar, kVarA.f46373e, yVar.C(kVarA));
            while (!this.f41408s) {
                try {
                    int iB = this.f41406q.f41356a.b(hVar, e.f41355k);
                    go.k.t(iB != 1);
                    if (!(iB == 0)) {
                        break;
                    }
                } catch (Throwable th2) {
                    this.f41407r = hVar.f46466d - this.f41367b.f46373e;
                    throw th2;
                }
            }
            p pVar = this.f41369d;
            String str = pVar.f42642m;
            int i10 = pVar.M;
            int i11 = pVar.N;
            if (i1.d0.k(str) && ((i10 > 1 || i11 > 1) && i10 != -1 && i11 != -1)) {
                a0 a0VarA1 = d0Var.a1(4);
                int i12 = i10 * i11;
                long j15 = (this.f41373h - this.f41372g) / ((long) i12);
                for (int i13 = 1; i13 < i12; i13++) {
                    a0VarA1.g(0, new q());
                    a0VarA1.a(((long) i13) * j15, 0, 0, 0, null);
                }
            }
            this.f41407r = hVar.f46466d - this.f41367b.f46373e;
            com.google.android.gms.internal.auth.i.e(this.f41374i);
            this.f41409t = !this.f41408s;
        } catch (Throwable th3) {
            com.google.android.gms.internal.auth.i.e(this.f41374i);
            throw th3;
        }
    }
}
