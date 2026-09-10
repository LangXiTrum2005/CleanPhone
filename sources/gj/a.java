package gj;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.firebase.perf.metrics.Trace;
import java.util.HashMap;
import java.util.Map;
import wj.r;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f41913b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f41914c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f41915d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f41916e;

    public /* synthetic */ a(long j10, jk.b bVar, Object obj, hj.f fVar, int i10) {
        this.f41912a = i10;
        this.f41913b = j10;
        this.f41914c = bVar;
        this.f41915d = obj;
        this.f41916e = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f41912a) {
            case 0:
                g9.k kVar = (g9.k) this.f41914c;
                ri.d dVar = (ri.d) this.f41915d;
                Handler handler = (Handler) this.f41916e;
                kVar.getClass();
                dVar.d(a.a.f3311a);
                Context context = a.a.f3311a;
                cj.l lVar = new cj.l(kVar, dVar, this.f41913b, 4);
                if (Looper.myLooper() != Looper.getMainLooper()) {
                    throw new IllegalStateException("ensureInitializationComplete must be called on the main thread");
                }
                if (dVar.f49601b == null) {
                    throw new IllegalStateException("ensureInitializationComplete must be called after startInitialization");
                }
                if (dVar.f49600a) {
                    handler.post(lVar);
                    return;
                } else {
                    dVar.f49605f.execute(new ri.b(dVar, context, handler, lVar, 0));
                    return;
                }
            case 1:
                long j10 = this.f41913b;
                cj.c cVar = (cj.c) this.f41914c;
                hj.h hVar = (hj.h) this.f41915d;
                hj.f fVar = (hj.f) this.f41916e;
                HashMap map = hj.f.f42368a;
                int i10 = (int) j10;
                try {
                    gd.e eVar = (gd.e) map.get(Integer.valueOf(i10));
                    r rVar = r.f53297a;
                    if (eVar == null) {
                        cVar.invoke(new wj.h(rVar));
                        return;
                    }
                    gd.f fVar2 = eVar.f41849a;
                    Long l = hVar.f42375a;
                    if (l != null) {
                        fVar2.d((int) l.longValue());
                    }
                    Long l10 = hVar.f42376b;
                    if (l10 != null) {
                        fVar2.e(l10.longValue());
                    }
                    String str = hVar.f42378d;
                    if (str != null) {
                        fVar2.g(str);
                    }
                    Long l11 = hVar.f42377c;
                    if (l11 != null) {
                        fVar2.h(l11.longValue());
                    }
                    Map map2 = hVar.f42379e;
                    if (map2 != null) {
                        for (Map.Entry entry : map2.entrySet()) {
                            eVar.a((String) entry.getKey(), (String) entry.getValue());
                        }
                    }
                    eVar.b();
                    map.remove(Integer.valueOf(i10));
                    cVar.invoke(new wj.h(rVar));
                    return;
                } catch (Exception e10) {
                    fVar.getClass();
                    hj.f.a(cVar, e10);
                    return;
                }
            default:
                long j11 = this.f41913b;
                hj.b bVar = (hj.b) this.f41914c;
                hj.j jVar = (hj.j) this.f41915d;
                hj.f fVar3 = (hj.f) this.f41916e;
                HashMap map3 = hj.f.f42369b;
                int i11 = (int) j11;
                try {
                    Trace trace = (Trace) map3.get(Integer.valueOf(i11));
                    r rVar2 = r.f53297a;
                    if (trace == null) {
                        bVar.invoke(new wj.h(rVar2));
                        return;
                    }
                    Map map4 = jVar.f42383b;
                    if (map4 != null) {
                        for (Map.Entry entry2 : map4.entrySet()) {
                            trace.putAttribute((String) entry2.getKey(), (String) entry2.getValue());
                        }
                    }
                    Map map5 = jVar.f42382a;
                    if (map5 != null) {
                        for (Map.Entry entry3 : map5.entrySet()) {
                            trace.putMetric((String) entry3.getKey(), ((Number) entry3.getValue()).longValue());
                        }
                    }
                    trace.stop();
                    map3.remove(Integer.valueOf(i11));
                    bVar.invoke(new wj.h(rVar2));
                    return;
                } catch (Exception e11) {
                    fVar3.getClass();
                    hj.f.a(bVar, e11);
                    return;
                }
        }
    }

    public /* synthetic */ a(g9.k kVar, ri.d dVar, Handler handler, long j10) {
        this.f41912a = 0;
        this.f41914c = kVar;
        this.f41915d = dVar;
        this.f41916e = handler;
        this.f41913b = j10;
    }
}
