package c2;

import b2.m;
import com.google.android.gms.internal.ads.xd1;
import com.google.android.gms.internal.play_billing.q1;
import com.ironsource.X3;
import java.math.RoundingMode;
import l1.q;
import l1.y;
import n2.a0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f5834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xd1 f5835b = new xd1();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f5836c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f5837d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f5838e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f5839f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f5840g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public a0 f5841h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f5842i;

    public a(m mVar) {
        this.f5834a = mVar;
        this.f5836c = mVar.f5326b;
        String str = (String) mVar.f5328d.get(X3.a.f27684t);
        str.getClass();
        if (q1.m(str, "AAC-hbr")) {
            this.f5837d = 13;
            this.f5838e = 3;
        } else {
            if (!q1.m(str, "AAC-lbr")) {
                throw new UnsupportedOperationException("AAC mode not supported");
            }
            this.f5837d = 6;
            this.f5838e = 2;
        }
        this.f5839f = this.f5838e + this.f5837d;
    }

    @Override // c2.i
    public final void a(n2.m mVar, int i10) {
        a0 a0VarTrack = mVar.track(i10, 1);
        this.f5841h = a0VarTrack;
        a0VarTrack.b(this.f5834a.f5327c);
    }

    @Override // c2.i
    public final void b(q qVar, long j10, int i10, boolean z10) {
        this.f5841h.getClass();
        short sW = qVar.w();
        int i11 = sW / this.f5839f;
        long jB = r9.b.B(this.f5836c, this.f5842i, j10, this.f5840g);
        xd1 xd1Var = this.f5835b;
        xd1Var.o(qVar);
        int i12 = this.f5838e;
        int i13 = this.f5837d;
        if (i11 == 1) {
            int i14 = xd1Var.i(i13);
            xd1Var.t(i12);
            this.f5841h.g(qVar.a(), qVar);
            if (z10) {
                this.f5841h.a(jB, 1, i14, 0, null);
                return;
            }
            return;
        }
        qVar.N((sW + 7) / 8);
        long jU = jB;
        for (int i15 = 0; i15 < i11; i15++) {
            int i16 = xd1Var.i(i13);
            xd1Var.t(i12);
            this.f5841h.g(i16, qVar);
            this.f5841h.a(jU, 1, i16, 0, null);
            jU += y.U(i11, 1000000L, this.f5836c, RoundingMode.DOWN);
        }
    }

    @Override // c2.i
    public final void c(long j10) {
        this.f5840g = j10;
    }

    @Override // c2.i
    public final void seek(long j10, long j11) {
        this.f5840g = j10;
        this.f5842i = j11;
    }
}
