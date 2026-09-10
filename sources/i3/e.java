package i3;

import com.google.android.gms.internal.ads.k7;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import eb.d0;
import i1.c0;
import i1.o;
import i1.p;
import java.util.ArrayList;
import java.util.Arrays;
import l1.q;
import oa.j0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends k7 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final byte[] f42848o = {79, 112, 117, 115, 72, 101, 97, 100};

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final byte[] f42849p = {79, 112, 117, 115, 84, 97, 103, 115};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f42850n;

    public static boolean i(q qVar, byte[] bArr) {
        if (qVar.a() < bArr.length) {
            return false;
        }
        int i10 = qVar.f44814b;
        byte[] bArr2 = new byte[bArr.length];
        qVar.k(bArr2, 0, bArr.length);
        qVar.M(i10);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // com.google.android.gms.internal.ads.k7
    public final long b(q qVar) {
        byte[] bArr = qVar.f44813a;
        return (((long) this.f16351e) * n2.b.o(bArr[0], bArr.length > 1 ? bArr[1] : (byte) 0)) / 1000000;
    }

    @Override // com.google.android.gms.internal.ads.k7
    public final boolean c(q qVar, long j10, d0 d0Var) {
        if (i(qVar, f42848o)) {
            byte[] bArrCopyOf = Arrays.copyOf(qVar.f44813a, qVar.f44815c);
            int i10 = bArrCopyOf[9] & 255;
            ArrayList arrayListC = n2.b.c(bArrCopyOf);
            if (((p) d0Var.f39976b) == null) {
                o oVar = new o();
                oVar.l = i1.d0.n("audio/ogg");
                oVar.f42600m = i1.d0.n(MimeTypes.AUDIO_OPUS);
                oVar.E = i10;
                oVar.F = 48000;
                oVar.f42603p = arrayListC;
                d0Var.f39976b = new p(oVar);
                return true;
            }
        } else {
            if (!i(qVar, f42849p)) {
                ((p) d0Var.f39976b).getClass();
                return false;
            }
            ((p) d0Var.f39976b).getClass();
            if (!this.f42850n) {
                this.f42850n = true;
                qVar.N(8);
                c0 c0VarW = n2.b.w(j0.y((String[]) n2.b.z(qVar, false, false).f47386b));
                if (c0VarW != null) {
                    o oVarA = ((p) d0Var.f39976b).a();
                    oVarA.f42599k = c0VarW.b(((p) d0Var.f39976b).l);
                    d0Var.f39976b = new p(oVarA);
                    return true;
                }
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.k7
    public final void d(boolean z10) {
        super.d(z10);
        if (z10) {
            this.f42850n = false;
        }
    }
}
