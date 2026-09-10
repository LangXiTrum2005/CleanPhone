package ads_mobile_sdk;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.concurrent.Executor;
import saneness.amphitheatre;
import saneness.skyjacking;

/* JADX INFO: loaded from: classes.dex */
public final class jb1 implements skyjacking {
    public final Executor a;
    public final amphitheatre b;
    public final PriorityQueue c = new PriorityQueue();

    public jb1(Executor executor, amphitheatre amphitheatreVar) {
        this.a = executor;
        this.b = amphitheatreVar;
    }

    @Override // saneness.skyjacking
    public final void a() {
        synchronized (this.c) {
            try {
                if (this.c.isEmpty()) {
                    return;
                }
                PriorityQueue priorityQueue = new PriorityQueue();
                this.b.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                uk2 uk2Var = (uk2) this.c.peek();
                while (uk2Var != null && uk2Var.b <= jCurrentTimeMillis) {
                    priorityQueue.add(uk2Var);
                    uk2Var = (uk2) this.c.peek();
                }
                Iterator it = priorityQueue.iterator();
                while (it.hasNext()) {
                    try {
                        this.a.execute(((uk2) it.next()).a);
                    } catch (RuntimeException unused) {
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // saneness.skyjacking
    public final void a(Runnable runnable, long j) {
        if (j <= 0) {
            this.a.execute(runnable);
            return;
        }
        this.b.getClass();
        uk2 uk2Var = new uk2(runnable, System.currentTimeMillis() + j);
        synchronized (this.c) {
            this.c.add(uk2Var);
        }
    }
}
