package c2;

import b2.m;
import com.google.android.gms.internal.ads.xd1;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import i1.e0;
import l1.q;
import l1.y;
import n2.a0;
import oa.o0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f5882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5883b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a0 f5884c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f5885d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f5886e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f5887f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f5888g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f5889h;

    public f(m mVar) {
        this.f5882a = mVar;
        try {
            this.f5883b = d(mVar.f5328d);
            this.f5885d = C.TIME_UNSET;
            this.f5886e = -1;
            this.f5887f = 0;
            this.f5888g = 0L;
            this.f5889h = C.TIME_UNSET;
        } catch (e0 e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public static int d(o0 o0Var) throws e0 {
        String str = (String) o0Var.get("config");
        int i10 = 0;
        i10 = 0;
        if (str != null && str.length() % 2 == 0) {
            byte[] bArrU = y.u(str);
            xd1 xd1Var = new xd1(bArrU, bArrU.length);
            int i11 = xd1Var.i(1);
            if (i11 != 0) {
                throw new e0(l1.d.e(i11, "unsupported audio mux version: "), null, true, 0);
            }
            go.k.h("Only supports allStreamsSameTimeFraming.", xd1Var.i(1) == 1);
            int i12 = xd1Var.i(6);
            go.k.h("Only suppors one program.", xd1Var.i(4) == 0);
            go.k.h("Only suppors one layer.", xd1Var.i(3) == 0);
            i10 = i12;
        }
        return i10 + 1;
    }

    @Override // c2.i
    public final void a(n2.m mVar, int i10) {
        a0 a0VarTrack = mVar.track(i10, 2);
        this.f5884c = a0VarTrack;
        String str = y.f44830a;
        a0VarTrack.b(this.f5882a.f5327c);
    }

    @Override // c2.i
    public final void b(q qVar, long j10, int i10, boolean z10) {
        this.f5884c.getClass();
        int iA = b2.i.a(this.f5886e);
        if (this.f5887f > 0 && iA < i10) {
            a0 a0Var = this.f5884c;
            a0Var.getClass();
            a0Var.a(this.f5889h, 1, this.f5887f, 0, null);
            this.f5887f = 0;
            this.f5889h = C.TIME_UNSET;
        }
        for (int i11 = 0; i11 < this.f5883b; i11++) {
            int i12 = 0;
            while (qVar.f44814b < qVar.f44815c) {
                int iZ = qVar.z();
                i12 += iZ;
                if (iZ != 255) {
                    break;
                }
            }
            this.f5884c.g(i12, qVar);
            this.f5887f += i12;
        }
        this.f5889h = r9.b.B(this.f5882a.f5326b, this.f5888g, j10, this.f5885d);
        if (z10) {
            a0 a0Var2 = this.f5884c;
            a0Var2.getClass();
            a0Var2.a(this.f5889h, 1, this.f5887f, 0, null);
            this.f5887f = 0;
            this.f5889h = C.TIME_UNSET;
        }
        this.f5886e = i10;
    }

    @Override // c2.i
    public final void c(long j10) {
        go.k.t(this.f5885d == C.TIME_UNSET);
        this.f5885d = j10;
    }

    @Override // c2.i
    public final void seek(long j10, long j11) {
        this.f5885d = j10;
        this.f5887f = 0;
        this.f5888g = j11;
    }
}
