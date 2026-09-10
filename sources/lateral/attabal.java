package lateral;

import javax.inject.Provider;

/* JADX INFO: compiled from: DoubleCheck.java */
/* JADX INFO: loaded from: classes3.dex */
public final class attabal<T> implements Provider<T> {

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final Object f32599dern = new Object();

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public volatile Provider<T> f32600attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public volatile Object f32601saneness = f32599dern;

    public attabal(Provider<T> provider) {
        this.f32600attabal = provider;
    }

    public static <P extends Provider<T>, T> Provider<T> attabal(P p) {
        wireman.saneness(p);
        return p instanceof attabal ? p : new attabal(p);
    }

    private static Object saneness(Object obj, Object obj2) {
        if (obj == f32599dern || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    @Override // javax.inject.Provider
    public T get() {
        T t;
        T t2 = (T) this.f32601saneness;
        Object obj = f32599dern;
        if (t2 != obj) {
            return t2;
        }
        synchronized (this) {
            try {
                t = (T) this.f32601saneness;
                if (t == obj) {
                    t = this.f32600attabal.get();
                    this.f32601saneness = saneness(this.f32601saneness, t);
                    this.f32600attabal = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return t;
    }
}
