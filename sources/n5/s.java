package n5;

import java.util.HashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f46557e = d5.o.i("WorkTimer");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ScheduledExecutorService f46558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f46559b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f46560c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f46561d;

    public s() {
        li.a aVar = new li.a(1);
        aVar.f45336b = 0;
        this.f46559b = new HashMap();
        this.f46560c = new HashMap();
        this.f46561d = new Object();
        this.f46558a = Executors.newSingleThreadScheduledExecutor(aVar);
    }

    public final void a(String str, g5.e eVar) {
        synchronized (this.f46561d) {
            d5.o.g().e(f46557e, "Starting timer for " + str, new Throwable[0]);
            b(str);
            r rVar = new r(this, str);
            this.f46559b.put(str, rVar);
            this.f46560c.put(str, eVar);
            this.f46558a.schedule(rVar, 600000L, TimeUnit.MILLISECONDS);
        }
    }

    public final void b(String str) {
        synchronized (this.f46561d) {
            try {
                if (((r) this.f46559b.remove(str)) != null) {
                    d5.o.g().e(f46557e, "Stopping timer for " + str, new Throwable[0]);
                    this.f46560c.remove(str);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
