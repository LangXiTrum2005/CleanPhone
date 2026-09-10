package m2;

import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import i1.p;
import java.nio.ByteBuffer;
import l1.q;
import l1.y;
import m0.s1;
import o1.d;
import p1.w;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends p1.a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final d f45828s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final q f45829t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public w f45830u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f45831v;

    public a() {
        super(6);
        this.f45828s = new d(1);
        this.f45829t = new q();
    }

    @Override // p1.a
    public final int A(p pVar) {
        return MimeTypes.APPLICATION_CAMERA_MOTION.equals(pVar.f42643n) ? p1.a.c(4, 0, 0, 0) : p1.a.c(0, 0, 0, 0);
    }

    @Override // p1.a
    public final String h() {
        return "CameraMotionRenderer";
    }

    @Override // p1.a, p1.y0
    public final void handleMessage(int i10, Object obj) {
        if (i10 == 8) {
            this.f45830u = (w) obj;
        }
    }

    @Override // p1.a
    public final boolean j() {
        return i();
    }

    @Override // p1.a
    public final boolean l() {
        return true;
    }

    @Override // p1.a
    public final void m() {
        w wVar = this.f45830u;
        if (wVar != null) {
            wVar.c();
        }
    }

    @Override // p1.a
    public final void o(long j10, boolean z10, boolean z11) {
        this.f45831v = Long.MIN_VALUE;
        w wVar = this.f45830u;
        if (wVar != null) {
            wVar.c();
        }
    }

    @Override // p1.a
    public final void w(long j10, long j11) {
        float[] fArr;
        while (!i() && this.f45831v < 100000 + j10) {
            d dVar = this.f45828s;
            dVar.g();
            s1 s1Var = this.f47907c;
            s1Var.c();
            if (v(s1Var, dVar, 0) != -4 || dVar.c(4)) {
                return;
            }
            long j12 = dVar.f47037g;
            this.f45831v = j12;
            boolean z10 = j12 < this.l;
            if (this.f45830u != null && !z10) {
                dVar.j();
                ByteBuffer byteBuffer = dVar.f47035e;
                String str = y.f44830a;
                if (byteBuffer.remaining() != 16) {
                    fArr = null;
                } else {
                    byte[] bArrArray = byteBuffer.array();
                    int iLimit = byteBuffer.limit();
                    q qVar = this.f45829t;
                    qVar.K(bArrArray, iLimit);
                    qVar.M(byteBuffer.arrayOffset() + 4);
                    float[] fArr2 = new float[3];
                    for (int i10 = 0; i10 < 3; i10++) {
                        fArr2[i10] = Float.intBitsToFloat(qVar.o());
                    }
                    fArr = fArr2;
                }
                if (fArr != null) {
                    this.f45830u.b();
                }
            }
        }
    }
}
