package c2;

import b2.m;
import com.google.android.gms.internal.ads.ma;
import com.google.android.gms.internal.ads.xd1;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import l1.q;
import l1.y;
import n2.a0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f5843a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a0 f5845c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f5846d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f5848f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f5849g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xd1 f5844b = new xd1();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f5847e = C.TIME_UNSET;

    public b(m mVar) {
        this.f5843a = mVar;
    }

    @Override // c2.i
    public final void a(n2.m mVar, int i10) {
        a0 a0VarTrack = mVar.track(i10, 1);
        this.f5845c = a0VarTrack;
        a0VarTrack.b(this.f5843a.f5327c);
    }

    @Override // c2.i
    public final void b(q qVar, long j10, int i10, boolean z10) {
        int iZ = qVar.z() & 3;
        int iZ2 = qVar.z() & 255;
        long jB = r9.b.B(this.f5843a.f5326b, this.f5849g, j10, this.f5847e);
        if (iZ != 0) {
            if (iZ == 1 || iZ == 2) {
                int i11 = this.f5846d;
                if (i11 > 0) {
                    a0 a0Var = this.f5845c;
                    String str = y.f44830a;
                    a0Var.a(this.f5848f, 1, i11, 0, null);
                    this.f5846d = 0;
                }
            } else if (iZ != 3) {
                throw new IllegalArgumentException(String.valueOf(iZ));
            }
            int iA = qVar.a();
            a0 a0Var2 = this.f5845c;
            a0Var2.getClass();
            a0Var2.g(iA, qVar);
            int i12 = this.f5846d + iA;
            this.f5846d = i12;
            this.f5848f = jB;
            if (z10 && iZ == 3) {
                a0 a0Var3 = this.f5845c;
                String str2 = y.f44830a;
                a0Var3.a(jB, 1, i12, 0, null);
                this.f5846d = 0;
                return;
            }
            return;
        }
        int i13 = this.f5846d;
        if (i13 > 0) {
            a0 a0Var4 = this.f5845c;
            String str3 = y.f44830a;
            a0Var4.a(this.f5848f, 1, i13, 0, null);
            this.f5846d = 0;
        }
        if (iZ2 == 1) {
            int iA2 = qVar.a();
            a0 a0Var5 = this.f5845c;
            a0Var5.getClass();
            a0Var5.g(iA2, qVar);
            a0 a0Var6 = this.f5845c;
            String str4 = y.f44830a;
            a0Var6.a(jB, 1, iA2, 0, null);
            return;
        }
        byte[] bArr = qVar.f44813a;
        xd1 xd1Var = this.f5844b;
        xd1Var.getClass();
        xd1Var.p(bArr, bArr.length);
        xd1Var.u(2);
        long j11 = jB;
        for (int i14 = 0; i14 < iZ2; i14++) {
            ma maVarQ = n2.b.q(xd1Var);
            int i15 = maVarQ.f17362c;
            a0 a0Var7 = this.f5845c;
            a0Var7.getClass();
            a0Var7.g(i15, qVar);
            a0 a0Var8 = this.f5845c;
            String str5 = y.f44830a;
            a0Var8.a(j11, 1, maVarQ.f17362c, 0, null);
            j11 += ((long) (maVarQ.f17363d / maVarQ.f17360a)) * 1000000;
            xd1Var.u(i15);
        }
    }

    @Override // c2.i
    public final void c(long j10) {
        go.k.t(this.f5847e == C.TIME_UNSET);
        this.f5847e = j10;
    }

    @Override // c2.i
    public final void seek(long j10, long j11) {
        this.f5847e = j10;
        this.f5849g = j11;
    }
}
