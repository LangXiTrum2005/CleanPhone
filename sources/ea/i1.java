package ea;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class i1 extends Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f39468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BlockingQueue f39469b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f39470c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j1 f39471d;

    public i1(j1 j1Var, String str, BlockingQueue blockingQueue) {
        this.f39471d = j1Var;
        k9.c0.h(blockingQueue);
        this.f39468a = new Object();
        this.f39469b = blockingQueue;
        setName(str);
    }

    public final void a() {
        j1 j1Var = this.f39471d;
        synchronized (j1Var.f39505i) {
            try {
                if (!this.f39470c) {
                    j1Var.f39506j.release();
                    j1Var.f39505i.notifyAll();
                    if (this == j1Var.f39499c) {
                        j1Var.f39499c = null;
                    } else if (this == j1Var.f39500d) {
                        j1Var.f39500d = null;
                    } else {
                        s0 s0Var = ((m1) j1Var.f3623a).f39587f;
                        m1.h(s0Var);
                        s0Var.f39753f.b("Current scheduler thread is neither worker nor network");
                    }
                    this.f39470c = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        boolean z10 = false;
        while (!z10) {
            try {
                this.f39471d.f39506j.acquire();
                z10 = true;
            } catch (InterruptedException e10) {
                s0 s0Var = ((m1) this.f39471d.f3623a).f39587f;
                m1.h(s0Var);
                s0Var.f39756i.c(e10, String.valueOf(getName()).concat(" was interrupted"));
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                BlockingQueue blockingQueue = this.f39469b;
                h1 h1Var = (h1) blockingQueue.poll();
                if (h1Var != null) {
                    Process.setThreadPriority(true != h1Var.f39451b ? 10 : threadPriority);
                    h1Var.run();
                } else {
                    Object obj = this.f39468a;
                    synchronized (obj) {
                        if (blockingQueue.peek() == null) {
                            this.f39471d.getClass();
                            try {
                                obj.wait(30000L);
                            } catch (InterruptedException e11) {
                                s0 s0Var2 = ((m1) this.f39471d.f3623a).f39587f;
                                m1.h(s0Var2);
                                s0Var2.f39756i.c(e11, String.valueOf(getName()).concat(" was interrupted"));
                            }
                        }
                    }
                    synchronized (this.f39471d.f39505i) {
                        if (this.f39469b.peek() == null) {
                            a();
                            a();
                            return;
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            a();
            throw th2;
        }
    }
}
