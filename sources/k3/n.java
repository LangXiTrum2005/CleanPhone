package k3;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import f2.c0;
import java.util.HashMap;
import l1.q;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n implements l1.g, l1.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f44299b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f44300c;

    public /* synthetic */ n(o oVar, long j10, int i10) {
        this.f44300c = oVar;
        this.f44299b = j10;
        this.f44298a = i10;
    }

    @Override // l1.g
    public void accept(Object obj) {
        o oVar = (o) this.f44300c;
        a aVar = (a) obj;
        oVar.f44308h.getClass();
        byte[] bArrT = jj.d.t(aVar.f44270c, aVar.f44268a);
        q qVar = oVar.f44303c;
        qVar.getClass();
        qVar.K(bArrT, bArrT.length);
        oVar.f44301a.g(bArrT.length, qVar);
        long j10 = aVar.f44269b;
        long j11 = this.f44299b;
        if (j10 == C.TIME_UNSET) {
            go.k.t(oVar.f44308h.f42648s == Long.MAX_VALUE);
        } else {
            long j12 = oVar.f44308h.f42648s;
            j11 = j12 == Long.MAX_VALUE ? j11 + j10 : j10 + j12;
        }
        oVar.f44301a.a(j11, this.f44298a | 1, bArrT.length, 0, null);
    }

    @Override // l1.k
    public void invoke(Object obj) {
        q1.a aVar = (q1.a) this.f44300c;
        q1.i iVar = (q1.i) ((q1.b) obj);
        HashMap map = iVar.f48561h;
        HashMap map2 = iVar.f48562i;
        c0 c0Var = aVar.f48518d;
        if (c0Var != null) {
            String strC = iVar.f48556c.c(aVar.f48516b, c0Var);
            Long l = (Long) map2.get(strC);
            Long l10 = (Long) map.get(strC);
            map2.put(strC, Long.valueOf((l == null ? 0L : l.longValue()) + this.f44299b));
            map.put(strC, Long.valueOf((l10 != null ? l10.longValue() : 0L) + ((long) this.f44298a)));
        }
    }

    public /* synthetic */ n(q1.a aVar, int i10, long j10, long j11) {
        this.f44300c = aVar;
        this.f44298a = i10;
        this.f44299b = j10;
    }
}
