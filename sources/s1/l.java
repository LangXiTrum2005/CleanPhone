package s1;

import android.os.Handler;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import f2.b1;
import f2.y0;
import i1.c0;
import i1.e0;
import i1.p;
import java.nio.charset.StandardCharsets;
import l1.q;
import l1.y;
import m0.s1;
import n2.a0;
import n2.z;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class l implements a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b1 f50060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s1 f50061b = new s1(12, false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w2.a f50062c = new w2.a(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f50063d = C.TIME_UNSET;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m f50064e;

    public l(m mVar, v9.e eVar) {
        this.f50064e = mVar;
        this.f50060a = new b1(eVar, null, null);
    }

    @Override // n2.a0
    public final void a(long j10, int i10, int i11, int i12, z zVar) {
        long jI;
        long jP;
        this.f50060a.a(j10, i10, i11, i12, zVar);
        while (this.f50060a.x(false)) {
            w2.a aVar = this.f50062c;
            aVar.g();
            if (this.f50060a.C(this.f50061b, aVar, 0, false) == -4) {
                aVar.j();
            } else {
                aVar = null;
            }
            if (aVar != null) {
                long j11 = aVar.f47037g;
                c0 c0VarN = this.f50064e.f50067c.n(aVar);
                if (c0VarN != null) {
                    y2.a aVar2 = (y2.a) c0VarN.f42527a[0];
                    String str = aVar2.f54188a;
                    String str2 = aVar2.f54189b;
                    if ("urn:mpeg:dash:event:2012".equals(str) && ("1".equals(str2) || "2".equals(str2) || "3".equals(str2))) {
                        try {
                            jP = y.P(new String(aVar2.f54192e, StandardCharsets.UTF_8));
                        } catch (e0 unused) {
                            jP = -9223372036854775807L;
                        }
                        if (jP != C.TIME_UNSET) {
                            k kVar = new k(j11, jP);
                            Handler handler = this.f50064e.f50068d;
                            handler.sendMessage(handler.obtainMessage(1, kVar));
                        }
                    }
                }
            }
        }
        b1 b1Var = this.f50060a;
        y0 y0Var = b1Var.f40279a;
        synchronized (b1Var) {
            int i13 = b1Var.f40296s;
            jI = i13 == 0 ? -1L : b1Var.i(i13);
        }
        y0Var.a(jI);
    }

    @Override // n2.a0
    public final void b(p pVar) {
        this.f50060a.b(pVar);
    }

    @Override // n2.a0
    public final void d(q qVar, int i10, int i11) {
        this.f50060a.d(qVar, i10, 0);
    }

    @Override // n2.a0
    public final int f(i1.i iVar, int i10, boolean z10) {
        return this.f50060a.f(iVar, i10, z10);
    }
}
