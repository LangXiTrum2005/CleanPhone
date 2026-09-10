package com.google.android.gms.internal.ads;

import android.os.Process;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class xa extends Thread {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final boolean f21801g = ob.f18214a;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BlockingQueue f21802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BlockingQueue f21803b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final tb f21804c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile boolean f21805d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final hz f21806e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b21 f21807f;

    public xa(PriorityBlockingQueue priorityBlockingQueue, PriorityBlockingQueue priorityBlockingQueue2, tb tbVar, b21 b21Var) {
        this.f21802a = priorityBlockingQueue;
        this.f21803b = priorityBlockingQueue2;
        this.f21804c = tbVar;
        this.f21807f = b21Var;
        this.f21806e = new hz(this, priorityBlockingQueue2, b21Var);
    }

    public final void a() {
        hb hbVar = (hb) this.f21802a.take();
        hbVar.zzc("cache-queue-take");
        hbVar.b();
        try {
            hbVar.zzl();
            tb tbVar = this.f21804c;
            wa waVarA = tbVar.a(hbVar.zzi());
            if (waVarA == null) {
                hbVar.zzc("cache-miss");
                if (!this.f21806e.k(hbVar)) {
                    this.f21803b.put(hbVar);
                }
            } else {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (waVarA.f21473e < jCurrentTimeMillis) {
                    hbVar.zzc("cache-hit-expired");
                    hbVar.zzj(waVarA);
                    if (!this.f21806e.k(hbVar)) {
                        this.f21803b.put(hbVar);
                    }
                } else {
                    hbVar.zzc("cache-hit");
                    byte[] bArr = waVarA.f21469a;
                    Map map = waVarA.f21475g;
                    bc.s sVarC = hbVar.c(new fb(200, bArr, map, fb.a(map), false));
                    hbVar.zzc("cache-hit-parsed");
                    if (!(((lb) sVarC.f5583d) == null)) {
                        hbVar.zzc("cache-parsing-failed");
                        String strZzi = hbVar.zzi();
                        synchronized (tbVar) {
                            wa waVarA2 = tbVar.a(strZzi);
                            if (waVarA2 != null) {
                                waVarA2.f21474f = 0L;
                                waVarA2.f21473e = 0L;
                                tbVar.b(strZzi, waVarA2);
                            }
                        }
                        hbVar.zzj(null);
                        if (!this.f21806e.k(hbVar)) {
                            this.f21803b.put(hbVar);
                        }
                    } else if (waVarA.f21474f < jCurrentTimeMillis) {
                        hbVar.zzc("cache-hit-refresh-needed");
                        hbVar.zzj(waVarA);
                        sVarC.f5580a = true;
                        if (this.f21806e.k(hbVar)) {
                            this.f21807f.e(hbVar, sVarC, null);
                        } else {
                            this.f21807f.e(hbVar, sVarC, new zd1(this, false, hbVar, 4));
                        }
                    } else {
                        this.f21807f.e(hbVar, sVarC, null);
                    }
                }
            }
            hbVar.b();
        } catch (Throwable th2) {
            hbVar.b();
            throw th2;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (f21801g) {
            ob.a("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.f21804c.c();
        while (true) {
            try {
                a();
            } catch (InterruptedException unused) {
                if (this.f21805d) {
                    Thread.currentThread().interrupt();
                    return;
                }
                ob.c("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
