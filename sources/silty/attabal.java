package silty;

/* JADX INFO: compiled from: Event.java */
/* JADX INFO: loaded from: classes3.dex */
public class attabal<T> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Class<T> f37632attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final T f37633saneness;

    public T attabal() {
        return this.f37633saneness;
    }

    public Class<T> saneness() {
        return this.f37632attabal;
    }

    public String toString() {
        return String.format("Event{type: %s, payload: %s}", this.f37632attabal, this.f37633saneness);
    }
}
