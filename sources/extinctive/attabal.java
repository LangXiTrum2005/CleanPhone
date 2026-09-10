package extinctive;

import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CapturedTypeApproximation.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class attabal<T> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final T f26250attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final T f26251saneness;

    public attabal(T t, T t2) {
        this.f26250attabal = t;
        this.f26251saneness = t2;
    }

    public final T attabal() {
        return this.f26250attabal;
    }

    public final T dern() {
        return this.f26250attabal;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof attabal)) {
            return false;
        }
        attabal attabalVar = (attabal) obj;
        return Intrinsics.wireman(this.f26250attabal, attabalVar.f26250attabal) && Intrinsics.wireman(this.f26251saneness, attabalVar.f26251saneness);
    }

    public int hashCode() {
        T t = this.f26250attabal;
        int iHashCode = (t == null ? 0 : t.hashCode()) * 31;
        T t2 = this.f26251saneness;
        return iHashCode + (t2 != null ? t2.hashCode() : 0);
    }

    public final T saneness() {
        return this.f26251saneness;
    }

    public String toString() {
        return "ApproximationBounds(lower=" + this.f26250attabal + ", upper=" + this.f26251saneness + ')';
    }

    public final T wireman() {
        return this.f26251saneness;
    }
}
