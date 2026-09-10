package com.mbridge.msdk.tracker.network;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class n implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BlockingQueue<t<?>> f36930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final m f36931b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f36932c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final w f36933d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile boolean f36934e = false;

    public n(BlockingQueue<t<?>> blockingQueue, m mVar, b bVar, w wVar) {
        this.f36930a = blockingQueue;
        this.f36931b = mVar;
        this.f36932c = bVar;
        this.f36933d = wVar;
    }

    private void a(t<?> tVar) {
        TrafficStats.setThreadStatsTag(tVar.s());
    }

    public void b(t<?> tVar) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        tVar.a(3);
        try {
            try {
                try {
                    tVar.a("network-queue-take");
                    if (tVar.v()) {
                        tVar.c("network-discard-cancelled");
                        tVar.x();
                        return;
                    }
                    if (tVar.y()) {
                        a(tVar);
                    }
                    q qVarA = this.f36931b.a(tVar);
                    tVar.a("network-http-complete");
                    if (qVarA.f36964e && tVar.u()) {
                        tVar.c("not-modified");
                        tVar.x();
                        return;
                    }
                    v<?> vVarA = tVar.a(qVarA);
                    tVar.a("network-parse-complete");
                    if (tVar.z() && vVarA.f37036b != null) {
                        this.f36932c.a(tVar.e(), vVarA.f37036b);
                        tVar.a("network-cache-written");
                    }
                    tVar.w();
                    this.f36933d.a(tVar, vVarA);
                    tVar.a(vVarA);
                } catch (b0 e10) {
                    e10.a(SystemClock.elapsedRealtime() - jElapsedRealtime);
                    a(tVar, e10);
                    tVar.x();
                }
            } catch (Exception e11) {
                c0.a(e11, "Unhandled exception %s", e11.toString());
                a0 a0Var = new a0(e11);
                a0Var.a(SystemClock.elapsedRealtime() - jElapsedRealtime);
                this.f36933d.a(tVar, a0Var);
                tVar.x();
            }
        } finally {
            tVar.a(4);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                a();
            } catch (InterruptedException unused) {
                if (this.f36934e) {
                    Thread.currentThread().interrupt();
                    return;
                }
                c0.c("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }

    private void a() throws InterruptedException {
        b(this.f36930a.take());
    }

    private void a(t<?> tVar, b0 b0Var) {
        this.f36933d.a(tVar, tVar.c(b0Var));
    }
}
