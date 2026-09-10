package com.mbridge.msdk.config.component.nori.monitor;

import com.google.android.gms.internal.measurement.f2;
import com.ironsource.X3;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.m0;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class a {
    private static boolean H = MBridgeConstans.DEBUG;
    private static final AtomicInteger I = new AtomicInteger(0);
    private static final AtomicInteger J = new AtomicInteger(0);
    private Map<String, Object> F;
    private Map<String, Integer> G;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f32330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f32331b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f32332c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f32333d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f32334e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f32335f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f32336g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f32337h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f32338i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f32339j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f32340k;
    private long l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f32341m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f32342n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f32343o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long f32344p = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f32345q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private long f32346r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f32347s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f32348t = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f32349u = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private long f32350v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private long f32351w = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private long f32352x = 0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private long f32353y = 0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private long f32354z = 0;
    private long A = 0;
    private long B = 0;
    private long C = 0;
    private long D = 0;
    private long E = 0;

    public void a(int i10, int i11, int i12) {
        if (this.f32330a) {
            return;
        }
        HashMap map = new HashMap();
        this.G = map;
        map.put("threadPoolSize", Integer.valueOf(i10));
        this.G.put("activeThreads", Integer.valueOf(i11));
        this.G.put("queuedTasks", Integer.valueOf(i12));
    }

    public void b() {
        if (this.f32330a) {
            return;
        }
        l();
    }

    public void c() {
        if (this.f32330a) {
            return;
        }
        this.f32336g = (System.nanoTime() - this.f32345q) / 1000000;
    }

    public void e() {
        if (this.f32330a) {
            return;
        }
        this.f32345q = System.nanoTime();
    }

    public void h() {
        if (this.f32330a) {
            return;
        }
        this.f32335f = (System.nanoTime() - this.f32343o) / 1000000;
    }

    public void i() {
        if (this.f32330a) {
            return;
        }
        this.f32343o = System.nanoTime();
    }

    public Map<String, Object> j() {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        map2.put("isRetry", Boolean.valueOf(this.f32330a));
        map2.put("retryCount", Integer.valueOf(this.f32331b));
        map2.put("requestBodySize", Long.valueOf(this.f32332c));
        map2.put("responseBodySize", Long.valueOf(this.f32333d));
        map.put("basicInfo", map2);
        HashMap map3 = new HashMap();
        map3.put("totalTime", Long.valueOf(this.f32334e));
        map3.put("dnsTime", Long.valueOf(this.f32335f));
        map3.put("connectionTime", Long.valueOf(this.f32336g));
        map3.put("requestTime", Long.valueOf(this.f32337h));
        map3.put("serverTime", Long.valueOf(this.f32338i));
        map3.put("responseTime", Long.valueOf(this.f32339j));
        map3.put("queueTime", Long.valueOf(this.f32340k));
        map3.put("parsingTime", Long.valueOf(this.l));
        map.put("timingInfo", map3);
        map.put(X3.j.f27842h0, this.F);
        map.put("threadPoolInfo", this.G);
        return map;
    }

    public void k() {
        if (this.f32330a) {
            return;
        }
        this.f32334e = (System.nanoTime() - this.f32341m) / 1000000;
    }

    public void l() {
        if (this.f32330a) {
            return;
        }
        this.f32340k = (System.nanoTime() - this.f32341m) / 1000000;
    }

    public void m() {
        if (this.f32330a) {
            return;
        }
        this.f32341m = System.nanoTime();
    }

    public void n() {
        if (this.f32330a) {
            return;
        }
        this.f32351w = System.nanoTime();
    }

    public void o() {
        if (this.f32330a) {
            return;
        }
        this.f32350v = System.nanoTime();
    }

    public void p() {
        if (this.f32330a) {
            return;
        }
        this.f32349u = System.nanoTime();
    }

    public void q() {
        if (this.f32330a) {
            return;
        }
        this.A = System.nanoTime();
    }

    public void r() {
        if (this.f32330a) {
            return;
        }
        this.f32354z = System.nanoTime();
    }

    public void s() {
        if (this.f32330a) {
            return;
        }
        long jNanoTime = System.nanoTime();
        this.f32353y = jNanoTime;
        this.f32338i = (jNanoTime - this.f32352x) / 1000000;
    }

    public void t() {
        if (this.f32330a) {
            return;
        }
        this.f32347s = System.nanoTime();
    }

    public void u() {
        if (this.f32330a) {
            return;
        }
        this.f32346r = System.nanoTime();
    }

    public void b(long j10) {
        if (this.f32330a) {
            return;
        }
        this.f32339j = (System.nanoTime() - this.f32353y) / 1000000;
        this.f32333d = j10;
    }

    public void a(boolean z10) {
        this.f32330a = z10;
        if (z10) {
            this.f32331b++;
        }
    }

    public void a(long j10) {
        if (this.f32330a) {
            return;
        }
        this.f32337h = (System.nanoTime() - this.f32349u) / 1000000;
        this.f32332c = j10;
    }

    public void a() {
        if (this.f32330a) {
            return;
        }
        k();
    }

    public void a(IOException iOException) {
        if (this.f32330a) {
            return;
        }
        k();
    }

    public void a(String str) {
        if (H) {
            try {
                int iH = m0.h();
                int iX = m0.x();
                HashMap map = new HashMap();
                map.put("reason", str);
                map.put("timestamp", Long.valueOf(System.currentTimeMillis()));
                map.put("available_memory_mb", Integer.valueOf(iH));
                map.put("total_memory_mb", Integer.valueOf(iX));
                j().put("task_rejection", map);
            } catch (Exception e10) {
                f2.q(e10, new StringBuilder("Failed to record task rejection: "), "NetworkRequestMonitor");
            }
        }
    }

    public void d() {
    }

    public void f() {
    }

    public void g() {
    }
}
