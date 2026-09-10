package lateral;

/* JADX INFO: compiled from: InstanceFactory.java */
/* JADX INFO: loaded from: classes3.dex */
public final class dern<T> implements saneness<T> {

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final dern<Object> f32602saneness = new dern<>(null);

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final T f32603attabal;

    public dern(T t) {
        this.f32603attabal = t;
    }

    public static <T> saneness<T> attabal(T t) {
        return new dern(wireman.dern(t, "instance cannot be null"));
    }

    @Override // javax.inject.Provider
    public T get() {
        return this.f32603attabal;
    }
}
