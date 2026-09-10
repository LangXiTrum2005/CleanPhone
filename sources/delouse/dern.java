package delouse;

/* JADX INFO: compiled from: InstanceFactory.java */
/* JADX INFO: loaded from: classes2.dex */
public final class dern<T> implements saneness<T> {

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final dern<Object> f25165saneness = new dern<>(null);

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final T f25166attabal;

    public dern(T t) {
        this.f25166attabal = t;
    }

    public static <T> saneness<T> attabal(T t) {
        return new dern(wireman.dern(t, "instance cannot be null"));
    }

    @Override // javax.inject.Provider
    public T get() {
        return this.f25166attabal;
    }
}
