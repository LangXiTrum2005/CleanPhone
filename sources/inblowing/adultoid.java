package inblowing;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: LazySet.java */
/* JADX INFO: loaded from: classes3.dex */
public class adultoid<T> implements friedmanite.saneness<Set<T>> {

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public volatile Set<T> f28517saneness = null;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public volatile Set<friedmanite.saneness<T>> f28516attabal = Collections.newSetFromMap(new ConcurrentHashMap());

    public adultoid(Collection<friedmanite.saneness<T>> collection2) {
        this.f28516attabal.addAll(collection2);
    }

    public static adultoid<?> saneness(Collection<friedmanite.saneness<?>> collection2) {
        return new adultoid<>((Set) collection2);
    }

    public synchronized void attabal(friedmanite.saneness<T> sanenessVar) {
        try {
            if (this.f28517saneness == null) {
                this.f28516attabal.add(sanenessVar);
            } else {
                this.f28517saneness.add(sanenessVar.get());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // friedmanite.saneness
    /* JADX INFO: renamed from: dern, reason: merged with bridge method [inline-methods] */
    public Set<T> get() {
        if (this.f28517saneness == null) {
            synchronized (this) {
                try {
                    if (this.f28517saneness == null) {
                        this.f28517saneness = Collections.newSetFromMap(new ConcurrentHashMap());
                        wireman();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return Collections.unmodifiableSet(this.f28517saneness);
    }

    public final synchronized void wireman() {
        try {
            Iterator<friedmanite.saneness<T>> it = this.f28516attabal.iterator();
            while (it.hasNext()) {
                this.f28517saneness.add(it.next().get());
            }
            this.f28516attabal = null;
        } catch (Throwable th) {
            throw th;
        }
    }
}
