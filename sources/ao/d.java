package ao;

import androidx.lifecycle.a0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Logger;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final fd.b f5063h = new fd.b(3);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final d f5064i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Logger f5065j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final od.c f5066a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f5068c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f5069d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5067b = 10000;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f5070e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f5071f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a0 f5072g = new a0(this, 2);

    static {
        String name = yn.a.f54565f + " TaskRunner";
        n.f(name, "name");
        f5064i = new d(new od.c(new a6.a(1, name, true)));
        Logger logger = Logger.getLogger(d.class.getName());
        n.e(logger, "getLogger(TaskRunner::class.java.name)");
        f5065j = logger;
    }

    public d(od.c cVar) {
        this.f5066a = cVar;
    }

    public static final void a(d dVar, a aVar) {
        byte[] bArr = yn.a.f54560a;
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        threadCurrentThread.setName(aVar.f5051a);
        try {
            long jA = aVar.a();
            synchronized (dVar) {
                dVar.b(aVar, jA);
            }
        } finally {
            synchronized (dVar) {
                dVar.b(aVar, -1L);
                threadCurrentThread.setName(name);
            }
        }
    }

    public final void b(a aVar, long j10) {
        byte[] bArr = yn.a.f54560a;
        c cVar = aVar.f5053c;
        n.c(cVar);
        if (cVar.f5060d != aVar) {
            throw new IllegalStateException("Check failed.");
        }
        boolean z10 = cVar.f5062f;
        cVar.f5062f = false;
        cVar.f5060d = null;
        this.f5070e.remove(cVar);
        if (j10 != -1 && !z10 && !cVar.f5059c) {
            cVar.d(aVar, j10, true);
        }
        if (cVar.f5061e.isEmpty()) {
            return;
        }
        this.f5071f.add(cVar);
    }

    public final a c() {
        boolean z10;
        byte[] bArr = yn.a.f54560a;
        while (true) {
            ArrayList arrayList = this.f5071f;
            if (arrayList.isEmpty()) {
                break;
            }
            long jNanoTime = System.nanoTime();
            Iterator it = arrayList.iterator();
            long jMin = Long.MAX_VALUE;
            a aVar = null;
            while (true) {
                if (!it.hasNext()) {
                    z10 = false;
                    break;
                }
                a aVar2 = (a) ((c) it.next()).f5061e.get(0);
                long jMax = Math.max(0L, aVar2.f5054d - jNanoTime);
                if (jMax > 0) {
                    jMin = Math.min(jMax, jMin);
                } else {
                    if (aVar != null) {
                        z10 = true;
                        break;
                    }
                    aVar = aVar2;
                }
            }
            ArrayList arrayList2 = this.f5070e;
            if (aVar != null) {
                byte[] bArr2 = yn.a.f54560a;
                aVar.f5054d = -1L;
                c cVar = aVar.f5053c;
                n.c(cVar);
                cVar.f5061e.remove(aVar);
                arrayList.remove(cVar);
                cVar.f5060d = aVar;
                arrayList2.add(cVar);
                if (z10 || (!this.f5068c && !arrayList.isEmpty())) {
                    a0 runnable = this.f5072g;
                    n.f(runnable, "runnable");
                    ((ThreadPoolExecutor) this.f5066a.f47386b).execute(runnable);
                }
                return aVar;
            }
            if (this.f5068c) {
                if (jMin >= this.f5069d - jNanoTime) {
                    break;
                }
                notify();
                break;
            }
            this.f5068c = true;
            this.f5069d = jNanoTime + jMin;
            try {
                try {
                    long j10 = jMin / 1000000;
                    long j11 = jMin - (1000000 * j10);
                    if (j10 > 0 || jMin > 0) {
                        wait(j10, (int) j11);
                    }
                } catch (InterruptedException unused) {
                    for (int size = arrayList2.size() - 1; -1 < size; size--) {
                        ((c) arrayList2.get(size)).b();
                    }
                    for (int size2 = arrayList.size() - 1; -1 < size2; size2--) {
                        c cVar2 = (c) arrayList.get(size2);
                        cVar2.b();
                        if (cVar2.f5061e.isEmpty()) {
                            arrayList.remove(size2);
                        }
                    }
                }
                this.f5068c = false;
            } catch (Throwable th2) {
                this.f5068c = false;
                throw th2;
            }
        }
        return null;
    }

    public final void d(c taskQueue) {
        n.f(taskQueue, "taskQueue");
        byte[] bArr = yn.a.f54560a;
        if (taskQueue.f5060d == null) {
            boolean zIsEmpty = taskQueue.f5061e.isEmpty();
            ArrayList arrayList = this.f5071f;
            if (zIsEmpty) {
                arrayList.remove(taskQueue);
            } else {
                n.f(arrayList, "<this>");
                if (!arrayList.contains(taskQueue)) {
                    arrayList.add(taskQueue);
                }
            }
        }
        if (this.f5068c) {
            notify();
            return;
        }
        a0 runnable = this.f5072g;
        n.f(runnable, "runnable");
        ((ThreadPoolExecutor) this.f5066a.f47386b).execute(runnable);
    }

    public final c e() {
        int i10;
        synchronized (this) {
            i10 = this.f5067b;
            this.f5067b = i10 + 1;
        }
        return new c(this, l1.d.e(i10, "Q"));
    }
}
