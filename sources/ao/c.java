package ao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f5057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f5058b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f5059c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a f5060d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f5061e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f5062f;

    public c(d dVar, String name) {
        n.f(name, "name");
        this.f5057a = dVar;
        this.f5058b = name;
        this.f5061e = new ArrayList();
    }

    public final void a() {
        byte[] bArr = yn.a.f54560a;
        synchronized (this.f5057a) {
            if (b()) {
                this.f5057a.d(this);
            }
        }
    }

    public final boolean b() {
        a aVar = this.f5060d;
        if (aVar != null && aVar.f5052b) {
            this.f5062f = true;
        }
        ArrayList arrayList = this.f5061e;
        boolean z10 = false;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            if (((a) arrayList.get(size)).f5052b) {
                a aVar2 = (a) arrayList.get(size);
                fd.b bVar = d.f5063h;
                if (d.f5065j.isLoggable(Level.FINE)) {
                    a.a.a(aVar2, this, "canceled");
                }
                arrayList.remove(size);
                z10 = true;
            }
        }
        return z10;
    }

    public final void c(a task, long j10) {
        n.f(task, "task");
        synchronized (this.f5057a) {
            if (!this.f5059c) {
                if (d(task, j10, false)) {
                    this.f5057a.d(this);
                }
            } else if (task.f5052b) {
                fd.b bVar = d.f5063h;
                if (d.f5065j.isLoggable(Level.FINE)) {
                    a.a.a(task, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                fd.b bVar2 = d.f5063h;
                if (d.f5065j.isLoggable(Level.FINE)) {
                    a.a.a(task, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0047 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x0049  */
    /* JADX WARN: Code duplicated, block: B:20:0x0055  */
    /* JADX WARN: Code duplicated, block: B:25:0x006e  */
    /* JADX WARN: Code duplicated, block: B:28:0x007c A[LOOP:0: B:23:0x0068->B:28:0x007c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:31:0x0082  */
    /* JADX WARN: Code duplicated, block: B:34:0x008b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:39:0x007f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x0080 A[EDGE_INSN: B:40:0x0080->B:30:0x0080 BREAK  A[LOOP:0: B:23:0x0068->B:28:0x007c], SYNTHETIC] */
    public final boolean d(a task, long j10, boolean z10) {
        Iterator it;
        int size;
        String strConcat;
        n.f(task, "task");
        c cVar = task.f5053c;
        if (cVar != this) {
            if (cVar != null) {
                throw new IllegalStateException("task is in multiple queues");
            }
            task.f5053c = this;
        }
        long jNanoTime = System.nanoTime();
        long j11 = jNanoTime + j10;
        ArrayList arrayList = this.f5061e;
        int iIndexOf = arrayList.indexOf(task);
        if (iIndexOf == -1) {
            task.f5054d = j11;
            fd.b bVar = d.f5063h;
            if (d.f5065j.isLoggable(Level.FINE)) {
                if (z10) {
                    strConcat = "run again after ".concat(a.a.p(j11 - jNanoTime));
                } else {
                    strConcat = "scheduled after ".concat(a.a.p(j11 - jNanoTime));
                }
                a.a.a(task, this, strConcat);
            }
            it = arrayList.iterator();
            size = 0;
            while (true) {
                if (it.hasNext()) {
                    size = -1;
                    break;
                }
                if (((a) it.next()).f5054d - jNanoTime > j10) {
                    break;
                }
                size++;
            }
            if (size == -1) {
                size = arrayList.size();
            }
            arrayList.add(size, task);
            if (size == 0) {
                return true;
            }
        } else if (task.f5054d <= j11) {
            fd.b bVar2 = d.f5063h;
            if (d.f5065j.isLoggable(Level.FINE)) {
                a.a.a(task, this, "already scheduled");
                return false;
            }
        } else {
            arrayList.remove(iIndexOf);
            task.f5054d = j11;
            fd.b bVar3 = d.f5063h;
            if (d.f5065j.isLoggable(Level.FINE)) {
                if (z10) {
                    strConcat = "run again after ".concat(a.a.p(j11 - jNanoTime));
                } else {
                    strConcat = "scheduled after ".concat(a.a.p(j11 - jNanoTime));
                }
                a.a.a(task, this, strConcat);
            }
            it = arrayList.iterator();
            size = 0;
            while (true) {
                if (it.hasNext()) {
                    size = -1;
                    break;
                }
                if (((a) it.next()).f5054d - jNanoTime > j10) {
                    break;
                    break;
                }
                size++;
            }
            if (size == -1) {
                size = arrayList.size();
            }
            arrayList.add(size, task);
            if (size == 0) {
                return true;
            }
        }
        return false;
    }

    public final void e() {
        byte[] bArr = yn.a.f54560a;
        synchronized (this.f5057a) {
            this.f5059c = true;
            if (b()) {
                this.f5057a.d(this);
            }
        }
    }

    public final String toString() {
        return this.f5058b;
    }
}
