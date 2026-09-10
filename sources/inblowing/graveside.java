package inblowing;

/* JADX INFO: compiled from: Lazy.java */
/* JADX INFO: loaded from: classes3.dex */
public class graveside<T> implements friedmanite.saneness<T> {

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final Object f28545dern = new Object();

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public volatile Object f28546attabal = f28545dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public volatile friedmanite.saneness<T> f28547saneness;

    public graveside(friedmanite.saneness<T> sanenessVar) {
        this.f28547saneness = sanenessVar;
    }

    @Override // friedmanite.saneness
    public T get() {
        T t;
        T t2 = (T) this.f28546attabal;
        Object obj = f28545dern;
        if (t2 != obj) {
            return t2;
        }
        synchronized (this) {
            try {
                t = (T) this.f28546attabal;
                if (t == obj) {
                    t = this.f28547saneness.get();
                    this.f28546attabal = t;
                    this.f28547saneness = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return t;
    }
}
