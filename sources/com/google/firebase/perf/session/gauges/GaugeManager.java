package com.google.firebase.perf.session.gauges;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import com.applovin.shadow.okhttp3.internal.ws.RealWebSocket;
import dd.a;
import dd.n;
import dd.o;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kd.b;
import kd.c;
import kd.d;
import kd.e;
import kd.f;
import ld.g;
import md.h;
import nd.l;
import nd.q;
import nd.r;
import nd.t;
import nd.u;
import qk.i0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
@Keep
public class GaugeManager {
    private static final long APPROX_NUMBER_OF_DATA_POINTS_PER_GAUGE_METRIC = 20;
    private static final long INVALID_GAUGE_COLLECTION_FREQUENCY = -1;
    private static final long TIME_TO_WAIT_BEFORE_FLUSHING_GAUGES_QUEUE_MS = 20;
    private l applicationProcessState;
    private final a configResolver;
    private final tb.l cpuGaugeCollector;

    @Nullable
    private ScheduledFuture gaugeManagerDataCollectionJob;
    private final tb.l gaugeManagerExecutor;

    @Nullable
    private e gaugeMetadataManager;
    private final tb.l memoryGaugeCollector;

    @Nullable
    private String sessionId;
    private final g transportManager;
    private static final fd.a logger = fd.a.d();
    private static final GaugeManager instance = new GaugeManager();

    @SuppressLint({"ThreadPoolCreation"})
    private GaugeManager() {
        this(new tb.l(new d(0)), g.f45301s, a.e(), null, new tb.l(new d(1)), new tb.l(new d(2)));
    }

    private static void collectGaugeMetricOnce(b bVar, kd.g gVar, h hVar) {
        synchronized (bVar) {
            try {
                bVar.f44590b.schedule(new kd.a(bVar, hVar, 1), 0L, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e10) {
                b.f44587g.f("Unable to collect Cpu Metric: " + e10.getMessage());
            }
        }
        synchronized (gVar) {
            try {
                gVar.f44607a.schedule(new f(gVar, hVar, 1), 0L, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e11) {
                kd.g.f44606f.f("Unable to collect Memory Metric: " + e11.getMessage());
            }
        }
    }

    private long getCpuGaugeCollectionFrequencyMs(l lVar) {
        o oVar;
        long jLongValue;
        n nVar;
        int iOrdinal = lVar.ordinal();
        if (iOrdinal == 1) {
            a aVar = this.configResolver;
            aVar.getClass();
            synchronized (o.class) {
                try {
                    if (o.f38822a == null) {
                        o.f38822a = new o();
                    }
                    oVar = o.f38822a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            md.d dVarJ = aVar.j(oVar);
            if (dVarJ.b() && a.n(((Long) dVarJ.a()).longValue())) {
                jLongValue = ((Long) dVarJ.a()).longValue();
            } else {
                md.d dVar = aVar.f38806a.getLong("fpr_session_gauge_cpu_capture_frequency_fg_ms");
                if (dVar.b() && a.n(((Long) dVar.a()).longValue())) {
                    aVar.f38808c.d(((Long) dVar.a()).longValue(), "com.google.firebase.perf.SessionsCpuCaptureFrequencyForegroundMs");
                    jLongValue = ((Long) dVar.a()).longValue();
                } else {
                    md.d dVarC = aVar.c(oVar);
                    if (dVarC.b() && a.n(((Long) dVarC.a()).longValue())) {
                        jLongValue = ((Long) dVarC.a()).longValue();
                    } else {
                        jLongValue = aVar.f38806a.isLastFetchFailed() ? 300L : 100L;
                    }
                }
            }
        } else if (iOrdinal != 2) {
            jLongValue = -1;
        } else {
            a aVar2 = this.configResolver;
            aVar2.getClass();
            synchronized (n.class) {
                try {
                    if (n.f38821a == null) {
                        n.f38821a = new n();
                    }
                    nVar = n.f38821a;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            md.d dVarJ2 = aVar2.j(nVar);
            if (dVarJ2.b() && a.n(((Long) dVarJ2.a()).longValue())) {
                jLongValue = ((Long) dVarJ2.a()).longValue();
            } else {
                md.d dVar2 = aVar2.f38806a.getLong("fpr_session_gauge_cpu_capture_frequency_bg_ms");
                if (dVar2.b() && a.n(((Long) dVar2.a()).longValue())) {
                    aVar2.f38808c.d(((Long) dVar2.a()).longValue(), "com.google.firebase.perf.SessionsCpuCaptureFrequencyBackgroundMs");
                    jLongValue = ((Long) dVar2.a()).longValue();
                } else {
                    md.d dVarC2 = aVar2.c(nVar);
                    jLongValue = (dVarC2.b() && a.n(((Long) dVarC2.a()).longValue())) ? ((Long) dVarC2.a()).longValue() : 0L;
                }
            }
        }
        fd.a aVar3 = b.f44587g;
        if (jLongValue <= 0) {
            return -1L;
        }
        return jLongValue;
    }

    private r getGaugeMetadata() {
        q qVarM = r.m();
        qVarM.d(i0.j0((l1.d.a(5) * this.gaugeMetadataManager.f44602c.totalMem) / RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE));
        qVarM.h(i0.j0((l1.d.a(5) * this.gaugeMetadataManager.f44600a.maxMemory()) / RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE));
        qVarM.i(i0.j0((l1.d.a(3) * ((long) this.gaugeMetadataManager.f44601b.getMemoryClass())) / RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE));
        return (r) qVarM.build();
    }

    public static synchronized GaugeManager getInstance() {
        return instance;
    }

    private long getMemoryGaugeCollectionFrequencyMs(l lVar) {
        dd.r rVar;
        long jLongValue;
        dd.q qVar;
        int iOrdinal = lVar.ordinal();
        if (iOrdinal == 1) {
            a aVar = this.configResolver;
            aVar.getClass();
            synchronized (dd.r.class) {
                try {
                    if (dd.r.f38825a == null) {
                        dd.r.f38825a = new dd.r();
                    }
                    rVar = dd.r.f38825a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            md.d dVarJ = aVar.j(rVar);
            if (dVarJ.b() && a.n(((Long) dVarJ.a()).longValue())) {
                jLongValue = ((Long) dVarJ.a()).longValue();
            } else {
                md.d dVar = aVar.f38806a.getLong("fpr_session_gauge_memory_capture_frequency_fg_ms");
                if (dVar.b() && a.n(((Long) dVar.a()).longValue())) {
                    aVar.f38808c.d(((Long) dVar.a()).longValue(), "com.google.firebase.perf.SessionsMemoryCaptureFrequencyForegroundMs");
                    jLongValue = ((Long) dVar.a()).longValue();
                } else {
                    md.d dVarC = aVar.c(rVar);
                    if (dVarC.b() && a.n(((Long) dVarC.a()).longValue())) {
                        jLongValue = ((Long) dVarC.a()).longValue();
                    } else {
                        jLongValue = aVar.f38806a.isLastFetchFailed() ? 300L : 100L;
                    }
                }
            }
        } else if (iOrdinal != 2) {
            jLongValue = -1;
        } else {
            a aVar2 = this.configResolver;
            aVar2.getClass();
            synchronized (dd.q.class) {
                try {
                    if (dd.q.f38824a == null) {
                        dd.q.f38824a = new dd.q();
                    }
                    qVar = dd.q.f38824a;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            md.d dVarJ2 = aVar2.j(qVar);
            if (dVarJ2.b() && a.n(((Long) dVarJ2.a()).longValue())) {
                jLongValue = ((Long) dVarJ2.a()).longValue();
            } else {
                md.d dVar2 = aVar2.f38806a.getLong("fpr_session_gauge_memory_capture_frequency_bg_ms");
                if (dVar2.b() && a.n(((Long) dVar2.a()).longValue())) {
                    aVar2.f38808c.d(((Long) dVar2.a()).longValue(), "com.google.firebase.perf.SessionsMemoryCaptureFrequencyBackgroundMs");
                    jLongValue = ((Long) dVar2.a()).longValue();
                } else {
                    md.d dVarC2 = aVar2.c(qVar);
                    jLongValue = (dVarC2.b() && a.n(((Long) dVarC2.a()).longValue())) ? ((Long) dVarC2.a()).longValue() : 0L;
                }
            }
        }
        fd.a aVar3 = kd.g.f44606f;
        if (jLongValue <= 0) {
            return -1L;
        }
        return jLongValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ b lambda$new$0() {
        return new b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ kd.g lambda$new$1() {
        return new kd.g();
    }

    private boolean startCollectingCpuMetrics(long j10, h hVar) {
        if (j10 == -1) {
            logger.a("Invalid Cpu Metrics collection frequency. Did not collect Cpu Metrics.");
            return false;
        }
        b bVar = (b) this.cpuGaugeCollector.get();
        long j11 = bVar.f44592d;
        if (j11 == -1 || j11 == 0 || j10 <= 0) {
            return true;
        }
        ScheduledFuture scheduledFuture = bVar.f44593e;
        if (scheduledFuture == null) {
            bVar.a(j10, hVar);
            return true;
        }
        if (bVar.f44594f == j10) {
            return true;
        }
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            bVar.f44593e = null;
            bVar.f44594f = -1L;
        }
        bVar.a(j10, hVar);
        return true;
    }

    private boolean startCollectingMemoryMetrics(long j10, h hVar) {
        if (j10 == -1) {
            logger.a("Invalid Memory Metrics collection frequency. Did not collect Memory Metrics.");
            return false;
        }
        kd.g gVar = (kd.g) this.memoryGaugeCollector.get();
        fd.a aVar = kd.g.f44606f;
        if (j10 <= 0) {
            gVar.getClass();
            return true;
        }
        ScheduledFuture scheduledFuture = gVar.f44610d;
        if (scheduledFuture == null) {
            gVar.a(j10, hVar);
            return true;
        }
        if (gVar.f44611e == j10) {
            return true;
        }
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            gVar.f44610d = null;
            gVar.f44611e = -1L;
        }
        gVar.a(j10, hVar);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: syncFlush, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void lambda$stopCollectingGauges$3(String str, l lVar) {
        t tVarQ = u.q();
        while (!((b) this.cpuGaugeCollector.get()).f44589a.isEmpty()) {
            tVarQ.h((nd.o) ((b) this.cpuGaugeCollector.get()).f44589a.poll());
        }
        while (!((kd.g) this.memoryGaugeCollector.get()).f44608b.isEmpty()) {
            tVarQ.d((nd.f) ((kd.g) this.memoryGaugeCollector.get()).f44608b.poll());
        }
        tVarQ.j(str);
        g gVar = this.transportManager;
        gVar.f45310i.execute(new ld.f(gVar, (u) tVarQ.build(), lVar, 0));
    }

    public void initializeGaugeMetadataManager(Context context) {
        this.gaugeMetadataManager = new e(context);
    }

    public boolean logGaugeMetadata(String str, l lVar) {
        if (this.gaugeMetadataManager == null) {
            return false;
        }
        t tVarQ = u.q();
        tVarQ.j(str);
        tVarQ.i(getGaugeMetadata());
        u uVar = (u) tVarQ.build();
        g gVar = this.transportManager;
        gVar.f45310i.execute(new ld.f(gVar, uVar, lVar, 0));
        return true;
    }

    public void startCollectingGauges(jd.a aVar, l lVar) {
        if (this.sessionId != null) {
            stopCollectingGauges();
        }
        long jStartCollectingGauges = startCollectingGauges(lVar, aVar.f43817b);
        if (jStartCollectingGauges == -1) {
            logger.f("Invalid gauge collection frequency. Unable to start collecting Gauges.");
            return;
        }
        String str = aVar.f43816a;
        this.sessionId = str;
        this.applicationProcessState = lVar;
        try {
            long j10 = jStartCollectingGauges * 20;
            this.gaugeManagerDataCollectionJob = ((ScheduledExecutorService) this.gaugeManagerExecutor.get()).scheduleAtFixedRate(new c(this, str, lVar, 1), j10, j10, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e10) {
            logger.f("Unable to start collecting Gauges: " + e10.getMessage());
        }
    }

    public void stopCollectingGauges() {
        String str = this.sessionId;
        if (str == null) {
            return;
        }
        l lVar = this.applicationProcessState;
        b bVar = (b) this.cpuGaugeCollector.get();
        ScheduledFuture scheduledFuture = bVar.f44593e;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            bVar.f44593e = null;
            bVar.f44594f = -1L;
        }
        kd.g gVar = (kd.g) this.memoryGaugeCollector.get();
        ScheduledFuture scheduledFuture2 = gVar.f44610d;
        if (scheduledFuture2 != null) {
            scheduledFuture2.cancel(false);
            gVar.f44610d = null;
            gVar.f44611e = -1L;
        }
        ScheduledFuture scheduledFuture3 = this.gaugeManagerDataCollectionJob;
        if (scheduledFuture3 != null) {
            scheduledFuture3.cancel(false);
        }
        ((ScheduledExecutorService) this.gaugeManagerExecutor.get()).schedule(new c(this, str, lVar, 0), 20L, TimeUnit.MILLISECONDS);
        this.sessionId = null;
        this.applicationProcessState = l.APPLICATION_PROCESS_STATE_UNKNOWN;
    }

    public GaugeManager(tb.l lVar, g gVar, a aVar, e eVar, tb.l lVar2, tb.l lVar3) {
        this.gaugeManagerDataCollectionJob = null;
        this.sessionId = null;
        this.applicationProcessState = l.APPLICATION_PROCESS_STATE_UNKNOWN;
        this.gaugeManagerExecutor = lVar;
        this.transportManager = gVar;
        this.configResolver = aVar;
        this.gaugeMetadataManager = eVar;
        this.cpuGaugeCollector = lVar2;
        this.memoryGaugeCollector = lVar3;
    }

    private long startCollectingGauges(l lVar, h hVar) {
        long cpuGaugeCollectionFrequencyMs = getCpuGaugeCollectionFrequencyMs(lVar);
        if (!startCollectingCpuMetrics(cpuGaugeCollectionFrequencyMs, hVar)) {
            cpuGaugeCollectionFrequencyMs = -1;
        }
        long memoryGaugeCollectionFrequencyMs = getMemoryGaugeCollectionFrequencyMs(lVar);
        if (startCollectingMemoryMetrics(memoryGaugeCollectionFrequencyMs, hVar)) {
            return cpuGaugeCollectionFrequencyMs == -1 ? memoryGaugeCollectionFrequencyMs : Math.min(cpuGaugeCollectionFrequencyMs, memoryGaugeCollectionFrequencyMs);
        }
        return cpuGaugeCollectionFrequencyMs;
    }

    public void collectGaugeMetricOnce(h hVar) {
        collectGaugeMetricOnce((b) this.cpuGaugeCollector.get(), (kd.g) this.memoryGaugeCollector.get(), hVar);
    }
}
