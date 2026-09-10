package com.google.android.gms.internal.ads;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class db extends Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BlockingQueue f13479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cb f13480b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final tb f13481c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile boolean f13482d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b21 f13483e;

    public db(PriorityBlockingQueue priorityBlockingQueue, md0 md0Var, tb tbVar, b21 b21Var) {
        this.f13479a = priorityBlockingQueue;
        this.f13480b = md0Var;
        this.f13481c = tbVar;
        this.f13483e = b21Var;
    }

    public final void a() {
        b21 b21Var = this.f13483e;
        hb hbVar = (hb) this.f13479a.take();
        SystemClock.elapsedRealtime();
        hbVar.b();
        try {
            try {
                try {
                    hbVar.zzc("network-queue-take");
                    hbVar.zzl();
                    TrafficStats.setThreadStatsTag(hbVar.zzb());
                    fb fbVarZza = this.f13480b.zza(hbVar);
                    hbVar.zzc("network-http-complete");
                    if (fbVarZza.f14358e && hbVar.zzq()) {
                        hbVar.a("not-modified");
                        hbVar.f();
                    } else {
                        bc.s sVarC = hbVar.c(fbVarZza);
                        hbVar.zzc("network-parse-complete");
                        wa waVar = (wa) sVarC.f5582c;
                        if (waVar != null) {
                            this.f13481c.b(hbVar.zzi(), waVar);
                            hbVar.zzc("network-cache-written");
                        }
                        hbVar.zzp();
                        b21Var.e(hbVar, sVarC, null);
                        hbVar.e(sVarC);
                    }
                } catch (Exception e10) {
                    Log.e("Volley", ob.d("Unhandled exception %s", e10.toString()), e10);
                    lb lbVar = new lb(e10);
                    SystemClock.elapsedRealtime();
                    b21Var.getClass();
                    hbVar.zzc("post-error");
                    ((i0) b21Var.f12616b).f15455b.post(new o1(hbVar, new bc.s(lbVar), (Object) null, 1));
                    hbVar.f();
                }
            } catch (lb e11) {
                SystemClock.elapsedRealtime();
                b21Var.getClass();
                hbVar.zzc("post-error");
                ((i0) b21Var.f12616b).f15455b.post(new o1(hbVar, new bc.s(e11), (Object) null, 1));
                hbVar.f();
            }
        } finally {
            hbVar.b();
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                a();
            } catch (InterruptedException unused) {
                if (this.f13482d) {
                    Thread.currentThread().interrupt();
                    return;
                }
                ob.c("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
