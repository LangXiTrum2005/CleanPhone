package ld;

import a7.l;
import android.content.Context;
import android.content.pm.PackageManager;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import l2.u;
import nd.h;
import nd.j;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f45294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f45295b;

    public /* synthetic */ e(g gVar, int i10) {
        this.f45294a = i10;
        this.f45295b = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dd.g gVar;
        String str;
        int i10 = this.f45294a;
        g gVar2 = this.f45295b;
        switch (i10) {
            case 0:
                d dVar = gVar2.l;
                boolean z10 = gVar2.f45317q;
                dVar.f45292d.a(z10);
                dVar.f45293e.a(z10);
                return;
            default:
                mb.g gVar3 = gVar2.f45305d;
                gVar3.a();
                Context context = gVar3.f45928a;
                gVar2.f45311j = context;
                gVar2.f45315o = context.getPackageName();
                gVar2.f45312k = dd.a.e();
                gVar2.l = new d(gVar2.f45311j, new l(100L, 1L, TimeUnit.MINUTES));
                gVar2.f45313m = cd.c.a();
                tc.b bVar = gVar2.f45308g;
                dd.a aVar = gVar2.f45312k;
                aVar.getClass();
                dd.g gVar4 = dd.g.f38813a;
                synchronized (dd.g.class) {
                    try {
                        if (dd.g.f38813a == null) {
                            dd.g.f38813a = new dd.g();
                        }
                        gVar = dd.g.f38813a;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                gVar.getClass();
                Long l = (Long) aVar.f38806a.getRemoteConfigValueOrDefault("fpr_log_source", -1L);
                l.getClass();
                Map map = dd.g.f38814b;
                if (!map.containsKey(l) || (str = (String) map.get(l)) == null) {
                    md.d dVarD = aVar.d(gVar);
                    str = dVarD.b() ? (String) dVarD.a() : "FIREPERF";
                } else {
                    aVar.f38808c.f("com.google.firebase.perf.LogSourceName", str);
                }
                gVar2.f45309h = new a(bVar, str);
                ConcurrentLinkedQueue concurrentLinkedQueue = gVar2.f45303b;
                cd.c cVar = gVar2.f45313m;
                WeakReference weakReference = new WeakReference(g.f45301s);
                synchronized (cVar.f6355f) {
                    cVar.f6355f.add(weakReference);
                    break;
                }
                h hVarS = j.s();
                gVar2.f45314n = hVarS;
                mb.g gVar5 = gVar2.f45305d;
                gVar5.a();
                hVarS.n(gVar5.f45930c.f45944b);
                nd.b bVarN = nd.c.n();
                bVarN.d(gVar2.f45315o);
                bVarN.i();
                Context context2 = gVar2.f45311j;
                String str2 = "";
                try {
                    String str3 = context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0).versionName;
                    if (str3 != null) {
                        str2 = str3;
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
                bVarN.j(str2);
                hVarS.k(bVarN);
                gVar2.f45304c.set(true);
                while (!concurrentLinkedQueue.isEmpty()) {
                    b bVar2 = (b) concurrentLinkedQueue.poll();
                    if (bVar2 != null) {
                        gVar2.f45310i.execute(new u(7, gVar2, bVar2));
                    }
                }
                return;
        }
    }
}
