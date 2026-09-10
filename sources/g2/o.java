package g2;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import eb.d0;
import f2.b1;
import i1.p;
import n1.y;
import n2.a0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f41415o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final p f41416p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f41417q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f41418r;

    public o(n1.h hVar, n1.k kVar, p pVar, int i10, Object obj, long j10, long j11, long j12, int i11, p pVar2) {
        super(hVar, kVar, pVar, i10, obj, j10, j11, C.TIME_UNSET, C.TIME_UNSET, j12);
        this.f41415o = i11;
        this.f41416p = pVar2;
    }

    @Override // g2.m
    public final boolean b() {
        return this.f41418r;
    }

    @Override // j2.j
    public final void load() {
        y yVar = this.f41374i;
        d0 d0Var = this.f41342m;
        d0Var.getClass();
        for (b1 b1Var : (b1[]) d0Var.f39977c) {
            if (b1Var.F != 0) {
                b1Var.F = 0L;
                b1Var.f40303z = true;
            }
        }
        a0 a0VarA1 = d0Var.a1(this.f41415o);
        a0VarA1.b(this.f41416p);
        try {
            long jC = yVar.C(this.f41367b.a(this.f41417q));
            if (jC != -1) {
                jC += this.f41417q;
            }
            n2.h hVar = new n2.h(this.f41374i, this.f41417q, jC);
            for (int iC = 0; iC != -1; iC = a0VarA1.c(hVar, Integer.MAX_VALUE, true)) {
                this.f41417q += (long) iC;
            }
            a0VarA1.a(this.f41372g, 1, (int) this.f41417q, 0, null);
            com.google.android.gms.internal.auth.i.e(yVar);
            this.f41418r = true;
        } catch (Throwable th2) {
            com.google.android.gms.internal.auth.i.e(yVar);
            throw th2;
        }
    }

    @Override // j2.j
    public final void cancelLoad() {
    }
}
