package inblowing;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: EventBus.java */
/* JADX INFO: loaded from: classes3.dex */
public class molybdenite implements silty.wireman, silty.dern {

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final Executor f28553dern;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Map<Class<?>, ConcurrentHashMap<silty.saneness<Object>, Executor>> f28552attabal = new HashMap();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public Queue<silty.attabal<?>> f28554saneness = new ArrayDeque();

    public molybdenite(Executor executor) {
        this.f28553dern = executor;
    }

    @Override // silty.wireman
    public <T> void attabal(Class<T> cls, silty.saneness<? super T> sanenessVar) {
        saneness(cls, this.f28553dern, sanenessVar);
    }

    public void beachfront(final silty.attabal<?> attabalVar) {
        cord.saneness(attabalVar);
        synchronized (this) {
            try {
                Queue<silty.attabal<?>> queue = this.f28554saneness;
                if (queue != null) {
                    queue.add(attabalVar);
                    return;
                }
                for (final Map.Entry<silty.saneness<Object>, Executor> entry : marial(attabalVar)) {
                    entry.getValue().execute(new Runnable() { // from class: inblowing.polloi
                        @Override // java.lang.Runnable
                        public final void run() {
                            ((silty.saneness) entry.getKey()).attabal(attabalVar);
                        }
                    });
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized Set<Map.Entry<silty.saneness<Object>, Executor>> marial(silty.attabal<?> attabalVar) {
        ConcurrentHashMap<silty.saneness<Object>, Executor> concurrentHashMap;
        try {
            concurrentHashMap = this.f28552attabal.get(attabalVar.saneness());
        } catch (Throwable th) {
            throw th;
        }
        return concurrentHashMap == null ? Collections.EMPTY_SET : concurrentHashMap.entrySet();
    }

    @Override // silty.wireman
    public synchronized <T> void saneness(Class<T> cls, Executor executor, silty.saneness<? super T> sanenessVar) {
        try {
            cord.saneness(cls);
            cord.saneness(sanenessVar);
            cord.saneness(executor);
            if (!this.f28552attabal.containsKey(cls)) {
                this.f28552attabal.put(cls, new ConcurrentHashMap<>());
            }
            this.f28552attabal.get(cls).put(sanenessVar, executor);
        } catch (Throwable th) {
            throw th;
        }
    }

    public void wireman() {
        Queue<silty.attabal<?>> queue;
        synchronized (this) {
            try {
                queue = this.f28554saneness;
                if (queue != null) {
                    this.f28554saneness = null;
                } else {
                    queue = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (queue != null) {
            Iterator<silty.attabal<?>> it = queue.iterator();
            while (it.hasNext()) {
                beachfront(it.next());
            }
        }
    }
}
