package tb;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import l2.u;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class j implements qc.d, qc.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f50698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayDeque f50699b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ub.l f50700c;

    public j() {
        ub.l lVar = ub.l.f51976a;
        this.f50698a = new HashMap();
        this.f50699b = new ArrayDeque();
        this.f50700c = lVar;
    }

    @Override // qc.c
    public final void a(qc.a aVar) {
        Set<Map.Entry> setEntrySet;
        aVar.getClass();
        synchronized (this) {
            try {
                ArrayDeque arrayDeque = this.f50699b;
                if (arrayDeque != null) {
                    arrayDeque.add(aVar);
                    return;
                }
                synchronized (this) {
                    try {
                        Map map = (Map) this.f50698a.get(mb.b.class);
                        setEntrySet = map == null ? Collections.EMPTY_SET : map.entrySet();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                for (Map.Entry entry : setEntrySet) {
                    ((Executor) entry.getValue()).execute(new u(25, entry, aVar));
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final synchronized void b(Executor executor, qc.b bVar) {
        try {
            executor.getClass();
            if (!this.f50698a.containsKey(mb.b.class)) {
                this.f50698a.put(mb.b.class, new ConcurrentHashMap());
            }
            ((ConcurrentHashMap) this.f50698a.get(mb.b.class)).put(bVar, executor);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void c(zc.n nVar) {
        nVar.getClass();
        if (this.f50698a.containsKey(mb.b.class)) {
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f50698a.get(mb.b.class);
            concurrentHashMap.remove(nVar);
            if (concurrentHashMap.isEmpty()) {
                this.f50698a.remove(mb.b.class);
            }
        }
    }
}
