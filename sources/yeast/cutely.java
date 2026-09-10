package yeast;

/* JADX INFO: compiled from: SingleThreadValue.java */
/* JADX INFO: loaded from: classes5.dex */
public class cutely<T> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Thread f39728attabal = Thread.currentThread();
    private final T value;

    public cutely(T t) {
        this.value = t;
    }

    public T attabal() {
        if (saneness()) {
            return this.value;
        }
        throw new IllegalStateException("No value in this thread (hasValue should be checked before)");
    }

    public boolean saneness() {
        return this.f39728attabal == Thread.currentThread();
    }
}
