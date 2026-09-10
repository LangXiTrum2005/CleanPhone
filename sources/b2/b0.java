package b2;

import android.net.Uri;
import com.google.android.gms.internal.play_billing.q1;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import f2.g1;
import java.util.ArrayList;
import javax.net.SocketFactory;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 extends f2.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final d f5224h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f5225i = "AndroidXMedia3/1.9.2";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Uri f5226j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final SocketFactory f5227k;
    public long l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f5228m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f5229n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f5230o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public i1.y f5231p;

    static {
        i1.z.a("media3.exoplayer.rtsp");
    }

    public b0(i1.y yVar, d dVar, SocketFactory socketFactory) {
        this.f5231p = yVar;
        this.f5224h = dVar;
        i1.v vVar = yVar.f42714b;
        vVar.getClass();
        Uri uri = vVar.f42704a;
        String scheme = uri.getScheme();
        if (scheme != null && q1.m("rtspt", scheme)) {
            uri = Uri.parse("rtsp" + uri.toString().substring(5));
        }
        this.f5226j = uri;
        this.f5227k = socketFactory;
        this.l = C.TIME_UNSET;
        this.f5230o = true;
    }

    @Override // f2.a
    public final f2.a0 c(f2.c0 c0Var, v9.e eVar, long j10) {
        return new x(eVar, this.f5224h, this.f5226j, new am.e(this, 1), this.f5225i, this.f5227k);
    }

    @Override // f2.a
    public final synchronized i1.y k() {
        return this.f5231p;
    }

    @Override // f2.a
    public final void p(n1.z zVar) {
        x();
    }

    @Override // f2.a
    public final void r(f2.a0 a0Var) {
        x xVar = (x) a0Var;
        ArrayList arrayList = xVar.f5416e;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            v vVar = (v) arrayList.get(i10);
            if (!vVar.f5407e) {
                vVar.f5404b.d(null);
                vVar.f5405c.D();
                vVar.f5407e = true;
            }
        }
        l1.y.h(xVar.f5415d);
        xVar.f5428r = true;
    }

    @Override // f2.a
    public final synchronized void w(i1.y yVar) {
        this.f5231p = yVar;
    }

    public final void x() {
        i1.p0 g1Var = new g1(this.l, this.f5228m, this.f5229n, k());
        if (this.f5230o) {
            g1Var = new y(g1Var, 0);
        }
        q(g1Var);
    }

    @Override // f2.a
    public final void m() {
    }

    @Override // f2.a
    public final void t() {
    }
}
