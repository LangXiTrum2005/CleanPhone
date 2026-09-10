package kd;

import com.applovin.shadow.okhttp3.internal.ws.RealWebSocket;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import md.h;
import qk.i0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final fd.a f44606f = fd.a.d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ScheduledExecutorService f44607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentLinkedQueue f44608b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Runtime f44609c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ScheduledFuture f44610d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f44611e;

    public g() {
        ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        Runtime runtime = Runtime.getRuntime();
        this.f44610d = null;
        this.f44611e = -1L;
        this.f44607a = scheduledExecutorServiceNewSingleThreadScheduledExecutor;
        this.f44608b = new ConcurrentLinkedQueue();
        this.f44609c = runtime;
    }

    public final synchronized void a(long j10, h hVar) {
        this.f44611e = j10;
        try {
            this.f44610d = this.f44607a.scheduleAtFixedRate(new f(this, hVar, 0), 0L, j10, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e10) {
            f44606f.f("Unable to start collecting Memory Metrics: " + e10.getMessage());
        }
    }

    public final nd.f b(h hVar) {
        if (hVar == null) {
            return null;
        }
        long jB = hVar.b() + hVar.f45967a;
        nd.e eVarJ = nd.f.j();
        eVarJ.d(jB);
        Runtime runtime = this.f44609c;
        eVarJ.h(i0.j0((l1.d.a(5) * (runtime.totalMemory() - runtime.freeMemory())) / RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE));
        return (nd.f) eVarJ.build();
    }
}
