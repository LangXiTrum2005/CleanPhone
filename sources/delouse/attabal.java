package delouse;

import javax.inject.Provider;

/* JADX INFO: compiled from: DoubleCheck.java */
/* JADX INFO: loaded from: classes2.dex */
public final class attabal<T> implements Provider<T> {

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final Object f25162dern = new Object();

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public volatile Provider<T> f25163attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public volatile Object f25164saneness = f25162dern;

    public attabal(Provider<T> provider) {
        this.f25163attabal = provider;
    }

    public static <P extends Provider<T>, T> Provider<T> attabal(P p) {
        wireman.saneness(p);
        return p instanceof attabal ? p : new attabal(p);
    }

    public static Object saneness(Object obj, Object obj2) {
        if (obj == f25162dern || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    @Override // javax.inject.Provider
    public T get() {
        T t;
        T t2 = (T) this.f25164saneness;
        Object obj = f25162dern;
        if (t2 != obj) {
            return t2;
        }
        synchronized (this) {
            try {
                t = (T) this.f25164saneness;
                if (t == obj) {
                    t = this.f25163attabal.get();
                    this.f25164saneness = saneness(this.f25164saneness, t);
                    this.f25163attabal = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return t;
    }
}
