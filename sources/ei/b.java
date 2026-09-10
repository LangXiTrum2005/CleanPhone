package ei;

import android.content.Context;
import android.net.ConnectivityManager;
import od.c;
import qd.i;
import xi.f;
import xi.p;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class b implements ti.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p f40100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public i f40101b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a f40102c;

    @Override // ti.b
    public final void onAttachedToEngine(ti.a aVar) {
        f fVar = aVar.f50789c;
        Context context = aVar.f50787a;
        this.f40100a = new p(fVar, "dev.fluttercommunity.plus/connectivity");
        this.f40101b = new i(fVar, "dev.fluttercommunity.plus/connectivity_status");
        c cVar = new c((ConnectivityManager) context.getSystemService("connectivity"), 6);
        s4.i iVar = new s4.i(cVar);
        this.f40102c = new a(context, cVar);
        this.f40100a.b(iVar);
        this.f40101b.A(this.f40102c);
    }

    @Override // ti.b
    public final void onDetachedFromEngine(ti.a aVar) {
        this.f40100a.b(null);
        this.f40101b.A(null);
        this.f40102c.onCancel();
        this.f40100a = null;
        this.f40101b = null;
        this.f40102c = null;
    }
}
