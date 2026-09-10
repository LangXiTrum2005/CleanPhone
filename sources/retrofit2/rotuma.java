package retrofit2;

import java.util.Objects;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: Response.java */
/* JADX INFO: loaded from: classes5.dex */
public final class rotuma<T> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final okhttp3.cuirassed f36571attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    @Nullable
    public final okhttp3.stratoscope f36572dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    @Nullable
    public final T f36573saneness;

    public rotuma(okhttp3.cuirassed cuirassedVar, @Nullable T t, @Nullable okhttp3.stratoscope stratoscopeVar) {
        this.f36571attabal = cuirassedVar;
        this.f36573saneness = t;
        this.f36572dern = stratoscopeVar;
    }

    public static <T> rotuma<T> beachfront(@Nullable T t, okhttp3.cuirassed cuirassedVar) {
        Objects.requireNonNull(cuirassedVar, "rawResponse == null");
        if (cuirassedVar.isSuccessful()) {
            return new rotuma<>(cuirassedVar, t, null);
        }
        throw new IllegalArgumentException("rawResponse must be successful response");
    }

    public static <T> rotuma<T> dern(okhttp3.stratoscope stratoscopeVar, okhttp3.cuirassed cuirassedVar) {
        Objects.requireNonNull(stratoscopeVar, "body == null");
        Objects.requireNonNull(cuirassedVar, "rawResponse == null");
        if (cuirassedVar.isSuccessful()) {
            throw new IllegalArgumentException("rawResponse should not be successful response");
        }
        return new rotuma<>(cuirassedVar, null, stratoscopeVar);
    }

    @Nullable
    public T attabal() {
        return this.f36573saneness;
    }

    public String marial() {
        return this.f36571attabal.getMessage();
    }

    public int saneness() {
        return this.f36571attabal.getCode();
    }

    public String toString() {
        return this.f36571attabal.toString();
    }

    public boolean wireman() {
        return this.f36571attabal.isSuccessful();
    }
}
